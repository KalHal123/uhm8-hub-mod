import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class 2YB9960LOPNMLAGHAAkdb5HH3At78KO17BgVoYj90Y0pPt2375Y5qqBd8107zKN0uj5gwgewBQzPmCW13Ma8Ny7B7R5oT2CVmYiV6 extends Thread {
   private static final AtomicInteger 25v90F03oZLQxN7NORAonH2dOwq2z1DfQXDyEAhB063Vq32DEF0ssC03glbk = new AtomicInteger(0);
   private static final Logger 21y47uh2KBqAqC0FawmD6PKZ4ZEc84rUI9x4k9O6tfI14Y7KmX5803582Ws1 = LogManager.getLogManager()
      .getLogger(
         7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
            7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.4Mn44antCz29B6GKYv6d2ZW6jUZp3xLB1XTEKn5O2h7Xzs27I617Goaxn8XY
         )
      );
   private final String 5z7eQfqngT2sx04afv9E1goB3KxJ6k50Uwq2h1LHAuGW22U1yGbSvKl0sdke;
   private final DatagramSocket 47yMoMF9Di80zBGrzwl3FS4491E7NMb0y3Lpj3waK69mye2klRCbql7pVkn6;
   private boolean 08695jCSjtyIcbPsmz6Qk6ja10v29PTb7ETF9f2YkQ8Api1uk3InCv4zm7yk = true;
   private final String 37MwudsB3Ja9rHtIB8RC8xg8uL2gF36r9446E8s51Z14Bdumb81blw5527p4;
   private static final String 4mk45X6r5UEKd9NM4ayjtmhKdX47kmeU11gYQ01exIoOa6NxO6s8P4WOCVX2 = "CL_00001137";

   public _YB9960LOPNMLAGHAAkdb5HH3At78KO17BgVoYj90Y0pPt2375Y5qqBd8107zKN0uj5gwgewBQzPmCW13Ma8Ny7B7R5oT2CVmYiV6/* $VF was: 2YB9960LOPNMLAGHAAkdb5HH3At78KO17BgVoYj90Y0pPt2375Y5qqBd8107zKN0uj5gwgewBQzPmCW13Ma8Ny7B7R5oT2CVmYiV6 */(
      String var1, String var2
   ) throws IOException {
      super("LanServerPinger #" + 25v90F03oZLQxN7NORAonH2dOwq2z1DfQXDyEAhB063Vq32DEF0ssC03glbk.incrementAndGet());
      this.5z7eQfqngT2sx04afv9E1goB3KxJ6k50Uwq2h1LHAuGW22U1yGbSvKl0sdke = var1;
      this.37MwudsB3Ja9rHtIB8RC8xg8uL2gF36r9446E8s51Z14Bdumb81blw5527p4 = var2;
      this.setDaemon(true);
      this.47yMoMF9Di80zBGrzwl3FS4491E7NMb0y3Lpj3waK69mye2klRCbql7pVkn6 = new DatagramSocket();
   }

   @Override
   public void run() {
      String var1 = _8Xi3luN1b4xSF11cs7C11n8p7C0W4Vn7neU9BB4jmdAHR19bL91Yhj1FfkD/* $VF was: 38Xi3luN1b4xSF11cs7C11n8p7C0W4Vn7neU9BB4jmdAHR19bL91Yhj1FfkD */(
         this.5z7eQfqngT2sx04afv9E1goB3KxJ6k50Uwq2h1LHAuGW22U1yGbSvKl0sdke, this.37MwudsB3Ja9rHtIB8RC8xg8uL2gF36r9446E8s51Z14Bdumb81blw5527p4
      );
      byte[] var2 = var1.getBytes();

      while (!this.isInterrupted() && this.08695jCSjtyIcbPsmz6Qk6ja10v29PTb7ETF9f2YkQ8Api1uk3InCv4zm7yk) {
         try {
            InetAddress var3 = InetAddress.getByName("224.0.2.60");
            DatagramPacket var4 = new DatagramPacket(var2, var2.length, var3, 4445);
            this.47yMoMF9Di80zBGrzwl3FS4491E7NMb0y3Lpj3waK69mye2klRCbql7pVkn6.send(var4);
         } catch (IOException var6) {
            21y47uh2KBqAqC0FawmD6PKZ4ZEc84rUI9x4k9O6tfI14Y7KmX5803582Ws1.log(Level.WARNING, "LanServerPinger: " + var6.getMessage());
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
      this.08695jCSjtyIcbPsmz6Qk6ja10v29PTb7ETF9f2YkQ8Api1uk3InCv4zm7yk = false;
   }

   public static String _8Xi3luN1b4xSF11cs7C11n8p7C0W4Vn7neU9BB4jmdAHR19bL91Yhj1FfkD/* $VF was: 38Xi3luN1b4xSF11cs7C11n8p7C0W4Vn7neU9BB4jmdAHR19bL91Yhj1FfkD */(
      String var0, String var1
   ) {
      return "[MOTD]" + var0 + "[/MOTD][AD]" + var1 + "[/AD]";
   }

   public static String _9V9sUb61z999BarE7i2lAf6nVJLWX1M71ysnHms7svRPio2p2T1awrUEUv1/* $VF was: 59V9sUb61z999BarE7i2lAf6nVJLWX1M71ysnHms7svRPio2p2T1awrUEUv1 */(
      String var0
   ) {
      int var1 = var0.indexOf("[MOTD]");
      if (var1 < 0) {
         return "missing no";
      }

      int var2 = var0.indexOf("[/MOTD]", var1 + "[MOTD]".length());
      return var2 < var1 ? "missing no" : var0.substring(var1 + "[MOTD]".length(), var2);
   }

   public static String _PoL1qkbQNTCzTZoW6zerx1fOqeZ7P9Oio4GWx6FL41Yd63766W47TzbEj51/* $VF was: 2PoL1qkbQNTCzTZoW6zerx1fOqeZ7P9Oio4GWx6FL41Yd63766W47TzbEj51 */(
      String var0
   ) {
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
