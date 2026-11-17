package srv;

import java.util.List;
import java.util.Random;

public abstract class Class252 {
   private static int field_100 = 0;
   public int field_331 = field_100++;
   public double field_947 = 1.0;
   public boolean field_1240 = false;
   public Class252 field_826;
   public Class252 field_915;
   public Class317 field_796;
   public double field_146;
   public double field_732;
   public double field_271;
   public double field_1324;
   public double field_632;
   public double field_1321;
   public double field_607;
   public double field_780;
   public double field_921;
   public float field_909;
   public float field_427;
   public float field_90;
   public float field_253;
   public final Class94 field_106 = Class94.method_971(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   public boolean field_199 = false;
   public boolean field_857;
   public boolean field_436;
   public boolean field_1156 = false;
   public boolean field_112 = true;
   public boolean field_120 = false;
   public float field_855 = 0.0F;
   public float field_595 = 0.6F;
   public float field_907 = 1.8F;
   public float field_323 = 0.0F;
   public float field_38 = 0.0F;
   public boolean field_288 = true;
   public float field_22 = 0.0F;
   private int field_1130 = 1;
   public double field_1415;
   public double field_1422;
   public double field_875;
   public float field_458 = 0.0F;
   public float field_1093 = 0.0F;
   public boolean field_786 = false;
   public float field_1408 = 0.0F;
   public boolean field_1248 = false;
   public Random field_697 = new Random();
   public int field_251 = 0;
   public int field_392 = 1;
   public int field_1034 = 0;
   public int field_447 = 300;
   public boolean field_130 = false;
   public int field_840 = 0;
   public int field_1441 = 300;
   private boolean field_1230 = true;
   private double field_272;
   private double field_1419;
   public boolean field_519 = false;
   public int field_809;
   public int field_737;
   public int field_41;

   public Class252(Class317 var1) {
      this.field_796 = var1;
      this.method_732(0.0, 0.0, 0.0);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class252 ? ((Class252)var1).field_331 == this.field_331 : false;
   }

   @Override
   public int hashCode() {
      return this.field_331;
   }

   public void method_715() {
      this.field_120 = true;
   }

   protected void method_273(float var1, float var2) {
      this.field_595 = var1;
      this.field_907 = var2;
   }

   protected void method_254(float var1, float var2) {
      this.field_909 = var1;
      this.field_427 = var2;
   }

   public void method_732(double var1, double var3, double var5) {
      this.field_1324 = var1;
      this.field_632 = var3;
      this.field_1321 = var5;
      float var7 = this.field_595 / 2.0F;
      float var8 = this.field_907;
      this.field_106
         .method_268(var1 - var7, var3 - this.field_855 + this.field_458, var5 - var7, var1 + var7, var3 - this.field_855 + this.field_458 + var8, var5 + var7);
   }

   public void method_439() {
      this.method_518();
   }

   public void method_518() {
      if (this.field_915 != null && this.field_915.field_120) {
         this.field_915 = null;
      }

      this.field_251++;
      this.field_323 = this.field_38;
      this.field_146 = this.field_1324;
      this.field_732 = this.field_632;
      this.field_271 = this.field_1321;
      this.field_253 = this.field_427;
      this.field_90 = this.field_909;
      if (this.method_643()) {
         if (!this.field_130 && !this.field_1230) {
            float var1 = Class380.method_164(this.field_607 * this.field_607 * 0.2F + this.field_780 * this.field_780 + this.field_921 * this.field_921 * 0.2F)
               * 0.2F;
            if (var1 > 1.0F) {
               var1 = 1.0F;
            }

            this.field_796.method_38(this, "random.splash", var1, 1.0F + (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.4F);
            float var2 = Class380.method_502(this.field_106.field_817);

            for (int var3 = 0; var3 < 1.0F + this.field_595 * 20.0F; var3++) {
               float var4 = (this.field_697.nextFloat() * 2.0F - 1.0F) * this.field_595;
               float var5 = (this.field_697.nextFloat() * 2.0F - 1.0F) * this.field_595;
               this.field_796
                  .method_140(
                     "bubble",
                     this.field_1324 + var4,
                     var2 + 1.0F,
                     this.field_1321 + var5,
                     this.field_607,
                     this.field_780 - this.field_697.nextFloat() * 0.2F,
                     this.field_921
                  );
            }

            for (int var6 = 0; var6 < 1.0F + this.field_595 * 20.0F; var6++) {
               float var7 = (this.field_697.nextFloat() * 2.0F - 1.0F) * this.field_595;
               float var8 = (this.field_697.nextFloat() * 2.0F - 1.0F) * this.field_595;
               this.field_796.method_140("splash", this.field_1324 + var7, var2 + 1.0F, this.field_1321 + var8, this.field_607, this.field_780, this.field_921);
            }
         }

         this.field_22 = 0.0F;
         this.field_130 = true;
         this.field_1034 = 0;
      } else {
         this.field_130 = false;
      }

      if (this.field_1034 > 0) {
         if (this.field_1034 % 20 == 0) {
            this.method_671((Class252)null, 1);
         }

         this.field_1034--;
      }

      if (this.method_417()) {
         this.method_671((Class252)null, 10);
         this.field_1034 = 600;
      }

      if (this.field_632 < -64.0) {
         this.method_590();
      }

      this.field_1230 = false;
   }

   protected void method_590() {
      this.method_715();
   }

   public boolean method_565(double var1, double var3, double var5) {
      Class94 var7 = this.field_106.method_709(var1, var3, var5);
      List var8 = this.field_796.method_893(this, var7);
      return var8.size() > 0 ? false : !this.field_796.method_730(var7);
   }

   public void method_956(double var1, double var3, double var5) {
      if (this.field_786) {
         this.field_106.method_259(var1, var3, var5);
         this.field_1324 = (this.field_106.field_1397 + this.field_106.field_346) / 2.0;
         this.field_632 = this.field_106.field_817 + this.field_855 - this.field_458;
         this.field_1321 = (this.field_106.field_601 + this.field_106.field_854) / 2.0;
      } else {
         double var7 = this.field_1324;
         double var9 = this.field_1321;
         double var11 = var1;
         double var13 = var3;
         double var15 = var5;
         Class94 var17 = this.field_106.method_303();
         boolean var18 = this.field_199 && this.method_501();
         if (var18) {
            double var19 = 0.05;

            while (var1 != 0.0 && this.field_796.method_893(this, this.field_106.method_709(var1, -1.0, 0.0)).size() == 0) {
               if (var1 < var19 && var1 >= -var19) {
                  var1 = 0.0;
               } else if (var1 > 0.0) {
                  var1 -= var19;
               } else {
                  var1 += var19;
               }

               var11 = var1;
            }

            for (; var5 != 0.0 && this.field_796.method_893(this, this.field_106.method_709(0.0, -1.0, var5)).size() == 0; var15 = var5) {
               if (var5 < var19 && var5 >= -var19) {
                  var5 = 0.0;
               } else if (var5 > 0.0) {
                  var5 -= var19;
               } else {
                  var5 += var19;
               }
            }
         }

         List var36 = this.field_796.method_893(this, this.field_106.method_949(var1, var3, var5));

         for (int var20 = 0; var20 < var36.size(); var20++) {
            var3 = ((Class94)var36.get(var20)).method_765(this.field_106, var3);
         }

         this.field_106.method_259(0.0, var3, 0.0);
         if (!this.field_112 && var13 != var3) {
            var5 = 0.0;
            var3 = 0.0;
            var1 = 0.0;
         }

         boolean var38 = this.field_199 || var13 != var3 && var13 < 0.0;

         for (int var21 = 0; var21 < var36.size(); var21++) {
            var1 = ((Class94)var36.get(var21)).method_896(this.field_106, var1);
         }

         this.field_106.method_259(var1, 0.0, 0.0);
         if (!this.field_112 && var11 != var1) {
            var5 = 0.0;
            var3 = 0.0;
            var1 = 0.0;
         }

         for (int var39 = 0; var39 < var36.size(); var39++) {
            var5 = ((Class94)var36.get(var39)).method_954(this.field_106, var5);
         }

         this.field_106.method_259(0.0, 0.0, var5);
         if (!this.field_112 && var15 != var5) {
            var5 = 0.0;
            var3 = 0.0;
            var1 = 0.0;
         }

         if (this.field_1093 > 0.0F && var38 && this.field_458 < 0.05F && (var11 != var1 || var15 != var5)) {
            double var25 = var1;
            double var22 = var3;
            double var27 = var5;
            var1 = var11;
            var3 = this.field_1093;
            var5 = var15;
            Class94 var29 = this.field_106.method_303();
            this.field_106.method_677(var17);
            var36 = this.field_796.method_893(this, this.field_106.method_949(var11, var3, var15));

            for (int var24 = 0; var24 < var36.size(); var24++) {
               var3 = ((Class94)var36.get(var24)).method_765(this.field_106, var3);
            }

            this.field_106.method_259(0.0, var3, 0.0);
            if (!this.field_112 && var13 != var3) {
               var5 = 0.0;
               var3 = 0.0;
               var1 = 0.0;
            }

            for (int var41 = 0; var41 < var36.size(); var41++) {
               var1 = ((Class94)var36.get(var41)).method_896(this.field_106, var1);
            }

            this.field_106.method_259(var1, 0.0, 0.0);
            if (!this.field_112 && var11 != var1) {
               var5 = 0.0;
               var3 = 0.0;
               var1 = 0.0;
            }

            for (int var42 = 0; var42 < var36.size(); var42++) {
               var5 = ((Class94)var36.get(var42)).method_954(this.field_106, var5);
            }

            this.field_106.method_259(0.0, 0.0, var5);
            if (!this.field_112 && var15 != var5) {
               var5 = 0.0;
               var3 = 0.0;
               var1 = 0.0;
            }

            if (var25 * var25 + var27 * var27 >= var1 * var1 + var5 * var5) {
               var1 = var25;
               var3 = var22;
               var5 = var27;
               this.field_106.method_677(var29);
            } else {
               this.field_458 = (float)(this.field_458 + 0.5);
            }
         }

         this.field_1324 = (this.field_106.field_1397 + this.field_106.field_346) / 2.0;
         this.field_632 = this.field_106.field_817 + this.field_855 - this.field_458;
         this.field_1321 = (this.field_106.field_601 + this.field_106.field_854) / 2.0;
         this.field_857 = var11 != var1 || var15 != var5;
         this.field_436 = var13 != var3;
         this.field_199 = var13 != var3 && var13 < 0.0;
         this.field_1156 = this.field_857 || this.field_436;
         if (this.field_199) {
            if (this.field_22 > 0.0F) {
               this.method_324(this.field_22);
               this.field_22 = 0.0F;
            }
         } else if (var3 < 0.0) {
            this.field_22 = (float)(this.field_22 - var3);
         }

         if (var11 != var1) {
            this.field_607 = 0.0;
         }

         if (var13 != var3) {
            this.field_780 = 0.0;
         }

         if (var15 != var5) {
            this.field_921 = 0.0;
         }

         double var45 = this.field_1324 - var7;
         double var40 = this.field_1321 - var9;
         this.field_38 = (float)(this.field_38 + Class380.method_164(var45 * var45 + var40 * var40) * 0.6);
         if (this.field_288 && !var18) {
            int var28 = Class380.method_502(this.field_1324);
            int var46 = Class380.method_502(this.field_632 - 0.2F - this.field_855);
            int var49 = Class380.method_502(this.field_1321);
            int var43 = this.field_796.method_813(var28, var46, var49);
            if (this.field_38 > this.field_1130 && var43 > 0) {
               this.field_1130++;
               Class90 var30 = Class371.field_57[var43].field_1154;
               if (this.field_796.method_813(var28, var46 + 1, var49) == Class371.field_1595.field_1379) {
                  var30 = Class371.field_1595.field_1154;
                  this.field_796.method_38(this, var30.method_534(), var30.method_625() * 0.15F, var30.method_952());
               } else if (!Class371.field_57[var43].field_658.method_210()) {
                  this.field_796.method_38(this, var30.method_534(), var30.method_625() * 0.15F, var30.method_952());
               }

               Class371.field_57[var43].method_220(this.field_796, var28, var46, var49, this);
            }
         }

         int var48 = Class380.method_502(this.field_106.field_1397);
         int var47 = Class380.method_502(this.field_106.field_817);
         int var50 = Class380.method_502(this.field_106.field_601);
         int var44 = Class380.method_502(this.field_106.field_346);
         int var52 = Class380.method_502(this.field_106.field_1448);
         int var31 = Class380.method_502(this.field_106.field_854);

         for (int var32 = var48; var32 <= var44; var32++) {
            for (int var33 = var47; var33 <= var52; var33++) {
               for (int var34 = var50; var34 <= var31; var34++) {
                  int var35 = this.field_796.method_813(var32, var33, var34);
                  if (var35 > 0) {
                     Class371.field_57[var35].method_762(this.field_796, var32, var33, var34, this);
                  }
               }
            }
         }

         this.field_458 *= 0.4F;
         boolean var53 = this.method_643();
         if (this.field_796.method_180(this.field_106)) {
            this.method_357(1);
            if (!var53) {
               this.field_1034++;
               if (this.field_1034 == 0) {
                  this.field_1034 = 300;
               }
            }
         } else if (this.field_1034 <= 0) {
            this.field_1034 = -this.field_392;
         }

         if (var53 && this.field_1034 > 0) {
            this.field_796.method_38(this, "random.fizz", 0.7F, 1.6F + (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.4F);
            this.field_1034 = -this.field_392;
         }
      }
   }

   public boolean method_501() {
      return false;
   }

   public Class94 method_190() {
      return null;
   }

   protected void method_357(int var1) {
      this.method_671((Class252)null, var1);
   }

   protected void method_324(float var1) {
   }

   public boolean method_643() {
      return this.field_796.method_60(this.field_106.method_99(0.0, -0.4F, 0.0), Class111.field_1394, this);
   }

   public boolean method_609(Class111 var1) {
      double var2 = this.field_632 + this.method_181();
      int var4 = Class380.method_502(this.field_1324);
      int var5 = Class380.method_827(Class380.method_502(var2));
      int var6 = Class380.method_502(this.field_1321);
      int var7 = this.field_796.method_813(var4, var5, var6);
      if (var7 != 0 && Class371.field_57[var7].field_658 == var1) {
         float var8 = Class195.method_230(this.field_796.method_929(var4, var5, var6)) - 0.11111111F;
         float var9 = var5 + 1 - var8;
         return var2 < var9;
      } else {
         return false;
      }
   }

   protected float method_181() {
      return 0.0F;
   }

   public boolean method_417() {
      return this.field_796.method_261(this.field_106.method_99(0.0, -0.4F, 0.0), Class111.field_306);
   }

   public void method_835(float var1, float var2, float var3) {
      float var4 = Class380.method_557(var1 * var1 + var2 * var2);
      if (var4 >= 0.01F) {
         if (var4 < 1.0F) {
            var4 = 1.0F;
         }

         var4 = var3 / var4;
         var1 *= var4;
         var2 *= var4;
         float var5 = Class380.method_241(this.field_909 * (float) Math.PI / 180.0F);
         float var6 = Class380.method_520(this.field_909 * (float) Math.PI / 180.0F);
         this.field_607 += var1 * var6 - var2 * var5;
         this.field_921 += var2 * var6 + var1 * var5;
      }
   }

   public float method_172(float var1) {
      int var2 = Class380.method_502(this.field_1324);
      double var3 = (this.field_106.field_1448 - this.field_106.field_817) * 0.66;
      int var5 = Class380.method_502(this.field_632 - this.field_855 + var3);
      int var6 = Class380.method_502(this.field_1321);
      return this.field_796.method_170(var2, var5, var6);
   }

   public void method_831(double var1, double var3, double var5, float var7, float var8) {
      this.field_146 = this.field_1324 = var1;
      this.field_732 = this.field_632 = var3;
      this.field_271 = this.field_1321 = var5;
      this.field_909 = var7;
      this.field_427 = var8;
      this.field_458 = 0.0F;
      double var9 = this.field_90 - var7;
      if (var9 < -180.0) {
         this.field_90 += 360.0F;
      }

      if (var9 >= 180.0) {
         this.field_90 -= 360.0F;
      }

      this.method_732(this.field_1324, this.field_632, this.field_1321);
   }

   public void method_885(double var1, double var3, double var5, float var7, float var8) {
      this.field_146 = this.field_1324 = var1;
      this.field_732 = this.field_632 = var3 + this.field_855;
      this.field_271 = this.field_1321 = var5;
      this.field_909 = var7;
      this.field_427 = var8;
      this.method_732(this.field_1324, this.field_632, this.field_1321);
   }

   public float method_272(Class252 var1) {
      float var2 = (float)(this.field_1324 - var1.field_1324);
      float var3 = (float)(this.field_632 - var1.field_632);
      float var4 = (float)(this.field_1321 - var1.field_1321);
      return Class380.method_557(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double method_124(double var1, double var3, double var5) {
      double var7 = this.field_1324 - var1;
      double var9 = this.field_632 - var3;
      double var11 = this.field_1321 - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double method_452(double var1, double var3, double var5) {
      double var7 = this.field_1324 - var1;
      double var9 = this.field_632 - var3;
      double var11 = this.field_1321 - var5;
      return Class380.method_164(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double method_186(Class252 var1) {
      double var2 = this.field_1324 - var1.field_1324;
      double var4 = this.field_632 - var1.field_632;
      double var6 = this.field_1321 - var1.field_1321;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void method_644(Class41 var1) {
   }

   public void method_384(Class252 var1) {
      if (var1.field_826 != this && var1.field_915 != this) {
         double var2 = var1.field_1324 - this.field_1324;
         double var4 = var1.field_1321 - this.field_1321;
         double var6 = Class380.method_774(var2, var4);
         if (var6 >= 0.01F) {
            var6 = Class380.method_164(var6);
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
            var2 *= 1.0F - this.field_1408;
            var4 *= 1.0F - this.field_1408;
            this.method_192(-var2, 0.0, -var4);
            var1.method_192(var2, 0.0, var4);
         }
      }
   }

   public void method_192(double var1, double var3, double var5) {
      this.field_607 += var1;
      this.field_780 += var3;
      this.field_921 += var5;
   }

   public boolean method_671(Class252 var1, int var2) {
      return false;
   }

   public boolean method_947() {
      return false;
   }

   public boolean method_318() {
      return false;
   }

   public void method_1012(Class252 var1, int var2) {
   }

   public boolean method_107(Class100 var1) {
      String var2 = this.method_764();
      if (!this.field_120 && var2 != null) {
         var1.method_152("id", var2);
         this.method_582(var1);
         return true;
      } else {
         return false;
      }
   }

   public void method_582(Class100 var1) {
      var1.method_280("Pos", this.method_153(this.field_1324, this.field_632, this.field_1321));
      var1.method_280("Motion", this.method_153(this.field_607, this.field_780, this.field_921));
      var1.method_280("Rotation", this.method_1011(this.field_909, this.field_427));
      var1.method_939("FallDistance", this.field_22);
      var1.method_761("Fire", (short)this.field_1034);
      var1.method_761("Air", (short)this.field_1441);
      var1.method_430("OnGround", this.field_199);
      this.method_422(var1);
   }

   public void method_680(Class100 var1) {
      Class310 var2 = var1.method_836("Pos");
      Class310 var3 = var1.method_836("Motion");
      Class310 var4 = var1.method_836("Rotation");
      this.method_732(0.0, 0.0, 0.0);
      this.field_607 = ((Class155)var3.method_542(0)).field_1205;
      this.field_780 = ((Class155)var3.method_542(1)).field_1205;
      this.field_921 = ((Class155)var3.method_542(2)).field_1205;
      this.field_146 = this.field_1415 = this.field_1324 = ((Class155)var2.method_542(0)).field_1205;
      this.field_732 = this.field_1422 = this.field_632 = ((Class155)var2.method_542(1)).field_1205;
      this.field_271 = this.field_875 = this.field_1321 = ((Class155)var2.method_542(2)).field_1205;
      this.field_90 = this.field_909 = ((Class260)var4.method_542(0)).field_95;
      this.field_253 = this.field_427 = ((Class260)var4.method_542(1)).field_95;
      this.field_22 = var1.method_510("FallDistance");
      this.field_1034 = var1.method_799("Fire");
      this.field_1441 = var1.method_799("Air");
      this.field_199 = var1.method_1004("OnGround");
      this.method_732(this.field_1324, this.field_632, this.field_1321);
      this.method_134(var1);
   }

   protected final String method_764() {
      return Class227.method_424(this);
   }

   protected abstract void method_134(Class100 var1);

   protected abstract void method_422(Class100 var1);

   protected Class310 method_153(double... var1) {
      Class310 var2 = new Class310();
      double[] var3 = var1;
      int var4 = var1.length;

      for (int var5 = 0; var5 < var4; var5++) {
         double var6 = var3[var5];
         var2.method_162(new Class155(var6));
      }

      return var2;
   }

   protected Class310 method_1011(float... var1) {
      Class310 var2 = new Class310();
      float[] var3 = var1;
      int var4 = var1.length;

      for (int var5 = 0; var5 < var4; var5++) {
         float var6 = var3[var5];
         var2.method_162(new Class260(var6));
      }

      return var2;
   }

   public Class39 method_585(int var1, int var2) {
      return this.method_355(var1, var2, 0.0F);
   }

   public Class39 method_355(int var1, int var2, float var3) {
      Class39 var4 = new Class39(this.field_796, this.field_1324, this.field_632 + var3, this.field_1321, new Class150(var1, var2));
      var4.field_1105 = 10;
      this.field_796.method_237(var4);
      return var4;
   }

   public boolean method_974() {
      return !this.field_120;
   }

   public boolean method_890() {
      int var1 = Class380.method_502(this.field_1324);
      int var2 = Class380.method_502(this.field_632 + this.method_181());
      int var3 = Class380.method_502(this.field_1321);
      return this.field_796.method_604(var1, var2, var3);
   }

   public Class94 method_782(Class252 var1) {
      return null;
   }

   public void method_447() {
      if (this.field_915.field_120) {
         this.field_915 = null;
      } else {
         this.field_607 = 0.0;
         this.field_780 = 0.0;
         this.field_921 = 0.0;
         this.method_439();
         this.field_915.method_829();
         this.field_1419 = this.field_1419 + (this.field_915.field_909 - this.field_915.field_90);
         this.field_272 = this.field_272 + (this.field_915.field_427 - this.field_915.field_253);

         while (this.field_1419 >= 180.0) {
            this.field_1419 -= 360.0;
         }

         while (this.field_1419 < -180.0) {
            this.field_1419 += 360.0;
         }

         while (this.field_272 >= 180.0) {
            this.field_272 -= 360.0;
         }

         while (this.field_272 < -180.0) {
            this.field_272 += 360.0;
         }

         double var1 = this.field_1419 * 0.5;
         double var3 = this.field_272 * 0.5;
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

         this.field_1419 -= var1;
         this.field_272 -= var3;
         this.field_909 = (float)(this.field_909 + var1);
         this.field_427 = (float)(this.field_427 + var3);
      }
   }

   protected void method_829() {
      this.field_826.method_732(this.field_1324, this.field_632 + this.method_760() + this.field_826.method_89(), this.field_1321);
   }

   public double method_89() {
      return this.field_855;
   }

   public double method_760() {
      return this.field_907 * 0.75;
   }

   public void method_720(Class252 var1) {
      this.field_272 = 0.0;
      this.field_1419 = 0.0;
      if (this.field_915 == var1) {
         this.field_915.field_826 = null;
         this.field_915 = null;
         this.method_885(var1.field_1324, var1.field_106.field_817 + var1.field_907, var1.field_1321, this.field_909, this.field_427);
      } else {
         if (this.field_915 != null) {
            this.field_915.field_826 = null;
         }

         if (var1.field_826 != null) {
            var1.field_826.field_915 = null;
         }

         this.field_915 = var1;
         var1.field_826 = this;
      }
   }
}
