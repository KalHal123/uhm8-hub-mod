package x;

public class Class0238 extends Class0268 {
   public int a = 0;

   public Class0238(Class0065 var1) {
      super(var1);
      this.aa = true;
      this.a(0.98F, 0.98F);
      this.ay = this.aA / 2.0F;
   }

   public Class0238(Class0065 var1, float var2, float var3, float var4) {
      this(var1);
      this.a((double)var2, (double)var3, (double)var4);
      float var5 = (float)(Math.random() * (float) Math.PI * 2.0);
      this.ak = -Class0118.a(var5 * (float) Math.PI / 180.0F) * 0.02F;
      this.al = 0.2F;
      this.am = -Class0118.b(var5 * (float) Math.PI / 180.0F) * 0.02F;
      this.aD = false;
      this.a = 80;
      this.ae = var2;
      this.af = var3;
      this.ag = var4;
   }

   @Override
   public boolean c_() {
      return !this.ax;
   }

   @Override
   public void e_() {
      this.ae = this.ah;
      this.af = this.ai;
      this.ag = this.aj;
      this.al -= 0.04F;
      this.c(this.ak, this.al, this.am);
      this.ak *= 0.98F;
      this.al *= 0.98F;
      this.am *= 0.98F;
      if (this.as) {
         this.ak *= 0.7F;
         this.am *= 0.7F;
         this.al *= -0.5;
      }

      if (this.a-- <= 0) {
         this.D();
         this.i();
      } else {
         this.ad.a("smoke", this.ah, this.ai + 0.5, this.aj, 0.0, 0.0, 0.0);
      }
   }

   private void i() {
      float var1 = 4.0F;
      this.ad.a(null, this.ah, this.ai, this.aj, var1);
   }

   @Override
   protected void a(Class0193 var1) {
      var1.a("Fuse", (byte)this.a);
   }

   @Override
   protected void b(Class0193 var1) {
      this.a = var1.c("Fuse");
   }

   @Override
   public float h_() {
      return 0.0F;
   }
}
