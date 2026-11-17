package ext;

import java.net.ConnectException;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;

class Thread253 extends Thread {
   final Minecraft field_2492;
   final String field_194;
   final int field_429;
   final Class728 field_253;

   Thread253(Class728 var1, Minecraft var2, String var3, int var4) {
      this.field_253 = var1;
      this.field_2492 = var2;
      this.field_194 = var3;
      this.field_429 = var4;
   }

   @Override
   public void run() {
      try {
         Class728.method_1089(this.field_253, new Class348(this.field_2492, this.field_194, this.field_429));
         if (Class728.method_55(this.field_253)) {
            return;
         }

         String var1 = this.field_2492.field_2935.field_382;
         if (Class657.field_35 != 0) {
            var1 = (char)Class657.field_35 + "" + var1;
            Class597.method_883("connecting as " + var1);
         }

         Class728.method_690(this.field_253).method_1519(new Class209(var1));
      } catch (UnknownHostException var2) {
         if (Class728.method_55(this.field_253)) {
            return;
         }

         this.field_2492.method_1290(new Class384("Failed to connect to the server", "Unknown host '" + this.field_194 + "'"));
      } catch (ConnectException var3) {
         if (Class728.method_55(this.field_253)) {
            return;
         }

         this.field_2492.method_1290(new Class384("Failed to connect to the server", var3.getMessage()));
      } catch (Exception var4) {
         if (Class728.method_55(this.field_253)) {
            return;
         }

         var4.printStackTrace();
         this.field_2492.method_1290(new Class384("Failed to connect to the server", var4.toString()));
      }
   }
}
