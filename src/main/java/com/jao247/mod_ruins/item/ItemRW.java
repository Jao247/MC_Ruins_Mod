package com.jao247.mod_ruins.item;

import com.jao247.mod_ruins.creativeTab.CreativeTabRW;
import com.jao247.mod_ruins.reference.Reference;
import com.jao247.mod_ruins.reference.Texture;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemRW extends Item
{
	public ItemRW()
	{
		super();
		this.setCreativeTab(CreativeTabRW.RW_TAB);
	}

	@Override
	public String getUnlocalizedName() { return String.format("item.%s%s", Texture.MOD_TEX_REF, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) { return String.format("item.%s%s", Texture.MOD_TEX_REF, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
