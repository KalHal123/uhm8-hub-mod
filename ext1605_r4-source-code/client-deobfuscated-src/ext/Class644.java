package ext;

import org.lwjgl.input.Keyboard;

public class Class644 extends Class511 {
   public Class644(int var1, String var2) {
      super(var1, var2);
   }

   @Override
   public String method_1680() {
      return Keyboard.isKeyDown(54) ? "LA CREATURA MAGNIFICA" : this.field_1588;
   }
}
