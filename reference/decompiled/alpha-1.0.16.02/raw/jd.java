public class jd extends dd {
   private int a;

   public jd(int var1, int var2) {
      super(var1);
      this.a = var2;
   }

   @Override
   public boolean a(eo var1, dg var2, cj var3, int var4, int var5, int var6, int var7) {
      if (var7 != 1) {
         return false;
      } else {
         int var8 = var3.a(var4, var5, var6);
         if (var8 == ln.aA.ba) {
            var3.d(var4, var5 + 1, var6, this.a);
            var1.a--;
            return true;
         } else {
            return false;
         }
      }
   }
}
