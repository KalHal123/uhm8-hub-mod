import java.io.DataInputStream;
import java.io.DataOutputStream;

public class gk extends fd {
   public String a;

   public gk() {
   }

   public gk(String var1) {
      this.a = var1;
   }

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readUTF();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeUTF(this.a);
   }

   @Override
   public void a(kq var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 4 + this.a.length() + 4;
   }
}
