public class 1IB01KQyjWS5a9TP6Kq27AB3UW8T1N4ZuwCeRygqz9UMPy8Dxjb29L95Yf34Kg6gHVMuXVhd78kvLCFrNBHPWD09KOXep80CC
   extends 2UQBJP5xVBLvcOj4Zez1XaJembU13Cma9CKxz4KHBXDgtLvI3Q228ox61gusX4MQeIDyXmP4j3bUou3222GJ6BeabF38 {
   protected float[] 1svNgOD7VwC79ql8Ab9UzfF8D46rA021y0ms1p8xU9T5zY3xw9ZpMO1y5l2o = new float[320];
   protected float[] 9DRBfXVt5K7W37u6Ajl7cm67r78YQjAQ195BIs46746AC6b61UCABL0oy6eh = new float[320];

   public _IB01KQyjWS5a9TP6Kq27AB3UW8T1N4ZuwCeRygqz9UMPy8Dxjb29L95Yf34Kg6gHVMuXVhd78kvLCFrNBHPWD09KOXep80CC/* $VF was: 1IB01KQyjWS5a9TP6Kq27AB3UW8T1N4ZuwCeRygqz9UMPy8Dxjb29L95Yf34Kg6gHVMuXVhd78kvLCFrNBHPWD09KOXep80CC */(
      int var1
   ) {
      super(
         1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.5P0gbq1QR95V381vsU1YW37ky63wbm4kYI9hdNi97J2K2578j94T1ly7HaX4
               .9Jh5mk8D5l9P2bI8Lv7m90647ug7tSSFv7qK59d4IjI9GQxu4G3jcaZl5w41
            + var1 * 16
      );
   }

   @Override
   public void _8ejD45Q8LEgM39W23b9PS53H72qux6CoqBH3EmIU8XRRLm3446Q9e3d4IQv/* $VF was: 88ejD45Q8LEgM39W23b9PS53H72qux6CoqBH3EmIU8XRRLm3446Q9e3d4IQv */() {
      if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip.4ZJzjV4ZUIoAEZm80Eg9UZ6ydiptq3Q0W2umW7h3bRHqfDcd45vw553X6qt7
               .5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn
               .21n1Yc74v7G6eY24T7KSj34XifI3R56mzeD6BEe0SmDhkmylgeGogGH3s6Mb
            != 2
         || this.88024hG6da4f4kcVfOqR8cTJ36RtCs13wB6V30Rs17vqAj14F4Cqz3neFg20) {
         this.88024hG6da4f4kcVfOqR8cTJ36RtCs13wB6V30Rs17vqAj14F4Cqz3neFg20 = false;

         for (int var5 = 0; var5 < 16; var5++) {
            for (int var1 = 0; var1 < 20; var1++) {
               int var6 = 18;
               float var2 = this.1svNgOD7VwC79ql8Ab9UzfF8D46rA021y0ms1p8xU9T5zY3xw9ZpMO1y5l2o[var5 + (var1 + 1) % 20 * 16] * var6;

               for (int var3 = var5 - 1; var3 <= var5 + 1; var3++) {
                  for (int var4 = var1; var4 <= var1 + 1; var4++) {
                     if (var3 >= 0 && var4 >= 0 && var3 < 16 && var4 < 20) {
                        var2 += this.1svNgOD7VwC79ql8Ab9UzfF8D46rA021y0ms1p8xU9T5zY3xw9ZpMO1y5l2o[var3 + var4 * 16];
                     }

                     var6++;
                  }
               }

               this.9DRBfXVt5K7W37u6Ajl7cm67r78YQjAQ195BIs46746AC6b61UCABL0oy6eh[var5 + var1 * 16] = var2 / (var6 * 1.06F);
               if (var1 >= 19) {
                  this.9DRBfXVt5K7W37u6Ajl7cm67r78YQjAQ195BIs46746AC6b61UCABL0oy6eh[var5 + var1 * 16] = (float)(
                     Math.random() * Math.random() * Math.random() * 4.0 + Math.random() * 0.1F + 0.2F
                  );
               }
            }
         }

         float[] var16 = this.9DRBfXVt5K7W37u6Ajl7cm67r78YQjAQ195BIs46746AC6b61UCABL0oy6eh;
         this.9DRBfXVt5K7W37u6Ajl7cm67r78YQjAQ195BIs46746AC6b61UCABL0oy6eh = this.1svNgOD7VwC79ql8Ab9UzfF8D46rA021y0ms1p8xU9T5zY3xw9ZpMO1y5l2o;
         this.1svNgOD7VwC79ql8Ab9UzfF8D46rA021y0ms1p8xU9T5zY3xw9ZpMO1y5l2o = var16;

         for (int var12 = 0; var12 < 256; var12++) {
            float var17 = this.1svNgOD7VwC79ql8Ab9UzfF8D46rA021y0ms1p8xU9T5zY3xw9ZpMO1y5l2o[var12] * 1.8F;
            if (var17 > 1.0F) {
               var17 = 1.0F;
            }

            if (var17 < 0.0F) {
               var17 = 0.0F;
            }

            int var14 = (int)(10.0F * var17 + 75.0F);
            int var15 = (int)(5.0F * var17 * 225.0F);
            int var7 = (int)(var17 * var17 * var17 * var17 * var17 * var17 * var17 * var17 * var17 * var17 * 255.0F);
            short var8 = 255;
            if (var17 < 0.5F) {
               var8 = 0;
            }

            float var13 = (var17 - 0.5F) * 2.0F;
            if (this.06P3mXenpD5L0FS19r771z79X4G6ToUmlYYq950W8EH6ukeiX4WQd6Wqr2uA) {
               int var9 = (var14 * 30 + var15 * 59 + var7 * 11) / 100;
               int var10 = (var14 * 30 + var15 * 70) / 100;
               int var11 = (var14 * 30 + var7 * 70) / 100;
               var14 = var9;
               var15 = var10;
               var7 = var11;
            }

            this.8hTHSC7rG7gfcnHOO1IR8LKJ5WbfgWP4DZy894U21YDCTVhNU4pMPGK2WT4D[var12 * 4 + 0] = (byte)var14;
            this.8hTHSC7rG7gfcnHOO1IR8LKJ5WbfgWP4DZy894U21YDCTVhNU4pMPGK2WT4D[var12 * 4 + 1] = (byte)var15;
            this.8hTHSC7rG7gfcnHOO1IR8LKJ5WbfgWP4DZy894U21YDCTVhNU4pMPGK2WT4D[var12 * 4 + 2] = (byte)var7;
            this.8hTHSC7rG7gfcnHOO1IR8LKJ5WbfgWP4DZy894U21YDCTVhNU4pMPGK2WT4D[var12 * 4 + 3] = (byte)var8;
         }
      }
   }
}
