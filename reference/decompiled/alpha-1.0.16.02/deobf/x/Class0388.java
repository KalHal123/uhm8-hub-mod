package x;

import java.util.Random;
import org.lwjgl.opengl.GL11;

public class Class0388 extends Class0010 {
   private Class0026 d = new Class0026();
   private Random e = new Random();

   public Class0388() {
      this.b = 0.15F;
      this.c = 0.75F;
   }

   public void a(Class0100 var1, double var2, double var4, double var6, float var8, float var9) {
      this.e.setSeed(187L);
      Class0124 var10 = var1.a;
      GL11.glPushMatrix();
      float var11 = Class0118.a((var1.b + var9) / 10.0F + var1.d) * 0.1F + 0.1F;
      float var12 = ((var1.b + var9) / 20.0F + var1.d) * (180.0F / (float)Math.PI);
      byte var13 = 1;
      if (var1.a.a > 1) {
         var13 = 2;
      }

      if (var1.a.a > 5) {
         var13 = 3;
      }

      if (var1.a.a > 20) {
         var13 = 4;
      }

      GL11.glTranslatef((float)var2, (float)var4 + var11, (float)var6);
      GL11.glEnable(32826);
      if (var10.c < 256 && Class0026.a(Class0312.n[var10.c].f())) {
         GL11.glRotatef(var12, 0.0F, 1.0F, 0.0F);
         this.a("/terrain.png");
         float var27 = 0.25F;
         if (!Class0312.n[var10.c].c() && var10.c != Class0312.ak.ba) {
            var27 = 0.5F;
         }

         GL11.glScalef(var27, var27, var27);

         for (int var28 = 0; var28 < var13; var28++) {
            GL11.glPushMatrix();
            if (var28 > 0) {
               float var29 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.2F / var27;
               float var30 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.2F / var27;
               float var31 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.2F / var27;
               GL11.glTranslatef(var29, var30, var31);
            }

            this.d.a(Class0312.n[var10.c]);
            GL11.glPopMatrix();
         }
      } else {
         GL11.glScalef(0.5F, 0.5F, 0.5F);
         int var14 = var10.b();
         if (var10.c < 256) {
            this.a("/terrain.png");
         } else {
            this.a("/gui/items.png");
         }

         Class0195 var15 = Class0195.a;
         float var16 = (var14 % 16 * 16 + 0) / 256.0F;
         float var17 = (var14 % 16 * 16 + 16) / 256.0F;
         float var18 = (var14 / 16 * 16 + 0) / 256.0F;
         float var19 = (var14 / 16 * 16 + 16) / 256.0F;
         float var20 = 1.0F;
         float var21 = 0.5F;
         float var22 = 0.25F;

         for (int var23 = 0; var23 < var13; var23++) {
            GL11.glPushMatrix();
            if (var23 > 0) {
               float var24 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.3F;
               float var25 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.3F;
               float var26 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.3F;
               GL11.glTranslatef(var24, var25, var26);
            }

            GL11.glRotatef(180.0F - this.a.i, 0.0F, 1.0F, 0.0F);
            var15.b();
            var15.b(0.0F, 1.0F, 0.0F);
            var15.a(0.0F - var21, 0.0F - var22, 0.0, var16, var19);
            var15.a(var20 - var21, 0.0F - var22, 0.0, var17, var19);
            var15.a(var20 - var21, 1.0F - var22, 0.0, var17, var18);
            var15.a(0.0F - var21, 1.0F - var22, 0.0, var16, var18);
            var15.a();
            GL11.glPopMatrix();
         }
      }

      GL11.glDisable(32826);
      GL11.glPopMatrix();
   }

   public void a(Class0264 var1, Class0127 var2, Class0124 var3, int var4, int var5) {
      if (var3 != null) {
         if (var3.c < 256 && Class0026.a(Class0312.n[var3.c].f())) {
            int var6 = var3.c;
            var2.b(var2.a("/terrain.png"));
            Class0312 var7 = Class0312.n[var6];
            GL11.glPushMatrix();
            GL11.glTranslatef(var4 - 2, var5 + 3, 0.0F);
            GL11.glScalef(10.0F, 10.0F, 10.0F);
            GL11.glTranslatef(1.0F, 0.5F, 8.0F);
            GL11.glRotatef(210.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.d.a(var7);
            GL11.glPopMatrix();
         } else if (var3.b() >= 0) {
            GL11.glDisable(2896);
            if (var3.c < 256) {
               var2.b(var2.a("/terrain.png"));
            } else {
               var2.b(var2.a("/gui/items.png"));
            }

            this.a(var4, var5, var3.b() % 16 * 16, var3.b() / 16 * 16, 16, 16);
            GL11.glEnable(2896);
         }
      }
   }

   public void b(Class0264 var1, Class0127 var2, Class0124 var3, int var4, int var5) {
      if (var3 != null) {
         if (var3.a > 1) {
            String var6 = "" + var3.a;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            var1.a(var6, var4 + 19 - 2 - var1.a(var6), var5 + 6 + 3, 16777215);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }

         if (var3.d > 0) {
            int var11 = 13 - var3.d * 13 / var3.d();
            int var7 = 255 - var3.d * 255 / var3.d();
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            Class0195 var8 = Class0195.a;
            int var9 = 255 - var7 << 16 | var7 << 8;
            int var10 = (255 - var7) / 4 << 16 | 16128;
            this.a(var8, var4 + 2, var5 + 13, 13, 2, 0);
            this.a(var8, var4 + 2, var5 + 13, 12, 1, var10);
            this.a(var8, var4 + 2, var5 + 13, var11, 1, var9);
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }
   }

   private void a(Class0195 var1, int var2, int var3, int var4, int var5, int var6) {
      var1.b();
      var1.b(var6);
      var1.a(var2 + 0, var3 + 0, 0.0);
      var1.a(var2 + 0, var3 + var5, 0.0);
      var1.a(var2 + var4, var3 + var5, 0.0);
      var1.a(var2 + var4, var3 + 0, 0.0);
      var1.a();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.0F;
      float var8 = 0.00390625F;
      float var9 = 0.00390625F;
      Class0195 var10 = Class0195.a;
      var10.b();
      var10.a(var1 + 0, var2 + var6, var7, (var3 + 0) * var8, (var4 + var6) * var9);
      var10.a(var1 + var5, var2 + var6, var7, (var3 + var5) * var8, (var4 + var6) * var9);
      var10.a(var1 + var5, var2 + 0, var7, (var3 + var5) * var8, (var4 + 0) * var9);
      var10.a(var1 + 0, var2 + 0, var7, (var3 + 0) * var8, (var4 + 0) * var9);
      var10.a();
   }
}
