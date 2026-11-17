package ext;

import org.lwjgl.opengl.GL11;

public class Class695 extends Class591 {
   private Class110 field_2880;

   public Class695(Class110 var1, Class110 var2, float var3) {
      super(var1, var3);
      this.field_2880 = var2;
   }

   protected boolean method_224(Class713 var1, int var2) {
      if (var2 == 0) {
         this.method_1734(this.field_2880);
         GL11.glEnable(2977);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         return true;
      }

      if (var2 == 1) {
         GL11.glDisable(3042);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }

      return false;
   }

   protected void method_1292(Class713 var1, float var2) {
      float var3 = (var1.field_697 + (var1.field_2375 - var1.field_697) * var2) / (var1.field_700 * 0.5F + 1.0F);
      float var4 = 1.0F / (var3 + 1.0F);
      float var5 = var1.field_700;
      GL11.glScalef(var4 * var5, 1.0F / var4 * var5, var4 * var5);
   }

   @Override
   protected void method_1224(Class377 var1, float var2) {
      this.method_1292((Class713)var1, var2);
   }

   @Override
   protected boolean method_882(Class377 var1, int var2) {
      return this.method_224((Class713)var1, var2);
   }
}
