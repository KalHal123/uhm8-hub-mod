package ext;

import org.lwjgl.opengl.GL11;

public class Class591 extends Class459 {
   protected Class110 field_2329;
   protected Class110 field_1764;

   public Class591(Class110 var1, float var2) {
      this.field_2329 = var1;
      this.field_859 = var2;
   }

   public void method_1734(Class110 var1) {
      this.field_1764 = var1;
   }

   public void method_1197(Class377 var1) {
   }

   public float method_1487(float var1) {
      float var2 = var1 * 1.6F;
      var2 = Class469.method_254(var2);
      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      return var2;
   }

   public float method_1304(Class377 var1, float var2) {
      return var1.field_1747 - var1.field_937 * (1.0F - var2);
   }

   public void method_1861(Class377 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      this.field_2329.field_1345 = this.method_1540(var1, var9);
      this.field_2329.field_441 = var1.field_2322 != null;
      if (this.field_1764 != null) {
         this.field_1764.field_441 = this.field_2329.field_441;
      }

      try {
         float var10 = var1.field_616 + (var1.field_1113 - var1.field_616) * var9;
         float var11 = var1.field_2772 + (var1.field_1661 - var1.field_2772) * var9;
         float var12 = var1.field_2984 + (var1.field_2866 - var1.field_2984) * var9;
         GL11.glTranslatef((float)var2, (float)var4, (float)var6);
         float var13 = this.method_176(var1, var9);
         GL11.glRotatef(180.0F - var10, 0.0F, 1.0F, 0.0F);
         this.method_1197(var1);
         if (var1.field_567 > 0) {
            float var14 = (var1.field_567 + var9 - 1.0F) / 20.0F * 1.6F;
            var14 = Class469.method_254(var14);
            if (var14 > 1.0F) {
               var14 = 1.0F;
            }

            GL11.glRotatef(var14 * this.method_1069(var1), 0.0F, 0.0F, 1.0F);
         }

         float var27 = 0.0625F;
         GL11.glEnable(32826);
         GL11.glScalef(-1.0F, -1.0F, 1.0F);
         this.method_1224(var1, var9);
         GL11.glTranslatef(0.0F, -24.0F * var27 - 0.0078125F, 0.0F);
         float var15 = this.method_1776(var1, var9);
         float var16 = this.method_1304(var1, var9);
         if (var15 > 1.0F) {
            var15 = 1.0F;
         }

         Class736 var17 = this.method_1683(var1.field_1795, var1.method_431());
         if (var1 instanceof Class354) {
            ((Class354)var1).field_3 = var17;
         }

         GL11.glEnable(3008);
         if (var1 instanceof Class136 && var1.field_1468 instanceof Class262) {
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.4F);
         }

         this.field_2329.method_837(var16, var15, var13, var11 - var10, var12, var27);

         for (int var18 = 0; var18 < 4; var18++) {
            if (this.method_882(var1, var18)) {
               this.field_1764.method_837(var16, var15, var13, var11 - var10, var12, var27);
               GL11.glDisable(3042);
               GL11.glEnable(3008);
            }
         }

         this.method_567(var1, var9);
         float var28 = var1.method_50(var9);
         int var19 = this.method_678(var1, var28, var9);
         if ((var19 >> 24 & 0xFF) > 0 || var1.field_2148 > 0 || var1.field_567 > 0) {
            GL11.glDisable(3553);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glDepthFunc(514);
            if (var1.field_2148 > 0 || var1.field_567 > 0) {
               GL11.glColor4f(var28, 0.0F, 0.0F, 0.4F);
               this.field_2329.method_837(var16, var15, var13, var11 - var10, var12, var27);

               for (int var20 = 0; var20 < 4; var20++) {
                  if (this.method_882(var1, var20)) {
                     GL11.glColor4f(var28, 0.0F, 0.0F, 0.4F);
                     this.field_1764.method_837(var16, var15, var13, var11 - var10, var12, var27);
                  }
               }
            }

            if ((var19 >> 24 & 0xFF) > 0) {
               float var29 = (var19 >> 16 & 0xFF) / 255.0F;
               float var21 = (var19 >> 8 & 0xFF) / 255.0F;
               float var22 = (var19 & 0xFF) / 255.0F;
               float var23 = (var19 >> 24 & 0xFF) / 255.0F;
               GL11.glColor4f(var29, var21, var22, var23);
               this.field_2329.method_837(var16, var15, var13, var11 - var10, var12, var27);

               for (int var24 = 0; var24 < 4; var24++) {
                  if (this.method_882(var1, var24)) {
                     GL11.glColor4f(var29, var21, var22, var23);
                     this.field_1764.method_837(var16, var15, var13, var11 - var10, var12, var27);
                  }
               }
            }

            GL11.glDepthFunc(515);
            GL11.glDisable(3042);
            GL11.glEnable(3008);
            GL11.glEnable(3553);
         }

         GL11.glDisable(32826);
      } catch (Exception var25) {
         var25.printStackTrace();
      }

      GL11.glEnable(2884);
      GL11.glPopMatrix();
   }

   public float method_1776(Class377 var1, float var2) {
      return var1.field_2980 + (var1.field_937 - var1.field_2980) * var2;
   }

   protected float method_1540(Class377 var1, float var2) {
      return var1.method_1848(var2);
   }

   protected float method_176(Class377 var1, float var2) {
      return var1.field_1399 + var2;
   }

   protected void method_567(Class377 var1, float var2) {
   }

   protected boolean method_882(Class377 var1, int var2) {
      return false;
   }

   protected float method_1069(Class377 var1) {
      return 90.0F;
   }

   protected int method_678(Class377 var1, float var2, float var3) {
      return 0;
   }

   protected void method_1224(Class377 var1, float var2) {
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_1861((Class377)var1, var2, var4, var6, var8, var9);
   }
}
