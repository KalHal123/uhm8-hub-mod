package ext;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class Class584 {
   private static FloatBuffer field_1963 = Class504.method_8(16);

   public static void method_62() {
      GL11.glDisable(2896);
      GL11.glDisable(16384);
      GL11.glDisable(16385);
      GL11.glDisable(2903);
   }

   public static void method_331() {
      GL11.glEnable(2896);
      GL11.glEnable(16384);
      GL11.glEnable(16385);
      GL11.glEnable(2903);
      GL11.glColorMaterial(1032, 5634);
      float var0 = 0.4F;
      float var1 = 0.6F;
      float var2 = 0.0F;
      Class214 var3 = Class214.method_701(0.2F, 1.0, -0.7F).method_341();
      GL11.glLight(16384, 4611, method_160(var3.field_882, var3.field_1911, var3.field_3045, 0.0));
      GL11.glLight(16384, 4609, method_12(var1, var1, var1, 1.0F));
      GL11.glLight(16384, 4608, method_12(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16384, 4610, method_12(var2, var2, var2, 1.0F));
      var3 = Class214.method_701(-0.2F, 1.0, 0.7F).method_341();
      GL11.glLight(16385, 4611, method_160(var3.field_882, var3.field_1911, var3.field_3045, 0.0));
      GL11.glLight(16385, 4609, method_12(var1, var1, var1, 1.0F));
      GL11.glLight(16385, 4608, method_12(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16385, 4610, method_12(var2, var2, var2, 1.0F));
      GL11.glShadeModel(7424);
      GL11.glLightModel(2899, method_12(var0, var0, var0, 1.0F));
   }

   private static FloatBuffer method_160(double var0, double var2, double var4, double var6) {
      return method_12((float)var0, (float)var2, (float)var4, (float)var6);
   }

   private static FloatBuffer method_12(float var0, float var1, float var2, float var3) {
      ((Buffer)field_1963).clear();
      field_1963.put(var0).put(var1).put(var2).put(var3);
      ((Buffer)field_1963).flip();
      return field_1963;
   }
}
