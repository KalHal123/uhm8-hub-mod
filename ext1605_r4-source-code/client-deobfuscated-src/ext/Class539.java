package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class539 extends Class16 {
   public short field_1485;

   public Class539() {
   }

   public Class539(short var1) {
      this.field_1485 = var1;
   }

   @Override
   void method_1446(DataOutput var1) throws IOException {
      var1.writeShort(this.field_1485);
   }

   @Override
   void method_1800(DataInput var1) throws IOException {
      this.field_1485 = var1.readShort();
   }

   @Override
   public byte method_758() {
      return 2;
   }

   @Override
   public String toString() {
      return "" + this.field_1485;
   }
}
