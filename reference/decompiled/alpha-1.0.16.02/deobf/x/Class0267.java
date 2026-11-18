package x;

import java.util.List;

public class Class0267 extends Class0268 {
   private int b = -1;
   private int c = -1;
   private int d = -1;
   private int e = 0;
   private boolean f = false;
   public int a = 0;
   private Class0158 g;
   private int h;
   private int i = 0;

   public Class0267(Class0065 var1) {
      super(var1);
      this.a(0.5F, 0.5F);
   }

   public Class0267(Class0065 var1, Class0158 var2) {
      super(var1);
      this.g = var2;
      this.a(0.5F, 0.5F);
      this.c(var2.ah, var2.ai, var2.aj, var2.an, var2.ao);
      this.ah = this.ah - Class0118.b(this.an / 180.0F * (float) Math.PI) * 0.16F;
      this.ai -= 0.1F;
      this.aj = this.aj - Class0118.a(this.an / 180.0F * (float) Math.PI) * 0.16F;
      this.a(this.ah, this.ai, this.aj);
      this.ay = 0.0F;
      this.ak = -Class0118.a(this.an / 180.0F * (float) Math.PI) * Class0118.b(this.ao / 180.0F * (float) Math.PI);
      this.am = Class0118.b(this.an / 180.0F * (float) Math.PI) * Class0118.b(this.ao / 180.0F * (float) Math.PI);
      this.al = -Class0118.a(this.ao / 180.0F * (float) Math.PI);
      this.a(this.ak, this.al, this.am, 1.5F, 1.0F);
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      float var9 = Class0118.a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= var9;
      var3 /= var9;
      var5 /= var9;
      var1 += this.aN.nextGaussian() * 0.0075F * var8;
      var3 += this.aN.nextGaussian() * 0.0075F * var8;
      var5 += this.aN.nextGaussian() * 0.0075F * var8;
      var1 *= var7;
      var3 *= var7;
      var5 *= var7;
      this.ak = var1;
      this.al = var3;
      this.am = var5;
      float var10 = Class0118.a(var1 * var1 + var5 * var5);
      this.ap = this.an = (float)(Math.atan2(var1, var5) * 180.0 / (float) Math.PI);
      this.aq = this.ao = (float)(Math.atan2(var3, var10) * 180.0 / (float) Math.PI);
      this.h = 0;
   }

