package ext;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Thread207 extends Thread {
   private static final AtomicInteger field_711 = new AtomicInteger(0);
   private static final Logger field_676 = LogManager.getLogManager().getLogger(Class614.method_1576(Class614.field_1474));
   private final String field_1922;
   private final DatagramSocket field_1404;
   private boolean field_107 = true;
   private final String field_1064;
   private static final String field_1560 = "CL_00001137";

   public Thread207(String var1, String var2) throws IOException {
      super("LanServerPinger #" + field_711.incrementAndGet());
      this.field_1922 = var1;
      this.field_1064 = var2;
      this.setDaemon(true);
      this.field_1404 = new DatagramSocket();
   }

   @Override
   public void run() {
      String var1 = method_654(this.field_1922, this.field_1064);
      byte[] var2 = var1.getBytes();

      while (!this.isInterrupted() && this.field_107) {
         try {
            InetAddress var3 = InetAddress.getByName("224.0.2.60");
            DatagramPacket var4 = new DatagramPacket(var2, var2.length, var3, 4445);
            this.field_1404.send(var4);
         } catch (IOException var6) {
            field_676.log(Level.WARNING, "LanServerPinger: " + var6.getMessage());
            break;
         }

         try {
            sleep(1500L);
         } catch (InterruptedException var5) {
         }
      }
   }

   @Override
   public void interrupt() {
      super.interrupt();
      this.field_107 = false;
   }

   public static String method_654(String var0, String var1) {
      return "[MOTD]" + var0 + "[/MOTD][AD]" + var1 + "[/AD]";
   }

   public static String method_1029(String var0) {
      int var1 = var0.indexOf("[MOTD]");
      if (var1 < 0) {
         return "missing no";
      }

      int var2 = var0.indexOf("[/MOTD]", var1 + "[MOTD]".length());
      return var2 < var1 ? "missing no" : var0.substring(var1 + "[MOTD]".length(), var2);
   }

   public static String method_487(String var0) {
      int var1 = var0.indexOf("[/MOTD]");
      if (var1 < 0) {
         return null;
      }

      int var2 = var0.indexOf("[/MOTD]", var1 + "[/MOTD]".length());
      if (var2 >= 0) {
         return null;
      }

      int var3 = var0.indexOf("[AD]", var1 + "[/MOTD]".length());
      if (var3 < 0) {
         return null;
      }

      int var4 = var0.indexOf("[/AD]", var3 + "[AD]".length());
      return var4 < var3 ? null : var0.substring(var3 + "[AD]".length(), var4);
   }
}
