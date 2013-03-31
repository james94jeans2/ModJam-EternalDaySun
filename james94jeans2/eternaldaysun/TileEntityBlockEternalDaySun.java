
package james94jeans2.eternaldaysun;

import net.minecraft.tileentity.TileEntity;

/**
 *
 * @version 1.0b
 * @author james94jeans2 (Jens Leicht)
 * 
 */

public class TileEntityBlockEternalDaySun extends TileEntity {
    
    @Override
    public void updateEntity() 
    {
        if(!this.worldObj.isRemote)
        {
        if(this.worldObj.getWorldTime() > 12000)
        {
            this.worldObj.setWorldTime(5000);
        }
        if(this.worldObj.isRaining() || this.worldObj.isThundering())
        {
            this.worldObj.getWorldInfo().setRaining(false);
        }
        }
    }
    
}
