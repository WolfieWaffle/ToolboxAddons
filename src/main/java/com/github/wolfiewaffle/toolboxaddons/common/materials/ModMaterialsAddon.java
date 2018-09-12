package com.github.wolfiewaffle.toolboxaddons.common.materials;

import java.util.ArrayList;
import java.util.List;

import com.github.wolfiewaffle.toolboxaddons.ToolboxAddons;
import com.google.common.collect.Lists;

import api.materials.AdornmentMaterial;
import api.materials.HaftMaterial;
import api.materials.HandleMaterial;
import api.materials.HeadMaterial;
import api.materials.Materials;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import toolbox.common.Config;

public class ModMaterialsAddon {

	public static final AdornmentMaterial ADORNMENT_REDSTONE = new AdornmentMaterial("redstone", 0, 0.8F, 2.25F, 0F, 0.1F, ToolboxAddons.MODID);

	public static final HeadMaterial HEAD_BRASS = new HeadMaterial("brass", 1, 144, 4.9F, 1.45F, 30, ItemStack.EMPTY, "ingotBrass", "nuggetBrass", Lists.<String>newArrayList("brass"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_INVAR = new HeadMaterial("invar", 3, 260, 10.4F, 2.15F, 9, ItemStack.EMPTY, "ingotInvar", "nuggetInvar", Lists.<String>newArrayList("invar"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_MITHRIL = new HeadMaterial("mithril", 0, 252, 2.4F, 2.0F, 30, ItemStack.EMPTY, "ingotMithril", "nuggetMithril", Lists.<String>newArrayList("mithril"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_CUPRONICKEL = new HeadMaterial("cupronickel", 2, 228, 7.4F, 2.0F, 19, ItemStack.EMPTY, "ingotCupronickel", "nuggetCupronickel", Lists.<String>newArrayList("cupronickel"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_ZINC = new HeadMaterial("zinc", 0, 55, 2.4F, 1.15F, 3, ItemStack.EMPTY, "ingotZinc", "nuggetZinc", Lists.<String>newArrayList("zinc"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_PEWTER = new HeadMaterial("pewter", 0, 55, 2.4F, 1.15F, 3, ItemStack.EMPTY, "ingotPewter", "nuggetPewter", Lists.<String>newArrayList("pewter"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_ANTIMONY = new HeadMaterial("antimony", 0, 55, 2.4F, 1.15F, 3, ItemStack.EMPTY, "ingotAntimony", "nuggetAntimony", Lists.<String>newArrayList("antimony"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_BISMUTH = new HeadMaterial("bismuth", 0, 55, 2.4F, 1.15F, 3, ItemStack.EMPTY, "ingotBismuth", "nuggetBismuth", Lists.<String>newArrayList("bismuth"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_PLATINUM = new HeadMaterial("platinum", 1, 205, 4.4F, 1.4F, 48, ItemStack.EMPTY, "ingotPlatinum", "nuggetPlatinum", Lists.<String>newArrayList("platinum"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_COLDIRON = new HeadMaterial("coldiron", 2, 238, 8.4F, 1.8F, 22, ItemStack.EMPTY, "ingotColdiron", "nuggetColdiron", Lists.<String>newArrayList("coldiron"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_ADAMANTINE = new HeadMaterial("adamantine", 4, 3200, 13.4F, 2.5F, 0, ItemStack.EMPTY, "ingotAdamantine", "nuggetAdamantine", Lists.<String>newArrayList("adamantine"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_AQUARIUM = new HeadMaterial("aquarium", 1, 260, 5.4F, 1.5F, 48, ItemStack.EMPTY, "ingotAquarium", "nuggetAquarium", Lists.<String>newArrayList("aquarium"), ToolboxAddons.MODID);
	public static final HeadMaterial HEAD_STARSTEEL = new HeadMaterial("starsteel", 3, 800, 11.4F, 2.25F, 38, ItemStack.EMPTY, "ingotStarsteel", "nuggetStarsteel", Lists.<String>newArrayList("starsteel"), ToolboxAddons.MODID);

	public static final HeadMaterial HEAD_DRAGONBONE = new HeadMaterial("dragonbone", 4, 1660, 10.0F, 4.0F, 22, ItemStack.EMPTY, "boneDragon", "shardDragonBone", Lists.<String>newArrayList("dragonbone"), ToolboxAddons.MODID);

//	public static final HeadMaterial HEAD_STEELEAF = new HeadMaterial("steeleaf", 3, 131, 8.0F, 3.0F, 9, ItemStack.EMPTY, "ingotSteeleaf", "nuggetSteeleaf", Lists.<String>newArrayList("steeleaf"), ToolboxAddons.MODID);
	
	//l(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability)
	//EnumHelper.addToolMaterial("STEELEAF", 3, 131, 8.0F, 3, 9);
	
//	public static final HandleMaterial HANDLE_IRON = new
//	HandleMaterial("iron", 1.2F, Toolbox.MODID);
//	public static final HandleMaterial HANDLE_GOLD = new
//	HandleMaterial("gold", 0.2F, Toolbox.MODID);
	public static final HaftMaterial HAFT_BAMBOO = new HaftMaterial("bamboo", 0, 1.35F, 0.9F, 0.0F, 1.0F, ToolboxAddons.MODID);
	
	public static final HandleMaterial HANDLE_BAMBOO = new HandleMaterial("bamboo", 1.3F, 0.95f, 1.0F, ToolboxAddons.MODID);
	public static final HandleMaterial HANDLE_ENCHANTED = new HandleMaterial("enchanted", 1.125F, 1.0f, 1.75F, ToolboxAddons.MODID);
	public static final HandleMaterial HANDLE_TREATED_LEATHER = new HandleMaterial("treated_leather", 1.25F, 1.1f, 0.775F, ToolboxAddons.MODID);
	public static final HandleMaterial HANDLE_TREATED_FABRIC = new HandleMaterial("treated_fabric", 1.125F, 1.1f, 1.65F, ToolboxAddons.MODID);
//public static final HandleMaterial HANDLE_COBALT = new HandleMaterial("cobalt", 1.19F, 1.7f, 1.05F, ToolboxAddons.MODID);
//	public static final HandleMaterial HANDLE_ARDITE = new
//	HandleMaterial("ardite", 1.5F, 1.05f, 0.85F, ToolboxAddons.MODID);
//	public static final HandleMaterial HANDLE_MANYULLYN = new
//	HandleMaterial("manyullyn", 1.25F, 1.2f, 1.15F, ToolboxAddons.MODID);

	public static List<AdornmentMaterial> adornmentMaterials = new ArrayList<AdornmentMaterial>();

	public static List<HeadMaterial> headMaterials = new ArrayList<HeadMaterial>();

	public static List<HaftMaterial> haftMaterials = new ArrayList<HaftMaterial>();

	public static List<HandleMaterial> handleMaterials = new ArrayList<HandleMaterial>();

	public static void init() {
		initHeadMaterials();
		initHaftMaterials();
		initHandleMaterials();
		initAdornmentMaterials();
	}

	private static void initHeadMaterials() {
		headMaterials.add(HEAD_BRASS);
		headMaterials.add(HEAD_INVAR);
		headMaterials.add(HEAD_MITHRIL);
		headMaterials.add(HEAD_CUPRONICKEL);
		headMaterials.add(HEAD_ZINC);
		headMaterials.add(HEAD_ANTIMONY);
		headMaterials.add(HEAD_BISMUTH);
		headMaterials.add(HEAD_PEWTER);
		headMaterials.add(HEAD_PLATINUM);
		headMaterials.add(HEAD_COLDIRON);
		headMaterials.add(HEAD_ADAMANTINE);
		headMaterials.add(HEAD_AQUARIUM);
		headMaterials.add(HEAD_STARSTEEL);

		headMaterials.add(HEAD_DRAGONBONE);

//		headMaterials.add(HEAD_STEELEAF);

		for (HeadMaterial mat : headMaterials) {
			if (!Config.DISABLED_MATERIALS.contains(mat.getName())) {
				System.out.println("Registering " + mat.getName());
				Materials.registerHeadMat(mat);
			}
		}
	}

	private static void initHaftMaterials() {
		// Materials.registerHaftMat(HAFT_WOOD);
		// if(Loader.isModLoaded("nex"))
		// Materials.registerHaftMat(HAFT_WITHER_BONE);
		if(Loader.isModLoaded("biomesoplenty"))
			haftMaterials.add(HAFT_BAMBOO);
		
		for (HaftMaterial mat : haftMaterials) {
			if (!Config.DISABLED_MATERIALS.contains(mat.getName())) {
				System.out.println("Registering " + mat.getName());
				Materials.registerHaftMat(mat);
			}
		}
	}

	private static void initHandleMaterials() {
//		if(Loader.isModLoaded("tconstruct"))
//			handleMaterials.add(HANDLE_COBALT);
//		if(Loader.isModLoaded("tconstruct"))
//			handleMaterials.add(HANDLE_ARDITE);
//		if(Loader.isModLoaded("tconstruct"))
//			handleMaterials.add(HANDLE_MANYULLYN);
		handleMaterials.add(HANDLE_TREATED_LEATHER);
		handleMaterials.add(HANDLE_TREATED_FABRIC);
		
		if(Loader.isModLoaded("biomesoplenty"))
			handleMaterials.add(HANDLE_BAMBOO);

		if(Loader.isModLoaded("thaumcraft"))
			handleMaterials.add(HANDLE_ENCHANTED);

		for (HandleMaterial mat : handleMaterials) {
			if (!Config.DISABLED_MATERIALS.contains(mat.getName())) {
				System.out.println("Registering " + mat.getName());
				Materials.registerHandleMat(mat);
			}
		}
	}

	private static void initAdornmentMaterials() {
		adornmentMaterials.add(ADORNMENT_REDSTONE);
		
		for (AdornmentMaterial mat : adornmentMaterials) {
			if (!Config.DISABLED_MATERIALS.contains(mat.getName())) {
				System.out.println("Registering " + mat.getName());
				Materials.registerAdornmentMat(mat);
			}
		}
	}

}
