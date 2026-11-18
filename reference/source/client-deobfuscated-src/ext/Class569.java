package ext;

import java.util.Random;

public class Class569 implements Interface127 {
   private final Class387[] field_848;
   private final Class387[] field_1546;
   private final Random field_1538;

   public Class569(Random var1) {
      this.field_848 = new Class387[]{new Class387(var1, 4), new Class387(var1, 4), new Class387(var1, 4)};
      this.field_1546 = new Class387[]{new Class387(var1, 4), new Class387(var1, 4), new Class387(var1, 4)};
      this.field_1538 = var1;
   }

   public Class569 method_1898() {
      Class457.method_1836(this.field_1538);
      return this;
   }

   @Override
   public double method_660(int var1, int var2, Class457.Inner598 var3) {
      return this.field_848[var3.ordinal()].method_385(var1 / 32.0, var2 / 32.0);
   }

   @Override
   public double method_919(int var1, int var2, Class457.Inner598 var3) {
      return this.field_1546[var3.ordinal()].method_385(var1 / 32.0, var2 / 32.0);
   }

   @Override
   public Class457 method_1497(int var1, int var2, Class457.Inner598 var3) {
      return Class457.method_525(this.method_660(var1, var2, var3), this.method_919(var1, var2, var3), var3);
   }
}
