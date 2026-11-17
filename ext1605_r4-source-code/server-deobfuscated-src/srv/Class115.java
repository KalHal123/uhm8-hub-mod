package srv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Class115 {
   public static Class115 field_1584 = new Class115();
   public HashMap<String, byte[]> field_943 = new HashMap<>();
   boolean field_725 = false;

   private byte[] method_250(String var1) {
      if (!new File("./skins/" + var1 + ".png").exists()) {
         return null;
      }

      try {
         return Files.readAllBytes(Paths.get("./skins/" + var1 + ".png"));
      } catch (IOException var3) {
         return null;
      }
   }

   public byte[] method_492(String var1) {
      while (var1.charAt(0) == 1 || var1.charAt(0) == 2) {
         var1 = var1.substring(1);
      }

      while (this.field_725) {
         try {
            Thread.sleep(1L);
         } catch (InterruptedException var3) {
         }
      }

      this.field_725 = true;
      if (!this.field_943.containsKey(var1) || this.field_943.get(var1) == null) {
         byte[] var2 = this.method_250(var1);
         if (this.field_943.containsKey(var1)) {
            this.field_943.remove(var1);
         }

         if (var2 != null) {
            this.field_943.put(var1, var2);
         }
      }

      this.field_725 = false;
      return this.field_943.get(var1);
   }
}
