package x;

public class Class0345 extends Class0312 {
   protected Class0345(int var1) {
      super(var1, Class0155.j);
      this.aZ = 48;
   }

   @Override
   public void e(Class0065 var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for (int var6 = var2 - var5; var6 <= var2 + var5; var6++) {
         for (int var7 = var3 - var5; var7 <= var3 + var5; var7++) {
            for (int var8 = var4 - var5; var8 <= var4 + var5; var8++) {
               if (var1.f(var6, var7, var8) == Class0155.f) {
               }
            }
         }
      }
   }

   @Override
   public void b(Class0065 var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for (int var6 = var2 - var5; var6 <= var2 + var5; var6++) {
         for (int var7 = var3 - var5; var7 <= var3 + var5; var7++) {
            for (int var8 = var4 - var5; var8 <= var4 + var5; var8++) {
               var1.g(var6, var7, var8, var1.a(var6, var7, var8));
            }
         }
      }
   }
}
