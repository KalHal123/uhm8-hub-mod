public class at extends dk {
   public at(cj var1) {
      super(var1);
      this.u = "/mob/spider.png";
      this.a(1.4F, 0.9F);
      this.Y = 0.8F;
   }

   @Override
   protected jx h() {
      float var1 = this.a(1.0F);
      if (var1 < 0.5F) {
         double var2 = 16.0;
         return this.ad.a(this, var2);
      } else {
         return null;
      }
   }

   @Override
   protected String c() {
      return "mob.spider";
   }

   @Override
   protected String d() {
      return "mob.spider";
   }

   @Override
   protected String e() {
      return "mob.spiderdeath";
   }

   @Override
   protected void a(jx var1, float var2) {
      float var3 = this.a(1.0F);
      if (var3 > 0.5F && this.aN.nextInt(100) == 0) {
         this.f = null;
      } else {
         if (!(var2 > 2.0F) || !(var2 < 6.0F) || this.aN.nextInt(10) != 0) {
            super.a(var1, var2);
         } else if (this.as) {
            double var4 = var1.ah - this.ah;
            double var6 = var1.aj - this.aj;
            float var8 = ei.a(var4 * var4 + var6 * var6);
            this.ak = var4 / var8 * 0.5 * 0.8F + this.ak * 0.2F;
            this.am = var6 / var8 * 0.5 * 0.8F + this.am * 0.2F;
            this.al = 0.4F;
         }
      }
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
   protected int g() {
      return dd.I.aQ;
   }
}
