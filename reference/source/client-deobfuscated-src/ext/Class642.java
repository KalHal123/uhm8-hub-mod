package ext;

public class Class642 extends Class203 {
   protected float[] field_123 = new float[320];
   protected float[] field_2876 = new float[320];

   public Class642(int var1) {
      super(Class108.field_1781.field_2972 + var1 * 16);
   }

   @Override
   public void method_1610() {
      if (Class119.field_1519.field_1754.field_674 != 2 || this.field_2606) {
         this.field_2606 = false;

         for (int var5 = 0; var5 < 16; var5++) {
            for (int var1 = 0; var1 < 20; var1++) {
               int var6 = 18;
               float var2 = this.field_123[var5 + (var1 + 1) % 20 * 16] * var6;

               for (int var3 = var5 - 1; var3 <= var5 + 1; var3++) {
                  for (int var4 = var1; var4 <= var1 + 1; var4++) {
                     if (var3 >= 0 && var4 >= 0 && var3 < 16 && var4 < 20) {
                        var2 += this.field_123[var3 + var4 * 16];
                     }

                     var6++;
                  }
               }

               this.field_2876[var5 + var1 * 16] = var2 / (var6 * 1.06F);
               if (var1 >= 19) {
                  this.field_2876[var5 + var1 * 16] = (float)(Math.random() * Math.random() * Math.random() * 4.0 + Math.random() * 0.1F + 0.2F);
               }
            }
         }

         float[] var16 = this.field_2876;
         this.field_2876 = this.field_123;
         this.field_123 = var16;

         for (int var12 = 0; var12 < 256; var12++) {
            float var17 = this.field_123[var12] * 1.8F;
            if (var17 > 1.0F) {
               var17 = 1.0F;
            }

            if (var17 < 0.0F) {
               var17 = 0.0F;
            }

            int var14 = (int)(var17 * 155.0F + 100.0F);
            int var15 = (int)(var17 * var17 * 255.0F);
            int var7 = (int)(var17 * var17 * var17 * var17 * var17 * var17 * var17 * var17 * var17 * var17 * 255.0F);
            short var8 = 255;
            if (var17 < 0.5F) {
               var8 = 0;
            }

            float var13 = (var17 - 0.5F) * 2.0F;
            if (this.field_85) {
               int var9 = (var14 * 30 + var15 * 59 + var7 * 11) / 100;
               int var10 = (var14 * 30 + var15 * 70) / 100;
               int var11 = (var14 * 30 + var7 * 70) / 100;
               var14 = var9;
               var15 = var10;
               var7 = var11;
            }

            this.field_2765[var12 * 4 + 0] = (byte)var14;
            this.field_2765[var12 * 4 + 1] = (byte)var15;
            this.field_2765[var12 * 4 + 2] = (byte)var7;
            this.field_2765[var12 * 4 + 3] = (byte)var8;
         }
      }
   }
}
