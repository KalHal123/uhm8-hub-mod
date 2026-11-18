package x;

import net.minecraft.server.MinecraftServer;

public class Class0058 extends Thread {
   final MinecraftServer 1rmXN6M4EBuF6xc89gcj6O90gUVTAGrn6D087WjaIo0O0OrJ80nvqCqq7eYk;

   public Class0058(MinecraftServer var1) {
      this.1rmXN6M4EBuF6xc89gcj6O90gUVTAGrn6D087WjaIo0O0OrJ80nvqCqq7eYk = var1;
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
