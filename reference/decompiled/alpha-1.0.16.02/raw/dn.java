import java.util.Random;

public class dn extends ln {
   public dn(int var1, int var2) {
      super(var1, var2, fs.c);
   }

   @Override
   public int a(int var1) {
      return var1 <= 1 ? 4 : this.aZ;
   }

   @Override
   public int a(Random var1) {
      return 0;
   }
}
