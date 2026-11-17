package srv;

public class Class42 extends Class342 {
   protected Class42(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.2F;
      this.method_177(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
   }

   @Override
   protected boolean method_685(int var1) {
      return Class371.field_380[var1];
   }

   @Override
   public boolean method_645(Class317 var1, int var2, int var3, int var4) {
      return var1.method_339(var2, var3, var4) <= 13 && this.method_685(var1.method_813(var2, var3 - 1, var4));
   }
}
