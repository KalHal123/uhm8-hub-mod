import java.util.Random;

public class ly extends ln {
   protected ly(int var1) {
      super(var1, fs.b);
      this.aZ = 87;
      this.b(true);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.d(255);
   }

   @Override
   public cb d(cj var1, int var2, int var3, int var4) {
      return cb.b(var2 + 0, var3 + 0, var4 + 0, var2 + 1, var3 + 1, var4 + 1);
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public int a(int var1, int var2) {
      if (var1 == 1 && var2 > 0) {
         return this.aZ - 1;
      } else {
         return var1 == 1 ? this.aZ : 2;
      }
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(5) == 0) {
         if (this.i(var1, var2, var3, var4)) {
            var1.b(var2, var3, var4, 7);
         } else {
            int var6 = var1.e(var2, var3, var4);
            if (var6 > 0) {
               var1.b(var2, var3, var4, var6 - 1);
            } else if (!this.h(var1, var2, var3, var4)) {
               var1.d(var2, var3, var4, ln.v.ba);
            }
         }
      }
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, jx var5) {
      if (var1.m.nextInt(4) == 0) {
         var1.d(var2, var3, var4, ln.v.ba);
      }
   }

   private boolean h(cj var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for (int var6 = var2 - var5; var6 <= var2 + var5; var6++) {
         for (int var7 = var4 - var5; var7 <= var4 + var5; var7++) {
            if (var1.a(var6, var3 + 1, var7) == ln.az.ba) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean i(cj var1, int var2, int var3, int var4) {
      for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
         for (int var6 = var3; var6 <= var3 + 1; var6++) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
               if (var1.f(var5, var6, var7) == fs.f) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      fs var6 = var1.f(var2, var3 + 1, var4);
      if (var6.a()) {
         var1.d(var2, var3, var4, ln.v.ba);
      }
   }

   @Override
   public int a(int var1, Random var2) {
      return ln.v.a(0, var2);
   }
}
