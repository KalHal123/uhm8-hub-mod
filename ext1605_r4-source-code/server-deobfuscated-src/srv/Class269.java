package srv;

import java.util.ArrayList;
import java.util.Random;

public class Class269 extends Class19 {
   private Boolean field_1447 = null;
   static final byte[] field_860 = new byte[]{2, 0, 0, 1, 2, 1};
   Random field_602 = new Random();
   Class317 field_721;
   int[] field_1393 = new int[]{0, 0, 0};
   int field_903 = 0;
   int field_804;
   double field_740 = 0.618;
   double field_1018 = 1.0;
   double field_64 = 0.381;
   double field_683 = 1.0;
   double field_1344 = 1.0;
   int field_1222 = 1;
   int field_1125 = 12;
   int field_191 = 4;
   int[][] field_388;
   int field_418 = Class371.field_158.field_1379;
   int field_533 = Class371.field_831.field_1379;

   public Class269 method_353(boolean var1) {
      this.field_1447 = var1;
      return this;
   }

   private void method_485(Class317 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class323.field_1116.field_1379;
      int var7 = Class323.field_1209.field_1379;
      float var8 = 0.0F;
      float var9 = var2.nextFloat() * (float) Math.PI * 2.0F;
      int var10 = var2.nextInt(9) + 8;
      float var11 = var4;

      for (int var12 = 0; var12 < var10; var12++) {
         var9 = (float)(var9 + (var2.nextFloat() - 0.5) * 0.1);
         var8++;
         float var13 = var8 / var10;
         var3 = (int)(var3 + Class380.method_520(var9) * (1.0F - var13));
         var11 += var13;
         var5 = (int)(var5 + Class380.method_241(var9) * (1.0F - var13));
         var4 = Math.round(var11);
         var1.method_260(var3, var4, var5, var6);
      }

      var4 += var2.nextInt(2) + 1;
      int var16 = var2.nextInt(3) + 2;

      for (int var17 = 0; var17 < var16; var17++) {
         var1.method_260(var3, var4, var5, var7);

         for (float var18 = 0.0F; var18 < Math.PI * 2; var18 = (float)(var18 + (Math.PI / 14))) {
            int var19 = var2.nextInt(var17 + 4) + var17 + 4;
            float var20 = var3;
            float var21 = var5;

            for (int var14 = 0; var14 < var19; var14++) {
               var21 += Class380.method_241(var18);
               var20 += Class380.method_520(var18);
               if (!var1.method_149(Math.round(var20), var4 - var17, Math.round(var21)).method_330()) {
                  var1.method_260(Math.round(var20), var4 - var17, Math.round(var21), var7);
               }
            }
         }
      }
   }

   private void method_207(Class317 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class323.field_969.field_1379;
      int var7 = var2.nextInt(4);

      for (int var8 = 0; var8 < var7; var8++) {
         int var9 = var2.nextInt(8) + 3;
         int var10 = var3;
         int var11 = var4;
         int var12 = var5;

         for (int var13 = 0; var13 < var9; var13++) {
            var10 += var2.nextInt(3) - 1;
            var11--;
            var12 += var2.nextInt(3) - 1;
            if (var1.method_813(var10, var11, var12) != Class371.field_536.field_1379) {
               var1.method_260(var10, var11, var12, var6);
            }
         }
      }
   }

