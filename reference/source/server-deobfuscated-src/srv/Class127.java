package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class127 extends Class318 {
   public int field_283;
   public int field_651;
   public int field_132;
   public int field_1566;
   public int field_550;

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_283 = var1.readShort();
      this.field_651 = var1.readInt();
      this.field_132 = var1.read();
      this.field_1566 = var1.readInt();
      this.field_550 = var1.read();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeShort(this.field_283);
      var1.writeInt(this.field_651);
      var1.write(this.field_132);
      var1.writeInt(this.field_1566);
      var1.write(this.field_550);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_141(this);
   }

   @Override
   public int method_116() {
      return 12;
   }
}
