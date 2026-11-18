package ext;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class Class206 extends Class600 {
   private Map<String, Class359> field_2084 = new HashMap<>();

   public void method_951(Class529 var1, double var2, double var4, double var6, float var8) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      Class359 var9 = this.field_2084.get(var1.field_34);
      if (var9 == null) {
         var9 = Class174.method_1826(var1.field_34, (Class454)null);
         this.field_2084.put(var1.field_34, var9);
      }

      if (var9 != null) {
         var9.method_712(var1.field_1380);
         float var10 = 0.4375F;
         GL11.glTranslatef(0.0F, 0.4F, 0.0F);
         GL11.glRotatef((float)(var1.field_3146 + (var1.field_2630 - var1.field_3146) * var8) * 10.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.4F, 0.0F);
         GL11.glScalef(var10, var10, var10);
         var9.method_253(var2, var4, var6, 0.0F, 0.0F);
         Class531.field_759.method_521(var9, 0.0, 0.0, 0.0, 0.0F, var8);
      }

      GL11.glPopMatrix();
   }

   @Override
   public void method_945(Class186 var1, double var2, double var4, double var6, float var8) {
      this.method_951((Class529)var1, var2, var4, var6, var8);
   }
}
