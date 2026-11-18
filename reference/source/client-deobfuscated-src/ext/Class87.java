package ext;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class Class87 extends Class459 {
   private Random field_2693 = new Random();
   public final float field_1170 = 512.0F;

   public void method_43(Class268 var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_2693.setSeed(187L);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(var8, 0.0F, 1.0F, 0.0F);
      GL11.glEnable(32826);
      this.method_1261("/art/kz.png");
      Enum710 var10 = var1.field_2296;
      float var11 = 0.0625F;
      GL11.glScalef(var11, var11, var11);
      this.method_1028(var1, var10.field_758, var10.field_1805, var10.field_646, var10.field_1175);
      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   private void method_1028(Class268 var1, int var2, int var3, int var4, int var5) {
      float var6 = -var2 / 2.0F;
      float var7 = -var3 / 2.0F;
      float var8 = -0.5F;
      float var9 = 0.5F;

      for (int var10 = 0; var10 < var2 / 16; var10++) {
         for (int var11 = 0; var11 < var3 / 16; var11++) {
            float var12 = var6 + (var10 + 1) * 16;
            float var13 = var6 + var10 * 16;
            float var14 = var7 + (var11 + 1) * 16;
            float var15 = var7 + var11 * 16;
            this.method_1688(var1, (var12 + var13) / 2.0F, (var14 + var15) / 2.0F);
            float var16 = (var4 + var2 - var10 * 16) / 512.0F;
            float var17 = (var4 + var2 - (var10 + 1) * 16) / 512.0F;
            float var18 = (var5 + var3 - var11 * 16) / 512.0F;
            float var19 = (var5 + var3 - (var11 + 1) * 16) / 512.0F;
            float var20 = 0.875F;
            float var21 = 0.90625F;
            float var22 = 0.0F;
            float var23 = 0.03125F;
            float var24 = 0.875F;
            float var25 = 0.90625F;
            float var26 = 9.765625E-4F;
            float var27 = 9.765625E-4F;
            float var28 = 0.87597656F;
            float var29 = 0.87597656F;
            float var30 = 0.0F;
            float var31 = 0.03125F;
            Class368 var32 = Class368.field_2696;
            var32.method_186();
            var32.method_548(0.0F, 0.0F, -1.0F);
            var32.method_318(var12, var15, var8, var17, var18);
            var32.method_318(var13, var15, var8, var16, var18);
            var32.method_318(var13, var14, var8, var16, var19);
            var32.method_318(var12, var14, var8, var17, var19);
            var32.method_548(0.0F, 0.0F, 1.0F);
            var32.method_318(var12, var14, var9, var20, var22);
            var32.method_318(var13, var14, var9, var21, var22);
            var32.method_318(var13, var15, var9, var21, var23);
            var32.method_318(var12, var15, var9, var20, var23);
            var32.method_548(0.0F, -1.0F, 0.0F);
            var32.method_318(var12, var14, var8, var24, var26);
            var32.method_318(var13, var14, var8, var25, var26);
            var32.method_318(var13, var14, var9, var25, var27);
            var32.method_318(var12, var14, var9, var24, var27);
            var32.method_548(0.0F, 1.0F, 0.0F);
            var32.method_318(var12, var15, var9, var24, var26);
            var32.method_318(var13, var15, var9, var25, var26);
            var32.method_318(var13, var15, var8, var25, var27);
            var32.method_318(var12, var15, var8, var24, var27);
            var32.method_548(-1.0F, 0.0F, 0.0F);
            var32.method_318(var12, var14, var9, var29, var30);
            var32.method_318(var12, var15, var9, var29, var31);
            var32.method_318(var12, var15, var8, var28, var31);
            var32.method_318(var12, var14, var8, var28, var30);
            var32.method_548(1.0F, 0.0F, 0.0F);
            var32.method_318(var13, var14, var8, var29, var30);
            var32.method_318(var13, var15, var8, var29, var31);
            var32.method_318(var13, var15, var9, var28, var31);
            var32.method_318(var13, var14, var9, var28, var30);
            var32.method_406();
         }
      }
   }

   private void method_1688(Class268 var1, float var2, float var3) {
      int var4 = Class469.method_468(var1.field_1417);
      int var5 = Class469.method_468(var1.field_2654 + var3 / 16.0F);
      int var6 = Class469.method_468(var1.field_2013);
      if (var1.field_997 == 0) {
         var4 = Class469.method_468(var1.field_1417 + var2 / 16.0F);
      }

      if (var1.field_997 == 1) {
         var6 = Class469.method_468(var1.field_2013 - var2 / 16.0F);
      }

      if (var1.field_997 == 2) {
         var4 = Class469.method_468(var1.field_1417 - var2 / 16.0F);
      }

      if (var1.field_997 == 3) {
         var6 = Class469.method_468(var1.field_2013 + var2 / 16.0F);
      }

      float var7 = this.field_40.field_2143.method_1154(var4, var5, var6);
      GL11.glColor3f(var7, var7, var7);
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_43((Class268)var1, var2, var4, var6, var8, var9);
   }
}
