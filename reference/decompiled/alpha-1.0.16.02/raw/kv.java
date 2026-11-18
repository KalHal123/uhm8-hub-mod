public class kv extends dd {
   private String a;

   protected kv(int var1, String var2) {
      super(var1);
      this.a = var2;
      this.aR = 1;
   }

   @Override
   public boolean a(eo var1, dg var2, cj var3, int var4, int var5, int var6, int var7) {
      if (var3.a(var4, var5, var6) == ln.aY.ba && var3.e(var4, var5, var6) == 0) {
         var3.b(var4, var5, var6, this.aQ - dd.aO.aQ + 1);
         var3.a(this.a, var4, var5, var6);
         var1.a--;
         return true;
      } else {
         return false;
      }
   }
}
