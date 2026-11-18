import java.io.DataInputStream;
import java.io.DataOutputStream;

public class jj extends fd {
   public int a;

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
   }

   @Override
   public void a(kq var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 4;
   }
}
