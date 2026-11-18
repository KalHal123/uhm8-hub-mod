package ext;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

public class Minecraft84 extends Minecraft {
   final MinecraftApplet field_3113;

   public Minecraft84(MinecraftApplet var1, Component var2, Canvas var3, MinecraftApplet var4, int var5, int var6, boolean var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_3113 = var1;
   }

   @Override
   public void method_869(Class655 var1) {
      this.field_3113.removeAll();
      this.field_3113.setLayout(new BorderLayout());
      this.field_3113.add(new Panel739(var1), "Center");
      this.field_3113.validate();
   }
}
