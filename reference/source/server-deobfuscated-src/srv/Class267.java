package srv;

public class Class267 extends Class244 {
   public int field_935 = -1;

   public Class267(Class317 var1) {
      super(var1);
      this.field_543 = 0.5F;
      this.field_951 = 50;
      this.field_855 *= 6.0F;
      this.method_273(this.field_595 * 6.0F, this.field_907 * 6.0F);
      Class31.field_449 = true;
      Class31.field_452 = this;
      Class31.field_99 = "Dormant Giant";
   }

   public Class267(Class317 var1, int var2) {
      super(var1);
      if (var2 <= 0) {
         var2 = 1;
      }

      this.field_543 = 0.5F;
      this.field_951 = 50;
      this.field_1090 = this.field_1090 * Math.min(4 * var2, 800);
      this.field_935 = this.field_1090;
      this.field_855 *= 6.0F;
      this.method_273(this.field_595 * 6.0F, this.field_907 * 6.0F);
   }

   @Override
   protected float method_568(int var1, int var2, int var3) {
      return this.field_796.method_170(var1, var2, var3) - 0.5F;
   }

   @Override
   protected void method_324(float var1) {
   }

   @Override
   protected String method_51() {
      return "ext.giantambient";
   }

   @Override
   protected String method_47() {
      return "ext.gianthurt";
   }

   @Override
   protected String method_483() {
      return "ext.giantdead";
   }

   @Override
   public void method_577(Class252 var1) {
      Class31.method_1001(this);
      super.method_577(var1);
      if (this.field_697.nextInt(50) > 10) {
         this.method_585(Class13.field_1493.field_473, 1);
      }
   }

   @Override
   public void method_664() {
      super.method_664();
      if (this.field_935 == -1) {
         this.field_935 = this.field_1090;
      }
   }

   @Override
   public void method_715() {
      super.method_715();
   }

   @Override
   public int method_669() {
      return 36 + this.field_697.nextInt(12);
   }
}
