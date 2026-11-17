package srv;

import java.util.Random;

public class Class276 extends Class371 {
   public Class276(int var1, int var2) {
      super(var1, var2, Class111.field_1166);
   }

   @Override
   public int method_310(int var1) {
      return var1 == 0 ? this.field_1137 + 2 : (var1 == 1 ? this.field_1137 + 1 : this.field_1137);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      if (var5 > 0 && Class371.field_57[var5].method_507() && var1.method_249(var2, var3, var4)) {
         this.method_43(var1, var2, var3, var4, 0);
         var1.method_226(var2, var3, var4, 0);
      }
   }

   @Override
   public int method_757(Random var1) {
      return 0;
   }

   @Override
   public void method_480(Class317 var1, int var2, int var3, int var4) {
      Class105 var5 = new Class105(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F);
      var5.field_974 = var1.field_413.nextInt(var5.field_974 / 4) + var5.field_974 / 8;
      var1.method_237(var5);
   }

   @Override
   public void method_43(Class317 var1, int var2, int var3, int var4, int var5) {
      Class105 var6 = new Class105(var1, var2 + 0.5F, var3 + 0.5F, var4 + 0.5F);
      var1.method_237(var6);
      var1.method_38(var6, "random.fuse", 1.0F, 1.0F);
   }
}
