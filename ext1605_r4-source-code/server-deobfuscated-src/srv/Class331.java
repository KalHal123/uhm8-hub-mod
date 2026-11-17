package srv;

public class Class331 extends Class371 {
   protected Class331(int var1) {
      super(var1, Class111.field_1433);
      this.field_1137 = 48;
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for (int var6 = var2 - var5; var6 <= var2 + var5; var6++) {
         for (int var7 = var3 - var5; var7 <= var3 + var5; var7++) {
            for (int var8 = var4 - var5; var8 <= var4 + var5; var8++) {
               if (var1.method_149(var6, var7, var8) == Class111.field_1394) {
               }
            }
         }
      }
   }

   @Override
   public void method_650(Class317 var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for (int var6 = var2 - var5; var6 <= var2 + var5; var6++) {
         for (int var7 = var3 - var5; var7 <= var3 + var5; var7++) {
            for (int var8 = var4 - var5; var8 <= var4 + var5; var8++) {
               var1.method_922(var6, var7, var8, var1.method_813(var6, var7, var8));
            }
         }
      }
   }
}
