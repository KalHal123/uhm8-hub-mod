package ext;

public class Class749 extends Class203 {
   protected float[] field_2033 = new float[256];
   protected float[] field_1561 = new float[256];
   protected float[] field_252 = new float[256];
   protected float[] field_430 = new float[256];
   private int field_1676 = 0;

   public Class749() {
      super(Class108.field_536.field_2972 + 1);
      this.field_938 = 2;
   }

   @Override
   public void method_1610() {
      this.field_1676++;
      if (Class119.field_1519.field_1754.field_674 != 2 || this.field_2606) {
         this.field_2606 = false;

         for (int var1 = 0; var1 < 16; var1++) {
            for (int var2 = 0; var2 < 16; var2++) {
               float var3 = 0.0F;

               for (int var6 = var2 - 2; var6 <= var2; var6++) {
                  int var4 = var1 & 15;
                  int var5 = var6 & 15;
                  var3 += this.field_2033[var4 + var5 * 16];
               }

               this.field_1561[var1 + var2 * 16] = var3 / 3.2F + this.field_252[var1 + var2 * 16] * 0.8F;
            }
         }

         for (int var13 = 0; var13 < 16; var13++) {
            for (int var14 = 0; var14 < 16; var14++) {
               this.field_252[var13 + var14 * 16] = this.field_252[var13 + var14 * 16] + this.field_430[var13 + var14 * 16] * 0.05F;
               if (this.field_252[var13 + var14 * 16] < 0.0F) {
                  this.field_252[var13 + var14 * 16] = 0.0F;
               }

               this.field_430[var13 + var14 * 16] = this.field_430[var13 + var14 * 16] - 0.3F;
               if (Math.random() < 0.2) {
                  this.field_430[var13 + var14 * 16] = 0.5F;
               }
            }
         }

         float[] var19 = this.field_1561;
         this.field_1561 = this.field_2033;
         this.field_2033 = var19;

         for (int var15 = 0; var15 < 256; var15++) {
            float var16 = this.field_2033[var15 - this.field_1676 * 16 & 0xFF];
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
            if (this.field_85) {
               int var10 = (var17 * 30 + var18 * 59 + var8 * 11) / 100;
               int var11 = (var17 * 30 + var18 * 70) / 100;
               int var12 = (var17 * 30 + var8 * 70) / 100;
               var17 = var10;
               var18 = var11;
               var8 = var12;
            }

            this.field_2765[var15 * 4 + 0] = (byte)var17;
            this.field_2765[var15 * 4 + 1] = (byte)var18;
            this.field_2765[var15 * 4 + 2] = (byte)var8;
            this.field_2765[var15 * 4 + 3] = (byte)var9;
         }
      }
   }
}
