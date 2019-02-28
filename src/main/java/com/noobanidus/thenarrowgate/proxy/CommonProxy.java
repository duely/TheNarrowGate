package com.noobanidus.thenarrowgate.proxy;

import com.noobanidus.thenarrowgate.TheNarrowGate;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.*;

import java.util.Arrays;
import java.util.List;

public class CommonProxy implements ISidedProxy {
    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void loadComplete(FMLLoadCompleteEvent event) {
        TheNarrowGate.LOG.info("\"Go in through the narrow gate, because the gate to hell is wide and the road that leads to it is easy, and there are many who travel it\" ~ Matthew 7:13");
    }

    public void serverStarting(FMLServerStartingEvent event) {
    }

    public void serverStarted(FMLServerStartedEvent event) {
    }
}
