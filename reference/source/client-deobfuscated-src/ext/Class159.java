package ext;

public class Class159 extends Class755 {
   public Class159(int var1) {
      super(var1);
      this.field_945 = 64;
      this.field_2438 = 1;
   }

   @Override
   public boolean method_99(Class334 var1, Class354 var2, Class454 var3, int var4, int var5, int var6, int var7) {
      if (var7 == 0) {
         return false;
      }

      if (!var3.method_1286(var4, var5, var6).method_1888()) {
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

      if (!Class108.field_1115.method_432(var3, var4, var5, var6)) {
         return false;
      }

      if (var7 == 1) {
         var3.method_1193(var4, var5, var6, Class108.field_1115.field_2151, Class469.method_468((var2.field_1661 + 180.0F) * 16.0F / 360.0F + 0.5) & 15);
      } else {
         var3.method_1193(var4, var5, var6, Class108.field_762.field_2151, var7);
      }

      var1.field_2326--;
      var2.method_1083((Class243)var3.method_1303(var4, var5, var6));
      return true;
   }
}
