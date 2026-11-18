package srv;

import java.util.ArrayList;
import java.util.Random;

public class Class22 extends Class19 {
   private Boolean field_1582 = null;

   public Class22 method_512(boolean var1) {
      this.field_1582 = var1;
      return this;
   }

   private boolean method_942(Class317 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class371.field_158.field_1379;
      int var7 = Class371.field_831.field_1379;
      if (var2.nextInt(100) <= 5) {
         var6 = Class323.field_101.field_1379;
         var7 = Class323.field_863.field_1379;
      }

      int var8 = var2.nextInt(4) + 4;
      int var9 = var2.nextInt(100);
      if (var9 >= 6 && var9 <= 14) {
         var6 = Class323.field_1196.field_1379;
         var7 = Class323.field_1142.field_1379;
         var8 = var2.nextInt(1) + 1;
      }

      boolean var10 = true;
      if (var4 >= 1 && var4 + var8 + 1 <= 128) {
         for (int var11 = var4; var11 <= var4 + 1 + var8; var11++) {
            byte var15 = 1;
            if (var11 == var4) {
               var15 = 0;
            }

            if (var11 >= var4 + 1 + var8 - 2) {
               var15 = 2;
            }

            for (int var12 = var3 - var15; var12 <= var3 + var15 && var10; var12++) {
               for (int var13 = var5 - var15; var13 <= var5 + var15 && var10; var13++) {
                  if (var11 >= 0 && var11 < 128) {
                     int var14 = var1.method_813(var12, var11, var13);
                     if (var14 != 0 && var14 != var7) {
                        var10 = false;
                     }
                  } else {
                     var10 = false;
                  }
               }
            }
         }

         if (!var10) {
            return false;
         }

         int var19 = var1.method_813(var3, var4 - 1, var5);
         if ((var19 == Class371.field_1206.field_1379 || var19 == Class371.field_1082.field_1379) && var4 < 128 - var8 - 1) {
            var1.method_260(var3, var4 - 1, var5, Class371.field_1082.field_1379);

            for (int var24 = var4 - 3 + var8; var24 <= var4 + var8; var24++) {
               int var20 = var24 - (var4 + var8);
               int var22 = 1 - var20 / 2;

               for (int var23 = var3 - var22; var23 <= var3 + var22; var23++) {
                  int var16 = var23 - var3;

                  for (int var17 = var5 - var22; var17 <= var5 + var22; var17++) {
                     int var18 = var17 - var5;
                     if ((Math.abs(var16) != var22 || Math.abs(var18) != var22 || var2.nextInt(2) != 0 && var20 != 0)
                        && !Class371.field_380[var1.method_813(var23, var24, var17)]) {
                        var1.method_260(var23, var24, var17, var7);
                     }
                  }
               }
            }

            for (int var25 = 0; var25 < var8; var25++) {
               int var21 = var1.method_813(var3, var4 + var25, var5);
               if (var21 == 0 || var21 == var7) {
                  var1.method_260(var3, var4 + var25, var5, var6);
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method_160(Class317 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class323.field_1116.field_1379;
      int var7 = Class323.field_1209.field_1379;
      float var8 = 0.0F;
      float var9 = var2.nextFloat() * (float) Math.PI * 2.0F;
      int var10 = var2.nextInt(8) + 7;
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
      int var16 = var2.nextInt(2) + 2;

      for (int var17 = 0; var17 < var16; var17++) {
         var1.method_260(var3, var4, var5, var7);

         for (float var18 = 0.0F; var18 < Math.PI * 2; var18 = (float)(var18 + (Math.PI / 5))) {
            int var19 = var2.nextInt(var17 + 2) + var17 + 2;
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

   private void method_923(Class317 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class323.field_969.field_1379;
      int var7 = var2.nextInt(3);

      for (int var8 = 0; var8 < var7; var8++) {
         int var9 = var2.nextInt(4) + 2;
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

   private boolean method_825(Class317 var1, Random var2, int var3, int var4, int var5) {
      int var6 = Class323.field_1116.field_1379;
      int var7 = Class323.field_1209.field_1379;
      if (var1.method_813(var3, var4 - 1, var5) != Class371.field_1206.field_1379 && var1.method_813(var3, var4 - 1, var5) != Class371.field_1082.field_1379) {
         return true;
      }

      Random var8 = new Random(var2.nextLong() + var3 + var4 + var5 + var1.field_68);
      ArrayList var9 = new ArrayList();
      int var10 = 7 + var8.nextInt(10);
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

               while (var8.nextInt(var9.size() / 30 + 2) <= 1 && var9.size() <= 10000) {
                  if (++var17 >= 4) {
                     break;
                  }

                  Class47 var18 = var13.method_203(var8.nextInt(3) - 1, -1.0, var8.nextInt(3) - 1);
                  var9.add(var18);
               }

               if (var11 > 2 && var8.nextInt(Math.max(40, 78 - var11)) == 3) {
                  this.method_160(var1, var2, var14, var15, var16);
               }

               var9.remove(var13);
               var9.add(var13.method_203(0.0, -1.0, 0.0));
            } else {
               var9.remove(var13);
               if (var1.method_813(var14, var15, var16) == Class371.field_1082.field_1379
                  || var1.method_813(var14, var15, var16) == Class371.field_1206.field_1379) {
                  this.method_923(var1, var8, var14, var15, var16);
               }
            }
         }
      }

      return true;
   }

   @Override
   public boolean method_453(Class317 var1, Random var2, int var3, int var4, int var5) {
      Random var6 = new Random(var2.nextLong() + var3 + var4 + var5 + var1.field_68);
      return this.field_1582 == null || var6.nextInt(150) != 0 && !this.field_1582
         ? this.method_942(var1, var2, var3, var4, var5)
         : this.method_825(var1, var2, var3, var4, var5);
   }
}
