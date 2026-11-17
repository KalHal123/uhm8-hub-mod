package ext;

import java.util.Random;

public class Class29 extends Class258 {
   public Class29(int var1, int var2) {
      super(var1, var2, Class160.field_1644, false);
      this.field_3047 = 0.98F;
      this.method_1936(true);
   }

   @Override
   public int method_691() {
      return 1;
   }

   @Override
   public boolean method_1794(Interface698 var1, int var2, int var3, int var4, int var5) {
      return super.method_1794(var1, var2, var3, var4, 1 - var5);
   }

   @Override
   public void method_1617(Class454 var1, int var2, int var3, int var4) {
      Class160 var5 = var1.method_1286(var2, var3 - 1, var4);
      if (var5.method_1552() || var5.method_743()) {
         var1.method_1481(var2, var3, var4, Class407.field_1450.field_19);
      }
   }

   @Override
   public int method_806(Random var1) {
      return 0;
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_1763(Enum621.field_2016, var2, var3, var4) > 11 - Class407.field_2977[this.field_19]) {
         this.method_1227(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, Class407.field_2384.field_19);
      }
   }
}
