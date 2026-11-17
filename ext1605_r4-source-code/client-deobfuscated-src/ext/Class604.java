package ext;

import java.util.Random;

public class Class604 extends Class108 {
   protected Class604(int var1, Class160 var2) {
      super(var1, var2);
      this.field_2972 = 97;
      if (var2 == Class160.field_1806) {
         this.field_2972++;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.method_1618(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   @Override
   public int method_774(int var1, int var2) {
      if (var1 != 0 && var1 != 1) {
         int var3 = this.method_846(var2);
         if ((var3 == 0 || var3 == 2) ^ var1 <= 3) {
            return this.field_2972;
         }

         int var4 = var3 / 2 + (var1 & 1 ^ var3);
         var4 += (var2 & 4) / 4;
         int var5 = this.field_2972 - (var2 & 8) * 2;
         if ((var4 & 1) != 0) {
            var5 = -var5;
         }

         return var5;
      } else {
         return this.field_2972;
      }
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
      return 7;
   }

   @Override
   public Class630 method_366(Class454 var1, int var2, int var3, int var4) {
      this.method_1433(var1, var2, var3, var4);
      return super.method_366(var1, var2, var3, var4);
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      this.method_1433(var1, var2, var3, var4);
      return super.method_720(var1, var2, var3, var4);
   }

   @Override
   public void method_1433(Interface698 var1, int var2, int var3, int var4) {
      this.method_226(this.method_846(var1.method_1110(var2, var3, var4)));
   }

   public void method_226(int var1) {
      float var2 = 0.1875F;
      this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      if (var1 == 0) {
         this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
      }

      if (var1 == 1) {
         this.method_1618(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if (var1 == 2) {
         this.method_1618(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
      }

      if (var1 == 3) {
         this.method_1618(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
      }
   }

   @Override
   public void method_424(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      this.method_835(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      if (this.field_1854 == Class160.field_1806) {
         return true;
      }

      int var6 = var1.method_1110(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.method_197(var2, var3 - 1, var4) == this.field_2151) {
            this.method_835(var1, var2, var3 - 1, var4, var5);
         }

         return true;
      } else {
         if (var1.method_197(var2, var3 + 1, var4) == this.field_2151) {
            var1.method_518(var2, var3 + 1, var4, (var6 ^ 4) + 8);
         }

         var1.method_518(var2, var3, var4, var6 ^ 4);
         var1.method_1678(var2, var3 - 1, var4, var2, var3, var4);
         if (Math.random() < 0.5) {
            var1.method_861(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_open", 1.0F, var1.field_2150.nextFloat() * 0.1F + 0.9F);
         } else {
            var1.method_861(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_close", 1.0F, var1.field_2150.nextFloat() * 0.1F + 0.9F);
         }

         return true;
      }
   }

   public void method_1458(Class454 var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.method_197(var2, var3 - 1, var4) == this.field_2151) {
            this.method_1458(var1, var2, var3 - 1, var4, var5);
         }
      } else {
         boolean var7 = (var1.method_1110(var2, var3, var4) & 4) > 0;
         if (var7 != var5) {
            if (var1.method_197(var2, var3 + 1, var4) == this.field_2151) {
               var1.method_518(var2, var3 + 1, var4, (var6 ^ 4) + 8);
            }

            var1.method_518(var2, var3, var4, var6 ^ 4);
            var1.method_1678(var2, var3 - 1, var4, var2, var3, var4);
            if (Math.random() < 0.5) {
               var1.method_861(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_open", 1.0F, var1.field_2150.nextFloat() * 0.1F + 0.9F);
            } else {
               var1.method_861(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_close", 1.0F, var1.field_2150.nextFloat() * 0.1F + 0.9F);
            }
         }
      }
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.method_197(var2, var3 - 1, var4) != this.field_2151) {
            var1.method_1481(var2, var3, var4, 0);
         }

         if (var5 > 0 && Class108.field_1221[var5].method_40()) {
            this.method_1464(var1, var2, var3 - 1, var4, var5);
         }
      } else {
         boolean var7 = false;
         if (var1.method_197(var2, var3 + 1, var4) != this.field_2151) {
            var1.method_1481(var2, var3, var4, 0);
            var7 = true;
         }

         if (!var1.method_768(var2, var3 - 1, var4)) {
            var1.method_1481(var2, var3, var4, 0);
            var7 = true;
            if (var1.method_197(var2, var3 + 1, var4) == this.field_2151) {
               var1.method_1481(var2, var3 + 1, var4, 0);
            }
         }

         if (var7) {
            this.method_625(var1, var2, var3, var4, var6);
         } else if (var5 > 0 && Class108.field_1221[var5].method_40()) {
            boolean var8 = var1.method_266(var2, var3, var4) || var1.method_266(var2, var3 + 1, var4);
            this.method_1458(var1, var2, var3, var4, var8);
         }
      }
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return (var1 & 8) != 0 ? 0 : (this.field_1854 == Class160.field_1806 ? Class755.field_1293.field_10 : Class755.field_499.field_10);
   }

   @Override
   public Class366 method_739(Class454 var1, int var2, int var3, int var4, Class214 var5, Class214 var6) {
      this.method_1433(var1, var2, var3, var4);
      return super.method_739(var1, var2, var3, var4, var5, var6);
   }

   public int method_846(int var1) {
      return (var1 & 4) == 0 ? var1 - 1 & 3 : var1 & 3;
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return var3 >= 127
         ? false
         : var1.method_768(var2, var3 - 1, var4) && super.method_432(var1, var2, var3, var4) && super.method_432(var1, var2, var3 + 1, var4);
   }
}
