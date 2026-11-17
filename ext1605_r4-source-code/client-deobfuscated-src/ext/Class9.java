package ext;

import java.util.ArrayList;
import java.util.List;

public class Class9 extends Class414 {
   private List<Class22> field_1251 = new ArrayList<>();

   private boolean method_1142() {
      for (Class22 var2 : this.field_1251) {
         if (var2.method_968()) {
            return true;
         }
      }

      return false;
   }

   private Class22 method_1662(int var1, int var2, int var3) {
      if (!this.method_1142()) {
         return null;
      }

      if (var1 == 0 && var2 == 1 && var3 == 0) {
         boolean var10000 = false;
      } else {
         this.field_520.nextInt(5);
      }

      return null;
   }
}
