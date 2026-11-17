package srv;

public class Class144 implements Interface327 {
   private String field_1425;
   private Interface327 field_1401;
   private Interface327 field_1194;

   public Class144(String var1, Interface327 var2, Interface327 var3) {
      this.field_1425 = var1;
      this.field_1401 = var2;
      this.field_1194 = var3;
   }

   @Override
   public int method_214() {
      return this.field_1401.method_214() + this.field_1194.method_214();
   }

   @Override
   public Class150 method_908(int var1) {
      return var1 >= this.field_1401.method_214() ? this.field_1194.method_908(var1 - this.field_1401.method_214()) : this.field_1401.method_908(var1);
   }
}
