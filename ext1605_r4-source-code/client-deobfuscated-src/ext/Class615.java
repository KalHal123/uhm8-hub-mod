package ext;

import java.util.Random;

public class Class615 extends Class407 {
   protected Class615(int var1, int var2) {
      super(var1, Class160.field_1447);
      this.field_2119 = var2;
      this.method_1936(true);
      float var3 = 0.2F;
      this.method_1930(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 3.0F, 0.5F + var3);
   }

   @Override
   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      return this.method_1107(var1.method_197(var2, var3 - 1, var4));
   }

   protected boolean method_1107(int var1) {
      return var1 == Class407.field_1875.field_19 || var1 == Class407.field_2578.field_19 || var1 == Class407.field_342.field_19;
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      super.method_1300(var1, var2, var3, var4, var5);
      this.method_1164(var1, var2, var3, var4);
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      this.method_1164(var1, var2, var3, var4);
   }

   protected final void method_1164(Class454 var1, int var2, int var3, int var4) {
      if (!this.method_853(var1, var2, var3, var4)) {
         this.method_1227(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_853(Class454 var1, int var2, int var3, int var4) {
      return (var1.method_1676(var2, var3, var4) >= 8 || var1.method_1733(var2, var3, var4)) && this.method_1107(var1.method_197(var2, var3 - 1, var4));
   }

   @Override
   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_143() {
      return false;
   }

   @Override
   public boolean method_607() {
      return false;
   }

   @Override
   public int method_178() {
      return 1;
   }
}