   private boolean method_867(Class317 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class323.field_1116.field_1379;
      int var7 = Class323.field_1209.field_1379;
      if (var1.method_813(var3, var4 - 1, var5) != Class371.field_1206.field_1379 && var1.method_813(var3, var4 - 1, var5) != Class371.field_1082.field_1379) {
         return true;
      }

      Random var8 = new Random(var2.nextLong() + var3 + var4 + var5 + var1.field_68);
      ArrayList var9 = new ArrayList();
      int var10 = 16 + var8.nextInt(26);
      var9.add(Class47.method_875(var3, var4 + var10, var5));

      for (int var11 = 0; var9.size() > 0; var11++) {
         for (Class47 var13 : new ArrayList(var9)) {
            int var14 = (int)Math.round(var13.field_13);
            int var15 = (int)Math.round(var13.field_173);
            int var16 = (int)Math.round(var13.field_510);
            if ((!var1.method_149(var14, var15, var16).method_330() || var1.method_813(var14, var15, var16) != var7)
               && var15 >= 0
               && (var8.nextInt(3) != 0 || var9.size() <= 3)) {
               var1.method_260(var14, var15, var16, var6);
               int var17 = 0;

               while (var8.nextInt(var9.size() / 20 + 2) <= 1 && var9.size() <= 10000) {
                  if (++var17 >= 4) {
                     break;
                  }

                  Class47 var18 = var13.method_203(var8.nextInt(3) - 1, -1.0, var8.nextInt(3) - 1);
                  var9.add(var18);
               }

               if (var11 > 2 && var8.nextInt(Math.max(50, 89 - var11)) == 3) {
                  this.method_485(var1, var2, var14, var15, var16);
               }

               var9.remove(var13);
               var9.add(var13.method_203(0.0, -1.0, 0.0));
            } else {
               var9.remove(var13);
               if (var1.method_813(var14, var15, var16) == Class371.field_1082.field_1379
                  || var1.method_813(var14, var15, var16) == Class371.field_1206.field_1379) {
                  this.method_207(var1, var8, var14, var15, var16);
               }
            }
         }
      }

      return true;
   }

   void method_349() {
      this.field_804 = (int)(this.field_903 * this.field_740);
      if (this.field_804 >= this.field_903) {
         this.field_804 = this.field_903 - 1;
      }

      int var1 = (int)(1.382 + Math.pow(this.field_1344 * this.field_903 / 13.0, 2.0));
      if (var1 < 1) {
         var1 = 1;
      }

      int[][] var2 = new int[var1 * this.field_903][4];
      int var3 = this.field_1393[1] + this.field_903 - this.field_191;
      int var4 = 1;
      int var5 = this.field_1393[1] + this.field_804;
      int var6 = var3 - this.field_1393[1];
      var2[0][0] = this.field_1393[0];
      var2[0][1] = var3;
      var2[0][2] = this.field_1393[2];
      var2[0][3] = var5;
      var3--;

      while (var6 >= 0) {
         int var7 = 0;
         float var8 = this.method_398(var6);
         if (var8 < 0.0F) {
            var3--;
            var6--;
         } else {
            double var9 = 0.5;

            while (var7 < var1) {
               double var11 = this.field_683 * var8 * (this.field_602.nextFloat() + 0.328);
               double var13 = this.field_602.nextFloat() * 2.0 * 3.14159;
               int var15 = (int)(var11 * Math.sin(var13) + this.field_1393[0] + var9);
               int var16 = (int)(var11 * Math.cos(var13) + this.field_1393[2] + var9);
               int[] var17 = new int[]{var15, var3, var16};
               int[] var18 = new int[]{var15, var3 + this.field_191, var16};
               if (this.method_323(var17, var18) == -1) {
                  int[] var19 = new int[]{this.field_1393[0], this.field_1393[1], this.field_1393[2]};
                  double var20 = Math.sqrt(Math.pow(Math.abs(this.field_1393[0] - var17[0]), 2.0) + Math.pow(Math.abs(this.field_1393[2] - var17[2]), 2.0));
                  double var22 = var20 * this.field_64;
                  if (var17[1] - var22 > var5) {
                     var19[1] = var5;
                  } else {
                     var19[1] = (int)(var17[1] - var22);
                  }

                  if (this.method_323(var19, var17) == -1) {
                     var2[var4][0] = var15;
                     var2[var4][1] = var3;
                     var2[var4][2] = var16;
                     var2[var4][3] = var19[1];
                     var4++;
                  }
               }

               var7++;
            }

            var3--;
            var6--;
         }
      }

      this.field_388 = new int[var4][4];
      System.arraycopy(var2, 0, this.field_388, 0, var4);
   }

