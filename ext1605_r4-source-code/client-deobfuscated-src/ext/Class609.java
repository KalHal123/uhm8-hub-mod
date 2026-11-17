package ext;

import java.util.Random;

public class Class609 extends Class108 {
   protected Class609(int var1, int var2) {
      super(var1, var2, Class160.field_1533);
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
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class630.method_969(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1 - var5, var4 + 1 - var5);
   }

   @Override
   public Class630 method_366(Class454 var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return Class630.method_969(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1, var4 + 1 - var5);
   }

   @Override
   public int method_1735(int var1) {
      return var1 == 1 ? this.field_2972 - 1 : (var1 == 0 ? this.field_2972 + 1 : this.field_2972);
   }

   @Override
   public boolean method_636() {
      return false;
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public int method_1900() {
      return 13;
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return !super.method_432(var1, var2, var3, var4) ? false : this.method_1674(var1, var2, var3, var4);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      if (!this.method_1674(var1, var2, var3, var4)) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_1674(Class454 var1, int var2, int var3, int var4) {
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
      return var5 == Class108.field_316.field_2151 || var5 == Class108.field_2692.field_2151;
   }

   @Override
   public void method_1220(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      var5.method_308((Class359)null, 1);
   }
}
