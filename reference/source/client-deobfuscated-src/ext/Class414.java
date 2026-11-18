package ext;

import java.util.Random;

public class Class414 {
   protected int field_1002 = 8;
   protected Random field_520 = new Random();

   public void method_147(Class405 var1, Class454 var2, int var3, int var4, byte[] var5) {
      int var6 = this.field_1002;
      this.field_520.setSeed(var2.field_482);
      long var7 = this.field_520.nextLong() / 2L * 2L + 1L;
      long var9 = this.field_520.nextLong() / 2L * 2L + 1L;

      for (int var11 = var3 - var6; var11 <= var3 + var6; var11++) {
         for (int var12 = var4 - var6; var12 <= var4 + var6; var12++) {
            this.field_520.setSeed(var11 * var7 + var12 * var9 ^ var2.field_482);
            this.method_1293(var2, var11, var12, var3, var4, var5);
         }
      }
   }

   protected void method_1293(Class454 var1, int var2, int var3, int var4, int var5, byte[] var6) {
   }
}
