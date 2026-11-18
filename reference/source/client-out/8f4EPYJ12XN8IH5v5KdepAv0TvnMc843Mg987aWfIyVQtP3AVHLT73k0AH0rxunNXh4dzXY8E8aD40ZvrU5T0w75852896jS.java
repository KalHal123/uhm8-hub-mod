import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

public class 8f4EPYJ12XN8IH5v5KdepAv0TvnMc843Mg987aWfIyVQtP3AVHLT73k0AH0rxunNXh4dzXY8E8aD40ZvrU5T0w75852896jS extends Thread {
   private final 8G7Xb6h25Cw0A8s2b2Xp1lhLL8uMg4l098t17vHYL1x0fHI8eKfojOBu90nwS71Hx4wq0Z9D634v20KzNPL0E05n1D62ISXeS3Q 5K3sbQn5X6ulj0GQ3fhSzWEJld90E9S4eChV16qYUBMZ26x064s1ny2w4eON;
   private final InetAddress 5u8aht315N4kaG3o8hr41398KCm7udkU1m2nMTx4Qod98ZFnoF9V7Xr880gb;
   private final MulticastSocket 9TIT1Oh03A2XA7jeuG3SzugWFnrI2oc818408ineX5q2lnc58swhho8Ca7m8;
   private static final String 9Mny94npF0LbWrJ2fye1flUmV44PK9522l2S4ypZod7UyPxBvo30U6LTUkRW = "CL_00001135";

   public _f4EPYJ12XN8IH5v5KdepAv0TvnMc843Mg987aWfIyVQtP3AVHLT73k0AH0rxunNXh4dzXY8E8aD40ZvrU5T0w75852896jS/* $VF was: 8f4EPYJ12XN8IH5v5KdepAv0TvnMc843Mg987aWfIyVQtP3AVHLT73k0AH0rxunNXh4dzXY8E8aD40ZvrU5T0w75852896jS */(
      8G7Xb6h25Cw0A8s2b2Xp1lhLL8uMg4l098t17vHYL1x0fHI8eKfojOBu90nwS71Hx4wq0Z9D634v20KzNPL0E05n1D62ISXeS3Q var1
   ) throws IOException {
      super(
         "LanServerDetector #"
            + 2959V74TYTY4lhDc33xON2ko5AE6Tts6R1SzS9tHT9UB6gO6FU0no63BC75Ixl5ArZBDYMm8tOv711Rt3gGlVCOuM3w._095QTr6V051pTOyEln290S3uDK3v65566PUXfys595pR5uPyLtaonH4p9jn/* $VF was: 8095QTr6V051pTOyEln290S3uDK3v65566PUXfys595pR5uPyLtaonH4p9jn */()
               .incrementAndGet()
      );
      this.5K3sbQn5X6ulj0GQ3fhSzWEJld90E9S4eChV16qYUBMZ26x064s1ny2w4eON = var1;
      this.setDaemon(true);
      this.9TIT1Oh03A2XA7jeuG3SzugWFnrI2oc818408ineX5q2lnc58swhho8Ca7m8 = new MulticastSocket(4445);
      this.5u8aht315N4kaG3o8hr41398KCm7udkU1m2nMTx4Qod98ZFnoF9V7Xr880gb = InetAddress.getByName("224.0.2.60");
      this.9TIT1Oh03A2XA7jeuG3SzugWFnrI2oc818408ineX5q2lnc58swhho8Ca7m8.setSoTimeout(5000);
      this.9TIT1Oh03A2XA7jeuG3SzugWFnrI2oc818408ineX5q2lnc58swhho8Ca7m8.joinGroup(this.5u8aht315N4kaG3o8hr41398KCm7udkU1m2nMTx4Qod98ZFnoF9V7Xr880gb);
   }

   @Override
   public void run() {
      byte[] var1 = new byte[1024];

      while (!this.isInterrupted()) {
         DatagramPacket var2 = new DatagramPacket(var1, var1.length);

         try {
            this.9TIT1Oh03A2XA7jeuG3SzugWFnrI2oc818408ineX5q2lnc58swhho8Ca7m8.receive(var2);
         } catch (SocketTimeoutException var5) {
            continue;
         } catch (IOException var6) {
            2959V74TYTY4lhDc33xON2ko5AE6Tts6R1SzS9tHT9UB6gO6FU0no63BC75Ixl5ArZBDYMm8tOv711Rt3gGlVCOuM3w._aCES4xVN044Nl6kBDM97r4haJIM3J7NY0D1z5IeNMU9oucd80P32kO8d8h5/* $VF was: 9aCES4xVN044Nl6kBDM97r4haJIM3J7NY0D1z5IeNMU9oucd80P32kO8d8h5 */()
               .log(Level.SEVERE, "Couldn't ping server", var6);
            break;
         }

         String var3 = new String(var2.getData(), var2.getOffset(), var2.getLength());
         2959V74TYTY4lhDc33xON2ko5AE6Tts6R1SzS9tHT9UB6gO6FU0no63BC75Ixl5ArZBDYMm8tOv711Rt3gGlVCOuM3w._aCES4xVN044Nl6kBDM97r4haJIM3J7NY0D1z5IeNMU9oucd80P32kO8d8h5/* $VF was: 9aCES4xVN044Nl6kBDM97r4haJIM3J7NY0D1z5IeNMU9oucd80P32kO8d8h5 */()
            .log(Level.FINEST, var2.getAddress() + ": " + var3);
         this.5K3sbQn5X6ulj0GQ3fhSzWEJld90E9S4eChV16qYUBMZ26x064s1ny2w4eON
            ._JWlo5oTbj6698u3MxWj43m8jjLW826DJsk9l6DW0z4oK6cxa991XuVMtgSV/* $VF was: 6JWlo5oTbj6698u3MxWj43m8jjLW826DJsk9l6DW0z4oK6cxa991XuVMtgSV */(
               var3, var2.getAddress()
            );
      }

      try {
         this.9TIT1Oh03A2XA7jeuG3SzugWFnrI2oc818408ineX5q2lnc58swhho8Ca7m8.leaveGroup(this.5u8aht315N4kaG3o8hr41398KCm7udkU1m2nMTx4Qod98ZFnoF9V7Xr880gb);
      } catch (IOException var4) {
      }

      this.9TIT1Oh03A2XA7jeuG3SzugWFnrI2oc818408ineX5q2lnc58swhho8Ca7m8.close();
   }
}
