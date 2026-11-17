package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class118 extends Class335 {
   public String field_1153;

   public Class118() {
   }

   public Class118(String var1) {
      this.field_1153 = var1;
      if (var1 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   @Override
   void method_394(DataOutput var1) throws IOException {
      var1.writeUTF(this.field_1153);
   }

   @Override
   void method_145(DataInput var1) throws IOException {
      this.field_1153 = var1.readUTF();
   }

   @Override
   public byte method_996() {
      return 8;
   }

   @Override
   public String toString() {
      return "" + this.field_1153;
   }
}
