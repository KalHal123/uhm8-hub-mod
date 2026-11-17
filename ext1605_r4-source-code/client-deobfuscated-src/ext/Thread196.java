package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Thread196 extends Thread {
   private ServerSocket field_408;
   private Socket field_522;
   private DataOutputStream field_3028;
   private DataInputStream field_1314;

   public static void method_1048(DataOutputStream var0, Interface602 var1) throws IOException {
      Class597.method_883("Writing byte " + var1.method_258() + ", size " + var1.method_1013());
      var0.writeByte(var1.method_258());
      var0.writeInt(var1.method_1013());
      var1.method_1522(var0);
   }

   public Class<? extends Interface602> method_604(int var1) {
      switch (var1) {
         case 160:
            return Class541.class;
         default:
            return null;
      }
   }

   @Override
   public void run() {
      try {
         this.field_408 = new ServerSocket(25566);
         this.field_522 = this.field_408.accept();
         this.field_3028 = new DataOutputStream(this.field_522.getOutputStream());
         this.field_1314 = new DataInputStream(this.field_522.getInputStream());

         while (Class119.field_1519.field_2648 != null) {
            while (this.field_1314.available() == 0) {
            }

            byte var1 = this.field_1314.readByte();
            int var2 = this.field_1314.readInt();
            Class597.method_883("received packet id: " + var1 + ", size: " + var2);
            Class var3 = this.method_604(var1 & 255);
            Interface602 var4 = (Interface602)var3.getConstructor().newInstance();
            var4.method_7(this.field_1314);
            var4.method_1845(this.field_3028);
         }
      } catch (Exception var13) {
         var13.printStackTrace();
      } finally {
         Class597.method_883("server thread finished");

         try {
            this.field_408.close();
            this.field_522.close();
            this.field_3028.close();
            this.field_1314.close();
         } catch (IOException var12) {
            var12.printStackTrace();
         }
      }
   }
}
