package ext;

import java.util.Random;

public class Class35 extends Class407 {
   private boolean field_72;

   public Class35(int var1, boolean var2) {
      super(var1, 6, Class160.field_68);
      this.field_72 = var2;
      if (!var2) {
         this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.method_1062(255);
   }

   @Override
   public int method_519(int var1) {
      return var1 <= 1 ? 6 : 5;
   }

   @Override
   public boolean method_143() {
      return this.field_72;
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      if (this == Class407.field_1530) {
         ;
      }
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      if (this != Class407.field_1530) {
         super.method_1592(var1, var2, var3, var4);
      }

      int var5 = var1.method_197(var2, var3 - 1, var4);
      if (var5 == field_1530.field_19) {
         var1.method_1481(var2, var3, var4, 0);
         var1.method_1481(var2, var3 - 1, var4, Class407.field_1060.field_19);
      }
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return Class407.field_1530.field_19;
   }

   @Override
   public boolean method_607() {
      return this.field_72;
   }

   @Override
   public boolean method_1794(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (this != Class407.field_1530) {
         super.method_1794(var1, var2, var3, var4, var5);
      }

      if (var5 == 1) {
         return true;
      } else if (!super.method_1794(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         return var5 == 0 ? true : var1.method_197(var2, var3, var4) != this.field_19;
      }
   }
}
