package srv;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class Class225 {
   public static Logger field_836 = Logger.getLogger("Minecraft");
   private ServerSocket field_278;
   private Thread field_1524;
   public volatile boolean field_1290 = false;
   private int field_889 = 0;
   private ArrayList field_1028 = new ArrayList();
   private ArrayList field_297 = new ArrayList();
   public MinecraftServer field_122;

   public Class225(MinecraftServer var1, InetAddress var2, int var3) throws IOException {
      this.field_122 = var1;
      this.field_278 = new ServerSocket(var3, 0, var2);
      this.field_278.setPerformancePreferences(0, 2, 1);
      this.field_1290 = true;
      this.field_1524 = new Thread330(this, "Listen thread", var1);
      this.field_1524.start();
   }

   public void method_550(Class124 var1) {
      this.field_297.add(var1);
   }

   private void method_967(Class75 var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Got null pendingconnection!");
      }

      this.field_1028.add(var1);
   }

   public void method_269() {
      for (int var1 = 0; var1 < this.field_1028.size(); var1++) {
         Class75 var2 = (Class75)this.field_1028.get(var1);

         try {
            var2.method_395();
         } catch (Exception var5) {
            var2.method_858("Internal server error");
            field_836.log(Level.WARNING, "Failed to handle packet: " + var5, var5);
         }

         if (var2.field_103) {
            this.field_1028.remove(var1--);
         }
      }

      for (int var6 = 0; var6 < this.field_297.size(); var6++) {
         Class124 var7 = (Class124)this.field_297.get(var6);

         try {
            var7.method_30();
         } catch (Exception var4) {
            var7.method_28("Internal server error");
            field_836.log(Level.WARNING, "Failed to handle packet: " + var4, var4);
         }

         if (var7.field_858) {
            this.field_297.remove(var6--);
         }
      }
   }

   static ServerSocket method_407(Class225 var0) {
      return var0.field_278;
   }

   static int method_578(Class225 var0) {
      return var0.field_889++;
   }

   static void method_723(Class225 var0, Class75 var1) {
      var0.method_967(var1);
   }
}
