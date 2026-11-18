package x;

import java.io.DataInput;
import java.io.DataOutput;

public class Class0136 extends Class0115 {
   public float a;

   public Class0136() {
   }

   public Class0136(float var1) {
      this.a = var1;
   }

   @Override
   void a(DataOutput var1) {
      var1.writeFloat(this.a);
   }

   @Override
   void a(DataInput var1) {
      this.a = var1.readFloat();
   }

   @Override
   public byte a() {
      return 5;
   }

   @Override
   public String toString() {
      return "" + this.a;
   }
}
