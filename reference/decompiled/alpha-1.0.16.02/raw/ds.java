import java.io.DataInput;
import java.io.DataOutput;

public class ds extends ef {
   public byte[] a;

   public ds() {
   }

   public ds(byte[] var1) {
      this.a = var1;
   }

   @Override
   void a(DataOutput var1) {
      var1.writeInt(this.a.length);
      var1.write(this.a);
   }

   @Override
   void a(DataInput var1) {
      int var2 = var1.readInt();
      this.a = new byte[var2];
      var1.readFully(this.a);
   }

   @Override
   public byte a() {
      return 7;
   }

   @Override
   public String toString() {
      return "[" + this.a.length + " bytes]";
   }
}
