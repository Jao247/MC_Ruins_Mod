package com.jao247.mod_ruins.block;

import com.jao247.mod_ruins.creativeTab.CreativeTabRW;
import com.jao247.mod_ruins.reference.Reference;
import com.jao247.mod_ruins.reference.Texture;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockRW extends Block
{

	protected BlockRW(Material m)
	{
		super(m);
		this.setCreativeTab(CreativeTabRW.RW_TAB);
	}

	public BlockRW()
	{
		this(Material.rock);
		this.setCreativeTab(CreativeTabRW.RW_TAB);
	}

	@Override
	public String getUnlocalizedName() { return String.format("item.%s%s", Texture.MOD_TEX_REF, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
