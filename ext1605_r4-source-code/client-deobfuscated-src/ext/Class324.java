package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class Class324 extends Class420 {
   public Class324(Minecraft var1) {
      super(var1);
   }

   @Override
   public boolean method_1065(int var1, int var2, int var3, int var4) {
      return !Keyboard.isKeyDown(54) ? false : super.method_1065(var1, var2, var3, var4);
   }

   @Override
   public void method_1585(int var1, int var2, int var3, int var4) {
      if (Keyboard.isKeyDown(54)) {
         super.method_1585(var1, var2, var3, var4);
      }
   }
}
