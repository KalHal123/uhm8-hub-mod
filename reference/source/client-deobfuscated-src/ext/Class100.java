package ext;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.minecraft.client.Minecraft;

public class Class100 {
   public static List<String> field_1534 = Arrays.asList(
      "file://C:/skincache/", "https://raw.githubusercontent.com/exalpha-dev/exalpha-dev.github.io/main/skincache/"
   );

   public static float method_640(float var0) {
      return (var0 - 1.0F) * (var0 - 1.0F) * (var0 - 1.0F) + 1.0F;
   }

   @Deprecated
   public static float[] method_1084(float var0, float var1, float var2, float var3) {
      float var4 = 0.58431375F;
      float var5 = 0.0F;
      float var6 = 1.0F;
      return new float[]{var0 * var4 + (1.0F - var0) * var1, var0 * var5 + (1.0F - var0) * var2, var0 * var6 + (1.0F - var0) * var3};
   }

   public static float[] method_1493(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      return new float[]{var0 * var1 + (1.0F - var0) * var4, var0 * var2 + (1.0F - var0) * var5, var0 * var3 + (1.0F - var0) * var6};
   }

   public static boolean method_815(int var0) {
      return var0 == 0
         || var0 == Class108.field_316.field_2151
         || var0 == Class108.field_3124.field_2151
         || var0 == Class108.field_2060.field_2151
         || var0 == Class108.field_1070.field_2151
         || var0 == Class108.field_1120.field_2151
         || var0 == Class108.field_1371.field_2151
         || var0 == Class108.field_1423.field_2151
         || var0 == Class108.field_536.field_2151
         || var0 == Class108.field_1128.field_2151;
   }

   public static double method_1136(double var0, double var2) {
      double var4 = Math.abs(var2 - var0) % 360.0;
      return var4 > 180.0 ? 360.0 - var4 : var4;
   }

   public static boolean method_1792(Class454 var0, int var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      double var14 = Math.sqrt(Math.pow(var8 - var2, 2.0) + Math.pow(var10 - var4, 2.0) + Math.pow(var12 - var6, 2.0));
      if (var14 > var1) {
         return false;
      }

      double var16 = var8 - var2;
      double var18 = var10 - var4;
      double var20 = var12 - var6;
      double var22 = Math.sqrt(var16 * var16 + var18 * var18 + var20 * var20);
      double var24 = 0.1;

      for (double var26 = 0.0; var26 < var22; var26 += var24) {
         double var28 = var2 + var26 * var16 / var22;
         double var30 = var4 + var26 * var18 / var22;
         double var32 = var6 + var26 * var20 / var22;
         if (var0.method_197((int)var28, (int)var30, (int)var32) != 0) {
            return true;
         }
      }

      return false;
   }

   public static int method_1044(InputStream var0, byte[] var1, int var2, int var3) throws IOException {
      int var4 = 0;

      while (var4 < var3) {
         int var5 = var0.read(var1, var2 + var4, var3 - var4);
         if (var5 < 0) {
            break;
         }

         var4 += var5;
      }

      return var4;
   }

   public static void method_1009(Class454 var0, Class326 var1, Class326 var2, int var3) {
      method_1431(var0, var1, var2, var3, -1);
   }

   public static void method_1431(Class454 var0, Class326 var1, Class326 var2, int var3, int var4) {
      if (var0.field_2994) {
         ((Class118)Class119.field_1519.field_3103).field_442.method_1519(new Class603(var1, var2, var3));
      } else {
         long var5 = var1.field_809 > var2.field_809 ? var2.field_809 : var1.field_809;
         long var7 = var1.field_809 > var2.field_809 ? var1.field_809 : var2.field_809;
         long var9 = var1.field_805 > var2.field_805 ? var2.field_805 : var1.field_805;
         long var11 = var1.field_805 > var2.field_805 ? var1.field_805 : var2.field_805;
         long var13 = var1.field_3039 > var2.field_3039 ? var2.field_3039 : var1.field_3039;
         long var15 = var1.field_3039 > var2.field_3039 ? var1.field_3039 : var2.field_3039;

         for (long var17 = var5; var17 <= var7; var17++) {
            for (long var19 = var9; var19 <= var11; var19++) {
               for (long var21 = var13; var21 <= var15; var21++) {
                  if (var4 == -1 || (var17 + var21 % 2L) % 2L != 0L && var21 % 2L != 0L) {
                     method_522(var0, var17, var19, var21, var3);
                  } else {
                     method_522(var0, var17, var19, var21, var4);
                  }
               }
            }
         }
      }
   }

