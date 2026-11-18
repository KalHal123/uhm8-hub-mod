package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class155 extends Class335 {
   public double field_1205;

   public Class155() {
   }

   public Class155(double var1) {
      this.field_1205 = var1;
   }

   @Override
   void method_394(DataOutput var1) throws IOException {
      var1.writeDouble(this.field_1205);
   }

   @Override
   void method_145(DataInput var1) throws IOException {
      this.field_1205 = var1.readDouble();
   }

   @Override
   public byte method_996() {
      return 6;
   }

   @Override
   public String toString() {
      return "" + this.field_1205;
   }
}
