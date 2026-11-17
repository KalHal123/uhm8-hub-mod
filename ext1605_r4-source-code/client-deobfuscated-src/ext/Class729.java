package ext;

import java.util.ArrayList;

public class Class729 extends Class407 {
   public Class729(int var1, int var2) {
      super(var1, var2, Class160.field_265);
   }

   @Override
   public void method_1689(Class454 var1, int var2, int var3, int var4, Class630 var5, ArrayList var6) {
      var6.add(Class630.method_969(var2, var3, var4, var2 + 1, var3 + 1.5, var4 + 1));
   }

   @Override
   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      if (var1.method_197(var2, var3 - 1, var4) == this.field_19) {
         return false;
      } else {
         return !var1.method_1286(var2, var3 - 1, var4).method_1888() ? false : super.method_1531(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean method_143() {
      return false;
   }

   @Override
   public boolean method_607() {
      return false;
   }

   @Override
   public int method_178() {
      return 11;
   }
}
