package x;

public class Class0012 extends Class0006 {
   public boolean a = false;

   public Class0012(Class0065 var1) {
      super(var1);
      this.u = "/mob/cow.png";
      this.a(0.9F, 1.3F);
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
      return Class0086.aD.aQ;
   }

   @Override
   public boolean a(Class0089 var1) {
      Class0124 var2 = var1.b.e();
      if (var2 != null && var2.c == Class0086.au.aQ) {
         var1.b.a(var1.b.d, new Class0124(Class0086.aE));
         return true;
      } else {
         return false;
      }
   }
}
