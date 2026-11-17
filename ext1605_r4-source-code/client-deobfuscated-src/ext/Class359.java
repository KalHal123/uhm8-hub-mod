package ext;

import java.util.List;
import java.util.Random;

public abstract class Class359 {
   private static int field_747 = 0;
   public int field_1767 = field_747++;
   public double field_2054 = 1.0;
   public boolean field_1968 = false;
   public Class359 field_1512;
   public Class359 field_2322;
   public Class454 field_1468;
   public double field_2553;
   public double field_2068;
   public double field_1780;
   public double field_1417;
   public double field_2654;
   public double field_2013;
   public double field_2549;
   public double field_2501;
   public double field_489;
   public float field_1661;
   public float field_2866;
   public float field_2772;
   public float field_2984;
   public final Class630 field_235 = Class630.method_769(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   public boolean field_2669 = false;
   public boolean field_1271;
   public boolean field_1269;
   public boolean field_1695 = false;
   public boolean field_3059 = true;
   public boolean field_2642 = false;
   public float field_838 = 0.0F;
   public float field_811 = 0.6F;
   public float field_1443 = 1.8F;
   public float field_621 = 0.0F;
   public float field_574 = 0.0F;
   protected boolean field_1522 = true;
   protected float field_1313 = 0.0F;
   private int field_1718 = 1;
   public double field_2173;
   public double field_2270;
   public double field_1907;
   public float field_663 = 0.0F;
   public float field_2827 = 0.0F;
   public boolean field_236 = false;
   public float field_1941 = 0.0F;
   public boolean field_722 = false;
   public Random field_2850 = new Random();
   public int field_1399 = 0;
   public int field_734 = 1;
   public int field_1439 = 0;
   protected int field_2004 = 300;
   protected boolean field_1411 = false;
   public int field_1659 = 0;
   public int field_1804 = 300;
   private boolean field_2369 = true;
   public String field_1795;
   private double field_1106;
   private double field_242;
   public boolean field_374 = false;
   public int field_3078;
   public int field_255;
   public int field_2552;
   public int field_593;
   public int field_2175;
   public int field_2857;

   public Class359(Class454 var1) {
      this.field_1468 = var1;
      this.method_172(0.0, 0.0, 0.0);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class359 ? ((Class359)var1).field_1767 == this.field_1767 : false;
   }

   @Override
   public int hashCode() {
      return this.field_1767;
   }

   protected void method_735() {
      if (this.field_1468 != null) {
         while (true) {
            if (this.field_2654 > 0.0) {
               this.method_172(this.field_1417, this.field_2654, this.field_2013);
               if (this.field_1468.method_1325(this, this.field_235).size() != 0) {
                  this.field_2654++;
                  continue;
               }
            }

            this.field_2549 = this.field_2501 = this.field_489 = 0.0;
            this.field_2866 = 0.0F;
            break;
         }
      }
   }

   public void method_1594() {
      this.field_2642 = true;
   }

   protected void method_244(float var1, float var2) {
      this.field_811 = var1;
      this.field_1443 = var2;
   }

   protected void method_1835(float var1, float var2) {
      this.field_1661 = var1;
      this.field_2866 = var2;
   }

   public void method_172(double var1, double var3, double var5) {
      this.field_1417 = var1;
      this.field_2654 = var3;
      this.field_2013 = var5;
      float var7 = this.field_811 / 2.0F;
      float var8 = this.field_1443;
      this.field_235
         .method_327(var1 - var7, var3 - this.field_838 + this.field_663, var5 - var7, var1 + var7, var3 - this.field_838 + this.field_663 + var8, var5 + var7);
   }

   public void method_1775(float var1, float var2) {
      float var3 = this.field_2866;
      float var4 = this.field_1661;
      this.field_1661 = (float)(this.field_1661 + var1 * 0.15);
      this.field_2866 = (float)(this.field_2866 - var2 * 0.15);
      if (this.field_2866 < -90.0F) {
         this.field_2866 = -90.0F;
      }

      if (this.field_2866 > 90.0F) {
         this.field_2866 = 90.0F;
      }

      this.field_2984 = this.field_2984 + (this.field_2866 - var3);
      this.field_2772 = this.field_2772 + (this.field_1661 - var4);
   }

   public void method_46() {
      this.method_1607();
   }

   public void method_1607() {
      if (this.field_2322 != null && this.field_2322.field_2642) {
         this.field_2322 = null;
      }

      this.field_1399++;
      this.field_621 = this.field_574;
      this.field_2553 = this.field_1417;
      this.field_2068 = this.field_2654;
      this.field_1780 = this.field_2013;
      this.field_2984 = this.field_2866;
      this.field_2772 = this.field_1661;
      if (this.method_36()) {
         if (!this.field_1411 && !this.field_2369) {
            float var1 = Class469.method_822(
                  this.field_2549 * this.field_2549 * 0.2F + this.field_2501 * this.field_2501 + this.field_489 * this.field_489 * 0.2F
               )
               * 0.2F;
            if (var1 > 1.0F) {
               var1 = 1.0F;
            }

            this.field_1468.method_1904(this, "random.splash", var1, 1.0F + (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.4F);
            float var2 = Class469.method_468(this.field_235.field_946);

            for (int var3 = 0; var3 < 1.0F + this.field_811 * 20.0F; var3++) {
               float var4 = (this.field_2850.nextFloat() * 2.0F - 1.0F) * this.field_811;
               float var5 = (this.field_2850.nextFloat() * 2.0F - 1.0F) * this.field_811;
               this.field_1468
                  .method_1347(
                     "bubble",
                     this.field_1417 + var4,
                     var2 + 1.0F,
                     this.field_2013 + var5,
                     this.field_2549,
                     this.field_2501 - this.field_2850.nextFloat() * 0.2F,
                     this.field_489
                  );
            }

            for (int var6 = 0; var6 < 1.0F + this.field_811 * 20.0F; var6++) {
               float var7 = (this.field_2850.nextFloat() * 2.0F - 1.0F) * this.field_811;
               float var8 = (this.field_2850.nextFloat() * 2.0F - 1.0F) * this.field_811;
               this.field_1468
                  .method_1347("splash", this.field_1417 + var7, var2 + 1.0F, this.field_2013 + var8, this.field_2549, this.field_2501, this.field_489);
            }
         }

         this.field_1313 = 0.0F;
         this.field_1411 = true;
         this.field_1439 = 0;
      } else {
         this.field_1411 = false;
      }

      this.method_155();
      if (this.method_1059()) {
         this.method_308((Class359)null, 10);
         this.field_1439 = 600;
      }

      if (this.field_2654 < -64.0) {
         this.method_656();
      }

      this.field_2369 = false;
   }

   protected void method_155() {
      if (this.field_1439 > 0) {
         if (this.method_1428() && this.field_1439 % 20 == 0) {
            this.method_308((Class359)null, 1);
         }

         this.field_1439--;
      }
   }

   protected boolean method_1428() {
      return true;
   }

   protected void method_656() {
      this.method_1594();
   }

   public boolean method_1412(double var1, double var3, double var5) {
      Class630 var7 = this.field_235.method_1032(var1, var3, var5);
      List var8 = this.field_1468.method_1325(this, var7);
      return var8.size() > 0 ? false : !this.field_1468.method_1781(var7);
   }

   public void method_981(double var1, double var3, double var5) {
      if (this.field_236) {
         this.field_235.method_1200(var1, var3, var5);
         this.field_1417 = (this.field_235.field_2118 + this.field_235.field_1702) / 2.0;
         this.field_2654 = this.field_235.field_946 + this.field_838 - this.field_663;
         this.field_2013 = (this.field_235.field_1714 + this.field_235.field_858) / 2.0;
      } else {
         double var7 = this.field_1417;
         double var9 = this.field_2013;
         double var11 = var1;
         double var13 = var3;
         double var15 = var5;
         Class630 var17 = this.field_235.method_1038();
         boolean var18 = this.field_2669 && this.method_296();
         if (var18) {
            double var19 = 0.05;

            while (var1 != 0.0 && this.field_1468.method_1325(this, this.field_235.method_1032(var1, -1.0, 0.0)).size() == 0) {
               if (var1 < var19 && var1 >= -var19) {
                  var1 = 0.0;
               } else if (var1 > 0.0) {
                  var1 -= var19;
               } else {
                  var1 += var19;
               }

               var11 = var1;
            }

            for (; var5 != 0.0 && this.field_1468.method_1325(this, this.field_235.method_1032(0.0, -1.0, var5)).size() == 0; var15 = var5) {
               if (var5 < var19 && var5 >= -var19) {
                  var5 = 0.0;
               } else if (var5 > 0.0) {
                  var5 -= var19;
               } else {
                  var5 += var19;
               }
            }
         }

         List var36 = this.field_1468.method_1325(this, this.field_235.method_1669(var1, var3, var5));

         for (int var20 = 0; var20 < var36.size(); var20++) {
            var3 = ((Class630)var36.get(var20)).method_776(this.field_235, var3);
         }

         this.field_235.method_1200(0.0, var3, 0.0);
         if (!this.field_3059 && var13 != var3) {
            var5 = 0.0;
            var3 = 0.0;
            var1 = 0.0;
         }

         boolean var38 = this.field_2669 || var13 != var3 && var13 < 0.0;

         for (int var21 = 0; var21 < var36.size(); var21++) {
            var1 = ((Class630)var36.get(var21)).method_602(this.field_235, var1);
         }

         this.field_235.method_1200(var1, 0.0, 0.0);
         if (!this.field_3059 && var11 != var1) {
            var5 = 0.0;
            var3 = 0.0;
            var1 = 0.0;
         }

         for (int var39 = 0; var39 < var36.size(); var39++) {
            var5 = ((Class630)var36.get(var39)).method_1718(this.field_235, var5);
         }

         this.field_235.method_1200(0.0, 0.0, var5);
         if (!this.field_3059 && var15 != var5) {
            var5 = 0.0;
            var3 = 0.0;
            var1 = 0.0;
         }

         if (this.field_2827 > 0.0F && var38 && this.field_663 < 0.05F && (var11 != var1 || var15 != var5)) {
            double var25 = var1;
            double var22 = var3;
            double var27 = var5;
            var1 = var11;
            var3 = this.field_2827;
            var5 = var15;
            Class630 var29 = this.field_235.method_1038();
            this.field_235.method_313(var17);
            var36 = this.field_1468.method_1325(this, this.field_235.method_1669(var11, var3, var15));

            for (int var24 = 0; var24 < var36.size(); var24++) {
               var3 = ((Class630)var36.get(var24)).method_776(this.field_235, var3);
            }

            this.field_235.method_1200(0.0, var3, 0.0);
            if (!this.field_3059 && var13 != var3) {
               var5 = 0.0;
               var3 = 0.0;
               var1 = 0.0;
            }

            for (int var41 = 0; var41 < var36.size(); var41++) {
               var1 = ((Class630)var36.get(var41)).method_602(this.field_235, var1);
            }

            this.field_235.method_1200(var1, 0.0, 0.0);
            if (!this.field_3059 && var11 != var1) {
               var5 = 0.0;
               var3 = 0.0;
               var1 = 0.0;
            }

            for (int var42 = 0; var42 < var36.size(); var42++) {
               var5 = ((Class630)var36.get(var42)).method_1718(this.field_235, var5);
            }

            this.field_235.method_1200(0.0, 0.0, var5);
            if (!this.field_3059 && var15 != var5) {
               var5 = 0.0;
               var3 = 0.0;
               var1 = 0.0;
            }

            if (var25 * var25 + var27 * var27 >= var1 * var1 + var5 * var5) {
               var1 = var25;
               var3 = var22;
               var5 = var27;
               this.field_235.method_313(var29);
            } else {
               this.field_663 = (float)(this.field_663 + 0.5);
            }
         }

         this.field_1417 = (this.field_235.field_2118 + this.field_235.field_1702) / 2.0;
         this.field_2654 = this.field_235.field_946 + this.field_838 - this.field_663;
         this.field_2013 = (this.field_235.field_1714 + this.field_235.field_858) / 2.0;
         this.field_1271 = var11 != var1 || var15 != var5;
         this.field_1269 = var13 != var3;
         this.field_2669 = var13 != var3 && var13 < 0.0;
         this.field_1695 = this.field_1271 || this.field_1269;
         if (this.field_2669) {
            if (this.field_1313 > 0.0F) {
               this.method_1318(this.field_1313);
               this.field_1313 = 0.0F;
            }
         } else if (var3 < 0.0) {
            this.field_1313 = (float)(this.field_1313 - var3);
         }

         if (var11 != var1) {
            this.field_2549 = 0.0;
         }

         if (var13 != var3) {
            this.field_2501 = 0.0;
         }

         if (var15 != var5) {
            this.field_489 = 0.0;
         }

         double var45 = this.field_1417 - var7;
         double var40 = this.field_2013 - var9;
         this.field_574 = (float)(this.field_574 + Class469.method_822(var45 * var45 + var40 * var40) * 0.6);
         if (this.field_1522 && !var18) {
            int var28 = Class469.method_468(this.field_1417);
            int var46 = Class469.method_468(this.field_2654 - 0.2F - this.field_838);
            int var49 = Class469.method_468(this.field_2013);
            int var43 = this.field_1468.method_197(var28, var46, var49);
            if (this.field_574 > this.field_1718) {
               this.field_1718++;
               if (var43 > 0) {
                  Class358 var30 = Class108.field_1221[var43].field_972;
                  if (this.field_1468.method_197(var28, var46 + 1, var49) == Class108.field_1070.field_2151) {
                     var30 = Class108.field_1070.field_972;
                     this.field_1468.method_1904(this, var30.method_804(), var30.method_1010() * 0.15F, var30.method_1263());
                  } else if (!Class108.field_1221[var43].field_1854.method_743()) {
                     this.field_1468.method_1904(this, var30.method_804(), var30.method_1010() * 0.15F, var30.method_1263());
                  }

                  Class108.field_1221[var43].method_1507(this.field_1468, var28, var46, var49, this);
               }
            }
         }

         int var48 = Class469.method_468(this.field_235.field_2118);
         int var47 = Class469.method_468(this.field_235.field_946);
         int var50 = Class469.method_468(this.field_235.field_1714);
         int var44 = Class469.method_468(this.field_235.field_1702);
         int var52 = Class469.method_468(this.field_235.field_3132);
         int var31 = Class469.method_468(this.field_235.field_858);

         for (int var32 = var48; var32 <= var44; var32++) {
            for (int var33 = var47; var33 <= var52; var33++) {
               for (int var34 = var50; var34 <= var31; var34++) {
                  int var35 = this.field_1468.method_197(var32, var33, var34);
                  if (var35 > 0) {
                     Class108.field_1221[var35].method_1220(this.field_1468, var32, var33, var34, this);
                  }
               }
            }
         }

         this.field_663 *= 0.4F;
         boolean var53 = this.method_36();
         if (this.field_1468.method_449(this.field_235)) {
            this.method_211(1);
            if (!var53) {
               this.field_1439++;
               if (this.field_1439 == 0) {
                  this.field_1439 = 300;
               }
            }
         } else if (this.field_1439 <= 0) {
            this.field_1439 = -this.field_734;
         }

         if (var53 && this.field_1439 > 0) {
            this.field_1468.method_1904(this, "random.fizz", 0.7F, 1.6F + (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.4F);
            this.field_1439 = -this.field_734;
         }
      }
   }

   public boolean method_296() {
      return false;
   }

   public Class630 method_611() {
      return null;
   }

   protected void method_211(int var1) {
      if (this.method_1428()) {
         this.method_308((Class359)null, var1);
      }
   }

   protected void method_1318(float var1) {
   }

   public boolean method_36() {
      return this.field_1468.method_461(this.field_235.method_1384(0.0, -0.4F, 0.0), Class160.field_1413, this);
   }

   public boolean method_482(Class160 var1) {
      double var2 = this.field_2654 + this.method_1875();
      int var4 = Class469.method_468(this.field_1417);
      int var5 = Class469.method_893(Class469.method_468(var2));
      int var6 = Class469.method_468(this.field_2013);
      int var7 = this.field_1468.method_197(var4, var5, var6);
      if (var7 != 0 && Class108.field_1221[var7].field_1854 == var1) {
         float var8 = Class722.method_74(this.field_1468.method_1110(var4, var5, var6)) - 0.11111111F;
         float var9 = var5 + 1 - var8;
         return var2 < var9;
      } else {
         return false;
      }
   }

   protected float method_1875() {
      return 0.0F;
   }

   public boolean method_1059() {
      return this.field_1468.method_1608(this.field_235.method_1384(0.0, -0.4F, 0.0), Class160.field_3120);
   }

   public void method_871(float var1, float var2, float var3) {
      this.method_1023(var1, var2, var3, 0.0F);
   }

   public void method_1023(float var1, float var2, float var3, float var4) {
      float var5 = Class469.method_254(var1 * var1 + var2 * var2);
      if (var5 >= 0.01F) {
         if (var5 < 1.0F) {
            var5 = 1.0F;
         }

         var5 = var3 / var5;
         var1 *= var5;
         var2 *= var5;
         float var6 = Class469.method_1667(this.field_1661 * (float) Math.PI / 180.0F);
         float var7 = Class469.method_255(this.field_1661 * (float) Math.PI / 180.0F);
         this.field_2549 += var1 * var7 - var2 * var6;
         this.field_489 += var2 * var7 + var1 * var6;
         this.field_2501 += var4;
      }
   }

   public float method_50(float var1) {
      int var2 = Class469.method_468(this.field_1417);
      double var3 = (this.field_235.field_3132 - this.field_235.field_946) * 0.66;
      int var5 = Class469.method_468(this.field_2654 - this.field_838 + var3);
      int var6 = Class469.method_468(this.field_2013);
      return this.field_1468.method_1154(var2, var5, var6);
   }

   public void method_712(Class454 var1) {
      this.field_1468 = var1;
   }

   public void method_1910(double var1, double var3, double var5, float var7, float var8) {
      this.field_2553 = this.field_1417 = var1;
      this.field_2068 = this.field_2654 = var3;
      this.field_1780 = this.field_2013 = var5;
      this.field_1661 = var7;
      this.field_2866 = var8;
      this.field_663 = 0.0F;
      double var9 = this.field_2772 - var7;
      if (var9 < -180.0) {
         this.field_2772 += 360.0F;
      }

      if (var9 >= 180.0) {
         this.field_2772 -= 360.0F;
      }

      this.method_172(this.field_1417, this.field_2654, this.field_2013);
   }

   public void method_253(double var1, double var3, double var5, float var7, float var8) {
      this.field_2553 = this.field_1417 = var1;
      this.field_2068 = this.field_2654 = var3 + this.field_838;
      this.field_1780 = this.field_2013 = var5;
      this.field_1661 = var7;
      this.field_2866 = var8;
      this.method_172(this.field_1417, this.field_2654, this.field_2013);
   }

   public float method_304(Class359 var1) {
      float var2 = (float)(this.field_1417 - var1.field_1417);
      float var3 = (float)(this.field_2654 - var1.field_2654);
      float var4 = (float)(this.field_2013 - var1.field_2013);
      return Class469.method_254(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double method_645(double var1, double var3, double var5) {
      double var7 = this.field_1417 - var1;
      double var9 = this.field_2654 - var3;
      double var11 = this.field_2013 - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double method_889(double var1, double var3, double var5) {
      double var7 = this.field_1417 - var1;
      double var9 = this.field_2654 - var3;
      double var11 = this.field_2013 - var5;
      return Class469.method_822(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double method_727(Class359 var1) {
      double var2 = this.field_1417 - var1.field_1417;
      double var4 = this.field_2654 - var1.field_2654;
      double var6 = this.field_2013 - var1.field_2013;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void method_1714(Class354 var1) {
   }

   public void method_1765(Class359 var1) {
      if (var1.field_1512 != this && var1.field_2322 != this) {
         double var2 = var1.field_1417 - this.field_1417;
         double var4 = var1.field_2013 - this.field_2013;
         double var6 = Class469.method_1146(var2, var4);
         if (var6 >= 0.01F) {
            var6 = Class469.method_822(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0 / var6;
            if (var8 > 1.0) {
               var8 = 1.0;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.05F;
            var4 *= 0.05F;
            var2 *= 1.0F - this.field_1941;
            var4 *= 1.0F - this.field_1941;
            this.method_1622(-var2, 0.0, -var4);
            var1.method_1622(var2, 0.0, var4);
         }
      }
   }

   public void method_1622(double var1, double var3, double var5) {
      this.field_2549 += var1;
      this.field_2501 += var3;
      this.field_489 += var5;
   }

   public boolean method_308(Class359 var1, int var2) {
      return false;
   }

   public boolean method_243() {
      return false;
   }

   public boolean method_966() {
      return false;
   }

   public void method_395(Class359 var1, int var2) {
   }

   public boolean method_1739(Class214 var1) {
      double var2 = this.field_1417 - var1.field_882;
      double var4 = this.field_2654 - var1.field_1911;
      double var6 = this.field_2013 - var1.field_3045;
      double var8 = var2 * var2 + var4 * var4 + var6 * var6;
      return this.method_306(var8);
   }

   public boolean method_306(double var1) {
      double var3 = this.field_235.method_1479();
      var3 *= 128.0 * this.field_2054;
      return var1 < var3 * var3;
   }

   public String method_431() {
      return null;
   }

   public boolean method_627(Class686 var1) {
      String var2 = this.method_354();
      if (!this.field_2642 && var2 != null) {
         var1.method_375("id", var2);
         this.method_374(var1);
         return true;
      } else {
         return false;
      }
   }

   public void method_374(Class686 var1) {
      var1.method_936(Class614.method_1576(Class614.field_2242), this.method_1369(this.field_1417, this.field_2654, this.field_2013));
      var1.method_936(Class614.method_1576(Class614.field_438), this.method_1369(this.field_2549, this.field_2501, this.field_489));
      var1.method_936("Rotation", this.method_1001(this.field_1661, this.field_2866));
      var1.method_1598("FallDistance", this.field_1313);
      var1.method_777("Fire", (short)this.field_1439);
      var1.method_777("Air", (short)this.field_1804);
      var1.method_698("OnGround", this.field_2669);
      this.method_863(var1);
   }

   public void method_783(Class686 var1) {
      Class378 var2 = var1.method_1609(Class614.method_1576(Class614.field_2242));
      Class378 var3 = var1.method_1609(Class614.method_1576(Class614.field_438));
      Class378 var4 = var1.method_1609("Rotation");
      this.method_172(0.0, 0.0, 0.0);
      this.field_2549 = ((Class153)var3.method_1557(0)).field_818;
      this.field_2501 = ((Class153)var3.method_1557(1)).field_818;
      this.field_489 = ((Class153)var3.method_1557(2)).field_818;
      this.field_2553 = this.field_2173 = this.field_1417 = ((Class153)var2.method_1557(0)).field_818;
      this.field_2068 = this.field_2270 = this.field_2654 = ((Class153)var2.method_1557(1)).field_818;
      this.field_1780 = this.field_1907 = this.field_2013 = ((Class153)var2.method_1557(2)).field_818;
      this.field_2772 = this.field_1661 = ((Class27)var4.method_1557(0)).field_2440;
      this.field_2984 = this.field_2866 = ((Class27)var4.method_1557(1)).field_2440;
      this.field_1313 = var1.method_124("FallDistance");
      this.field_1439 = var1.method_1321("Fire");
      this.field_1804 = var1.method_1321("Air");
      this.field_2669 = var1.method_1336("OnGround");
      this.method_172(this.field_1417, this.field_2654, this.field_2013);
      this.method_1054(var1);
   }

   protected final String method_354() {
      return Class174.method_1053(this);
   }

   protected abstract void method_1054(Class686 var1);

   protected abstract void method_863(Class686 var1);

   protected Class378 method_1369(double... var1) {
      Class378 var2 = new Class378();
      double[] var3 = var1;
      int var4 = var1.length;

      for (int var5 = 0; var5 < var4; var5++) {
         double var6 = var3[var5];
         var2.method_1885(new Class153(var6));
      }

      return var2;
   }

   protected Class378 method_1001(float... var1) {
      Class378 var2 = new Class378();
      float[] var3 = var1;
      int var4 = var1.length;

      for (int var5 = 0; var5 < var4; var5++) {
         float var6 = var3[var5];
         var2.method_1885(new Class27(var6));
      }

      return var2;
   }

   public float method_1140() {
      return this.field_1443 / 2.0F;
   }

   public Class198 method_203(int var1, int var2) {
      return this.method_978(var1, var2, 0.0F);
   }

   public Class198 method_978(int var1, int var2, float var3) {
      Class198 var4 = new Class198(this.field_1468, this.field_1417, this.field_2654 + var3, this.field_2013, new Class334(var1, var2));
      var4.field_2283 = 10;
      this.field_1468.method_1447(var4);
      return var4;
   }

   public boolean method_1251() {
      return !this.field_2642;
   }

   public boolean method_905() {
      int var1 = Class469.method_468(this.field_1417);
      int var2 = Class469.method_468(this.field_2654 + this.method_1875());
      int var3 = Class469.method_468(this.field_2013);
      return this.field_1468.method_768(var1, var2, var3);
   }

   public boolean method_30(Class354 var1) {
      return false;
   }

   public Class630 method_1056(Class359 var1) {
      return null;
   }

   public void method_85() {
      if (this.field_2322.field_2642) {
         this.field_2322 = null;
      } else {
         this.field_2549 = 0.0;
         this.field_2501 = 0.0;
         this.field_489 = 0.0;
         this.method_46();
         this.field_2322.method_1582();
         this.field_242 = this.field_242 + (this.field_2322.field_1661 - this.field_2322.field_2772);
         this.field_1106 = this.field_1106 + (this.field_2322.field_2866 - this.field_2322.field_2984);

         while (this.field_242 >= 180.0) {
            this.field_242 -= 360.0;
         }

         while (this.field_242 < -180.0) {
            this.field_242 += 360.0;
         }

         while (this.field_1106 >= 180.0) {
            this.field_1106 -= 360.0;
         }

         while (this.field_1106 < -180.0) {
            this.field_1106 += 360.0;
         }

         double var1 = this.field_242 * 0.5;
         double var3 = this.field_1106 * 0.5;
         float var5 = 10.0F;
         if (var1 > var5) {
            var1 = var5;
         }

         if (var1 < -var5) {
            var1 = -var5;
         }

         if (var3 > var5) {
            var3 = var5;
         }

         if (var3 < -var5) {
            var3 = -var5;
         }

         this.field_242 -= var1;
         this.field_1106 -= var3;
         this.field_1661 = (float)(this.field_1661 + var1);
         this.field_2866 = (float)(this.field_2866 + var3);
      }
   }

   protected void method_1582() {
      this.field_1512.method_172(this.field_1417, this.field_2654 + this.method_1612() + this.field_1512.method_658(), this.field_2013);
   }

   public double method_658() {
      return this.field_838;
   }

   public double method_1612() {
      return this.field_1443 * 0.75;
   }

   public void method_1050(Class359 var1) {
      this.field_1106 = 0.0;
      this.field_242 = 0.0;
      if (this.field_2322 == var1) {
         this.field_2322.field_1512 = null;
         this.field_2322 = null;
         this.method_253(var1.field_1417, var1.field_235.field_946 + var1.field_1443, var1.field_2013, this.field_1661, this.field_2866);
      } else {
         if (this.field_2322 != null) {
            this.field_2322.field_1512 = null;
         }

         if (var1.field_1512 != null) {
            var1.field_1512.field_2322 = null;
         }

         this.field_2322 = var1;
         var1.field_1512 = this;
      }
   }

   public void method_1551(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.method_172(var1, var3, var5);
      this.method_1835(var7, var8);
   }
}
