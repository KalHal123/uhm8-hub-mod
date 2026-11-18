package ext;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;

public class Panel739 extends Panel {
   public Panel739(Class655 var1) {
      this.setBackground(new Color(3028036));
      this.setLayout(new BorderLayout());
      StringWriter var2 = new StringWriter();
      var1.field_1388.printStackTrace(new PrintWriter(var2));
      String var3 = var2.toString();
      String var4 = "";
      String var5 = "";

      try {
         var5 = var5 + "Generated " + new SimpleDateFormat().format(new Date()) + "\n";
         var5 = var5 + "\n";
         var5 = var5 + "Minecraft: Minecraft Alpha v1.1.2_01\n";
         var5 = var5 + "OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version") + "\n";
         var5 = var5 + "Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor") + "\n";
         var5 = var5
            + "VM: "
            + System.getProperty("java.vm.name")
            + " ("
            + System.getProperty("java.vm.info")
            + "), "
            + System.getProperty("java.vm.vendor")
            + "\n";
         var5 = var5 + "LWJGL: " + Sys.getVersion() + "\n";
         var4 = GL11.glGetString(7936);
         var5 = var5 + "OpenGL: " + GL11.glGetString(7937) + " version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936) + "\n";
      } catch (Throwable var9) {
         var5 = var5 + "[failed to get system properties (" + var9 + ")]\n";
      }

      var5 = var5 + "\n";
      var5 = var5 + var3;
      String var6 = "";
      var6 = var6 + "Mods loaded: " + (Class3.method_1418().size() + 1) + "\n";
      var6 = var6 + "ModLoader 0.0.1";

      for (Class274 var7 : Class3.method_1418()) {
         var6 = var6 + var7.getClass().getName() + " " + var7.method_677() + "\n";
      }

      var6 = var6 + "\n";
      var6 = var6 + "\n";
      if (var3.contains("Pixel format not accelerated")) {
         var6 = var6 + "      Bad video card drivers!      \n";
         var6 = var6 + "      -----------------------      \n";
         var6 = var6 + "\n";
         var6 = var6 + "Minecraft was unable to start because it failed to find an accelerated OpenGL mode.\n";
         var6 = var6 + "This can usually be fixed by updating the video card drivers.\n";
         var6 = var6
            + "If you're running the experimental Direct3D development branch and you're sure the drivers are installed, please report this to the bug tracker.\n";
         if (var4.toLowerCase().contains("nvidia")) {
            var6 = var6 + "\n";
            var6 = var6 + "You might be able to find drivers for your video card here:\n";
            var6 = var6 + "  https://www.nvidia.com/Download/index.aspx\n";
         } else if (var4.toLowerCase().contains("ati") || var4.toLowerCase().contains("amd")) {
            var6 = var6 + "\n";
            var6 = var6 + "You might be able to find drivers for your video card here:\n";
            var6 = var6 + "  https://www.amd.com/en/support\n";
         } else if (var4.toLowerCase().contains("4 series express")) {
            var6 = var6 + "\n";
            var6 = var6 + "This graphics card does not support OpenGL 2 and will not run the game.\n";
            var6 = var6 + "\n";
         } else if (var4.toLowerCase().contains("intel")) {
            var6 = var6 + "\n";
            var6 = var6 + "You might be able to find drivers for your video card here:\n";
            var6 = var6 + "  https://www.intel.com/content/www/us/en/download-center/home.html\n";
            var6 = var6 + "Do not expect the game to run well on your hardware.\n";
         } else if (var4.toLowerCase().contains("svga") || var4.toLowerCase().contains("llvm") || var4.toLowerCase().contains("virtualbox")) {
            var6 = var6 + "\n";
            var6 = var6 + "Install the guest OS extensions for your virtual machine.\n";
            var6 = var6 + "  (VMWare Tools, VirtualBox Guest Additions, etc.)\n";
         } else if (var4.toLowerCase().contains("microsoft basic")) {
            var6 = var6 + "\n";
            var6 = var6 + "Failed to detect your video card manufacturer.\n";
            var6 = var6 + "  *If you're using a laptop, search for drivers for your exact model number.\n";
            var6 = var6 + "  *If this is a virtual computer, please install the guest OS extensions for your VM software.\n";
         }
      } else {
         var6 = var6 + "      Minecraft has crashed!      \n";
         var6 = var6 + "      ----------------------      \n";
         var6 = var6 + "\n";
         var6 = var6 + "Minecraft has stopped running because it encountered a problem.\n";
         var6 = var6 + "\n";
         var6 = var6 + "If you wish to report this, please copy this entire text and email it to support@mojang.com.\n";
         var6 = var6 + "Please include a description of what you did when the error occured.\n";
      }

      var6 = var6 + "\n";
      var6 = var6 + "\n";
      var6 = var6 + "\n";
      var6 = var6 + "--- BEGIN ERROR REPORT " + Integer.toHexString(var6.hashCode()) + " --------\n";
      var6 = var6 + var5;
      var6 = var6 + "--- END ERROR REPORT " + Integer.toHexString(var6.hashCode()) + " ----------\n";
      var6 = var6 + "\n";
      var6 = var6 + "\n";
      TextArea var50 = new TextArea(var6, 0, 0, 1);
      var50.setFont(new Font("Monospaced", 0, 12));
      this.add(new Canvas281(), "North");
      this.add(new Canvas302(80), "East");
      this.add(new Canvas302(80), "West");
      this.add(new Canvas302(100), "South");
      this.add(var50, "Center");
   }
}
