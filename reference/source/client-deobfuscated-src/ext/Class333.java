package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class333 extends Class471 {
   public int field_1828;
   public byte field_1007;
   public byte field_1671;
   public byte field_1527;
   public byte field_2629;
   public byte field_959;
   public boolean field_727 = false;

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1828 = var1.readInt();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1828);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_72(this);
   }

   @Override
   public int method_1597() {
      return 4;
   }
}
