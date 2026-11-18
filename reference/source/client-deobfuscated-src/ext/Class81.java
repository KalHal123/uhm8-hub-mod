package ext;

public class Class81 extends Class755 {
   public Class81(int var1, int var2) {
      super(var1);
      this.field_2438 = 1;
      this.field_945 = 32 << var2;
   }

   @Override
   public boolean method_99(Class334 var1, Class354 var2, Class454 var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.method_197(var4, var5, var6);
      Class160 var9 = var3.method_1286(var4, var5 + 1, var6);
      if ((var9.method_1888() || var8 != Class108.field_1970.field_2151) && var8 != Class108.field_1047.field_2151) {
         return false;
      }

      Class108 var10 = Class108.field_2496;
      var3.method_861(
         var4 + 0.5F,
         var5 + 0.5F,
         var6 + 0.5F,
         var10.field_972.method_804(),
         (var10.field_972.method_1010() + 1.0F) / 2.0F,
         var10.field_972.method_1263() * 0.8F
      );
      var3.method_1481(var4, var5, var6, var10.field_2151);
      var1.method_1181(1);
      if (var3.field_2150.nextInt(8) == 0 && var8 == Class108.field_1970.field_2151) {
         byte var11 = 1;

         for (int var12 = 0; var12 < var11; var12++) {
            float var13 = 0.7F;
            float var14 = var3.field_2150.nextFloat() * var13 + (1.0F - var13) * 0.5F;
            float var15 = 1.2F;
            float var16 = var3.field_2150.nextFloat() * var13 + (1.0F - var13) * 0.5F;
            Class198 var17 = new Class198(var3, var4 + var14, var5 + var15, var6 + var16, new Class334(Class755.field_2432));
            var17.field_2283 = 10;
            var3.method_1447(var17);
         }
      }

      return true;
   }

   @Override
   public boolean method_928() {
      return true;
   }
}
