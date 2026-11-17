package ext;

import java.util.ArrayList;
import java.util.List;

public class Class113 {
   public List<Interface665> field_50 = new ArrayList<>();

   public void method_923(Interface665 var1) {
      this.field_50.add(var1);
   }

   public String method_54() {
      String var1 = "{\"instructions\":[";

      for (int var2 = 0; var2 != this.field_50.size(); var2++) {
         var1 = var1 + this.field_50.get(var2).method_618();
         if (var2 != this.field_50.size() - 1) {
            var1 = var1 + ",";
         }
      }

      return var1 + "]}";
   }
}
