package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class218 extends Class335 {
   public byte[] field_772;

   public Class218() {
   }

   public Class218(byte[] var1) {
      this.field_772 = var1;
   }

   @Override
   void method_394(DataOutput var1) throws IOException {
      var1.writeInt(this.field_772.length);
      var1.write(this.field_772);
   }

   @Override
   void method_145(DataInput var1) throws IOException {
      int var2 = var1.readInt();
      this.field_772 = new byte[var2];
      var1.readFully(this.field_772);
   }

   @Override
   public byte method_996() {
      return 7;
   }

   @Override
   public String toString() {
      return "[" + this.field_772.length + " bytes]";
   }
}
