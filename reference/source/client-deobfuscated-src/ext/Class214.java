package ext;

import java.util.ArrayList;
import java.util.List;

public class Class214 {
   private static List<Class214> field_2102 = new ArrayList<>();
   private static int field_2139 = 0;
   public double field_882;
   public double field_1911;
   public double field_3045;

   public static Class214 method_1914(double var0, double var2, double var4) {
      return new Class214(var0, var2, var4);
   }

   public static void method_1593() {
      field_2139 = 0;
   }

   public static Class214 method_701(double var0, double var2, double var4) {
      if (field_2139 >= field_2102.size()) {
         field_2102.add(method_1914(0.0, 0.0, 0.0));
      }

      return field_2102.get(field_2139++).method_400(var0, var2, var4);
   }

   private Class214(double var1, double var3, double var5) {
      if (var1 == -0.0) {
         var1 = 0.0;
      }

      if (var3 == -0.0) {
         var3 = 0.0;
      }

      if (var5 == -0.0) {
         var5 = 0.0;
      }

      this.field_882 = var1;
      this.field_1911 = var3;
      this.field_3045 = var5;
   }

   private Class214 method_400(double var1, double var3, double var5) {
      this.field_882 = var1;
      this.field_1911 = var3;
      this.field_3045 = var5;
      return this;
   }

   public Class214 method_779(Class214 var1) {
      return method_701(var1.field_882 - this.field_882, var1.field_1911 - this.field_1911, var1.field_3045 - this.field_3045);
   }

   public Class214 method_341() {
      double var1 = Class469.method_822(this.field_882 * this.field_882 + this.field_1911 * this.field_1911 + this.field_3045 * this.field_3045);
      return var1 < 1.0E-4 ? method_701(0.0, 0.0, 0.0) : method_701(this.field_882 / var1, this.field_1911 / var1, this.field_3045 / var1);
   }

   public Class214 method_1150(Class214 var1) {
      return method_701(
         this.field_1911 * var1.field_3045 - this.field_3045 * var1.field_1911,
         this.field_3045 * var1.field_882 - this.field_882 * var1.field_3045,
         this.field_882 * var1.field_1911 - this.field_1911 * var1.field_882
      );
   }

   public Class214 method_1750(double var1, double var3, double var5) {
      return method_701(this.field_882 + var1, this.field_1911 + var3, this.field_3045 + var5);
   }

   public double method_562(Class214 var1) {
      double var2 = var1.field_882 - this.field_882;
      double var4 = var1.field_1911 - this.field_1911;
      double var6 = var1.field_3045 - this.field_3045;
      return Class469.method_822(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double method_563(Class214 var1) {
      double var2 = var1.field_882 - this.field_882;
      double var4 = var1.field_1911 - this.field_1911;
      double var6 = var1.field_3045 - this.field_3045;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double method_169(double var1, double var3, double var5) {
      double var7 = var1 - this.field_882;
      double var9 = var3 - this.field_1911;
      double var11 = var5 - this.field_3045;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double method_1891() {
      return Class469.method_822(this.field_882 * this.field_882 + this.field_1911 * this.field_1911 + this.field_3045 * this.field_3045);
   }

   public Class214 method_320(Class214 var1, double var2) {
      double var4 = var1.field_882 - this.field_882;
      double var6 = var1.field_1911 - this.field_1911;
      double var8 = var1.field_3045 - this.field_3045;
      if (var4 * var4 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.field_882) / var4;
      return var10 >= 0.0 && var10 <= 1.0 ? method_701(this.field_882 + var4 * var10, this.field_1911 + var6 * var10, this.field_3045 + var8 * var10) : null;
   }

   public Class214 method_29(Class214 var1, double var2) {
      double var4 = var1.field_882 - this.field_882;
      double var6 = var1.field_1911 - this.field_1911;
      double var8 = var1.field_3045 - this.field_3045;
      if (var6 * var6 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.field_1911) / var6;
      return var10 >= 0.0 && var10 <= 1.0 ? method_701(this.field_882 + var4 * var10, this.field_1911 + var6 * var10, this.field_3045 + var8 * var10) : null;
   }

   public Class214 method_965(Class214 var1, double var2) {
      double var4 = var1.field_882 - this.field_882;
      double var6 = var1.field_1911 - this.field_1911;
      double var8 = var1.field_3045 - this.field_3045;
      if (var8 * var8 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.field_3045) / var8;
      return var10 >= 0.0 && var10 <= 1.0 ? method_701(this.field_882 + var4 * var10, this.field_1911 + var6 * var10, this.field_3045 + var8 * var10) : null;
   }

   @Override
   public String toString() {
      return "(" + this.field_882 + ", " + this.field_1911 + ", " + this.field_3045 + ")";
   }

   public void method_31(float var1) {
      float var2 = Class469.method_255(var1);
      float var3 = Class469.method_1667(var1);
      double var4 = this.field_882;
      double var6 = this.field_1911 * var2 + this.field_3045 * var3;
      double var8 = this.field_3045 * var2 - this.field_1911 * var3;
      this.field_882 = var4;
      this.field_1911 = var6;
      this.field_3045 = var8;
   }

   public void method_1615(float var1) {
      float var2 = Class469.method_255(var1);
      float var3 = Class469.method_1667(var1);
      double var4 = this.field_882 * var2 + this.field_3045 * var3;
      double var6 = this.field_1911;
      double var8 = this.field_3045 * var2 - this.field_882 * var3;
      this.field_882 = var4;
      this.field_1911 = var6;
      this.field_3045 = var8;
   }
}
