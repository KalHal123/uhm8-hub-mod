package ext;

import java.util.Comparator;

public class Comparator442 implements Comparator<Class599> {
   private Class354 field_455;

   public Comparator442(Class354 var1) {
      this.field_455 = var1;
   }

   public int method_1378(Class599 var1, Class599 var2) {
      boolean var3 = var1.field_1913;
      boolean var4 = var2.field_1913;
      return var3 && !var4 ? 1 : (var4 && !var3 ? -1 : (var1.method_1563(this.field_455) < var2.method_1563(this.field_455) ? 1 : -1));
   }

   public int method_784(Class599 var1, Class599 var2) {
      return this.method_1378(var1, var2);
   }
}
