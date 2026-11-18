package x;

public class Class0080 extends Class0093 {
   int a;
   int b;
   int c = 30;
   int d = -1;

   public Class0080(Class0065 var1) {
      super(var1);
      this.u = "/mob/creeper.png";
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
   protected void b_() {
      this.b = this.a;
      if (this.a > 0 && this.d < 0) {
         this.a--;
      }

      if (this.d >= 0) {
         this.d = 2;
      }

      super.b_();
      if (this.d != 1) {
         this.d = -1;
      }
   }

   @Override
   protected String d() {
      return "mob.creeper";
   }

   @Override
   protected String e() {
      return "mob.creeperdeath";
   }

   @Override
   public void b(Class0268 var1) {
      super.b(var1);
      if (var1 instanceof Class0074) {
         this.b(Class0086.aO.aQ + this.aN.nextInt(2), 1);
      }
   }

   @Override
   protected void a(Class0268 var1, float var2) {
      if (this.d <= 0 && var2 < 3.0F || this.d > 0 && var2 < 7.0F) {
         if (this.a == 0) {
            this.ad.a(this, "random.fuse", 1.0F, 0.5F);
         }

         this.d = 1;
         this.a++;
         if (this.a == this.c) {
            this.ad.a(this, this.ah, this.ai, this.aj, 3.0F);
            this.D();
         }

         this.g = true;
      }
   }

   public float b(float var1) {
      return (this.b + (this.a - this.b) * var1) / (this.c - 2);
   }

   @Override
   protected int g() {
      return Class0086.K.aQ;
   }
}
