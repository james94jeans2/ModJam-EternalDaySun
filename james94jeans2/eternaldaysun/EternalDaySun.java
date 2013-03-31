
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
        .setBlockName("eternalDaySun").setCreativeTab(CreativeTabs.tabRedstone);
    public final static Item itemCircuit = new ItemCircuit(5000);
    public final static Item itemTimeMachine = new ItemTimeMachine(5001);
    public final static Item itemWeatherMachine = new ItemWeatherMachine(5002);

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
        GameRegistry.registerItem(itemCircuit, "circuit");
        GameRegistry.registerItem(itemTimeMachine, "timeMachine");
        GameRegistry.registerItem(itemWeatherMachine, "weatherMachine");
        LanguageRegistry.addName(itemCircuit, "Circuit");
        LanguageRegistry.addName(itemTimeMachine, "Time Machine");
        LanguageRegistry.addName(itemWeatherMachine, "Weather Machine");
        GameRegistry.addRecipe(new ItemStack(EternalDaySun.itemCircuit), "xxx", "xyx", "xxx", 'x', new ItemStack(Item.redstone), 'y', new ItemStack(Item.ingotIron));
        GameRegistry.addRecipe(new ItemStack(EternalDaySun.itemTimeMachine), "xxx", "yzy", "xxx", 'x', new ItemStack(Item.ingotGold), 'y', new ItemStack(EternalDaySun.itemCircuit), 'z', new ItemStack(Item.pocketSundial));
        GameRegistry.addRecipe(new ItemStack(EternalDaySun.itemWeatherMachine), "xxx", "yzy", "xxx", 'x', new ItemStack(Item.ingotGold), 'y', new ItemStack(EternalDaySun.itemCircuit), 'z', new ItemStack(Item.netherStar));
        GameRegistry.addRecipe(new ItemStack(EternalDaySun.blockEternalDaySun), "xxx", "yza", "xxx", 'x', new ItemStack(Block.blockSteel), 'y', new ItemStack(EternalDaySun.itemTimeMachine), 'z', new ItemStack(Block.blockDiamond), 'a', new ItemStack(EternalDaySun.itemWeatherMachine));
        proxy.setup();   
    }
    
    @Mod.PostInit
    public void postInit (FMLPostInitializationEvent event)
    {
        
    }
    
}
