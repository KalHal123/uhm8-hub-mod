package srv;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.minecraft.server.MinecraftServer;

final class WindowAdapter56 extends WindowAdapter {
   final MinecraftServer field_958;

   WindowAdapter56(MinecraftServer var1) {
      this.field_958 = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      this.field_958.method_909();

      while (!this.field_958.field_745) {
         try {
            Thread.sleep(100L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

      System.exit(0);
   }
}
