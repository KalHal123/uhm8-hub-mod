package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class715 extends Class471 {
   public long field_1394;

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1394 = var1.readLong();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeLong(this.field_1394);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_335(this);
   }

   @Override
   public int method_1597() {
      return 8;
   }
}
