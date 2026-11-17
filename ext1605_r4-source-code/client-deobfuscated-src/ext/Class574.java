package ext;

import java.util.Random;

public class Class574 extends Class307 {
   private int field_2865;
   private int field_95 = 0;

   public Class574(int var1, int var2) {
      super(var1, var2, Class160.field_173, false);
      this.field_2865 = var2;
      this.method_1646(true);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      this.field_95 = 0;
      this.method_1468(var1, var2, var3, var4);
      super.method_1464(var1, var2, var3, var4, var5);
   }

   public void method_1016(Class454 var1, int var2, int var3, int var4, int var5) {
      if (var1.method_197(var2, var3, var4) == this.field_2151) {
         int var6 = var1.method_1110(var2, var3, var4);
         if (var6 != 0 && var6 == var5 - 1) {
            this.method_1468(var1, var2, var3, var4);
         }
      }
   }

   public void method_1468(Class454 var1, int var2, int var3, int var4) {
      if (this.field_95++ < 100) {
         int var5 = var1.method_1286(var2, var3 - 1, var4).method_1888() ? 16 : 0;
         int var6 = var1.method_1110(var2, var3, var4);
         if (var6 == 0) {
            var6 = 1;
            var1.method_518(var2, var3, var4, 1);
         }

         var5 = this.method_1353(var1, var2, var3 - 1, var4, var5);
         var5 = this.method_1353(var1, var2, var3, var4 - 1, var5);
         var5 = this.method_1353(var1, var2, var3, var4 + 1, var5);
         var5 = this.method_1353(var1, var2 - 1, var3, var4, var5);
         var5 = this.method_1353(var1, var2 + 1, var3, var4, var5);
         int var7 = var5 - 1;
         if (var7 < 10) {
            var7 = 1;
         }

         if (var7 != var6) {
            var1.method_518(var2, var3, var4, var7);
            this.method_1016(var1, var2, var3 - 1, var4, var6);
            this.method_1016(var1, var2, var3 + 1, var4, var6);
            this.method_1016(var1, var2, var3, var4 - 1, var6);
            this.method_1016(var1, var2, var3, var4 + 1, var6);
            this.method_1016(var1, var2 - 1, var3, var4, var6);
            this.method_1016(var1, var2 + 1, var3, var4, var6);
         }
      }
   }

   private int method_1353(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_197(var2, var3, var4);
      if (var6 != Class108.field_1348.field_2151
         && var6 != Class390.field_2848.field_2151
         && var6 != Class390.field_2274.field_2151
         && var6 != Class390.field_3032.field_2151) {
         if (var6 == this.field_2151) {
            int var7 = var1.method_1110(var2, var3, var4);
            if (var7 != 0 && var7 > var5) {
               return var7;
            }
         }

         return var5;
      } else {
         return 16;
      }
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      if (var5.nextBoolean()) {
         double var7 = (var5.nextDouble() - 0.5) * 0.1;
         double var9 = (var5.nextDouble() - 0.5) * 0.1;
         var1.method_1347("leaf", var2, var3, var4, var7, -0.1, var9);
      }

      if (var6 == 0) {
         this.field_95 = 0;
         this.method_1468(var1, var2, var3, var4);
      } else if (var6 == 1) {
         this.method_1025(var1, var2, var3, var4);
      } else if (var5.nextInt(10) == 0) {
         this.method_1468(var1, var2, var3, var4);
      }
   }

   private void method_1025(Class454 var1, int var2, int var3, int var4) {
      this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
      var1.method_1481(var2, var3, var4, 0);
   }

   @Override
   public int method_1257(Random var1) {
      return var1.nextInt(20) == 0 ? 1 : 0;
   }

   @Override
   public int method_1901(int var1, Random var2) {
      if (this.field_2151 == Class390.field_3032.field_2151) {
         return var2.nextBoolean() ? Class108.field_968.field_2151 : Class50.field_1191.field_10;
      } else {
         return var2.nextBoolean()
            ? Class108.field_968.field_2151
            : (var2.nextBoolean() ? Class755.field_3063.field_10 : (var2.nextBoolean() ? Class50.field_3015.field_10 : Class50.field_467.field_10));
      }
   }

   @Override
   public boolean method_214() {
      return !this.field_785;
   }

   public void method_1813(boolean var1) {
      this.field_785 = var1;
      this.field_2972 = this.field_2865 + (var1 ? 0 : 1);
   }

   @Override
   public void method_1507(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      super.method_1507(var1, var2, var3, var4, var5);
   }
}
