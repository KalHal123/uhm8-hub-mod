package x;

import java.awt.Canvas;
import net.minecraft.client.MinecraftApplet;

public class Class0190 extends Canvas {
   public Class0190(MinecraftApplet var1) {
      this.a = var1;
   }

   @Override
   public synchronized void addNotify() {
      super.addNotify();
      this.a.a();
   }

   @Override
   public synchronized void removeNotify() {
      this.a.b();
      super.removeNotify();
   }
}