   void method_257(int var1, int var2, int var3, float var4, byte var5, int var6) {
      int var7 = (int)(var4 + 0.618);
      byte var8 = field_860[var5];
      byte var9 = field_860[var5 + 3];
      int[] var10 = new int[]{var1, var2, var3};
      int[] var11 = new int[]{0, 0, 0};
      int var12 = -var7;
      int var13 = -var7;

      for (var11[var5] = var10[var5]; var12 <= var7; var12++) {
         var11[var8] = var10[var8] + var12;
         var13 = -var7;

         while (var13 <= var7) {
            double var14 = Math.sqrt(Math.pow(Math.abs(var12) + 0.5, 2.0) + Math.pow(Math.abs(var13) + 0.5, 2.0));
            if (var14 > var4) {
               var13++;
            } else {
               var11[var9] = var10[var9] + var13;
               int var16 = this.field_721.method_813(var11[0], var11[1], var11[2]);
               if (var16 != 0 && var16 != this.field_533) {
                  var13++;
               } else {
                  this.field_721.method_260(var11[0], var11[1], var11[2], var6);
                  var13++;
               }
            }
         }
      }
   }

   float method_398(int var1) {
      if (var1 < this.field_903 * 0.3) {
         return -1.618F;
      }

      float var2 = this.field_903 / 2.0F;
      float var3 = this.field_903 / 2.0F - var1;
      float var4;
      if (var3 == 0.0F) {
         var4 = var2;
      } else if (Math.abs(var3) >= var2) {
         var4 = 0.0F;
      } else {
         var4 = (float)Math.sqrt(Math.pow(Math.abs(var2), 2.0) - Math.pow(Math.abs(var3), 2.0));
      }

      return var4 * 0.5F;
   }

   float method_821(int var1) {
      return var1 >= 0 && var1 < this.field_191 ? (var1 != 0 && var1 != this.field_191 - 1 ? 3.0F : 2.0F) : -1.0F;
   }

   void method_972(int var1, int var2, int var3) {
      int var4 = var2;

      for (int var5 = var2 + this.field_191; var4 < var5; var4++) {
         float var6 = this.method_821(var4 - var2);
         this.method_257(var1, var4, var3, var6, (byte)1, this.field_533);
      }
   }

   void method_147(int[] var1, int[] var2, int var3) {
      int[] var4 = new int[]{0, 0, 0};
      byte var5 = 0;
      byte var6 = 0;

      while (var5 < 3) {
         var4[var5] = var2[var5] - var1[var5];
         if (Math.abs(var4[var5]) > Math.abs(var4[var6])) {
            var6 = var5;
         }

         var5++;
      }

      if (var4[var6] != 0) {
         byte var7 = field_860[var6];
         byte var8 = field_860[var6 + 3];
         byte var9;
         if (var4[var6] > 0) {
            var9 = 1;
         } else {
            var9 = -1;
         }

         double var10 = (double)var4[var7] / var4[var6];
         double var12 = (double)var4[var8] / var4[var6];
         int[] var14 = new int[]{0, 0, 0};
         byte var15 = 0;

         for (int var16 = var4[var6] + var9; var15 != var16; var15 += var9) {
            var14[var6] = Class380.method_502(var1[var6] + var15 + 0.5);
            var14[var7] = Class380.method_502(var1[var7] + var15 * var10 + 0.5);
            var14[var8] = Class380.method_502(var1[var8] + var15 * var12 + 0.5);
            this.field_721.method_260(var14[0], var14[1], var14[2], var3);
         }
      }
   }

   void method_689() {
      int var1 = 0;

      for (int var2 = this.field_388.length; var1 < var2; var1++) {
         int var3 = this.field_388[var1][0];
         int var4 = this.field_388[var1][1];
         int var5 = this.field_388[var1][2];
         this.method_972(var3, var4, var5);
      }
   }

   boolean method_740(int var1) {
      return var1 >= this.field_903 * 0.2;
   }

