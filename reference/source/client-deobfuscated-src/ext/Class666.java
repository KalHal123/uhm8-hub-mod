package ext;

import java.util.Random;

public class Class666 extends Class108 {
   public Class666(int var1, int var2) {
      super(var1, Class160.field_1447);
      this.field_2972 = var2;
      this.method_1646(true);
      float var3 = 0.2F;
      this.method_1618(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 3.0F, 0.5F + var3);
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return this.method_1626(var1.method_197(var2, var3 - 1, var4));
   }

   protected boolean method_1626(int var1) {
      return var1 == Class108.field_1970.field_2151 || var1 == Class108.field_1047.field_2151 || var1 == Class108.field_2496.field_2151;
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      super.method_1464(var1, var2, var3, var4, var5);
      this.method_888(var1, var2, var3, var4);
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      this.method_888(var1, var2, var3, var4);
   }

   protected final void method_888(Class454 var1, int var2, int var3, int var4) {
      if (!this.method_1674(var1, var2, var3, var4)) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public boolean method_1674(Class454 var1, int var2, int var3, int var4) {
      return (var1.method_1676(var2, var3, var4) >= 8 || var1.method_1733(var2, var3, var4)) && this.method_1626(var1.method_197(var2, var3 - 1, var4));
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public boolean method_636() {
      return false;
   }

   @Override
   public int method_1900() {
      return 1;
   }
}
