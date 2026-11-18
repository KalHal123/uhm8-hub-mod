package ext;

import java.util.Random;

public class Class287 extends Class108 {
   private int field_1217;
   private int field_3126;
   private int field_2225;
   private int field_2461;

   public Class287(int var1, int var2, int var3, int var4) {
      super(var1, Class160.field_1750);
      this.field_2972 = var3;
      this.method_1646(true);
      this.field_1217 = var2;
      this.field_3126 = var3;
      this.field_2225 = var4;
      this.field_2461 = var1;
   }

   public Class287(int var1, int var2, int var3, int var4, Class160 var5) {
      super(var1, var5);
      this.field_2972 = var3;
      this.method_1646(true);
      this.field_1217 = var2;
      this.field_3126 = var3;
      this.field_2225 = var4;
      this.field_2461 = var1;
   }

   @Override
   public int method_1735(int var1) {
      if (var1 == 1) {
         return this.field_1217;
      } else {
         return var1 == 0 ? this.field_2225 : this.field_3126;
      }
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return this.field_2461;
   }

   @Override
   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      var5.method_1070();
      return true;
   }
}
