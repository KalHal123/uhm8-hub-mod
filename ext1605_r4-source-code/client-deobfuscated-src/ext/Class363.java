package ext;

import java.util.Random;

public class Class363 extends Class407 {
   protected Class363(int var1, int var2) {
      super(var1, var2, Class160.field_1533);
      this.method_1936(true);
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_197(var2, var3 + 1, var4) == 0) {
         int var6 = 1;

         while (var1.method_197(var2, var3 - var6, var4) == this.field_19) {
            var6++;
         }

         if (var6 < 3) {
            int var7 = var1.method_1110(var2, var3, var4);
            if (var7 == 15) {
               var1.method_1481(var2, var3 + 1, var4, this.field_19);
               var1.method_518(var2, var3, var4, 0);
            } else {
               var1.method_518(var2, var3, var4, var7 + 1);
            }
         }
      }
   }

   @Override
   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class630.method_969(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1 - var5, var4 + 1 - var5);
   }

   @Override
   public Class630 method_1331(Class454 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class630.method_969(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1, var4 + 1 - var5);
   }

   @Override
   public int method_519(int var1) {
      if (var1 == 1) {
         return this.field_2119 - 1;
      } else {
         return var1 == 0 ? this.field_2119 + 1 : this.field_2119;
      }
   }

   @Override
   public boolean method_607() {
      return false;
   }

   @Override
   public boolean method_143() {
      return false;
   }

   @Override
   public int method_178() {
      return 13;
   }

   @Override
   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      return !super.method_1531(var1, var2, var3, var4) ? false : this.method_853(var1, var2, var3, var4);
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      if (!this.method_853(var1, var2, var3, var4)) {
         this.method_1227(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_853(Class454 var1, int var2, int var3, int var4) {
      if (var1.method_1286(var2 - 1, var3, var4).method_1888()) {
         return false;
      }

      if (var1.method_1286(var2 + 1, var3, var4).method_1888()) {
         return false;
      }

      if (var1.method_1286(var2, var3, var4 - 1).method_1888()) {
         return false;
      }

      if (var1.method_1286(var2, var3, var4 + 1).method_1888()) {
         return false;
      }

      int var5 = var1.method_197(var2, var3 - 1, var4);
      return var5 == Class407.field_237.field_19 || var5 == Class407.field_2265.field_19;
   }

   @Override
   public void method_667(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      var5.method_308(null, 1);
   }
}
