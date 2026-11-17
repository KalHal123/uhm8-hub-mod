package srv;

public class Class239 extends Class244 {
   int field_792;
   int field_1075;
   int field_1310 = 30;
   int field_480 = -1;

   public Class239(Class317 var1) {
      super(var1);
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
   protected void method_530() {
      this.field_1075 = this.field_792;
      if (this.field_792 > 0 && this.field_480 < 0) {
         this.field_792--;
      }

      if (this.field_480 >= 0) {
         this.field_480 = 2;
      }

      super.method_530();
      if (this.field_480 != 1) {
         this.field_480 = -1;
      }
   }

   @Override
   protected String method_47() {
      return "mob.creeper";
   }

   @Override
   protected String method_483() {
      return "mob.creeperdeath";
   }

   @Override
   public void method_577(Class252 var1) {
      super.method_577(var1);
      if (var1 instanceof Class360) {
         this.method_585(Class350.field_182.field_473 + this.field_697.nextInt(2), 1);
      }
   }

   @Override
   protected void method_964(Class252 var1, float var2) {
      if (this.field_480 <= 0 && var2 < 3.0F || this.field_480 > 0 && var2 < 7.0F) {
         if (this.field_792 == 0) {
            this.field_796.method_38(this, "random.fuse", 1.0F, 0.5F);
         }

         this.field_480 = 1;
         this.field_792++;
         if (this.field_792 == this.field_1310) {
            this.field_796.method_701(this, this.field_1324, this.field_632, this.field_1321, 3.0F);
            this.method_715();
         }

         this.field_1341 = true;
      }
   }

   @Override
   protected int method_735() {
      return Class350.field_1249.field_473;
   }
}
