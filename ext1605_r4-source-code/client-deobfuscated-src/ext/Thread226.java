package ext;

import net.minecraft.client.Minecraft;

public class Thread226 extends Thread {
   final Minecraft field_1881;

   public Thread226(Minecraft var1, String var2) {
      super(var2);
      this.field_1881 = var1;
      this.setDaemon(true);
      this.start();
   }

   @Override
   public void run() {
      while (this.field_1881.field_649) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
         }
      }
   }
}
