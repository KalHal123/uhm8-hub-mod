package srv;

import java.util.Random;

public class Class147 {
   protected int field_1337 = 8;
   protected Random field_589 = new Random();

   public void method_359(Class343 var1, Class317 var2, int var3, int var4, byte[] var5) {
      int var6 = this.field_1337;
      this.field_589.setSeed(var2.field_68);
      long var7 = this.field_589.nextLong() / 2L * 2L + 1L;
      long var9 = this.field_589.nextLong() / 2L * 2L + 1L;

      for (int var11 = var3 - var6; var11 <= var3 + var6; var11++) {
         for (int var12 = var4 - var6; var12 <= var4 + var6; var12++) {
            this.field_589.setSeed(var11 * var7 + var12 * var9 ^ var2.field_68);
            this.method_486(var2, var11, var12, var3, var4, var5);
         }
      }
   }

   protected void method_486(Class317 var1, int var2, int var3, int var4, int var5, byte[] var6) {
   }
}
