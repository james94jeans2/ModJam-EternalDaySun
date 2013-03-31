
package james94jeans2.eternaldaysun;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 *
 * @version 1.0b
 * @author james94jeans2 (Jens Leicht)
 * 
 */

public class BlockEternalDaySun extends BlockContainer {
    
    public BlockEternalDaySun(int pId, Material pMaterial)
    {
        super(pId, pMaterial);
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }
    
    @Override
        public String getTextureFile()
    {
        return CommonProxy.BLOCKS_PNG;
    }
    
    @Override
    public int tickRate()
    {
        return 1;
    }
    
    public int getBlockTextureFromSide(int pSide)
    {
       switch(pSide)
       {
           case 0: //down
               return 0;
           case 1: //up
               return 1;
           case 2:
               return 2;
           case 3:
               return 3;
           case 4:
               return 4;
           case 5:
               return 5;
       }
       return 18;
    }
    
    @Override
    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntityBlockEternalDaySun();
    }
    
    @Override
    public void updateTick(World world, int par2, int par3, int par4, Random par5Random) 
    {
        if(world.getWorldTime() > 12000)
        {
            world.setWorldTime(5000);
        }
        if(world.isRaining() || world.isThundering())
        {
            world.toggleRain();
        }
    }
    
}
