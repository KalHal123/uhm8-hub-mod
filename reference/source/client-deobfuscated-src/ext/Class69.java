package ext;

public class Class69 extends Class591 {
   public Class69(Class110 var1, Class110 var2, float var3) {
      super(var1, var3);
      this.method_1734(var2);
   }

   protected boolean method_190(Class58 var1, int var2) {
      this.method_1261("/mob/sheep_fur.png");
      return var2 == 0 && !var1.field_2687;
   }

   @Override
   protected boolean method_882(Class377 var1, int var2) {
      return this.method_190((Class58)var1, var2);
   }
}
