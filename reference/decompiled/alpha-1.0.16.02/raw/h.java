import java.awt.Canvas;
import net.minecraft.client.MinecraftApplet;

public class h extends Canvas {
   public h(MinecraftApplet var1) {
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
