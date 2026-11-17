package ext;

import java.util.ArrayList;

public class Class66 extends Class455 {
   public Class66(int var1, int var2, int[] var3, Class334 var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean method_1757(int[] var1) {
      ArrayList var2 = new ArrayList();

      for (int var6 : this.field_1525) {
         if (var6 != -1) {
            var2.add(var6);
         }
      }

      for (int var10 : var1) {
         if (var10 != -1) {
            if (var2.size() == 0) {
               return false;
            }

            if (var2.contains(var10)) {
               var2.remove(Integer.valueOf(var10));
            }
         }
      }

      return var2.size() == 0;
   }
}
