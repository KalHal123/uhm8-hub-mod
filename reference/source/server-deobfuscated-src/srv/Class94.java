package srv;

import java.util.ArrayList;
import java.util.List;

public class Class94 {
   private static List field_481 = new ArrayList();
   private static int field_7 = 0;
   public double field_1397;
   public double field_817;
   public double field_601;
   public double field_346;
   public double field_1448;
   public double field_854;

   public static Class94 method_971(double var0, double var2, double var4, double var6, double var8, double var10) {
      return new Class94(var0, var2, var4, var6, var8, var10);
   }

   public static void method_166() {
      field_7 = 0;
   }

   public static Class94 method_27(double var0, double var2, double var4, double var6, double var8, double var10) {
      if (field_7 >= field_481.size()) {
         field_481.add(method_971(0.0, 0.0, 0.0, 0.0, 0.0, 0.0));
      }

      return ((Class94)field_481.get(field_7++)).method_268(var0, var2, var4, var6, var8, var10);
   }

   private Class94(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field_1397 = var1;
      this.field_817 = var3;
      this.field_601 = var5;
      this.field_346 = var7;
      this.field_1448 = var9;
      this.field_854 = var11;
   }

   public Class94 method_268(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field_1397 = var1;
      this.field_817 = var3;
      this.field_601 = var5;
      this.field_346 = var7;
      this.field_1448 = var9;
      this.field_854 = var11;
      return this;
   }

   public Class94 method_949(double var1, double var3, double var5) {
      double var7 = this.field_1397;
      double var9 = this.field_817;
      double var11 = this.field_601;
      double var13 = this.field_346;
      double var15 = this.field_1448;
      double var17 = this.field_854;
      if (var1 < 0.0) {
         var7 += var1;
      }

      if (var1 > 0.0) {
         var13 += var1;
      }

      if (var3 < 0.0) {
         var9 += var3;
      }

      if (var3 > 0.0) {
         var15 += var3;
      }

      if (var5 < 0.0) {
         var11 += var5;
      }

      if (var5 > 0.0) {
         var17 += var5;
      }

      return method_27(var7, var9, var11, var13, var15, var17);
   }

   public Class94 method_99(double var1, double var3, double var5) {
      double var7 = this.field_1397 - var1;
      double var9 = this.field_817 - var3;
      double var11 = this.field_601 - var5;
      double var13 = this.field_346 + var1;
      double var15 = this.field_1448 + var3;
      double var17 = this.field_854 + var5;
      return method_27(var7, var9, var11, var13, var15, var17);
   }

   public Class94 method_709(double var1, double var3, double var5) {
      return method_27(
         this.field_1397 + var1, this.field_817 + var3, this.field_601 + var5, this.field_346 + var1, this.field_1448 + var3, this.field_854 + var5
      );
   }

