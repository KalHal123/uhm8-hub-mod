package ext;

import java.util.Random;

public class Class375 extends Class108 {
   protected Class375(int var1, int var2) {
      super(var1, var2, Class160.field_1787);
      this.method_1646(true);
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public int method_1427() {
      return 20;
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
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return var1.method_768(var2 - 1, var3, var4)
         ? true
         : (var1.method_768(var2 + 1, var3, var4) ? true : (var1.method_768(var2, var3, var4 - 1) ? true : var1.method_768(var2, var3, var4 + 1)));
   }

   @Override
   public void method_1886(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      int var7 = var6 & 8;
      var6 &= 7;
      if (var5 == 2 && var1.method_768(var2, var3, var4 + 1)) {
         var6 = 4;
      }

      if (var5 == 3 && var1.method_768(var2, var3, var4 - 1)) {
         var6 = 3;
      }

      if (var5 == 4 && var1.method_768(var2 + 1, var3, var4)) {
         var6 = 2;
      }

      if (var5 == 5 && var1.method_768(var2 - 1, var3, var4)) {
         var6 = 1;
      }

      var1.method_518(var2, var3, var4, var6 + var7);
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      if (var1.method_768(var2 - 1, var3, var4)) {
         var1.method_518(var2, var3, var4, 1);
      } else if (var1.method_768(var2 + 1, var3, var4)) {
         var1.method_518(var2, var3, var4, 2);
      } else if (var1.method_768(var2, var3, var4 - 1)) {
         var1.method_518(var2, var3, var4, 3);
      } else if (var1.method_768(var2, var3, var4 + 1)) {
         var1.method_518(var2, var3, var4, 4);
      }

      this.method_575(var1, var2, var3, var4);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      if (this.method_575(var1, var2, var3, var4)) {
         int var6 = var1.method_1110(var2, var3, var4) & 7;
         boolean var7 = false;
         if (!var1.method_768(var2 - 1, var3, var4) && var6 == 1) {
            var7 = true;
         }

         if (!var1.method_768(var2 + 1, var3, var4) && var6 == 2) {
            var7 = true;
         }

         if (!var1.method_768(var2, var3, var4 - 1) && var6 == 3) {
            var7 = true;
         }

         if (!var1.method_768(var2, var3, var4 + 1) && var6 == 4) {
            var7 = true;
         }

         if (var7) {
            this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
            var1.method_1481(var2, var3, var4, 0);
         }
      }
   }

   private boolean method_575(Class454 var1, int var2, int var3, int var4) {
      if (!this.method_432(var1, var2, var3, var4)) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method_1433(Interface698 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) > 0;
      float var8 = 0.375F;
      float var9 = 0.625F;
      float var10 = 0.1875F;
      float var11 = 0.125F;
      if (var7) {
         var11 = 0.0625F;
      }

      if (var6 == 1) {
         this.method_1618(0.0F, var8, 0.5F - var10, var11, var9, 0.5F + var10);
      } else if (var6 == 2) {
         this.method_1618(1.0F - var11, var8, 0.5F - var10, 1.0F, var9, 0.5F + var10);
      } else if (var6 == 3) {
         this.method_1618(0.5F - var10, var8, 0.0F, 0.5F + var10, var9, var11);
      } else if (var6 == 4) {
         this.method_1618(0.5F - var10, var8, 1.0F - var11, 0.5F + var10, var9, 1.0F);
      }
   }

   @Override
   public void method_424(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      this.method_835(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      int var7 = var6 & 7;
      int var8 = 8 - (var6 & 8);
      if (var8 == 0) {
         return true;
      }

      var1.method_518(var2, var3, var4, var7 + var8);
      var1.method_1678(var2, var3, var4, var2, var3, var4);
      var1.method_861(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.click", 0.3F, 0.6F);
      var1.method_558(var2, var3, var4, this.field_2151);
      if (var7 == 1) {
         var1.method_558(var2 - 1, var3, var4, this.field_2151);
      } else if (var7 == 2) {
         var1.method_558(var2 + 1, var3, var4, this.field_2151);
      } else if (var7 == 3) {
         var1.method_558(var2, var3, var4 - 1, this.field_2151);
      } else if (var7 == 4) {
         var1.method_558(var2, var3, var4 + 1, this.field_2151);
      } else {
         var1.method_558(var2, var3 - 1, var4, this.field_2151);
      }

      var1.method_600(var2, var3, var4, this.field_2151);
      return true;
   }

   @Override
   public void method_1736(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      if ((var5 & 8) > 0) {
         var1.method_558(var2, var3, var4, this.field_2151);
         int var6 = var5 & 7;
         if (var6 == 1) {
            var1.method_558(var2 - 1, var3, var4, this.field_2151);
         } else if (var6 == 2) {
            var1.method_558(var2 + 1, var3, var4, this.field_2151);
         } else if (var6 == 3) {
            var1.method_558(var2, var3, var4 - 1, this.field_2151);
         } else if (var6 == 4) {
            var1.method_558(var2, var3, var4 + 1, this.field_2151);
         } else {
            var1.method_558(var2, var3 - 1, var4, this.field_2151);
         }
      }

      super.method_1736(var1, var2, var3, var4);
   }

   @Override
   public boolean method_16(Interface698 var1, int var2, int var3, int var4, int var5) {
      return (var1.method_1110(var2, var3, var4) & 8) > 0;
   }

   @Override
   public boolean method_926(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      if ((var6 & 8) == 0) {
         return false;
      }

      int var7 = var6 & 7;
      return var7 == 5 && var5 == 1
         ? true
         : (var7 == 4 && var5 == 2 ? true : (var7 == 3 && var5 == 3 ? true : (var7 == 2 && var5 == 4 ? true : var7 == 1 && var5 == 5)));
   }

   @Override
   public boolean method_40() {
      return true;
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      if ((var6 & 8) != 0) {
         var1.method_518(var2, var3, var4, var6 & 7);
         var1.method_558(var2, var3, var4, this.field_2151);
         int var7 = var6 & 7;
         if (var7 == 1) {
            var1.method_558(var2 - 1, var3, var4, this.field_2151);
         } else if (var7 == 2) {
            var1.method_558(var2 + 1, var3, var4, this.field_2151);
         } else if (var7 == 3) {
            var1.method_558(var2, var3, var4 - 1, this.field_2151);
         } else if (var7 == 4) {
            var1.method_558(var2, var3, var4 + 1, this.field_2151);
         } else {
            var1.method_558(var2, var3 - 1, var4, this.field_2151);
         }

         var1.method_861(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.click", 0.3F, 0.5F);
         var1.method_1678(var2, var3, var4, var2, var3, var4);
      }
   }

   @Override
   public void method_1035() {
      float var1 = 0.1875F;
      float var2 = 0.125F;
      float var3 = 0.125F;
      this.method_1618(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }
}
