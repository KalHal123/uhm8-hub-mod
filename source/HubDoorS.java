import java.util.Random;

public class HubDoorS extends net.minecraft.src.BlockDoor {

    public HubDoorS(int par1, net.minecraft.src.Material par2Material) {
        super(par1, par2Material);
        this.setCreativeTab(null);
    }

    @Override
    public void onEntityCollidedWithWorld(net.minecraft.src.World par1World, int par2, int par3, int par4, net.minecraft.src.Entity par5Entity) {
        super.onEntityCollidedWithWorld(par1World, par2, par3, par4, par5Entity);
        // Server-side: kick the player with hub redirect
        if (!par1World.isRemote && par5Entity instanceof net.minecraft.src.EntityPlayer) {
            net.minecraft.src.EntityPlayer player = (net.minecraft.src.EntityPlayer) par5Entity;
            String redirect = net.minecraft.src.HubServer.redirectFor(2);  // kind 2 = door
            if (redirect != null) {
                player.movementHandler.setSpeed(0.0F);
                player.setPositionAndUpdate(par2, par3, par4);
                // Kick with redirect reason - the patched client catches this
                player.netHandler.addToSendQueue(new net.minecraft.src.Packet3Chat(redirect));
            }
        }
    }

    @Override
    public int idDropped(int par1) {
        // Drop the Hub Door item (item ID 112)
        return 112;
    }

    @Override
    public boolean onBlockActivated(net.minecraft.src.World par1World, int par2, int par3, int par4, net.minecraft.src.EntityPlayer par5Entity, int par6, float par7, float par8, float par9) {
        // Server-side handling - let original behavior handle the door opening
        return super.onBlockActivated(par1World, par2, par3, par4, par5Entity, par6, par7, par8, par9);
    }
}
