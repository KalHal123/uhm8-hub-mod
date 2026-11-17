package ext;

public class Class431 extends Class615 {
   protected Class431(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.2F;
      this.method_1930(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
   }

   @Override
   protected boolean method_1107(int var1) {
      return Class407.field_682[var1];
   }

   @Override
   public boolean method_853(Class454 var1, int var2, int var3, int var4) {
      return var1.method_1676(var2, var3, var4) <= 13 && this.method_1107(var1.method_197(var2, var3 - 1, var4));
   }
}
