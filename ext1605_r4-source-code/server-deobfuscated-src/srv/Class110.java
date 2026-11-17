package srv;

public abstract class Class110 extends Class167 implements Interface293 {
   public Class110(Class317 var1) {
      super(var1);
   }

   @Override
   protected float method_568(int var1, int var2, int var3) {
      return this.field_796.method_813(var1, var2 - 1, var3) == Class371.field_1206.field_1379 ? 10.0F : this.field_796.method_170(var1, var2, var3) - 0.5F;
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
   public boolean method_53() {
      int var1 = Class380.method_502(this.field_1324);
      int var2 = Class380.method_502(this.field_106.field_817);
      int var3 = Class380.method_502(this.field_1321);
      return this.field_796.method_813(var1, var2 - 1, var3) == Class371.field_1206.field_1379
         && this.field_796.method_339(var1, var2, var3) > 8
         && super.method_53();
   }

   @Override
   public int method_921() {
      return 120;
   }
}
