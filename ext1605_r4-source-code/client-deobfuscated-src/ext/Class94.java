package ext;

public class Class94 extends Class407 {
   protected Class94(int var1) {
      super(var1, Class160.field_1807);
      this.field_2119 = 48;
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for (int var6 = var2 - var5; var6 <= var2 + var5; var6++) {
         for (int var7 = var3 - var5; var7 <= var3 + var5; var7++) {
            for (int var8 = var4 - var5; var8 <= var4 + var5; var8++) {
               if (var1.method_1286(var6, var7, var8) == Class160.field_1413) {
               }
            }
         }
      }
   }

   @Override
   public void method_1617(Class454 var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for (int var6 = var2 - var5; var6 <= var2 + var5; var6++) {
         for (int var7 = var3 - var5; var7 <= var3 + var5; var7++) {
            for (int var8 = var4 - var5; var8 <= var4 + var5; var8++) {
               var1.method_558(var6, var7, var8, var1.method_197(var6, var7, var8));
            }
         }
      }
   }
}
