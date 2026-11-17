package srv;

public class Class306 extends Class350 {
   public Class306(int var1) {
      super(var1);
   }

   @Override
   public boolean method_96(Class150 var1, Class41 var2, Class317 var3, int var4, int var5, int var6, int var7) {
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

      if (var3.method_813(var4, var5, var6) != 0) {
         return false;
      }

      if (Class371.field_521.method_769(var3, var4, var5, var6)) {
         var1.field_1497--;
         var3.method_226(var4, var5, var6, Class371.field_521.field_1379);
      }

      return true;
   }
}
