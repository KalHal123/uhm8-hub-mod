import java.net.ConnectException;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;

class mp extends Thread {
   mp(mc var1, Minecraft var2, String var3, int var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   @Override
   public void run() {
      try {
         mc.a(this.d, new go(this.a, this.b, this.c));
         if (mc.a(this.d)) {
            return;
         }

         mc.b(this.d).a((fd)(new gk(this.a.i.b)));
      } catch (UnknownHostException var2) {
         if (mc.a(this.d)) {
            return;
         }

         this.a.a(new cf("Failed to connect to the server", "Unknown host '" + this.b + "'"));
      } catch (ConnectException var3) {
         if (mc.a(this.d)) {
            return;
         }

         this.a.a(new cf("Failed to connect to the server", var3.getMessage()));
      } catch (Exception var4) {
         if (mc.a(this.d)) {
            return;
         }

         var4.printStackTrace();
         this.a.a(new cf("Failed to connect to the server", var4.toString()));
      }
   }
}
