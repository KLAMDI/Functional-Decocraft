package com.yzarc.functionaldecocraft;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = FunctionalDecocraft.MODID, version = FunctionalDecocraft.VERSION, dependencies = "required-after:(props)")
public class FunctionalDecocraft
{
    public static final String MODID = "Functional Decocraft";
    public static final String VERSION = "0.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
