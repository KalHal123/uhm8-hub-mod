import java.util.Random;

public class hv extends ln {
   protected hv(int var1, int var2) {
      super(var1, var2, fs.n);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   @Override
   public cb d(cj var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public lv a(cj var1, int var2, int var3, int var4, ah var5, ah var6) {
      this.a((mz)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void a(mz var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if (var5 >= 2 && var5 <= 5) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }
   }

   @Override
   public int a(int var1, int var2) {
      return var2 >= 6 ? this.aZ - 16 : this.aZ;
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public int f() {
      return 9;
   }

   @Override
   public int a(Random var1) {
      return 1;
   }

   @Override
   public boolean a(cj var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4);
   }

   @Override
   public void e(cj var1, int var2, int var3, int var4) {
      var1.b(var2, var3, var4, 15);
      this.h(var1, var2, var3, var4);
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      boolean var7 = false;
      if (!var1.g(var2, var3 - 1, var4)) {
         var7 = true;
      }

      if (var6 == 2 && !var1.g(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 3 && !var1.g(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 4 && !var1.g(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if (var6 == 5 && !var1.g(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if (var7) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      } else if (var5 > 0 && ln.n[var5].d() && ma.a(new ma(this, var1, var2, var3, var4)) == 3) {
         this.h(var1, var2, var3, var4);
      }
   }

   private void h(cj var1, int var2, int var3, int var4) {
      new ma(this, var1, var2, var3, var4).a(var1.p(var2, var3, var4));
   }
}
