package srv;

import java.util.Random;

public class Class177 extends Class183 {
   public Class177(int var1, int var2) {
      super(var1, var2, Class111.field_504, false);
      this.method_194(true);
      this.method_14(1.65F);
   }

   @Override
   public int method_396() {
      return 1;
   }

   @Override
   public boolean method_212(Interface351 var1, int var2, int var3, int var4, int var5) {
      return super.method_212(var1, var2, var3, var4, 1 - var5);
   }

   @Override
   public void method_650(Class317 var1, int var2, int var3, int var4) {
      Class111 var5 = var1.method_149(var2, var3 - 1, var4);
   }

   @Override
   public int method_757(Random var1) {
      return 0;
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_347(Enum336.field_1434, var2, var3, var4) > 11 - Class371.field_1484[this.field_1379]) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
      }
   }
}
