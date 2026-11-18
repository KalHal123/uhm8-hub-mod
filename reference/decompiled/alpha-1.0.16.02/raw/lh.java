import java.io.DataInput;
import java.io.DataOutput;

public class lh extends ef {
   public short a;

   public lh() {
   }

   public lh(short var1) {
      this.a = var1;
   }

   @Override
   void a(DataOutput var1) {
      var1.writeShort(this.a);
   }

   @Override
   void a(DataInput var1) {
      this.a = var1.readShort();
   }

   @Override
   public byte a() {
      return 2;
   }

   @Override
   public String toString() {
      return "" + this.a;
   }
}
