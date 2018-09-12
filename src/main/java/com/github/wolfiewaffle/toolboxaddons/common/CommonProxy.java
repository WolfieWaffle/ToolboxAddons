package com.github.wolfiewaffle.toolboxaddons.common;

import com.github.wolfiewaffle.toolboxaddons.common.handlers.HandlerAddon;
import com.github.wolfiewaffle.toolboxaddons.common.materials.ModMaterialsAddon;
import com.github.wolfiewaffle.toolboxaddons.common.recipes.ModRecipesAddon;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {

//		OreDictionary.registerOre("boneDragon", Item.REGISTRY.getObject(new ResourceLocation("iceandfire:dragonbone")));
		ModMaterialsAddon.init();

		MinecraftForge.EVENT_BUS.register(new HandlerAddon());
	}

	public void init(FMLInitializationEvent event) {

//		registerNetworkChannel();
//		registerEventListeners();

		ModRecipesAddon.init();

	}

	public void postInit(FMLPostInitializationEvent event) {

	}

	// Taken from polearms, hopefully they don't mind

//	public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx) {
//		return ctx.getServerHandler().player; // fingers crossed this works...
//												// It does. Probably not the
//												// best way of doing it, tho
//	}

	private void registerEventListeners() {
		// DEBUG
//		MinecraftForge.EVENT_BUS.register(new TBAEventHandler());

		// some events, especially tick, are handled on FML bus
//		MinecraftForge.EVENT_BUS.register(new TBAEventHandler());
	}

	private void registerNetworkChannel() {
//		ToolboxAddons.network = NetworkRegistry.INSTANCE.newSimpleChannel(ToolboxAddons.NETWORK_CHANNEL_NAME);
		int packetId = 0;
		// register messages from client to server
//		ToolboxAddons.network.registerMessage(MessageExtendedReachAttack.Handler.class, MessageExtendedReachAttack.class, packetId++, Side.SERVER);
	}

}
