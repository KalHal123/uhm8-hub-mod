public class ar extends dd {
   private int a;

   public ar(int var1) {
      super(var1);
      this.a = var1 + 256;
      this.a(ln.n[var1 + 256].a(2));
   }

   @Override
   public boolean a(eo var1, dg var2, cj var3, int var4, int var5, int var6, int var7) {
      if (var3.a(var4, var5, var6) == ln.aS.ba) {
         var7 = 0;
      } else {
         if (var7 == 0) {
            var5--;
         }

         if (var7 == 1) {
            var5++;
         }

         if (var7 == 2) {
            var6--;
         }

         if (var7 == 3) {
            var6++;
         }

         if (var7 == 4) {
            var4--;
         }

         if (var7 == 5) {
            var4++;
         }
      }

      if (var1.a == 0) {
         return false;
      }

      if (var3.a(this.a, var4, var5, var6, false)) {
         ln var8 = ln.n[this.a];
         if (var3.d(var4, var5, var6, this.a)) {
            ln.n[this.a].d(var3, var4, var5, var6, var7);
            var3.a(var4 + 0.5F, var5 + 0.5F, var6 + 0.5F, var8.bj.d(), (var8.bj.b() + 1.0F) / 2.0F, var8.bj.c() * 0.8F);
            var1.a--;
         }
      }

      return true;
   }
}
