package srv;

public class Class380 {
   private static float[] field_1170 = new float[65536];

   public static final float method_241(float var0) {
      return field_1170[(int)(var0 * 10430.378F) & 65535];
   }

   public static final float method_520(float var0) {
      return field_1170[(int)(var0 * 10430.378F + 16384.0F) & 65535];
   }

   public static final float method_557(float var0) {
      return (float)Math.sqrt(var0);
   }

   public static final float method_164(double var0) {
      return (float)Math.sqrt(var0);
   }

   public static int method_827(float var0) {
      int var1 = (int)var0;
      return var0 < var1 ? var1 - 1 : var1;
   }

   public static int method_502(double var0) {
      int var2 = (int)var0;
      return var0 < var2 ? var2 - 1 : var2;
   }

   public static float method_44(float var0) {
      return var0 >= 0.0F ? var0 : -var0;
   }

   public static double method_774(double var0, double var2) {
      if (var0 < 0.0) {
         var0 = -var0;
      }

      if (var2 < 0.0) {
         var2 = -var2;
      }

      return var0 > var2 ? var0 : var2;
   }

   static {
      for (int var0 = 0; var0 < 65536; var0++) {
         field_1170[var0] = (float)Math.sin(var0 * Math.PI * 2.0 / 65536.0);
      }
   }
}