   void method_299() {
      int var1 = this.field_1393[0];
      int var2 = this.field_1393[1];
      int var3 = this.field_1393[1] + this.field_804;
      int var4 = this.field_1393[2];
      int[] var5 = new int[]{var1, var2, var4};
      int[] var6 = new int[]{var1, var3, var4};
      this.method_147(var5, var6, this.field_418);
      if (this.field_1222 == 2) {
         var5[0]++;
         var6[0]++;
         this.method_147(var5, var6, this.field_418);
         var5[2]++;
         var6[2]++;
         this.method_147(var5, var6, this.field_418);
         var5[0] += -1;
         var6[0] += -1;
         this.method_147(var5, var6, this.field_418);
      }
   }

   void method_989() {
      int var1 = 0;
      int var2 = this.field_388.length;
      int[] var3 = new int[]{this.field_1393[0], this.field_1393[1], this.field_1393[2]};

      while (var1 < var2) {
         int[] var4 = this.field_388[var1];
         int[] var5 = new int[]{var4[0], var4[1], var4[2]};
         var3[1] = var4[3];
         int var6 = var3[1] - this.field_1393[1];
         if (this.method_740(var6)) {
            this.method_147(var3, var5, this.field_418);
         }

         var1++;
      }
   }

   int method_323(int[] var1, int[] var2) {
      int[] var3 = new int[]{0, 0, 0};
      byte var4 = 0;
      byte var5 = 0;

      while (var4 < 3) {
         var3[var4] = var2[var4] - var1[var4];
         if (Math.abs(var3[var4]) > Math.abs(var3[var5])) {
            var5 = var4;
         }

         var4++;
      }

      if (var3[var5] == 0) {
         return -1;
      }

      byte var6 = field_860[var5];
      byte var7 = field_860[var5 + 3];
      byte var8;
      if (var3[var5] > 0) {
         var8 = 1;
      } else {
         var8 = -1;
      }

      double var9 = (double)var3[var6] / var3[var5];
      double var11 = (double)var3[var7] / var3[var5];
      int[] var13 = new int[]{0, 0, 0};
      byte var14 = 0;

      int var15;
      for (var15 = var3[var5] + var8; var14 != var15; var14 += var8) {
         var13[var5] = var1[var5] + var14;
         var13[var6] = (int)(var1[var6] + var14 * var9);
         var13[var7] = (int)(var1[var7] + var14 * var11);
         int var16 = this.field_721.method_813(var13[0], var13[1], var13[2]);
         if (var16 != 0 && var16 != this.field_533) {
            break;
         }
      }

      return var14 == var15 ? -1 : Math.abs(var14);
   }

   boolean method_511() {
      int[] var1 = new int[]{this.field_1393[0], this.field_1393[1], this.field_1393[2]};
      int[] var2 = new int[]{this.field_1393[0], this.field_1393[1] + this.field_903 - 1, this.field_1393[2]};
      int var3 = this.field_721.method_813(this.field_1393[0], this.field_1393[1] - 1, this.field_1393[2]);
      if (var3 != 2 && var3 != 3) {
         return false;
      }

      int var4 = this.method_323(var1, var2);
      if (var4 == -1) {
         return true;
      }

      if (var4 < 6) {
         return false;
      }

      this.field_903 = var4;
      return true;
   }

   @Override
   public void method_744(double var1, double var3, double var5) {
      this.field_1125 = (int)(var1 * 12.0);
      if (var1 > 0.5) {
         this.field_191 = 5;
      }

      this.field_683 = var3;
      this.field_1344 = var5;
   }

   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      if (this.field_1447 == null || var2.nextInt(150) != 0 && !this.field_1447) {
         if (var2.nextInt(100) <= 5) {
            this.field_418 = Class323.field_101.field_1379;
            this.field_533 = Class323.field_863.field_1379;
         }

         this.field_721 = var1;
         long var6 = var2.nextLong();
         this.field_602.setSeed(var6);
         this.field_1393[0] = var3;
         this.field_1393[1] = var4;
         this.field_1393[2] = var5;
         if (this.field_903 == 0) {
            this.field_903 = 5 + this.field_602.nextInt(this.field_1125);
         }

         if (!this.method_511()) {
            return false;
         }

         this.method_349();
         this.method_689();
         this.method_299();
         this.method_989();
         return true;
      } else {
         return this.method_867(var1, var2, var3, var4, var5);
      }
   }
}
