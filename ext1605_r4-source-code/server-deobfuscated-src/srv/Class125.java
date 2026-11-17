package srv;

public class Class125 extends Class371 {
   protected Class125(int var1) {
      super(var1, Class111.field_1200);
      this.field_1137 = 59;
   }

   @Override
   public int method_310(int var1) {
      return var1 == 1
         ? this.field_1137 - 16
         : (var1 == 0 ? Class371.field_1031.method_310(0) : (var1 != 2 && var1 != 4 ? this.field_1137 : this.field_1137 + 1));
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      var5.method_892();
      return true;
   }
}
