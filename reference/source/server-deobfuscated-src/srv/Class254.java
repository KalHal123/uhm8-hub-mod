package srv;

import java.util.Random;

public class Class254 extends Class277 {
   private final boolean field_1212;

   protected Class254(int var1, boolean var2) {
      super(var1, Class111.field_1043);
      this.field_1212 = var2;
      this.field_1137 = 45;
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class371.field_423.field_1379;
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      super.method_1013(var1, var2, var3, var4);
      this.method_789(var1, var2, var3, var4);
   }

   private void method_789(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_813(var2, var3, var4 - 1);
      int var6 = var1.method_813(var2, var3, var4 + 1);
      int var7 = var1.method_813(var2 - 1, var3, var4);
      int var8 = var1.method_813(var2 + 1, var3, var4);
      byte var9 = 3;
      if (Class371.field_380[var5] && !Class371.field_380[var6]) {
         var9 = 3;
      }

      if (Class371.field_380[var6] && !Class371.field_380[var5]) {
         var9 = 2;
      }

      if (Class371.field_380[var7] && !Class371.field_380[var8]) {
         var9 = 5;
      }

      if (Class371.field_380[var8] && !Class371.field_380[var7]) {
         var9 = 4;
      }

      var1.method_489(var2, var3, var4, var9);
   }

   @Override
   public int method_310(int var1) {
      return var1 == 1 ? Class371.field_1294.field_1379 : (var1 == 0 ? Class371.field_1294.field_1379 : (var1 == 3 ? this.field_1137 - 1 : this.field_1137));
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      Class24 var6 = (Class24)var1.method_49(var2, var3, var4);
      var5.method_595(var6);
      return true;
   }

   public static void method_293(boolean var0, Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      Class66 var6 = var1.method_49(var2, var3, var4);
      if (var0) {
         var1.method_226(var2, var3, var4, Class371.field_53.field_1379);
      } else {
         var1.method_226(var2, var3, var4, Class371.field_423.field_1379);
      }

      var1.method_489(var2, var3, var4, var5);
      var1.method_563(var2, var3, var4, var6);
   }

   @Override
   protected Class66 method_707() {
      return new Class24();
   }
}
