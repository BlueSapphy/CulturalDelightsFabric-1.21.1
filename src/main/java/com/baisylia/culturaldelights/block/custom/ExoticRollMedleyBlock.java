package com.baisylia.culturaldelights.block.custom;

import com.baisylia.culturaldelights.item.ModItems;
import com.google.common.base.Suppliers;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.block.FeastBlock;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ExoticRollMedleyBlock extends FeastBlock {
    public static final IntegerProperty ROLL_SERVINGS = IntegerProperty.create("servings", 0, 8);
    protected static final VoxelShape PLATE_SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 2.0, 15.0);
    protected static final VoxelShape FOOD_SHAPE;

    public final Supplier<List<Item>> riceRollServings = Suppliers.memoize(() -> List.of(
            ModItems.PUFFERFISH_ROLL.get(),
            ModItems.PUFFERFISH_ROLL.get(),
            ModItems.TROPICAL_ROLL.get(),
            ModItems.TROPICAL_ROLL.get(),
            ModItems.TROPICAL_ROLL.get(),
            ModItems.CHICKEN_ROLL_SLICE.get(),
            ModItems.CHICKEN_ROLL_SLICE.get(),
            ModItems.CHICKEN_ROLL_SLICE.get())
    );

    public ExoticRollMedleyBlock(Properties properties) {
        super(properties,  () -> ModItems.TROPICAL_ROLL.get(), true);

    }

    public IntegerProperty getServingsProperty() {
        return ROLL_SERVINGS;
    }

    public int getMaxServings() {
        return 8;
    }

    public ItemStack getServingItem(@NotNull BlockState state) {
        return new ItemStack((riceRollServings.get().get(state.getValue(getServingsProperty()) - 1)));
    }

    public VoxelShape getShape(@NotNull BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return state.getValue(getServingsProperty()) == 0 ? PLATE_SHAPE : FOOD_SHAPE;
    }

    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        builder.add(FACING, ROLL_SERVINGS);
    }

    static {
        FOOD_SHAPE = Shapes.joinUnoptimized(PLATE_SHAPE, Block.box(2.0, 2.0, 2.0, 14.0, 4.0, 14.0), BooleanOp.OR);
    }
}
