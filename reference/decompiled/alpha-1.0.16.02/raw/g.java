import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

public class g extends Minecraft {
   public g(MinecraftApplet var1, Component var2, Canvas var3, MinecraftApplet var4, int var5, int var6, boolean var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.a = var1;
   }

   @Override
   public void a(gf var1) {
      this.a.removeAll();
      this.a.setLayout(new BorderLayout());
      this.a.add(new an(var1), "Center");
      this.a.validate();
   }
}
