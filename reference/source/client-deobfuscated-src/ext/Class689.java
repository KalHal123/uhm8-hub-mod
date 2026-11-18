package ext;

import java.util.Random;

public class Class689 extends Class108 {
   protected Class689(int var1, int var2) {
      super(var1, var2, Class160.field_1787);
      this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
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
   public Class366 method_739(Class454 var1, int var2, int var3, int var4, Class214 var5, Class214 var6) {
      this.method_1433(var1, var2, var3, var4);
      return super.method_739(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_1433(Interface698 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      if (var5 >= 2 && var5 <= 5) {
         this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }
   }

   @Override
   public int method_774(int var1, int var2) {
      return var2 >= 6 ? this.field_2972 - 16 : this.field_2972;
   }

   @Override
   public boolean method_636() {
      return false;
   }

   @Override
   public int method_1900() {
      return 9;
   }

   @Override
   public int method_1257(Random var1) {
      return 1;
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return var1.method_768(var2, var3 - 1, var4);
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      var1.method_518(var2, var3, var4, 15);
      this.method_292(var1, var2, var3, var4);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      boolean var7 = false;
      if (!var1.method_768(var2, var3 - 1, var4)) {
         var7 = true;
      }

      if (var6 == 2 && !var1.method_768(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 3 && !var1.method_768(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 4 && !var1.method_768(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if (var6 == 5 && !var1.method_768(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if (var7) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      } else if (var5 > 0 && Class108.field_1221[var5].method_40() && Class236.method_1658(new Class236(this, var1, var2, var3, var4)) == 3) {
         this.method_292(var1, var2, var3, var4);
      }
   }

   private void method_292(Class454 var1, int var2, int var3, int var4) {
      new Class236(this, var1, var2, var3, var4).method_687(var1.method_266(var2, var3, var4));
   }
}
