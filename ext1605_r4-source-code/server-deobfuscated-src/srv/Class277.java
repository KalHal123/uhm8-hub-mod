package srv;

public abstract class Class277 extends Class371 {
   protected Class277(int var1, Class111 var2) {
      super(var1, var2);
      field_1478[var1] = true;
   }

   protected Class277(int var1, int var2, Class111 var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      super.method_1013(var1, var2, var3, var4);
      var1.method_563(var2, var3, var4, this.method_707());
   }

   @Override
   public void method_650(Class317 var1, int var2, int var3, int var4) {
      super.method_650(var1, var2, var3, var4);
      var1.method_945(var2, var3, var4);
   }

   protected abstract Class66 method_707();
}
