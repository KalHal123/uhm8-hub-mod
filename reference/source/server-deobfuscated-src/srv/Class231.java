package srv;

public class Class231 extends Class371 {
   public Class231(int var1, int var2) {
      super(var1, Class111.field_279);
      this.field_1137 = var2;
   }

   @Override
   public int method_310(int var1) {
      return var1 == 1 ? this.field_1137 - 16 : (var1 == 0 ? this.field_1137 + 16 : this.field_1137);
   }
}
