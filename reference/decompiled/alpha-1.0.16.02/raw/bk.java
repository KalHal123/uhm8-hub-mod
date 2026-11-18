public class bk extends ae {
   public boolean a = false;

   public bk(cj var1) {
      super(var1);
      this.u = "/mob/sheep.png";
      this.a(0.9F, 1.3F);
   }

   @Override
   public boolean a(jx var1, int var2) {
      if (!this.a && var1 instanceof fv) {
         this.a = true;
         int var3 = 1 + this.aN.nextInt(3);

         for (int var4 = 0; var4 < var3; var4++) {
            dr var5 = this.a(ln.ab.ba, 1, (float)1.0F);
            var5.al = var5.al + this.aN.nextFloat() * 0.05F;
            var5.ak = var5.ak + (this.aN.nextFloat() - this.aN.nextFloat()) * 0.1F;
            var5.am = var5.am + (this.aN.nextFloat() - this.aN.nextFloat()) * 0.1F;
         }
      }

      return super.a(var1, var2);
   }

   @Override
   public void a(hc var1) {
      super.a(var1);
      var1.a("Sheared", this.a);
   }

   @Override
   public void b(hc var1) {
      super.b(var1);
      this.a = var1.m("Sheared");
   }

   @Override
   protected String c() {
      return "mob.sheep";
   }

   @Override
   protected String d() {
      return "mob.sheep";
   }

   @Override
   protected String e() {
      return "mob.sheep";
   }
}
