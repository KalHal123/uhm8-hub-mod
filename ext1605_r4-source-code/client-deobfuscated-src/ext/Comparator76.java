package ext;

import java.util.Comparator;

class Comparator76 implements Comparator<Class455> {
   final Class484 field_1277;

   Comparator76(Class484 var1) {
      this.field_1277 = var1;
   }

   public int method_44(Class455 var1, Class455 var2) {
      return var2.method_256() < var1.method_256() ? -1 : (var2.method_256() > var1.method_256() ? 1 : 0);
   }

   public int method_1637(Class455 var1, Class455 var2) {
      return this.method_44(var1, var2);
   }
}
