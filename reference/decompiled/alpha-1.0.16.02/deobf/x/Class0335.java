package x;

public class Class0335 extends Class0006 {
   public boolean a = false;

   public Class0335(Class0065 var1) {
      super(var1);
      this.u = "/mob/pig.png";
      this.a(0.9F, 0.9F);
      this.a = false;
   }

   @Override
   public void a(Class0193 var1) {
      super.a(var1);
      var1.a("Saddle", this.a);
   }

   @Override
   public void b(Class0193 var1) {
      super.b(var1);
      this.a = var1.m("Saddle");
   }

   @Override
   protected String c() {
      return "mob.pig";
   }

   @Override
   protected String d() {
      return "mob.pig";
   }

   @Override
   protected String e() {
      return "mob.pigdeath";
   }

   @Override
   public boolean a(Class0089 var1) {
      if (this.a) {
         var1.g(this);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected int g() {
      return Class0086.ao.aQ;
   }
}
