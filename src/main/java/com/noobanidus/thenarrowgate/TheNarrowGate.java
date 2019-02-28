package com.noobanidus.thenarrowgate;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber
@Mod(modid = TheNarrowGate.MODID, name = TheNarrowGate.MODNAME, version = TheNarrowGate.VERSION)
@SuppressWarnings("WeakerAccess")
public class TheNarrowGate {
    public static final String MODID = "thenarrowgate";
    public static final String MODNAME = "TheNarrowGate";
    public static final String VERSION = "GRADLE:VERSION";

    @SuppressWarnings("unused")
    public final static Logger LOG = LogManager.getLogger(MODID);

    @Mod.Instance(TheNarrowGate.MODID)
    public static TheNarrowGate instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        TheNarrowGate.LOG.info("\"Go in through the narrow gate, because the gate to hell is wide and the road that leads to it is easy, and there are many who travel it\" ~ Matthew 7:13");
    }

}
