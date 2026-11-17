package srv;

import java.util.Random;

public class Class98 extends Class371 {
   int field_1086 = -1;

   public Class98(int var1, int var2, int var3) {
      super(var1, var2, Class111.field_1043);
      this.field_1086 = var3;
   }

   public Class98(int var1, int var2) {
      super(var1, var2, Class111.field_1043);
   }

   @Override
   public int method_852(int var1, Random var2) {
      return this.field_1086 == -1 ? Class371.field_319.field_1379 : this.field_1086;
   }
}
