package x;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Class0116 {
   public static Class0116 9r4z2maBPOzeIQ41jM97J0sS7rNpO25b195UXkI1F7UjreZ3kMZ31B30P17t = new Class0116();
   public HashMap<String, byte[]> 5o60KlO1xUVp1Sqi5M3Xl323zQGPwj5kI3zOp7nP6YxUrJv7XCA1pH7U5nza = new HashMap<>();
   boolean 4W6wg4b7pZeB7tEBJ09JO08IAio0MMBOrsVf7o7pGdYaBFEqDYCM48V83Lj5 = false;

   private byte[] _XyX45E63yjcT140DFSv0fu1xy86sP4ASYS2MGXuLt775341L029jzLOlIqm/* $VF was: 2XyX45E63yjcT140DFSv0fu1xy86sP4ASYS2MGXuLt775341L029jzLOlIqm */(
      String var1
   ) {
      if (!new File("./skins/" + var1 + ".png").exists()) {
         return null;
      }

      try {
         return Files.readAllBytes(Paths.get("./skins/" + var1 + ".png"));
      } catch (IOException var3) {
         return null;
      }
   }

   public byte[] _v4pMf3596FO71g04LS5DR738V0b0e9j59y5wCjSLyqx9Uxd231116vUL4le/* $VF was: 4v4pMf3596FO71g04LS5DR738V0b0e9j59y5wCjSLyqx9Uxd231116vUL4le */(
      String var1
   ) {
      while (var1.charAt(0) == 1 || var1.charAt(0) == 2) {
         var1 = var1.substring(1);
      }

      while (this.4W6wg4b7pZeB7tEBJ09JO08IAio0MMBOrsVf7o7pGdYaBFEqDYCM48V83Lj5) {
         try {
            Thread.sleep(1L);
         } catch (InterruptedException var3) {
         }
      }

      this.4W6wg4b7pZeB7tEBJ09JO08IAio0MMBOrsVf7o7pGdYaBFEqDYCM48V83Lj5 = true;
      if (!this.5o60KlO1xUVp1Sqi5M3Xl323zQGPwj5kI3zOp7nP6YxUrJv7XCA1pH7U5nza.containsKey(var1)
         || this.5o60KlO1xUVp1Sqi5M3Xl323zQGPwj5kI3zOp7nP6YxUrJv7XCA1pH7U5nza.get(var1) == null) {
         byte[] var2 = this._XyX45E63yjcT140DFSv0fu1xy86sP4ASYS2MGXuLt775341L029jzLOlIqm/* $VF was: 2XyX45E63yjcT140DFSv0fu1xy86sP4ASYS2MGXuLt775341L029jzLOlIqm */(
            var1
         );
         if (this.5o60KlO1xUVp1Sqi5M3Xl323zQGPwj5kI3zOp7nP6YxUrJv7XCA1pH7U5nza.containsKey(var1)) {
            this.5o60KlO1xUVp1Sqi5M3Xl323zQGPwj5kI3zOp7nP6YxUrJv7XCA1pH7U5nza.remove(var1);
         }

         if (var2 != null) {
            this.5o60KlO1xUVp1Sqi5M3Xl323zQGPwj5kI3zOp7nP6YxUrJv7XCA1pH7U5nza.put(var1, var2);
         }
      }

      this.4W6wg4b7pZeB7tEBJ09JO08IAio0MMBOrsVf7o7pGdYaBFEqDYCM48V83Lj5 = false;
      return this.5o60KlO1xUVp1Sqi5M3Xl323zQGPwj5kI3zOp7nP6YxUrJv7XCA1pH7U5nza.get(var1);
   }
}
