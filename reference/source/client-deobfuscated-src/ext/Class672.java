package ext;

import java.util.Random;

public class Class672 extends Class296 {
   private Random field_2700 = new Random();

   protected Class672(int var1) {
      super(var1, Class160.field_265);
      this.field_2119 = 26;
   }

   @Override
   public int method_1278(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return this.field_2119 - 1;
      }

      if (var5 == 0) {
         return this.field_2119 - 1;
      }

      int var6 = var1.method_197(var2, var3, var4 - 1);
      int var7 = var1.method_197(var2, var3, var4 + 1);
      int var8 = var1.method_197(var2 - 1, var3, var4);
      int var9 = var1.method_197(var2 + 1, var3, var4);
      if (var6 != this.field_19 && var7 != this.field_19) {
         if (var8 != this.field_19 && var9 != this.field_19) {
            byte var15 = 3;
            if (Class407.field_682[var6] && !Class407.field_682[var7]) {
               var15 = 3;
            }

            if (Class407.field_682[var7] && !Class407.field_682[var6]) {
               var15 = 2;
            }

            if (Class407.field_682[var8] && !Class407.field_682[var9]) {
               var15 = 5;
            }

            if (Class407.field_682[var9] && !Class407.field_682[var8]) {
               var15 = 4;
            }

            return var5 == var15 ? this.field_2119 + 1 : this.field_2119;
         } else if (var5 != 4 && var5 != 5) {
            int var14 = 0;
            if (var8 == this.field_19) {
               var14 = -1;
            }

            int var16 = var1.method_197(var8 == this.field_19 ? var2 - 1 : var2 + 1, var3, var4 - 1);
            int var17 = var1.method_197(var8 == this.field_19 ? var2 - 1 : var2 + 1, var3, var4 + 1);
            if (var5 == 3) {
               var14 = -1 - var14;
            }

            byte var18 = 3;
            if ((Class407.field_682[var6] || Class407.field_682[var16]) && !Class407.field_682[var7] && !Class407.field_682[var17]) {
               var18 = 3;
            }

            if ((Class407.field_682[var7] || Class407.field_682[var17]) && !Class407.field_682[var6] && !Class407.field_682[var16]) {
               var18 = 2;
            }

            return (var5 == var18 ? this.field_2119 + 16 : this.field_2119 + 32) + var14;
         } else {
            return this.field_2119;
         }
      } else if (var5 != 2 && var5 != 3) {
         int var10 = 0;
         if (var6 == this.field_19) {
            var10 = -1;
         }

         int var11 = var1.method_197(var2 - 1, var3, var6 == this.field_19 ? var4 - 1 : var4 + 1);
         int var12 = var1.method_197(var2 + 1, var3, var6 == this.field_19 ? var4 - 1 : var4 + 1);
         if (var5 == 4) {
            var10 = -1 - var10;
         }

         byte var13 = 5;
         if ((Class407.field_682[var8] || Class407.field_682[var11]) && !Class407.field_682[var9] && !Class407.field_682[var12]) {
            var13 = 5;
         }

         if ((Class407.field_682[var9] || Class407.field_682[var12]) && !Class407.field_682[var8] && !Class407.field_682[var11]) {
            var13 = 4;
         }

         return (var5 == var13 ? this.field_2119 + 16 : this.field_2119 + 32) + var10;
      } else {
         return this.field_2119;
      }
   }

   @Override
   public int method_519(int var1) {
      if (var1 == 1) {
         return this.field_2119 - 1;
      } else if (var1 == 0) {
         return this.field_2119 - 1;
      } else {
         return var1 == 3 ? this.field_2119 + 1 : this.field_2119;
      }
   }

   @Override
   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var1.method_197(var2 - 1, var3, var4) == this.field_19) {
         var5++;
      }

      if (var1.method_197(var2 + 1, var3, var4) == this.field_19) {
         var5++;
      }

      if (var1.method_197(var2, var3, var4 - 1) == this.field_19) {
         var5++;
      }

      if (var1.method_197(var2, var3, var4 + 1) == this.field_19) {
         var5++;
      }

      if (var5 > 1) {
         return false;
      } else if (this.method_821(var1, var2 - 1, var3, var4)) {
         return false;
      } else if (this.method_821(var1, var2 + 1, var3, var4)) {
         return false;
      } else {
         return this.method_821(var1, var2, var3, var4 - 1) ? false : !this.method_821(var1, var2, var3, var4 + 1);
      }
   }

   private boolean method_821(Class454 var1, int var2, int var3, int var4) {
      if (var1.method_197(var2, var3, var4) != this.field_19) {
         return false;
      } else if (var1.method_197(var2 - 1, var3, var4) == this.field_19) {
         return true;
      } else if (var1.method_197(var2 + 1, var3, var4) == this.field_19) {
         return true;
      } else {
         return var1.method_197(var2, var3, var4 - 1) == this.field_19 ? true : var1.method_197(var2, var3, var4 + 1) == this.field_19;
      }
   }

   @Override
   public void method_1617(Class454 var1, int var2, int var3, int var4) {
      Class520 var5 = (Class520)var1.method_1303(var2, var3, var4);

      for (int var6 = 0; var6 < var5.method_1574(); var6++) {
         Class334 var7 = var5.method_1416(var6);
         if (var7 != null) {
            float var8 = this.field_2700.nextFloat() * 0.8F + 0.1F;
            float var9 = this.field_2700.nextFloat() * 0.8F + 0.1F;
            float var10 = this.field_2700.nextFloat() * 0.8F + 0.1F;

            while (var7.field_2326 > 0) {
               int var11 = this.field_2700.nextInt(21) + 10;
               if (var11 > var7.field_2326) {
                  var11 = var7.field_2326;
               }

               var7.field_2326 -= var11;
               Class198 var12 = new Class198(var1, var2 + var8, var3 + var9, var4 + var10, new Class334(var7.field_1782, var11, var7.field_1862));
               float var13 = 0.05F;
               var12.field_2549 = (float)this.field_2700.nextGaussian() * var13;
               var12.field_2501 = (float)this.field_2700.nextGaussian() * var13 + 0.2F;
               var12.field_489 = (float)this.field_2700.nextGaussian() * var13;
               var1.method_1447(var12);
            }
         }
      }

      super.method_1617(var1, var2, var3, var4);
   }

   @Override
   public boolean method_676(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      Interface181 var6 = (Class520)var1.method_1303(var2, var3, var4);
      if (var1.method_768(var2, var3 + 1, var4)) {
         return true;
      }

      if (var1.method_197(var2 - 1, var3, var4) == this.field_19 && var1.method_768(var2 - 1, var3 + 1, var4)) {
         return true;
      }

      if (var1.method_197(var2 + 1, var3, var4) == this.field_19 && var1.method_768(var2 + 1, var3 + 1, var4)) {
         return true;
      }

      if (var1.method_197(var2, var3, var4 - 1) == this.field_19 && var1.method_768(var2, var3 + 1, var4 - 1)) {
         return true;
      }

      if (var1.method_197(var2, var3, var4 + 1) == this.field_19 && var1.method_768(var2, var3 + 1, var4 + 1)) {
         return true;
      }

      if (var1.method_197(var2 - 1, var3, var4) == this.field_19) {
         var6 = new Class156("Large chest", (Class520)var1.method_1303(var2 - 1, var3, var4), var6);
      }

      if (var1.method_197(var2 + 1, var3, var4) == this.field_19) {
         var6 = new Class156("Large chest", var6, (Class520)var1.method_1303(var2 + 1, var3, var4));
      }

      if (var1.method_197(var2, var3, var4 - 1) == this.field_19) {
         var6 = new Class156("Large chest", (Class520)var1.method_1303(var2, var3, var4 - 1), var6);
      }

      if (var1.method_197(var2, var3, var4 + 1) == this.field_19) {
         var6 = new Class156("Large chest", var6, (Class520)var1.method_1303(var2, var3, var4 + 1));
      }

      var5.method_1217(var6);
      return true;
   }

   @Override
   protected Class186 method_1700() {
      return new Class520();
   }
}
