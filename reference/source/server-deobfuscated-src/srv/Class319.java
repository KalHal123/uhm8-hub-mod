package srv;

import java.util.ArrayList;

public class Class319 extends Class371 {
   public Class319(int var1, int var2) {
      super(var1, var2, Class111.field_1200);
   }

   @Override
   public void method_840(Class317 var1, int var2, int var3, int var4, Class94 var5, ArrayList var6) {
      var6.add(Class94.method_27(var2, var3, var4, var2 + 1, var3 + 1.5, var4 + 1));
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return var1.method_813(var2, var3 - 1, var4) == this.field_1379
         ? false
         : (!var1.method_149(var2, var3 - 1, var4).method_325() ? false : super.method_769(var1, var2, var3, var4));
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public int method_225() {
      return 11;
   }
}
