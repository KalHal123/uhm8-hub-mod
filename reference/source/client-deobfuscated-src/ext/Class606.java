package ext;

import org.lwjgl.opengl.GL11;

public class Class606 extends Class459 {
   protected Class110 field_2796;

   public Class606() {
      this.field_859 = 0.5F;
      this.field_2796 = new Class309();
   }

   public void method_365(Class527 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      double var10 = var1.field_2173 + (var1.field_1417 - var1.field_2173) * var9;
      double var12 = var1.field_2270 + (var1.field_2654 - var1.field_2270) * var9;
      double var14 = var1.field_1907 + (var1.field_2013 - var1.field_1907) * var9;
      double var16 = 0.3F;
      Class214 var18 = var1.method_612(var10, var12, var14);
      float var19 = var1.field_2984 + (var1.field_2866 - var1.field_2984) * var9;
      if (var18 != null) {
         Class214 var20 = var1.method_1118(var10, var12, var14, var16);
         Class214 var21 = var1.method_1118(var10, var12, var14, -var16);
         if (var20 == null) {
            var20 = var18;
         }

         if (var21 == null) {
            var21 = var18;
         }

         var2 += var18.field_882 - var10;
         var4 += (var20.field_1911 + var21.field_1911) / 2.0 - var12;
         var6 += var18.field_3045 - var14;
         Class214 var22 = var21.method_1750(-var20.field_882, -var20.field_1911, -var20.field_3045);
         if (var22.method_1891() != 0.0) {
            var22 = var22.method_341();
            var8 = (float)(Math.atan2(var22.field_3045, var22.field_882) * 180.0 / Math.PI);
            var19 = (float)(Math.atan(var22.field_1911) * 73.0);
         }
      }

      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var19, 0.0F, 0.0F, 1.0F);
      float var23 = var1.field_346 - var9;
      float var24 = var1.field_671 - var9;
      if (var24 < 0.0F) {
         var24 = 0.0F;
      }

      if (var23 > 0.0F) {
         GL11.glRotatef(Class469.method_1667(var23) * var23 * var24 / 10.0F * var1.field_1567, 1.0F, 0.0F, 0.0F);
      }

      if (var1.field_1840 != 0) {
         this.method_1261(Class614.method_1576(Class614.field_1949));
         float var26 = 0.75F;
         GL11.glScalef(var26, var26, var26);
         GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         if (var1.field_1840 == 1) {
            new Class714().method_234(Class108.field_93);
         } else if (var1.field_1840 == 2) {
            new Class714().method_234(Class108.field_2604);
         }

         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.3125F, 0.0F);
         GL11.glScalef(1.0F / var26, 1.0F / var26, 1.0F / var26);
      }

      this.method_1261("/item/cart.png");
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      this.field_2796.method_837(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_365((Class527)var1, var2, var4, var6, var8, var9);
   }
}
