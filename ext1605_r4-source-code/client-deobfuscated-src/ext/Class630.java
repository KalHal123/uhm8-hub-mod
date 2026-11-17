package ext;

import java.util.ArrayList;
import java.util.List;

public class Class630 {
   private static List<Class630> field_435 = new ArrayList<>();
   private static int field_426 = 0;
   public double field_2118;
   public double field_946;
   public double field_1714;
   public double field_1702;
   public double field_3132;
   public double field_858;

   public static Class630 method_769(double var0, double var2, double var4, double var6, double var8, double var10) {
      return new Class630(var0, var2, var4, var6, var8, var10);
   }

   public static void method_716() {
      field_426 = 0;
   }

   public static Class630 method_969(double var0, double var2, double var4, double var6, double var8, double var10) {
      if (field_426 >= field_435.size()) {
         field_435.add(method_769(0.0, 0.0, 0.0, 0.0, 0.0, 0.0));
      }

      return field_435.get(field_426++).method_327(var0, var2, var4, var6, var8, var10);
   }

   private Class630(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field_2118 = var1;
      this.field_946 = var3;
      this.field_1714 = var5;
      this.field_1702 = var7;
      this.field_3132 = var9;
      this.field_858 = var11;
   }

   public Class630 method_327(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field_2118 = var1;
      this.field_946 = var3;
      this.field_1714 = var5;
      this.field_1702 = var7;
      this.field_3132 = var9;
      this.field_858 = var11;
      return this;
   }

   public Class630 method_1669(double var1, double var3, double var5) {
      double var7 = this.field_2118;
      double var9 = this.field_946;
      double var11 = this.field_1714;
      double var13 = this.field_1702;
      double var15 = this.field_3132;
      double var17 = this.field_858;
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

      return method_969(var7, var9, var11, var13, var15, var17);
   }

   public Class630 method_1384(double var1, double var3, double var5) {
      double var7 = this.field_2118 - var1;
      double var9 = this.field_946 - var3;
      double var11 = this.field_1714 - var5;
      double var13 = this.field_1702 + var1;
      double var15 = this.field_3132 + var3;
      double var17 = this.field_858 + var5;
      return method_969(var7, var9, var11, var13, var15, var17);
   }

   public Class630 method_1032(double var1, double var3, double var5) {
      return method_969(
         this.field_2118 + var1, this.field_946 + var3, this.field_1714 + var5, this.field_1702 + var1, this.field_3132 + var3, this.field_858 + var5
      );
   }

