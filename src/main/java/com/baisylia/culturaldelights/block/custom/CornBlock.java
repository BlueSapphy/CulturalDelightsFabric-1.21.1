package com.baisylia.culturaldelights.block.custom;

import com.baisylia.culturaldelights.block.ModBlocks;
import com.baisylia.culturaldelights.item.ModItems;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class CornBlock extends BushBlock implements BonemealableBlock {

    public static final MapCodec<CornBlock> CODEC = simpleCodec(CornBlock::new);
    public static final IntegerProperty AGE;
    public static final BooleanProperty SUPPORTING;
    private static final VoxelShape[] SHAPE_BY_AGE;
    public static final int GROWTH_CHANCE = 10;

    public CornBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)this.defaultBlockState().setValue(AGE, 0)).setValue(SUPPORTING, false));
    }



    @Override
    protected MapCodec<? extends BushBlock> codec() {
        return CODEC;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand) {
        super.randomTick(state, level, pos, rand);

        if (!level.hasChunksAt(pos.offset(-1, -1, -1), pos.offset(1, 1, 1))) {
            return;
        }

        if (level.getMaxLocalRawBrightness(pos.above(), 0) >= 6 && this.getAge(state) <= this.getMaxAge() && rand.nextInt(3) == 0) {
            randomGrowTick(state, level, pos, rand);
        }
    }

    private void randomGrowTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand) {
        int currentAge = this.getAge(state);
        if (currentAge <= this.getMaxAge() && rand.nextInt((int) (25.0F / GROWTH_CHANCE) + 1) == 0) {
            if (currentAge == this.getMaxAge()) {
                CornUpperBlock cornUpper = (CornUpperBlock) ModBlocks.CORN_UPPER.get();
                if (cornUpper.defaultBlockState().canSurvive(level, pos.above()) && level.isEmptyBlock(pos.above())) {
                    level.setBlockAndUpdate(pos.above(), cornUpper.defaultBlockState());
                }
            } else {
                level.setBlockAndUpdate(pos, state.setValue(AGE, this.getAge(state)+1));
            }
        }
    }





    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        BlockState state = super.updateShape(stateIn, facing, facingState, level, currentPos, facingPos);
        if (!state.isAir()) {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
            if (facing == Direction.UP) {
                return state.setValue(SUPPORTING, this.isSupportingCornUpper(facingState));
            }
        }

        return state;
    }




    public VoxelShape getShape(@NotNull BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE_BY_AGE[state.getValue(this.getAgeProperty())];
    }

    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    protected int getAge(BlockState state) {
        return state.getValue(this.getAgeProperty());
    }

    public int getMaxAge() {
        return 3;
    }

    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
        return new ItemStack(ModItems.CORN_KERNELS.get());
    }




    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE, SUPPORTING);
    }



    public boolean isSupportingCornUpper(BlockState topState) {
        return topState.getBlock() == ModBlocks.CORN_UPPER.get();
    }




    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        BlockState upperState = level.getBlockState(pos.above());
        if (upperState.getBlock() instanceof CornUpperBlock) {
            return !((CornUpperBlock)upperState.getBlock()).isMaxAge(upperState);
        } else {
            return true;
        }
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    protected int getBonemealAgeIncrease(Level level) {
        return Mth.nextInt(level.random, 1, 4);
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        int ageGrowth = Math.min(this.getAge(state) + this.getBonemealAgeIncrease(level), 7);
        if (ageGrowth <= this.getMaxAge()) {
            level.setBlockAndUpdate(pos, state.setValue(AGE, ageGrowth));
        } else {
            BlockState top = level.getBlockState(pos.above());
            if (top.getBlock() == ModBlocks.CORN_UPPER.get()) {
                BonemealableBlock growable = (BonemealableBlock)level.getBlockState(pos.above()).getBlock();
                if (growable.isValidBonemealTarget(level, pos.above(), top)) {
                    growable.performBonemeal(level, level.random, pos.above(), top);
                }
            } else {
                CornUpperBlock cornUpper = (CornUpperBlock) ModBlocks.CORN_UPPER.get();
                int remainingGrowth = ageGrowth - this.getMaxAge() - 1;
                if (cornUpper.defaultBlockState().canSurvive(level, pos.above()) && level.isEmptyBlock(pos.above())) {
                    level.setBlockAndUpdate(pos, state.setValue(AGE, this.getMaxAge()));
                    level.setBlock(pos.above(), cornUpper.defaultBlockState().setValue(CornUpperBlock.CORN_AGE, remainingGrowth), 2);
                }
            }
        }
    }


    static {
        AGE = BlockStateProperties.AGE_3;
        SUPPORTING = BooleanProperty.create("supporting");
        SHAPE_BY_AGE = new VoxelShape[]{
                Block.box(3.0F, 0.0F, 3.0F, 13.0F, 8.0F, 13.0F),
                Block.box(3.0F, 0.0F, 3.0F, 13.0F, 10.0F, 13.0F),
                Block.box(2.0F, 0.0F, 2.0F, 14.0F, 12.0F, 14.0F),
                Block.box(1.0F, 0.0F, 1.0F, 15.0F, 16.0F, 15.0F)};
    }

}


