package x;

import org.lwjgl.opengl.GL11;

public class Class0056 extends Class0356 {
   private Class0268 a;
   private Class0268 o;
   private int p = 0;
   private int q = 0;
   private float r;

   public Class0056(Class0065 var1, Class0268 var2, Class0268 var3, float var4) {
      super(var1, var2.ah, var2.ai, var2.aj, var2.ak, var2.al, var2.am);
      this.a = var2;
      this.o = var3;
      this.q = 3;
      this.r = var4;
   }

   @Override
   public void a(Class0195 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (this.p + var2) / this.q;
      var8 *= var8;
      double var9 = this.a.ah;
      double var11 = this.a.ai;
      double var13 = this.a.aj;
      double var15 = this.o.aF + (this.o.ah - this.o.aF) * var2;
      double var17 = this.o.aG + (this.o.ai - this.o.aG) * var2 + this.r;
      double var19 = this.o.aH + (this.o.aj - this.o.aH) * var2;
      double var21 = var9 + (var15 - var9) * var8;
      double var23 = var11 + (var17 - var11) * var8;
      double var25 = var13 + (var19 - var13) * var8;
      int var27 = Class0118.b(var21);
      int var28 = Class0118.b(var23 + this.ay / 2.0F);
      int var29 = Class0118.b(var25);
      float var30 = this.ad.c(var27, var28, var29);
      var21 -= l;
      var23 -= m;
      var25 -= n;
      GL11.glColor4f(var30, var30, var30, 1.0F);
      Class0284.a.a(this.a, (float)var21, (float)var23, (float)var25, this.a.an, var2);
   }

   @Override
   public void e_() {
      this.p++;
      if (this.p == this.q) {
         this.D();
      }
   }

   @Override
   public int c() {
      return 3;
   }
}
