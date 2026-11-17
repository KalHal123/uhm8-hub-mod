package srv;

import java.io.IOException;
import java.io.InputStream;

public class Class156 {
   private static final String[] field_215 = new String[]{
      "SIE",
      "LOH",
      "KII",
      "HUR",
      "MIS",
      "RUU",
      "VY",
      "KA",
      "TAV",
      "OLE",
      "PAH",
      "MUI",
      "MAT",
      "JA",
      "SAU",
      "NIN",
      "UD",
      "MU",
      "NGI",
      "BAR",
      "LUG",
      "MAH",
      "GIR",
      "AK",
      "USU",
      "ESE",
      "IRU",
      "UUN",
      "AMTU",
      "AGAS",
      "HI",
      "TOOI",
      "YORU",
      "NEN",
      "PON",
      "ONNA",
      "TSU",
      "YA",
      "AO",
      "ONI",
      "AN",
      "KO",
      "SHI",
      "YUME",
      "YARI",
      "TEST"
   };

   public static float[] method_244(float var0, float var1, float var2, float var3) {
      float var4 = 0.58431375F;
      float var5 = 0.0F;
      float var6 = 1.0F;
      return new float[]{var0 * var4 + (1.0F - var0) * var1, var0 * var5 + (1.0F - var0) * var2, var0 * var6 + (1.0F - var0) * var3};
   }

   public static float[] method_755(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      return new float[]{var0 * var4 + (1.0F - var0) * var1, var0 * var5 + (1.0F - var0) * var2, var0 * var6 + (1.0F - var0) * var3};
   }

   public static int method_859(int var0, int var1) {
      return (int)Math.floor((float)var0 / var1);
   }

   public static boolean method_985(int var0) {
      return var0 == 0
         || var0 == Class371.field_314.field_1379
         || var0 == Class371.field_292.field_1379
         || var0 == Class371.field_49.field_1379
         || var0 == Class371.field_1595.field_1379
         || var0 == Class371.field_527.field_1379
         || var0 == Class371.field_86.field_1379
         || var0 == Class371.field_1103.field_1379
         || var0 == Class371.field_1051.field_1379
         || var0 == Class371.field_831.field_1379;
   }

   public static double method_173(double var0, double var2) {
      double var4 = Math.abs(var2 - var0) % 360.0;
      return var4 > 180.0 ? 360.0 - var4 : var4;
   }

   public static boolean method_425(Class317 var0, int var1, double var2, double var4, double var6, double var8, double var10, double var12) {
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
         if (var0.method_813((int)var28, (int)var30, (int)var32) != 0) {
            return true;
         }
      }

      return false;
   }

   public static int method_256(InputStream var0, byte[] var1, int var2, int var3) throws IOException {
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

   public static void method_773() {
      new Exception().printStackTrace();
   }

   public static String method_729(long var0, int var2, int var3) {
      long var4 = var2 + 392214;
      long var6 = var3 + 392214;
      long var8 = var6 * 784428L + var4;
      long var10 = var0 + var8;
      int var12 = (int)Math.sqrt(var2 * var2 + var3 * var3);
      int var13 = 0;
      byte var14 = 3;

      for (int var15 = var12; var15 / var14 > 0; var14 *= 4) {
         var13++;
      }

      String var16 = "";
      if (var13 > 0) {
         for (int var17 = 0; var17 != var13; var17++) {
            var16 = var16 + field_215[(int)((var12 + var13 + var14 + var8 * (2 + var17)) % 45L)];
         }

         var16 = var16 + "-";
      }

      var16 = var16 + field_215[(int)((var8 * 2L + var12) % 45L)];
      var16 = var16 + field_215[(int)((var8 * 3L + var12) % 45L)];
      return var16 + field_215[(int)((var8 * 4L + var12) % 45L)];
   }
}
