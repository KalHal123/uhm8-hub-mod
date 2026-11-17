package ext;

import net.minecraft.client.Minecraft;

public class Thread683 extends Thread {
   private final Minecraft field_2035;

   public Thread683(Minecraft var1) {
      this.field_2035 = var1;
   }

   @Override
   public void run() {
      while (true) {
         Class53 var1 = this.field_2035.field_485;
         if (!var1.method_106()) {
            return;
         }

         try {
            Thread.sleep(10L);
         } catch (Exception var3) {
         }

         var1.method_1361();
      }
   }
}
