package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class25 extends Class335 {
   public int field_646;

   public Class25() {
   }

   public Class25(int var1) {
      this.field_646 = var1;
   }

   @Override
   void method_394(DataOutput var1) throws IOException {
      var1.writeInt(this.field_646);
   }

   @Override
   void method_145(DataInput var1) throws IOException {
      this.field_646 = var1.readInt();
   }

   @Override
   public byte method_996() {
      return 3;
   }

   @Override
   public String toString() {
      return "" + this.field_646;
   }
}
