package srv;

import java.util.Random;

public class Class46 extends Class277 {
   private Random field_662 = new Random();

   protected Class46(int var1) {
      super(var1, Class111.field_1200);
      this.field_1137 = 26;
   }

   @Override
   public int method_310(int var1) {
      return var1 == 1 ? this.field_1137 - 1 : (var1 == 0 ? this.field_1137 - 1 : (var1 == 3 ? this.field_1137 + 1 : this.field_1137));
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var1.method_813(var2 - 1, var3, var4) == this.field_1379) {
         var5++;
      }

      if (var1.method_813(var2 + 1, var3, var4) == this.field_1379) {
         var5++;
      }

      if (var1.method_813(var2, var3, var4 - 1) == this.field_1379) {
         var5++;
      }

      if (var1.method_813(var2, var3, var4 + 1) == this.field_1379) {
         var5++;
      }

      return var5 > 1
         ? false
         : (
            this.method_937(var1, var2 - 1, var3, var4)
               ? false
               : (
                  this.method_937(var1, var2 + 1, var3, var4)
                     ? false
                     : (this.method_937(var1, var2, var3, var4 - 1) ? false : !this.method_937(var1, var2, var3, var4 + 1))
               )
         );
   }

   private boolean method_937(Class317 var1, int var2, int var3, int var4) {
      return var1.method_813(var2, var3, var4) != this.field_1379
         ? false
         : (
            var1.method_813(var2 - 1, var3, var4) == this.field_1379
               ? true
               : (
                  var1.method_813(var2 + 1, var3, var4) == this.field_1379
                     ? true
                     : (var1.method_813(var2, var3, var4 - 1) == this.field_1379 ? true : var1.method_813(var2, var3, var4 + 1) == this.field_1379)
               )
         );
   }

   @Override
   public void method_650(Class317 var1, int var2, int var3, int var4) {
      Class171 var5 = (Class171)var1.method_49(var2, var3, var4);
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.method_214(); var6++) {
            Class150 var7 = var5.method_908(var6);
            if (var7 != null) {
               float var8 = this.field_662.nextFloat() * 0.8F + 0.1F;
               float var9 = this.field_662.nextFloat() * 0.8F + 0.1F;
               float var10 = this.field_662.nextFloat() * 0.8F + 0.1F;

               while (var7.field_1497 > 0) {
                  int var11 = this.field_662.nextInt(21) + 10;
                  if (var11 > var7.field_1497) {
                     var11 = var7.field_1497;
                  }

                  var7.field_1497 -= var11;
                  Class39 var12 = new Class39(var1, var2 + var8, var3 + var9, var4 + var10, new Class150(var7.field_1298, var11, var7.field_819));
                  float var13 = 0.05F;
                  var12.field_607 = (float)this.field_662.nextGaussian() * var13;
                  var12.field_780 = (float)this.field_662.nextGaussian() * var13 + 0.2F;
                  var12.field_921 = (float)this.field_662.nextGaussian() * var13;
                  var1.method_237(var12);
               }
            }
         }
      }

      super.method_650(var1, var2, var3, var4);
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      Interface327 var6 = (Class171)var1.method_49(var2, var3, var4);
      if (var1.method_604(var2, var3 + 1, var4)) {
         return true;
      }

      if (var1.method_813(var2 - 1, var3, var4) == this.field_1379 && var1.method_604(var2 - 1, var3 + 1, var4)) {
         return true;
      }

      if (var1.method_813(var2 + 1, var3, var4) == this.field_1379 && var1.method_604(var2 + 1, var3 + 1, var4)) {
         return true;
      }

      if (var1.method_813(var2, var3, var4 - 1) == this.field_1379 && var1.method_604(var2, var3 + 1, var4 - 1)) {
         return true;
      }

      if (var1.method_813(var2, var3, var4 + 1) == this.field_1379 && var1.method_604(var2, var3 + 1, var4 + 1)) {
         return true;
      }

      if (var1.method_813(var2 - 1, var3, var4) == this.field_1379) {
         var6 = new Class144("Large chest", (Class171)var1.method_49(var2 - 1, var3, var4), var6);
      }

      if (var1.method_813(var2 + 1, var3, var4) == this.field_1379) {
         var6 = new Class144("Large chest", var6, (Class171)var1.method_49(var2 + 1, var3, var4));
      }

      if (var1.method_813(var2, var3, var4 - 1) == this.field_1379) {
         var6 = new Class144("Large chest", (Class171)var1.method_49(var2, var3, var4 - 1), var6);
      }

      if (var1.method_813(var2, var3, var4 + 1) == this.field_1379) {
         var6 = new Class144("Large chest", var6, (Class171)var1.method_49(var2, var3, var4 + 1));
      }

      var5.method_983(var6);
      return true;
   }

   @Override
   protected Class66 method_707() {
      return new Class171();
   }
}
