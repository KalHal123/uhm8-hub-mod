package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class747 extends Class471 {
   public int field_1772;
   public int field_2464;

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1772 = var1.readInt();
      this.field_2464 = var1.readInt();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1772);
      var1.writeInt(this.field_2464);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_1744(this);
   }

   @Override
   public int method_1597() {
      return 8;
   }
}
