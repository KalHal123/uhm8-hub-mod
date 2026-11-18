package ext;

public class Class469 {
   private static float[] field_1725 = new float[65536];

   public static final float method_1667(float var0) {
      return field_1725[(int)(var0 * 10430.378F) & 65535];
   }

   public static final float method_255(float var0) {
      return field_1725[(int)(var0 * 10430.378F + 16384.0F) & 65535];
   }

   public static final float method_254(float var0) {
      return (float)Math.sqrt(var0);
   }

   public static final float method_822(double var0) {
      return (float)Math.sqrt(var0);
   }

   public static int method_893(float var0) {
      int var1 = (int)var0;
      return var0 < var1 ? var1 - 1 : var1;
   }

   public static int method_468(double var0) {
      int var2 = (int)var0;
      return var0 < var2 ? var2 - 1 : var2;
   }

   public static float method_1362(float var0) {
      return var0 >= 0.0F ? var0 : -var0;
   }

   public static double method_1146(double var0, double var2) {
      if (var0 < 0.0) {
         var0 = -var0;
      }

      if (var2 < 0.0) {
         var2 = -var2;
      }

      return var0 > var2 ? var0 : var2;
   }

   public static int method_1231(int var0, int var1) {
      return var0 < 0 ? -((-var0 - 1) / var1) - 1 : var0 / var1;
   }

   static {
      for (int var0 = 0; var0 < 65536; var0++) {
         field_1725[var0] = (float)Math.sin(var0 * Math.PI * 2.0 / 65536.0);
      }
   }
}
