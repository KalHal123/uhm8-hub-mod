package srv;

import java.util.Random;

public class Class154 implements Interface210 {
   private final Class104[] field_1264;
   private final Class104[] field_1207;
   private final Random field_979;

   public Class154(Random var1) {
      this.field_1264 = new Class104[]{new Class104(var1, 4), new Class104(var1, 4), new Class104(var1, 4)};
      this.field_1207 = new Class104[]{new Class104(var1, 4), new Class104(var1, 4), new Class104(var1, 4)};
      this.field_979 = var1;
   }

   public Class154 method_975() {
      Class49.method_950(this.field_979);
      return this;
   }

   @Override
   public double method_372(int var1, int var2, Class49.Inner296 var3) {
      return this.field_1264[var3.ordinal()].method_802(var1 / 32.0, var2 / 32.0);
   }

   @Override
   public double method_64(int var1, int var2, Class49.Inner296 var3) {
      return this.field_1207[var3.ordinal()].method_802(var1 / 32.0, var2 / 32.0);
   }

   @Override
   public Class49 method_388(int var1, int var2, Class49.Inner296 var3) {
      return Class49.method_748(this.method_372(var1, var2, var3), this.method_64(var1, var2, var3), var3);
   }
}
