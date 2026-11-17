package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class472 extends Class16 {
   public int field_2493;

   public Class472() {
   }

   public Class472(int var1) {
      this.field_2493 = var1;
   }

   @Override
   void method_1446(DataOutput var1) throws IOException {
      var1.writeInt(this.field_2493);
   }

   @Override
   void method_1800(DataInput var1) throws IOException {
      this.field_2493 = var1.readInt();
   }

   @Override
   public byte method_758() {
      return 3;
   }

   @Override
   public String toString() {
      return "" + this.field_2493;
   }
}
