package srv;

import java.util.Random;

public class Class342 extends Class371 {
   public Class342(int var1, int var2) {
      super(var1, Class111.field_1178);
      this.field_1137 = var2;
      this.method_194(true);
      float var3 = 0.2F;
      this.method_177(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 3.0F, 0.5F + var3);
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return this.method_685(var1.method_813(var2, var3 - 1, var4));
   }

   protected boolean method_685(int var1) {
      return var1 == Class371.field_1206.field_1379 || var1 == Class371.field_1082.field_1379 || var1 == Class371.field_1254.field_1379;
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      super.method_721(var1, var2, var3, var4, var5);
      this.method_139(var1, var2, var3, var4);
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      this.method_139(var1, var2, var3, var4);
   }

   protected final void method_139(Class317 var1, int var2, int var3, int var4) {
      if (!this.method_645(var1, var2, var3, var4)) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_645(Class317 var1, int var2, int var3, int var4) {
      return (var1.method_339(var2, var3, var4) >= 8 || var1.method_338(var2, var3, var4)) && this.method_685(var1.method_813(var2, var3 - 1, var4));
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
   public int method_225() {
      return 1;
   }
}
