package srv;

public class Class137 extends Class350 {
   private int field_1351;

   public Class137(int var1, int var2) {
      super(var1);
      this.field_1351 = var2;
   }

   @Override
   public boolean method_96(Class150 var1, Class41 var2, Class317 var3, int var4, int var5, int var6, int var7) {
      if (var7 != 1) {
         return false;
      } else {
         int var8 = var3.method_813(var4, var5, var6);
         if (var8 == Class371.field_1254.field_1379) {
            var3.method_226(var4, var5 + 1, var6, this.field_1351);
            var1.field_1497--;
            return true;
         } else {
            return false;
         }
      }
   }
}
