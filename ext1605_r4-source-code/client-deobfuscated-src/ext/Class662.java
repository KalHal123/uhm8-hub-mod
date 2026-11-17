package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class662 extends Class471 {
   public int field_1499;

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1499 = var1.readInt();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1499);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_1603(this);
   }

   @Override
   public int method_1597() {
      return 4;
   }
}
