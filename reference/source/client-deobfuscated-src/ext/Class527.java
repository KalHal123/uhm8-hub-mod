package ext;

import java.util.List;

public class Class527 extends Class359 implements Interface181 {
   private Class334[] field_1820 = new Class334[36];
   public int field_671 = 0;
   public int field_346 = 0;
   public int field_1567 = 1;
   private boolean field_169 = false;
   public int field_1840;
   public int field_1704;
   public double field_3065;
   public double field_1432;
   private static final int[][][] field_1888 = new int[][][]{
      {{0, 0, -1}, {0, 0, 1}},
      {{-1, 0, 0}, {1, 0, 0}},
      {{-1, -1, 0}, {1, 0, 0}},
      {{-1, 0, 0}, {1, -1, 0}},
      {{0, 0, -1}, {0, -1, 1}},
      {{0, -1, -1}, {0, 0, 1}},
      {{0, 0, 1}, {1, 0, 0}},
      {{0, 0, 1}, {-1, 0, 0}},
      {{0, 0, -1}, {-1, 0, 0}},
      {{0, 0, -1}, {1, 0, 0}}
   };
   private int field_1452;
   private double field_283;
   private double field_842;
   private double field_596;
   private double field_383;
   private double field_1958;

   public Class527(Class454 var1) {
      super(var1);
      this.field_1968 = true;
      this.method_244(0.98F, 0.7F);
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

   public Class527(Class454 var1, double var2, double var4, double var6, int var8) {
      this(var1);
      this.method_172(var2, var4 + this.field_838, var6);
      this.field_2549 = 0.0;
      this.field_2501 = 0.0;
      this.field_489 = 0.0;
      this.field_2553 = var2;
      this.field_2068 = var4;
      this.field_1780 = var6;
      this.field_1840 = var8;
   }

   @Override
   public double method_1612() {
      return this.field_1443 * 0.0 - 0.3F;
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      this.field_1567 = -this.field_1567;
      this.field_346 = 10;
      this.field_671 += var2 * 10;
      if (this.field_671 > 40) {
         this.method_978(Class755.field_1342.field_10, 1, 0.0F);
         if (this.field_1840 == 1) {
            this.method_978(Class108.field_93.field_2151, 1, 0.0F);
         } else if (this.field_1840 == 2) {
            this.method_978(Class108.field_2604.field_2151, 1, 0.0F);
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
   public void method_1594() {
      for (int var1 = 0; var1 < this.method_1574(); var1++) {
         Class334 var2 = this.method_1416(var1);
         if (var2 != null) {
            float var3 = this.field_2850.nextFloat() * 0.8F + 0.1F;
            float var4 = this.field_2850.nextFloat() * 0.8F + 0.1F;
            float var5 = this.field_2850.nextFloat() * 0.8F + 0.1F;

            while (var2.field_2326 > 0) {
               int var6 = this.field_2850.nextInt(21) + 10;
               if (var6 > var2.field_2326) {
                  var6 = var2.field_2326;
               }

               var2.field_2326 -= var6;
               Class198 var7 = new Class198(
                  this.field_1468, this.field_1417 + var3, this.field_2654 + var4, this.field_2013 + var5, new Class334(var2.field_1782, var6, var2.field_1862)
               );
               float var8 = 0.05F;
               var7.field_2549 = (float)this.field_2850.nextGaussian() * var8;
               var7.field_2501 = (float)this.field_2850.nextGaussian() * var8 + 0.2F;
               var7.field_489 = (float)this.field_2850.nextGaussian() * var8;
               this.field_1468.method_1447(var7);
            }
         }
      }

      super.method_1594();
   }

   @Override
   public void method_46() {
      if (this.field_1468.field_2994) {
         if (this.field_1452 > 0) {
            double var3 = this.field_1417 + (this.field_283 - this.field_1417) / this.field_1452;
            double var5 = this.field_2654 + (this.field_842 - this.field_2654) / this.field_1452;
            double var7 = this.field_2013 + (this.field_596 - this.field_2013) / this.field_1452;
            double var1 = this.field_383 - this.field_1661;

            while (var1 < -180.0) {
               var1 += 360.0;
            }

            while (var1 >= 180.0) {
               var1 -= 360.0;
            }

            this.field_1661 = (float)(this.field_1661 + var1 / this.field_1452);
            this.field_2866 = (float)(this.field_2866 + (this.field_1958 - this.field_2866) / this.field_1452);
            this.field_1452--;
            this.method_172(var3, var5, var7);
            this.method_1835(this.field_1661, this.field_2866);
         } else {
            this.method_172(this.field_1417, this.field_2654, this.field_2013);
            this.method_1835(this.field_1661, this.field_2866);
         }
      } else {
         if (this.field_346 > 0) {
            this.field_346--;
         }

         if (this.field_671 > 0) {
            this.field_671--;
         }

         this.field_2553 = this.field_1417;
         this.field_2068 = this.field_2654;
         this.field_1780 = this.field_2013;
         this.field_2501 -= 0.04F;
         int var44 = Class469.method_468(this.field_1417);
         int var4 = Class469.method_468(this.field_2654);
         int var45 = Class469.method_468(this.field_2013);
         if (this.field_1468.method_197(var44, var4 - 1, var45) == Class108.field_1008.field_2151) {
            var4--;
         }

         double var6 = 0.4;
         boolean var8 = false;
         double var43 = 0.0078125;
         if (this.field_1468.method_197(var44, var4, var45) == Class108.field_1008.field_2151) {
            Class214 var9 = this.method_612(this.field_1417, this.field_2654, this.field_2013);
            int var10 = this.field_1468.method_1110(var44, var4, var45);
            this.field_2654 = var4;
            if (var10 >= 2 && var10 <= 5) {
               this.field_2654 = var4 + 1;
            }

            if (var10 == 2) {
               this.field_2549 -= var43;
            }

            if (var10 == 3) {
               this.field_2549 += var43;
            }

            if (var10 == 4) {
               this.field_489 += var43;
            }

            if (var10 == 5) {
               this.field_489 -= var43;
            }

            int[][] var11 = field_1888[var10];
            double var12 = var11[1][0] - var11[0][0];
            double var14 = var11[1][2] - var11[0][2];
            double var16 = Math.sqrt(var12 * var12 + var14 * var14);
            double var18 = this.field_2549 * var12 + this.field_489 * var14;
            if (var18 < 0.0) {
               var12 = -var12;
               var14 = -var14;
            }

            double var20 = Math.sqrt(this.field_2549 * this.field_2549 + this.field_489 * this.field_489);
            this.field_2549 = var20 * var12 / var16;
            this.field_489 = var20 * var14 / var16;
            double var22 = 0.0;
            double var24 = var44 + 0.5 + var11[0][0] * 0.5;
            double var26 = var45 + 0.5 + var11[0][2] * 0.5;
            double var28 = var44 + 0.5 + var11[1][0] * 0.5;
            double var30 = var45 + 0.5 + var11[1][2] * 0.5;
            var12 = var28 - var24;
            var14 = var30 - var26;
            if (var12 == 0.0) {
               this.field_1417 = var44 + 0.5;
               var22 = this.field_2013 - var45;
            } else if (var14 == 0.0) {
               this.field_2013 = var45 + 0.5;
               var22 = this.field_1417 - var44;
            } else {
               double var32 = this.field_1417 - var24;
               double var34 = this.field_2013 - var26;
               double var36 = (var32 * var12 + var34 * var14) * 2.0;
               var22 = var36;
            }

            this.field_1417 = var24 + var12 * var22;
            this.field_2013 = var26 + var14 * var22;
            this.method_172(this.field_1417, this.field_2654 + this.field_838, this.field_2013);
            double var54 = this.field_2549;
            double var55 = this.field_489;
            if (this.field_1512 != null) {
               var54 *= 0.75;
               var55 *= 0.75;
            }

            if (var54 < -var6) {
               var54 = -var6;
            }

            if (var54 > var6) {
               var54 = var6;
            }

            if (var55 < -var6) {
               var55 = -var6;
            }

            if (var55 > var6) {
               var55 = var6;
            }

            this.method_981(var54, 0.0, var55);
            if (var11[0][1] != 0 && Class469.method_468(this.field_1417) - var44 == var11[0][0] && Class469.method_468(this.field_2013) - var45 == var11[0][2]) {
               this.method_172(this.field_1417, this.field_2654 + var11[0][1], this.field_2013);
            } else if (var11[1][1] != 0
               && Class469.method_468(this.field_1417) - var44 == var11[1][0]
               && Class469.method_468(this.field_2013) - var45 == var11[1][2]) {
               this.method_172(this.field_1417, this.field_2654 + var11[1][1], this.field_2013);
            }

            if (this.field_1512 != null) {
               this.field_2549 *= 0.997F;
               this.field_2501 *= 0.0;
               this.field_489 *= 0.997F;
            } else {
               if (this.field_1840 == 2) {
                  double var56 = Class469.method_822(this.field_3065 * this.field_3065 + this.field_1432 * this.field_1432);
                  if (var56 > 0.01) {
                     var8 = true;
                     this.field_3065 /= var56;
                     this.field_1432 /= var56;
                     double var38 = 0.04;
                     this.field_2549 *= 0.8F;
                     this.field_2501 *= 0.0;
                     this.field_489 *= 0.8F;
                     this.field_2549 = this.field_2549 + this.field_3065 * var38;
                     this.field_489 = this.field_489 + this.field_1432 * var38;
                  } else {
                     this.field_2549 *= 0.9F;
                     this.field_2501 *= 0.0;
                     this.field_489 *= 0.9F;
                  }
               }

               this.field_2549 *= 0.96F;
               this.field_2501 *= 0.0;
               this.field_489 *= 0.96F;
            }

            Class214 var57 = this.method_612(this.field_1417, this.field_2654, this.field_2013);
            if (var57 != null && var9 != null) {
               double var39 = (var9.field_1911 - var57.field_1911) * 0.05;
               var20 = Math.sqrt(this.field_2549 * this.field_2549 + this.field_489 * this.field_489);
               if (var20 > 0.0) {
                  this.field_2549 = this.field_2549 / var20 * (var20 + var39);
                  this.field_489 = this.field_489 / var20 * (var20 + var39);
               }

               this.method_172(this.field_1417, var57.field_1911, this.field_2013);
            }

            int var58 = Class469.method_468(this.field_1417);
            int var40 = Class469.method_468(this.field_2013);
            if (var58 != var44 || var40 != var45) {
               var20 = Math.sqrt(this.field_2549 * this.field_2549 + this.field_489 * this.field_489);
               this.field_2549 = var20 * (var58 - var44);
               this.field_489 = var20 * (var40 - var45);
            }

            if (this.field_1840 == 2) {
               double var41 = Class469.method_822(this.field_3065 * this.field_3065 + this.field_1432 * this.field_1432);
               if (var41 > 0.01 && this.field_2549 * this.field_2549 + this.field_489 * this.field_489 > 0.001) {
                  this.field_3065 /= var41;
                  this.field_1432 /= var41;
                  if (this.field_3065 * this.field_2549 + this.field_1432 * this.field_489 < 0.0) {
                     this.field_3065 = 0.0;
                     this.field_1432 = 0.0;
                  } else {
                     this.field_3065 = this.field_2549;
                     this.field_1432 = this.field_489;
                  }
               }
            }
         } else {
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
            if (!this.field_2669) {
               this.field_2549 *= 0.95F;
               this.field_2501 *= 0.95F;
               this.field_489 *= 0.95F;
            }
         }

         this.field_2866 = 0.0F;
         double var46 = this.field_2553 - this.field_1417;
         double var47 = this.field_1780 - this.field_2013;
         if (var46 * var46 + var47 * var47 > 0.001) {
            this.field_1661 = (float)(Math.atan2(var47, var46) * 180.0 / Math.PI);
            if (this.field_169) {
               this.field_1661 += 180.0F;
            }
         }

         double var13 = this.field_1661 - this.field_2772;

         while (var13 >= 180.0) {
            var13 -= 360.0;
         }

         while (var13 < -180.0) {
            var13 += 360.0;
         }

         if (var13 < -170.0 || var13 >= 170.0) {
            this.field_1661 += 180.0F;
            this.field_169 = !this.field_169;
         }

         this.method_1835(this.field_1661, this.field_2866);
         List var15 = this.field_1468.method_1349(this, this.field_235.method_1384(0.2F, 0.0, 0.2F));
         if (var15 != null && var15.size() > 0) {
            for (int var50 = 0; var50 < var15.size(); var50++) {
               Class359 var17 = (Class359)var15.get(var50);
               if (var17 != this.field_1512 && var17.method_966() && var17 instanceof Class527) {
                  var17.method_1765(this);
               }
            }
         }

         if (this.field_1512 != null && this.field_1512.field_2642) {
            this.field_1512 = null;
         }

         if (var8 && this.field_2850.nextInt(4) == 0) {
            this.field_1704--;
            if (this.field_1704 < 0) {
               this.field_3065 = this.field_1432 = 0.0;
            }

            this.field_1468.method_1347("largesmoke", this.field_1417, this.field_2654 + 0.8, this.field_2013, 0.0, 0.0, 0.0);
         }
      }
   }

   public Class214 method_1118(double var1, double var3, double var5, double var7) {
      int var9 = Class469.method_468(var1);
      int var10 = Class469.method_468(var3);
      int var11 = Class469.method_468(var5);
      if (this.field_1468.method_197(var9, var10 - 1, var11) == Class108.field_1008.field_2151) {
         var10--;
      }

      if (this.field_1468.method_197(var9, var10, var11) == Class108.field_1008.field_2151) {
         int var12 = this.field_1468.method_1110(var9, var10, var11);
         var3 = var10;
         if (var12 >= 2 && var12 <= 5) {
            var3 = var10 + 1;
         }

         int[][] var13 = field_1888[var12];
         double var14 = var13[1][0] - var13[0][0];
         double var16 = var13[1][2] - var13[0][2];
         double var18 = Math.sqrt(var14 * var14 + var16 * var16);
         var14 /= var18;
         var16 /= var18;
         var1 += var14 * var7;
         var5 += var16 * var7;
         if (var13[0][1] != 0 && Class469.method_468(var1) - var9 == var13[0][0] && Class469.method_468(var5) - var11 == var13[0][2]) {
            var3 += var13[0][1];
         } else if (var13[1][1] != 0 && Class469.method_468(var1) - var9 == var13[1][0] && Class469.method_468(var5) - var11 == var13[1][2]) {
            var3 += var13[1][1];
         }

         return this.method_612(var1, var3, var5);
      } else {
         return null;
      }
   }

   public Class214 method_612(double var1, double var3, double var5) {
      int var7 = Class469.method_468(var1);
      int var8 = Class469.method_468(var3);
      int var9 = Class469.method_468(var5);
      if (this.field_1468.method_197(var7, var8 - 1, var9) == Class108.field_1008.field_2151) {
         var8--;
      }

      if (this.field_1468.method_197(var7, var8, var9) == Class108.field_1008.field_2151) {
         int var10 = this.field_1468.method_1110(var7, var8, var9);
         var3 = var8;
         if (var10 >= 2 && var10 <= 5) {
            var3 = var8 + 1;
         }

         int[][] var11 = field_1888[var10];
         double var12 = 0.0;
         double var14 = var7 + 0.5 + var11[0][0] * 0.5;
         double var16 = var8 + 0.5 + var11[0][1] * 0.5;
         double var18 = var9 + 0.5 + var11[0][2] * 0.5;
         double var20 = var7 + 0.5 + var11[1][0] * 0.5;
         double var22 = var8 + 0.5 + var11[1][1] * 0.5;
         double var24 = var9 + 0.5 + var11[1][2] * 0.5;
         double var26 = var20 - var14;
         double var28 = (var22 - var16) * 2.0;
         double var30 = var24 - var18;
         if (var26 == 0.0) {
            var1 = var7 + 0.5;
            var12 = var5 - var9;
         } else if (var30 == 0.0) {
            var5 = var9 + 0.5;
            var12 = var1 - var7;
         } else {
            double var32 = var1 - var14;
            double var34 = var5 - var18;
            double var36 = (var32 * var26 + var34 * var30) * 2.0;
            var12 = var36;
         }

         var1 = var14 + var26 * var12;
         var3 = var16 + var28 * var12;
         var5 = var18 + var30 * var12;
         if (var28 < 0.0) {
            var3++;
         }

         if (var28 > 0.0) {
            var3 += 0.5;
         }

         return Class214.method_701(var1, var3, var5);
      } else {
         return null;
      }
   }

   @Override
   protected void method_863(Class686 var1) {
      var1.method_1310("Type", this.field_1840);
      if (this.field_1840 == 2) {
         var1.method_760("PushX", this.field_3065);
         var1.method_760("PushZ", this.field_1432);
         var1.method_777("Fuel", (short)this.field_1704);
      } else if (this.field_1840 == 1) {
         Class378 var2 = new Class378();

         for (int var3 = 0; var3 < this.field_1820.length; var3++) {
            if (this.field_1820[var3] != null) {
               Class686 var4 = new Class686();
               var4.method_1567("Slot", (byte)var3);
               this.field_1820[var3].method_1589(var4);
               var2.method_1885(var4);
            }
         }

         var1.method_936("Items", var2);
      }
   }

   @Override
   protected void method_1054(Class686 var1) {
      this.field_1840 = var1.method_1747("Type");
      if (this.field_1840 == 2) {
         this.field_3065 = var1.method_1417("PushX");
         this.field_1432 = var1.method_1417("PushZ");
         this.field_1704 = var1.method_1321("Fuel");
      } else if (this.field_1840 == 1) {
         Class378 var2 = var1.method_1609("Items");
         this.field_1820 = new Class334[this.method_1574()];

         for (int var3 = 0; var3 < var2.method_619(); var3++) {
            Class686 var4 = (Class686)var2.method_1557(var3);
            int var5 = var4.method_1913("Slot") & 255;
            if (var5 >= 0 && var5 < this.field_1820.length) {
               this.field_1820[var5] = new Class334(var4);
            }
         }
      }
   }

   @Override
   public float method_1140() {
      return 0.0F;
   }

   @Override
   public void method_1765(Class359 var1) {
      if (var1 != this.field_1512) {
         if (var1 instanceof Class377
            && !(var1 instanceof Class354)
            && this.field_1840 == 0
            && this.field_2549 * this.field_2549 + this.field_489 * this.field_489 > 0.01
            && this.field_1512 == null
            && var1.field_2322 == null) {
            var1.method_1050(this);
         }

         double var2 = var1.field_1417 - this.field_1417;
         double var4 = var1.field_2013 - this.field_2013;
         double var6 = var2 * var2 + var4 * var4;
         if (var6 >= 1.0E-4F) {
            var6 = Class469.method_822(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0 / var6;
            if (var8 > 1.0) {
               var8 = 1.0;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.1F;
            var4 *= 0.1F;
            var2 *= 1.0F - this.field_1941;
            var4 *= 1.0F - this.field_1941;
            var2 *= 0.5;
            var4 *= 0.5;
            if (var1 instanceof Class527) {
               double var10 = var1.field_2549 + this.field_2549;
               double var12 = var1.field_489 + this.field_489;
               if (((Class527)var1).field_1840 == 2 && this.field_1840 != 2) {
                  this.field_2549 *= 0.2F;
                  this.field_489 *= 0.2F;
                  this.method_1622(var1.field_2549 - var2, 0.0, var1.field_489 - var4);
                  var1.field_2549 *= 0.7F;
                  var1.field_489 *= 0.7F;
               } else if (((Class527)var1).field_1840 != 2 && this.field_1840 == 2) {
                  var1.field_2549 *= 0.2F;
                  var1.field_489 *= 0.2F;
                  var1.method_1622(this.field_2549 + var2, 0.0, this.field_489 + var4);
                  this.field_2549 *= 0.7F;
                  this.field_489 *= 0.7F;
               } else {
                  var10 /= 2.0;
                  var12 /= 2.0;
                  this.field_2549 *= 0.2F;
                  this.field_489 *= 0.2F;
                  this.method_1622(var10 - var2, 0.0, var12 - var4);
                  var1.field_2549 *= 0.2F;
                  var1.field_489 *= 0.2F;
                  var1.method_1622(var10 + var2, 0.0, var12 + var4);
               }
            } else {
               this.method_1622(-var2, 0.0, -var4);
               var1.method_1622(var2 / 4.0, 0.0, var4 / 4.0);
            }
         }
      }
   }

   @Override
   public int method_1574() {
      return 27;
   }

   @Override
   public Class334 method_1416(int var1) {
      return this.field_1820[var1];
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      if (this.field_1820[var1] != null) {
         if (this.field_1820[var1].field_2326 <= var2) {
            Class334 var4 = this.field_1820[var1];
            this.field_1820[var1] = null;
            return var4;
         }

         Class334 var3 = this.field_1820[var1].method_1502(var2);
         if (this.field_1820[var1].field_2326 == 0) {
            this.field_1820[var1] = null;
         }

         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      this.field_1820[var1] = var2;
      if (var2 != null && var2.field_2326 > this.method_1387()) {
         var2.field_2326 = this.method_1387();
      }
   }

   @Override
   public String method_18() {
      return "Minecart";
   }

   @Override
   public int method_1387() {
      return 64;
   }

   @Override
   public void method_1831() {
   }

   @Override
   public boolean method_30(Class354 var1) {
      if (this.field_1840 == 0) {
         var1.method_1050(this);
      } else if (this.field_1840 == 1) {
         var1.method_1217(this);
      } else if (this.field_1840 == 2) {
         Class334 var2 = var1.field_559.method_93();
         if (var2 != null && var2.field_1782 == Class755.field_1058.field_10) {
            if (--var2.field_2326 == 0) {
               var1.field_559.method_708(var1.field_559.field_2127, (Class334)null);
            }

            this.field_1704 += 1200;
         }

         this.field_3065 = this.field_1417 - var1.field_1417;
         this.field_1432 = this.field_2013 - var1.field_2013;
      }

      return true;
   }

   @Override
   public void method_1551(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_283 = var1;
      this.field_842 = var3;
      this.field_596 = var5;
      this.field_383 = var7;
      this.field_1958 = var8;
      this.field_1452 = var9;
   }
}
