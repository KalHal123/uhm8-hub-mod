package srv;

public class Class167 extends Class92 {
   private Class16 field_1521;
   protected Class252 field_948;
   protected boolean field_1341 = false;

   public Class167(Class317 var1) {
      super(var1);
   }

   @Override
   protected void method_530() {
      this.field_1341 = false;
      float var1 = 16.0F;
      if (this.field_948 == null) {
         this.field_948 = this.method_335();
         if (this.field_948 != null) {
            this.field_1521 = this.field_796.method_758(this, this.field_948, var1);
         }
      } else if (!this.field_948.method_974()) {
         this.field_948 = null;
      } else {
         float var2 = this.field_948.method_272(this);
         if (this.method_18(this.field_948)) {
            this.method_964(this.field_948, var2);
         }
      }

      if (this.field_1341 || this.field_948 == null || this.field_1521 != null && this.field_697.nextInt(20) != 0) {
         if (this.field_1521 == null && this.field_697.nextInt(80) == 0 || this.field_697.nextInt(80) == 0) {
            boolean var21 = false;
            int var3 = -1;
            int var4 = -1;
            int var5 = -1;
            float var6 = -99999.0F;

            for (int var7 = 0; var7 < 10; var7++) {
               int var8 = Class380.method_502(this.field_1324 + this.field_697.nextInt(13) - 6.0);
               int var9 = Class380.method_502(this.field_632 + this.field_697.nextInt(7) - 3.0);
               int var10 = Class380.method_502(this.field_1321 + this.field_697.nextInt(13) - 6.0);
               float var11 = this.method_568(var8, var9, var10);
               if (var11 > var6) {
                  var6 = var11;
                  var3 = var8;
                  var4 = var9;
                  var5 = var10;
                  var21 = true;
               }
            }

            if (var21) {
               this.field_1521 = this.field_796.method_472(this, var3, var4, var5, 10.0F);
            }
         }
      } else {
         this.field_1521 = this.field_796.method_758(this, this.field_948, var1);
      }

      int var22 = Class380.method_502(this.field_106.field_817);
      boolean var23 = this.method_643();
      boolean var24 = this.method_417();
      this.field_427 = 0.0F;
      if (this.field_1521 != null && this.field_697.nextInt(100) != 0) {
         Class47 var25 = this.field_1521.method_1014(this);
         double var26 = this.field_595 * 2.0F;

         while (var25 != null && var25.method_620(this.field_1324, var25.field_173, this.field_1321) < var26 * var26) {
            this.field_1521.method_169();
            if (this.field_1521.method_85()) {
               var25 = null;
               this.field_1521 = null;
            } else {
               var25 = this.field_1521.method_1014(this);
            }
         }

         this.field_63 = false;
         if (var25 != null) {
            double var27 = var25.field_13 - this.field_1324;
            double var28 = var25.field_510 - this.field_1321;
            double var12 = var25.field_173 - var22;
            float var14 = (float)(Math.atan2(var28, var27) * 180.0 / (float) Math.PI) - 90.0F;
            float var15 = var14 - this.field_909;
            this.field_311 = this.field_543;

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

            this.field_909 += var15;
            if (this.field_1341 && this.field_948 != null) {
               double var16 = this.field_948.field_1324 - this.field_1324;
               double var18 = this.field_948.field_1321 - this.field_1321;
               float var20 = this.field_909;
               this.field_909 = (float)(Math.atan2(var18, var16) * 180.0 / (float) Math.PI) - 90.0F;
               var15 = (var20 - this.field_909 + 90.0F) * (float) Math.PI / 180.0F;
               this.field_1135 = -Class380.method_241(var15) * this.field_311 * 1.0F;
               this.field_311 = Class380.method_520(var15) * this.field_311 * 1.0F;
            }

            if (var12 > 0.0) {
               this.field_63 = true;
            }
         }

         if (this.field_948 != null) {
            this.method_1008(this.field_948, 30.0F);
         }

         if (this.field_857) {
            this.field_63 = true;
         }

         if (this.field_697.nextFloat() < 0.8F && (var23 || var24)) {
            this.field_63 = true;
         }
      } else {
         super.method_530();
         this.field_1521 = null;
      }
   }

   protected void method_964(Class252 var1, float var2) {
   }

   protected float method_568(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected Class252 method_335() {
      return null;
   }

   @Override
   public boolean method_53() {
      int var1 = Class380.method_502(this.field_1324);
      int var2 = Class380.method_502(this.field_106.field_817);
      int var3 = Class380.method_502(this.field_1321);
      return super.method_53() && this.method_568(var1, var2, var3) >= 0.0F;
   }
}
