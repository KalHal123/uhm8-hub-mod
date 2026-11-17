package ext;

public class Class681 extends Class755 {
   public Class681(int var1) {
      super(var1);
   }

   @Override
   public boolean method_99(Class334 var1, Class354 var2, Class454 var3, int var4, int var5, int var6, int var7) {
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

      if (var3.method_197(var4, var5, var6) != 0) {
         return false;
      }

      if (Class108.field_2512.method_432(var3, var4, var5, var6)) {
         var1.field_2326--;
         var3.method_1481(var4, var5, var6, Class108.field_2512.field_2151);
      }

      return true;
   }
}
