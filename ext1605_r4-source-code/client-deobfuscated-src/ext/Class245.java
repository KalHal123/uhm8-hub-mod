package ext;

public class Class245 extends Class755 {
   private int field_1748;

   public Class245(int var1, int var2) {
      super(var1);
      this.field_1748 = var2;
   }

   @Override
   public boolean method_99(Class334 var1, Class354 var2, Class454 var3, int var4, int var5, int var6, int var7) {
      if (var7 != 1) {
         return false;
      } else {
         int var8 = var3.method_197(var4, var5, var6);
         if (var8 == Class108.field_2496.field_2151) {
            var3.method_1481(var4, var5 + 1, var6, this.field_1748);
            var1.field_2326--;
            return true;
         } else {
            return false;
         }
      }
   }
}
