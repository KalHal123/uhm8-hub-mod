public class ak extends ae {
   public boolean a = false;

   public ak(cj var1) {
      super(var1);
      this.u = "/mob/cow.png";
      this.a(0.9F, 1.3F);
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
      return "mob.cow";
   }

   @Override
   protected String d() {
      return "mob.cowhurt";
   }

   @Override
   protected String e() {
      return "mob.cowhurt";
   }

   @Override
   protected float f() {
      return 0.4F;
   }

   @Override
   protected int g() {
      return dd.aD.aQ;
   }

   @Override
   public boolean a(dg var1) {
      eo var2 = var1.b.e();
      if (var2 != null && var2.c == dd.au.aQ) {
         var1.b.a(var1.b.d, new eo(dd.aE));
         return true;
      } else {
         return false;
      }
   }
}
