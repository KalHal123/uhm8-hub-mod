package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class541 implements Interface602 {
   @Override
   public byte method_258() {
      return -96;
   }

   @Override
   public void method_1522(DataOutputStream var1) throws IOException {
      var1.writeByte(17);
   }

   @Override
   public void method_7(DataInputStream var1) throws IOException {
      byte var2 = var1.readByte();
      System.out.println("Ping request received: " + var2);
   }

   @Override
   public void method_1845(DataOutputStream var1) throws IOException {
   }

   @Override
   public int method_1013() {
      return 1;
   }
}
