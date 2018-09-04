package com.github.wolfiewaffle.toolboxaddons.common.items;

import com.github.wolfiewaffle.toolboxaddons.ToolboxAddons;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import toolbox.Toolbox;
import toolbox.common.Config;
import toolbox.common.items.parts.ItemToolHead;

@Mod.EventBusSubscriber(modid = ToolboxAddons.MODID)
@ObjectHolder("toolboxaddons")
public class ModItemsAddon {

	public static final ItemToolHead spear_head = null;
	public static final ItemToolHead katana_blade = null;

	public static final Item enchanted_handle = getItem("enchanted_handle");
	
//	public static final ItemATASpear spear = null;
//	public static final ItemATAKatana katana = null;

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(enchanted_handle);
		
		if (!Config.DISABLED_TOOLS.contains("spear")) {
//			event.getRegistry().register(new ItemToolHead("spear_head"));
//			ItemSchematic.subtypes.add("spear_head");
//			event.getRegistry().register(new ItemATASpear());
		}

		/*if (!Config.DISABLED_TOOLS.contains("katana")) {
			event.getRegistry().register(new ItemToolHead("katana_blade"));
			ItemSchematic.subtypes.add("katana_blade");
			event.getRegistry().register(new ItemATAKatana());
		}*/
	}

	@SubscribeEvent
	public static void setupModels(ModelRegistryEvent event) {
		if (!Config.DISABLED_TOOLS.contains("spear")) {
//			spear_head.initModel();
//			spear.initModel();
		}

		/*if (!Config.DISABLED_TOOLS.contains("katana")) {
			katana_blade.initModel();
			katana.initModel();
		}*/
		
		ModelLoader.setCustomModelResourceLocation(enchanted_handle, 0, new ModelResourceLocation(enchanted_handle.getRegistryName().toString(), "inventory"));
	}

	private static Item getItem(String name) {
		Item item = new Item();
		item.setRegistryName(name);
		item.setUnlocalizedName(ToolboxAddons.MODID + "." + name);
		item.setCreativeTab(Toolbox.partsTab);
		return item;
	}

}
