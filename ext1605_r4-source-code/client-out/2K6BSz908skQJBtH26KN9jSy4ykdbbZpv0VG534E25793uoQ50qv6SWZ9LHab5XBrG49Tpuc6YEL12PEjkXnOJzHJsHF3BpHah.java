import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class 2K6BSz908skQJBtH26KN9jSy4ykdbbZpv0VG534E25793uoQ50qv6SWZ9LHab5XBrG49Tpuc6YEL12PEjkXnOJzHJsHF3BpHah {
   public DatagramSocket 9k1m6FM6zNe1rxiKYSKFnYXi45RTPm5EOYMPO06e34ok1v0m75Jmu2i07BSV;
   public int 9cw86JLkA3P3gG9c1Z88IOUhAAi89go0ls61AplsE85jyCXV26B50gfz5W0d = -1;
   public InetAddress 27SBRgDbLk338W3h2IIhC6SL8m3MFlPy8WI6lJzm3c7JfFpBxClvecOmMZ2a;
   public boolean 3SfLN1543P0ml4pta5CS4R3Rem6kVRv1XepV3n5z2L2n5cts105m3QwdNv6x = false;

   public boolean _a785TtBsd400pIGHe9aK9D6cXQV88kNRbOx5800sRQvJWuun8Vv2KY34od4/* $VF was: 4a785TtBsd400pIGHe9aK9D6cXQV88kNRbOx5800sRQvJWuun8Vv2KY34od4 */() {
      File var1 = new File("C:\\Temp\\DualSenseX\\DualSenseX_PortNumber.txt");

      try {
         Scanner var2 = new Scanner(var1);
         if (!var2.hasNextInt()) {
            var2.close();
            return false;
         }

         this.9cw86JLkA3P3gG9c1Z88IOUhAAi89go0ls61AplsE85jyCXV26B50gfz5W0d = var2.nextInt();
         var2.close();
      } catch (FileNotFoundException var5) {
         return false;
      }

      try {
         this.27SBRgDbLk338W3h2IIhC6SL8m3MFlPy8WI6lJzm3c7JfFpBxClvecOmMZ2a = InetAddress.getByName("localhost");
         this.9k1m6FM6zNe1rxiKYSKFnYXi45RTPm5EOYMPO06e34ok1v0m75Jmu2i07BSV = new DatagramSocket();
      } catch (UnknownHostException var3) {
         return false;
      } catch (SocketException var4) {
         return false;
      }

      this.3SfLN1543P0ml4pta5CS4R3Rem6kVRv1XepV3n5z2L2n5cts105m3QwdNv6x = true;
      return true;
   }

   public void _y9T0VKsM37E6e63s1CpUw59K1P7V8qLqw1h6MQ7h8c7lb47rdD7bA1EbDJR/* $VF was: 2y9T0VKsM37E6e63s1CpUw59K1P7V8qLqw1h6MQ7h8c7lb47rdD7bA1EbDJR */() {
      this.9k1m6FM6zNe1rxiKYSKFnYXi45RTPm5EOYMPO06e34ok1v0m75Jmu2i07BSV.close();
      this.3SfLN1543P0ml4pta5CS4R3Rem6kVRv1XepV3n5z2L2n5cts105m3QwdNv6x = false;
   }

   public boolean _I859SHZOuzv7NVAcMH976Q5YdBAP6zr4BkvN4pMsUme8hj2C9mpLzoY0gb3/* $VF was: 1I859SHZOuzv7NVAcMH976Q5YdBAP6zr4BkvN4pMsUme8hj2C9mpLzoY0gb3 */(
      1R51ezJ13hVh9LYd2kb78mW4C4n10YVsiVDul8uD715n45xlR8xsre9DFEtCXF7PydAMM88PMSWND89887lK2ceMES64S1 var1
   ) {
      if (!this.3SfLN1543P0ml4pta5CS4R3Rem6kVRv1XepV3n5z2L2n5cts105m3QwdNv6x) {
         return false;
      }

      byte[] var2 = var1._7znPKCd5E9OEsL93cV0qJ8sLQxRt2r07yQ5SwKo1ctXUEjeA1tPFNiOy8Ns/* $VF was: 07znPKCd5E9OEsL93cV0qJ8sLQxRt2r07yQ5SwKo1ctXUEjeA1tPFNiOy8Ns */()
         .getBytes(Charset.forName("ASCII"));
      DatagramPacket var3 = new DatagramPacket(
         var2,
         var2.length,
         this.27SBRgDbLk338W3h2IIhC6SL8m3MFlPy8WI6lJzm3c7JfFpBxClvecOmMZ2a,
         this.9cw86JLkA3P3gG9c1Z88IOUhAAi89go0ls61AplsE85jyCXV26B50gfz5W0d
      );

      try {
         this.9k1m6FM6zNe1rxiKYSKFnYXi45RTPm5EOYMPO06e34ok1v0m75Jmu2i07BSV.send(var3);
         return true;
      } catch (IOException var5) {
         return false;
      }
   }
}
