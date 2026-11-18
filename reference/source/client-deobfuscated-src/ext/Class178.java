package ext;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import org.lwjgl.Sys;

public class Class178 {
   private static final AtomicInteger field_57 = new AtomicInteger(0);
   private static final Logger field_2193 = LogManager.getLogManager().getLogger(Class614.method_1576(Class614.field_1474));
   private static final String field_2168 = "CL_00001133";

   public static class Inner222 {
      private final String field_1280;
      private final String field_2011;
      private long field_2288;
      private static final String field_121 = "CL_00001134";

      public Inner222(String var1, String var2) {
         this.field_1280 = var1;
         this.field_2011 = var2;
         this.field_2288 = Sys.getTime() * 1000L / Sys.getTimerResolution();
      }

      public String method_236() {
         return this.field_1280;
      }

      public String method_1711() {
         return this.field_2011;
      }

      public void method_34() {
         this.field_2288 = Sys.getTime() * 1000L / Sys.getTimerResolution();
      }
   }

   public static class Inner650 {
      private final ArrayList<Class178.Inner222> field_2804 = new ArrayList<>();
      boolean field_2703;
      private static final String field_1770 = "CL_00001136";

      public synchronized boolean method_985() {
         return this.field_2703;
      }

      public synchronized void method_188() {
         this.field_2703 = false;
      }

      public synchronized List<Class178.Inner222> method_979() {
         return Collections.unmodifiableList(this.field_2804);
      }

      public synchronized void method_1252(String var1, InetAddress var2) {
         String var3 = Thread207.method_1029(var1);
         String var4 = Thread207.method_487(var1);
         if (var4 != null) {
            var4 = var2.getHostAddress() + ":" + var4;
            boolean var5 = false;

            for (Class178.Inner222 var7 : this.field_2804) {
               if (var7.method_1711().equals(var4)) {
                  var7.method_34();
                  var5 = true;
                  break;
               }
            }

            if (!var5) {
               this.field_2804.add(new Class178.Inner222(var3, var4));
               this.field_2703 = true;
            }
         }
      }
   }

   public static class Inner670 extends Thread {
      private final Class178.Inner650 field_1759;
      private final InetAddress field_1895;
      private final MulticastSocket field_3008;
      private static final String field_2983 = "CL_00001135";

      public Inner670(Class178.Inner650 var1) throws IOException {
         super("LanServerDetector #" + Class178.field_57.incrementAndGet());
         this.field_1759 = var1;
         this.setDaemon(true);
         this.field_3008 = new MulticastSocket(4445);
         this.field_1895 = InetAddress.getByName("224.0.2.60");
         this.field_3008.setSoTimeout(5000);
         this.field_3008.joinGroup(this.field_1895);
      }

      @Override
      public void run() {
         byte[] var1 = new byte[1024];

         while (!this.isInterrupted()) {
            DatagramPacket var2 = new DatagramPacket(var1, var1.length);

            try {
               this.field_3008.receive(var2);
            } catch (SocketTimeoutException var5) {
               continue;
            } catch (IOException var6) {
               Class178.field_2193.log(Level.SEVERE, "Couldn't ping server", var6);
               break;
            }

            String var3 = new String(var2.getData(), var2.getOffset(), var2.getLength());
            Class178.field_2193.log(Level.FINEST, var2.getAddress() + ": " + var3);
            this.field_1759.method_1252(var3, var2.getAddress());
         }

         try {
            this.field_3008.leaveGroup(this.field_1895);
         } catch (IOException var4) {
         }

         this.field_3008.close();
      }
   }
}
