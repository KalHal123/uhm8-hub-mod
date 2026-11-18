package ext;

import org.lwjgl.input.Keyboard;

public class Class211 extends Class252 implements Interface612 {
   public Class211(int var1, int var2, int var3, Class160 var4) {
      super(var1, var3, var2, var3, var4);
   }

   @Override
   public void method_527(Class404 var1, Class326 var2) {
      var1.field_979.method_330(var2, this.method_1809());
      var1.field_2587 = null;
   }

   @Override
   public String method_752(Class404 var1, Class326 var2) {
      String var3 = Keyboard.getKeyName(Class119.field_1519.field_1754.field_1301.field_2381);
      return "[" + var3 + "] Interact";
   }

   @Override
   public int method_1809() {
      return 3939;
   }
}
