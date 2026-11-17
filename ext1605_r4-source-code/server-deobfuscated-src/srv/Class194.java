package srv;

import java.util.List;

public class Class194 extends Class252 implements Interface327 {
   private Class150[] field_483 = new Class150[36];
   public int field_801 = 0;
   public int field_1349 = 0;
   public int field_1244 = 1;
   private boolean field_58 = false;
   public int field_1134;
   public int field_1213;
   public double field_1558;
   public double field_1179;
   private static final int[][][] field_834 = new int[][][]{
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
   private int field_1195;
   private double field_1553;
   private double field_1479;
   private double field_1099;
   private double field_1204;
   private double field_1146;

   public Class194(Class317 var1) {
      super(var1);
      this.field_1240 = true;
      this.method_273(0.98F, 0.7F);
      this.field_855 = this.field_907 / 2.0F;
      this.field_288 = false;
   }

   @Override
   public Class94 method_782(Class252 var1) {
      return var1.field_106;
   }

   @Override
   public Class94 method_190() {
      return this.field_106;
   }

   @Override
   public boolean method_318() {
      return true;
   }

   public Class194(Class317 var1, double var2, double var4, double var6, int var8) {
      this(var1);
      this.method_732(var2, var4 + this.field_855, var6);
      this.field_607 = 0.0;
      this.field_780 = 0.0;
      this.field_921 = 0.0;
      this.field_146 = var2;
      this.field_732 = var4;
      this.field_271 = var6;
      this.field_1134 = var8;
   }

   @Override
   public double method_760() {
      return this.field_907 * 0.0 - 0.3F;
   }

   @Override
   public boolean method_671(Class252 var1, int var2) {
      this.field_1244 = -this.field_1244;
      this.field_1349 = 10;
      this.field_801 += var2 * 10;
      if (this.field_801 > 40) {
         this.method_355(Class350.field_1159.field_473, 1, 0.0F);
         if (this.field_1134 == 1) {
            this.method_355(Class371.field_649.field_1379, 1, 0.0F);
         } else if (this.field_1134 == 2) {
            this.method_355(Class371.field_423.field_1379, 1, 0.0F);
         }

         this.method_715();
      }

      return true;
   }

   @Override
   public boolean method_947() {
      return !this.field_120;
   }

   @Override
   public void method_715() {
      for (int var1 = 0; var1 < this.method_214(); var1++) {
         Class150 var2 = this.method_908(var1);
         if (var2 != null) {
            float var3 = this.field_697.nextFloat() * 0.8F + 0.1F;
            float var4 = this.field_697.nextFloat() * 0.8F + 0.1F;
            float var5 = this.field_697.nextFloat() * 0.8F + 0.1F;

            while (var2.field_1497 > 0) {
               int var6 = this.field_697.nextInt(21) + 10;
               if (var6 > var2.field_1497) {
                  var6 = var2.field_1497;
               }

               var2.field_1497 -= var6;
               Class39 var7 = new Class39(
                  this.field_796, this.field_1324 + var3, this.field_632 + var4, this.field_1321 + var5, new Class150(var2.field_1298, var6, var2.field_819)
               );
               float var8 = 0.05F;
               var7.field_607 = (float)this.field_697.nextGaussian() * var8;
               var7.field_780 = (float)this.field_697.nextGaussian() * var8 + 0.2F;
               var7.field_921 = (float)this.field_697.nextGaussian() * var8;
               this.field_796.method_237(var7);
            }
         }
      }

      super.method_715();
   }

   @Override
   public void method_439() {
      if (this.field_796.field_906) {
         if (this.field_1195 > 0) {
            double var3 = this.field_1324 + (this.field_1553 - this.field_1324) / this.field_1195;
            double var5 = this.field_632 + (this.field_1479 - this.field_632) / this.field_1195;
            double var7 = this.field_1321 + (this.field_1099 - this.field_1321) / this.field_1195;
            double var1 = this.field_1204 - this.field_909;

            while (var1 < -180.0) {
               var1 += 360.0;
            }

            while (var1 >= 180.0) {
               var1 -= 360.0;
            }

            this.field_909 = (float)(this.field_909 + var1 / this.field_1195);
            this.field_427 = (float)(this.field_427 + (this.field_1146 - this.field_427) / this.field_1195);
            this.field_1195--;
            this.method_732(var3, var5, var7);
            this.method_254(this.field_909, this.field_427);
         } else {
            this.method_732(this.field_1324, this.field_632, this.field_1321);
            this.method_254(this.field_909, this.field_427);
         }
      } else {
         if (this.field_1349 > 0) {
            this.field_1349--;
         }

         if (this.field_801 > 0) {
            this.field_801--;
         }

         this.field_146 = this.field_1324;
         this.field_732 = this.field_632;
         this.field_271 = this.field_1321;
         this.field_780 -= 0.04F;
         int var44 = Class380.method_502(this.field_1324);
         int var4 = Class380.method_502(this.field_632);
         int var45 = Class380.method_502(this.field_1321);
         if (this.field_796.method_813(var44, var4 - 1, var45) == Class371.field_1235.field_1379) {
            var4--;
         }

         double var6 = 0.4;
         boolean var8 = false;
         double var43 = 0.0078125;
         if (this.field_796.method_813(var44, var4, var45) == Class371.field_1235.field_1379) {
            Class47 var9 = this.method_719(this.field_1324, this.field_632, this.field_1321);
            int var10 = this.field_796.method_929(var44, var4, var45);
            this.field_632 = var4;
            if (var10 >= 2 && var10 <= 5) {
               this.field_632 = var4 + 1;
            }

            if (var10 == 2) {
               this.field_607 -= var43;
            }

            if (var10 == 3) {
               this.field_607 += var43;
            }

            if (var10 == 4) {
               this.field_921 += var43;
            }

            if (var10 == 5) {
               this.field_921 -= var43;
            }

            int[][] var11 = field_834[var10];
            double var12 = var11[1][0] - var11[0][0];
            double var14 = var11[1][2] - var11[0][2];
            double var16 = Math.sqrt(var12 * var12 + var14 * var14);
            double var18 = this.field_607 * var12 + this.field_921 * var14;
            if (var18 < 0.0) {
               var12 = -var12;
               var14 = -var14;
            }

            double var20 = Math.sqrt(this.field_607 * this.field_607 + this.field_921 * this.field_921);
            this.field_607 = var20 * var12 / var16;
            this.field_921 = var20 * var14 / var16;
            double var22 = 0.0;
            double var24 = var44 + 0.5 + var11[0][0] * 0.5;
            double var26 = var45 + 0.5 + var11[0][2] * 0.5;
            double var28 = var44 + 0.5 + var11[1][0] * 0.5;
            double var30 = var45 + 0.5 + var11[1][2] * 0.5;
            var12 = var28 - var24;
            var14 = var30 - var26;
            if (var12 == 0.0) {
               this.field_1324 = var44 + 0.5;
               var22 = this.field_1321 - var45;
            } else if (var14 == 0.0) {
               this.field_1321 = var45 + 0.5;
               var22 = this.field_1324 - var44;
            } else {
               double var32 = this.field_1324 - var24;
               double var34 = this.field_1321 - var26;
               double var36 = (var32 * var12 + var34 * var14) * 2.0;
               var22 = var36;
            }

            this.field_1324 = var24 + var12 * var22;
            this.field_1321 = var26 + var14 * var22;
            this.method_732(this.field_1324, this.field_632 + this.field_855, this.field_1321);
            double var54 = this.field_607;
            double var55 = this.field_921;
            if (this.field_826 != null) {
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

            this.method_956(var54, 0.0, var55);
            if (var11[0][1] != 0 && Class380.method_502(this.field_1324) - var44 == var11[0][0] && Class380.method_502(this.field_1321) - var45 == var11[0][2]) {
               this.method_732(this.field_1324, this.field_632 + var11[0][1], this.field_1321);
            } else if (var11[1][1] != 0
               && Class380.method_502(this.field_1324) - var44 == var11[1][0]
               && Class380.method_502(this.field_1321) - var45 == var11[1][2]) {
               this.method_732(this.field_1324, this.field_632 + var11[1][1], this.field_1321);
            }

            if (this.field_826 != null) {
               this.field_607 *= 0.997F;
               this.field_780 *= 0.0;
               this.field_921 *= 0.997F;
            } else {
               if (this.field_1134 == 2) {
                  double var56 = Class380.method_164(this.field_1558 * this.field_1558 + this.field_1179 * this.field_1179);
                  if (var56 > 0.01) {
                     var8 = true;
                     this.field_1558 /= var56;
                     this.field_1179 /= var56;
                     double var38 = 0.04;
                     this.field_607 *= 0.8F;
                     this.field_780 *= 0.0;
                     this.field_921 *= 0.8F;
                     this.field_607 = this.field_607 + this.field_1558 * var38;
                     this.field_921 = this.field_921 + this.field_1179 * var38;
                  } else {
                     this.field_607 *= 0.9F;
                     this.field_780 *= 0.0;
                     this.field_921 *= 0.9F;
                  }
               }

               this.field_607 *= 0.96F;
               this.field_780 *= 0.0;
               this.field_921 *= 0.96F;
            }

            Class47 var57 = this.method_719(this.field_1324, this.field_632, this.field_1321);
            if (var57 != null && var9 != null) {
               double var39 = (var9.field_173 - var57.field_173) * 0.05;
               var20 = Math.sqrt(this.field_607 * this.field_607 + this.field_921 * this.field_921);
               if (var20 > 0.0) {
                  this.field_607 = this.field_607 / var20 * (var20 + var39);
                  this.field_921 = this.field_921 / var20 * (var20 + var39);
               }

               this.method_732(this.field_1324, var57.field_173, this.field_1321);
            }

            int var58 = Class380.method_502(this.field_1324);
            int var40 = Class380.method_502(this.field_1321);
            if (var58 != var44 || var40 != var45) {
               var20 = Math.sqrt(this.field_607 * this.field_607 + this.field_921 * this.field_921);
               this.field_607 = var20 * (var58 - var44);
               this.field_921 = var20 * (var40 - var45);
            }

            if (this.field_1134 == 2) {
               double var41 = Class380.method_164(this.field_1558 * this.field_1558 + this.field_1179 * this.field_1179);
               if (var41 > 0.01 && this.field_607 * this.field_607 + this.field_921 * this.field_921 > 0.001) {
                  this.field_1558 /= var41;
                  this.field_1179 /= var41;
                  if (this.field_1558 * this.field_607 + this.field_1179 * this.field_921 < 0.0) {
                     this.field_1558 = 0.0;
                     this.field_1179 = 0.0;
                  } else {
                     this.field_1558 = this.field_607;
                     this.field_1179 = this.field_921;
                  }
               }
            }
         } else {
            if (this.field_607 < -var6) {
               this.field_607 = -var6;
            }

            if (this.field_607 > var6) {
               this.field_607 = var6;
            }

            if (this.field_921 < -var6) {
               this.field_921 = -var6;
            }

            if (this.field_921 > var6) {
               this.field_921 = var6;
            }

            if (this.field_199) {
               this.field_607 *= 0.5;
               this.field_780 *= 0.5;
               this.field_921 *= 0.5;
            }

            this.method_956(this.field_607, this.field_780, this.field_921);
            if (!this.field_199) {
               this.field_607 *= 0.95F;
               this.field_780 *= 0.95F;
               this.field_921 *= 0.95F;
            }
         }

         this.field_427 = 0.0F;
         double var46 = this.field_146 - this.field_1324;
         double var47 = this.field_271 - this.field_1321;
         if (var46 * var46 + var47 * var47 > 0.001) {
            this.field_909 = (float)(Math.atan2(var47, var46) * 180.0 / Math.PI);
            if (this.field_58) {
               this.field_909 += 180.0F;
            }
         }

         double var13 = this.field_909 - this.field_90;

         while (var13 >= 180.0) {
            var13 -= 360.0;
         }

         while (var13 < -180.0) {
            var13 += 360.0;
         }

         if (var13 < -170.0 || var13 >= 170.0) {
            this.field_909 += 180.0F;
            this.field_58 = !this.field_58;
         }

         this.method_254(this.field_909, this.field_427);
         List var15 = this.field_796.method_362(this, this.field_106.method_99(0.2F, 0.0, 0.2F));
         if (var15 != null && var15.size() > 0) {
            for (int var50 = 0; var50 < var15.size(); var50++) {
               Class252 var17 = (Class252)var15.get(var50);
               if (var17 != this.field_826 && var17.method_318() && var17 instanceof Class194) {
                  var17.method_384(this);
               }
            }
         }

         if (this.field_826 != null && this.field_826.field_120) {
            this.field_826 = null;
         }

         if (var8 && this.field_697.nextInt(4) == 0) {
            this.field_1213--;
            if (this.field_1213 < 0) {
               this.field_1558 = this.field_1179 = 0.0;
            }

            this.field_796.method_140("largesmoke", this.field_1324, this.field_632 + 0.8, this.field_1321, 0.0, 0.0, 0.0);
         }
      }
   }

   public Class47 method_719(double var1, double var3, double var5) {
      int var7 = Class380.method_502(var1);
      int var8 = Class380.method_502(var3);
      int var9 = Class380.method_502(var5);
      if (this.field_796.method_813(var7, var8 - 1, var9) == Class371.field_1235.field_1379) {
         var8--;
      }

      if (this.field_796.method_813(var7, var8, var9) == Class371.field_1235.field_1379) {
         int var10 = this.field_796.method_929(var7, var8, var9);
         var3 = var8;
         if (var10 >= 2 && var10 <= 5) {
            var3 = var8 + 1;
         }

         int[][] var11 = field_834[var10];
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

         return Class47.method_875(var1, var3, var5);
      } else {
         return null;
      }
   }

   @Override
   protected void method_422(Class100 var1) {
      var1.method_32("Type", this.field_1134);
      if (this.field_1134 == 2) {
         var1.method_925("PushX", this.field_1558);
         var1.method_925("PushZ", this.field_1179);
         var1.method_761("Fuel", (short)this.field_1213);
      } else if (this.field_1134 == 1) {
         Class310 var2 = new Class310();

         for (int var3 = 0; var3 < this.field_483.length; var3++) {
            if (this.field_483[var3] != null) {
               Class100 var4 = new Class100();
               var4.method_1003("Slot", (byte)var3);
               this.field_483[var3].method_110(var4);
               var2.method_162(var4);
            }
         }

         var1.method_280("Items", var2);
      }
   }

   @Override
   protected void method_134(Class100 var1) {
      this.field_1134 = var1.method_159("Type");
      if (this.field_1134 == 2) {
         this.field_1558 = var1.method_1016("PushX");
         this.field_1179 = var1.method_1016("PushZ");
         this.field_1213 = var1.method_799("Fuel");
      } else if (this.field_1134 == 1) {
         Class310 var2 = var1.method_836("Items");
         this.field_483 = new Class150[this.method_214()];

         for (int var3 = 0; var3 < var2.method_622(); var3++) {
            Class100 var4 = (Class100)var2.method_542(var3);
            int var5 = var4.method_561("Slot") & 255;
            if (var5 >= 0 && var5 < this.field_483.length) {
               this.field_483[var5] = new Class150(var4);
            }
         }
      }
   }

   @Override
   public void method_384(Class252 var1) {
      if (var1 != this.field_826) {
         if (var1 instanceof Class92
            && !(var1 instanceof Class41)
            && this.field_1134 == 0
            && this.field_607 * this.field_607 + this.field_921 * this.field_921 > 0.01
            && this.field_826 == null
            && var1.field_915 == null) {
            var1.method_720(this);
         }

         double var2 = var1.field_1324 - this.field_1324;
         double var4 = var1.field_1321 - this.field_1321;
         double var6 = var2 * var2 + var4 * var4;
         if (var6 >= 1.0E-4F) {
            var6 = Class380.method_164(var6);
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
            var2 *= 1.0F - this.field_1408;
            var4 *= 1.0F - this.field_1408;
            var2 *= 0.5;
            var4 *= 0.5;
            if (var1 instanceof Class194) {
               double var10 = var1.field_607 + this.field_607;
               double var12 = var1.field_921 + this.field_921;
               if (((Class194)var1).field_1134 == 2 && this.field_1134 != 2) {
                  this.field_607 *= 0.2F;
                  this.field_921 *= 0.2F;
                  this.method_192(var1.field_607 - var2, 0.0, var1.field_921 - var4);
                  var1.field_607 *= 0.7F;
                  var1.field_921 *= 0.7F;
               } else if (((Class194)var1).field_1134 != 2 && this.field_1134 == 2) {
                  var1.field_607 *= 0.2F;
                  var1.field_921 *= 0.2F;
                  var1.method_192(this.field_607 + var2, 0.0, this.field_921 + var4);
                  this.field_607 *= 0.7F;
                  this.field_921 *= 0.7F;
               } else {
                  var10 /= 2.0;
                  var12 /= 2.0;
                  this.field_607 *= 0.2F;
                  this.field_921 *= 0.2F;
                  this.method_192(var10 - var2, 0.0, var12 - var4);
                  var1.field_607 *= 0.2F;
                  var1.field_921 *= 0.2F;
                  var1.method_192(var10 + var2, 0.0, var12 + var4);
               }
            } else {
               this.method_192(-var2, 0.0, -var4);
               var1.method_192(var2 / 4.0, 0.0, var4 / 4.0);
            }
         }
      }
   }

   @Override
   public int method_214() {
      return 27;
   }

   @Override
   public Class150 method_908(int var1) {
      return this.field_483[var1];
   }
}
