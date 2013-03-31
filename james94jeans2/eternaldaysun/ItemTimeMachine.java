
package james94jeans2.eternaldaysun;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 *
 * @author jens
 */

public class ItemTimeMachine extends Item{
    
    public ItemTimeMachine (int pId)
    {
        super(pId);
        maxStackSize = 1;
        setCreativeTab(CreativeTabs.tabRedstone);
        setItemName("timeMachine");
        setIconIndex(7);
    }
    
    public String getTextureFile() {
                return CommonProxy.BLOCKS_PNG;
        }
    
}
