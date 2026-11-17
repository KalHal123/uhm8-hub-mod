package srv;

public class Class51 extends Class350 {
   public int field_920;

   public Class51(int var1, int var2) {
      super(var1);
      this.field_275 = 1;
      this.field_920 = var2;
   }

   @Override
   public boolean method_96(Class150 var1, Class41 var2, Class317 var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.method_813(var4, var5, var6);
      if (var8 == Class371.field_1235.field_1379) {
         var3.method_237(new Class194(var3, var4 + 0.5F, var5 + 0.5F, var6 + 0.5F, this.field_920));
         var1.field_1497--;
         return true;
      } else {
         return false;
      }
   }
}
