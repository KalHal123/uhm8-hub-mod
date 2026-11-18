package ext;

import java.io.FileWriter;
import java.io.IOException;
import org.lwjgl.opengl.GL11;

public class Class597 {
   static FileWriter field_2382;

   public static void method_513() {
      method_1238("MINECRAFT EXTENSION 16.05 (MODIFICATION) GAME LOG");
      method_1238("This is the file you need to send to the bug tracker.");
      method_1238("Please add it as an attachment, do not copy it into a comment");
      method_1238("");
      method_1238("Game version:");
      method_1238("  -base: 1.1.2_01");
      method_1238("  -extension: 16.05 R4");
      method_1238("");
      String var0 = System.getProperty("os.arch");
      if (var0.contains("64")) {
         var0 = var0 + "(64-bit)";
      }

      method_1238("OS: " + System.getProperty("os.name") + " (" + var0 + ") [" + System.getProperty("os.version") + "]");
      method_1238("JVM: " + System.getProperty("java.version"));
      method_1238("");
      method_1238("Technical specification:");
      method_1238("CPU: <unsupported>");
      method_1238("GPU: " + GL11.glGetString(7937));
      method_1238("    - compatible API:");
      method_1238("      - OpenGL: " + GL11.glGetString(7938));
      method_1238("      - Direct3D: <unsupported>");
      method_1238("Memory: " + Runtime.getRuntime().maxMemory() / 1024L / 1024L + " MB");
      method_1238("");
      method_1238("");
      method_1238("###################################");
      method_1238("");
      method_883("Extension 16.05 init");
      method_883("Compilation mode:");
      method_883("  - debug output: MINIMAL");
      method_883("  - hub connections: DISABLED");
      method_883("Build without Direct3D support, launching in legacy OpenGL mode");
      method_883("Connection timed out");

      for (int var1 = 1; var1 != 6; var1++) {
         method_883("Reconnection attempt " + var1);
      }

      method_883("Connection failed. Launching in offline mode.");
      method_883("Unable to authenticate. You will only be able to play on local servers.");
   }

   public static void method_883(String var0) {
      try {
         if (field_2382 != null) {
            field_2382.write("[INFO] " + var0 + "\n");
         }

         System.out.println("[INFO] " + var0);
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   public static void method_195(String var0) {
      try {
         if (field_2382 != null) {
            field_2382.write("[WARN] " + var0 + "\n");
         }

         System.out.println("[WARN] " + var0);
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   public static void method_1238(String var0) {
      try {
         if (field_2382 != null) {
            field_2382.write(var0 + "\n");
         }

         System.out.println(var0);
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }
}
