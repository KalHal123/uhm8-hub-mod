import java.util.Random;

public class o extends ln {
   protected o(int var1, int var2) {
      super(var1, var2, fs.t);
      this.b(true);
   }

   @Override
   public int a(int var1, Random var2) {
      return dd.aB.aQ;
   }

   @Override
   public int a(Random var1) {
      return 4;
   }

   @Override
   public void a(cj var1, int var2, int var3, int var4, Random var5) {
      if (var1.a(bu.b, var2, var3, var4) > 11) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }
   }
}
