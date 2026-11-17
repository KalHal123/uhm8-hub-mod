package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class153 extends Class16 {
   public double field_818;

   public Class153() {
   }

   public Class153(double var1) {
      this.field_818 = var1;
   }

   @Override
   void method_1446(DataOutput var1) throws IOException {
      var1.writeDouble(this.field_818);
   }

   @Override
   void method_1800(DataInput var1) throws IOException {
      this.field_818 = var1.readDouble();
   }

   @Override
   public byte method_758() {
      return 6;
   }

   @Override
   public String toString() {
      return "" + this.field_818;
   }
}
