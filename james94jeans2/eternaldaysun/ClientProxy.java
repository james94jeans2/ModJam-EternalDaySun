
package james94jeans2.eternaldaysun;

import net.minecraftforge.client.MinecraftForgeClient;

/**
 *
 * @version 1.0b
 * @author james94jeans2 (Jens Leicht)
 * 
 */

public class ClientProxy extends CommonProxy{
    
    @Override
    public void setup()
    {
        MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
    }
    
}
