package ext;

import java.util.Random;

public class Class480 extends Class108 {
   public Class480(int var1, int var2) {
      super(var1, var2, Class160.field_2049);
   }

   @Override
   public int method_1735(int var1) {
      return var1 == 0 ? this.field_2972 + 2 : (var1 == 1 ? this.field_2972 + 1 : this.field_2972);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      if (var5 > 0 && Class108.field_1221[var5].method_40() && var1.method_266(var2, var3, var4)) {
         this.method_493(var1, var2, var3, var4, 0);
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public int method_1257(Random var1) {
      return 0;
   }

   @Override
   public void method_298(Class454 var1, int var2, int var3, int var4) {
      Class435 var5 = new Class435(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F);
      var5.field_386 = var1.field_2150.nextInt(var5.field_386 / 4) + var5.field_386 / 8;
      var1.method_1447(var5);
   }

   @Override
   public void method_493(Class454 var1, int var2, int var3, int var4, int var5) {
      Class435 var6 = new Class435(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F);
      var1.method_1447(var6);
      var1.method_1904(var6, "random.fuse", 1.0F, 1.0F);
   }
}
