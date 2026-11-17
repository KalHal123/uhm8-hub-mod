package srv;

import java.util.Random;

public class Class372 extends Class371 {
   private boolean field_1095;

   public Class372(int var1, int var2, boolean var3) {
      super(var1, var2, Class111.field_1043);
      this.field_1095 = var3;
      if (!var3) {
         this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.method_1030(255);
   }

   @Override
   public int method_310(int var1) {
      return var1 <= 1 ? this.field_1137 + 1 : this.field_1137;
   }

   @Override
   public boolean method_491() {
      return this.field_1095;
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      if (this == Class371.field_265) {
      }
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      if (this != Class371.field_265) {
         super.method_1013(var1, var2, var3, var4);
      }

      int var5 = var1.method_813(var2, var3 - 1, var4);
      if (var5 == field_265.field_1379) {
         var1.method_226(var2, var3, var4, 0);
         var1.method_226(var2, var3 - 1, var4, Class371.field_264.field_1379);
      }
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class371.field_265.field_1379;
   }

   @Override
   public boolean method_786() {
      return this.field_1095;
   }

   @Override
   public boolean method_212(Interface351 var1, int var2, int var3, int var4, int var5) {
      if (this != Class371.field_265) {
         super.method_212(var1, var2, var3, var4, var5);
      }

      return var5 == 1
         ? true
         : (!super.method_212(var1, var2, var3, var4, var5) ? false : (var5 == 0 ? true : var1.method_813(var2, var3, var4) != this.field_1379));
   }
}
