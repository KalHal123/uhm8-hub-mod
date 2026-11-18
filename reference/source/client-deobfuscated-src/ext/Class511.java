package ext;

public class Class511 extends Class755 {
   private String field_306;

   public Class511(int var1, String var2) {
      super(var1);
      this.field_306 = var2;
      this.field_2438 = 1;
   }

   @Override
   public boolean method_99(Class334 var1, Class354 var2, Class454 var3, int var4, int var5, int var6, int var7) {
      if (var3.method_197(var4, var5, var6) == Class108.field_691.field_2151 && var3.method_1110(var4, var5, var6) == 0) {
         var3.method_518(var4, var5, var6, this.field_10 - Class755.field_849.field_10 + 1);
         var3.method_686(this.field_306, var4, var5, var6);
         var1.field_2326--;
         return true;
      } else {
         return false;
      }
   }
}
