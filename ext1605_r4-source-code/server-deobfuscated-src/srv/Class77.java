package srv;

import java.util.Random;

public final class Class77 extends Class49 {
   private Class104 field_335 = null;

   public Class77(double var1, double var3, Class49.Inner296 var5) {
      super(var1, var3, var5);
   }

   private void method_968(Class317 var1, int var2, int var3, int var4) {
      var1.method_226(var2, var3, var4, Class323.field_382.field_1379);
      if (var1.method_813(var2 - 1, var3, var4) == 0) {
         var1.method_226(var2 - 1, var3, var4, Class323.field_94.field_1379);
      }

      if (var1.method_813(var2, var3, var4 - 1) == 0) {
         var1.method_226(var2, var3, var4 - 1, Class323.field_94.field_1379);
      }

      if (var1.method_813(var2 + 1, var3, var4) == 0) {
         var1.method_226(var2 + 1, var3, var4, Class323.field_94.field_1379);
      }

      if (var1.method_813(var2, var3, var4 + 1) == 0) {
         var1.method_226(var2, var3, var4 + 1, Class323.field_94.field_1379);
      }

      if (var1.method_813(var2, var3 + 1, var4) == 0) {
         var1.method_226(var2, var3 + 1, var4, Class323.field_94.field_1379);
      }
   }

   private void method_815(Random var1, Class317 var2, int var3, int var4) {
      for (int var5 = -1; var5 <= 1; var5++) {
         for (int var6 = -1; var6 <= 1; var6++) {
            for (int var7 = 0; var7 <= 1; var7++) {
               this.method_968(var2, var3 + var5, 7 + var7, var4 + var6);
            }
         }
      }

      for (int var12 = 0; var12 < 3; var12++) {
         int var16 = var1.nextInt(2) * 2 - 1;
         int var18 = var1.nextInt(2) * 2 - 1;
         int var8 = var1.nextInt(2) + 2;
         int var9 = var1.nextInt(2) + 2;

         for (int var10 = 0; var10 < var8; var10++) {
            for (int var11 = 0; var11 < var9; var11++) {
               this.method_968(var2, var3 + var10 * var16, 7, var4 + var11 * var18);
            }
         }
      }

      for (int var13 = -2; var13 <= 2; var13++) {
         if (var2.method_813(var3 + var13, 7, var4 + 2) == Class323.field_382.field_1379 && var1.nextInt(6) == 0) {
            this.method_968(var2, var3 + var13, 8, var4 + 2);
         }

         if (var2.method_813(var3 + var13, 7, var4 - 2) == Class323.field_382.field_1379 && var1.nextInt(6) == 0) {
            this.method_968(var2, var3 + var13, 8, var4 - 2);
         }

         if (var2.method_813(var3 + 2, 7, var4 + var13) == Class323.field_382.field_1379 && var1.nextInt(6) == 0) {
            this.method_968(var2, var3 + 2, 8, var4 + var13);
         }

         if (var2.method_813(var3 - 2, 7, var4 + var13) == Class323.field_382.field_1379 && var1.nextInt(6) == 0) {
            this.method_968(var2, var3 - 2, 8, var4 + var13);
         }
      }

      int var14 = -var1.nextInt(2);
      int var17 = -var1.nextInt(2);

      for (int var19 = var14; var19 < 2 + var14; var19++) {
         for (int var20 = var17; var20 < 2 + var17; var20++) {
            this.method_968(var2, var3 + var19, 9, var4 + var20);
         }
      }

      for (int var15 = 4; var15 < 10; var15++) {
         var2.method_260(var3, var15, var4, Class323.field_624.field_1379);
      }
   }

   @Override
   public boolean method_851(Random var1, Class317 var2, int var3, int var4) {
      boolean var5 = false;

      for (int var6 = 0; var6 < 16; var6++) {
         for (int var7 = 0; var7 < 16; var7++) {
            if (this.field_335.method_802(var3 * 16 + var6, var4 * 16 + var7) > 0.1) {
               var2.method_260(var3 * 16 + var6, 3, var4 * 16 + var7, Class323.field_1541.field_1379);
               if (var1.nextInt(400) == 0 && !var5) {
                  this.method_815(var1, var2, var3 * 16 + var6, var4 * 16 + var7);
                  var5 = true;
               } else if (var1.nextInt(120) == 0 && var2.method_813(var3 * 16 + var6, 4, var4 * 16 + var7) == 0) {
                  var2.method_226(var3 * 16 + var6, 4, var4 * 16 + var7, Class323.field_463.field_1379);
               }
            }
         }
      }

      return false;
   }

   @Override
   public void method_824(Random var1) {
      this.field_335 = new Class104(var1, 6);
   }
}
