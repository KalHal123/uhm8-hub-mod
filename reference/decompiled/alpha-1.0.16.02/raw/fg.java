import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.minecraft.client.Minecraft;

public final class fg extends WindowAdapter {
   public fg(Minecraft var1, Thread var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      this.a.d();

      try {
         this.b.join();
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

      System.exit(0);
   }
}
