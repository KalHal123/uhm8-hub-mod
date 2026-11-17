package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class27 extends Class16 {
   public float field_2440;

   public Class27() {
   }

   public Class27(float var1) {
      this.field_2440 = var1;
   }

   @Override
   void method_1446(DataOutput var1) throws IOException {
      var1.writeFloat(this.field_2440);
   }

   @Override
   void method_1800(DataInput var1) throws IOException {
      this.field_2440 = var1.readFloat();
   }

   @Override
   public byte method_758() {
      return 5;
   }

   @Override
   public String toString() {
      return "" + this.field_2440;
   }
}
