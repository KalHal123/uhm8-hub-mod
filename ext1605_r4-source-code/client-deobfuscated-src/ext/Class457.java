package ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Class457 {
   public static final int field_2481 = 20;
   public static final int field_1282 = 46;
   public final Class457.Inner598 field_2015;
   public final double field_772;
   public final double field_788;
   private static final List<Class457> field_588 = new ArrayList<>();

   public Class457(double var1, double var3, Class457.Inner598 var5) {
      this.field_772 = var1;
      this.field_788 = var3;
      this.field_2015 = var5;
   }

   public abstract boolean method_1583(Random var1, Class454 var2, int var3, int var4);

   public abstract void method_73(Random var1);

   public int method_1691() {
      return -1;
   }

   public static void method_1806(Class457 var0) {
      field_588.add(var0);
   }

   public static Class457 method_525(double var0, double var2, Class457.Inner598 var4) {
      double var5 = Double.MAX_VALUE;
      Class457 var7 = null;

      for (Class457 var9 : field_588) {
         double var10 = Math.abs(var0 - var9.field_772) + Math.abs(var2 - var9.field_788);
         if (var5 > var10) {
            var5 = var10;
            var7 = var9;
         }
      }

      return var7;
   }

   public static void method_1917() {
      method_1806(new Class12(0.2, 0.2, Class457.Inner598.field_2556, 0));
      method_1806(new Class12(0.3, 0.3, Class457.Inner598.field_2556, 1));
      method_1806(new Class12(0.4, 0.3, Class457.Inner598.field_2556, 2));
      method_1806(new Class12(0.2, 0.2, Class457.Inner598.field_2018, 0));
      method_1806(new Class12(0.1, 0.3, Class457.Inner598.field_240, 0));
      method_1806(new Class507(0.15, 0.4, Class457.Inner598.field_240));
   }

   public static void method_1836(Random var0) {
      for (Class457 var2 : field_588) {
         var2.method_73(var0);
      }
   }

   public enum Inner598 {
      field_2556,
      field_2018,
      field_240;

      public static Class457.Inner598[] method_1206() {
         return (Class457.Inner598[])field_1154.clone();
      }

      public static Class457.Inner598 method_129(String var0) {
         return Enum.valueOf(Class457.Inner598.class, var0);
      }
   }
}
