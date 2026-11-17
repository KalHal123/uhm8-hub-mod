package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class260 extends Class335 {
   public float field_95;

   public Class260() {
   }

   public Class260(float var1) {
      this.field_95 = var1;
   }

   @Override
   void method_394(DataOutput var1) throws IOException {
      var1.writeFloat(this.field_95);
   }

   @Override
   void method_145(DataInput var1) throws IOException {
      this.field_95 = var1.readFloat();
   }

   @Override
   public byte method_996() {
      return 5;
   }

   @Override
   public String toString() {
      return "" + this.field_95;
   }
}
