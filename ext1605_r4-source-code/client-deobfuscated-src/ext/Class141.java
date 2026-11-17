package ext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class141 {
   public static boolean method_1841(String var0) {
      try {
         Class.forName(var0);
         return true;
      } catch (ClassNotFoundException var2) {
         return false;
      }
   }

   public static Object method_1865(Object var0, String var1, Class[] var2, Object var3) {
      try {
         Method var4 = (var0 instanceof Class ? (Class)var0 : var0.getClass()).getMethod(var1, var2);
         return var4.invoke(var0 instanceof Class ? null : var0, var3);
      } catch (IllegalAccessException var5) {
         var5.printStackTrace();
      } catch (IllegalArgumentException var6) {
         var6.printStackTrace();
      } catch (InvocationTargetException var7) {
         var7.printStackTrace();
      } catch (NoSuchMethodException var8) {
         var8.printStackTrace();
      } catch (SecurityException var9) {
         var9.printStackTrace();
      }

      return null;
   }

   public static Object method_568(Object var0, String var1, Class var2) {
      try {
         return var0.getClass().getField(var1).get(var0);
      } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static Object method_1655(String var0, Class[] var1, Object... var2) {
      try {
         Class var3 = Class.forName(var0);
         Constructor var4 = var3.getConstructor(var1);
         return var4.newInstance(var2);
      } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static String method_1364(Object var0) {
      return var0.getClass().getName();
   }

   public static Class method_1633(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         var2.printStackTrace();
         return null;
      }
   }
}
