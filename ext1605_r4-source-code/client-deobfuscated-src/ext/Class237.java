package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class237 extends Class333 {
   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      super.method_1135(var1);
      this.field_1007 = var1.readByte();
      this.field_1671 = var1.readByte();
      this.field_1527 = var1.readByte();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      super.method_805(var1);
      var1.writeByte(this.field_1007);
      var1.writeByte(this.field_1671);
      var1.writeByte(this.field_1527);
   }

   @Override
   public int method_1597() {
      return 7;
   }
}
