package ext;

import java.util.Random;

public class Class252 extends Class108 {
   private int field_3086;
   private int field_2888;
   private int field_1389;
   private int field_1688;

   public Class252(int var1, int var2, int var3, int var4) {
      super(var1, Class160.field_1750);
      this.field_2972 = var3;
      this.method_1646(true);
      this.field_3086 = var2;
      this.field_2888 = var3;
      this.field_1389 = var4;
      this.field_1688 = var1;
   }

   public Class252(int var1, int var2, int var3, int var4, Class160 var5) {
      super(var1, var5);
      this.field_2972 = var3;
      this.method_1646(true);
      this.field_3086 = var2;
      this.field_2888 = var3;
      this.field_1389 = var4;
      this.field_1688 = var1;
   }

   @Override
   public int method_1735(int var1) {
      if (var1 == 1) {
         return this.field_3086;
      } else {
         return var1 == 0 ? this.field_1389 : this.field_2888;
      }
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return this.field_1688;
   }
}
