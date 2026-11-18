package ext;

public class Class731 extends Class203 {
   protected float[] field_449 = new float[256];
   protected float[] field_2198 = new float[256];
   protected float[] field_1863 = new float[256];
   protected float[] field_1514 = new float[256];
   int field_1488 = 0;

   public Class731() {
      super(Class108.field_1423.field_2972 + 1);
      this.field_938 = 2;
   }

   @Override
   public void method_1610() {
      this.field_1488++;
      if (Class119.field_1519.field_1754.field_674 != 2 || this.field_2606) {
         this.field_2606 = false;

         for (int var8 = 0; var8 < 16; var8++) {
            for (int var1 = 0; var1 < 16; var1++) {
               float var2 = 0.0F;
               int var9 = (int)(Class469.method_1667(var1 * (float) Math.PI * 2.0F / 16.0F) * 1.2F);
               int var3 = (int)(Class469.method_1667(var8 * (float) Math.PI * 2.0F / 16.0F) * 1.2F);

               for (int var4 = var8 - 1; var4 <= var8 + 1; var4++) {
                  for (int var5 = var1 - 1; var5 <= var1 + 1; var5++) {
                     int var6 = var4 + var9 & 15;
                     int var7 = var5 + var3 & 15;
                     var2 += this.field_449[var6 + var7 * 16];
                  }
               }

               this.field_2198[var8 + var1 * 16] = var2 / 10.0F
                  + (
                        this.field_1863[(var8 + 0 & 15) + (var1 + 0 & 15) * 16]
                           + this.field_1863[(var8 + 1 & 15) + (var1 + 0 & 15) * 16]
                           + this.field_1863[(var8 + 1 & 15) + (var1 + 1 & 15) * 16]
                           + this.field_1863[(var8 + 0 & 15) + (var1 + 1 & 15) * 16]
                     )
                     / 4.0F
                     * 0.8F;
               this.field_1863[var8 + var1 * 16] = this.field_1863[var8 + var1 * 16] + this.field_1514[var8 + var1 * 16] * 0.01F;
               if (this.field_1863[var8 + var1 * 16] < 0.0F) {
                  this.field_1863[var8 + var1 * 16] = 0.0F;
               }

               this.field_1514[var8 + var1 * 16] = this.field_1514[var8 + var1 * 16] - 0.06F;
               if (Math.random() < 0.005) {
                  this.field_1514[var8 + var1 * 16] = 1.5F;
               }
            }
         }

         float[] var17 = this.field_2198;
         this.field_2198 = this.field_449;
         this.field_449 = var17;

         for (int var10 = 0; var10 < 256; var10++) {
            float var11 = this.field_449[var10 - this.field_1488 / 3 * 16 & 0xFF] * 2.0F;
            if (var11 > 1.0F) {
               var11 = 1.0F;
            }

            if (var11 < 0.0F) {
               var11 = 0.0F;
            }

            int var12 = (int)(var11 * 100.0F + 155.0F);
            int var13 = (int)(var11 * var11 * 255.0F);
            int var14 = (int)(var11 * var11 * var11 * var11 * 128.0F);
            if (this.field_85) {
               int var15 = (var12 * 30 + var13 * 59 + var14 * 11) / 100;
               int var16 = (var12 * 30 + var13 * 70) / 100;
               int var18 = (var12 * 30 + var14 * 70) / 100;
               var12 = var15;
               var13 = var16;
               var14 = var18;
            }

            this.field_2765[var10 * 4 + 0] = (byte)var12;
            this.field_2765[var10 * 4 + 1] = (byte)var13;
            this.field_2765[var10 * 4 + 2] = (byte)var14;
            this.field_2765[var10 * 4 + 3] = -1;
         }
      }
   }
}
