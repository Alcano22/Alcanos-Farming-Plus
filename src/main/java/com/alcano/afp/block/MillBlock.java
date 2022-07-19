package com.alcano.afp.block;

import com.alcano.afp.item.AFPItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Map;

public class MillBlock extends Block {

    protected MillBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pWorldPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        Map<Item, Item> recipes = Map.of(Items.WHEAT, AFPItems.WHEAT_FLOUR.get(), Items.BEETROOT, Items.SUGAR);

        ItemStack heldStack = pPlayer.getItemInHand(pHand);

        if (!recipes.containsKey(heldStack.getItem())) return InteractionResult.PASS;

        ItemStack newStack = new ItemStack(recipes.get(heldStack.getItem()));

        heldStack.setCount(0);
        pLevel.addFreshEntity(new ItemEntity(pLevel, pWorldPos.getX() - .5f, pWorldPos.getY() + 1.25f, pWorldPos.getZ() - .5f, newStack));
        pLevel.playLocalSound(pWorldPos.getX(), pWorldPos.getY(), pWorldPos.getZ(), SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS, 1f, 1.5f, false);

        return InteractionResult.SUCCESS;
    }
}
