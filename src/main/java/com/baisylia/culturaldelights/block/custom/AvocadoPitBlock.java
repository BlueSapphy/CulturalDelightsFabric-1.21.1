package com.baisylia.culturaldelights.block.custom;

import com.baisylia.culturaldelights.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AvocadoPitBlock extends SaplingBlock {

    private static final VoxelShape SHAPE_PIT = Block.box(6, 0, 6, 10, 3, 10);

    public AvocadoPitBlock(TreeGrower treeGrower, Properties properties) {
        super(treeGrower, properties);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (random.nextInt(5) == 0) {
            world.setBlock(pos, ModBlocks.AVOCADO_SAPLING.get().defaultBlockState(), 3);
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return SHAPE_PIT;

    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        level.setBlock(pos, ModBlocks.AVOCADO_SAPLING.get().defaultBlockState(), 3);
    }

}
