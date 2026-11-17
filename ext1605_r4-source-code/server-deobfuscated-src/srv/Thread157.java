package srv;

import net.minecraft.server.MinecraftServer;

public final class Thread157 extends Thread {
   final MinecraftServer field_897;

   public Thread157(String var1, MinecraftServer var2) {
      super(var1);
      this.field_897 = var2;
   }

   @Override
   public void run() {
      this.field_897.run();
   }
}
