import java.io.DataInput;
import java.io.DataOutput;

public class f extends ef {
   public float a;

   public f() {
   }

   public f(float var1) {
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
