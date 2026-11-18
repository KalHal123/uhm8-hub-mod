package srv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.minecraft.server.MinecraftServer;

public class Thread311 extends Thread {
   final MinecraftServer field_1417;

   public Thread311(MinecraftServer var1) {
      this.field_1417 = var1;
   }

   @Override
   public void run() {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));
      String var2 = null;

      try {
         while (!this.field_1417.field_745 && MinecraftServer.method_360(this.field_1417) && (var2 = var1.readLine()) != null) {
            this.field_1417.method_3(var2, this.field_1417);
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }
}
