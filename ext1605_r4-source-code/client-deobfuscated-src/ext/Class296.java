package ext;

public abstract class Class296 extends Class407 {
   protected Class296(int var1, Class160 var2) {
      super(var1, var2);
      field_1731[var1] = true;
   }

   protected Class296(int var1, int var2, Class160 var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      super.method_1592(var1, var2, var3, var4);
      var1.method_1516(var2, var3, var4, this.method_1700());
   }

   @Override
   public void method_1617(Class454 var1, int var2, int var3, int var4) {
      super.method_1617(var1, var2, var3, var4);
      var1.method_995(var2, var3, var4);
   }

   protected abstract Class186 method_1700();
}
