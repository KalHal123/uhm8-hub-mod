import java.util.Random;

public class ag extends ln {
   private boolean a;

   public ag(int var1, int var2, boolean var3) {
      super(var1, var2, fs.d);
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
   public void b(cj var1, int var2, int var3, int var4, dg var5) {
      this.h(var1, var2, var3, var4);
      super.b(var1, var2, var3, var4, var5);
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, jx var5) {
      this.h(var1, var2, var3, var4);
      super.a(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4, dg var5) {
      this.h(var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5);
   }

   private void h(cj var1, int var2, int var3, int var4) {
      this.i(var1, var2, var3, var4);
      if (this.ba == ln.aN.ba) {
         var1.d(var2, var3, var4, ln.aO.ba);
      }
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, Random var5) {
      if (this.ba == ln.aO.ba) {
         var1.d(var2, var3, var4, ln.aN.ba);
      }
   }

   @Override
   public int a(int var1, Random var2) {
      return dd.aA.aQ;
   }

   @Override
   public int a(Random var1) {
      return 4 + var1.nextInt(2);
   }

   @Override
   public void b(cj var1, int var2, int var3, int var4, Random var5) {
      if (this.a) {
         this.i(var1, var2, var3, var4);
      }
   }

   private void i(cj var1, int var2, int var3, int var4) {
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
