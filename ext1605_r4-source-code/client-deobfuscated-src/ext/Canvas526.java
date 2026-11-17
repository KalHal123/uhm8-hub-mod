package ext;

import java.awt.Canvas;
import net.minecraft.client.MinecraftApplet;

public class Canvas526 extends Canvas {
   final MinecraftApplet field_1700;

   public Canvas526(MinecraftApplet var1) {
      this.field_1700 = var1;
   }

   @Override
   public synchronized void addNotify() {
      super.addNotify();
      this.field_1700.method_1555();
   }

   @Override
   public synchronized void removeNotify() {
      this.field_1700.method_419();
      super.removeNotify();
   }
}
