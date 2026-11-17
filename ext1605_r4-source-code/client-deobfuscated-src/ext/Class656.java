package ext;

public class Class656 extends Class407 {
   protected Class656(int var1) {
      super(var1, Class160.field_265);
      this.field_2119 = 59;
   }

   @Override
   public int method_519(int var1) {
      if (var1 == 1) {
         return this.field_2119 - 16;
      } else if (var1 == 0) {
         return Class407.field_3109.method_519(0);
      } else {
         return var1 != 2 && var1 != 4 ? this.field_2119 : this.field_2119 + 1;
      }
   }

   @Override
   public boolean method_676(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      var5.method_1070();
      return true;
   }
}
