package x;

public class Class0074 extends Class0093 {
   public Class0074(Class0065 var1) {
      super(var1);
      this.u = "/mob/skeleton.png";
   }

   @Override
   protected String c() {
      return "mob.skeleton";
   }

   @Override
   protected String d() {
      return "mob.skeletonhurt";
   }

   @Override
   protected String e() {
      return "mob.skeletonhurt";
   }

   @Override
   public void i() {
      if (this.ad.b()) {
         float var1 = this.a(1.0F);
         if (var1 > 0.5F && this.ad.i(Class0118.b(this.ah), Class0118.b(this.ai), Class0118.b(this.aj)) && this.aN.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.aQ = 300;
         }
      }

      super.i();
   }

   @Override
   protected void a(Class0268 var1, float var2) {
      if (var2 < 10.0F) {
         double var3 = var1.ah - this.ah;
         double var5 = var1.aj - this.aj;
         if (this.J == 0) {
            Class0267 var7 = new Class0267(this.ad, this);
            var7.ai += 1.4F;
            double var8 = var1.ai - 0.2F - var7.ai;
            float var10 = Class0118.a(var3 * var3 + var5 * var5) * 0.2F;
            this.ad.a(this, "random.bow", 1.0F, 1.0F / (this.aN.nextFloat() * 0.4F + 0.8F));
            this.ad.a(var7);
            var7.a(var3, var8 + var10, var5, 0.6F, 12.0F);
            this.J = 30;
         }

         this.an = (float)(Math.atan2(var5, var3) * 180.0 / (float) Math.PI) - 90.0F;
         this.g = true;
      }
   }

   @Override
   public void a(Class0193 var1) {
      super.a(var1);
   }

   @Override
   public void b(Class0193 var1) {
      super.b(var1);
   }

   @Override
   protected int g() {
      return Class0086.j.aQ;
   }
}
