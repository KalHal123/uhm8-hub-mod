package ext;

import java.util.Random;

public class Class409 extends Class19 {
   private Random field_404 = new Random();

   protected Class409(int var1) {
      super(var1, Class160.field_265);
      this.field_2972 = 26;
   }

   @Override
   public int method_213(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return this.field_2972 - 1;
      }

      if (var5 == 0) {
         return this.field_2972 - 1;
      }

      int var6 = var1.method_197(var2, var3, var4 - 1);
      int var7 = var1.method_197(var2, var3, var4 + 1);
      int var8 = var1.method_197(var2 - 1, var3, var4);
      int var9 = var1.method_197(var2 + 1, var3, var4);
      if (var6 != this.field_2151 && var7 != this.field_2151) {
         if (var8 != this.field_2151 && var9 != this.field_2151) {
            byte var14 = 3;
            if (Class108.field_710[var6] && !Class108.field_710[var7]) {
               var14 = 3;
            }

            if (Class108.field_710[var7] && !Class108.field_710[var6]) {
               var14 = 2;
            }

            if (Class108.field_710[var8] && !Class108.field_710[var9]) {
               var14 = 5;
            }

            if (Class108.field_710[var9] && !Class108.field_710[var8]) {
               var14 = 4;
            }

            return var5 == var14 ? this.field_2972 + 1 : this.field_2972;
         } else if (var5 != 4 && var5 != 5) {
            int var15 = 0;
            if (var8 == this.field_2151) {
               var15 = -1;
            }

            int var16 = var1.method_197(var8 == this.field_2151 ? var2 - 1 : var2 + 1, var3, var4 - 1);
            int var17 = var1.method_197(var8 == this.field_2151 ? var2 - 1 : var2 + 1, var3, var4 + 1);
            if (var5 == 3) {
               var15 = -1 - var15;
            }

            byte var18 = 3;
            if ((Class108.field_710[var6] || Class108.field_710[var16]) && !Class108.field_710[var7] && !Class108.field_710[var17]) {
               var18 = 3;
            }

            if ((Class108.field_710[var7] || Class108.field_710[var17]) && !Class108.field_710[var6] && !Class108.field_710[var16]) {
               var18 = 2;
            }

            return (var5 == var18 ? this.field_2972 + 16 : this.field_2972 + 32) + var15;
         } else {
            return this.field_2972;
         }
      } else if (var5 != 2 && var5 != 3) {
         int var10 = 0;
         if (var6 == this.field_2151) {
            var10 = -1;
         }

         int var11 = var1.method_197(var2 - 1, var3, var6 == this.field_2151 ? var4 - 1 : var4 + 1);
         int var12 = var1.method_197(var2 + 1, var3, var6 == this.field_2151 ? var4 - 1 : var4 + 1);
         if (var5 == 4) {
            var10 = -1 - var10;
         }

         byte var13 = 5;
         if ((Class108.field_710[var8] || Class108.field_710[var11]) && !Class108.field_710[var9] && !Class108.field_710[var12]) {
            var13 = 5;
         }

         if ((Class108.field_710[var9] || Class108.field_710[var12]) && !Class108.field_710[var8] && !Class108.field_710[var11]) {
            var13 = 4;
         }

         return (var5 == var13 ? this.field_2972 + 16 : this.field_2972 + 32) + var10;
      } else {
         return this.field_2972;
      }
   }

   @Override
   public int method_1735(int var1) {
      return var1 == 1 ? this.field_2972 - 1 : (var1 == 0 ? this.field_2972 - 1 : (var1 == 3 ? this.field_2972 + 1 : this.field_2972));
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var1.method_197(var2 - 1, var3, var4) == this.field_2151) {
         var5++;
      }

      if (var1.method_197(var2 + 1, var3, var4) == this.field_2151) {
         var5++;
      }

      if (var1.method_197(var2, var3, var4 - 1) == this.field_2151) {
         var5++;
      }

      if (var1.method_197(var2, var3, var4 + 1) == this.field_2151) {
         var5++;
      }

      return var5 > 1
         ? false
         : (
            this.method_509(var1, var2 - 1, var3, var4)
               ? false
               : (
                  this.method_509(var1, var2 + 1, var3, var4)
                     ? false
                     : (this.method_509(var1, var2, var3, var4 - 1) ? false : !this.method_509(var1, var2, var3, var4 + 1))
               )
         );
   }

   private boolean method_509(Class454 var1, int var2, int var3, int var4) {
      return var1.method_197(var2, var3, var4) != this.field_2151
         ? false
         : (
            var1.method_197(var2 - 1, var3, var4) == this.field_2151
               ? true
               : (
                  var1.method_197(var2 + 1, var3, var4) == this.field_2151
                     ? true
                     : (var1.method_197(var2, var3, var4 - 1) == this.field_2151 ? true : var1.method_197(var2, var3, var4 + 1) == this.field_2151)
               )
         );
   }

   @Override
   public void method_1736(Class454 var1, int var2, int var3, int var4) {
      Class520 var5 = (Class520)var1.method_1303(var2, var3, var4);
      if (var5 == null) {
         super.method_1736(var1, var2, var3, var4);
      } else {
         for (int var6 = 0; var6 < var5.method_1574(); var6++) {
            Class334 var7 = var5.method_1416(var6);
            if (var7 != null) {
               float var8 = this.field_404.nextFloat() * 0.8F + 0.1F;
               float var9 = this.field_404.nextFloat() * 0.8F + 0.1F;
               float var10 = this.field_404.nextFloat() * 0.8F + 0.1F;

               while (var7.field_2326 > 0) {
                  int var11 = this.field_404.nextInt(21) + 10;
                  if (var11 > var7.field_2326) {
                     var11 = var7.field_2326;
                  }

                  var7.field_2326 -= var11;
                  Class198 var12 = new Class198(var1, var2 + var8, var3 + var9, var4 + var10, new Class334(var7.field_1782, var11, var7.field_1862));
                  float var13 = 0.05F;
                  var12.field_2549 = (float)this.field_404.nextGaussian() * var13;
                  var12.field_2501 = (float)this.field_404.nextGaussian() * var13 + 0.2F;
                  var12.field_489 = (float)this.field_404.nextGaussian() * var13;
                  var1.method_1447(var12);
               }
            }
         }

         super.method_1736(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      Interface181 var6 = (Class520)var1.method_1303(var2, var3, var4);
      if (var1.method_768(var2, var3 + 1, var4)) {
         return true;
      }

      if (var1.method_197(var2 - 1, var3, var4) == this.field_2151 && var1.method_768(var2 - 1, var3 + 1, var4)) {
         return true;
      }

      if (var1.method_197(var2 + 1, var3, var4) == this.field_2151 && var1.method_768(var2 + 1, var3 + 1, var4)) {
         return true;
      }

      if (var1.method_197(var2, var3, var4 - 1) == this.field_2151 && var1.method_768(var2, var3 + 1, var4 - 1)) {
         return true;
      }

      if (var1.method_197(var2, var3, var4 + 1) == this.field_2151 && var1.method_768(var2, var3 + 1, var4 + 1)) {
         return true;
      }

      if (var1.method_197(var2 - 1, var3, var4) == this.field_2151) {
         var6 = new Class156("Large chest", (Class520)var1.method_1303(var2 - 1, var3, var4), var6);
      }

      if (var1.method_197(var2 + 1, var3, var4) == this.field_2151) {
         var6 = new Class156("Large chest", var6, (Class520)var1.method_1303(var2 + 1, var3, var4));
      }

      if (var1.method_197(var2, var3, var4 - 1) == this.field_2151) {
         var6 = new Class156("Large chest", (Class520)var1.method_1303(var2, var3, var4 - 1), var6);
      }

      if (var1.method_197(var2, var3, var4 + 1) == this.field_2151) {
         var6 = new Class156("Large chest", var6, (Class520)var1.method_1303(var2, var3, var4 + 1));
      }

      var5.method_1217(var6);
      return true;
   }

   @Override
   protected Class186 method_1267() {
      return new Class520();
   }
}
