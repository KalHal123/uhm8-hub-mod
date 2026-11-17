package srv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

class Thread88 extends Thread {
   final Class201 field_180;
   final Class75 field_1241;

   Thread88(Class75 var1, Class201 var2) {
      this.field_1241 = var1;
      this.field_180 = var2;
   }

   @Override
   public void run() {
      try {
         String var1 = Class75.method_242(this.field_1241);
         URL var2 = new URL("http://www.minecraft.net/game/checkserver.jsp?user=" + this.field_180.field_118 + "&serverId=" + var1);
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
         String var4 = var3.readLine();
         var3.close();
         System.out.println("THE REPLY IS " + var4);
         if (var4.equals("YES")) {
            Class75.method_419(this.field_1241, this.field_180);
         } else {
            this.field_1241.method_858("Failed to verify username!");
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }
}
