package x;

public class Class0039 extends Class0006 {
   public boolean a = false;

   public Class0039(Class0065 var1) {
      super(var1);
      this.u = "/mob/sheep.png";
      this.a(0.9F, 1.3F);
   }

   @Override
   public boolean a(Class0268 var1, int var2) {
      if (!this.a && var1 instanceof Class0158) {
         this.a = true;
         int var3 = 1 + this.aN.nextInt(3);

         for (int var4 = 0; var4 < var3; var4++) {
            Class0100 var5 = this.a(Class0312.ab.ba, 1, (float)1.0F);
            var5.al = var5.al + this.aN.nextFloat() * 0.05F;
            var5.ak = var5.ak + (this.aN.nextFloat() - this.aN.nextFloat()) * 0.1F;
            var5.am = var5.am + (this.aN.nextFloat() - this.aN.nextFloat()) * 0.1F;
         }
      }

      return super.a(var1, var2);
   }

   @Override
   public void a(Class0193 var1) {
      super.a(var1);
      var1.a("Sheared", this.a);
   }

   @Override
   public void b(Class0193 var1) {
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
