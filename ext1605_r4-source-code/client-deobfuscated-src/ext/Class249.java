package ext;

import java.util.Random;

public class Class249 extends Class407 {
   public Class249(int var1, int var2) {
      super(var1, var2, Class160.field_2049);
   }

   @Override
   public int method_519(int var1) {
      if (var1 == 0) {
         return this.field_2119 + 2;
      } else {
         return var1 == 1 ? this.field_2119 + 1 : this.field_2119;
      }
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      if (var5 > 0 && Class407.field_495[var5].method_3() && var1.method_266(var2, var3, var4)) {
         this.method_1000(var1, var2, var3, var4, 0);
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public int method_806(Random var1) {
      return 0;
   }

   @Override
   public void method_38(Class454 var1, int var2, int var3, int var4) {
      Class435 var5 = new Class435(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F);
      var5.field_386 = var1.field_2150.nextInt(var5.field_386 / 4) + var5.field_386 / 8;
      var1.method_1447(var5);
   }

   @Override
   public void method_1000(Class454 var1, int var2, int var3, int var4, int var5) {
      Class435 var6 = new Class435(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F);
      var1.method_1447(var6);
      var1.method_1904(var6, "random.fuse", 1.0F, 1.0F);
   }
}
