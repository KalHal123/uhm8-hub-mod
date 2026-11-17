package ext;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import net.minecraft.client.Minecraft;

public abstract class Class65 {
   private boolean field_2734 = false;

   public abstract String method_86();

   public abstract boolean method_872(Object... var1);

   public abstract String method_851();

   public abstract String method_497();

   public abstract String method_207();

   public void method_948() {
      if (!this.field_2734) {
         File var1 = new File(Minecraft.method_1379(), "/texturepacks/" + this.method_851() + ".zip");
         if (var1.exists()) {
            this.field_2734 = true;
         } else {
            try {
               Class119.field_1519.field_964.field_936.method_1305("Unlocked: " + this.method_497() + "\n(" + this.method_207() + ")", 5000);
               InputStream var2 = Class100.method_1145(this.method_86());
               Files.copy(var2, Paths.get(var1.getPath()), StandardCopyOption.REPLACE_EXISTING);
               var2.close();
               this.field_2734 = true;
            } catch (IOException var3) {
               Class597.method_195("Deploy " + this.method_851() + " failed");
               var3.printStackTrace();
            }
         }
      }
   }
}
