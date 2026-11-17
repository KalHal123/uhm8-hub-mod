package ext;

import java.util.Comparator;

public class Comparator41 implements Comparator<Class599> {
   private Class359 field_1703;

   public Comparator41(Class359 var1) {
      this.field_1703 = var1;
   }

   public int method_500(Class599 var1, Class599 var2) {
      return var1.method_1563(this.field_1703) < var2.method_1563(this.field_1703) ? -1 : 1;
   }

   public int method_65(Class599 var1, Class599 var2) {
      return this.method_500(var1, var2);
   }
}
