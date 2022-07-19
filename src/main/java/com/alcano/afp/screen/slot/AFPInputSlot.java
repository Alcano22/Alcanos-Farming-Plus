package com.alcano.afp.screen.slot;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;
import java.util.Arrays;

public class AFPInputSlot extends SlotItemHandler {

    private final Item[] validItems;

    public AFPInputSlot(IItemHandler itemHandler, int index, int x, int y, Item... validItems) {
        super(itemHandler, index, x, y);
        this.validItems = validItems;
    }

    @Override
    public boolean mayPlace(@Nonnull ItemStack stack) {
        return Arrays.asList(validItems).contains(stack.getItem());
    }
}
