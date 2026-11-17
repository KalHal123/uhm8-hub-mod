package ext;

public abstract class Class19 extends Class108 {
   protected Class19(int var1, Class160 var2) {
      super(var1, var2);
      field_1953[var1] = true;
   }

   protected Class19(int var1, int var2, Class160 var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      super.method_1937(var1, var2, var3, var4);
      var1.method_1516(var2, var3, var4, this.method_1267());
   }

   @Override
   public void method_1736(Class454 var1, int var2, int var3, int var4) {
      super.method_1736(var1, var2, var3, var4);
      var1.method_995(var2, var3, var4);
   }

   protected abstract Class186 method_1267();
}
