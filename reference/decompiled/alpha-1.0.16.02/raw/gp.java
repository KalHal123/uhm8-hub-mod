import java.util.Random;

public class gp extends dc {
   public gp(int var1, int var2) {
      super(var1, var2);
   }

   @Override
   public int a(int var1, Random var2) {
      return var2.nextInt(10) == 0 ? dd.an.aQ : this.ba;
   }
}