   @Override
   public void e_() {
      super.e_();
      if (this.a > 0) {
         this.a--;
      }

      if (this.f) {
         int var1 = this.ad.a(this.b, this.c, this.d);
         if (var1 == this.e) {
            this.h++;
            if (this.h == 1200) {
               this.D();
            }

            return;
         }

         this.f = false;
         this.ak = this.ak * (this.aN.nextFloat() * 0.2F);
         this.al = this.al * (this.aN.nextFloat() * 0.2F);
         this.am = this.am * (this.aN.nextFloat() * 0.2F);
         this.h = 0;
         this.i = 0;
      } else {
         this.i++;
      }

      Class0009 var15 = Class0009.b(this.ah, this.ai, this.aj);
      Class0009 var2 = Class0009.b(this.ah + this.ak, this.ai + this.al, this.aj + this.am);
      Class0320 var3 = this.ad.a(var15, var2);
      var15 = Class0009.b(this.ah, this.ai, this.aj);
      var2 = Class0009.b(this.ah + this.ak, this.ai + this.al, this.aj + this.am);
      if (var3 != null) {
         var2 = Class0009.b(var3.f.a, var3.f.b, var3.f.c);
      }

      Class0268 var4 = null;
      List var5 = this.ad.b(this, this.ar.a(this.ak, this.al, this.am).b(1.0, 1.0, 1.0));
      double var6 = 0.0;

      for (int var8 = 0; var8 < var5.size(); var8++) {
         Class0268 var9 = (Class0268)var5.get(var8);
         if (var9.c_() && (var9 != this.g || this.i >= 5)) {
            float var10 = 0.3F;
            Class0057 var11 = var9.ar.b(var10, var10, var10);
            Class0320 var12 = var11.a(var15, var2);
            if (var12 != null) {
               double var13 = var15.c(var12.f);
               if (var13 < var6 || var6 == 0.0) {
                  var4 = var9;
                  var6 = var13;
               }
            }
         }
      }

      if (var4 != null) {
         var3 = new Class0320(var4);
      }

      if (var3 != null) {
         if (var3.g != null) {
            if (var3.g.a(this.g, 4)) {
               this.ad.a(this, "random.drr", 1.0F, 1.2F / (this.aN.nextFloat() * 0.2F + 0.9F));
               this.D();
            } else {
               this.ak *= -0.1F;
               this.al *= -0.1F;
               this.am *= -0.1F;
               this.an += 180.0F;
               this.ap += 180.0F;
               this.i = 0;
            }
         } else {
            this.b = var3.b;
            this.c = var3.c;
            this.d = var3.d;
            this.e = this.ad.a(this.b, this.c, this.d);
            this.ak = (float)(var3.f.a - this.ah);
            this.al = (float)(var3.f.b - this.ai);
            this.am = (float)(var3.f.c - this.aj);
            float var18 = Class0118.a(this.ak * this.ak + this.al * this.al + this.am * this.am);
            this.ah = this.ah - this.ak / var18 * 0.05F;
            this.ai = this.ai - this.al / var18 * 0.05F;
            this.aj = this.aj - this.am / var18 * 0.05F;
            this.ad.a(this, "random.drr", 1.0F, 1.2F / (this.aN.nextFloat() * 0.2F + 0.9F));
            this.f = true;
            this.a = 7;
         }
      }

      this.ah = this.ah + this.ak;
      this.ai = this.ai + this.al;
      this.aj = this.aj + this.am;
      float var19 = Class0118.a(this.ak * this.ak + this.am * this.am);
      this.an = (float)(Math.atan2(this.ak, this.am) * 180.0 / (float) Math.PI);
      this.ao = (float)(Math.atan2(this.al, var19) * 180.0 / (float) Math.PI);

      while (this.ao - this.aq < -180.0F) {
         this.aq -= 360.0F;
      }

      while (this.ao - this.aq >= 180.0F) {
         this.aq += 360.0F;
      }

      while (this.an - this.ap < -180.0F) {
         this.ap -= 360.0F;
      }

      while (this.an - this.ap >= 180.0F) {
         this.ap += 360.0F;
      }

      this.ao = this.aq + (this.ao - this.aq) * 0.2F;
      this.an = this.ap + (this.an - this.ap) * 0.2F;
      float var20 = 0.99F;
      float var21 = 0.03F;
      if (this.g_()) {
         for (int var22 = 0; var22 < 4; var22++) {
            float var23 = 0.25F;
            this.ad.a("bubble", this.ah - this.ak * var23, this.ai - this.al * var23, this.aj - this.am * var23, this.ak, this.al, this.am);
         }

         var20 = 0.8F;
      }

      this.ak *= var20;
      this.al *= var20;
      this.am *= var20;
      this.al -= var21;
      this.a(this.ah, this.ai, this.aj);
   }

   @Override
   public void a(Class0193 var1) {
      var1.a("xTile", (short)this.b);
      var1.a("yTile", (short)this.c);
      var1.a("zTile", (short)this.d);
      var1.a("inTile", (byte)this.e);
      var1.a("shake", (byte)this.a);
      var1.a("inGround", (byte)(this.f ? 1 : 0));
   }

   @Override
   public void b(Class0193 var1) {
      this.b = var1.d("xTile");
      this.c = var1.d("yTile");
      this.d = var1.d("zTile");
      this.e = var1.c("inTile") & 255;
      this.a = var1.c("shake") & 255;
      this.f = var1.c("inGround") == 1;
   }

   @Override
   public void b(Class0089 var1) {
      if (this.f && this.g == var1 && this.a <= 0 && var1.b.a(new Class0124(Class0086.j.aQ, 1))) {
         this.ad.a(this, "random.pop", 0.2F, ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         var1.a_(this, 1);
         this.D();
      }
   }

   @Override
   public float h_() {
      return 0.0F;
   }
}
