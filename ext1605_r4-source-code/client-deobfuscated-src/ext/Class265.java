package ext;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class Class265 extends Class254 {
   public Minecraft field_3013;
   public int field_2345;
   public int field_562;
   protected List<Class423> field_577 = new ArrayList<>();
   public boolean field_2868 = false;
   protected Class640 field_1683;
   private Class423 field_2390 = null;

   public void method_1938(int var1, int var2, float var3) {
      for (int var4 = 0; var4 < this.field_577.size(); var4++) {
         Class423 var5 = this.field_577.get(var4);
         var5.method_792(this.field_3013, var1, var2);
      }
   }

   protected void method_437(char var1, int var2) {
      if (var2 == 1) {
         this.field_3013.method_1290((Class265)null);
         this.field_3013.method_663();
      }
   }

   public static String method_279() {
      try {
         Transferable var0 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
         if (var0 != null && var0.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return (String)var0.getTransferData(DataFlavor.stringFlavor);
         }
      } catch (Exception var2) {
      }

      return null;
   }

   protected void method_316(int var1, int var2, int var3) {
      if (var3 == 0) {
         for (int var4 = 0; var4 < this.field_577.size(); var4++) {
            Class423 var5 = this.field_577.get(var4);
            if (var5.method_94(this.field_3013, var1, var2)) {
               this.field_2390 = var5;
               this.field_3013.field_485.method_1511("random.click", 1.0F, 1.0F);
               this.method_1445(var5);
            }
         }
      }
   }

   protected void method_1269(int var1, int var2, int var3) {
      if (this.field_2390 != null && var3 == 0) {
         this.field_2390.method_15(var1, var2);
         this.field_2390 = null;
      }
   }

   protected void method_1445(Class423 var1) {
   }

   public void method_1588(Minecraft var1, int var2, int var3) {
      this.field_3013 = var1;
      this.field_1683 = var1.field_1541;
      this.field_2345 = var2;
      this.field_562 = var3;
      this.method_836();
   }

   public void method_836() {
   }

   public void method_946() {
      while (Class119.method_1877()) {
         this.method_1015();
      }

      while (Class119.method_1811()) {
         this.method_1326();
      }
   }

   public void method_1015() {
      if (Mouse.getEventButtonState()) {
         int var1 = Mouse.getEventX() * this.field_2345 / this.field_3013.field_2517;
         int var2 = this.field_562 - Mouse.getEventY() * this.field_562 / this.field_3013.field_2477 - 1;
         this.method_316(var1, var2, Mouse.getEventButton());
      } else {
         int var3 = Mouse.getEventX() * this.field_2345 / this.field_3013.field_2517;
         int var4 = this.field_562 - Mouse.getEventY() * this.field_562 / this.field_3013.field_2477 - 1;
         this.method_1269(var3, var4, Mouse.getEventButton());
      }
   }

   public void method_1326() {
      if (Keyboard.getEventKeyState()) {
         if (Keyboard.getEventKey() == 87) {
            this.field_3013.method_1111();
            return;
         }

         this.method_437(Keyboard.getEventCharacter(), Keyboard.getEventKey());
      }
   }

   public void method_1414() {
   }

   public void method_1670() {
   }

   public void method_796() {
   }

   public void method_1076() {
      float var1 = (float)(System.currentTimeMillis() - this.field_3013.field_2927) / 10000.0F;
      this.method_1163(var1);
   }

   public void method_1163(float var1) {
      if (this.field_3013.field_2648 != null) {
         Class254.method_421(0, 0, this.field_2345, this.field_562, -1072689136, -804253680);
      } else {
         this.method_1784(var1);
      }
   }

   public void method_1784(float var1) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      Class368 var2 = Class368.field_2696;
      GL11.glBindTexture(3553, this.field_3013.field_2176.method_1545("/dirt.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var3 = 32.0F;
      var2.method_1284(true);
      var2.method_1748(3815994);
      var2.method_318(0.0, this.field_562, 0.0, 0.0, this.field_562 / var3 + var1);
      var2.method_318(this.field_2345, this.field_562, 0.0, this.field_2345 / var3, this.field_562 / var3 + var1);
      var2.method_318(this.field_2345, 0.0, 0.0, this.field_2345 / var3, 0.0F + var1);
      var2.method_318(0.0, 0.0, 0.0, 0.0, 0.0F + var1);
      var2.method_406();
   }

   public boolean method_1440() {
      return true;
   }

   public void method_1229(boolean var1, int var2) {
   }

   public void method_220() {
   }
}
