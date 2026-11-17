package ext;

public class Class55 extends Class755 {
   private int field_1433;

   public Class55(int var1) {
      super(var1);
      this.field_1433 = var1 + 32767;
      this.method_1619(Class108.field_1221[var1 + 32767].method_1735(2));
   }

   @Override
   public boolean method_99(Class334 var1, Class354 var2, Class454 var3, int var4, int var5, int var6, int var7) {
      if (var3.method_197(var4, var5, var6) == Class108.field_1070.field_2151) {
         var7 = 0;
      } else {
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
      }

      if (var1.field_2326 == 0) {
         return false;
      }

      if (var3.method_1892(this.field_1433, var4, var5, var6, false)) {
         Class108 var8 = Class108.field_1221[this.field_1433];
         if (var3.method_1481(var4, var5, var6, this.field_1433)) {
            Class108.field_1221[this.field_1433].method_1886(var3, var4, var5, var6, var7);
            var3.method_861(
               var4 + 0.5F,
               var5 + 0.5F,
               var6 + 0.5F,
               var8.field_972.method_804(),
               (var8.field_972.method_1010() + 1.0F) / 2.0F,
               var8.field_972.method_1263() * 0.8F
            );
            if (!Class119.field_1477) {
               var1.field_2326--;
            }
         }
      }

      return true;
   }
}
