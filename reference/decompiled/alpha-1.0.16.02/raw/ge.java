import java.io.DataInput;
import java.io.DataOutput;

public class ge extends ef {
   public long a;

   public ge() {
   }

   public ge(long var1) {
      this.a = var1;
   }

   @Override
   void a(DataOutput var1) {
      var1.writeLong(this.a);
   }

   @Override
   void a(DataInput var1) {
      this.a = var1.readLong();
   }

   @Override
   public byte a() {
      return 4;
   }

   @Override
   public String toString() {
      return "" + this.a;
   }
}
