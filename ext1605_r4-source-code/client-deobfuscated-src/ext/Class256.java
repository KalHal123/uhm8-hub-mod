package ext;

import java.util.List;

public class Class256 extends Class359 {
   public int field_1868 = 0;
   public int field_1876 = 0;
   public int field_104 = 1;

   public Class256(Class454 var1) {
      super(var1);
      this.field_1968 = true;
      this.method_244(1.5F, 0.6F);
      this.field_838 = this.field_1443 / 2.0F;
      this.field_1522 = false;
   }

   @Override
   public Class630 method_1056(Class359 var1) {
      return var1.field_235;
   }

   @Override
   public Class630 method_611() {
      return this.field_235;
   }

   @Override
   public boolean method_966() {
      return true;
   }

   public Class256(Class454 var1, double var2, double var4, double var6) {
      this(var1);
      this.method_172(var2, var4 + this.field_838, var6);
      this.field_2549 = 0.0;
      this.field_2501 = 0.0;
      this.field_489 = 0.0;
      this.field_2553 = var2;
      this.field_2068 = var4;
      this.field_1780 = var6;
   }

   @Override
   public double method_1612() {
      return this.field_1443 * 0.0 - 0.3F;
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      this.field_104 = -this.field_104;
      this.field_1876 = 10;
      this.field_1868 += var2 * 10;
      if (this.field_1868 > 40) {
         for (int var3 = 0; var3 < 3; var3++) {
            this.method_978(Class108.field_3148.field_2151, 1, 0.0F);
         }

         for (int var4 = 0; var4 < 2; var4++) {
            this.method_978(Class755.field_2717.field_10, 1, 0.0F);
         }

         this.method_1594();
      }

      return true;
   }

   @Override
   public boolean method_243() {
      return !this.field_2642;
   }

   @Override
   public void method_46() {
      super.method_46();
      if (this.field_1876 > 0) {
         this.field_1876--;
      }

      if (this.field_1868 > 0) {
         this.field_1868--;
      }

      this.field_2553 = this.field_1417;
      this.field_2068 = this.field_2654;
      this.field_1780 = this.field_2013;
      byte var1 = 5;
      double var2 = 0.0;

      for (int var4 = 0; var4 < var1; var4++) {
         double var5 = this.field_235.field_946 + (this.field_235.field_3132 - this.field_235.field_946) * (var4 + 0) / var1 - 0.125;
         double var7 = this.field_235.field_946 + (this.field_235.field_3132 - this.field_235.field_946) * (var4 + 1) / var1 - 0.125;
         Class630 var9 = Class630.method_969(
            this.field_235.field_2118, var5, this.field_235.field_1714, this.field_235.field_1702, var7, this.field_235.field_858
         );
         if (this.field_1468.method_684(var9, Class160.field_1413)) {
            var2 += 1.0 / var1;
         }
      }

      double var23 = var2 * 2.0 - 1.0;
      this.field_2501 += 0.04F * var23;
      if (this.field_1512 != null) {
         this.field_2549 = this.field_2549 + this.field_1512.field_2549 * 0.2;
         this.field_489 = this.field_489 + this.field_1512.field_489 * 0.2;
      }

      double var6 = 0.4;
      if (this.field_2549 < -var6) {
         this.field_2549 = -var6;
      }

      if (this.field_2549 > var6) {
         this.field_2549 = var6;
      }

      if (this.field_489 < -var6) {
         this.field_489 = -var6;
      }

      if (this.field_489 > var6) {
         this.field_489 = var6;
      }

      if (this.field_2669) {
         this.field_2549 *= 0.5;
         this.field_2501 *= 0.5;
         this.field_489 *= 0.5;
      }

      this.method_981(this.field_2549, this.field_2501, this.field_489);
      double var8 = Math.sqrt(this.field_2549 * this.field_2549 + this.field_489 * this.field_489);
      if (var8 > 0.15) {
         double var10 = Math.cos(this.field_1661 * Math.PI / 180.0);
         double var12 = Math.sin(this.field_1661 * Math.PI / 180.0);

         for (int var14 = 0; var14 < 1.0 + var8 * 60.0; var14++) {
            double var15 = this.field_2850.nextFloat() * 2.0F - 1.0F;
            double var17 = (this.field_2850.nextInt(2) * 2 - 1) * 0.7;
            if (this.field_2850.nextBoolean()) {
               double var19 = this.field_1417 - var10 * var15 * 0.8 + var12 * var17;
               double var21 = this.field_2013 - var12 * var15 * 0.8 - var10 * var17;
               this.field_1468.method_1347("splash", var19, this.field_2654 - 0.125, var21, this.field_2549, this.field_2501, this.field_489);
            } else {
               double var29 = this.field_1417 + var10 + var12 * var15 * 0.7;
               double var31 = this.field_2013 + var12 - var10 * var15 * 0.7;
               this.field_1468.method_1347("splash", var29, this.field_2654 - 0.125, var31, this.field_2549, this.field_2501, this.field_489);
            }
         }
      }

      if (this.field_1271 && var8 > 0.15) {
         this.method_1594();

         for (int var26 = 0; var26 < 3; var26++) {
            this.method_978(Class108.field_3148.field_2151, 1, 0.0F);
         }

         for (int var27 = 0; var27 < 2; var27++) {
            this.method_978(Class755.field_2717.field_10, 1, 0.0F);
         }
      } else {
         this.field_2549 *= 0.99F;
         this.field_2501 *= 0.95F;
         this.field_489 *= 0.99F;
      }

      this.field_2866 = 0.0F;
      double var24 = this.field_1661;
      double var25 = this.field_2553 - this.field_1417;
      double var28 = this.field_1780 - this.field_2013;
      if (var25 * var25 + var28 * var28 > 0.001) {
         var24 = (float)(Math.atan2(var28, var25) * 180.0 / Math.PI);
      }

      double var16 = var24 - this.field_1661;

      while (var16 >= 180.0) {
         var16 -= 360.0;
      }

      while (var16 < -180.0) {
         var16 += 360.0;
      }

      if (var16 > 20.0) {
         var16 = 20.0;
      }

      if (var16 < -20.0) {
         var16 = -20.0;
      }

      this.field_1661 = (float)(this.field_1661 + var16);
      this.method_1835(this.field_1661, this.field_2866);
      List var18 = this.field_1468.method_1349(this, this.field_235.method_1384(0.2F, 0.0, 0.2F));
      if (var18 != null && var18.size() > 0) {
         for (int var30 = 0; var30 < var18.size(); var30++) {
            Class359 var20 = (Class359)var18.get(var30);
            if (var20 != this.field_1512 && var20.method_966() && var20 instanceof Class256) {
               var20.method_1765(this);
            }
         }
      }

      if (this.field_1512 != null && this.field_1512.field_2642) {
         this.field_1512 = null;
      }
   }

   @Override
   protected void method_1582() {
      double var1 = Math.cos(this.field_1661 * Math.PI / 180.0) * 0.4;
      double var3 = Math.sin(this.field_1661 * Math.PI / 180.0) * 0.4;
      this.field_1512.method_172(this.field_1417 + var1, this.field_2654 + this.method_1612() + this.field_1512.method_658(), this.field_2013 + var3);
   }

   @Override
   protected void method_863(Class686 var1) {
   }

   @Override
   protected void method_1054(Class686 var1) {
   }

   @Override
   public float method_1140() {
      return 0.0F;
   }

   @Override
   public boolean method_30(Class354 var1) {
      var1.method_1050(this);
      return true;
   }
}
