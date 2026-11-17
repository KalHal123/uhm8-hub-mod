package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class461 extends Class16 {
   public long field_2399;

   public Class461() {
   }

   public Class461(long var1) {
      this.field_2399 = var1;
   }

   @Override
   void method_1446(DataOutput var1) throws IOException {
      var1.writeLong(this.field_2399);
   }

   @Override
   void method_1800(DataInput var1) throws IOException {
      this.field_2399 = var1.readLong();
   }

   @Override
   public byte method_758() {
      return 4;
   }

   @Override
   public String toString() {
      return "" + this.field_2399;
   }
}
