package ext;

import java.util.Random;

public class Class460 extends Class108 {
   protected Class460(int var1, int var2) {
      super(var1, Class160.field_1447);
      this.field_2972 = var2;
      float var3 = 0.375F;
      this.method_1618(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
      this.method_1646(true);
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_197(var2, var3 + 1, var4) == 0) {
         int var6 = 1;

         while (var1.method_197(var2, var3 - var6, var4) == this.field_2151) {
            var6++;
         }

         if (var6 < 3) {
            int var7 = var1.method_1110(var2, var3, var4);
            if (var7 == 15) {
               var1.method_1481(var2, var3 + 1, var4, this.field_2151);
               var1.method_518(var2, var3, var4, 0);
            } else {
               var1.method_518(var2, var3, var4, var7 + 1);
            }
         }
      }
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3 - 1, var4);
      return var5 == this.field_2151
         ? true
         : (
            var5 != Class108.field_1970.field_2151 && var5 != Class108.field_1047.field_2151
               ? false
               : (
                  var1.method_1286(var2 - 1, var3 - 1, var4) == Class160.field_1413
                     ? true
                     : (
                        var1.method_1286(var2 + 1, var3 - 1, var4) == Class160.field_1413
                           ? true
                           : (
                              var1.method_1286(var2, var3 - 1, var4 - 1) == Class160.field_1413
                                 ? true
                                 : var1.method_1286(var2, var3 - 1, var4 + 1) == Class160.field_1413
                           )
                     )
               )
         );
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      this.method_1420(var1, var2, var3, var4);
   }

   protected final void method_1420(Class454 var1, int var2, int var3, int var4) {
      if (!this.method_1674(var1, var2, var3, var4)) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_1674(Class454 var1, int var2, int var3, int var4) {
      return this.method_432(var1, var2, var3, var4);
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return Class755.field_504.field_10;
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public boolean method_636() {
      return false;
   }

   @Override
   public int method_1900() {
      return 1;
   }
}
