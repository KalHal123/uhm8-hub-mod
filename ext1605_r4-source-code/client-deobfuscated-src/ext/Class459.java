package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public abstract class Class459 {
   protected Class531 field_40;
   private Class110 field_2509 = new Class567();
   private Class714 field_1497 = new Class714();
   protected float field_859 = 0.0F;
   protected float field_204 = 1.0F;

   public abstract void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9);

   protected void method_1261(String var1) {
      Class432 var2 = this.field_40.field_1814;
      var2.method_462(var2.method_1545(var1));
   }

   protected Class736 method_1683(String var1, String var2) {
      Class432 var3 = this.field_40.field_1814;
      Class736 var4 = var3.method_268(var1, var2);
      var3.method_462(var4.field_846);
      return var4;
   }

   private void method_1299(Class359 var1, double var2, double var4, double var6, float var8) {
      GL11.glDisable(2896);
      int var9 = Class108.field_1781.field_2972;
      int var10 = (var9 & 15) << 4;
      int var11 = var9 & 4080;
      float var12 = var10 / 256.0F;
      float var13 = (var10 + 15.99F) / 256.0F;
      float var14 = var11 / 512.0F;
      float var15 = (var11 + 15.99F) / 512.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var16 = var1.field_811 * 1.4F;
      GL11.glScalef(var16, var16, var16);
      this.method_1261(Minecraft.field_1094);
      Class368 var17 = Class368.field_2696;
      float var18 = 1.0F;
      float var19 = 0.5F;
      float var20 = 0.0F;
      float var21 = var1.field_1443 / var1.field_811;
      GL11.glRotatef(-this.field_40.field_376, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.4F + (int)var21 * 0.02F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var17.method_186();

      while (var21 > 0.0F) {
         var17.method_318(var18 - var19, 0.0F - var20, 0.0, var13, var15);
         var17.method_318(0.0F - var19, 0.0F - var20, 0.0, var12, var15);
         var17.method_318(0.0F - var19, 1.4F - var20, 0.0, var12, var14);
         var17.method_318(var18 - var19, 1.4F - var20, 0.0, var13, var14);
         var21--;
         var20--;
         var18 *= 0.9F;
         GL11.glTranslatef(0.0F, 0.0F, -0.04F);
      }

      var17.method_406();
      GL11.glPopMatrix();
      GL11.glEnable(2896);
   }

   private void method_380(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      Class432 var10 = this.field_40.field_1814;
      var10.method_462(var10.method_1545("%%/shadow.png"));
      Class454 var11 = this.method_665();
      GL11.glDepthMask(false);
      float var12 = this.field_859;
      double var13 = var1.field_2173 + (var1.field_1417 - var1.field_2173) * var9;
      double var15 = var1.field_2270 + (var1.field_2654 - var1.field_2270) * var9 + var1.method_1140();
      double var17 = var1.field_1907 + (var1.field_2013 - var1.field_1907) * var9;
      int var19 = Class469.method_468(var13 - var12);
      int var20 = Class469.method_468(var13 + var12);
      int var21 = Class469.method_468(var15 - var12);
      int var22 = Class469.method_468(var15);
      int var23 = Class469.method_468(var17 - var12);
      int var24 = Class469.method_468(var17 + var12);
      double var25 = var2 - var13;
      double var27 = var4 - var15;
      double var29 = var6 - var17;
      Class368 var31 = Class368.field_2696;
      var31.method_186();

      for (int var32 = var19; var32 <= var20; var32++) {
         for (int var33 = var21; var33 <= var22; var33++) {
            for (int var34 = var23; var34 <= var24; var34++) {
               int var35 = var11.method_197(var32, var33 - 1, var34);
               if (var35 > 0 && var11.method_1676(var32, var33, var34) > 3) {
                  this.method_649(
                     Class108.field_1221[var35],
                     var2,
                     var4 + var1.method_1140(),
                     var6,
                     var32,
                     var33,
                     var34,
                     var8,
                     var12,
                     var25,
                     var27 + var1.method_1140(),
                     var29
                  );
               }
            }
         }
      }

      var31.method_406();
      GL11.glColor4f(0.4F, 0.8F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glDepthMask(true);
   }

   private Class454 method_665() {
      return this.field_40.field_2143;
   }

   private void method_649(
      Class108 var1, double var2, double var4, double var6, int var8, int var9, int var10, float var11, float var12, double var13, double var15, double var17
   ) {
      Class368 var19 = Class368.field_2696;
      if (var1.method_636()) {
         double var20 = (var11 - (var4 - (var9 + var15)) / 2.0) * 0.5 * this.method_665().method_1154(var8, var9, var10);
         if (var20 >= 0.0) {
            if (var20 > 1.0) {
               var20 = 1.0;
            }

            var19.method_1120(0.4F, 0.8F, 1.0F, (float)var20);
            double var22 = var8 + var1.field_1757 + var13;
            double var24 = var8 + var1.field_1078 + var13;
            double var26 = var9 + var1.field_2905 + var15 + 0.015625;
            double var28 = var10 + var1.field_1459 + var17;
            double var30 = var10 + var1.field_1426 + var17;
            float var32 = (float)((var2 - var22) / 2.0 / var12 + 0.5);
            float var33 = (float)((var2 - var24) / 2.0 / var12 + 0.5);
            float var34 = (float)((var6 - var28) / 2.0 / var12 + 0.5);
            float var35 = (float)((var6 - var30) / 2.0 / var12 + 0.5);
            var19.method_318(var22, var26, var28, var32, var34);
            var19.method_318(var22, var26, var30, var32, var35);
            var19.method_318(var24, var26, var30, var33, var35);
            var19.method_318(var24, var26, var28, var33, var34);
         }
      }
   }

   public static void method_902(Class630 var0, double var1, double var3, double var5) {
      GL11.glDisable(3553);
      Class368 var7 = Class368.field_2696;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var7.method_186();
      var7.method_387(var1, var3, var5);
      var7.method_548(0.0F, 0.0F, -1.0F);
      var7.method_1724(var0.field_2118, var0.field_3132, var0.field_1714);
      var7.method_1724(var0.field_1702, var0.field_3132, var0.field_1714);
      var7.method_1724(var0.field_1702, var0.field_946, var0.field_1714);
      var7.method_1724(var0.field_2118, var0.field_946, var0.field_1714);
      var7.method_548(0.0F, 0.0F, 1.0F);
      var7.method_1724(var0.field_2118, var0.field_946, var0.field_858);
      var7.method_1724(var0.field_1702, var0.field_946, var0.field_858);
      var7.method_1724(var0.field_1702, var0.field_3132, var0.field_858);
      var7.method_1724(var0.field_2118, var0.field_3132, var0.field_858);
      var7.method_548(0.0F, -1.0F, 0.0F);
      var7.method_1724(var0.field_2118, var0.field_946, var0.field_1714);
      var7.method_1724(var0.field_1702, var0.field_946, var0.field_1714);
      var7.method_1724(var0.field_1702, var0.field_946, var0.field_858);
      var7.method_1724(var0.field_2118, var0.field_946, var0.field_858);
      var7.method_548(0.0F, 1.0F, 0.0F);
      var7.method_1724(var0.field_2118, var0.field_3132, var0.field_858);
      var7.method_1724(var0.field_1702, var0.field_3132, var0.field_858);
      var7.method_1724(var0.field_1702, var0.field_3132, var0.field_1714);
      var7.method_1724(var0.field_2118, var0.field_3132, var0.field_1714);
      var7.method_548(-1.0F, 0.0F, 0.0F);
      var7.method_1724(var0.field_2118, var0.field_946, var0.field_858);
      var7.method_1724(var0.field_2118, var0.field_3132, var0.field_858);
      var7.method_1724(var0.field_2118, var0.field_3132, var0.field_1714);
      var7.method_1724(var0.field_2118, var0.field_946, var0.field_1714);
      var7.method_548(1.0F, 0.0F, 0.0F);
      var7.method_1724(var0.field_1702, var0.field_946, var0.field_1714);
      var7.method_1724(var0.field_1702, var0.field_3132, var0.field_1714);
      var7.method_1724(var0.field_1702, var0.field_3132, var0.field_858);
      var7.method_1724(var0.field_1702, var0.field_946, var0.field_858);
      var7.method_387(0.0, 0.0, 0.0);
      var7.method_406();
      GL11.glEnable(3553);
   }

   public static void method_1634(Class630 var0) {
      Class368 var1 = Class368.field_2696;
      var1.method_186();
      var1.method_1724(var0.field_2118, var0.field_3132, var0.field_1714);
      var1.method_1724(var0.field_1702, var0.field_3132, var0.field_1714);
      var1.method_1724(var0.field_1702, var0.field_946, var0.field_1714);
      var1.method_1724(var0.field_2118, var0.field_946, var0.field_1714);
      var1.method_1724(var0.field_2118, var0.field_946, var0.field_858);
      var1.method_1724(var0.field_1702, var0.field_946, var0.field_858);
      var1.method_1724(var0.field_1702, var0.field_3132, var0.field_858);
      var1.method_1724(var0.field_2118, var0.field_3132, var0.field_858);
      var1.method_1724(var0.field_2118, var0.field_946, var0.field_1714);
      var1.method_1724(var0.field_1702, var0.field_946, var0.field_1714);
      var1.method_1724(var0.field_1702, var0.field_946, var0.field_858);
      var1.method_1724(var0.field_2118, var0.field_946, var0.field_858);
      var1.method_1724(var0.field_2118, var0.field_3132, var0.field_858);
      var1.method_1724(var0.field_1702, var0.field_3132, var0.field_858);
      var1.method_1724(var0.field_1702, var0.field_3132, var0.field_1714);
      var1.method_1724(var0.field_2118, var0.field_3132, var0.field_1714);
      var1.method_1724(var0.field_2118, var0.field_946, var0.field_858);
      var1.method_1724(var0.field_2118, var0.field_3132, var0.field_858);
      var1.method_1724(var0.field_2118, var0.field_3132, var0.field_1714);
      var1.method_1724(var0.field_2118, var0.field_946, var0.field_1714);
      var1.method_1724(var0.field_1702, var0.field_946, var0.field_1714);
      var1.method_1724(var0.field_1702, var0.field_3132, var0.field_1714);
      var1.method_1724(var0.field_1702, var0.field_3132, var0.field_858);
      var1.method_1724(var0.field_1702, var0.field_946, var0.field_858);
      var1.method_406();
   }

   public void method_1926(Class531 var1) {
      this.field_40 = var1;
   }

   public void method_1360(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      if (this.field_40.field_17.field_674 == 1 && this.field_859 > 0.0F) {
         double var10 = this.field_40.method_381(var1.field_1417, var1.field_2654, var1.field_2013);
         float var12 = (float)((1.0 - var10 / 256.0) * this.field_204);
         if (var12 > 0.0F) {
            this.method_380(var1, var2, var4, var6, var12, var9);
         }
      }

      if (var1.field_1439 > 0) {
         this.method_1299(var1, var2, var4, var6, var9);
      }
   }

   public Class640 method_1690() {
      return this.field_40.method_831();
   }
}
