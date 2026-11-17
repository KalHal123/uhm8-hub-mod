package ext;

import java.util.ArrayList;

public class Class255 extends Class108 {
   public Class255(int var1, int var2) {
      super(var1, var2, Class160.field_265);
   }

   @Override
   public void method_1368(Class454 var1, int var2, int var3, int var4, Class630 var5, ArrayList<Class630> var6, Class359 var7) {
      var6.add(Class630.method_969(var2, var3, var4, var2 + 1, var3 + 1.5, var4 + 1));
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return var1.method_197(var2, var3 - 1, var4) == this.field_2151
         ? false
         : (!var1.method_1286(var2, var3 - 1, var4).method_1888() ? false : super.method_432(var1, var2, var3, var4));
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public boolean method_636() {
      return false;
   }

   @Override
   public int method_1900() {
      return 11;
   }
}
