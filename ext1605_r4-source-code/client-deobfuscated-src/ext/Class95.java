package ext;

import java.util.Random;

public class Class95 extends Class407 {
   protected Class95(int var1, int var2) {
      super(var1, Class160.field_1447);
      this.field_2119 = var2;
      float var3 = 0.375F;
      this.method_1930(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
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
   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3 - 1, var4);
      if (var5 == this.field_19) {
         return true;
      } else if (var5 != Class407.field_1875.field_19 && var5 != Class407.field_2578.field_19) {
         return false;
      } else if (var1.method_1286(var2 - 1, var3 - 1, var4) == Class160.field_1413) {
         return true;
      } else if (var1.method_1286(var2 + 1, var3 - 1, var4) == Class160.field_1413) {
         return true;
      } else {
         return var1.method_1286(var2, var3 - 1, var4 - 1) == Class160.field_1413 ? true : var1.method_1286(var2, var3 - 1, var4 + 1) == Class160.field_1413;
      }
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      this.method_587(var1, var2, var3, var4);
   }

   protected final void method_587(Class454 var1, int var2, int var3, int var4) {
      if (!this.method_853(var1, var2, var3, var4)) {
         this.method_1227(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_853(Class454 var1, int var2, int var3, int var4) {
      return this.method_1531(var1, var2, var3, var4);
   }

   @Override
   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return Class755.field_504.field_10;
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
      return 1;
   }
}
