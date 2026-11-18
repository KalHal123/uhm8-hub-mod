package ext;

import java.util.Random;

public class Class400 extends Class15 {
   public Class400(int var1, int var2) {
      super(var1, var2, Class160.field_1644, false);
      this.method_1646(true);
      this.method_110(1.65F);
   }

   @Override
   public int method_287() {
      return 1;
   }

   @Override
   public boolean method_991(Interface698 var1, int var2, int var3, int var4, int var5) {
      return super.method_991(var1, var2, var3, var4, 1 - var5);
   }

   @Override
   public void method_1736(Class454 var1, int var2, int var3, int var4) {
      Class160 var5 = var1.method_1286(var2, var3 - 1, var4);
   }

   @Override
   public int method_1257(Random var1) {
      return 0;
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_1763(Enum621.field_2016, var2, var3, var4) > 11 - Class108.field_2371[this.field_2151]) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
      }
   }
}
