package ext;

import java.util.Random;

public class Class228 extends Class108 {
   protected Class228(int var1) {
      super(var1, Class160.field_1750);
      this.field_2972 = 87;
      this.method_1646(true);
      this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.method_336(255);
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      return Class630.method_969(var2 + 0, var3 + 0, var4 + 0, var2 + 1, var3 + 1, var4 + 1);
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
   public int method_774(int var1, int var2) {
      return var1 == 1 && var2 > 0 ? this.field_2972 - 1 : (var1 == 1 ? this.field_2972 : 2);
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(5) == 0) {
         if (this.method_1480(var1, var2, var3, var4)) {
            var1.method_518(var2, var3, var4, 7);
         } else {
            int var6 = var1.method_1110(var2, var3, var4);
            if (var6 > 0) {
               var1.method_518(var2, var3, var4, var6 - 1);
            } else if (!this.method_868(var1, var2, var3, var4)) {
               var1.method_1481(var2, var3, var4, Class108.field_1047.field_2151);
            }
         }
      }
   }

   @Override
   public void method_1507(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      if (var1.field_2150.nextInt(4) == 0) {
         var1.method_1481(var2, var3, var4, Class108.field_1047.field_2151);
      }
   }

   private boolean method_868(Class454 var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for (int var6 = var2 - var5; var6 <= var2 + var5; var6++) {
         for (int var7 = var4 - var5; var7 <= var4 + var5; var7++) {
            if (var1.method_197(var6, var3 + 1, var7) == Class108.field_2231.field_2151) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean method_1480(Class454 var1, int var2, int var3, int var4) {
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
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      super.method_1464(var1, var2, var3, var4, var5);
      Class160 var6 = var1.method_1286(var2, var3 + 1, var4);
      if (var6.method_1888()) {
         var1.method_1481(var2, var3, var4, Class108.field_1047.field_2151);
      }
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return Class108.field_1047.method_1901(0, var2);
   }
}
