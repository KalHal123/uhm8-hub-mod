import java.io.DataInputStream;
import java.io.DataOutputStream;

public class jq extends fd {
   public int a;
   public int b;
   public boolean c;

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.read() != 0;
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.write(this.c ? 1 : 0);
   }

   @Override
   public void a(kq var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 9;
   }
}
