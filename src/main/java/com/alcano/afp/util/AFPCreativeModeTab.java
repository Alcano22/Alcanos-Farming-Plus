package com.alcano.afp.util;

import com.alcano.afp.AFP;
import com.alcano.afp.item.AFPItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class AFPCreativeModeTab {

    public static final CreativeModeTab BLOCKS = new CreativeModeTab(AFP.MOD_ID + ".blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(null);
        }
    };

    public static final CreativeModeTab ITEMS = new CreativeModeTab(AFP.MOD_ID + ".items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(null);
        }
    };

    public static final CreativeModeTab FOOD = new CreativeModeTab(AFP.MOD_ID + ".food") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AFPItems.FRIED_EGG.get());
        }
    };

}
