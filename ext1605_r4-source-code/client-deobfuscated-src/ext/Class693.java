package ext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class Class693 {
   private static final String[] field_652 = new String[]{"HORIZON", "FAR", "NORMAL", "SHORT", "TINY", "DUALITY"};
   private static final String[] field_2417 = new String[]{"Peaceful", "Easy", "Normal", "Hard", "Frail"};
   private static final String[] field_77 = new String[]{"FAST", "FANCY", "MAX PERF."};
   public float field_1924 = 1.0F;
   public float field_299 = 1.0F;
   public float field_1309 = 0.5F;
   public boolean field_55 = false;
   public int field_2733 = 1;
   public boolean field_379 = true;
   public boolean field_359 = false;
   public boolean field_1324 = false;
   public int field_674 = 1;
   public boolean field_6 = true;
   public float field_133 = 0.5F;
   public String field_1832 = "Default";
   public Class566 field_2436 = new Class566("Forward", 17);
   public Class566 field_1509 = new Class566("Left", 30);
   public Class566 field_1203 = new Class566("Back", 31);
   public Class566 field_2548 = new Class566("Right", 32);
   public Class566 field_922 = new Class566("Jump", 57);
   public Class566 field_1301 = new Class566("Inventory", 18);
   public Class566 field_857 = new Class566("Drop", 16);
   public Class566 field_2809 = new Class566("Chat", 20);
   public Class566 field_2797 = new Class566("Toggle fog", 33);
   public Class566 field_1386 = new Class566("Sneak", 29);
   public Class566 field_2828 = new Class566("Dash", 42);
   public Class566 field_340 = new Class566("Open console", 41);
   public Class566[] field_1038 = new Class566[]{
      this.field_2436,
      this.field_1509,
      this.field_1203,
      this.field_2548,
      this.field_922,
      this.field_1386,
      this.field_857,
      this.field_1301,
      this.field_2809,
      this.field_2797,
      this.field_2828,
      this.field_340
   };
   protected Minecraft field_837;
   private File field_2074;
   public int field_1286 = 12;
   public int field_2564 = 2;
   public boolean field_1955 = false;
   public boolean field_712 = false;
   public int field_421 = 2;
   public boolean field_3011 = true;
   public boolean field_825 = true;
   public boolean field_1569 = true;
   public boolean field_2955 = true;

   public Class693(Minecraft var1, File var2) {
      if (var1.method_457().toLowerCase().contains("nvidia")) {
         field_652[5] = "Silent Dream";
      }

      this.field_837 = var1;
      this.field_2074 = new File(var2, "options.txt");
      this.method_153();
   }

   public Class693() {
   }

   public String method_1584(int var1) {
      return this.field_1038[var1].field_115 + ": " + Keyboard.getKeyName(this.field_1038[var1].field_2381);
   }

   public void method_795(int var1, int var2) {
      this.field_1038[var1].field_2381 = var2;
      this.method_1024();
   }

   public void method_781(int var1, float var2) {
      if (var1 == 0) {
         this.field_1924 = var2;
         this.field_837.field_485.method_729();
      }

      if (var1 == 1) {
         this.field_299 = var2;
         this.field_837.field_485.method_729();
      }

      if (var1 == 3) {
         this.field_1309 = var2;
      }

      if (var1 == 11) {
         this.field_133 = var2;
      }
   }

   public void method_1810(int var1, int var2) {
      if (var1 == 2) {
         this.field_55 = !this.field_55;
      }

      if (var1 == 4) {
         this.field_2733 = (this.field_2733 + var2) % 6;
         if (this.field_2733 < 0) {
            this.field_2733 = !GL11.glGetString(7937).toLowerCase().contains("graphics media")
                  && !GL11.glGetString(7937).toLowerCase().contains("4 series express")
               ? 5
               : 4;
         }
      }

      if (var1 == 5) {
         this.field_379 = !this.field_379;
      }

      if (var1 == 6) {
         this.field_359 = !this.field_359;
         this.field_837.field_2176.method_1759();
      }

      if (var1 == 7) {
         this.field_1324 = !this.field_1324;
         Display.setVSyncEnabled(this.field_1324);
      }

      if (var1 == 8) {
         this.field_2564 = (this.field_2564 + var2) % 5;
         System.out.println("Difficulty is now " + this.field_2564);
      }

      if (var1 == 9) {
         this.field_674--;
         if (this.field_674 < 0) {
            this.field_674 = 2;
         }

         if (this.field_837.field_2648 != null) {
            this.field_837.field_1265.method_934();
         }
      }

      if (var1 == 10) {
         this.field_6 = !this.field_6;
      }

      if (var1 == 12) {
         this.field_712 = !this.field_712;
      }

      if (var1 == 20) {
         this.field_421++;
         this.field_421 %= 3;
         this.field_837.field_267.method_1923();
      }

      if (var1 == 21) {
         this.field_3011 = !this.field_3011;
         this.field_837.field_267.method_1923();
      }

      if (var1 == 22) {
         this.field_2955 = !this.field_2955;
         this.field_837.field_267.method_1923();
      }

      if (var1 == 23) {
         this.field_1569 = !this.field_1569;
         this.field_837.field_267.method_1923();
      }

      if (var1 == 24) {
         this.field_825 = !this.field_825;
         this.field_837.field_267.method_1923();
      }

      this.method_1024();
   }

   public int method_761(int var1) {
      return var1 == 0 ? 1 : (var1 == 1 ? 1 : (var1 == 3 ? 1 : (var1 == 11 ? 1 : 0)));
   }

   public float method_880(int var1) {
      return var1 == 0 ? this.field_1924 : (var1 == 1 ? this.field_299 : (var1 == 3 ? this.field_1309 : (var1 == 11 ? this.field_133 : 0.0F)));
   }

   public String method_1698(int var1) {
      return var1 == 0
         ? "Music: " + (this.field_1924 > 0.0F ? (int)(this.field_1924 * 100.0F) + "%" : "OFF")
         : (
            var1 == 1
               ? "Sound: " + (this.field_299 > 0.0F ? (int)(this.field_299 * 100.0F) + "%" : "OFF")
               : (
                  var1 == 2
                     ? "Invert mouse: " + (this.field_55 ? "ON" : "OFF")
                     : (
                        var1 == 3
                           ? (
                              this.field_1309 == 0.0F
                                 ? "Sensitivity: *yawn*"
                                 : (this.field_1309 == 1.0F ? "Sensitivity: HYPERSPEED!!!" : "Sensitivity: " + (int)(this.field_1309 * 200.0F) + "%")
                           )
                           : (
                              var1 == 4
                                 ? "Render distance: " + field_652[this.field_2733]
                                 : (
                                    var1 == 5
                                       ? "View bobbing: " + (this.field_379 ? "ON" : "OFF")
                                       : (
                                          var1 == 6
                                             ? "3d anaglyph: " + (this.field_359 ? "ON" : "OFF")
                                             : (
                                                var1 == 7
                                                   ? "Vertical sync: " + (this.field_1324 ? "ON" : "OFF")
                                                   : (
                                                      var1 == 8
                                                         ? "Difficulty: " + field_2417[this.field_2564]
                                                         : (
                                                            var1 == 9
                                                               ? "Graphics: " + field_77[this.field_674]
                                                               : (
                                                                  var1 == 10
                                                                     ? "Pause on unfocus: " + (this.field_6 ? "ON" : "OFF")
                                                                     : (
                                                                        var1 == 11
                                                                           ? "FOV: " + (this.field_133 > 0.5 ? "+" : "") + (int)((this.field_133 - 0.5) * 80.0)
                                                                           : (
                                                                              var1 == 12
                                                                                 ? "Shaders: " + (this.field_712 ? "ON" : "OFF")
                                                                                 : (
                                                                                    var1 == 100
                                                                                       ? "Edit controls..."
                                                                                       : (
                                                                                          var1 == 101
                                                                                             ? "Set Visuals..."
                                                                                             : (
                                                                                                var1 == 20
                                                                                                   ? "Sh. Motion Blur: "
                                                                                                      + (
                                                                                                         this.field_421 == 2
                                                                                                            ? "QUALITY"
                                                                                                            : (this.field_421 == 1 ? "PERF." : "OFF")
                                                                                                      )
                                                                                                   : (
                                                                                                      var1 == 21
                                                                                                         ? "Sh. Depth of Field: "
                                                                                                            + (this.field_3011 ? "ON" : "OFF")
                                                                                                         : (
                                                                                                            var1 == 22
                                                                                                               ? "Sh. Anti Aliasing: "
                                                                                                                  + (this.field_2955 ? "ON" : "OFF")
                                                                                                               : (
                                                                                                                  var1 == 23
                                                                                                                     ? "Sh. Bloom: "
                                                                                                                        + (this.field_1569 ? "ON" : "OFF")
                                                                                                                     : (
                                                                                                                        var1 == 24
                                                                                                                           ? "Sh. SSR (BROKEN): "
                                                                                                                              + (this.field_825 ? "ON" : "OFF")
                                                                                                                           : ""
                                                                                                                     )
                                                                                                               )
                                                                                                         )
                                                                                                   )
                                                                                             )
                                                                                       )
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   public void method_153() {
      try {
         if (!this.field_2074.exists()) {
            return;
         }

         BufferedReader var1 = new BufferedReader(new FileReader(this.field_2074));
         String var2 = "";

         while ((var2 = var1.readLine()) != null) {
            String[] var3 = var2.split(":");
            if (var3[0].equals("music")) {
               this.field_1924 = this.method_1373(var3[1]);
            }

            if (var3[0].equals("sound")) {
               this.field_299 = this.method_1373(var3[1]);
            }

            if (var3[0].equals("mouseSensitivity")) {
               this.field_1309 = this.method_1373(var3[1]);
            }

            if (var3[0].equals("invertYMouse")) {
               this.field_55 = var3[1].equals("true");
            }

            if (var3[0].equals("viewDistance")) {
               this.field_2733 = Integer.parseInt(var3[1]);
            }

            if (var3[0].equals("bobView")) {
               this.field_379 = var3[1].equals("true");
            }

            if (var3[0].equals("anaglyph3d")) {
               this.field_359 = var3[1].equals("true");
            }

            if (var3[0].equals("limitFramerate")) {
               this.field_1324 = var3[1].equals("true");
            }

            if (var3[0].equals("difficulty")) {
               this.field_2564 = Integer.parseInt(var3[1]);
            }

            if (var3[0].equals("gxMode")) {
               this.field_674 = Integer.parseInt(var3[1]);
            }

            if (var3[0].equals("pauseOnUnfocus")) {
               this.field_6 = var3[1].equals("true");
            }

            if (var3[0].equals("fovMod")) {
               this.field_133 = this.method_1373(var3[1]);
            }

            if (var3[0].equals("skin")) {
               this.field_1832 = var3[1];
            }

            if (var3[0].equals("shadersOn")) {
               this.field_712 = var3[1].equals("true");
            }

            if (var3[0].equals("shadersDOF")) {
               this.field_3011 = var3[1].equals("true");
            }

            if (var3[0].equals("shadersAA")) {
               this.field_2955 = var3[1].equals("true");
            }

            if (var3[0].equals("shadersBloom")) {
               this.field_1569 = var3[1].equals("true");
            }

            if (var3[0].equals("shadersSSR")) {
               this.field_825 = var3[1].equals("true");
            }

            if (var3[0].equals("shadersMotionBlur")) {
               this.field_421 = Integer.parseInt(var3[1]);
            }

            for (int var4 = 0; var4 < this.field_1038.length; var4++) {
               if (var3[0].equals("key_" + this.field_1038[var4].field_115)) {
                  this.field_1038[var4].field_2381 = Integer.parseInt(var3[1]);
               }
            }
         }

         var1.close();
      } catch (Exception var5) {
         System.out.println("Failed to load options");
         var5.printStackTrace();
      }
   }

   private float method_1373(String var1) {
      return var1.equals("true") ? 1.0F : (var1.equals("false") ? 0.0F : Float.parseFloat(var1));
   }

   public void method_1024() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.field_2074));
         var1.println("music:" + this.field_1924);
         var1.println("sound:" + this.field_299);
         var1.println("invertYMouse:" + this.field_55);
         var1.println("mouseSensitivity:" + this.field_1309);
         var1.println("viewDistance:" + this.field_2733);
         var1.println("bobView:" + this.field_379);
         var1.println("anaglyph3d:" + this.field_359);
         var1.println("limitFramerate:" + this.field_1324);
         var1.println("difficulty:" + this.field_2564);
         var1.println("gxMode:" + this.field_674);
         var1.println("pauseOnUnfocus:" + this.field_6);
         var1.println("fovMod:" + this.field_133);
         var1.println("skin:" + this.field_1832);
         var1.println("shadersOn:" + this.field_712);
         var1.println("shadersSSR:" + this.field_825);
         var1.println("shadersDOF:" + this.field_3011);
         var1.println("shadersAA:" + this.field_2955);
         var1.println("shadersBloom:" + this.field_1569);
         var1.println("shadersMotionBlur:" + this.field_421);

         for (int var2 = 0; var2 < this.field_1038.length; var2++) {
            var1.println("key_" + this.field_1038[var2].field_115 + ":" + this.field_1038[var2].field_2381);
         }

         var1.close();
      } catch (Exception var3) {
         System.out.println("Failed to save options");
         var3.printStackTrace();
      }
   }

   public String method_894() {
      String var1 = "";
      var1 = var1 + (this.field_3011 ? "#define DOF_ENABLED\n" : "");
      var1 = var1 + (this.field_825 ? "#define SSR_ENABLED\n" : "");
      var1 = var1 + (this.field_2955 ? "#define AA_ENABLED\n" : "");
      var1 = var1 + (this.field_1569 ? "#define BLOOM_ENABLED\n" : "");
      return var1 + "#define MOTIONBLUR_ENABLED " + this.field_421 + "\n";
   }
}
