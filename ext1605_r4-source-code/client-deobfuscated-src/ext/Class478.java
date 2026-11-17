package ext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class Class478 {
   public int field_2166 = 0;
   public int field_2063 = 0;
   private int field_888 = 0;
   private int field_2855 = 0;
   public int field_1867 = 0;
   private int field_172 = 0;
   private int field_2802 = 0;
   private int field_217 = 0;
   private int field_1074 = 0;
   private int field_2920 = 0;
   private int field_2873 = 0;
   private int field_2181 = 0;
   private int field_657 = 0;
   private int field_896 = 0;
   private int field_1778 = 0;
   private int field_1173 = 0;
   public Random field_839 = new Random();
   private Minecraft field_2177;

   public Class478(Minecraft var1) {
      this.field_2177 = var1;
      this.method_1923();
   }

   public void method_1923() {
      this.field_2063 = ARBShaderObjects.glCreateProgramObjectARB();
      if (this.field_2063 != 0) {
         this.field_888 = this.method_177("/ext1605/shaders/default/base.vsh");
         this.field_2855 = this.method_391("/ext1605/shaders/default/base.fsh");
      }

      if (this.field_888 != 0 && this.field_2855 != 0) {
         ARBShaderObjects.glAttachObjectARB(this.field_2063, this.field_888);
         ARBShaderObjects.glAttachObjectARB(this.field_2063, this.field_2855);
         ARBShaderObjects.glLinkProgramARB(this.field_2063);
         ARBShaderObjects.glValidateProgramARB(this.field_2063);
         if (!method_125(this.field_2063)) {
            this.field_2063 = 0;
         }
      }

      this.field_1867 = ARBShaderObjects.glCreateProgramObjectARB();
      if (this.field_1867 != 0) {
         this.field_172 = this.method_177("/ext1605/shaders/default/final.vsh");
         this.field_2802 = this.method_391("/ext1605/shaders/custom/final.fsh");
      }

      if (this.field_172 != 0 && this.field_2802 != 0) {
         ARBShaderObjects.glAttachObjectARB(this.field_1867, this.field_172);
         ARBShaderObjects.glAttachObjectARB(this.field_1867, this.field_2802);
         ARBShaderObjects.glLinkProgramARB(this.field_1867);
         ARBShaderObjects.glValidateProgramARB(this.field_1867);
         if (!method_125(this.field_1867)) {
            this.field_1867 = 0;
         }
      }
   }

   public void method_517(int var1) {
      ARBShaderObjects.glUseProgramObjectARB(var1);
      this.field_2166 = var1;
      if (var1 != 0) {
         int var2 = ARBShaderObjects.glGetUniformLocationARB(var1, "sampler0");
         ARBShaderObjects.glUniform1iARB(var2, 0);
      }
   }

   private int method_177(String var1) {
      int var2 = ARBShaderObjects.glCreateShaderObjectARB(35633);
      if (var2 == 0) {
         return 0;
      }

      String var3 = "";

      try {
         BufferedReader var5 = new BufferedReader(new InputStreamReader(Class100.method_1145(var1)));

         String var4;
         while ((var4 = var5.readLine()) != null) {
            var3 = var3 + var4 + "\n";
         }
      } catch (Exception var6) {
         System.out.println("Failed reading vertex shading code.");
         return 0;
      }

      ARBShaderObjects.glShaderSourceARB(var2, var3);
      ARBShaderObjects.glCompileShaderARB(var2);
      if (!method_125(var2)) {
         var2 = 0;
      }

      return var2;
   }

   private int method_391(String var1) {
      int var2 = ARBShaderObjects.glCreateShaderObjectARB(35632);
      if (var2 == 0) {
         return 0;
      }

      String var3 = "#version 120\n";
      var3 = var3 + this.field_2177.field_1754.method_894();

      try {
         BufferedReader var5 = new BufferedReader(new InputStreamReader(Class100.method_1145(var1)));

         String var4;
         while ((var4 = var5.readLine()) != null) {
            var3 = var3 + var4 + "\n";
         }
      } catch (Exception var6) {
         System.out.println("Failed reading fragment shading code.");
         return 0;
      }

      ARBShaderObjects.glShaderSourceARB(var2, var3);
      ARBShaderObjects.glCompileShaderARB(var2);
      if (!method_125(var2)) {
         var2 = 0;
      }

      return var2;
   }

   private static boolean method_125(int var0) {
      IntBuffer var1 = BufferUtils.createIntBuffer(1);
      ARBShaderObjects.glGetObjectParameterARB(var0, 35716, var1);
      int var2 = var1.get();
      if (var2 > 1) {
         ByteBuffer var3 = BufferUtils.createByteBuffer(var2);
         ((Buffer)var1).flip();
         ARBShaderObjects.glGetInfoLogARB(var0, var1, var3);
         byte[] var4 = new byte[var2];
         var3.get(var4);
         String var5 = new String(var4);
         System.out.println("Info log:\n" + var5);
         return false;
      } else {
         return true;
      }
   }

   private int method_1258(int var1, int var2, boolean var3) {
      int var4 = GL11.glGenTextures();
      GL11.glBindTexture(3553, var4);
      if (var3) {
         ByteBuffer var5 = ByteBuffer.allocateDirect(var1 * var2 * 4 * 4);
         GL11.glTexImage2D(3553, 0, 6402, var1, var2, 0, 6402, 5126, var5);
      } else {
         ByteBuffer var6 = ByteBuffer.allocateDirect(var1 * var2 * 4);
         GL11.glTexImage2D(3553, 0, 6408, var1, var2, 0, 6408, 5121, var6);
      }

      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      return var4;
   }

   private void method_1352(int var1) {
      GL11.glDeleteTextures(var1);
   }

   public int method_1641(Minecraft var1) {
      if (this.field_217 == 0 || this.field_1074 != var1.field_2517 || this.field_2920 != var1.field_2477) {
         this.field_217 = this.method_1258(var1.field_2517, var1.field_2477, false);
         this.field_1074 = var1.field_2517;
         this.field_2920 = var1.field_2477;
      }

      return this.field_217;
   }

   public int method_638(Minecraft var1) {
      if (this.field_2873 == 0 || this.field_2181 != var1.field_2517 || this.field_657 != var1.field_2477) {
         this.field_2873 = this.method_1258(var1.field_2517, var1.field_2477, true);
         this.field_2181 = var1.field_2517;
         this.field_657 = var1.field_2477;
      }

      return this.field_2873;
   }

   public int method_1255(Minecraft var1) {
      if (this.field_896 == 0 || this.field_1778 != var1.field_2517 || this.field_1173 != var1.field_2477) {
         this.field_896 = this.method_1258(var1.field_2517, var1.field_2477, true);
         this.field_1778 = var1.field_2517;
         this.field_1173 = var1.field_2477;
      }

      return this.field_896;
   }

   public void method_692(Minecraft var1, float var2, float var3, float var4, float var5) {
      if (!var1.field_1754.field_359 && this.field_1867 != 0) {
         GL11.glBindTexture(3553, this.method_1641(var1));
         GL11.glCopyTexImage2D(3553, 0, 6408, 0, 0, var1.field_2517, var1.field_2477, 0);
         GL13.glActiveTexture(33985);
         GL11.glBindTexture(3553, this.method_638(var1));
         GL13.glActiveTexture(33986);
         GL11.glBindTexture(3553, this.method_1255(var1));
         GL13.glActiveTexture(33984);
         this.method_517(this.field_1867);
         int var6 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "sampler0");
         ARBShaderObjects.glUniform1iARB(var6, 0);
         int var7 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "sampler1");
         ARBShaderObjects.glUniform1iARB(var7, 1);
         int var8 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "sampler2");
         ARBShaderObjects.glUniform1iARB(var8, 2);
         int var9 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "aspectRatio");
         ARBShaderObjects.glUniform1fARB(var9, var1.field_2517 / var1.field_2477);
         int var10 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "near");
         ARBShaderObjects.glUniform1fARB(var10, 0.05F);
         int var11 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "far");
         ARBShaderObjects.glUniform1fARB(var11, var2);
         int var12 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "rand");
         ARBShaderObjects.glUniform1fARB(var12, this.field_839.nextFloat());
         int var13 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "lastMouseDist");
         ARBShaderObjects.glUniform1fARB(
            var13, var1.field_1883 != null ? 0.0F : (float)Math.abs(Math.sqrt(Math.pow(Class119.field_2234, 2.0) + Math.pow(Class119.field_339, 2.0)))
         );
         int var14 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "lastMouseX");
         ARBShaderObjects.glUniform1fARB(var14, Class119.field_2234);
         int var15 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "lastMouseY");
         ARBShaderObjects.glUniform1fARB(var15, Class119.field_339);
         int var16 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "playerPitchRot");
         ARBShaderObjects.glUniform1fARB(var16, var1.field_2787.field_2866);
         int var17 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "fovMod");
         ARBShaderObjects.glUniform1fARB(var17, var1.field_1754.field_133);
         int var18 = GL11.glGetInteger(2917);
         int var19 = ARBShaderObjects.glGetUniformLocationARB(this.field_1867, "fogMode");
         ARBShaderObjects.glUniform1iARB(var19, var18);
         GL11.glClearColor(var3, var4, var5, 0.0F);
         GL11.glClear(16384);
         GL11.glDisable(2929);
         GL11.glDisable(3042);
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0, var1.field_2517, var1.field_2477, 0.0, -1.0, 1.0);
         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         GL11.glBegin(7);
         GL11.glTexCoord2f(0.0F, 1.0F);
         GL11.glVertex3f(0.0F, 0.0F, 0.0F);
         GL11.glTexCoord2f(0.0F, 0.0F);
         GL11.glVertex3f(0.0F, var1.field_2477, 0.0F);
         GL11.glTexCoord2f(1.0F, 0.0F);
         GL11.glVertex3f(var1.field_2517, var1.field_2477, 0.0F);
         GL11.glTexCoord2f(1.0F, 1.0F);
         GL11.glVertex3f(var1.field_2517, 0.0F, 0.0F);
         GL11.glEnd();
         GL11.glEnable(2929);
         this.method_517(0);
      }
   }

   public static void method_1907(int var0, Minecraft var1) {
      GL11.glBindTexture(3553, var0);
      GL11.glCopyTexImage2D(3553, 0, 6402, 0, 0, var1.field_2517, var1.field_2477, 0);
   }
}
