package srv;

public class Class213 extends Class350 {
   public Class213(int var1) {
      super(var1);
      this.field_1038 = 64;
      this.field_275 = 1;
   }

   @Override
   public boolean method_96(Class150 var1, Class41 var2, Class317 var3, int var4, int var5, int var6, int var7) {
      if (var7 == 0) {
         return false;
      }

      if (!var3.method_149(var4, var5, var6).method_325()) {
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

      if (!Class371.field_1456.method_769(var3, var4, var5, var6)) {
         return false;
      }

      if (var7 == 1) {
         var3.method_86(var4, var5, var6, Class371.field_1456.field_1379, Class380.method_502((var2.field_909 + 180.0F) * 16.0F / 360.0F + 0.5) & 15);
      } else {
         var3.method_86(var4, var5, var6, Class371.field_1140.field_1379, var7);
      }

      var1.field_1497--;
      var2.method_343((Class272)var3.method_49(var4, var5, var6));
      return true;
   }
}
