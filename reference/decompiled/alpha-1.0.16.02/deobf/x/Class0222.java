package x;

import java.io.DataInput;
import java.io.DataOutput;

public class Class0222 extends Class0115 {
   public int a;

   public Class0222() {
   }

   public Class0222(int var1) {
      this.a = var1;
   }

   @Override
   void a(DataOutput var1) {
      var1.writeInt(this.a);
   }

   @Override
   void a(DataInput var1) {
      this.a = var1.readInt();
   }

   @Override
   public byte a() {
      return 3;
   }

   @Override
   public String toString() {
      return "" + this.a;
   }
}
