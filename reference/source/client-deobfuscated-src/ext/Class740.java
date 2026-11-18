package ext;

public class Class740 extends Class108 {
   protected Class740(int var1) {
      super(var1, Class160.field_265);
      this.field_2972 = 59;
   }

   @Override
   public int method_1735(int var1) {
      return var1 == 1
         ? this.field_2972 - 16
         : (var1 == 0 ? Class108.field_3148.method_1735(0) : (var1 != 2 && var1 != 4 ? this.field_2972 : this.field_2972 + 1));
   }

   @Override
   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      var5.method_1070();
      return true;
   }
}
