package srv;

public class Class181 extends Class350 {
   private int field_181;

   public Class181(int var1) {
      super(var1);
      this.field_181 = var1 + 256;
      this.method_567(Class371.field_57[var1 + 256].method_310(2));
   }

   @Override
   public boolean method_96(Class150 var1, Class41 var2, Class317 var3, int var4, int var5, int var6, int var7) {
      if (var3.method_813(var4, var5, var6) == Class371.field_1595.field_1379) {
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

      if (var1.field_1497 == 0) {
         return false;
      }

      if (var3.method_361(this.field_181, var4, var5, var6, false)) {
         Class371 var8 = Class371.field_57[this.field_181];
         if (var3.method_226(var4, var5, var6, this.field_181)) {
            Class371.field_57[this.field_181].method_202(var3, var4, var5, var6, var7);
            var3.method_621(
               var4 + 0.5F,
               var5 + 0.5F,
               var6 + 0.5F,
               var8.field_1154.method_534(),
               (var8.field_1154.method_625() + 1.0F) / 2.0F,
               var8.field_1154.method_952() * 0.8F
            );
            var1.field_1497--;
         }
      }

      return true;
   }
}
