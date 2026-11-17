package ext;

public class Class275 extends Class407 {
   public Class275(int var1, int var2) {
      super(var1, Class160.field_1806);
      this.field_2119 = var2;
   }

   @Override
   public int method_519(int var1) {
      if (var1 == 1) {
         return this.field_2119 - 16;
      } else {
         return var1 == 0 ? this.field_2119 + 16 : this.field_2119;
      }
   }
}