   public double method_896(Class94 var1, double var2) {
      if (!(var1.field_1448 > this.field_817) || !(var1.field_817 < this.field_1448)) {
         return var2;
      }

      if (var1.field_854 > this.field_601 && var1.field_601 < this.field_854) {
         if (var2 > 0.0 && var1.field_346 <= this.field_1397) {
            double var4 = this.field_1397 - var1.field_346;
            if (var4 < var2) {
               var2 = var4;
            }
         }

         if (var2 < 0.0 && var1.field_1397 >= this.field_346) {
            double var6 = this.field_346 - var1.field_1397;
            if (var6 > var2) {
               var2 = var6;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public double method_765(Class94 var1, double var2) {
      if (!(var1.field_346 > this.field_1397) || !(var1.field_1397 < this.field_346)) {
         return var2;
      }

      if (var1.field_854 > this.field_601 && var1.field_601 < this.field_854) {
         if (var2 > 0.0 && var1.field_1448 <= this.field_817) {
            double var4 = this.field_817 - var1.field_1448;
            if (var4 < var2) {
               var2 = var4;
            }
         }

         if (var2 < 0.0 && var1.field_817 >= this.field_1448) {
            double var6 = this.field_1448 - var1.field_817;
            if (var6 > var2) {
               var2 = var6;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public double method_954(Class94 var1, double var2) {
      if (!(var1.field_346 > this.field_1397) || !(var1.field_1397 < this.field_346)) {
         return var2;
      }

      if (var1.field_1448 > this.field_817 && var1.field_817 < this.field_1448) {
         if (var2 > 0.0 && var1.field_854 <= this.field_601) {
            double var4 = this.field_601 - var1.field_854;
            if (var4 < var2) {
               var2 = var4;
            }
         }

         if (var2 < 0.0 && var1.field_601 >= this.field_854) {
            double var6 = this.field_854 - var1.field_601;
            if (var6 > var2) {
               var2 = var6;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public boolean method_75(Class94 var1) {
      return !(var1.field_346 > this.field_1397) || !(var1.field_1397 < this.field_346)
         ? false
         : (var1.field_1448 > this.field_817 && var1.field_817 < this.field_1448 ? var1.field_854 > this.field_601 && var1.field_601 < this.field_854 : false);
   }

   public Class94 method_259(double var1, double var3, double var5) {
      this.field_1397 += var1;
      this.field_817 += var3;
      this.field_601 += var5;
      this.field_346 += var1;
      this.field_1448 += var3;
      this.field_854 += var5;
      return this;
   }

   public Class94 method_101(double var1, double var3, double var5) {
      double var7 = this.field_1397;
      double var9 = this.field_817;
      double var11 = this.field_601;
      double var13 = this.field_346;
      double var15 = this.field_1448;
      double var17 = this.field_854;
      if (var1 < 0.0) {
         var7 -= var1;
      }

      if (var1 > 0.0) {
         var13 -= var1;
      }

      if (var3 < 0.0) {
         var9 -= var3;
      }

      if (var3 > 0.0) {
         var15 -= var3;
      }

      if (var5 < 0.0) {
         var11 -= var5;
      }

      if (var5 > 0.0) {
         var17 -= var5;
      }

      return method_27(var7, var9, var11, var13, var15, var17);
   }

   public Class94 method_303() {
      return method_27(this.field_1397, this.field_817, this.field_601, this.field_346, this.field_1448, this.field_854);
   }

   public Class3 method_560(Class47 var1, Class47 var2) {
      Class47 var3 = var1.method_693(var2, this.field_1397);
      Class47 var4 = var1.method_693(var2, this.field_346);
      Class47 var5 = var1.method_697(var2, this.field_817);
      Class47 var6 = var1.method_697(var2, this.field_1448);
      Class47 var7 = var1.method_992(var2, this.field_601);
      Class47 var8 = var1.method_992(var2, this.field_854);
      if (!this.method_979(var3)) {
         var3 = null;
      }

      if (!this.method_979(var4)) {
         var4 = null;
      }

      if (!this.method_513(var5)) {
         var5 = null;
      }

      if (!this.method_513(var6)) {
         var6 = null;
      }

      if (!this.method_289(var7)) {
         var7 = null;
      }

      if (!this.method_289(var8)) {
         var8 = null;
      }

      Class47 var9 = null;
      if (var3 != null && (var9 == null || var1.method_408(var3) < var1.method_408(var9))) {
         var9 = var3;
      }

      if (var4 != null && (var9 == null || var1.method_408(var4) < var1.method_408(var9))) {
         var9 = var4;
      }

      if (var5 != null && (var9 == null || var1.method_408(var5) < var1.method_408(var9))) {
         var9 = var5;
      }

      if (var6 != null && (var9 == null || var1.method_408(var6) < var1.method_408(var9))) {
         var9 = var6;
      }

      if (var7 != null && (var9 == null || var1.method_408(var7) < var1.method_408(var9))) {
         var9 = var7;
      }

      if (var8 != null && (var9 == null || var1.method_408(var8) < var1.method_408(var9))) {
         var9 = var8;
      }

      if (var9 == null) {
         return null;
      }

      byte var10 = -1;
      if (var9 == var3) {
         var10 = 4;
      }

      if (var9 == var4) {
         var10 = 5;
      }

      if (var9 == var5) {
         var10 = 0;
      }

      if (var9 == var6) {
         var10 = 1;
      }

      if (var9 == var7) {
         var10 = 2;
      }

      if (var9 == var8) {
         var10 = 3;
      }

      return new Class3(0, 0, 0, var10, var9);
   }

   private boolean method_979(Class47 var1) {
      return var1 == null
         ? false
         : var1.field_173 >= this.field_817 && var1.field_173 <= this.field_1448 && var1.field_510 >= this.field_601 && var1.field_510 <= this.field_854;
   }

   private boolean method_513(Class47 var1) {
      return var1 == null
         ? false
         : var1.field_13 >= this.field_1397 && var1.field_13 <= this.field_346 && var1.field_510 >= this.field_601 && var1.field_510 <= this.field_854;
   }

   private boolean method_289(Class47 var1) {
      return var1 == null
         ? false
         : var1.field_13 >= this.field_1397 && var1.field_13 <= this.field_346 && var1.field_173 >= this.field_817 && var1.field_173 <= this.field_1448;
   }

   public void method_677(Class94 var1) {
      this.field_1397 = var1.field_1397;
      this.field_817 = var1.field_817;
      this.field_601 = var1.field_601;
      this.field_346 = var1.field_346;
      this.field_1448 = var1.field_1448;
      this.field_854 = var1.field_854;
   }
}
