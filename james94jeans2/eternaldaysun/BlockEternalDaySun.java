
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
    
    public BlockEternalDaySun(int pId, int pTexture, Material pMaterial)
    {
        super(pId, pTexture, pMaterial);
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
    /*
    @Override
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            boolean var6 = par1World.isBlockIndirectlyGettingPowered(par2, par3, par4);

            if (var6)
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate());
            }
        }
    }*/
    
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