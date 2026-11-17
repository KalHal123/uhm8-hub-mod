package srv;

public class Class87 extends Class350 {
   public Class87(int var1) {
      super(var1);
      this.field_275 = 1;
      this.field_1038 = 64;
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

      int var8 = var3.method_813(var4, var5, var6);
      if (var8 == 0) {
         var3.method_621(var4 + 0.5, var5 + 0.5, var6 + 0.5, "fire.ignite", 1.0F, field_1108.nextFloat() * 0.4F + 0.8F);
         var3.method_226(var4, var5, var6, Class371.field_1424.field_1379);
      }

      var1.method_698(1);
      return true;
   }
}
