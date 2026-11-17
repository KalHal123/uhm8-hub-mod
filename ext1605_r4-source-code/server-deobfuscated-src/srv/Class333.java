package srv;

public class Class333 extends Class244 {
   public Class333(Class317 var1) {
      super(var1);
      this.method_273(1.4F, 0.9F);
      this.field_543 = 0.8F;
   }

   @Override
   public double method_760() {
      return this.field_907 * 0.75 - 0.5;
   }

   @Override
   protected Class252 method_335() {
      float var1 = this.method_172(1.0F);
      if (var1 < 0.5F) {
         double var2 = 16.0;
         return this.field_796.method_176(this, var2);
      } else {
         return null;
      }
   }

   @Override
   protected String method_51() {
      return "mob.spider";
   }

   @Override
   protected String method_47() {
      return "mob.spider";
   }

   @Override
   protected String method_483() {
      return "mob.spiderdeath";
   }

   @Override
   protected void method_964(Class252 var1, float var2) {
      float var3 = this.method_172(1.0F);
      if (var3 > 0.5F && this.field_697.nextInt(100) == 0) {
         this.field_948 = null;
      } else if (!(var2 > 2.0F) || !(var2 < 6.0F) || this.field_697.nextInt(10) != 0) {
         super.method_964(var1, var2);
      } else if (this.field_199) {
         double var4 = var1.field_1324 - this.field_1324;
         double var6 = var1.field_1321 - this.field_1321;
         float var8 = Class380.method_164(var4 * var4 + var6 * var6);
         this.field_607 = var4 / var8 * 0.5 * 0.8F + this.field_607 * 0.2F;
         this.field_921 = var6 / var8 * 0.5 * 0.8F + this.field_921 * 0.2F;
         this.field_780 = 0.4F;
      }
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
   protected int method_735() {
      return Class350.field_1001.field_473;
   }
}
