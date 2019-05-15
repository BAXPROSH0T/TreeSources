package com.bax.treesources;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface ISidedFunction<F, T> {

	@SideOnly(Side.SERVER)
	T applyServer(F input);

	@SideOnly(Side.CLIENT)
	T applyClient(F input);


}