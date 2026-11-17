package ext;

import java.util.Random;

public class Class536 extends Class108 {
   int field_1779 = -1;

   public Class536(int var1, int var2, int var3) {
      super(var1, var2, Class160.field_68);
      this.field_1779 = var3;
   }

   public Class536(int var1, int var2) {
      super(var1, var2, Class160.field_68);
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return this.field_1779 == -1 ? Class108.field_2201.field_2151 : this.field_1779;
   }
}
