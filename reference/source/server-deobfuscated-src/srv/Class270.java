package srv;

import java.util.Random;

public class Class270 extends Class384 {
   public static int field_614;

   public Class270(int var1, int var2, int var3) {
      super(var1, Class111.field_1200);
      this.field_1137 = var2;
      field_614 = var3 + 32767;
   }

   @Override
   public int method_852(int var1, Random var2) {
      return (var1 & 8) != 0 ? 0 : field_614;
   }
}
