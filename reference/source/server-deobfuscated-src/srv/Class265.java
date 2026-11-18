package srv;

public class Class265 extends Class350 {
   private String field_995;

   public Class265(int var1, String var2) {
      super(var1);
      this.field_995 = var2;
      this.field_275 = 1;
   }

   @Override
   public boolean method_96(Class150 var1, Class41 var2, Class317 var3, int var4, int var5, int var6, int var7) {
      if (var3.method_813(var4, var5, var6) == Class371.field_484.field_1379 && var3.method_929(var4, var5, var6) == 0) {
         var3.method_489(var4, var5, var6, this.field_473 - Class350.field_182.field_473 + 1);
         var3.method_307(this.field_995, var4, var5, var6);
         var1.field_1497--;
         return true;
      } else {
         return false;
      }
   }
}
