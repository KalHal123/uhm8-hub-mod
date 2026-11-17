package ext;

public class Class750 extends Class755 {
   public Class750(int var1) {
      super(var1);
      this.field_2438 = 1;
      this.field_945 = 64;
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

      int var8 = var3.method_197(var4, var5, var6);
      if (var8 == 0) {
         var3.method_861(var4 + 0.5, var5 + 0.5, var6 + 0.5, "fire.ignite", 1.0F, field_2073.nextFloat() * 0.4F + 0.8F);
         var3.method_1481(var4, var5, var6, Class108.field_1781.field_2151);
      }

      var1.method_1181(1);
      return true;
   }
}
