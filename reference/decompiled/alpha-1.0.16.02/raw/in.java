import java.io.DataInput;
import java.io.DataOutput;

public class in extends ef {
   public byte a;

   public in() {
   }

   public in(byte var1) {
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
