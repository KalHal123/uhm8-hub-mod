package srv;

import java.io.IOException;
import java.net.Socket;
import net.minecraft.server.MinecraftServer;

class Thread330 extends Thread {
   final MinecraftServer field_714;
   final Class225 field_528;

   Thread330(Class225 var1, String var2, MinecraftServer var3) {
      super(var2);
      this.field_528 = var1;
      this.field_714 = var3;
   }

   @Override
   public void run() {
      while (this.field_528.field_1290) {
         try {
            Socket var1 = Class225.method_407(this.field_528).accept();
            if (var1 != null) {
               Class75 var2 = new Class75(this.field_714, var1, "Connection #" + Class225.method_578(this.field_528));
               Class225.method_723(this.field_528, var2);
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }
}
