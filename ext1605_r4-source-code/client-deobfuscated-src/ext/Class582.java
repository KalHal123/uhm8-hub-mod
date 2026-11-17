package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class582 extends Class411 {
   public Class582(Minecraft var1, Class432 var2) {
      super(var1, var2);
   }

   @Override
   public void method_1179(float var1) {
      if (!(Class119.field_1519.field_2648 instanceof Class581)) {
         super.method_1179(var1);
      } else {
         int var2 = this.field_860.method_1545("/terrain/hub_parallax3.png");
         Class368 var3 = Class368.field_2696;
         float var4 = 100.0F;
         GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
         GL11.glBindTexture(3553, var2);
         var3.method_186();
         var3.method_318(-var4, 100.0, -var4, 0.0, 0.0);
         var3.method_318(var4, 100.0, -var4, 1.0, 0.0);
         var3.method_318(var4, 100.0, var4, 1.0, 1.0);
         var3.method_318(-var4, 100.0, var4, 0.0, 1.0);
         var3.method_406();
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         var3.method_186();
         var3.method_318(-var4, 100.0, -var4, 0.0, 0.0);
         var3.method_318(var4, 100.0, -var4, 1.0, 0.0);
         var3.method_318(var4, 100.0, var4, 1.0, 1.0);
         var3.method_318(-var4, 100.0, var4, 0.0, 1.0);
         var3.method_406();
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         var3.method_186();
         var3.method_318(-var4, 100.0, -var4, 0.0, 0.0);
         var3.method_318(var4, 100.0, -var4, 1.0, 0.0);
         var3.method_318(var4, 100.0, var4, 1.0, 1.0);
         var3.method_318(-var4, 100.0, var4, 0.0, 1.0);
         var3.method_406();
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         var3.method_186();
         var3.method_318(-var4, 100.0, -var4, 0.0, 0.0);
         var3.method_318(var4, 100.0, -var4, 1.0, 0.0);
         var3.method_318(var4, 100.0, var4, 1.0, 1.0);
         var3.method_318(-var4, 100.0, var4, 0.0, 1.0);
         var3.method_406();
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         var3.method_186();
         var3.method_318(-var4, 100.0, -var4, 0.0, 0.0);
         var3.method_318(var4, 100.0, -var4, 1.0, 0.0);
         var3.method_318(var4, 100.0, var4, 1.0, 1.0);
         var3.method_318(-var4, 100.0, var4, 0.0, 1.0);
         var3.method_406();
         GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         var3.method_186();
         var3.method_318(-var4, 100.0, -var4, 0.0, 0.0);
         var3.method_318(var4, 100.0, -var4, 1.0, 0.0);
         var3.method_318(var4, 100.0, var4, 1.0, 1.0);
         var3.method_318(-var4, 100.0, var4, 0.0, 1.0);
         var3.method_406();
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      }
   }

   @Override
   public void method_516(float var1) {
      if (!(Class119.field_1519.field_2648 instanceof Class581)) {
         super.method_516(var1);
      }
   }

   @Override
   public void method_377(float var1) {
      if (!(Class119.field_1519.field_2648 instanceof Class581)) {
         super.method_377(var1);
      }
   }

   @Override
   public void method_700() {
      if (!(Class119.field_1519.field_2648 instanceof Class581)) {
         super.method_700();
      }
   }
}
