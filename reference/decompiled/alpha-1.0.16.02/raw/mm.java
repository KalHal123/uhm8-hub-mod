public class mm extends ae {
   public boolean a = false;
   public float b = 0.0F;
   public float c = 0.0F;
   public float d;
   public float e;
   public float h = 1.0F;
   public int i;

   public mm(cj var1) {
      super(var1);
      this.u = "/mob/chicken.png";
      this.a(0.3F, 0.4F);
      this.D = 4;
      this.i = this.aN.nextInt(6000) + 6000;
   }

   @Override
   public void i() {
      super.i();
      this.e = this.b;
      this.d = this.c;
      this.c = (float)(this.c + (this.as ? -1 : 4) * 0.3);
      if (this.c < 0.0F) {
         this.c = 0.0F;
      }

      if (this.c > 1.0F) {
         this.c = 1.0F;
      }

      if (!this.as && this.h < 1.0F) {
         this.h = 1.0F;
      }

      this.h = (float)(this.h * 0.9);
      if (!this.as && this.al < 0.0) {
         this.al *= 0.6;
      }

      this.b = this.b + this.h * 2.0F;
      if (--this.i <= 0) {
         this.b(dd.aN.aQ, 1);
         this.i = this.aN.nextInt(6000) + 6000;
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
   protected String c() {
      return "mob.chicken";
   }

   @Override
   protected String d() {
      return "mob.chickenhurt";
   }

   @Override
   protected String e() {
      return "mob.chickenhurt";
   }

   @Override
   protected int g() {
      return dd.J.aQ;
   }
}
