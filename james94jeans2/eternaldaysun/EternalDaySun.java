
package james94jeans2.eternaldaysun;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

/**
 *
 * @version 1.0b
 * @author james94jeans2 (Jens Leicht)
 * 
 */

@Mod (modid = "EternalDaySun", useMetadata = false, name = "EternalDaySun", version = EternalDaySun.version)
@NetworkMod (clientSideRequired = true, serverSideRequired = false)

public class EternalDaySun {
    
    public static final String version = "1.0b";
    public final static Block blockEternalDaySun = new BlockEternalDaySun(194, Material.iron).setHardness(0.5F).setStepSound(Block.soundMetalFootstep)
        .setBlockName("eternalDaySun").setCreativeTab(CreativeTabs.tabRedstone);;

    @Mod.Instance ("EternalDaySun")
    public static EternalDaySun instance;

    @SidedProxy (clientSide="james94jeans2.eternaldaysun.ClientProxy", serverSide="james94jeans2.eternaldaysun.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.PreInit
    public void preInit (FMLPreInitializationEvent event)
    {
        
    }
    
    @Mod.Init
    public void load (FMLInitializationEvent event)
    {
        LanguageRegistry.addName(blockEternalDaySun, "Eternal Day and Sun Block");
        MinecraftForge.setBlockHarvestLevel(blockEternalDaySun, "pickaxe", 3);
        GameRegistry.registerBlock(blockEternalDaySun, "eternalDaySun");
        GameRegistry.registerTileEntity(TileEntityBlockEternalDaySun.class, "eternalDaySun");
        proxy.setup();   
    }
    
    @Mod.PostInit
    public void postInit (FMLPostInitializationEvent event)
    {
        
    }
    
}
