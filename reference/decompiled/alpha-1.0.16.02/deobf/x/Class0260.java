package x;

public class Class0260 extends Class0387 {
   protected float[] f = new float[320];
   protected float[] g = new float[320];

   public Class0260(int var1) {
      super(Class0312.ar.aZ + var1 * 16);
   }

   @Override
   public void a() {
      for (int var1 = 0; var1 < 16; var1++) {
         for (int var2 = 0; var2 < 20; var2++) {
            int var3 = 18;
            float var4 = this.f[var1 + (var2 + 1) % 20 * 16] * var3;

            for (int var5 = var1 - 1; var5 <= var1 + 1; var5++) {
               for (int var6 = var2; var6 <= var2 + 1; var6++) {
                  int var7 = var5;
                  int var8 = var6;
                  if (var7 >= 0 && var8 >= 0 && var7 < 16 && var8 < 20) {
                     var4 += this.f[var7 + var8 * 16];
                  }

                  var3++;
               }
            }

            this.g[var1 + var2 * 16] = var4 / (var3 * 1.06F);
            if (var2 >= 19) {
               this.g[var1 + var2 * 16] = (float)(Math.random() * Math.random() * Math.random() * 4.0 + Math.random() * 0.1F + 0.2F);
            }
         }
      }

      float[] var12 = this.g;
      this.g = this.f;
      this.f = var12;

      for (int var13 = 0; var13 < 256; var13++) {
         float var14 = this.f[var13] * 1.8F;
         if (var14 > 1.0F) {
            var14 = 1.0F;
         }

         if (var14 < 0.0F) {
            var14 = 0.0F;
         }

         float var15 = var14;
         int var17 = (int)(var15 * 155.0F + 100.0F);
         int var18 = (int)(var15 * var15 * 255.0F);
         int var19 = (int)(var15 * var15 * var15 * var15 * var15 * var15 * var15 * var15 * var15 * var15 * 255.0F);
         short var20 = 255;
         if (var15 < 0.5F) {
            var20 = 0;
         }

         var15 = (var15 - 0.5F) * 2.0F;
         if (this.c) {
            int var9 = (var17 * 30 + var18 * 59 + var19 * 11) / 100;
            int var10 = (var17 * 30 + var18 * 70) / 100;
            int var11 = (var17 * 30 + var19 * 70) / 100;
            var17 = var9;
            var18 = var10;
            var19 = var11;
         }

         this.a[var13 * 4 + 0] = (byte)var17;
         this.a[var13 * 4 + 1] = (byte)var18;
         this.a[var13 * 4 + 2] = (byte)var19;
         this.a[var13 * 4 + 3] = (byte)var20;
      }
   }
}
