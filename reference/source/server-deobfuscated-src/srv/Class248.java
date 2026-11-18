package srv;

import java.util.Random;

public class Class248 extends Class371 {
   private boolean field_88;

   public Class248(int var1, int var2, boolean var3) {
      super(var1, var2, Class111.field_1043);
      if (var3) {
         this.method_194(true);
      }

      this.field_88 = var3;
   }

   @Override
   public int method_796() {
      return 30;
   }

   @Override
   public void method_130(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      this.method_866(var1, var2, var3, var4);
      super.method_130(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_220(Class317 var1, int var2, int var3, int var4, Class252 var5) {
      this.method_866(var1, var2, var3, var4);
      super.method_220(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      this.method_866(var1, var2, var3, var4);
      return super.method_265(var1, var2, var3, var4, var5);
   }

   private void method_866(Class317 var1, int var2, int var3, int var4) {
      this.method_849(var1, var2, var3, var4);
      if (this.field_1379 == Class371.field_161.field_1379) {
         var1.method_226(var2, var3, var4, Class371.field_798.field_1379);
      }
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_1379 == Class371.field_798.field_1379) {
         var1.method_226(var2, var3, var4, Class371.field_161.field_1379);
      }
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class350.field_1392.field_473;
   }

   @Override
   public int method_757(Random var1) {
      return 4 + var1.nextInt(2);
   }

   private void method_849(Class317 var1, int var2, int var3, int var4) {
      Random var5 = var1.field_413;
      double var6 = 0.0625;

      for (int var8 = 0; var8 < 6; var8++) {
         double var9 = var2 + var5.nextFloat();
         double var11 = var3 + var5.nextFloat();
         double var13 = var4 + var5.nextFloat();
         if (var8 == 0 && !var1.method_604(var2, var3 + 1, var4)) {
            var11 = var3 + 1 + var6;
         }

         if (var8 == 1 && !var1.method_604(var2, var3 - 1, var4)) {
            var11 = var3 + 0 - var6;
         }

         if (var8 == 2 && !var1.method_604(var2, var3, var4 + 1)) {
            var13 = var4 + 1 + var6;
         }

         if (var8 == 3 && !var1.method_604(var2, var3, var4 - 1)) {
            var13 = var4 + 0 - var6;
         }

         if (var8 == 4 && !var1.method_604(var2 + 1, var3, var4)) {
            var9 = var2 + 1 + var6;
         }

         if (var8 == 5 && !var1.method_604(var2 - 1, var3, var4)) {
            var9 = var2 + 0 - var6;
         }

         if (var9 < var2 || var9 > var2 + 1 || var11 < 0.0 || var11 > var3 + 1 || var13 < var4 || var13 > var4 + 1) {
            var1.method_140("reddust", var9, var11, var13, 0.0, 0.0, 0.0);
         }
      }
   }
}
