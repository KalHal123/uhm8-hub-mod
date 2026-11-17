import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class 2ns3YCRSY82Ze9G4Xoznnc2lqhSjR29mGC2yArd5W2tpxeI2u2o2z92Tvm66l0QyoA6OFAQQYHy91VUk9r5944QmzD5LZY1YNnW0Jc {
   public static Logger 0J4M1MAl8JPF98H30R7UHBkpTw8n97f3VQw0OUg84COS3A72Pu6mr5D56vyV = Logger.getLogger("Minecraft");

   public static void _PTTJ3Ah35U03JjV405Sr0UbC01a6UdiIf5Oc61wx2C5SK34gpf9xFe2Flmu/* $VF was: 9PTTJ3Ah35U03JjV405Sr0UbC01a6UdiIf5Oc61wx2C5SK34gpf9xFe2Flmu */() {
      3jde46O5qCdL9M6pYp3x5f3z2v807P5qsOKL5485L35eK2jkXpHvTQ7J86k3s74gSJ1hlzwG9MNiPZ2pxcc6ENe6SoO2KyQTJGn var0 = new 3jde46O5qCdL9M6pYp3x5f3z2v807P5qsOKL5485L35eK2jkXpHvTQ7J86k3s74gSJ1hlzwG9MNiPZ2pxcc6ENe6SoO2KyQTJGn();
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
