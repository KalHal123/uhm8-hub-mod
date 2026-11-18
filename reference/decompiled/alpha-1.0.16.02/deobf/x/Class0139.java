package x;

import net.minecraft.client.Minecraft;

public class Class0139 extends Thread {
   public Class0139(Minecraft var1, String var2) {
      super(var2);
      this.a = var1;
      this.setDaemon(true);
      this.start();
   }

   @Override
   public void run() {
      while (this.a.F) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
         }
      }
   }
}
