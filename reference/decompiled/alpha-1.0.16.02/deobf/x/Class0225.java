package x;

public class Class0225 {
   public float a;
   private double f;
   public int b;
   public float c;
   public float d = 1.0F;
   public float e = 0.0F;
   private long g;
   private long h;
   private double i = 1.0;

   public Class0225(float var1) {
      this.a = var1;
      this.g = System.currentTimeMillis();
      this.h = System.nanoTime() / 1000000L;
   }

   public void a() {
      long var1 = System.currentTimeMillis();
      long var3 = var1 - this.g;
      long var5 = System.nanoTime() / 1000000L;
      if (var3 > 1000L) {
         long var7 = var5 - this.h;
         double var9 = (double)var3 / var7;
         this.i = this.i + (var9 - this.i) * 0.2F;
         this.g = var1;
         this.h = var5;
      }

      if (var3 < 0L) {
         this.g = var1;
         this.h = var5;
      }

      double var11 = var5 / 1000.0;
      double var12 = (var11 - this.f) * this.i;
      this.f = var11;
      if (var12 < 0.0) {
         var12 = 0.0;
      }

      if (var12 > 1.0) {
         var12 = 1.0;
      }

      this.e = (float)(this.e + var12 * this.d * this.a);
      this.b = (int)this.e;
      this.e = this.e - this.b;
      if (this.b > 10) {
         this.b = 10;
      }

      this.c = this.e;
   }
}
