package x;

import java.util.Comparator;

public class Class0166 implements Comparator {
   private Class0089 a;

   public Class0166(Class0089 var1) {
      this.a = var1;
   }

   public int a(Class0038 var1, Class0038 var2) {
      boolean var3 = var1.o;
      boolean var4 = var2.o;
      if (var3 && !var4) {
         return 1;
      } else if (var4 && !var3) {
         return -1;
      } else {
         return var1.a(this.a) < var2.a(this.a) ? 1 : -1;
      }
   }
}
