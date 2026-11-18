public class dk extends ee implements ck {
   protected int e = 2;

   public dk(cj var1) {
      super(var1);
      this.D = 20;
   }

   @Override
   public void i() {
      float var1 = this.a(1.0F);
      if (var1 > 0.5F) {
         this.S += 2;
      }

      super.i();
   }

   @Override
   public void e_() {
      super.e_();
      if (this.ad.k == 0) {
         this.D();
      }
   }

   @Override
   protected jx h() {
      dg var1 = this.ad.a(this, 16.0);
      return var1 != null && this.c(var1) ? var1 : null;
   }

   @Override
   public boolean a(jx var1, int var2) {
      if (super.a(var1, var2)) {
         if (var1 != this) {
            this.f = var1;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(jx var1, float var2) {
      if (var2 < 2.5 && var1.ar.e > this.ar.b && var1.ar.b < this.ar.e) {
         this.J = 20;
         var1.a(this, this.e);
      }
   }

   @Override
   protected float a(int var1, int var2, int var3) {
      return 0.5F - this.ad.c(var1, var2, var3);
   }

   @Override
   public void a(hc var1) {
      super.a(var1);
   }

   @Override
   public void b(hc var1) {
      super.b(var1);
   }

   @Override
   public boolean a() {
      int var1 = ei.b(this.ah);
      int var2 = ei.b(this.ar.b);
      int var3 = ei.b(this.aj);
      if (this.ad.a(bu.a, var1, var2, var3) > this.aN.nextInt(32)) {
         return false;
      }

      int var4 = this.ad.j(var1, var2, var3);
      return var4 <= this.aN.nextInt(8) && super.a();
   }
}
