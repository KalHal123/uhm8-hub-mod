package x;

public class Class0315 extends Class0158 implements Class0066 {
   public float a;
   public float b;
   private int d = 0;
   public int c = 1;

   public Class0315(Class0065 var1) {
      super(var1);
      this.u = "/mob/slime.png";
      this.c = 1 << this.aN.nextInt(3);
      this.ay = 0.0F;
      this.d = this.aN.nextInt(20) + 10;
      this.c(this.c);
   }

   public void c(int var1) {
      this.c = var1;
      this.a(0.6F * var1, 0.6F * var1);
      this.D = var1 * var1;
      this.a(this.ah, this.ai, this.aj);
   }

   @Override
   public void a(Class0193 var1) {
      super.a(var1);
      var1.a("Size", this.c - 1);
   }

   @Override
   public void b(Class0193 var1) {
      super.b(var1);
      this.c = var1.e("Size") + 1;
   }

   @Override
   public void e_() {
      this.b = this.a;
      boolean var1 = this.as;
      super.e_();
      if (this.as && !var1) {
         for (int var2 = 0; var2 < this.c * 8; var2++) {
            float var3 = this.aN.nextFloat() * (float) Math.PI * 2.0F;
            float var4 = this.aN.nextFloat() * 0.5F + 0.5F;
            float var5 = Class0118.a(var3) * this.c * 0.5F * var4;
            float var6 = Class0118.b(var3) * this.c * 0.5F * var4;
            this.ad.a("slime", this.ah + var5, this.ar.b, this.aj + var6, 0.0, 0.0, 0.0);
         }

         if (this.c > 2) {
            this.ad.a(this, "mob.slime", this.f(), ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.a = -0.5F;
      }

      this.a *= 0.6F;
   }

   @Override
   protected void b_() {
      Class0089 var1 = this.ad.a(this, 16.0);
      if (var1 != null) {
         this.b(var1, 10.0F);
      }

      if (this.as && this.d-- <= 0) {
         this.d = this.aN.nextInt(20) + 10;
         if (var1 != null) {
            this.d /= 3;
         }

         this.W = true;
         if (this.c > 1) {
            this.ad.a(this, "mob.slime", this.f(), ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.a = 1.0F;
         this.T = 1.0F - this.aN.nextFloat() * 2.0F;
         this.U = 1 * this.c;
      } else {
         this.W = false;
         if (this.as) {
            this.T = this.U = 0.0F;
         }
      }
   }

   @Override
   public void D() {
      if (this.c > 1 && this.D == 0) {
         for (int var1 = 0; var1 < 4; var1++) {
            float var2 = (var1 % 2 - 0.5F) * this.c / 4.0F;
            float var3 = (var1 / 2 - 0.5F) * this.c / 4.0F;
            Class0315 var4 = new Class0315(this.ad);
            var4.c(this.c / 2);
            var4.c(this.ah + var2, this.ai + 0.5, this.aj + var3, this.aN.nextFloat() * 360.0F, 0.0F);
            this.ad.a(var4);
         }
      }

      super.D();
   }

   @Override
   public void b(Class0089 var1) {
      if (this.c > 1 && this.c(var1) && this.d(var1) < 0.6 * this.c && var1.a(this, this.c)) {
         this.ad.a(this, "mob.slimeattack", 1.0F, (this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F);
      }
   }

   @Override
   protected String d() {
      return "mob.slime";
   }

   @Override
   protected String e() {
      return "mob.slime";
   }

   @Override
   protected int g() {
      return this.c == 1 ? Class0086.aK.aQ : 0;
   }

   @Override
   public boolean a() {
      Class0154 var1 = this.ad.a(Class0118.b(this.ah), Class0118.b(this.ai));
      return (this.c == 1 || this.ad.k > 0) && this.aN.nextInt(10) == 0 && var1.a(987234911L).nextInt(100) == 0 && this.ai < 16.0;
   }

   @Override
   protected float f() {
      return 0.6F;
   }
}
