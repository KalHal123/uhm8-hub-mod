package ext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import net.minecraft.client.Minecraft;

public class Class218 {
   public boolean field_2923 = true;
   public boolean field_345 = false;
   public boolean field_531 = false;
   public int field_2947 = 8961023;
   public int field_1330 = 0;

   public static Class218 method_933(InputStream var0) {
      Class218 var1 = new Class218();
      BufferedReader var2 = new BufferedReader(new InputStreamReader(var0));

      try {
         for (String var3 = var2.readLine(); var3 != null; var3 = var2.readLine()) {
            if (var3.startsWith("+ext1605.update-fx-textures=")) {
               var1.field_2923 = var3.substring(var3.indexOf(61) + 1).equals("1");
            } else if (var3.startsWith("+ext1605.no-biomes=")) {
               var1.field_345 = var3.substring(var3.indexOf(61) + 1).equals("1");
            } else if (var3.startsWith("+ext1605.bilinear=")) {
               var1.field_531 = var3.substring(var3.indexOf(61) + 1).equals("1");
            } else if (var3.startsWith("+ext1605.color-sky-day=#")) {
               try {
                  var1.field_2947 = Integer.parseInt(var3.substring(var3.indexOf(61) + 2), 16);
               } catch (NumberFormatException var6) {
                  Class597.method_195("[TexPack] '+ext1605.color-sky-day' invalid color argument (not #RRGGBB)");
               }
            } else if (var3.startsWith("+ext1605.color-sky-night=#")) {
               try {
                  var1.field_1330 = Integer.parseInt(var3.substring(var3.indexOf(61) + 2), 16);
               } catch (NumberFormatException var5) {
                  Class597.method_195("[TexPack] '+ext1605.color-sky-night' invalid color argument (not #RRGGBB)");
               }
            }
         }

         var2.close();
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      return var1;
   }

   public void method_909(Minecraft var1) {
      Minecraft.field_2639 = this.field_2923;
      Class310.field_2660 = this.field_345;
      Class310.field_1409 = this.field_531;
      if (var1.field_2648 != null) {
         var1.field_2648.field_949 = this.field_2947;
         var1.field_2648.field_2136 = this.field_1330;
      }
   }
}
