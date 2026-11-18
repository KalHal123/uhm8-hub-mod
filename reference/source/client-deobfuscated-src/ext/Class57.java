package ext;

import org.lwjgl.opengl.GL11;

public class Class57 extends Class459 {
   private Class714 field_2210 = new Class714();

   public Class57() {
      this.field_859 = 0.5F;
   }

   public void method_490(Class435 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      if (var1.field_386 - var9 + 1.0F < 10.0F) {
         float var10 = 1.0F - (var1.field_386 - var9 + 1.0F) / 10.0F;
         if (var10 < 0.0F) {
            var10 = 0.0F;
         }

         if (var10 > 1.0F) {
            var10 = 1.0F;
         }

         var10 *= var10;
         var10 *= var10;
         float var11 = 1.0F + var10 * 0.3F;
         GL11.glScalef(var11, var11, var11);
      }

      float var14 = (1.0F - (var1.field_386 - var9 + 1.0F) / 100.0F) * 0.8F;
      this.method_1261(Class614.method_1576(Class614.field_1949));
      this.field_2210.method_234(Class108.field_2872);
      if (var1.field_386 / 5 % 2 == 0) {
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 772);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var14);
         this.field_2210.method_234(Class108.field_2872);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(2896);
         GL11.glEnable(3553);
      }

      GL11.glPopMatrix();
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_490((Class435)var1, var2, var4, var6, var8, var9);
   }
}
