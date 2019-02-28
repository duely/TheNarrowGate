package com.noobanidus.thenarrowgate;

import com.google.common.collect.Lists;
import com.noobanidus.thenarrowgate.events.TNGEvents;
import com.noobanidus.thenarrowgate.proxy.ISidedProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Mod.EventBusSubscriber
@Mod(modid = TheNarrowGate.MODID, name = TheNarrowGate.MODNAME, version = TheNarrowGate.VERSION)
@SuppressWarnings("WeakerAccess")
public class TheNarrowGate {
    public static final String MODID = "thenarrowgate";
    public static final String MODNAME = "TheNarrowGate";
    public static final String VERSION = "GRADLE:VERSION";

    @SuppressWarnings("unused")
    public final static Logger LOG = LogManager.getLogger(MODID);
    @SidedProxy(modId = MODID, clientSide = "com.noobanidus.thenarrowgate.proxy.ClientProxy", serverSide = "com.noobanidus.thenarrowgate.proxy.CommonProxy")
    public static ISidedProxy proxy;

    @Mod.Instance(TheNarrowGate.MODID)
    public static TheNarrowGate instance;

    public static List<Class> EventClasses = Lists.newArrayList(TNGEvents.class);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        proxy.loadComplete(event);
    }

}
