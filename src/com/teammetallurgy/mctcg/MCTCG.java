package com.teammetallurgy.mctcg;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;



@Mod(name = MCTCG.MODNAME, modid = MCTCG.MODID, version=MCTCG.VERSION)

public class MCTCG {
	final static String MODNAME = "MC TCG";
	final static String MODID = "MCTCG";
	final static String VERSION = "1.0.0";
	
	@Instance(VERSION)
	public static MCTCG instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
