package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class403 extends Class16 {
   public String field_549;

   public Class403() {
   }

   public Class403(String var1) {
      this.field_549 = var1;
      if (var1 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   @Override
   void method_1446(DataOutput var1) throws IOException {
      var1.writeUTF(this.field_549);
   }

   @Override
   void method_1800(DataInput var1) throws IOException {
      this.field_549 = var1.readUTF();
   }

   @Override
   public byte method_758() {
      return 8;
   }

   @Override
   public String toString() {
      return "" + this.field_549;
   }
}
