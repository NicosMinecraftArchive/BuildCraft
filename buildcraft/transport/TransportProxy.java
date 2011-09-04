package buildcraft.transport;

import buildcraft.core.PacketIds;
import buildcraft.core.Utils;
import buildcraft.transport.CraftingDiamondPipe;
import buildcraft.transport.TileDiamondPipe;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.EntityItem;
import net.minecraft.server.ModLoader;
import net.minecraft.server.TileEntity;
import net.minecraft.server.World;

public class TransportProxy {

   public static void displayGUIFilter(EntityHuman var0, TileDiamondPipe var1) {
      ModLoader.OpenGUI(var0, Utils.packetIdToInt(PacketIds.DiamondPipeGUI), var1, new CraftingDiamondPipe(var0.inventory, var1));
   }

   static void obsidianPipePickup(World var0, EntityItem var1, TileEntity var2) {}
}
