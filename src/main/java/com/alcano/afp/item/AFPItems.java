package com.alcano.afp.item;

import com.alcano.afp.AFP;
import com.alcano.afp.util.AFPCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AFPItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AFP.MOD_ID);

    public static final RegistryObject<Item> FRYING_PAN = ITEMS.register("frying_pan", () ->
            new CookingUtensilItem(new Item.Properties().stacksTo(1).tab(AFPCreativeModeTab.ITEMS)));

    public static final RegistryObject<Item> MILK_BOTTLE = ITEMS.register("milk_bottle", () ->
            new Item(new Item.Properties().stacksTo(16).tab(AFPCreativeModeTab.ITEMS)));

    public static final RegistryObject<Item> WHEAT_FLOUR = ITEMS.register("wheat_flour", () ->
            new Item(new Item.Properties().tab(AFPCreativeModeTab.ITEMS)));

    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", () ->
            new Item(new Item.Properties().food(AFPFood.FRIED_EGG).tab(AFPCreativeModeTab.FOOD)));

    public static final RegistryObject<Item> OMELET = ITEMS.register("omelet", () ->
            new Item(new Item.Properties().food(AFPFood.OMELET).tab(AFPCreativeModeTab.FOOD)));

}
