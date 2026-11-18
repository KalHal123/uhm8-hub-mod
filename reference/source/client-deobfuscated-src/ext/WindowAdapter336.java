package ext;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.minecraft.client.Minecraft;

public final class WindowAdapter336 extends WindowAdapter {
   final Minecraft field_2985;
   final Thread field_28;

   public WindowAdapter336(Minecraft var1, Thread var2) {
      this.field_2985 = var1;
      this.field_28 = var2;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      this.field_2985.method_459();

      try {
         this.field_28.join();
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

      System.exit(0);
   }
}
