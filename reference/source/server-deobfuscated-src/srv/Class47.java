package srv;

import java.util.ArrayList;
import java.util.List;

public class Class47 {
   private static List field_1097 = new ArrayList();
   private static int field_5 = 0;
   public double field_13;
   public double field_173;
   public double field_510;

   public static Class47 method_656(double var0, double var2, double var4) {
      return new Class47(var0, var2, var4);
   }

   public static void method_957() {
      field_5 = 0;
   }

   public static Class47 method_875(double var0, double var2, double var4) {
      if (field_5 >= field_1097.size()) {
         field_1097.add(method_656(0.0, 0.0, 0.0));
      }

      return ((Class47)field_1097.get(field_5++)).method_446(var0, var2, var4);
   }

   private Class47(double var1, double var3, double var5) {
      if (var1 == -0.0) {
         var1 = 0.0;
      }

      if (var3 == -0.0) {
         var3 = 0.0;
      }

      if (var5 == -0.0) {
         var5 = 0.0;
      }

      this.field_13 = var1;
      this.field_173 = var3;
      this.field_510 = var5;
   }

   private Class47 method_446(double var1, double var3, double var5) {
      this.field_13 = var1;
      this.field_173 = var3;
      this.field_510 = var5;
      return this;
   }

   public Class47 method_37() {
      double var1 = Class380.method_164(this.field_13 * this.field_13 + this.field_173 * this.field_173 + this.field_510 * this.field_510);
      return var1 < 1.0E-4 ? method_875(0.0, 0.0, 0.0) : method_875(this.field_13 / var1, this.field_173 / var1, this.field_510 / var1);
   }

   public Class47 method_203(double var1, double var3, double var5) {
      return method_875(this.field_13 + var1, this.field_173 + var3, this.field_510 + var5);
   }

   public double method_797(Class47 var1) {
      double var2 = var1.field_13 - this.field_13;
      double var4 = var1.field_173 - this.field_173;
      double var6 = var1.field_510 - this.field_510;
      return Class380.method_164(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double method_408(Class47 var1) {
      double var2 = var1.field_13 - this.field_13;
      double var4 = var1.field_173 - this.field_173;
      double var6 = var1.field_510 - this.field_510;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double method_620(double var1, double var3, double var5) {
      double var7 = var1 - this.field_13;
      double var9 = var3 - this.field_173;
      double var11 = var5 - this.field_510;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double method_906() {
      return Class380.method_164(this.field_13 * this.field_13 + this.field_173 * this.field_173 + this.field_510 * this.field_510);
   }

   public Class47 method_693(Class47 var1, double var2) {
      double var4 = var1.field_13 - this.field_13;
      double var6 = var1.field_173 - this.field_173;
      double var8 = var1.field_510 - this.field_510;
      if (var4 * var4 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.field_13) / var4;
      return var10 >= 0.0 && var10 <= 1.0 ? method_875(this.field_13 + var4 * var10, this.field_173 + var6 * var10, this.field_510 + var8 * var10) : null;
   }

   public Class47 method_697(Class47 var1, double var2) {
      double var4 = var1.field_13 - this.field_13;
      double var6 = var1.field_173 - this.field_173;
      double var8 = var1.field_510 - this.field_510;
      if (var6 * var6 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.field_173) / var6;
      return var10 >= 0.0 && var10 <= 1.0 ? method_875(this.field_13 + var4 * var10, this.field_173 + var6 * var10, this.field_510 + var8 * var10) : null;
   }

   public Class47 method_992(Class47 var1, double var2) {
      double var4 = var1.field_13 - this.field_13;
      double var6 = var1.field_173 - this.field_173;
      double var8 = var1.field_510 - this.field_510;
      if (var8 * var8 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.field_510) / var8;
      return var10 >= 0.0 && var10 <= 1.0 ? method_875(this.field_13 + var4 * var10, this.field_173 + var6 * var10, this.field_510 + var8 * var10) : null;
   }

   @Override
   public String toString() {
      return "(" + this.field_13 + ", " + this.field_173 + ", " + this.field_510 + ")";
   }
}
