package ext;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

public final class Minecraft43 extends Minecraft {
   final Frame field_1247;

   public Minecraft43(Component var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6, Frame var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_1247 = var7;
      field_1737 = this;
   }

   @Override
   public void method_869(Class655 var1) {
      this.field_1247.removeAll();
      this.field_1247.add(new Panel739(var1), "Center");
      this.field_1247.validate();
   }
}
