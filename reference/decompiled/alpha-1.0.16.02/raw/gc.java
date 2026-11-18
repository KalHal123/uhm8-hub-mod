import java.util.Comparator;

public class gc implements Comparator {
   private dg a;

   public gc(dg var1) {
      this.a = var1;
   }

   public int a(bj var1, bj var2) {
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
