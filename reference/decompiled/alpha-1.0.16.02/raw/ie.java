import java.io.DataInput;
import java.io.DataOutput;

public class ie extends ef {
   public int a;

   public ie() {
   }

   public ie(int var1) {
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
