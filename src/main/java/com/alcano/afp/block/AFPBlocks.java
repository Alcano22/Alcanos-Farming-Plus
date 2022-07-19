package com.alcano.afp.block;

import com.alcano.afp.AFP;
import com.alcano.afp.item.AFPItems;
import com.alcano.afp.util.AFPCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class AFPBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AFP.MOD_ID);

    public static final RegistryObject<Block> MILL = register("mill", () ->
            new MillBlock(Block.Properties.of(Material.WOOD)));

    private static RegistryObject<Block> register(String name, Supplier<Block> sup) {
        RegistryObject<Block> registry = BLOCKS.register(name, sup);
        AFPItems.ITEMS.register(name, () -> new BlockItem(registry.get(), new Item.Properties().tab(AFPCreativeModeTab.BLOCKS)));
        return registry;
    }

}
