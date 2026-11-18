package x;

import java.util.Comparator;

public class Class0129 implements Comparator {
   private Class0268 a;

   public Class0129(Class0268 var1) {
      this.a = var1;
   }

   public int a(Class0038 var1, Class0038 var2) {
      return var1.a(this.a) < var2.a(this.a) ? -1 : 1;
   }
}
