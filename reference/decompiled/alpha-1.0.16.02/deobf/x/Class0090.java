package x;

import org.lwjgl.opengl.GL11;

public class Class0090 extends Class0010 {
   protected Class0142 d;
   protected Class0142 e;

   public Class0090(Class0142 var1, float var2) {
      this.d = var1;
      this.b = var2;
   }

   public void a(Class0142 var1) {
      this.e = var1;
   }

   public void a(Class0158 var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      this.d.j = this.c(var1, var9);
      this.d.k = var1.ac != null;
      if (this.e != null) {
         this.e.k = this.d.k;
      }

      try {
         float var10 = var1.o + (var1.n - var1.o) * var9;
         float var11 = var1.ap + (var1.an - var1.ap) * var9;
         float var12 = var1.aq + (var1.ao - var1.aq) * var9;
         GL11.glTranslatef((float)var2, (float)var4, (float)var6);
         float var13 = this.d(var1, var9);
         GL11.glRotatef(180.0F - var10, 0.0F, 1.0F, 0.0F);
         if (var1.I > 0) {
            float var14 = (var1.I + var9 - 1.0F) / 20.0F * 1.6F;
            var14 = Class0118.c(var14);
            if (var14 > 1.0F) {
               var14 = 1.0F;
            }

            GL11.glRotatef(var14 * this.a(var1), 0.0F, 0.0F, 1.0F);
         }

         float var26 = 0.0625F;
         GL11.glEnable(32826);
         GL11.glScalef(-1.0F, -1.0F, 1.0F);
         this.a(var1, var9);
         GL11.glTranslatef(0.0F, -24.0F * var26 - 0.0078125F, 0.0F);
         float var15 = var1.P + (var1.Q - var1.P) * var9;
         float var16 = var1.R - var1.Q * (1.0F - var9);
         if (var15 > 1.0F) {
            var15 = 1.0F;
         }

         this.a(var1.aV, var1.v());
         GL11.glEnable(3008);
         this.d.b(var16, var15, var13, var11 - var10, var12, var26);

         for (int var17 = 0; var17 < 4; var17++) {
            if (this.a(var1, var17)) {
               this.e.b(var16, var15, var13, var11 - var10, var12, var26);
               GL11.glDisable(3042);
               GL11.glEnable(3008);
            }
         }

         this.b(var1, var9);
         float var27 = var1.a(var9);
         int var18 = this.a(var1, var27, var9);
         if ((var18 >> 24 & 0xFF) > 0 || var1.F > 0 || var1.I > 0) {
            GL11.glDisable(3553);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glDepthFunc(514);
            if (var1.F > 0 || var1.I > 0) {
               GL11.glColor4f(var27, 0.0F, 0.0F, 0.4F);
               this.d.b(var16, var15, var13, var11 - var10, var12, var26);

               for (int var19 = 0; var19 < 4; var19++) {
                  if (this.a(var1, var19)) {
                     GL11.glColor4f(var27, 0.0F, 0.0F, 0.4F);
                     this.e.b(var16, var15, var13, var11 - var10, var12, var26);
                  }
               }
            }

            if ((var18 >> 24 & 0xFF) > 0) {
               float var28 = (var18 >> 16 & 0xFF) / 255.0F;
               float var20 = (var18 >> 8 & 0xFF) / 255.0F;
               float var21 = (var18 & 0xFF) / 255.0F;
               float var22 = (var18 >> 24 & 0xFF) / 255.0F;
               GL11.glColor4f(var28, var20, var21, var22);
               this.d.b(var16, var15, var13, var11 - var10, var12, var26);

               for (int var23 = 0; var23 < 4; var23++) {
                  if (this.a(var1, var23)) {
                     GL11.glColor4f(var28, var20, var21, var22);
                     this.e.b(var16, var15, var13, var11 - var10, var12, var26);
                  }
               }
            }

            GL11.glDepthFunc(515);
            GL11.glDisable(3042);
            GL11.glEnable(3008);
            GL11.glEnable(3553);
         }

         GL11.glDisable(32826);
      } catch (Exception var24) {
         var24.printStackTrace();
      }

      GL11.glEnable(2884);
      GL11.glPopMatrix();
   }

   protected float c(Class0158 var1, float var2) {
      return var1.d(var2);
   }

   protected float d(Class0158 var1, float var2) {
      return var1.aO + var2;
   }

   protected void b(Class0158 var1, float var2) {
   }

   protected boolean a(Class0158 var1, int var2) {
      return false;
   }

   protected float a(Class0158 var1) {
      return 90.0F;
   }

   protected int a(Class0158 var1, float var2, float var3) {
      return 0;
   }

   protected void a(Class0158 var1, float var2) {
   }
}
