public class dz extends dd {
   public dz(int var1) {
      super(var1);
   }

   @Override
   public boolean a(eo var1, dg var2, cj var3, int var4, int var5, int var6, int var7) {
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

      if (var3.a(var4, var5, var6) != 0) {
         return false;
      }

      if (ln.av.a(var3, var4, var5, var6)) {
         var1.a--;
         var3.d(var4, var5, var6, ln.av.ba);
      }

      return true;
   }
}
