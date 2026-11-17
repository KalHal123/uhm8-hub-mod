package ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class116 extends Class551 {
   private boolean field_356 = false;
   private static List field_1384 = new ArrayList();

   @Override
   public int method_1411(int var1, int var2) {
      return var1 == 1 ? Class407.field_2141.method_1411(var1, var2) : super.method_1411(var1, var2);
   }

   private boolean method_88(Class454 var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         field_1384.add(new Class440(var2, var3, var4, var1.field_2075));
      }

      int var6 = 0;

      for (int var7 = 0; var7 < field_1384.size(); var7++) {
         Class440 var8 = (Class440)field_1384.get(var7);
         if (var8.field_2098 == var2 && var8.field_2859 == var3 && var8.field_2570 == var4) {
            if (++var6 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   protected Class116(int var1, int var2, boolean var3) {
      super(var1, var2);
      this.field_356 = var3;
      this.method_1936(true);
   }

   @Override
   public int method_1520() {
      return 2;
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      if (var1.method_1110(var2, var3, var4) == 0) {
         super.method_1592(var1, var2, var3, var4);
      }

      if (this.field_356) {
         var1.method_558(var2, var3 - 1, var4, this.field_19);
         var1.method_558(var2, var3 + 1, var4, this.field_19);
         var1.method_558(var2 - 1, var3, var4, this.field_19);
         var1.method_558(var2 + 1, var3, var4, this.field_19);
         var1.method_558(var2, var3, var4 - 1, this.field_19);
         var1.method_558(var2, var3, var4 + 1, this.field_19);
      }
   }

   @Override
   public void method_1617(Class454 var1, int var2, int var3, int var4) {
      if (this.field_356) {
         var1.method_558(var2, var3 - 1, var4, this.field_19);
         var1.method_558(var2, var3 + 1, var4, this.field_19);
         var1.method_558(var2 - 1, var3, var4, this.field_19);
         var1.method_558(var2 + 1, var3, var4, this.field_19);
         var1.method_558(var2, var3, var4 - 1, this.field_19);
         var1.method_558(var2, var3, var4 + 1, this.field_19);
      }
   }

   @Override
   public boolean method_866(Interface698 var1, int var2, int var3, int var4, int var5) {
      if (!this.field_356) {
         return false;
      } else {
         int var6 = var1.method_1110(var2, var3, var4);
         if (var6 == 5 && var5 == 1) {
            return false;
         } else if (var6 == 3 && var5 == 3) {
            return false;
         } else if (var6 == 4 && var5 == 2) {
            return false;
         } else {
            return var6 == 1 && var5 == 5 ? false : var6 != 2 || var5 != 4;
         }
      }
   }

   private boolean h(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      if (var5 == 5 && var1.method_242(var2, var3 - 1, var4, 0)) {
         return true;
      } else if (var5 == 3 && var1.method_242(var2, var3, var4 - 1, 2)) {
         return true;
      } else if (var5 == 4 && var1.method_242(var2, var3, var4 + 1, 3)) {
         return true;
      } else {
         return var5 == 1 && var1.method_242(var2 - 1, var3, var4, 4) ? true : var5 == 2 && var1.method_242(var2 + 1, var3, var4, 5);
      }
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = this.h(var1, var2, var3, var4);

      while (field_1384.size() > 0 && var1.field_2075 - ((Class440)field_1384.get(0)).field_1775 > 100L) {
         field_1384.remove(0);
      }

      if (this.field_356) {
         if (var6) {
            var1.method_1193(var2, var3, var4, Class407.field_2232.field_19, var1.method_1110(var2, var3, var4));
            if (this.method_88(var1, var2, var3, var4, true)) {
               var1.method_861(
                  var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "random.fizz", 0.5F, 2.6F + (var1.field_2150.nextFloat() - var1.field_2150.nextFloat()) * 0.8F
               );

               for (int var7 = 0; var7 < 5; var7++) {
                  double var8 = var2 + var5.nextDouble() * 0.6 + 0.2;
                  double var10 = var3 + var5.nextDouble() * 0.6 + 0.2;
                  double var12 = var4 + var5.nextDouble() * 0.6 + 0.2;
                  var1.method_1347("smoke", var8, var10, var12, 0.0, 0.0, 0.0);
               }
            }
         }
      } else if (!var6 && !this.method_88(var1, var2, var3, var4, false)) {
         var1.method_1193(var2, var3, var4, Class407.field_157.field_19, var1.method_1110(var2, var3, var4));
      }
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      super.method_1300(var1, var2, var3, var4, var5);
      var1.method_600(var2, var3, var4, this.field_19);
   }

   @Override
   public boolean method_1031(Class454 var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 ? this.method_866(var1, var2, var3, var4, var5) : false;
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return Class407.field_157.field_19;
   }

   @Override
   public boolean method_3() {
      return true;
   }

   @Override
   public void method_453(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (this.field_356) {
         int var6 = var1.method_1110(var2, var3, var4);
         double var7 = var2 + 0.5F + (var5.nextFloat() - 0.5F) * 0.2;
         double var9 = var3 + 0.7F + (var5.nextFloat() - 0.5F) * 0.2;
         double var11 = var4 + 0.5F + (var5.nextFloat() - 0.5F) * 0.2;
         double var13 = 0.22F;
         double var15 = 0.27F;
         if (var6 == 1) {
            var1.method_1347("reddust", var7 - var15, var9 + var13, var11, 0.0, 0.0, 0.0);
         } else if (var6 == 2) {
            var1.method_1347("reddust", var7 + var15, var9 + var13, var11, 0.0, 0.0, 0.0);
         } else if (var6 == 3) {
            var1.method_1347("reddust", var7, var9 + var13, var11 - var15, 0.0, 0.0, 0.0);
         } else if (var6 == 4) {
            var1.method_1347("reddust", var7, var9 + var13, var11 + var15, 0.0, 0.0, 0.0);
         } else {
            var1.method_1347("reddust", var7, var9, var11, 0.0, 0.0, 0.0);
         }
      }
   }
}
