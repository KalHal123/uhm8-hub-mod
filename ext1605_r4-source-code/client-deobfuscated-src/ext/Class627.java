package ext;

import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class627 extends Class459 {
   private Class714 field_2055 = new Class714();
   private Random field_100 = new Random();

   public Class627() {
      this.field_859 = 0.15F;
      this.field_204 = 0.75F;
   }

   public void method_1473(Class198 var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_100.setSeed(187L);
      Class334 var10 = var1.field_1296;
      GL11.glPushMatrix();
      float var11 = Class469.method_1667((var1.field_1457 + var9) / 10.0F + var1.field_2081) * 0.1F + 0.1F;
      float var12 = ((var1.field_1457 + var9) / 20.0F + var1.field_2081) * (180.0F / (float)Math.PI);
      byte var13 = 1;
      if (var1.field_1296.field_2326 > 1) {
         var13 = 2;
      }

      if (var1.field_1296.field_2326 > 5) {
         var13 = 3;
      }

      if (var1.field_1296.field_2326 > 20) {
         var13 = 4;
      }

      GL11.glTranslatef((float)var2, (float)var4 + var11, (float)var6);
      GL11.glEnable(32826);
      if (var10.field_1782 < 32767 && Class714.method_759(Class108.field_1221[var10.field_1782].method_1900())) {
         GL11.glRotatef(var12, 0.0F, 1.0F, 0.0F);
         this.method_1261(Minecraft.field_1094);
         float var30 = 0.25F;
         if (!Class108.field_1221[var10.field_1782].method_636() && var10.field_1782 != Class108.field_2252.field_2151) {
            var30 = 0.5F;
         }

         GL11.glScalef(var30, var30, var30);

         for (int var31 = 0; var31 < var13; var31++) {
            GL11.glPushMatrix();
            if (var31 > 0) {
               float var27 = (this.field_100.nextFloat() * 2.0F - 1.0F) * 0.2F / var30;
               float var28 = (this.field_100.nextFloat() * 2.0F - 1.0F) * 0.2F / var30;
               float var29 = (this.field_100.nextFloat() * 2.0F - 1.0F) * 0.2F / var30;
               GL11.glTranslatef(var27, var28, var29);
            }

            this.field_2055.method_234(Class108.field_1221[var10.field_1782]);
            GL11.glPopMatrix();
         }
      } else {
         GL11.glScalef(0.5F, 0.5F, 0.5F);
         int var17 = var10.method_452();
         if (var10.field_1782 < 32767) {
            this.method_1261(Minecraft.field_1094);
         } else {
            this.method_1261("/gui/items.png");
         }

         Class368 var18 = Class368.field_2696;
         float var14 = (var17 % 16 * 16 + 0) / 256.0F;
         float var15 = (var17 % 16 * 16 + 16) / 256.0F;
         float var16 = (var17 / 16 * 16 + 0) / (var10.field_1782 < 32767 ? 512.0F : 256.0F);
         float var19 = (var17 / 16 * 16 + 16) / (var10.field_1782 < 32767 ? 512.0F : 256.0F);
         float var20 = 1.0F;
         float var21 = 0.5F;
         float var22 = 0.25F;

         for (int var23 = 0; var23 < var13; var23++) {
            GL11.glPushMatrix();
            if (var23 > 0) {
               float var24 = (this.field_100.nextFloat() * 2.0F - 1.0F) * 0.3F;
               float var25 = (this.field_100.nextFloat() * 2.0F - 1.0F) * 0.3F;
               float var26 = (this.field_100.nextFloat() * 2.0F - 1.0F) * 0.3F;
               GL11.glTranslatef(var24, var25, var26);
            }

            GL11.glRotatef(180.0F - this.field_40.field_376, 0.0F, 1.0F, 0.0F);
            var18.method_186();
            var18.method_548(0.0F, 1.0F, 0.0F);
            var18.method_318(0.0F - var21, 0.0F - var22, 0.0, var14, var19);
            var18.method_318(var20 - var21, 0.0F - var22, 0.0, var15, var19);
            var18.method_318(var20 - var21, 1.0F - var22, 0.0, var15, var16);
            var18.method_318(0.0F - var21, 1.0F - var22, 0.0, var14, var16);
            var18.method_406();
            GL11.glPopMatrix();
         }
      }

      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   public void method_1104(Class640 var1, Class432 var2, Class334 var3, int var4, int var5) {
      if (var3 != null) {
         if (var3.field_1782 < 32767 && Class714.method_759(Class108.field_1221[var3.field_1782].method_1900())) {
            int var6 = var3.field_1782;
            var2.method_462(var2.method_1545(Minecraft.field_1094));
            Class108 var7 = Class108.field_1221[var6];
            GL11.glPushMatrix();
            GL11.glTranslatef(var4 - 2, var5 + 3, 0.0F);
            GL11.glScalef(10.0F, 10.0F, 10.0F);
            GL11.glTranslatef(1.0F, 0.5F, 8.0F);
            GL11.glRotatef(210.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            this.field_2055.method_234(var7);
            GL11.glPopMatrix();
         } else if (var3.method_452() >= 0) {
            GL11.glDisable(2896);
            if (var3.field_1782 < 32767) {
               var2.method_462(var2.method_1545(Minecraft.field_1094));
            } else {
               var2.method_462(var2.method_1545("/gui/items.png"));
            }

            this.method_1462(var4, var5, var3.method_452() % 16 * 16, var3.method_452() / 16 * 16, 16, 16, var3.field_1782 < 32767);
            GL11.glEnable(2896);
         }

         GL11.glEnable(2884);
      }
   }

   public void method_1758(Class640 var1, Class432 var2, Class334 var3, int var4, int var5) {
      if (var3 != null) {
         if (var3.field_2326 > 1) {
            String var6 = "" + var3.field_2326;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            var1.method_1444(var6, var4 + 19 - 2 - var1.method_962(var6), var5 + 6 + 3, 16777215);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }

         if (var3.field_1862 > 0) {
            int var11 = 13 - var3.field_1862 * 13 / var3.method_1365();
            int var7 = 255 - var3.field_1862 * 255 / var3.method_1365();
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            Class368 var8 = Class368.field_2696;
            int var9 = 255 - var7 << 16 | var7 << 8;
            int var10 = (255 - var7) / 4 << 16 | 16128;
            this.method_1779(var8, var4 + 2, var5 + 13, 13, 2, 0);
            this.method_1779(var8, var4 + 2, var5 + 13, 12, 1, var10);
            this.method_1779(var8, var4 + 2, var5 + 13, var11, 1, var9);
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }
   }

   private void method_1779(Class368 var1, int var2, int var3, int var4, int var5, int var6) {
      var1.method_186();
      var1.method_1748(var6);
      var1.method_1724(var2 + 0, var3 + 0, 0.0);
      var1.method_1724(var2 + 0, var3 + var5, 0.0);
      var1.method_1724(var2 + var4, var3 + var5, 0.0);
      var1.method_1724(var2 + var4, var3 + 0, 0.0);
      var1.method_406();
   }

   public void method_1462(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      float var8 = 0.0F;
      float var9 = 0.00390625F;
      float var10 = 1.0F / (var7 ? 512.0F : 256.0F);
      Class368 var11 = Class368.field_2696;
      var11.method_1284(true);
      var11.method_318(var1 + 0, var2 + var6, var8, (var3 + 0) * var9, (var4 + var6) * var10);
      var11.method_318(var1 + var5, var2 + var6, var8, (var3 + var5) * var9, (var4 + var6) * var10);
      var11.method_318(var1 + var5, var2 + 0, var8, (var3 + var5) * var9, (var4 + 0) * var10);
      var11.method_318(var1 + 0, var2 + 0, var8, (var3 + 0) * var9, (var4 + 0) * var10);
      var11.method_406();
   }

   @Override
   public void method_524(Class359 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_1473((Class198)var1, var2, var4, var6, var8, var9);
   }
}
