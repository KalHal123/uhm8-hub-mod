package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class580 extends Class273 {
   public Class580(Minecraft var1) {
      super(var1);
   }

   @Override
   public void method_101(float var1, boolean var2, int var3, int var4) {
      Class187 var5 = new Class187(this.field_2506.field_2517, this.field_2506.field_2477);
      int var6 = var5.method_884();
      int var7 = var5.method_351();
      Class640 var8 = this.field_2506.field_1541;
      this.field_2506.field_1455.method_808();
      GL11.glEnable(3042);
      this.method_1491(this.field_2506.field_1541, "You have been banned for violating our Online Play Guidelines!", var6 / 2, 2, 14909708);
      this.method_1491(this.field_2506.field_1541, "Remaining suspension time: indefinite", var6 / 2, 12, 14909708);
      GL11.glEnable(3008);
      GL11.glDisable(3042);
   }
}
