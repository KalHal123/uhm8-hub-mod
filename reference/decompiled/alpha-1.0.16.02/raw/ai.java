import org.lwjgl.opengl.GL11;

public abstract class ai {
   protected km a;
   private ff d = new cn();
   private ay e = new ay();
   protected float b = 0.0F;
   protected float c = 1.0F;

   public abstract void a(jx var1, double var2, double var4, double var6, float var8, float var9);

   protected void a(String var1) {
      er var2 = this.a.e;
      var2.b(var2.a(var1));
   }

   protected void a(String var1, String var2) {
      er var3 = this.a.e;
      var3.b(var3.a(var1, var2));
   }

   private void a(jx var1, double var2, double var4, double var6, float var8) {
      GL11.glDisable(2896);
      int var9 = ln.ar.aZ;
      int var10 = (var9 & 15) << 4;
      int var11 = var9 & 240;
      float var12 = var10 / 256.0F;
      float var13 = (var10 + 15.99F) / 256.0F;
      float var14 = var11 / 256.0F;
      float var15 = (var11 + 15.99F) / 256.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var16 = var1.az * 1.4F;
      GL11.glScalef(var16, var16, var16);
      this.a("/terrain.png");
      he var17 = he.a;
      float var18 = 1.0F;
      float var19 = 0.5F;
      float var20 = 0.0F;
      float var21 = var1.aA / var1.az;
      GL11.glRotatef(-this.a.i, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.4F + (int)var21 * 0.02F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var17.b();

      while (var21 > 0.0F) {
         var17.a(var18 - var19, 0.0F - var20, 0.0, var13, var15);
         var17.a(0.0F - var19, 0.0F - var20, 0.0, var12, var15);
         var17.a(0.0F - var19, 1.4F - var20, 0.0, var12, var14);
         var17.a(var18 - var19, 1.4F - var20, 0.0, var13, var14);
         var21--;
         var20--;
         var18 *= 0.9F;
         GL11.glTranslatef(0.0F, 0.0F, -0.04F);
      }

      var17.a();
      GL11.glPopMatrix();
      GL11.glEnable(2896);
   }

   private void c(jx var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      er var10 = this.a.e;
      var10.b(var10.a("%%/shadow.png"));
      cj var11 = this.b();
      GL11.glDepthMask(false);
      float var12 = this.b;
      double var13 = var1.aF + (var1.ah - var1.aF) * var9;
      double var15 = var1.aG + (var1.ai - var1.aG) * var9 + var1.h_();
      double var17 = var1.aH + (var1.aj - var1.aH) * var9;
      int var19 = ei.b(var13 - var12);
      int var20 = ei.b(var13 + var12);
      int var21 = ei.b(var15 - var12);
      int var22 = ei.b(var15);
      int var23 = ei.b(var17 - var12);
      int var24 = ei.b(var17 + var12);
      double var25 = var2 - var13;
      double var27 = var4 - var15;
      double var29 = var6 - var17;
      he var31 = he.a;
      var31.b();

      for (int var32 = var19; var32 <= var20; var32++) {
         for (int var33 = var21; var33 <= var22; var33++) {
            for (int var34 = var23; var34 <= var24; var34++) {
               int var35 = var11.a(var32, var33 - 1, var34);
               if (var35 > 0 && var11.j(var32, var33, var34) > 3) {
                  this.a(ln.n[var35], var2, var4 + var1.h_(), var6, var32, var33, var34, var8, var12, var25, var27 + var1.h_(), var29);
               }
            }
         }
      }

      var31.a();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glDepthMask(true);
   }

   private cj b() {
      return this.a.g;
   }

   private void a(
      ln var1, double var2, double var4, double var6, int var8, int var9, int var10, float var11, float var12, double var13, double var15, double var17
   ) {
      he var19 = he.a;
      if (var1.c()) {
         double var20 = (var11 - (var4 - (var9 + var15)) / 2.0) * 0.5 * this.b().c(var8, var9, var10);
         if (!(var20 < 0.0)) {
            if (var20 > 1.0) {
               var20 = 1.0;
            }

            var19.a(1.0F, 1.0F, 1.0F, (float)var20);
            double var22 = var8 + var1.bd + var13;
            double var24 = var8 + var1.bg + var13;
            double var26 = var9 + var1.be + var15 + 0.015625;
            double var28 = var10 + var1.bf + var17;
            double var30 = var10 + var1.bi + var17;
            float var32 = (float)((var2 - var22) / 2.0 / var12 + 0.5);
            float var33 = (float)((var2 - var24) / 2.0 / var12 + 0.5);
            float var34 = (float)((var6 - var28) / 2.0 / var12 + 0.5);
            float var35 = (float)((var6 - var30) / 2.0 / var12 + 0.5);
            var19.a(var22, var26, var28, var32, var34);
            var19.a(var22, var26, var30, var32, var35);
            var19.a(var24, var26, var30, var33, var35);
            var19.a(var24, var26, var28, var33, var34);
         }
      }
   }

   public static void a(cb var0, double var1, double var3, double var5) {
      GL11.glDisable(3553);
      he var7 = he.a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var7.b();
      var7.b(var1, var3, var5);
      var7.b(0.0F, 0.0F, -1.0F);
      var7.a(var0.a, var0.e, var0.c);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.a, var0.b, var0.c);
      var7.b(0.0F, 0.0F, 1.0F);
      var7.a(var0.a, var0.b, var0.f);
      var7.a(var0.d, var0.b, var0.f);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.a, var0.e, var0.f);
      var7.b(0.0F, -1.0F, 0.0F);
      var7.a(var0.a, var0.b, var0.c);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.d, var0.b, var0.f);
      var7.a(var0.a, var0.b, var0.f);
      var7.b(0.0F, 1.0F, 0.0F);
      var7.a(var0.a, var0.e, var0.f);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.a, var0.e, var0.c);
      var7.b(-1.0F, 0.0F, 0.0F);
      var7.a(var0.a, var0.b, var0.f);
      var7.a(var0.a, var0.e, var0.f);
      var7.a(var0.a, var0.e, var0.c);
      var7.a(var0.a, var0.b, var0.c);
      var7.b(1.0F, 0.0F, 0.0F);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.d, var0.b, var0.f);
      var7.b(0.0, 0.0, 0.0);
      var7.a();
      GL11.glEnable(3553);
   }

   public static void a(cb var0) {
      he var1 = he.a;
      var1.b();
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.d, var0.b, var0.f);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.f);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.d, var0.b, var0.f);
      var1.a();
   }

   public void a(km var1) {
      this.a = var1;
   }

   public void b(jx var1, double var2, double var4, double var6, float var8, float var9) {
      if (this.a.k.i && this.b > 0.0F) {
         double var10 = this.a.a(var1.ah, var1.ai, var1.aj);
         float var12 = (float)((1.0 - var10 / 256.0) * this.c);
         if (var12 > 0.0F) {
            this.c(var1, var2, var4, var6, var12, var9);
         }
      }

      if (var1.aQ > 0) {
         this.a(var1, var2, var4, var6, var9);
      }
   }

   public jt a() {
      return this.a.a();
   }
}
