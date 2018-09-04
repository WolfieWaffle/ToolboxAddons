package com.github.wolfiewaffle.toolboxaddons.common.handlers;

import com.github.wolfiewaffle.toolboxaddons.ToolboxAddons;
import com.github.wolfiewaffle.toolboxaddons.common.materials.ModMaterialsAddon;

import api.materials.PartMaterial;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityElderGuardian;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import toolbox.common.items.tools.IBladeTool;
import toolbox.common.items.tools.ICrossguardTool;
import toolbox.common.items.tools.IHeadTool;
import toolbox.common.materials.ModMaterials;

public class HandlerAddon {

	@SubscribeEvent
	public void onAttack(LivingHurtEvent event) {
		if (event.getEntity() instanceof EntityLivingBase) {
			EntityLivingBase entity = event.getEntityLiving();

			if (event.getSource().getImmediateSource() instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) event.getSource().getImmediateSource();
				ItemStack stack = player.getHeldItemMainhand();

				if (hasMaterial(stack, ModMaterialsAddon.HEAD_COLDIRON, false)) {
					if (entity.isImmuneToFire()) {
						event.setAmount(event.getAmount() + 3F);
					}
				}
				if (hasMaterial(stack, ModMaterialsAddon.HEAD_ADAMANTINE, false)) {
					if (entity.getMaxHealth() > 20F) {
						event.setAmount(event.getAmount() + 4F);
					}
				}
				if (hasMaterial(stack, ModMaterialsAddon.HEAD_AQUARIUM, false)) {
					if (entity.canBreatheUnderwater() || entity instanceof EntityGuardian || entity instanceof EntityElderGuardian) {
						event.setAmount(event.getAmount() + 4F);
					}
				}
				if (ToolboxAddons.CONFIG.baseMetals.leadEffects && hasMaterial(stack, ModMaterials.HEAD_LEAD, false)) {
					final PotionEffect poison = new PotionEffect(MobEffects.POISON, 180, 0);
					entity.addPotionEffect(poison);
				}
				if (ToolboxAddons.CONFIG.baseMetals.silverEffects && hasMaterial(stack, ModMaterials.HEAD_SILVER, false)) {
					if (entity.getCreatureAttribute() == EnumCreatureAttribute.UNDEAD) {
						event.setAmount(event.getAmount() + 3.5F);
					}
				}
				if (hasMaterial(stack, ModMaterialsAddon.HEAD_MITHRIL, false)) {
					if (entity.getCreatureAttribute() == EnumCreatureAttribute.UNDEAD) {
						if (ToolboxAddons.CONFIG.baseMetals.mithrilSilverBonus && ICrossguardTool.getCrossguardMat(stack) == ModMaterials.HEAD_SILVER) {
							event.setAmount(event.getAmount() + 3.5F);
						}

						final PotionEffect wither = new PotionEffect(MobEffects.WITHER, 60, 3);
						final PotionEffect blind = new PotionEffect(MobEffects.BLINDNESS, 60, 1);
						entity.addPotionEffect(wither);
						entity.addPotionEffect(blind);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onToolUpdate(LivingUpdateEvent event) {
		if (event.getEntityLiving() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntityLiving();

			if (player.ticksExisted % 200 == 0) {
				for (ItemStack stack : player.inventory.mainInventory) {
					if (stack.isItemDamaged() && hasMaterial(stack, ModMaterialsAddon.HEAD_STARSTEEL, true)) {
						stack.damageItem(-1, player);
					}
				}
				for (ItemStack stack : player.inventory.offHandInventory) {
					if (stack.isItemDamaged() && hasMaterial(stack, ModMaterialsAddon.HEAD_STARSTEEL, true)) {
						stack.damageItem(-1, player);
					}
				}
			}
		}
	}

	private boolean hasMaterial(ItemStack stack, PartMaterial mat, boolean crossGuardCounts) {
		Item item = stack.getItem();

		if (item instanceof IHeadTool && IHeadTool.getHeadMat(stack) == mat)
			return true;
		if (item instanceof IBladeTool && IBladeTool.getBladeMat(stack) == mat)
			return true;
		if (crossGuardCounts && item instanceof ICrossguardTool && ICrossguardTool.getCrossguardMat(stack) == mat)
			return true;

		return false;
	}
}
