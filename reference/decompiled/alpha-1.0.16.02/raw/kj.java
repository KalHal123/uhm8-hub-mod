import java.util.Random;

public class kj extends jk {
   private final boolean a;

   protected kj(int var1, boolean var2) {
      super(var1, fs.d);
      this.a = var2;
      this.aZ = 45;
   }

   @Override
   public int a(int var1, Random var2) {
      return ln.aB.ba;
   }

   @Override
   public void e(cj var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      this.h(var1, var2, var3, var4);
   }

   private void h(cj var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4 - 1);
      int var6 = var1.a(var2, var3, var4 + 1);
      int var7 = var1.a(var2 - 1, var3, var4);
      int var8 = var1.a(var2 + 1, var3, var4);
      byte var9 = 3;
      if (ln.p[var5] && !ln.p[var6]) {
         var9 = 3;
      }

      if (ln.p[var6] && !ln.p[var5]) {
         var9 = 2;
      }

      if (ln.p[var7] && !ln.p[var8]) {
         var9 = 5;
      }

      if (ln.p[var8] && !ln.p[var7]) {
         var9 = 4;
      }

      var1.b(var2, var3, var4, var9);
   }

   @Override
   public int a(mz var1, int var2, int var3, int var4, int var5) {
      if (var5 == 1) {
         return ln.t.aZ;
      } else if (var5 == 0) {
         return ln.t.aZ;
      } else {
         int var6 = var1.e(var2, var3, var4);
         if (var5 != var6) {
            return this.aZ;
         } else {
            return this.a ? this.aZ + 16 : this.aZ - 1;
         }
      }
   }

   @Override
   public void b(cj var1, int var2, int var3, int var4, Random var5) {
      if (this.a) {
         int var6 = var1.e(var2, var3, var4);
         float var7 = var2 + 0.5F;
         float var8 = var3 + 0.0F + var5.nextFloat() * 6.0F / 16.0F;
         float var9 = var4 + 0.5F;
         float var10 = 0.52F;
         float var11 = var5.nextFloat() * 0.6F - 0.3F;
         if (var6 == 4) {
            var1.a("smoke", var7 - var10, var8, var9 + var11, 0.0, 0.0, 0.0);
            var1.a("flame", var7 - var10, var8, var9 + var11, 0.0, 0.0, 0.0);
         } else if (var6 == 5) {
            var1.a("smoke", var7 + var10, var8, var9 + var11, 0.0, 0.0, 0.0);
            var1.a("flame", var7 + var10, var8, var9 + var11, 0.0, 0.0, 0.0);
         } else if (var6 == 2) {
            var1.a("smoke", var7 + var11, var8, var9 - var10, 0.0, 0.0, 0.0);
            var1.a("flame", var7 + var11, var8, var9 - var10, 0.0, 0.0, 0.0);
         } else if (var6 == 3) {
            var1.a("smoke", var7 + var11, var8, var9 + var10, 0.0, 0.0, 0.0);
            var1.a("flame", var7 + var11, var8, var9 + var10, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public int a(int var1) {
      if (var1 == 1) {
         return ln.t.ba;
      } else if (var1 == 0) {
         return ln.t.ba;
      } else {
         return var1 == 3 ? this.aZ - 1 : this.aZ;
      }
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4, dg var5) {
      ju var6 = (ju)var1.b(var2, var3, var4);
      var5.a(var6);
      return true;
   }

   public static void a(boolean var0, cj var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      ht var6 = var1.b(var2, var3, var4);
      if (var0) {
         var1.d(var2, var3, var4, ln.aC.ba);
      } else {
         var1.d(var2, var3, var4, ln.aB.ba);
      }

      var1.b(var2, var3, var4, var5);
      var1.a(var2, var3, var4, var6);
   }

   @Override
   protected ht a_() {
      return new ju();
   }
}
