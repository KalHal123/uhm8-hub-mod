import java.util.Random;

public class gm extends ln {
   public gm(int var1, int var2) {
      super(var1, var2, fs.d);
   }

   @Override
   public int a(int var1, Random var2) {
      if (this.ba == ln.I.ba) {
         return dd.k.aQ;
      } else {
         return this.ba == ln.aw.ba ? dd.l.aQ : this.ba;
      }
   }

   @Override
   public int a(Random var1) {
      return 1;
   }
}
