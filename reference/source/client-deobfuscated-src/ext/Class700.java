package ext;

import java.util.Random;

public class Class700 extends Class604 {
   public static int field_1402;

   public Class700(int var1, int var2, int var3) {
      super(var1, Class160.field_265);
      this.field_2972 = var2;
      field_1402 = var3 + 32767;
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return (var1 & 8) != 0 ? 0 : field_1402;
   }
}
