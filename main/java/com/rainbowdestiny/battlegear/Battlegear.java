package com.rainbowdestiny.battlegear;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rainbowdestiny.battlegear.main.GeckoLib;
import com.rainbowdestiny.battlegear.main.init.ItemInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Battlegear.MOD_ID)
public class Battlegear
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "battlegear";

    public Battlegear() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        
        MinecraftForge.EVENT_BUS.register(this);
        
        GeckoLib.initialize();
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}