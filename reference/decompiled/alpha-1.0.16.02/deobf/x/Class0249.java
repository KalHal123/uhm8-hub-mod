package x;

public class Class0249 extends Class0086 {
   public int a;

   public Class0249(int var1, int var2) {
      super(var1);
      this.aR = 1;
      this.a = var2;
   }

   @Override
   public boolean a(Class0124 var1, Class0089 var2, Class0065 var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      if (var8 == Class0312.aG.ba) {
         var3.a(new Class0367(var3, var4 + 0.5F, var5 + 0.5F, var6 + 0.5F, this.a));
         var1.a--;
         return true;
      } else {
         return false;
      }
   }
}
