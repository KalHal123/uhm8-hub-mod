public class lt extends dd {
   public lt(int var1) {
      super(var1);
      this.aS = 64;
      this.aR = 1;
   }

   @Override
   public boolean a(eo var1, dg var2, cj var3, int var4, int var5, int var6, int var7) {
      if (var7 == 0) {
         return false;
      }

      if (!var3.f(var4, var5, var6).a()) {
         return false;
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

      if (!ln.aD.a(var3, var4, var5, var6)) {
         return false;
      }

      if (var7 == 1) {
         var3.b(var4, var5, var6, ln.aD.ba, ei.b((var2.an + 180.0F) * 16.0F / 360.0F + 0.5) & 15);
      } else {
         var3.b(var4, var5, var6, ln.aI.ba, var7);
      }

      var1.a--;
      var2.a((nn)var3.b(var4, var5, var6));
      return true;
   }
}
