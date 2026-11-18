package ext;

import java.util.Random;

public class Class235 extends Class108 {
   private boolean field_1148;

   public Class235(int var1, int var2, boolean var3) {
      super(var1, var2, Class160.field_68);
      this.field_1148 = var3;
      if (!var3) {
         this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.method_336(255);
   }

   @Override
   public int method_1735(int var1) {
      return var1 <= 1 ? this.field_2972 + 1 : this.field_2972;
   }

   @Override
   public boolean method_214() {
      return this.field_1148;
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      if (this == Class108.field_2252) {
      }
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      if (this != Class108.field_2252) {
         super.method_1937(var1, var2, var3, var4);
      }

      int var5 = var1.method_197(var2, var3 - 1, var4);
      if (var5 == field_2252.field_2151) {
         var1.method_1481(var2, var3, var4, 0);
         var1.method_1481(var2, var3 - 1, var4, Class108.field_1262.field_2151);
      }
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return Class108.field_2252.field_2151;
   }

   @Override
   public boolean method_636() {
      return this.field_1148;
   }

   @Override
   public boolean method_991(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (this != Class108.field_2252) {
         super.method_991(var1, var2, var3, var4, var5);
      }

      return var5 == 1
         ? true
         : (!super.method_991(var1, var2, var3, var4, var5) ? false : (var5 == 0 ? true : var1.method_197(var2, var3, var4) != this.field_2151));
   }
}
