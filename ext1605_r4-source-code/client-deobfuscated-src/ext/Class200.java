package ext;

import java.util.Random;

public class Class200 extends Class108 {
   private boolean field_1159;

   public Class200(int var1, int var2, boolean var3) {
      super(var1, var2, Class160.field_68);
      if (var3) {
         this.method_1646(true);
      }

      this.field_1159 = var3;
   }

   @Override
   public int method_1427() {
      return 30;
   }

   @Override
   public void method_424(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      this.method_441(var1, var2, var3, var4);
      super.method_424(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_1507(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      this.method_441(var1, var2, var3, var4);
      super.method_1507(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      this.method_441(var1, var2, var3, var4);
      return super.method_835(var1, var2, var3, var4, var5);
   }

   private void method_441(Class454 var1, int var2, int var3, int var4) {
      this.method_870(var1, var2, var3, var4);
      if (this.field_2151 == Class108.field_36.field_2151) {
         var1.method_1481(var2, var3, var4, Class108.field_305.field_2151);
      }
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_2151 == Class108.field_305.field_2151) {
         var1.method_1481(var2, var3, var4, Class108.field_36.field_2151);
      }
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return Class755.field_1672.field_10;
   }

   @Override
   public int method_1257(Random var1) {
      return 4 + var1.nextInt(2);
   }

   @Override
   public void method_1500(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_1159) {
         this.method_870(var1, var2, var3, var4);
      }
   }

   private void method_870(Class454 var1, int var2, int var3, int var4) {
      Random var5 = var1.field_2150;
      double var6 = 0.0625;

      for (int var8 = 0; var8 < 6; var8++) {
         double var9 = var2 + var5.nextFloat();
         double var11 = var3 + var5.nextFloat();
         double var13 = var4 + var5.nextFloat();
         if (var8 == 0 && !var1.method_768(var2, var3 + 1, var4)) {
            var11 = var3 + 1 + var6;
         }

         if (var8 == 1 && !var1.method_768(var2, var3 - 1, var4)) {
            var11 = var3 + 0 - var6;
         }

         if (var8 == 2 && !var1.method_768(var2, var3, var4 + 1)) {
            var13 = var4 + 1 + var6;
         }

         if (var8 == 3 && !var1.method_768(var2, var3, var4 - 1)) {
            var13 = var4 + 0 - var6;
         }

         if (var8 == 4 && !var1.method_768(var2 + 1, var3, var4)) {
            var9 = var2 + 1 + var6;
         }

         if (var8 == 5 && !var1.method_768(var2 - 1, var3, var4)) {
            var9 = var2 + 0 - var6;
         }

         if (var9 < var2 || var9 > var2 + 1 || var11 < 0.0 || var11 > var3 + 1 || var13 < var4 || var13 > var4 + 1) {
            var1.method_1347("reddust", var9, var11, var13, 0.0, 0.0, 0.0);
         }
      }
   }
}
