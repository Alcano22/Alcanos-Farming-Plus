package com.alcano.afp;

import com.alcano.afp.block.AFPBlocks;
import com.alcano.afp.item.AFPItems;
import com.alcano.afp.screen.AFPMenuTypes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AFP.MOD_ID)
public class AFP {

    public static final String MOD_ID = "afp";

    public AFP() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        AFPItems.ITEMS.register(bus);
        AFPBlocks.BLOCKS.register(bus);
        AFPMenuTypes.MENU_TYPES.register(bus);


        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent e) {

    }

    private void clientSetup(final FMLClientSetupEvent e) {
        e.enqueueWork(() -> {

        });
    }
}
