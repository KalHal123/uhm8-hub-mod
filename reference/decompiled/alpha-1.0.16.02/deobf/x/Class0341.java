package x;

import java.net.ConnectException;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;

class Class0341 extends Thread {
   Class0341(Class0328 var1, Minecraft var2, String var3, int var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   @Override
   public void run() {
      try {
         Class0328.a(this.d, new Class0178(this.a, this.b, this.c));
         if (Class0328.a(this.d)) {
            return;
         }

         Class0328.b(this.d).a((Class0140)(new Class0174(this.a.i.b)));
      } catch (UnknownHostException var2) {
         if (Class0328.a(this.d)) {
            return;
         }

         this.a.a(new Class0061("Failed to connect to the server", "Unknown host '" + this.b + "'"));
      } catch (ConnectException var3) {
         if (Class0328.a(this.d)) {
            return;
         }

         this.a.a(new Class0061("Failed to connect to the server", var3.getMessage()));
      } catch (Exception var4) {
         if (Class0328.a(this.d)) {
            return;
         }

         var4.printStackTrace();
         this.a.a(new Class0061("Failed to connect to the server", var4.toString()));
      }
   }
}
