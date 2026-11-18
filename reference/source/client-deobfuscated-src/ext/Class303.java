package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class303 extends Class16 {
   public byte[] field_2145;

   public Class303() {
   }

   public Class303(byte[] var1) {
      this.field_2145 = var1;
   }

   @Override
   void method_1446(DataOutput var1) throws IOException {
      var1.writeInt(this.field_2145.length);
      var1.write(this.field_2145);
   }

   @Override
   void method_1800(DataInput var1) throws IOException {
      int var2 = var1.readInt();
      this.field_2145 = new byte[var2];
      var1.readFully(this.field_2145);
   }

   @Override
   public byte method_758() {
      return 7;
   }

   @Override
   public String toString() {
      return "[" + this.field_2145.length + " bytes]";
   }
}
