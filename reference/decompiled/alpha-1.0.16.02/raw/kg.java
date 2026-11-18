import java.io.DataInput;
import java.io.DataOutput;

public class kg extends ef {
   public double a;

   public kg() {
   }

   public kg(double var1) {
      this.a = var1;
   }

   @Override
   void a(DataOutput var1) {
      var1.writeDouble(this.a);
   }

   @Override
   void a(DataInput var1) {
      this.a = var1.readDouble();
   }

   @Override
   public byte a() {
      return 6;
   }

   @Override
   public String toString() {
      return "" + this.a;
   }
}