   public static void method_522(Class454 var0, long var1, long var3, long var5, int var7) {
      var0.method_1481((int)var1, (int)var3, (int)var5, var7);
      if (var0.field_2994 && Class119.field_1519 != null && Class119.field_1519.field_3103 instanceof Class118) {
         ((Class118)Class119.field_1519.field_3103).field_442.method_1519(new Class589(var7, (int)var1, (int)var3, (int)var5, 10));
      }
   }

   public static boolean method_1509(Class454 var0, Class326 var1, Enum37 var2, int var3) {
      Class326 var4 = var1;

      for (int var5 = 0; var5 != var3; var5++) {
         var4 = var4.method_113(new Class326(1L, 0L, 0L).method_1590(var2));
         if (var0.method_197((int)var4.field_809, (int)var4.field_805, (int)var4.field_3039) != 0) {
            return false;
         }
      }

      return true;
   }

   public static void method_1745() {
      new Exception().printStackTrace();
   }

   public static int method_1663(int var0, int var1, int var2) {
      return var0 << 11 | var2 << 7 | var1;
   }

   public static URL method_1854(String var0) {
      if (Minecraft.field_1305) {
         try {
            return new URL("file:///" + Minecraft.field_2719 + "/" + var0);
         } catch (MalformedURLException var2) {
            Class597.method_883(var2.getMessage());
            System.exit(-1);
            return null;
         }
      } else {
         return Class100.class.getResource(var0);
      }
   }

   public static InputStream method_1145(String var0) {
      if (Minecraft.field_1305) {
         try {
            return new FileInputStream(new File(Minecraft.field_2719 + "/" + var0));
         } catch (FileNotFoundException var7) {
            try {
               if (var0.startsWith("/")) {
                  var0 = var0.substring(1);
               }

               ZipFile var2 = new ZipFile(new File(System.getProperty("user.dir") + "/../lib/client/minecraft.jar"));
               ZipEntry var3 = var2.getEntry(var0);
               InputStream var4 = var2.getInputStream(var3);
               byte[] var5 = new byte[(int)var3.getSize()];
               method_1044(var4, var5, 0, (int)var3.getSize());
               var2.close();
               return new ByteArrayInputStream(var5);
            } catch (Exception var6) {
               var6.printStackTrace();
               System.exit(-1);
               return null;
            }
         }
      } else {
         return Class100.class.getResourceAsStream(var0);
      }
   }

   public static int method_465(int var0, int var1, int var2) {
      return var0 > var2 ? var2 : (var0 < var1 ? var1 : var0);
   }

   public static String method_1040(byte[] var0) {
      StringBuilder var1 = new StringBuilder(2 * var0.length);

      for (int var2 = 0; var2 < var0.length; var2++) {
         String var3 = Integer.toHexString(255 & var0[var2]);
         if (var3.length() == 1) {
            var1.append('0');
         }

         var1.append(var3);
      }

      return var1.toString();
   }

   public static int method_1640(int var0, int var1) {
      return (int)Math.floor((float)var0 / var1);
   }

   public static String method_802(String var0) {
      Class var1 = Class141.method_1633("java.security.MessageDigest");
      Object var2 = Class141.method_1865(var1, "getInstance", new Class[]{String.class}, "SHA-256");
      Object var3 = Class141.method_1865(var2, "digest", new Class[]{byte[].class}, var0.getBytes(StandardCharsets.UTF_8));
      return (String)Class141.method_1865(Class100.class, "bytesToHex", new Class[]{byte[].class}, var3);
   }

   public static void method_838(Class454 var0, Class326 var1, Class326 var2, int var3, int var4) {
      if (!var0.field_2994) {
         long var5 = var1.field_809 > var2.field_809 ? var2.field_809 : var1.field_809;
         long var7 = var1.field_809 > var2.field_809 ? var1.field_809 : var2.field_809;
         long var9 = var1.field_805 > var2.field_805 ? var2.field_805 : var1.field_805;
         long var11 = var1.field_805 > var2.field_805 ? var1.field_805 : var2.field_805;
         long var13 = var1.field_3039 > var2.field_3039 ? var2.field_3039 : var1.field_3039;
         long var15 = var1.field_3039 > var2.field_3039 ? var1.field_3039 : var2.field_3039;

         for (long var17 = var5; var17 <= var7; var17++) {
            for (long var19 = var9; var19 <= var11; var19++) {
               for (long var21 = var13; var21 <= var15; var21++) {
                  if (var0.method_197((int)var17, (int)var19, (int)var21) == var3) {
                     method_522(var0, var17, var19, var21, var4);
                  }
               }
            }
         }
      }
   }
}