   public double method_602(Class630 var1, double var2) {
      if (!(var1.field_3132 > this.field_946) || !(var1.field_946 < this.field_3132)) {
         return var2;
      }

      if (var1.field_858 > this.field_1714 && var1.field_1714 < this.field_858) {
         if (var2 > 0.0 && var1.field_1702 <= this.field_2118) {
            double var4 = this.field_2118 - var1.field_1702;
            if (var4 < var2) {
               var2 = var4;
            }
         }

         if (var2 < 0.0 && var1.field_2118 >= this.field_1702) {
            double var6 = this.field_1702 - var1.field_2118;
            if (var6 > var2) {
               var2 = var6;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public double method_776(Class630 var1, double var2) {
      if (!(var1.field_1702 > this.field_2118) || !(var1.field_2118 < this.field_1702)) {
         return var2;
      }

      if (var1.field_858 > this.field_1714 && var1.field_1714 < this.field_858) {
         if (var2 > 0.0 && var1.field_3132 <= this.field_946) {
            double var4 = this.field_946 - var1.field_3132;
            if (var4 < var2) {
               var2 = var4;
            }
         }

         if (var2 < 0.0 && var1.field_946 >= this.field_3132) {
            double var6 = this.field_3132 - var1.field_946;
            if (var6 > var2) {
               var2 = var6;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public double method_1718(Class630 var1, double var2) {
      if (!(var1.field_1702 > this.field_2118) || !(var1.field_2118 < this.field_1702)) {
         return var2;
      }

      if (var1.field_3132 > this.field_946 && var1.field_946 < this.field_3132) {
         if (var2 > 0.0 && var1.field_858 <= this.field_1714) {
            double var4 = this.field_1714 - var1.field_858;
            if (var4 < var2) {
               var2 = var4;
            }
         }

         if (var2 < 0.0 && var1.field_1714 >= this.field_858) {
            double var6 = this.field_858 - var1.field_1714;
            if (var6 > var2) {
               var2 = var6;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public boolean method_1328(Class630 var1) {
      return !(var1.field_1702 > this.field_2118) || !(var1.field_2118 < this.field_1702)
         ? false
         : (var1.field_3132 > this.field_946 && var1.field_946 < this.field_3132 ? var1.field_858 > this.field_1714 && var1.field_1714 < this.field_858 : false);
   }

   public Class630 method_1200(double var1, double var3, double var5) {
      this.field_2118 += var1;
      this.field_946 += var3;
      this.field_1714 += var5;
      this.field_1702 += var1;
      this.field_3132 += var3;
      this.field_858 += var5;
      return this;
   }

   public double method_1479() {
      double var1 = this.field_1702 - this.field_2118;
      double var3 = this.field_3132 - this.field_946;
      double var5 = this.field_858 - this.field_1714;
      return (var1 + var3 + var5) / 3.0;
   }

   public Class630 method_1038() {
      return method_969(this.field_2118, this.field_946, this.field_1714, this.field_1702, this.field_3132, this.field_858);
   }

   public Class366 method_64(Class214 var1, Class214 var2) {
      Class214 var3 = var1.method_320(var2, this.field_2118);
      Class214 var4 = var1.method_320(var2, this.field_1702);
      Class214 var5 = var1.method_29(var2, this.field_946);
      Class214 var6 = var1.method_29(var2, this.field_3132);
      Class214 var7 = var1.method_965(var2, this.field_1714);
      Class214 var8 = var1.method_965(var2, this.field_858);
      if (!this.method_1095(var3)) {
         var3 = null;
      }

      if (!this.method_1095(var4)) {
         var4 = null;
      }

      if (!this.method_402(var5)) {
         var5 = null;
      }

      if (!this.method_402(var6)) {
         var6 = null;
      }

      if (!this.method_1704(var7)) {
         var7 = null;
      }

      if (!this.method_1704(var8)) {
         var8 = null;
      }

      Class214 var9 = null;
      if (var3 != null && (var9 == null || var1.method_563(var3) < var1.method_563(var9))) {
         var9 = var3;
      }

      if (var4 != null && (var9 == null || var1.method_563(var4) < var1.method_563(var9))) {
         var9 = var4;
      }

      if (var5 != null && (var9 == null || var1.method_563(var5) < var1.method_563(var9))) {
         var9 = var5;
      }

      if (var6 != null && (var9 == null || var1.method_563(var6) < var1.method_563(var9))) {
         var9 = var6;
      }

      if (var7 != null && (var9 == null || var1.method_563(var7) < var1.method_563(var9))) {
         var9 = var7;
      }

      if (var8 != null && (var9 == null || var1.method_563(var8) < var1.method_563(var9))) {
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

      return new Class366(0, 0, 0, var10, var9);
   }

   private boolean method_1095(Class214 var1) {
      return var1 == null
         ? false
         : var1.field_1911 >= this.field_946 && var1.field_1911 <= this.field_3132 && var1.field_3045 >= this.field_1714 && var1.field_3045 <= this.field_858;
   }

   private boolean method_402(Class214 var1) {
      return var1 == null
         ? false
         : var1.field_882 >= this.field_2118 && var1.field_882 <= this.field_1702 && var1.field_3045 >= this.field_1714 && var1.field_3045 <= this.field_858;
   }

   private boolean method_1704(Class214 var1) {
      return var1 == null
         ? false
         : var1.field_882 >= this.field_2118 && var1.field_882 <= this.field_1702 && var1.field_1911 >= this.field_946 && var1.field_1911 <= this.field_3132;
   }

   public void method_313(Class630 var1) {
      this.field_2118 = var1.field_2118;
      this.field_946 = var1.field_946;
      this.field_1714 = var1.field_1714;
      this.field_1702 = var1.field_1702;
      this.field_3132 = var1.field_3132;
      this.field_858 = var1.field_858;
   }
}
