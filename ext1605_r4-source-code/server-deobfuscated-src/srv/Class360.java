package srv;

public class Class360 extends Class244 {
   public Class360(Class317 var1) {
      super(var1);
   }

   @Override
   protected String method_51() {
      return "mob.skeleton";
   }

   @Override
   protected String method_47() {
      return "mob.skeletonhurt";
   }

   @Override
   protected String method_483() {
      return "mob.skeletonhurt";
   }

   @Override
   public void method_664() {
      if (this.field_796.method_143()) {
         float var1 = this.method_172(1.0F);
         if (var1 > 0.5F
            && this.field_796.method_338(Class380.method_502(this.field_1324), Class380.method_502(this.field_632), Class380.method_502(this.field_1321))
            && this.field_697.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.field_1034 = 300;
         }
      }

      super.method_664();
   }

   @Override
   protected void method_964(Class252 var1, float var2) {
      if (var2 < 10.0F) {
         double var3 = var1.field_1324 - this.field_1324;
         double var5 = var1.field_1321 - this.field_1321;
         if (this.field_1550 == 0) {
            Class158 var7 = new Class158(this.field_796, this);
            var7.field_632++;
            double var8 = var1.field_632 - 0.2F - var7.field_632;
            float var10 = Class380.method_164(var3 * var3 + var5 * var5) * 0.2F;
            this.field_796.method_38(this, "random.bow", 1.0F, 1.0F / (this.field_697.nextFloat() * 0.4F + 0.8F));
            this.field_796.method_237(var7);
            var7.method_619(var3, var8 + var10, var5, 0.6F, 12.0F);
            this.field_1550 = 30;
         }

         this.field_909 = (float)(Math.atan2(var5, var3) * 180.0 / (float) Math.PI) - 90.0F;
         this.field_1341 = true;
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
      return Class350.field_1257.field_473;
   }
}
