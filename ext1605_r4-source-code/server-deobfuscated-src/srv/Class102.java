package srv;

public class Class102 extends Class350 {
   public Class102(int var1, int var2) {
      super(var1);
      this.field_275 = 1;
      this.field_1038 = 32 << var2;
   }

   @Override
   public boolean method_96(Class150 var1, Class41 var2, Class317 var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.method_813(var4, var5, var6);
      Class111 var9 = var3.method_149(var4, var5 + 1, var6);
      if ((var9.method_325() || var8 != Class371.field_1206.field_1379) && var8 != Class371.field_1082.field_1379) {
         return false;
      }

      Class371 var10 = Class371.field_1254;
      var3.method_621(
         var4 + 0.5F,
         var5 + 0.5F,
         var6 + 0.5F,
         var10.field_1154.method_534(),
         (var10.field_1154.method_625() + 1.0F) / 2.0F,
         var10.field_1154.method_952() * 0.8F
      );
      var3.method_226(var4, var5, var6, var10.field_1379);
      var1.method_698(1);
      if (var3.field_413.nextInt(8) == 0 && var8 == Class371.field_1206.field_1379) {
         byte var11 = 1;

         for (int var12 = 0; var12 < var11; var12++) {
            float var13 = 0.7F;
            float var14 = var3.field_413.nextFloat() * var13 + (1.0F - var13) * 0.5F;
            float var15 = 1.2F;
            float var16 = var3.field_413.nextFloat() * var13 + (1.0F - var13) * 0.5F;
            Class39 var17 = new Class39(var3, var4 + var14, var5 + var15, var6 + var16, new Class150(Class350.field_93));
            var17.field_1105 = 10;
            var3.method_237(var17);
         }
      }

      return true;
   }
}
