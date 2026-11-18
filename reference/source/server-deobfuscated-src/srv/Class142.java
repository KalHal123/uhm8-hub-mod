package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class142 extends Class335 {
   public byte field_1100;

   public Class142() {
   }

   public Class142(byte var1) {
      this.field_1100 = var1;
   }

   @Override
   void method_394(DataOutput var1) throws IOException {
      var1.writeByte(this.field_1100);
   }

   @Override
   void method_145(DataInput var1) throws IOException {
      this.field_1100 = var1.readByte();
   }

   @Override
   public byte method_996() {
      return 1;
   }

   @Override
   public String toString() {
      return "" + this.field_1100;
   }
}
