package srv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class7 {
   public static Logger field_879 = Logger.getLogger("Minecraft");
   private Properties field_263 = new Properties();
   private File field_92;

   public Class7(File var1) {
      this.field_92 = var1;
      if (var1.exists()) {
         try {
            this.field_263.load(new FileInputStream(var1));
         } catch (Exception var3) {
            field_879.log(Level.WARNING, "Failed to load " + var1, var3);
            this.method_451();
         }
      } else {
         field_879.log(Level.WARNING, var1 + " does not exist");
         this.method_451();
      }
   }

   public void method_451() {
      field_879.log(Level.INFO, "Generating new properties file");
      this.method_168();
   }

   public void method_168() {
      try {
         this.field_263.store(new FileOutputStream(this.field_92), "Minecraft server properties");
      } catch (Exception var2) {
         field_879.log(Level.WARNING, "Failed to save " + this.field_92, var2);
         this.method_451();
      }
   }

   public String method_708(String var1, String var2) {
      if (!this.field_263.containsKey(var1)) {
         this.field_263.setProperty(var1, var2);
         this.method_168();
      }

      return this.field_263.getProperty(var1, var2);
   }

   public int method_296(String var1, int var2) {
      try {
         return Integer.parseInt(this.method_708(var1, "" + var2));
      } catch (Exception var4) {
         this.field_263.setProperty(var1, "" + var2);
         return var2;
      }
   }

   public boolean method_284(String var1, boolean var2) {
      try {
         return Boolean.parseBoolean(this.method_708(var1, "" + var2));
      } catch (Exception var4) {
         this.field_263.setProperty(var1, "" + var2);
         return var2;
      }
   }

   public boolean method_863(String var1, boolean var2) {
      try {
         return Boolean.parseBoolean(this.method_414(var1, "" + var2));
      } catch (Exception var4) {
         return var2;
      }
   }

   public String method_414(String var1, String var2) {
      return this.field_263.getProperty(var1, var2);
   }
}
