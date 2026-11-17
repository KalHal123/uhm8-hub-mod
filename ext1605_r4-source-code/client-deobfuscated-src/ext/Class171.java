package ext;

import java.util.Random;

public class Class171 extends Class407 {
   protected Class171(int var1) {
      super(var1, Class160.field_1750);
      this.field_2119 = 87;
      this.method_1936(true);
      this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.method_1062(255);
   }

   @Override
   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      return Class630.method_969(var2 + 0, var3 + 0, var4 + 0, var2 + 1, var3 + 1, var4 + 1);
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
   public int method_1411(int var1, int var2) {
      if (var1 == 1 && var2 > 0) {
         return this.field_2119 - 1;
      } else {
         return var1 == 1 ? this.field_2119 : 2;
      }
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(5) == 0) {
         if (this.method_785(var1, var2, var3, var4)) {
            var1.method_518(var2, var3, var4, 7);
         } else {
            int var6 = var1.method_1110(var2, var3, var4);
            if (var6 > 0) {
               var1.method_518(var2, var3, var4, var6 - 1);
            } else if (!this.method_215(var1, var2, var3, var4)) {
               var1.method_1481(var2, var3, var4, Class407.field_2578.field_19);
            }
         }
      }
   }

   @Override
   public void method_1677(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      if (var1.field_2150.nextInt(4) == 0) {
         var1.method_1481(var2, var3, var4, Class407.field_2578.field_19);
      }
   }

   private boolean method_215(Class454 var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for (int var6 = var2 - var5; var6 <= var2 + var5; var6++) {
         for (int var7 = var4 - var5; var7 <= var4 + var5; var7++) {
            if (var1.method_197(var6, var3 + 1, var7) == Class407.field_246.field_19) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean method_785(Class454 var1, int var2, int var3, int var4) {
      for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
         for (int var6 = var3; var6 <= var3 + 1; var6++) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
               if (var1.method_1286(var5, var6, var7) == Class160.field_1413) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      super.method_1300(var1, var2, var3, var4, var5);
      Class160 var6 = var1.method_1286(var2, var3 + 1, var4);
      if (var6.method_1888()) {
         var1.method_1481(var2, var3, var4, Class407.field_2578.field_19);
      }
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return Class407.field_2578.method_1651(0, var2);
   }
}
