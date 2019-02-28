package com.noobanidus.thenarrowgate.proxy;

import com.noobanidus.thenarrowgate.TheNarrowGate;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.*;

import java.util.Arrays;
import java.util.List;

public class CommonProxy implements ISidedProxy {
    private List<Runnable> LOAD_COMPLETE_HOOKS = Arrays.asList();

    public void preInit(FMLPreInitializationEvent event) {
        TheNarrowGate.EventClasses.forEach(MinecraftForge.EVENT_BUS::register);
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void loadComplete(FMLLoadCompleteEvent event) {
        LOAD_COMPLETE_HOOKS.forEach(Runnable::run);
        TheNarrowGate.LOG.info("\"Go in through the narrow gate, because the gate to hell is wide and the road that leads to it is easy, and there are many who travel it\" ~ Matthew 7:13");
    }

    public void serverStarting(FMLServerStartingEvent event) {
    }

    public void serverStarted(FMLServerStartedEvent event) {
    }
}
