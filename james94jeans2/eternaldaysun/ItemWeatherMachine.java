
package james94jeans2.eternaldaysun;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 *
 * @author jens
 */
public class ItemWeatherMachine extends Item{
    
    public ItemWeatherMachine (int pId)
    {
        super(pId);
        maxStackSize = 1;
        setCreativeTab(CreativeTabs.tabRedstone);
        setItemName("weatherMachine");
        setIconIndex(8);
    }
    
    public String getTextureFile() {
                return CommonProxy.BLOCKS_PNG;
        }
    
}
