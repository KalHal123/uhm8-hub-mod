import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 1qcx767hJMswx2G8a8rUVA7nXR8mott3As0B864hxZSx5c62gcj9i9TZ52jkJ00eEq8jDscE5KNOwcMhXf0l6Svy9XS9Hub4dtlG {
   public static boolean _LzmPa5dA62V89QZKR22H5VGgRTp0X11P2VLEFJw8tG0V8ig4m3CezjA515g/* $VF was: 9LzmPa5dA62V89QZKR22H5VGgRTp0X11P2VLEFJw8tG0V8ig4m3CezjA515g */(
      String var0
   ) {
      try {
         Class.forName(var0);
         return true;
      } catch (ClassNotFoundException var2) {
         return false;
      }
   }

   public static Object _Uru1FW89ta6z8a2n5ZS0zZels0ZLixz72YO2Rq9k20H9W7ISBGNQrOp5tUL/* $VF was: 9Uru1FW89ta6z8a2n5ZS0zZels0ZLixz72YO2Rq9k20H9W7ISBGNQrOp5tUL */(
      Object var0, String var1, Class[] var2, Object var3
   ) {
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

   public static Object _sP41C90YSw231vS4Sul8rx8y4GR4vNXfc1q37JKFf4KkR7Cq1r65e4xa8YC/* $VF was: 2sP41C90YSw231vS4Sul8rx8y4GR4vNXfc1q37JKFf4KkR7Cq1r65e4xa8YC */(
      Object var0, String var1, Class var2
   ) {
      try {
         return var0.getClass().getField(var1).get(var0);
      } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static Object _MQ29480EaG6CorgpSaZf21csO2ec6Fx33YHpLEuXSz7265VcVqhVEck52XJ/* $VF was: 8MQ29480EaG6CorgpSaZf21csO2ec6Fx33YHpLEuXSz7265VcVqhVEck52XJ */(
      String var0, Class[] var1, Object... var2
   ) {
      try {
         Class var3 = Class.forName(var0);
         Constructor var4 = var3.getConstructor(var1);
         return var4.newInstance(var2);
      } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static String _1s752so86DwU77rXlw1cHR51hpLewQ9ESrHcQon430rMgQXErcroRxA09ph/* $VF was: 71s752so86DwU77rXlw1cHR51hpLewQ9ESrHcQon430rMgQXErcroRxA09ph */(
      Object var0
   ) {
      return var0.getClass().getName();
   }

   public static Class _Ehd0r9aAHEF32cGHok0smD4vA0B3N9Qx96zs8VmDa6dhPs1YF2JWfDn7x46/* $VF was: 8Ehd0r9aAHEF32cGHok0smD4vA0B3N9Qx96zs8VmDa6dhPs1YF2JWfDn7x46 */(
      String var0
   ) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         var2.printStackTrace();
         return null;
      }
   }
}
