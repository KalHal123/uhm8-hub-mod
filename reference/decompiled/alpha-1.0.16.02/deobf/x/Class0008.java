package x;

import java.util.Random;

public class Class0008 extends Class0312 {
   private boolean a;

   public Class0008(int var1, int var2, boolean var3) {
      super(var1, var2, Class0155.d);
      if (var3) {
         this.b(true);
      }

      this.a = var3;
   }

   @Override
   public int a() {
      return 30;
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4, Class0089 var5) {
      this.h(var1, var2, var3, var4);
      super.b(var1, var2, var3, var4, var5);
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Class0268 var5) {
      this.h(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean a(Class0065 var1, int var2, int var3, int var4, Class0089 var5) {
      this.h(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5);
   }

   private void h(Class0065 var1, int var2, int var3, int var4) {
      this.i(var1, var2, var3, var4);
      if (this.ba == Class0312.aN.ba) {
         var1.d(var2, var3, var4, Class0312.aO.ba);
      }
   }

   @Override
   public void a(Class0065 var1, int var2, int var3, int var4, Random var5) {
      if (this.ba == Class0312.aO.ba) {
         var1.d(var2, var3, var4, Class0312.aN.ba);
      }
   }

   @Override
   public int a(int var1, Random var2) {
      return Class0086.aA.aQ;
   }

   @Override
   public int a(Random var1) {
      return 4 + var1.nextInt(2);
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4, Random var5) {
      if (this.a) {
         this.i(var1, var2, var3, var4);
      }
   }

   private void i(Class0065 var1, int var2, int var3, int var4) {
      Random var5 = var1.m;
      double var6 = 0.0625;

      for (int var8 = 0; var8 < 6; var8++) {
         double var9 = var2 + var5.nextFloat();
         double var11 = var3 + var5.nextFloat();
         double var13 = var4 + var5.nextFloat();
         if (var8 == 0 && !var1.g(var2, var3 + 1, var4)) {
            var11 = var3 + 1 + var6;
         }

         if (var8 == 1 && !var1.g(var2, var3 - 1, var4)) {
            var11 = var3 + 0 - var6;
         }

         if (var8 == 2 && !var1.g(var2, var3, var4 + 1)) {
            var13 = var4 + 1 + var6;
         }

         if (var8 == 3 && !var1.g(var2, var3, var4 - 1)) {
            var13 = var4 + 0 - var6;
         }

         if (var8 == 4 && !var1.g(var2 + 1, var3, var4)) {
            var9 = var2 + 1 + var6;
         }

         if (var8 == 5 && !var1.g(var2 - 1, var3, var4)) {
            var9 = var2 + 0 - var6;
         }

         if (var9 < var2 || var9 > var2 + 1 || var11 < 0.0 || var11 > var3 + 1 || var13 < var4 || var13 > var4 + 1) {
            var1.a("reddust", var9, var11, var13, 0.0, 0.0, 0.0);
         }
      }
   }
}
