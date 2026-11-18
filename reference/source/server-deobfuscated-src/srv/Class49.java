package srv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Class49 {
   public static final int field_1483 = 20;
   public static final int field_904 = 46;
   public final Class49.Inner296 field_848;
   public final double field_1124;
   public final double field_206;
   private static final List<Class49> field_940 = new ArrayList<>();

   public Class49(double var1, double var3, Class49.Inner296 var5) {
      this.field_1124 = var1;
      this.field_206 = var3;
      this.field_848 = var5;
   }

   public abstract boolean method_851(Random var1, Class317 var2, int var3, int var4);

   public abstract void method_824(Random var1);

   public int method_119() {
      return -1;
   }

   public static void method_114(Class49 var0) {
      field_940.add(var0);
   }

   public static Class49 method_748(double var0, double var2, Class49.Inner296 var4) {
      double var5 = Double.MAX_VALUE;
      Class49 var7 = null;

      for (Class49 var9 : field_940) {
         double var10 = Math.abs(var0 - var9.field_1124) + Math.abs(var2 - var9.field_206);
         if (var5 > var10) {
            var5 = var10;
            var7 = var9;
         }
      }

      return var7;
   }

   public static void method_411() {
      method_114(new Class251(0.2, 0.2, Class49.Inner296.field_372, 0));
      method_114(new Class251(0.3, 0.3, Class49.Inner296.field_372, 1));
      method_114(new Class251(0.4, 0.3, Class49.Inner296.field_372, 2));
      method_114(new Class251(0.2, 0.2, Class49.Inner296.field_145, 0));
      method_114(new Class251(0.1, 0.3, Class49.Inner296.field_976, 0));
      method_114(new Class77(0.15, 0.4, Class49.Inner296.field_976));
   }

   public static void method_950(Random var0) {
      for (Class49 var2 : field_940) {
         var2.method_824(var0);
      }
   }

   public enum Inner296 {
      field_372,
      field_145,
      field_976;

      public static Class49.Inner296[] method_158() {
         return (Class49.Inner296[])field_986.clone();
      }

      public static Class49.Inner296 method_476(String var0) {
         return Enum.valueOf(Class49.Inner296.class, var0);
      }
   }
}
