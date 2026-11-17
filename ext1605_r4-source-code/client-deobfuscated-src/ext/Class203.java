package ext;

import org.lwjgl.opengl.GL11;

public class Class203 {
   public byte[] field_2765 = new byte[1024];
   public int field_1808;
   public boolean field_85 = false;
   public int field_971 = 0;
   public int field_938 = 1;
   public int field_118 = 0;
   protected boolean field_2606 = true;

   public Class203(int var1) {
      this.field_1808 = var1;
   }

   public void method_1610() {
   }

   public void method_1203(Class432 var1) {
      if (this.field_118 == 0) {
         GL11.glBindTexture(3553, var1.method_1545(Class614.method_1576(Class614.field_1949)));
      } else if (this.field_118 == 1) {
         GL11.glBindTexture(3553, var1.method_1545("/gui/items.png"));
      }
   }
}
