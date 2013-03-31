
package james94jeans2.eternaldaysun;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 *
 * @author jens
 */
public class ItemCircuit extends Item{
    
    public ItemCircuit (int pId)
    {
        super(pId);
        maxStackSize = 16;
        setCreativeTab(CreativeTabs.tabRedstone);
        setItemName("circuit");
        setIconIndex(8);
    }
    
    public String getTextureFile() {
                return CommonProxy.BLOCKS_PNG;
        }
    
}
