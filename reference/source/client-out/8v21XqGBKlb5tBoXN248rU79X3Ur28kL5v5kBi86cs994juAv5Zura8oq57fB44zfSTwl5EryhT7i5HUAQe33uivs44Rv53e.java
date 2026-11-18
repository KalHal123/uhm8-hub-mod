public class 8v21XqGBKlb5tBoXN248rU79X3Ur28kL5v5kBi86cs994juAv5Zura8oq57fB44zfSTwl5EryhT7i5HUAQe33uivs44Rv53e
   extends 2UQBJP5xVBLvcOj4Zez1XaJembU13Cma9CKxz4KHBXDgtLvI3Q228ox61gusX4MQeIDyXmP4j3bUou3222GJ6BeabF38 {
   protected float[] 8FS3Ncp2JbVavISpIUz9iIn9ODk7wV141cO1Q5g0ODSrg3L0vRA5DMc7iM6H = new float[256];
   protected float[] 79JZCJAD8GYec7s6mK8819gjqE9g93I84TXN3s9ALWgQP5I81w48Xj252TR9 = new float[256];
   protected float[] 2F86OI73u4EOlkhobJ73Bg83W7dq9sMKxd4926nfRj1jvL1p6226M0rrrhi4 = new float[256];
   protected float[] 345q09Qa9N8d00XmAeoUALq1XNvGoaGH17466gdKgKEPIPFEHjfUl1I549qv = new float[256];
   private int 9ZYVu9Qp113TX8tpXTT5VQv4YWsb18SI898dGKiT3e843244cGjA75t7oUDX = 0;

   public _v21XqGBKlb5tBoXN248rU79X3Ur28kL5v5kBi86cs994juAv5Zura8oq57fB44zfSTwl5EryhT7i5HUAQe33uivs44Rv53e/* $VF was: 8v21XqGBKlb5tBoXN248rU79X3Ur28kL5v5kBi86cs994juAv5Zura8oq57fB44zfSTwl5EryhT7i5HUAQe33uivs44Rv53e */() {
      super(
         1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.1Qp0JaZY8j08gNvixC9lTVmYuhPF31BB7EM4Stx7l040d2ADn4eGQuWyK2M5
            .9Jh5mk8D5l9P2bI8Lv7m90647ug7tSSFv7qK59d4IjI9GQxu4G3jcaZl5w41
      );
   }

   @Override
   public void _8ejD45Q8LEgM39W23b9PS53H72qux6CoqBH3EmIU8XRRLm3446Q9e3d4IQv/* $VF was: 88ejD45Q8LEgM39W23b9PS53H72qux6CoqBH3EmIU8XRRLm3446Q9e3d4IQv */() {
      this.9ZYVu9Qp113TX8tpXTT5VQv4YWsb18SI898dGKiT3e843244cGjA75t7oUDX++;
      if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip.4ZJzjV4ZUIoAEZm80Eg9UZ6ydiptq3Q0W2umW7h3bRHqfDcd45vw553X6qt7
               .5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn
               .21n1Yc74v7G6eY24T7KSj34XifI3R56mzeD6BEe0SmDhkmylgeGogGH3s6Mb
            != 2
         || this.88024hG6da4f4kcVfOqR8cTJ36RtCs13wB6V30Rs17vqAj14F4Cqz3neFg20) {
         this.88024hG6da4f4kcVfOqR8cTJ36RtCs13wB6V30Rs17vqAj14F4Cqz3neFg20 = false;

         for (int var1 = 0; var1 < 16; var1++) {
            for (int var2 = 0; var2 < 16; var2++) {
               float var3 = 0.0F;

               for (int var6 = var1 - 1; var6 <= var1 + 1; var6++) {
                  int var4 = var6 & 15;
                  int var5 = var2 & 15;
                  var3 += this.8FS3Ncp2JbVavISpIUz9iIn9ODk7wV141cO1Q5g0ODSrg3L0vRA5DMc7iM6H[var4 + var5 * 16];
               }

               this.79JZCJAD8GYec7s6mK8819gjqE9g93I84TXN3s9ALWgQP5I81w48Xj252TR9[var1 + var2 * 16] = var3 / 3.3F
                  + this.2F86OI73u4EOlkhobJ73Bg83W7dq9sMKxd4926nfRj1jvL1p6226M0rrrhi4[var1 + var2 * 16] * 0.8F;
            }
         }

         for (int var13 = 0; var13 < 16; var13++) {
            for (int var14 = 0; var14 < 16; var14++) {
               this.2F86OI73u4EOlkhobJ73Bg83W7dq9sMKxd4926nfRj1jvL1p6226M0rrrhi4[var13 + var14 * 16] = this.2F86OI73u4EOlkhobJ73Bg83W7dq9sMKxd4926nfRj1jvL1p6226M0rrrhi4[var13
                     + var14 * 16]
                  + this.345q09Qa9N8d00XmAeoUALq1XNvGoaGH17466gdKgKEPIPFEHjfUl1I549qv[var13 + var14 * 16] * 0.05F;
               if (this.2F86OI73u4EOlkhobJ73Bg83W7dq9sMKxd4926nfRj1jvL1p6226M0rrrhi4[var13 + var14 * 16] < 0.0F) {
                  this.2F86OI73u4EOlkhobJ73Bg83W7dq9sMKxd4926nfRj1jvL1p6226M0rrrhi4[var13 + var14 * 16] = 0.0F;
               }

               this.345q09Qa9N8d00XmAeoUALq1XNvGoaGH17466gdKgKEPIPFEHjfUl1I549qv[var13 + var14 * 16] = this.345q09Qa9N8d00XmAeoUALq1XNvGoaGH17466gdKgKEPIPFEHjfUl1I549qv[var13
                     + var14 * 16]
                  - 0.1F;
               if (Math.random() < 0.05) {
                  this.345q09Qa9N8d00XmAeoUALq1XNvGoaGH17466gdKgKEPIPFEHjfUl1I549qv[var13 + var14 * 16] = 0.5F;
               }
            }
         }

         float[] var19 = this.79JZCJAD8GYec7s6mK8819gjqE9g93I84TXN3s9ALWgQP5I81w48Xj252TR9;
         this.79JZCJAD8GYec7s6mK8819gjqE9g93I84TXN3s9ALWgQP5I81w48Xj252TR9 = this.8FS3Ncp2JbVavISpIUz9iIn9ODk7wV141cO1Q5g0ODSrg3L0vRA5DMc7iM6H;
         this.8FS3Ncp2JbVavISpIUz9iIn9ODk7wV141cO1Q5g0ODSrg3L0vRA5DMc7iM6H = var19;

         for (int var15 = 0; var15 < 256; var15++) {
            float var16 = this.8FS3Ncp2JbVavISpIUz9iIn9ODk7wV141cO1Q5g0ODSrg3L0vRA5DMc7iM6H[var15];
            if (var16 > 1.0F) {
               var16 = 1.0F;
            }

            if (var16 < 0.0F) {
               var16 = 0.0F;
            }

            float var7 = var16 * var16;
            int var17 = (int)(32.0F + var7 * 32.0F);
            int var18 = (int)(50.0F + var7 * 64.0F);
            int var8 = 255;
            int var9 = (int)(146.0F + var7 * 50.0F);
            if (this.06P3mXenpD5L0FS19r771z79X4G6ToUmlYYq950W8EH6ukeiX4WQd6Wqr2uA) {
               int var10 = (var17 * 30 + var18 * 59 + var8 * 11) / 100;
               int var11 = (var17 * 30 + var18 * 70) / 100;
               int var12 = (var17 * 30 + var8 * 70) / 100;
               var17 = var10;
               var18 = var11;
               var8 = var12;
            }

            this.8hTHSC7rG7gfcnHOO1IR8LKJ5WbfgWP4DZy894U21YDCTVhNU4pMPGK2WT4D[var15 * 4 + 0] = (byte)var17;
            this.8hTHSC7rG7gfcnHOO1IR8LKJ5WbfgWP4DZy894U21YDCTVhNU4pMPGK2WT4D[var15 * 4 + 1] = (byte)var18;
            this.8hTHSC7rG7gfcnHOO1IR8LKJ5WbfgWP4DZy894U21YDCTVhNU4pMPGK2WT4D[var15 * 4 + 2] = (byte)var8;
            this.8hTHSC7rG7gfcnHOO1IR8LKJ5WbfgWP4DZy894U21YDCTVhNU4pMPGK2WT4D[var15 * 4 + 3] = (byte)var9;
         }
      }
   }
}
