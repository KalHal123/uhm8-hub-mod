package x;

public class Class0017 extends Class0387 {
   protected float[] f = new float[256];
   protected float[] g = new float[256];
   protected float[] h = new float[256];
   protected float[] i = new float[256];

   public Class0017() {
      super(Class0312.C.aZ);
   }

   @Override
   public void a() {
      for (int var1 = 0; var1 < 16; var1++) {
         for (int var2 = 0; var2 < 16; var2++) {
            float var3 = 0.0F;
            int var4 = (int)(Class0118.a(var2 * (float) Math.PI * 2.0F / 16.0F) * 1.2F);
            int var5 = (int)(Class0118.a(var1 * (float) Math.PI * 2.0F / 16.0F) * 1.2F);

            for (int var6 = var1 - 1; var6 <= var1 + 1; var6++) {
               for (int var7 = var2 - 1; var7 <= var2 + 1; var7++) {
                  int var8 = var6 + var4 & 15;
                  int var9 = var7 + var5 & 15;
                  var3 += this.f[var8 + var9 * 16];
               }
            }

            this.g[var1 + var2 * 16] = var3 / 10.0F
               + (
                     this.h[(var1 + 0 & 15) + (var2 + 0 & 15) * 16]
                        + this.h[(var1 + 1 & 15) + (var2 + 0 & 15) * 16]
                        + this.h[(var1 + 1 & 15) + (var2 + 1 & 15) * 16]
                        + this.h[(var1 + 0 & 15) + (var2 + 1 & 15) * 16]
                  )
                  / 4.0F
                  * 0.8F;
            this.h[var1 + var2 * 16] = this.h[var1 + var2 * 16] + this.i[var1 + var2 * 16] * 0.01F;
            if (this.h[var1 + var2 * 16] < 0.0F) {
               this.h[var1 + var2 * 16] = 0.0F;
            }

            this.i[var1 + var2 * 16] = this.i[var1 + var2 * 16] - 0.06F;
            if (Math.random() < 0.005) {
               this.i[var1 + var2 * 16] = 1.5F;
            }
         }
      }

      float[] var11 = this.g;
      this.g = this.f;
      this.f = var11;

      for (int var12 = 0; var12 < 256; var12++) {
         float var13 = this.f[var12] * 2.0F;
         if (var13 > 1.0F) {
            var13 = 1.0F;
         }

         if (var13 < 0.0F) {
            var13 = 0.0F;
         }

         float var14 = var13;
         int var15 = (int)(var14 * 100.0F + 155.0F);
         int var16 = (int)(var14 * var14 * 255.0F);
         int var17 = (int)(var14 * var14 * var14 * var14 * 128.0F);
         if (this.c) {
            int var18 = (var15 * 30 + var16 * 59 + var17 * 11) / 100;
            int var19 = (var15 * 30 + var16 * 70) / 100;
            int var10 = (var15 * 30 + var17 * 70) / 100;
            var15 = var18;
            var16 = var19;
            var17 = var10;
         }

         this.a[var12 * 4 + 0] = (byte)var15;
         this.a[var12 * 4 + 1] = (byte)var16;
         this.a[var12 * 4 + 2] = (byte)var17;
         this.a[var12 * 4 + 3] = -1;
      }
   }
}
