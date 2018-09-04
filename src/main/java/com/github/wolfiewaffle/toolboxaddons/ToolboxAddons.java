package com.github.wolfiewaffle.toolboxaddons;

import com.github.wolfiewaffle.toolboxaddons.common.CommonProxy;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = ToolboxAddons.MODID, name = ToolboxAddons.NAME, version = ToolboxAddons.VERSION, useMetadata = false, dependencies = "required-after:toolbox;after:tconstruct;after:biomesoplenty;after:basemetals")
public class ToolboxAddons {

	public static final String MODID = "toolboxaddons";
	public static final String NAME = "Toolbox Addons";
	public static final String VERSION = "1.0";
	// public static final String NETWORK_CHANNEL_NAME = "toolboxaddons";

	@SidedProxy(clientSide = "com.github.wolfiewaffle.toolboxaddons.client.ClientProxy", serverSide = "com.github.wolfiewaffle.toolboxaddons.common.CommonProxy")
	public static CommonProxy proxy;

	// public static SimpleNetworkWrapper network;

	@Mod.Instance
	public static ToolboxAddons instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@Config(modid = MODID)
	public static class CONFIG {
		public static BaseMetalsCategory baseMetals = new BaseMetalsCategory();

		public static class BaseMetalsCategory {
//			@Comment({
//				"By default Base Metals materials are realistic, metals like pewter and bismuth are not good for tools.",
//				"Turning this on will buff the weaker metals a bit so that they may have niche uses,",
//				"mostly for more viable variety in materials rather than a bunch of useless ones."
//				})
//			public boolean weakMetalsRebalance = false;

			@Comment({"Enable additional silver effects."})
			public boolean silverEffects = false;

			@Comment({"Enable additional lead effects."})
			public boolean leadEffects = false;

			@Comment({
				"Silver has an effect only when used on blades or tool heads. However if this option is true,",
				"A silver crossguard WILL take effect IF the blade is made of mithril."
				})
			public boolean mithrilSilverBonus = false;
		}

	}

	@SubscribeEvent
	public void onConfigChangedEvent(OnConfigChangedEvent event) {
		if (event.getModID().equals(MODID)) {
			ConfigManager.sync(MODID, Type.INSTANCE);
		}
	}

}
