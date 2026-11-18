package x;

public class Class0114 extends Class0158 {
   private Class0036 a;
   protected Class0268 f;
   protected boolean g = false;

   public Class0114(Class0065 var1) {
      super(var1);
   }

   @Override
   protected void b_() {
      this.g = false;
      float var1 = 16.0F;
      if (this.f == null) {
         this.f = this.h();
         if (this.f != null) {
            this.a = this.ad.a(this, this.f, var1);
         }
      } else if (!this.f.z()) {
         this.f = null;
      } else {
         float var2 = this.f.d(this);
         if (this.c(this.f)) {
            this.a(this.f, var2);
         }
      }

      if (this.g || this.f == null || this.a != null && this.aN.nextInt(20) != 0) {
         if (this.a == null && this.aN.nextInt(80) == 0 || this.aN.nextInt(80) == 0) {
            boolean var21 = false;
            int var3 = -1;
            int var4 = -1;
            int var5 = -1;
            float var6 = -99999.0F;

            for (int var7 = 0; var7 < 10; var7++) {
               int var8 = Class0118.b(this.ah + this.aN.nextInt(13) - 6.0);
               int var9 = Class0118.b(this.ai + this.aN.nextInt(7) - 3.0);
               int var10 = Class0118.b(this.aj + this.aN.nextInt(13) - 6.0);
               float var11 = this.a(var8, var9, var10);
               if (var11 > var6) {
                  var6 = var11;
                  var3 = var8;
                  var4 = var9;
                  var5 = var10;
                  var21 = true;
               }
            }

            if (var21) {
               this.a = this.ad.a(this, var3, var4, var5, 10.0F);
            }
         }
      } else {
         this.a = this.ad.a(this, this.f, var1);
      }

      int var22 = Class0118.b(this.ar.b);
      boolean var23 = this.g_();
      boolean var24 = this.E();
      this.ao = 0.0F;
      if (this.a != null && this.aN.nextInt(100) != 0) {
         Class0009 var25 = this.a.a(this);
         double var26 = this.az * 2.0F;

         while (var25 != null && var25.d(this.ah, var25.b, this.aj) < var26 * var26) {
            this.a.a();
            if (this.a.b()) {
               var25 = null;
               this.a = null;
            } else {
               var25 = this.a.a(this);
            }
         }

         this.W = false;
         if (var25 != null) {
            double var27 = var25.a - this.ah;
            double var28 = var25.c - this.aj;
            double var12 = var25.b - var22;
            float var14 = (float)(Math.atan2(var28, var27) * 180.0 / (float) Math.PI) - 90.0F;
            float var15 = var14 - this.an;
            this.U = this.Y;

            while (var15 < -180.0F) {
               var15 += 360.0F;
            }

            while (var15 >= 180.0F) {
               var15 -= 360.0F;
            }

            if (var15 > 30.0F) {
               var15 = 30.0F;
            }

            if (var15 < -30.0F) {
               var15 = -30.0F;
            }

            this.an += var15;
            if (this.g && this.f != null) {
               double var16 = this.f.ah - this.ah;
               double var18 = this.f.aj - this.aj;
               float var20 = this.an;
               this.an = (float)(Math.atan2(var18, var16) * 180.0 / (float) Math.PI) - 90.0F;
               var15 = (var20 - this.an + 90.0F) * (float) Math.PI / 180.0F;
               this.T = -Class0118.a(var15) * this.U * 1.0F;
               this.U = Class0118.b(var15) * this.U * 1.0F;
            }

            if (var12 > 0.0) {
               this.W = true;
            }
         }

         if (this.f != null) {
            this.b(this.f, (float)30.0F);
         }

         if (this.at) {
            this.W = true;
         }

         if (this.aN.nextFloat() < 0.8F && (var23 || var24)) {
            this.W = true;
         }
      } else {
         super.b_();
         this.a = null;
      }
   }

   protected void a(Class0268 var1, float var2) {
   }

   protected float a(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected Class0268 h() {
      return null;
   }

   @Override
   public boolean a() {
      int var1 = Class0118.b(this.ah);
      int var2 = Class0118.b(this.ar.b);
      int var3 = Class0118.b(this.aj);
      return super.a() && this.a(var1, var2, var3) >= 0.0F;
   }
}
