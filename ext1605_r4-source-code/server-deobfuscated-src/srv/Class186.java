package srv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;

public class Class186 {
   public static Logger field_910 = Logger.getLogger("Minecraft");
   private File field_134;

   public Class186(File var1) {
      this.field_134 = var1;
      var1.mkdir();
   }

   public void method_702(Class188 var1) {
      try {
         Class100 var2 = new Class100();
         var1.method_582(var2);
         File var3 = new File(this.field_134, "_tmp_.dat");
         File var4 = new File(this.field_134, var1.method_8() + ".dat");
         Class165.method_734(var2, new FileOutputStream(var3));
         if (var4.exists()) {
            var4.delete();
         }

         var3.renameTo(var4);
      } catch (Exception var5) {
         field_910.warning("Failed to save player data for " + var1.field_1477);
      }
   }

   public void method_634(Class188 var1) {
      try {
         File var2 = new File(this.field_134, var1.method_8() + ".dat");
         if (var2.exists()) {
            Class100 var3 = Class165.method_562(new FileInputStream(var2));
            if (var3 != null) {
               var1.method_680(var3);
            }
         }
      } catch (Exception var4) {
         field_910.warning("Failed to load player data for " + var1.field_1477);
      }
   }
}
