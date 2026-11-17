public class 5t78bjRYk0fi1yaf7z3x8U13h4eev2t4rjz0b1ldW6157a5RnUXxo75a0MwN32lv961oZ9qzC8R65xSGg9OE86P22SYrvn {
   private static float[] 5BF5utu782268y1UozGmQw3IztmrO265Xsseichr87ITaCJs4siaKLP0ns7w = new float[65536];

   public static final float _Q0rmEh0J3viHS03YD2yB0d94U7H4EG1h6T7M5wAvjX290TsPr9Qkjs8oy0m/* $VF was: 8Q0rmEh0J3viHS03YD2yB0d94U7H4EG1h6T7M5wAvjX290TsPr9Qkjs8oy0m */(
      float var0
   ) {
      return 5BF5utu782268y1UozGmQw3IztmrO265Xsseichr87ITaCJs4siaKLP0ns7w[(int)(var0 * 10430.378F) & 65535];
   }

   public static final float _724kYgc5e55Yw1mK1EZTYO084n57BWWaYUE7iquVDiu4hFo5J70Cori9WLs/* $VF was: 1724kYgc5e55Yw1mK1EZTYO084n57BWWaYUE7iquVDiu4hFo5J70Cori9WLs */(
      float var0
   ) {
      return 5BF5utu782268y1UozGmQw3IztmrO265Xsseichr87ITaCJs4siaKLP0ns7w[(int)(var0 * 10430.378F + 16384.0F) & 65535];
   }

   public static final float _6rNbm1G575TM9A9h7j014oqZHvu9Ir1k78lT8PEr0QJ1n6aojOsu51ajS06/* $VF was: 16rNbm1G575TM9A9h7j014oqZHvu9Ir1k78lT8PEr0QJ1n6aojOsu51ajS06 */(
      float var0
   ) {
      return (float)Math.sqrt(var0);
   }

   public static final float _8R8M9FFhsBIY68vt7IS52zhVjyvvY9wGZfJ33uoRf1Q6ATOzCKe9q315nbB/* $VF was: 48R8M9FFhsBIY68vt7IS52zhVjyvvY9wGZfJ33uoRf1Q6ATOzCKe9q315nbB */(
      double var0
   ) {
      return (float)Math.sqrt(var0);
   }

   public static int _Z5V2wE94UinD2GL18x444Kr43qN1gTxK8Wx25Ky4rsh31tfr83W3D6XmAuz/* $VF was: 4Z5V2wE94UinD2GL18x444Kr43qN1gTxK8Wx25Ky4rsh31tfr83W3D6XmAuz */(
      float var0
   ) {
      int var1 = (int)var0;
      return var0 < var1 ? var1 - 1 : var1;
   }

   public static int _IE1iL5T3Q39d1dd737s8V13Ag4WxCVdwkXpL40J2e3apcTZ7gqF43NoocHG/* $VF was: 2IE1iL5T3Q39d1dd737s8V13Ag4WxCVdwkXpL40J2e3apcTZ7gqF43NoocHG */(
      double var0
   ) {
      int var2 = (int)var0;
      return var0 < var2 ? var2 - 1 : var2;
   }

   public static float _1ISDl4gPc9Fk0C2Kj3oEr2CUJmxr50GP2V4kXkAyryW5TB554YLltsq7e3C/* $VF was: 71ISDl4gPc9Fk0C2Kj3oEr2CUJmxr50GP2V4kXkAyryW5TB554YLltsq7e3C */(
      float var0
   ) {
      return var0 >= 0.0F ? var0 : -var0;
   }

   public static double _woc0dX4WW97M3nGQ93m8ICV7Rdsb7b95yhfJbULu28v9TX395F046IJx0N1/* $VF was: 5woc0dX4WW97M3nGQ93m8ICV7Rdsb7b95yhfJbULu28v9TX395F046IJx0N1 */(
      double var0, double var2
   ) {
      if (var0 < 0.0) {
         var0 = -var0;
      }

      if (var2 < 0.0) {
         var2 = -var2;
      }

      return var0 > var2 ? var0 : var2;
   }

   public static int _Do39mO2zdiYoblU9m4JYO2y6wvexS86s6ULOG2efI9E4Np93Yvn182RGDgO/* $VF was: 6Do39mO2zdiYoblU9m4JYO2y6wvexS86s6ULOG2efI9E4Np93Yvn182RGDgO */(
      int var0, int var1
   ) {
      return var0 < 0 ? -((-var0 - 1) / var1) - 1 : var0 / var1;
   }

   static {
      for (int var0 = 0; var0 < 65536; var0++) {
         5BF5utu782268y1UozGmQw3IztmrO265Xsseichr87ITaCJs4siaKLP0ns7w[var0] = (float)Math.sin(var0 * Math.PI * 2.0 / 65536.0);
      }
   }
}
