package srv;

import net.minecraft.server.MinecraftServer;

public class Thread59 extends Thread {
   final MinecraftServer field_287;

   public Thread59(MinecraftServer var1) {
      this.field_287 = var1;
      this.setDaemon(true);
      this.start();
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
         }
      }
   }
}
