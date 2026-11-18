package x;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class Class0047 extends Class0010 {
   private Random d = new Random();

   public void a(Class0237 var1, double var2, double var4, double var6, float var8, float var9) {
      this.d.setSeed(187L);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(var8, 0.0F, 1.0F, 0.0F);
      GL11.glEnable(32826);
      this.a("/art/kz.png");
      Class0121 var10 = var1.b;
      float var11 = 0.0625F;
      GL11.glScalef(var11, var11, var11);
      this.a(var1, var10.u, var10.v, var10.w, var10.x);
      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   private void a(Class0237 var1, int var2, int var3, int var4, int var5) {
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
            this.a(var1, (var12 + var13) / 2.0F, (var14 + var15) / 2.0F);
            float var16 = (var4 + var2 - var10 * 16) / 256.0F;
            float var17 = (var4 + var2 - (var10 + 1) * 16) / 256.0F;
            float var18 = (var5 + var3 - var11 * 16) / 256.0F;
            float var19 = (var5 + var3 - (var11 + 1) * 16) / 256.0F;
            float var20 = 0.75F;
            float var21 = 0.8125F;
            float var22 = 0.0F;
            float var23 = 0.0625F;
            float var24 = 0.75F;
            float var25 = 0.8125F;
            float var26 = 0.001953125F;
            float var27 = 0.001953125F;
            float var28 = 0.7519531F;
            float var29 = 0.7519531F;
            float var30 = 0.0F;
            float var31 = 0.0625F;
            Class0195 var32 = Class0195.a;
            var32.b();
            var32.b(0.0F, 0.0F, -1.0F);
            var32.a(var12, var15, var8, var17, var18);
            var32.a(var13, var15, var8, var16, var18);
            var32.a(var13, var14, var8, var16, var19);
            var32.a(var12, var14, var8, var17, var19);
            var32.b(0.0F, 0.0F, 1.0F);
            var32.a(var12, var14, var9, var20, var22);
            var32.a(var13, var14, var9, var21, var22);
            var32.a(var13, var15, var9, var21, var23);
            var32.a(var12, var15, var9, var20, var23);
            var32.b(0.0F, -1.0F, 0.0F);
            var32.a(var12, var14, var8, var24, var26);
            var32.a(var13, var14, var8, var25, var26);
            var32.a(var13, var14, var9, var25, var27);
            var32.a(var12, var14, var9, var24, var27);
            var32.b(0.0F, 1.0F, 0.0F);
            var32.a(var12, var15, var9, var24, var26);
            var32.a(var13, var15, var9, var25, var26);
            var32.a(var13, var15, var8, var25, var27);
            var32.a(var12, var15, var8, var24, var27);
            var32.b(-1.0F, 0.0F, 0.0F);
            var32.a(var12, var14, var9, var29, var30);
            var32.a(var12, var15, var9, var29, var31);
            var32.a(var12, var15, var8, var28, var31);
            var32.a(var12, var14, var8, var28, var30);
            var32.b(1.0F, 0.0F, 0.0F);
            var32.a(var13, var14, var8, var29, var30);
            var32.a(var13, var15, var8, var29, var31);
            var32.a(var13, var15, var9, var28, var31);
            var32.a(var13, var14, var9, var28, var30);
            var32.a();
         }
      }
   }

   private void a(Class0237 var1, float var2, float var3) {
      int var4 = Class0118.b(var1.ah);
      int var5 = Class0118.b(var1.ai + var3 / 16.0F);
      int var6 = Class0118.b(var1.aj);
      if (var1.a == 0) {
         var4 = Class0118.b(var1.ah + var2 / 16.0F);
      }

      if (var1.a == 1) {
         var6 = Class0118.b(var1.aj - var2 / 16.0F);
      }

      if (var1.a == 2) {
         var4 = Class0118.b(var1.ah - var2 / 16.0F);
      }

      if (var1.a == 3) {
         var6 = Class0118.b(var1.aj + var2 / 16.0F);
      }

      float var7 = this.a.g.c(var4, var5, var6);
      GL11.glColor3f(var7, var7, var7);
   }
}
