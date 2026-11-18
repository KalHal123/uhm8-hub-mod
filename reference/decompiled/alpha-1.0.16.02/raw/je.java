public class je extends dd {
   public int a;

   public je(int var1, int var2) {
      super(var1);
      this.aR = 1;
      this.a = var2;
   }

   @Override
   public boolean a(eo var1, dg var2, cj var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      if (var8 == ln.aG.ba) {
         var3.a(new no(var3, var4 + 0.5F, var5 + 0.5F, var6 + 0.5F, this.a));
         var1.a--;
         return true;
      } else {
         return false;
      }
   }
}
