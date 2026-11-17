package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class305 extends Class335 {
   public short field_618;

   public Class305() {
   }

   public Class305(short var1) {
      this.field_618 = var1;
   }

   @Override
   void method_394(DataOutput var1) throws IOException {
      var1.writeShort(this.field_618);
   }

   @Override
   void method_145(DataInput var1) throws IOException {
      this.field_618 = var1.readShort();
   }

   @Override
   public byte method_996() {
      return 2;
   }

   @Override
   public String toString() {
      return "" + this.field_618;
   }
}
