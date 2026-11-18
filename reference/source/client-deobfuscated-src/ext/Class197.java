package ext;

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

public class Class197 {
   public DatagramSocket field_3088;
   public int field_3054 = -1;
   public InetAddress field_729;
   public boolean field_1160 = false;

   public boolean method_898() {
      File var1 = new File("C:\\Temp\\DualSenseX\\DualSenseX_PortNumber.txt");

      try {
         Scanner var2 = new Scanner(var1);
         if (!var2.hasNextInt()) {
            var2.close();
            return false;
         }

         this.field_3054 = var2.nextInt();
         var2.close();
      } catch (FileNotFoundException var5) {
         return false;
      }

      try {
         this.field_729 = InetAddress.getByName("localhost");
         this.field_3088 = new DatagramSocket();
      } catch (UnknownHostException var3) {
         return false;
      } catch (SocketException var4) {
         return false;
      }

      this.field_1160 = true;
      return true;
   }

   public void method_586() {
      this.field_3088.close();
      this.field_1160 = false;
   }

   public boolean method_301(Class113 var1) {
      if (!this.field_1160) {
         return false;
      }

      byte[] var2 = var1.method_54().getBytes(Charset.forName("ASCII"));
      DatagramPacket var3 = new DatagramPacket(var2, var2.length, this.field_729, this.field_3054);

      try {
         this.field_3088.send(var3);
         return true;
      } catch (IOException var5) {
         return false;
      }
   }
}
