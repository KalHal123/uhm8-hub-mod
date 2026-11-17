package ext;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class Class504 {
   private static List<Integer> field_723 = new ArrayList<>();
   private static List<Integer> field_623 = new ArrayList<>();

   public static synchronized int method_225(int var0) {
      int var1 = GL11.glGenLists(var0);
      field_723.add(var1);
      field_723.add(var0);
      return var1;
   }

   public static synchronized void method_974(IntBuffer var0) {
      GL11.glGenTextures(var0);

      for (int var1 = var0.position(); var1 < var0.limit(); var1++) {
         field_623.add(var0.get(var1));
      }
   }

   public static synchronized void method_1435() {
      for (byte var0 = 0; var0 < field_723.size(); var0 += 2) {
         GL11.glDeleteLists(field_723.get(var0), field_723.get(var0 + 1));
      }

      IntBuffer var2 = method_323(field_623.size());
      ((Buffer)var2).flip();
      GL11.glDeleteTextures(var2);

      for (int var1 = 0; var1 < field_623.size(); var1++) {
         var2.put(field_623.get(var1));
      }

      ((Buffer)var2).flip();
      GL11.glDeleteTextures(var2);
      field_723.clear();
      field_623.clear();
   }

   public static synchronized ByteBuffer method_1768(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   public static IntBuffer method_323(int var0) {
      return method_1768(var0 << 2).asIntBuffer();
   }

   public static FloatBuffer method_8(int var0) {
      return method_1768(var0 << 2).asFloatBuffer();
   }
}
