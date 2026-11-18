package x;

import java.util.Comparator;

class Class0146 implements Comparator {
   Class0146(Class0099 var1) {
      this.a = var1;
   }

   public int a(Class0046 var1, Class0046 var2) {
      if (var2.a() < var1.a()) {
         return -1;
      } else {
         return var2.a() > var1.a() ? 1 : 0;
      }
   }
}
