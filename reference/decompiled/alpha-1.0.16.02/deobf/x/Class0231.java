package x;

import java.io.DataInput;
import java.io.DataOutput;

public class Class0231 extends Class0115 {
   public byte a;

   public Class0231() {
   }

   public Class0231(byte var1) {
      this.a = var1;
   }

   @Override
   void a(DataOutput var1) {
      var1.writeByte(this.a);
   }

   @Override
   void a(DataInput var1) {
      this.a = var1.readByte();
   }

   @Override
   public byte a() {
      return 1;
   }

   @Override
   public String toString() {
      return "" + this.a;
   }
}
