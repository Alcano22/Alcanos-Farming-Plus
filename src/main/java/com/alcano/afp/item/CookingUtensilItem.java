package com.alcano.afp.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CookingUtensilItem extends Item {

    public CookingUtensilItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(itemStack.getItem());
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}
