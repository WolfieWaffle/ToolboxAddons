package com.github.wolfiewaffle.toolboxaddons.common.recipes;

import com.github.wolfiewaffle.toolboxaddons.ToolboxAddons;
import com.github.wolfiewaffle.toolboxaddons.common.items.ModItemsAddon;
import com.github.wolfiewaffle.toolboxaddons.common.materials.ModMaterialsAddon;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import toolbox.common.Config;
import toolbox.common.recipes.ModRecipes;

public class ModRecipesAddon {

	public static void init() {

//		if (!Config.DISABLED_TOOLS.contains("spear")) {
//			registerSchematicRecipe("spear", "spear_head", "  P", " S ", "S  ");
//			
//			for (int i : ModItemsAddon.spear_head.meta_map.keySet()) {
//				HeadMaterial mat = ModItemsAddon.spear_head.meta_map.get(i);
//				if (!Config.DISABLE_TOOL_HEAD_RECIPES || !CommonProxy.smelteryMaterials.contains(mat)) {
//					if (Config.ENABLE_SCHEMATICS) {
//						ForgeRegistries.RECIPES.register(getToolHeadSchematicRecipe(new ItemStack(ModItemsAddon.spear_head, 1, i), mat.getCraftingItem(), "spear_head", 1).setRegistryName(new ResourceLocation(ToolboxAddons.MODID, "spear_head_" + mat.getName())));
//					} else {
//						ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, new ItemStack(ModItemsAddon.spear_head, 1, i), "SP", " S", 'P', mat.getCraftingItem(), 'S', mat.getSmallCraftingItem()).setRegistryName(new ResourceLocation(ToolboxAddons.MODID, "spear_head_" + mat.getName())));
//					}
//				}
//			}
//		}

		initToolRecipes();

		initMaterialItems();
	}

//	private static void registerSchematicRecipe(String toolType, String schematicType, String row1, String row2, String row3) {
//		if (Config.ENABLE_SCHEMATICS && !Config.DISABLED_TOOLS.contains(toolType) && ConfigAddon.CRAFTED_SCHEMATICS.contains(schematicType) && ItemSchematic.subtypes.contains(schematicType)) {
//			ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, new ItemStack(Blocks.STONE)/*ModItems.schematic.createStack(schematicType)*/, row1, row2, row3, 'P', new ItemStack(Items.PAPER), 'S', new ItemStack(Items.STICK)).setRegistryName(schematicType + "_schematic"));
//			
//		}
//	}

	public static void initToolRecipes() {
		if (!Config.DISABLED_TOOLS.contains("spear")) {
//			RecipeSorter.register("toolboxaddons:spear", SpearRecipe.class, RecipeSorter.Category.SHAPELESS, "after:minecraft:shapeless");
//			ForgeRegistries.RECIPES.register(new SpearRecipe().setRegistryName(new ResourceLocation(ToolboxAddons.MODID, "spear")));
		}
	}

	public static void initMaterialItems() {
		String bamboo = "biomesoplenty:bamboo";
		String enchantedfabric = "thaumcraft:fabric";

		// ModRecipes.handle_map.put(new ItemStack(Items.IRON_NUGGET, 1, 0),
		// ModMaterialsAddon.HANDLE_IRON);
		// ModRecipes.handle_map.put(new ItemStack(Items.GOLD_NUGGET, 1, 0),
		// ModMaterialsAddon.HANDLE_GOLD);

		if (Item.REGISTRY.containsKey(new ResourceLocation(bamboo))) {
			Item item = Item.REGISTRY.getObject(new ResourceLocation(bamboo));
			ModRecipes.handle_map.put(new ItemStack(item, 1, 0), ModMaterialsAddon.HANDLE_BAMBOO);
			ModRecipes.haft_map.put(new ItemStack(item, 1, 0), ModMaterialsAddon.HAFT_BAMBOO);
		}

		// Enchanted Fabric
		if (Item.REGISTRY.containsKey(new ResourceLocation(enchantedfabric))) {
			Item item = Item.REGISTRY.getObject(new ResourceLocation(enchantedfabric));

			// Enchanted Fabric
			ForgeRegistries.RECIPES.register(new ShapelessOreRecipe(null, new ItemStack(ModItemsAddon.enchanted_handle, 1, 0), "stickWood", new ItemStack(item, 1, 0)).setRegistryName(new ResourceLocation(ToolboxAddons.MODID, "enchanted_handle")));
			ModRecipes.handle_map.put(new ItemStack(ModItemsAddon.enchanted_handle, 1, 0), ModMaterialsAddon.HANDLE_ENCHANTED);

			// Treated Wood Enchanted Fabric
			ForgeRegistries.RECIPES.register(new ShapelessOreRecipe(null, new ItemStack(ModItemsAddon.treated_fabric_handle, 1, 0), "stickTreatedWood", new ItemStack(item, 1, 0)).setRegistryName(new ResourceLocation(ToolboxAddons.MODID, "treated_fabric_handle")));
			ModRecipes.handle_map.put(new ItemStack(ModItemsAddon.treated_fabric_handle, 1, 0), ModMaterialsAddon.HANDLE_TREATED_FABRIC);
		}

		// Treated Wood Leather
		ForgeRegistries.RECIPES.register(new ShapelessOreRecipe(null, new ItemStack(ModItemsAddon.treated_leather_handle, 1, 0), "stickTreatedWood", "leather").setRegistryName(new ResourceLocation(ToolboxAddons.MODID, "treated_leather_handle")));
		ModRecipes.handle_map.put(new ItemStack(ModItemsAddon.treated_leather_handle, 1, 0), ModMaterialsAddon.HANDLE_TREATED_LEATHER);

		ModRecipes.adornment_map.put(new ItemStack(Items.REDSTONE, 1, 0), ModMaterialsAddon.ADORNMENT_REDSTONE);
	}

//	private static IRecipe getToolHeadSchematicRecipe(ItemStack output, String material, String type, int cost) {
//		NonNullList<Ingredient> inputs = NonNullList.withSize(cost + 1, Ingredient.EMPTY);
//		ItemStack schematic = new ItemStack(ModItems.schematic);
//		NBTTagCompound nbt = new NBTTagCompound();
//		nbt.setString(ItemSchematic.type_tag, type);
//		schematic.setTagCompound(nbt);
//		Ingredient schematicIngredient = new IngredientNBT(schematic) {
//
//		};
//		inputs.set(0, schematicIngredient);
//		for (int i = 1; i <= cost; i++) {
//			inputs.set(i, new OreIngredient(material));
//		}
//
//		return new ShapelessOreRecipe(null, inputs, output);
//	}

}
