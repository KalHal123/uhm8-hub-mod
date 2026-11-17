package srv;

public class Class247 extends Class110 {
   public boolean field_779 = false;
   public float field_1449 = 0.0F;
   public float field_1414 = 0.0F;
   public float field_511;
   public float field_1348;
   public float field_1452 = 1.0F;
   public int field_1518;

   public Class247(Class317 var1) {
      super(var1);
      this.method_273(0.3F, 0.4F);
      this.field_1090 = 4;
      this.field_1518 = this.field_697.nextInt(6000) + 6000;
   }

   @Override
   public void method_664() {
      super.method_664();
      this.field_1348 = this.field_1449;
      this.field_511 = this.field_1414;
      this.field_1414 = (float)(this.field_1414 + (this.field_199 ? -1 : 4) * 0.3);
      if (this.field_1414 < 0.0F) {
         this.field_1414 = 0.0F;
      }

      if (this.field_1414 > 1.0F) {
         this.field_1414 = 1.0F;
      }

      if (!this.field_199 && this.field_1452 < 1.0F) {
         this.field_1452 = 1.0F;
      }

      this.field_1452 = (float)(this.field_1452 * 0.9);
      if (!this.field_199 && this.field_780 < 0.0) {
         this.field_780 *= 0.6;
      }

      this.field_1449 = this.field_1449 + this.field_1452 * 2.0F;
      if (!this.field_796.field_906 && --this.field_1518 <= 0) {
         this.field_796.method_38(this, "mob.chickenplop", 1.0F, (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.2F + 1.0F);
         this.method_585(Class350.field_1231.field_473, 1);
         this.field_1518 = this.field_697.nextInt(6000) + 6000;
      }
   }

   @Override
   protected void method_324(float var1) {
   }

   @Override
   public void method_422(Class100 var1) {
      super.method_422(var1);
   }

   @Override
   public void method_134(Class100 var1) {
      super.method_134(var1);
   }

   @Override
   protected String method_51() {
      return "mob.chicken";
   }

   @Override
   protected String method_47() {
      return "mob.chickenhurt";
   }

   @Override
   protected String method_483() {
      return "mob.chickenhurt";
   }

   @Override
   protected int method_735() {
      return Class350.field_526.field_473;
   }
}
