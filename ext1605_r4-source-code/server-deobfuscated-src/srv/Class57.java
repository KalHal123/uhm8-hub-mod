package srv;

import java.util.Random;

public class Class57 extends Class371 {
   protected Class57(int var1, int var2) {
      super(var1, var2, Class111.field_66);
      this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.method_194(true);
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_813(var2, var3 - 1, var4);
      return var5 != 0 && Class371.field_57[var5].method_491() ? var1.method_149(var2, var3 - 1, var4).method_330() : false;
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      this.method_340(var1, var2, var3, var4);
   }

   private boolean method_340(Class317 var1, int var2, int var3, int var4) {
      if (!this.method_769(var1, var2, var3, var4)) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class350.field_1508.field_473;
   }

   @Override
   public int method_757(Random var1) {
      return 0;
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_347(Enum336.field_1434, var2, var3, var4) > 11) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_212(Interface351 var1, int var2, int var3, int var4, int var5) {
      Class111 var6 = var1.method_149(var2, var3, var4);
      return var5 == 1 ? true : (var6 == this.field_658 ? false : super.method_212(var1, var2, var3, var4, var5));
   }
}
