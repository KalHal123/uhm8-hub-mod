package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class588 extends Class16 {
   public byte field_193;

   public Class588() {
   }

   public Class588(byte var1) {
      this.field_193 = var1;
   }

   @Override
   void method_1446(DataOutput var1) throws IOException {
      var1.writeByte(this.field_193);
   }

   @Override
   void method_1800(DataInput var1) throws IOException {
      this.field_193 = var1.readByte();
   }

   @Override
   public byte method_758() {
      return 1;
   }

   @Override
   public String toString() {
      return "" + this.field_193;
   }
}
