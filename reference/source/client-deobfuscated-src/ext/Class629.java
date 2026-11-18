package ext;

public class Class629 extends Class108 {
   public Class629(int var1, int var2) {
      super(var1, Class160.field_1806);
      this.field_2972 = var2;
   }

   @Override
   public int method_1735(int var1) {
      return var1 == 1 ? this.field_2972 - 16 : (var1 == 0 ? this.field_2972 + 16 : this.field_2972);
   }
}
