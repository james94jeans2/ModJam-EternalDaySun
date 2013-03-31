
package james94jeans2.eternaldaysun;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

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
        proxy.setup();   
    }
    
    @Mod.PostInit
    public void postInit (FMLPostInitializationEvent event)
    {
        
    }
    
}
