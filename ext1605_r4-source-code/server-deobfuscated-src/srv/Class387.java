package srv;

public class Class387 extends Class110 {
   public boolean field_1328 = false;

   public Class387(Class317 var1) {
      super(var1);
      this.method_273(0.9F, 1.3F);
   }

   @Override
   public boolean method_671(Class252 var1, int var2) {
      if (!this.field_1328 && var1 instanceof Class92) {
         this.field_1328 = true;
         int var3 = 1 + this.field_697.nextInt(3);

         for (int var4 = 0; var4 < var3; var4++) {
            Class39 var5 = this.method_355(Class371.field_1113.field_1379, 1, 1.0F);
            var5.field_780 = var5.field_780 + this.field_697.nextFloat() * 0.05F;
            var5.field_607 = var5.field_607 + (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.1F;
            var5.field_921 = var5.field_921 + (this.field_697.nextFloat() - this.field_697.nextFloat()) * 0.1F;
         }
      }

      return super.method_671(var1, var2);
   }

   @Override
   public void method_422(Class100 var1) {
      super.method_422(var1);
      var1.method_430("Sheared", this.field_1328);
   }

   @Override
   public void method_134(Class100 var1) {
      super.method_134(var1);
      this.field_1328 = var1.method_1004("Sheared");
   }

   @Override
   protected String method_51() {
      return "mob.sheep";
   }

   @Override
   protected String method_47() {
      return "mob.sheep";
   }

   @Override
   protected String method_483() {
      return "mob.sheep";
   }
}
