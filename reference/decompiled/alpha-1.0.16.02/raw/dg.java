import java.util.List;

public class dg extends fv {
   public en b = new en(this);
   public byte c = 0;
   public int d = 0;
   public float e;
   public float f;
   public boolean g = false;
   public int h = 0;
   public String i;
   private int a = 0;

   public dg(cj var1) {
      super(var1);
      this.ay = 1.62F;
      this.c(var1.n + 0.5, var1.o + 1, var1.p + 0.5, 0.0F, 0.0F);
      this.D = 20;
      this.x = "humanoid";
      this.w = 180.0F;
      this.aP = 20;
      this.u = "/char.png";
   }

   @Override
   public void n() {
      super.n();
      this.e = this.f;
      this.f = 0.0F;
   }

   @Override
   public void o() {
      this.ay = 1.62F;
      this.a(0.6F, 1.8F);
      super.o();
      this.D = 20;
      this.I = 0;
   }

   @Override
   protected void b_() {
      if (this.g) {
         this.h++;
         if (this.h == 8) {
            this.h = 0;
            this.g = false;
         }
      } else {
         this.h = 0;
      }

      this.C = this.h / 8.0F;
   }

   @Override
   public void i() {
      if (this.ad.k == 0 && this.D < 20 && this.aO % 20 * 4 == 0) {
         this.b(1);
      }

      this.b.f();
      this.e = this.f;
      super.i();
      float var1 = ei.a(this.ak * this.ak + this.am * this.am);
      float var2 = (float)Math.atan(-this.al * 0.2F) * 15.0F;
      if (var1 > 0.1F) {
         var1 = 0.1F;
      }

      if (!this.as || this.D <= 0) {
         var1 = 0.0F;
      }

      if (this.as || this.D <= 0) {
         var2 = 0.0F;
      }

      this.f = this.f + (var1 - this.f) * 0.4F;
      this.L = this.L + (var2 - this.L) * 0.8F;
      if (this.D > 0) {
         List var3 = this.ad.b(this, this.ar.b(1.0, 0.0, 1.0));
         if (var3 != null) {
            for (int var4 = 0; var4 < var3.size(); var4++) {
               this.h((jx)var3.get(var4));
            }
         }
      }
   }

   private void h(jx var1) {
      var1.b(this);
   }

   public int p() {
      return this.d;
   }

   @Override
   public void b(jx var1) {
      this.a(0.2F, 0.2F);
      this.a(this.ah, this.ai, this.aj);
      this.al = 0.1F;
      if (this.i.equals("Notch")) {
         this.a(new eo(dd.h, 1), true);
      }

      this.b.h();
      if (var1 != null) {
         this.ak = -ei.b((this.H + this.an) * (float) Math.PI / 180.0F) * 0.1F;
         this.am = -ei.a((this.H + this.an) * (float) Math.PI / 180.0F) * 0.1F;
      } else {
         this.ak = this.am = 0.0;
      }

      this.ay = 0.1F;
   }

   @Override
   public void b(jx var1, int var2) {
      this.d += var2;
   }

   public void a(eo var1) {
      this.a(var1, false);
   }

   public void a(eo var1, boolean var2) {
      if (var1 != null) {
         dr var3 = new dr(this.ad, this.ah, this.ai - 0.3F + this.q(), this.aj, var1);
         var3.c = 40;
         float var4 = 0.1F;
         if (var2) {
            float var5 = this.aN.nextFloat() * 0.5F;
            float var6 = this.aN.nextFloat() * (float) Math.PI * 2.0F;
            var3.ak = -ei.a(var6) * var5;
            var3.am = ei.b(var6) * var5;
            var3.al = 0.2F;
         } else {
            var4 = 0.3F;
            var3.ak = -ei.a(this.an / 180.0F * (float) Math.PI) * ei.b(this.ao / 180.0F * (float) Math.PI) * var4;
            var3.am = ei.b(this.an / 180.0F * (float) Math.PI) * ei.b(this.ao / 180.0F * (float) Math.PI) * var4;
            var3.al = -ei.a(this.ao / 180.0F * (float) Math.PI) * var4 + 0.1F;
            var4 = 0.02F;
            float var10 = this.aN.nextFloat() * (float) Math.PI * 2.0F;
            var4 *= this.aN.nextFloat();
            var3.ak = var3.ak + Math.cos(var10) * var4;
            var3.al = var3.al + (this.aN.nextFloat() - this.aN.nextFloat()) * 0.1F;
            var3.am = var3.am + Math.sin(var10) * var4;
         }

         this.a(var3);
      }
   }

   protected void a(dr var1) {
      this.ad.a(var1);
   }

   public float a(ln var1) {
      float var2 = this.b.a(var1);
      if (this.a(fs.f)) {
         var2 /= 5.0F;
      }

      if (!this.as) {
         var2 /= 5.0F;
      }

      return var2;
   }

   public boolean b(ln var1) {
      return this.b.b(var1);
   }

   @Override
   public void b(hc var1) {
      super.b(var1);
   }

   @Override
   public void a(hc var1) {
      super.a(var1);
   }

   public void a(fy var1) {
   }

   public void k() {
   }

   public void a_(jx var1, int var2) {
   }

   @Override
   protected float q() {
      return 0.12F;
   }

   @Override
   public boolean a(jx var1, int var2) {
      this.S = 0;
      if (this.D <= 0) {
         return false;
      }

      if (this.aT > this.j / 2.0F) {
         return false;
      }

      if (var1 instanceof dk || var1 instanceof jw) {
         if (this.ad.k == 0) {
            var2 = 0;
         }

         if (this.ad.k == 1) {
            var2 = var2 / 3 + 1;
         }

         if (this.ad.k == 3) {
            var2 = var2 * 3 / 2;
         }
      }

      int var3 = 25 - this.b.g();
      int var4 = var2 * var3 + this.a;
      this.b.e(var2);
      var2 = var4 / 25;
      this.a = var4 % 25;
      return var2 == 0 ? false : super.a(var1, var2);
   }

   public void a(ju var1) {
   }

   public void a(nn var1) {
   }

   public void a_(jx var1) {
   }

   public eo r() {
      return this.b.e();
   }

   public void s() {
      this.b.a(this.b.d, null);
   }

   @Override
   public double t() {
      return this.ay - 0.5F;
   }

   public void u() {
      this.h = -1;
      this.g = true;
   }
}
