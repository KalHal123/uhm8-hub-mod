package ext;

import java.util.Random;

public class Class164 extends Class407 {
   private int[] field_196 = new int[256];
   private int[] field_1365 = new int[256];

   protected Class164(int var1, int var2) {
      super(var1, var2, Class160.field_1842);
      this.method_228(Class407.field_3109.field_19, 5, 20);
      this.method_228(Class407.field_2159.field_19, 5, 5);
      this.method_228(Class407.field_664.field_19, 30, 60);
      this.method_228(Class407.field_967.field_19, 30, 20);
      this.method_228(Class407.field_2400.field_19, 15, 100);
      this.method_228(Class407.field_2858.field_19, 30, 60);
      this.method_1936(true);
   }

   private void method_228(int var1, int var2, int var3) {
      this.field_196[var1] = var2;
      this.field_1365[var1] = var3;
   }

   @Override
   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_143() {
      return false;
   }

   @Override
   public boolean method_607() {
      return false;
   }

   @Override
   public int method_178() {
      return 3;
   }

   @Override
   public int method_806(Random var1) {
      return 0;
   }

   @Override
   public int method_1520() {
      return 10;
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      if (var6 < 15) {
         var1.method_518(var2, var3, var4, var6 + 1);
         var1.method_600(var2, var3, var4, this.field_19);
      }

      if (!this.method_368(var1, var2, var3, var4)) {
         if (!var1.method_768(var2, var3 - 1, var4) || var6 > 3) {
            var1.method_1481(var2, var3, var4, 0);
         }
      } else if (!this.method_1413(var1, var2, var3 - 1, var4) && var6 == 15 && var5.nextInt(4) == 0) {
         var1.method_1481(var2, var3, var4, 0);
      } else {
         if (var6 % 2 == 0 && var6 > 2) {
            this.method_1401(var1, var2 + 1, var3, var4, 300, var5);
            this.method_1401(var1, var2 - 1, var3, var4, 300, var5);
            this.method_1401(var1, var2, var3 - 1, var4, 200, var5);
            this.method_1401(var1, var2, var3 + 1, var4, 250, var5);
            this.method_1401(var1, var2, var3, var4 - 1, 300, var5);
            this.method_1401(var1, var2, var3, var4 + 1, 300, var5);

            for (int var7 = var2 - 1; var7 <= var2 + 1; var7++) {
               for (int var8 = var4 - 1; var8 <= var4 + 1; var8++) {
                  for (int var9 = var3 - 1; var9 <= var3 + 4; var9++) {
                     if (var7 != var2 || var9 != var3 || var8 != var4) {
                        int var10 = 100;
                        if (var9 > var3 + 1) {
                           var10 += (var9 - (var3 + 1)) * 100;
                        }

                        int var11 = this.method_455(var1, var7, var9, var8);
                        if (var11 > 0 && var5.nextInt(var10) <= var11) {
                           var1.method_1481(var7, var9, var8, this.field_19);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void method_1401(Class454 var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = this.field_1365[var1.method_197(var2, var3, var4)];
      if (var6.nextInt(var5) < var7) {
         boolean var8 = var1.method_197(var2, var3, var4) == Class407.field_2400.field_19;
         if (var6.nextInt(2) == 0) {
            var1.method_1481(var2, var3, var4, this.field_19);
         } else {
            var1.method_1481(var2, var3, var4, 0);
         }

         if (var8) {
            Class407.field_2400.method_1000(var1, var2, var3, var4, 0);
         }
      }
   }

   private boolean method_368(Class454 var1, int var2, int var3, int var4) {
      if (this.method_1413(var1, var2 + 1, var3, var4)) {
         return true;
      } else if (this.method_1413(var1, var2 - 1, var3, var4)) {
         return true;
      } else if (this.method_1413(var1, var2, var3 - 1, var4)) {
         return true;
      } else if (this.method_1413(var1, var2, var3 + 1, var4)) {
         return true;
      } else {
         return this.method_1413(var1, var2, var3, var4 - 1) ? true : this.method_1413(var1, var2, var3, var4 + 1);
      }
   }

   private int method_455(Class454 var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var1.method_197(var2, var3, var4) != 0) {
         return 0;
      }

      var5 = this.method_1762(var1, var2 + 1, var3, var4, var5);
      var5 = this.method_1762(var1, var2 - 1, var3, var4, var5);
      var5 = this.method_1762(var1, var2, var3 - 1, var4, var5);
      var5 = this.method_1762(var1, var2, var3 + 1, var4, var5);
      var5 = this.method_1762(var1, var2, var3, var4 - 1, var5);
      return this.method_1762(var1, var2, var3, var4 + 1, var5);
   }

   @Override
   public boolean method_469() {
      return false;
   }

   public boolean method_1413(Interface698 var1, int var2, int var3, int var4) {
      return this.field_196[var1.method_197(var2, var3, var4)] > 0;
   }

   public int method_1762(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.field_196[var1.method_197(var2, var3, var4)];
      return var6 > var5 ? var6 : var5;
   }

   @Override
   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      return var1.method_768(var2, var3 - 1, var4) || this.method_368(var1, var2, var3, var4);
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      if (!var1.method_768(var2, var3 - 1, var4) && !this.method_368(var1, var2, var3, var4)) {
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      if (!var1.method_768(var2, var3 - 1, var4) && !this.method_368(var1, var2, var3, var4)) {
         var1.method_1481(var2, var3, var4, 0);
      } else {
         var1.method_600(var2, var3, var4, this.field_19);
      }
   }

   @Override
   public void method_453(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(24) == 0) {
         var1.method_861(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "fire.fire", 1.0F + var5.nextFloat(), var5.nextFloat() * 0.7F + 0.3F);
      }

      if (!var1.method_768(var2, var3 - 1, var4) && !Class407.field_1151.method_1413(var1, var2, var3 - 1, var4)) {
         if (Class407.field_1151.method_1413(var1, var2 - 1, var3, var4)) {
            for (int var10 = 0; var10 < 2; var10++) {
               float var15 = var2 + var5.nextFloat() * 0.1F;
               float var20 = var3 + var5.nextFloat();
               float var25 = var4 + var5.nextFloat();
               var1.method_1347("largesmoke", var15, var20, var25, 0.0, 0.0, 0.0);
            }
         }

         if (Class407.field_1151.method_1413(var1, var2 + 1, var3, var4)) {
            for (int var11 = 0; var11 < 2; var11++) {
               float var16 = var2 + 1 - var5.nextFloat() * 0.1F;
               float var21 = var3 + var5.nextFloat();
               float var26 = var4 + var5.nextFloat();
               var1.method_1347("largesmoke", var16, var21, var26, 0.0, 0.0, 0.0);
            }
         }

         if (Class407.field_1151.method_1413(var1, var2, var3, var4 - 1)) {
            for (int var12 = 0; var12 < 2; var12++) {
               float var17 = var2 + var5.nextFloat();
               float var22 = var3 + var5.nextFloat();
               float var27 = var4 + var5.nextFloat() * 0.1F;
               var1.method_1347("largesmoke", var17, var22, var27, 0.0, 0.0, 0.0);
            }
         }

         if (Class407.field_1151.method_1413(var1, var2, var3, var4 + 1)) {
            for (int var13 = 0; var13 < 2; var13++) {
               float var18 = var2 + var5.nextFloat();
               float var23 = var3 + var5.nextFloat();
               float var28 = var4 + 1 - var5.nextFloat() * 0.1F;
               var1.method_1347("largesmoke", var18, var23, var28, 0.0, 0.0, 0.0);
            }
         }

         if (Class407.field_1151.method_1413(var1, var2, var3 + 1, var4)) {
            for (int var14 = 0; var14 < 2; var14++) {
               float var19 = var2 + var5.nextFloat();
               float var24 = var3 + 1 - var5.nextFloat() * 0.1F;
               float var29 = var4 + var5.nextFloat();
               var1.method_1347("largesmoke", var19, var24, var29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int var6 = 0; var6 < 3; var6++) {
            float var7 = var2 + var5.nextFloat();
            float var8 = var3 + var5.nextFloat() * 0.5F + 0.5F;
            float var9 = var4 + var5.nextFloat();
            var1.method_1347("largesmoke", var7, var8, var9, 0.0, 0.0, 0.0);
         }
      }
   }
}
