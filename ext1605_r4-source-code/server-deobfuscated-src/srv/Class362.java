package srv;

public class Class362 extends Class110 {
   public boolean field_1450 = false;

   public Class362(Class317 var1) {
      super(var1);
      this.method_273(0.9F, 0.9F);
      this.field_1450 = false;
   }

   @Override
   public void method_422(Class100 var1) {
      super.method_422(var1);
      var1.method_430("Saddle", this.field_1450);
   }

   @Override
   public void method_134(Class100 var1) {
      super.method_134(var1);
      this.field_1450 = var1.method_1004("Saddle");
   }

   @Override
   protected String method_51() {
      return "mob.pig";
   }

   @Override
   protected String method_47() {
      return "mob.pig";
   }

   @Override
   protected String method_483() {
      return "mob.pigdeath";
   }

   @Override
   protected int method_735() {
      return this.field_1034 > 0 ? Class350.field_993.field_473 : Class350.field_743.field_473;
   }
}
