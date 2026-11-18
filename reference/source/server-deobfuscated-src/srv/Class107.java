package srv;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class107 {
   public static Logger field_71 = Logger.getLogger("Minecraft");

   public static void method_982() {
      Formatter146 var0 = new Formatter146();
      field_71.setUseParentHandlers(false);
      ConsoleHandler var1 = new ConsoleHandler();
      var1.setFormatter(var0);
      field_71.addHandler(var1);

      try {
         FileHandler var2 = new FileHandler("server.log");
         var2.setFormatter(var0);
         field_71.addHandler(var2);
      } catch (Exception var3) {
         field_71.log(Level.WARNING, "Failed to log to server.log", var3);
      }
   }
}
