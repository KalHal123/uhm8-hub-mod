package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class703 {
   private Minecraft field_1565;
   private Class334 field_677 = null;
   private float field_2845 = 0.0F;
   private float field_655 = 0.0F;
   private Class714 field_1937 = new Class714();

   public Class703(Minecraft var1) {
      this.field_1565 = var1;
   }

   public void method_1178(Class334 var1) {
      GL11.glPushMatrix();
      if (var1.field_1782 < 32767 && Class714.method_759(Class108.field_1221[var1.field_1782].method_1900())) {
         GL11.glBindTexture(3553, this.field_1565.field_2176.method_1545(Minecraft.field_1094));
         this.field_1937.method_234(Class108.field_1221[var1.field_1782]);
      } else {
         if (var1.field_1782 < 32767) {
            GL11.glBindTexture(3553, this.field_1565.field_2176.method_1545(Minecraft.field_1094));
         } else {
            GL11.glBindTexture(3553, this.field_1565.field_2176.method_1545("/gui/items.png"));
         }

         Class368 var2 = Class368.field_2696;
         float var3 = (var1.method_452() % 16 * 16 + 0) / 256.0F;
         float var4 = (var1.method_452() % 16 * 16 + 16) / 256.0F;
         float var5 = (var1.method_452() / 16 * 16 + 0) / (var1.field_1782 < 32767 ? 512.0F : 256.0F);
         float var6 = (var1.method_452() / 16 * 16 + 16) / (var1.field_1782 < 32767 ? 512.0F : 256.0F);
         float var7 = 1.0F;
         float var8 = 0.0F;
         float var9 = 0.3F;
         GL11.glEnable(32826);
         GL11.glTranslatef(-var8, -var9, 0.0F);
         float var10 = 1.5F;
         GL11.glScalef(var10, var10, var10);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         float var11 = 0.0625F;
         var2.method_1284(true);
         var2.method_548(0.0F, 0.0F, 1.0F);
         var2.method_318(0.0, 0.0, 0.0, var4, var6);
         var2.method_318(var7, 0.0, 0.0, var3, var6);
         var2.method_318(var7, 1.0, 0.0, var3, var5);
         var2.method_318(0.0, 1.0, 0.0, var4, var5);
         var2.method_406();
         var2.method_1284(true);
         var2.method_548(0.0F, 0.0F, -1.0F);
         var2.method_318(0.0, 1.0, 0.0F - var11, var4, var5);
         var2.method_318(var7, 1.0, 0.0F - var11, var3, var5);
         var2.method_318(var7, 0.0, 0.0F - var11, var3, var6);
         var2.method_318(0.0, 0.0, 0.0F - var11, var4, var6);
         var2.method_406();
         var2.method_1284(true);
         var2.method_548(-1.0F, 0.0F, 0.0F);

         for (int var12 = 0; var12 < 16; var12++) {
            float var13 = var12 / 16.0F;
            float var14 = var4 + (var3 - var4) * var13 - 0.001953125F;
            float var15 = var7 * var13;
            var2.method_318(var15, 0.0, 0.0F - var11, var14, var6);
            var2.method_318(var15, 0.0, 0.0, var14, var6);
            var2.method_318(var15, 1.0, 0.0, var14, var5);
            var2.method_318(var15, 1.0, 0.0F - var11, var14, var5);
         }

         var2.method_406();
         var2.method_1284(true);
         var2.method_548(1.0F, 0.0F, 0.0F);

         for (int var16 = 0; var16 < 16; var16++) {
            float var19 = var16 / 16.0F;
            float var22 = var4 + (var3 - var4) * var19 - 0.001953125F;
            float var25 = var7 * var19 + 0.0625F;
            var2.method_318(var25, 1.0, 0.0F - var11, var22, var5);
            var2.method_318(var25, 1.0, 0.0, var22, var5);
            var2.method_318(var25, 0.0, 0.0, var22, var6);
            var2.method_318(var25, 0.0, 0.0F - var11, var22, var6);
         }

         var2.method_406();
         var2.method_1284(true);
         var2.method_548(0.0F, 1.0F, 0.0F);

         for (int var17 = 0; var17 < 16; var17++) {
            float var20 = var17 / 16.0F;
            float var23 = var6 + (var5 - var6) * var20 - 0.001953125F;
            float var26 = var7 * var20 + 0.0625F;
            var2.method_318(0.0, var26, 0.0, var4, var23);
            var2.method_318(var7, var26, 0.0, var3, var23);
            var2.method_318(var7, var26, 0.0F - var11, var3, var23);
            var2.method_318(0.0, var26, 0.0F - var11, var4, var23);
         }

         var2.method_406();
         var2.method_1284(true);
         var2.method_548(0.0F, -1.0F, 0.0F);

         for (int var18 = 0; var18 < 16; var18++) {
            float var21 = var18 / 16.0F;
            float var24 = var6 + (var5 - var6) * var21 - 0.001953125F;
            float var27 = var7 * var21;
            var2.method_318(var7, var27, 0.0, var3, var24);
            var2.method_318(0.0, var27, 0.0, var4, var24);
            var2.method_318(0.0, var27, 0.0F - var11, var4, var24);
            var2.method_318(var7, var27, 0.0F - var11, var3, var24);
         }

         var2.method_406();
         GL11.glDisable(32826);
      }

      GL11.glPopMatrix();
   }

   public void method_1922(float var1) {
      float var2 = this.field_655 + (this.field_2845 - this.field_655) * var1;
      Class563 var3 = this.field_1565.field_2787;
      GL11.glPushMatrix();
      GL11.glRotatef(var3.field_2984 + (var3.field_2866 - var3.field_2984) * var1, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var3.field_2772 + (var3.field_1661 - var3.field_2772) * var1, 0.0F, 1.0F, 0.0F);
      Class584.method_331();
      GL11.glPopMatrix();
      float var4 = this.field_1565
         .field_2648
         .method_1154(Class469.method_468(var3.field_1417), Class469.method_468(var3.field_2654), Class469.method_468(var3.field_2013));
      GL11.glColor4f(var4, var4, var4, 1.0F);
      if (this.field_677 != null) {
         GL11.glPushMatrix();
         float var5 = 0.8F;
         float var6 = var3.method_1848(var1);
         float var7 = Class469.method_1667(var6 * (float) Math.PI);
         float var8 = Class469.method_1667(Class469.method_254(var6) * (float) Math.PI);
         GL11.glTranslatef(-var8 * 0.4F, Class469.method_1667(Class469.method_254(var6) * (float) Math.PI * 2.0F) * 0.2F, -var7 * 0.2F);
         GL11.glTranslatef(0.7F * var5, -0.65F * var5 - (1.0F - var2) * 0.6F, -0.9F * var5);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable(32826);
         var6 = var3.method_1848(var1);
         var7 = Class469.method_1667(var6 * var6 * (float) Math.PI);
         var8 = Class469.method_1667(Class469.method_254(var6) * (float) Math.PI);
         GL11.glRotatef(-var7 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var8 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var8 * 80.0F, 1.0F, 0.0F, 0.0F);
         var6 = 0.4F;
         GL11.glScalef(var6, var6, var6);
         this.method_1178(this.field_677);
         GL11.glPopMatrix();
      } else {
         GL11.glPushMatrix();
         float var12 = 0.8F;
         float var15 = var3.method_1848(var1);
         float var18 = Class469.method_1667(var15 * (float) Math.PI);
         float var21 = Class469.method_1667(Class469.method_254(var15) * (float) Math.PI);
         GL11.glTranslatef(-var21 * 0.3F, Class469.method_1667(Class469.method_254(var15) * (float) Math.PI * 2.0F) * 0.4F, -var18 * 0.4F);
         GL11.glTranslatef(0.8F * var12, -0.75F * var12 - (1.0F - var2) * 0.6F, -0.9F * var12);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable(32826);
         var15 = var3.method_1848(var1);
         var18 = Class469.method_1667(var15 * var15 * (float) Math.PI);
         var21 = Class469.method_1667(Class469.method_254(var15) * (float) Math.PI);
         GL11.glRotatef(var21 * 70.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var18 * 20.0F, 0.0F, 0.0F, 1.0F);
         Class736 var9 = this.field_1565.field_2176.method_268(this.field_1565.field_2787.field_1795, this.field_1565.field_2787.method_431());
         GL11.glBindTexture(3553, var9.field_846);
         GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
         GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(5.6F, 0.0F, 0.0F);
         Class459 var10 = Class531.field_759.method_679(this.field_1565.field_2787);
         Class223 var11 = (Class223)var10;
         var21 = 1.0F;
         GL11.glScalef(var21, var21, var21);
         var11.field_2486 = var9;
         var11.method_159();
         GL11.glPopMatrix();
      }

      GL11.glDisable(32826);
      Class584.method_62();
   }

   public void method_536(float var1) {
      GL11.glDisable(3008);
      if (this.field_1565.field_2787.field_1439 > 0) {
         int var2 = this.field_1565.field_2176.method_1545(Minecraft.field_1094);
         GL11.glBindTexture(3553, var2);
         this.method_1381(var1);
      }

      if (this.field_1565.field_2787.method_905() && !Class119.field_1477) {
         int var7 = Class469.method_468(this.field_1565.field_2787.field_1417);
         int var3 = Class469.method_468(this.field_1565.field_2787.field_2654);
         int var4 = Class469.method_468(this.field_1565.field_2787.field_2013);
         int var5 = this.field_1565.field_2176.method_1545(Minecraft.field_1094);
         GL11.glBindTexture(3553, var5);
         int var6 = this.field_1565.field_2648.method_197(var7, var3, var4);
         if (Class108.field_1221[var6] != null) {
            this.method_1170(var1, Class108.field_1221[var6].method_1735(2));
         }
      }

      if (this.field_1565.field_2787.method_482(Class160.field_1413)) {
         int var8 = this.field_1565.field_2176.method_1545("/water.png");
         GL11.glBindTexture(3553, var8);
         this.method_1568(var1);
      }

      GL11.glEnable(3008);
   }

   private void method_1170(float var1, int var2) {
      Class368 var3 = Class368.field_2696;
      this.field_1565.field_2787.method_50(var1);
      float var4 = 0.1F;
      GL11.glColor4f(var4, var4, var4, 0.5F);
      GL11.glPushMatrix();
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = 0.0078125F;
      float var11 = var2 % 16 / 256.0F - var10;
      float var12 = (var2 % 16 + 15.99F) / 256.0F + var10;
      float var13 = var2 / 16 / 512.0F - var10;
      float var14 = (var2 / 16 + 15.99F) / 512.0F + var10;
      var3.method_186();
      var3.method_318(var5, var7, var9, var12, var14);
      var3.method_318(var6, var7, var9, var11, var14);
      var3.method_318(var6, var8, var9, var11, var13);
      var3.method_318(var5, var8, var9, var12, var13);
      var3.method_406();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void method_1568(float var1) {
      Class368 var2 = Class368.field_2696;
      float var3 = this.field_1565.field_2787.method_50(var1);
      GL11.glColor4f(var3, var3, var3, 0.5F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glPushMatrix();
      float var4 = 4.0F;
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = -this.field_1565.field_2787.field_1661 / 64.0F;
      float var11 = this.field_1565.field_2787.field_2866 / 64.0F;
      var2.method_1284(true);
      var2.method_318(var5, var7, var9, var4 + var10, var4 + var11);
      var2.method_318(var6, var7, var9, 0.0F + var10, var4 + var11);
      var2.method_318(var6, var8, var9, 0.0F + var10, 0.0F + var11);
      var2.method_318(var5, var8, var9, var4 + var10, 0.0F + var11);
      var2.method_406();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   private void method_1381(float var1) {
      Class368 var2 = Class368.field_2696;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      float var3 = 1.0F;

      for (int var4 = 0; var4 < 2; var4++) {
         GL11.glPushMatrix();
         int var5 = Class108.field_1781.field_2972 + var4 * 16;
         int var6 = (var5 & 15) << 4;
         int var7 = var5 & 4080;
         float var8 = var6 / 256.0F;
         float var9 = (var6 + 15.99F) / 256.0F;
         float var10 = var7 / 512.0F;
         float var11 = (var7 + 15.99F) / 512.0F;
         float var12 = (0.0F - var3) / 2.0F;
         float var13 = var12 + var3;
         float var14 = 0.0F - var3 / 2.0F;
         float var15 = var14 + var3;
         float var16 = -0.5F;
         GL11.glTranslatef(-(var4 * 2 - 1) * 0.24F, -0.3F, 0.0F);
         GL11.glRotatef((var4 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
         var2.method_186();
         var2.method_318(var12, var14, var16, var9, var11);
         var2.method_318(var13, var14, var16, var8, var11);
         var2.method_318(var13, var15, var16, var8, var10);
         var2.method_318(var12, var15, var16, var9, var10);
         var2.method_406();
         GL11.glPopMatrix();
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   public void method_58() {
      this.field_655 = this.field_2845;
      Class563 var1 = this.field_1565.field_2787;
      Class334 var2 = var1.field_559.method_93();
      float var3 = 0.4F;
      float var4 = var2 == this.field_677 ? 1.0F : 0.0F;
      float var5 = var4 - this.field_2845;
      if (var5 < -var3) {
         var5 = -var3;
      }

      if (var5 > var3) {
         var5 = var3;
      }

      this.field_2845 += var5;
      if (this.field_2845 < 0.1F) {
         this.field_677 = var2;
      }
   }

   public void method_622() {
      this.field_2845 = 0.0F;
   }

   public void method_574() {
      this.field_2845 = 0.0F;
   }
}
