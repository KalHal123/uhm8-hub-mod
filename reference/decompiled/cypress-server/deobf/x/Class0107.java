package x;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class0107 {
   public static Logger 0J4M1MAl8JPF98H30R7UHBkpTw8n97f3VQw0OUg84COS3A72Pu6mr5D56vyV = Logger.getLogger("Minecraft");

   public static void _PTTJ3Ah35U03JjV405Sr0UbC01a6UdiIf5Oc61wx2C5SK34gpf9xFe2Flmu/* $VF was: 9PTTJ3Ah35U03JjV405Sr0UbC01a6UdiIf5Oc61wx2C5SK34gpf9xFe2Flmu */() {
      Class0148 var0 = new Class0148();
      0J4M1MAl8JPF98H30R7UHBkpTw8n97f3VQw0OUg84COS3A72Pu6mr5D56vyV.setUseParentHandlers(false);
      ConsoleHandler var1 = new ConsoleHandler();
      var1.setFormatter(var0);
      0J4M1MAl8JPF98H30R7UHBkpTw8n97f3VQw0OUg84COS3A72Pu6mr5D56vyV.addHandler(var1);

      try {
         FileHandler var2 = new FileHandler("server.log");
         var2.setFormatter(var0);
         0J4M1MAl8JPF98H30R7UHBkpTw8n97f3VQw0OUg84COS3A72Pu6mr5D56vyV.addHandler(var2);
      } catch (Exception var3) {
         0J4M1MAl8JPF98H30R7UHBkpTw8n97f3VQw0OUg84COS3A72Pu6mr5D56vyV.log(Level.WARNING, "Failed to log to server.log", var3);
      }
   }
}
