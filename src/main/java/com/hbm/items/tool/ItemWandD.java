package com.hbm.items.tool;

import java.util.List;

import com.hbm.dim.CelestialBody;
import com.hbm.dim.DebugTeleporter;
import com.hbm.dim.SolarSystem;
import com.hbm.dim.trait.CBT_Atmosphere;
import com.hbm.dim.trait.CBT_Atmosphere.FluidEntry;
import com.hbm.dim.trait.CBT_Winter;
import com.hbm.dim.trait.CelestialBodyTrait.CBT_Destroyed;
import com.hbm.lib.Library;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemWandD extends Item {

	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		
		if(world.isRemote)
			return stack;
		
		MovingObjectPosition pos = Library.rayTrace(player, 500, 1, false, true, false);
		
		if(pos != null) {

			if(stack.stackTagCompound == null)
				stack.stackTagCompound = new NBTTagCompound();
			
			if(!player.isSneaking()) {
				int targetId = stack.stackTagCompound.getInteger("dim");
				if(targetId == 0) targetId++; // skip blank

				SolarSystem.Body target = SolarSystem.Body.values()[targetId];

				DebugTeleporter.teleport(player, target.getBody().dimensionId, player.posX, 300, player.posZ, true);
				player.addChatMessage(new ChatComponentText("Teleported to: " + target.getBody().getUnlocalizedName()));

			} else {
				int targetId = stack.stackTagCompound.getInteger("dim");
				targetId++;

				if(targetId >= SolarSystem.Body.values().length) {
					targetId = 1;
				}
				
				stack.stackTagCompound.setInteger("dim", targetId);

				SolarSystem.Body target = SolarSystem.Body.values()[targetId];

				player.addChatMessage(new ChatComponentText("Set teleport target to: " + target.getBody().getUnlocalizedName()));
			}
		} else {
			if(!player.isSneaking()) {
					// TESTING: View winter data
					CBT_Winter winter = CelestialBody.getTrait(world, CBT_Winter.class);
				player.addChatMessage(new ChatComponentText("Winter level: " + winter));
				}
		}

		return stack;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		list.add("Dimension teleporter and atmosphere debugger.");

		if(stack.stackTagCompound != null) {
			int targetId = stack.stackTagCompound.getInteger("dim");
			SolarSystem.Body target = SolarSystem.Body.values()[targetId];

			list.add("Teleportation target: " + target.getBody().getUnlocalizedName());
		}
	}
}