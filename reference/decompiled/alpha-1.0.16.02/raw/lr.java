public class lr extends dk {
   public lr(cj var1) {
      super(var1);
      this.u = "/mob/zombie.png";
      this.Y = 0.5F;
      this.e = 5;
   }

   @Override
   public void i() {
      if (this.ad.b()) {
         float var1 = this.a(1.0F);
         if (var1 > 0.5F && this.ad.i(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj)) && this.aN.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.aQ = 300;
         }
      }

      super.i();
   }

   @Override
   protected String c() {
      return "mob.zombie";
   }

   @Override
   protected String d() {
      return "mob.zombiehurt";
   }

   @Override
   protected String e() {
      return "mob.zombiedeath";
   }

   @Override
   protected int g() {
      return dd.J.aQ;
   }
}
