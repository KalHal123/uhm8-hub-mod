import java.util.Random;

public class lw extends ln {
   protected lw(int var1) {
      super(var1, fs.c);
      this.aZ = 20;
   }

   @Override
   public int a(Random var1) {
      return 1;
   }

   @Override
   public int a(int var1, Random var2) {
      return ln.J.ba;
   }

   @Override
   public int a(int var1) {
      if (var1 == 1) {
         return 21;
      } else {
         return var1 == 0 ? 21 : 20;
      }
   }
}
