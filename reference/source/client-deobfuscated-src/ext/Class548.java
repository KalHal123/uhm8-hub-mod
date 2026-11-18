package ext;

import java.awt.Component;
import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Cursor;
import org.lwjgl.input.Mouse;

public class Class548 {
   private Component field_1935;
   private Cursor field_2233;
   public int field_2826;
   public int field_2488;
   private int field_2720 = 10;
   private long field_2324 = -1L;

   public Class548(Component var1) {
      this.field_1935 = var1;
      IntBuffer var2 = Class504.method_323(1);
      var2.put(0);
      ((Buffer)var2).flip();
      IntBuffer var3 = Class504.method_323(1024);

      try {
         this.field_2233 = new Cursor(32, 32, 16, 16, 1, var3, var2);
      } catch (LWJGLException var5) {
         var5.printStackTrace();
      }
   }

   public void method_1764() {
      Mouse.setGrabbed(true);
      this.field_2826 = 0;
      this.field_2488 = 0;
   }

   public void method_514() {
      Mouse.setCursorPosition(this.field_1935.getWidth() / 2, this.field_1935.getHeight() / 2);
      Mouse.setGrabbed(false);
   }

   public void method_1122() {
      if (this.field_2324 == -1L) {
         this.field_2324 = System.currentTimeMillis();
      }

      float var1 = (float)(System.currentTimeMillis() - this.field_2324) / 1000.0F;
      this.field_2324 = System.currentTimeMillis();
      if (Class119.field_685 != null) {
         for (int var2 = 0; var2 != Class119.field_685.length; var2++) {
            if (Class119.field_685[var2] != null
               && (Class119.field_685[var2].getRXAxisValue() != 0.0F || Class119.field_685[var2].getRYAxisValue() != 0.0F)
               && (Class119.field_685[var2].getRXAxisValue() != -1.0F || Class119.field_685[var2].getRYAxisValue() != -1.0F)) {
               this.field_2826 = (int)(Class119.field_685[var2].getRXAxisValue() * 500.0F * Class119.field_1489 * var1);
               if (this.field_2826 > -1 && this.field_2826 < 1) {
                  this.field_2826 = 0;
               }

               this.field_2488 = (int)(-Class119.field_685[var2].getRYAxisValue() * 250.0F * Class119.field_1489 * var1);
               if (this.field_2488 > -1 && this.field_2488 < 1) {
                  this.field_2488 = 0;
               }

               if (this.field_2826 != 0 || this.field_2488 != 0) {
                  return;
               }
            }
         }
      }

      this.field_2826 = Mouse.getDX();
      this.field_2488 = Mouse.getDY();
   }
}
