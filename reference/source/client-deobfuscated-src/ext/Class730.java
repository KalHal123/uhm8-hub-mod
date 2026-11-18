package ext;

import java.util.List;
import java.util.Random;
import org.lwjgl.input.Keyboard;

public class Class730 {
   public static Random field_1362 = new Random();
   public static boolean field_2746 = false;
   public static String field_2045 = "";
   public static Class396 field_7 = null;

   public static void method_857(Class354 var0, Class454 var1) {
      if (!var1.field_2994) {
         if (Class310.field_2783 && field_1362.nextInt(100) < 3) {
            method_1026(var0, var1);
         }

         if (field_1362.nextInt(100) > 94 || Keyboard.isKeyDown(207)) {
            method_1376((int)var0.field_1417, (int)var0.field_2013, var1);
         }
      }

      if (var0 == Class119.field_1519.field_2787) {
         Class119.field_1519.field_964.method_961();
      }
   }

   public static void method_83(Class454 var0) {
      if (field_2746 && (field_7 == null || field_7.field_2642 || field_7.field_1468 != var0)) {
         field_2746 = false;
         field_7 = null;
      }
   }

   public static void method_1026(Class354 var0, Class454 var1) {
      Class514 var2 = new Class514(var1);
      var2.field_2834 = true;
      int var3 = (int)(var0.field_1417 + (field_1362.nextBoolean() ? 1 : -1) * (20 + field_1362.nextInt(60)));
      int var4 = (int)var0.field_2654;
      int var5 = (int)(var0.field_2013 + (field_1362.nextBoolean() ? 1 : -1) * (20 + field_1362.nextInt(60)));

      while (var1.method_197(var3, var4, var5) != 0 || var1.method_197(var3, var4 + 1, var5) != 0) {
         var4++;
      }

      while (var1.method_197(var3, var4 - 1, var5) == 0) {
         var4--;
      }

      var2.method_172(var3, var4 + 2, var5);
      var1.method_1447(var2);
   }

   public static void method_174(Class354 var0, Class454 var1) {
      Class514 var2 = new Class514(var1);
      var2.field_2834 = true;
      int var3 = (int)var0.field_1417;
      int var4 = (int)var0.field_2654;
      int var5 = (int)var0.field_2013;
      var2.method_172(var3, var4 + 2, var5);
      var1.method_1447(var2);
   }

   public static Class396 method_626(double var0, double var2, double var4, Class454 var6) {
      Class396 var7 = new Class396(var6, (int)var6.method_1377());
      var7.method_253(var0, var2, var4, field_1362.nextFloat() * 360.0F, 0.0F);
      Class119.field_1519.field_2648.method_1447(var7);
      return var7;
   }

   public static void method_1376(int var0, int var1, Class454 var2) {
      if (!var2.field_2994 && !field_2746) {
         Random var3 = new Random();
         int var4 = var0 + 32 * (var3.nextInt(3) - 1);
         int var5 = var1 + 32 * (var3.nextInt(3) - 1);
         if (var4 == var0 && var5 == var1) {
            var5 += 32;
         }

         field_2045 = "Giant of " + Class273.method_1021(var2.field_482, var4 / 32, var5 / 32);
         field_7 = method_626(var4, 100.0, var5, var2);
         field_2746 = true;
      }
   }

   public static void method_24(Class396 var0) {
      field_2746 = false;
      field_7 = null;
      field_2045 = "";
   }

   public static void method_1055(Class354 var0, Class454 var1) {
      if (var1 instanceof Class262) {
         List var2 = ((Class262)var1).method_1732();
         if (var2 != null) {
            for (Class694 var4 : var2) {
               if (var4.method_1423(var0)) {
                  Class119.field_1276 = true;
                  Class119.field_1312 = var4;
                  Class119.field_845 = var0;
               }
            }
         }
      }

      if (var1 instanceof Class46) {
         int[] var14 = new int[]{0, 0, -1, 0, 1, 0, 0, -1, 0, 1, -1, -1, 1, 1, -1, 1, 1, -1};
         int var17 = (int)Math.floor(var0.field_1417);
         int var20 = (int)Math.ceil(var0.field_2654);
         int var5 = (int)Math.floor(var0.field_2013);
         ((Class404)var0).field_2587 = null;
         ((Class404)var0).field_2801 = null;

         for (int var6 = 0; var6 != var14.length / 2; var6++) {
            for (int var7 = -2; var7 != 1; var7++) {
               int var8 = var17 + var14[var6 * 2];
               int var9 = var20 + var7;
               int var10 = var5 + var14[var6 * 2 + 1];
               int var11 = ((Class46)var1).method_197(var8, var9, var10);
               if (var11 != 0) {
                  Class108 var12 = Class108.field_1221[var11];
                  if (var12 instanceof Interface612) {
                     int var13 = ((Interface612)var12).method_1809();
                     if (var13 != -1) {
                        ((Class404)var0).field_2587 = (Interface612)var12;
                        ((Class404)var0).field_2801 = new Class326(var8, var9, var10);
                     }
                  }
               }
            }
         }

         ((Class46)var1).method_799(var0);
      }

      for (Class694 var18 : var1.field_1986) {
         if (var18.method_1423(var0)) {
            Class119.field_1276 = true;
            Class119.field_1312 = var18;
            Class119.field_845 = var0;
         }
      }

      if (!var1.field_2994
         && var1.field_1535 != 0
         && !(var1 instanceof Class46)
         && !(var1 instanceof Class262)
         && var0.field_2875 <= 0L
         && var0 instanceof Class563
         && field_1362.nextInt(100) < 5) {
         Class326 var16 = new Class326((long)var0.field_1417, (long)var0.field_2654, (long)var0.field_2013);
         long var19 = var1.field_2075 % 24000L;
         if (var1.method_1154((int)var16.field_809, (int)var16.field_805, (int)var16.field_3039) < 0.2 && var19 >= 14000L && var19 <= 22800L) {
            Class137 var21 = new Class137(var1);
            var21.method_172(var16.field_809, var16.field_805 + 2L, var16.field_3039);
            var1.method_1447(var21);
            var1.method_1904(var0, "ext.obvr_spawn", 1.0F, 1.0F);
            var0.field_2875 = 5500L;
         }
      }
   }
}
