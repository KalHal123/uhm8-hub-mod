package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class253 extends Class335 {
   public long field_1283;

   public Class253() {
   }

   public Class253(long var1) {
      this.field_1283 = var1;
   }

   @Override
   void method_394(DataOutput var1) throws IOException {
      var1.writeLong(this.field_1283);
   }

   @Override
   void method_145(DataInput var1) throws IOException {
      this.field_1283 = var1.readLong();
   }

   @Override
   public byte method_996() {
      return 4;
   }

   @Override
   public String toString() {
      return "" + this.field_1283;
   }
}
