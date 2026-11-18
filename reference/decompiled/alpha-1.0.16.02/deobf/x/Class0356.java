package x;

public class Class0356 extends Class0268 {
   protected int b;
   protected float c;
   protected float d;
   protected int e = 0;
   protected int f = 0;
   protected float g;
   protected float h;
   protected float i;
   protected float j;
   protected float k;
   public static double l;
   public static double m;
   public static double n;

   public Class0356(Class0065 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.a(0.2F, 0.2F);
      this.ay = this.aA / 2.0F;
      this.a(var2, var4, var6);
      this.i = this.j = this.k = 1.0F;
      this.ak = var8 + (float)(Math.random() * 2.0 - 1.0) * 0.4F;
      this.al = var10 + (float)(Math.random() * 2.0 - 1.0) * 0.4F;
      this.am = var12 + (float)(Math.random() * 2.0 - 1.0) * 0.4F;
      float var14 = (float)(Math.random() + Math.random() + 1.0) * 0.15F;
      float var15 = Class0118.a(this.ak * this.ak + this.al * this.al + this.am * this.am);
      this.ak = this.ak / var15 * var14 * 0.4F;
      this.al = this.al / var15 * var14 * 0.4F + 0.1F;
      this.am = this.am / var15 * var14 * 0.4F;
      this.c = this.aN.nextFloat() * 3.0F;
      this.d = this.aN.nextFloat() * 3.0F;
      this.g = (this.aN.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.f = (int)(4.0F / (this.aN.nextFloat() * 0.9F + 0.1F));
      this.e = 0;
      this.aD = false;
   }

   public Class0356 b(float var1) {
      this.ak *= var1;
      this.al = (this.al - 0.1F) * var1 + 0.1F;
      this.am *= var1;
      return this;
   }

   public Class0356 d(float var1) {
      this.a(0.2F * var1, 0.2F * var1);
      this.g *= var1;
      return this;
   }

   @Override
   public void e_() {
      this.ae = this.ah;
      this.af = this.ai;
      this.ag = this.aj;
      if (this.e++ >= this.f) {
         this.D();
      }

      this.al = this.al - 0.04 * this.h;
      this.c(this.ak, this.al, this.am);
      this.ak *= 0.98F;
      this.al *= 0.98F;
      this.am *= 0.98F;
      if (this.as) {
         this.ak *= 0.7F;
         this.am *= 0.7F;
      }
   }

   public void a(Class0195 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = this.b % 16 / 16.0F;
      float var9 = var8 + 0.0624375F;
      float var10 = this.b / 16 / 16.0F;
      float var11 = var10 + 0.0624375F;
      float var12 = 0.1F * this.g;
      float var13 = (float)(this.ae + (this.ah - this.ae) * var2 - l);
      float var14 = (float)(this.af + (this.ai - this.af) * var2 - m);
      float var15 = (float)(this.ag + (this.aj - this.ag) * var2 - n);
      float var16 = this.a(var2);
      var1.a(this.i * var16, this.j * var16, this.k * var16);
      var1.a(var13 - var3 * var12 - var6 * var12, var14 - var4 * var12, var15 - var5 * var12 - var7 * var12, var8, var11);
      var1.a(var13 - var3 * var12 + var6 * var12, var14 + var4 * var12, var15 - var5 * var12 + var7 * var12, var8, var10);
      var1.a(var13 + var3 * var12 + var6 * var12, var14 + var4 * var12, var15 + var5 * var12 + var7 * var12, var9, var10);
      var1.a(var13 + var3 * var12 - var6 * var12, var14 - var4 * var12, var15 + var5 * var12 - var7 * var12, var9, var11);
   }

   public int c() {
      return 0;
   }

   @Override
   public void a(Class0193 var1) {
   }

   @Override
   public void b(Class0193 var1) {
   }
}
