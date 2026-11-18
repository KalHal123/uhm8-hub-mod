import java.io.DataInputStream;
import java.io.DataOutputStream;

public class eb extends fd {
   public double a;
   public double b;
   public double c;
   public double d;
   public float e;
   public float f;
   public boolean g;
   public boolean h;
   public boolean i;

   public eb() {
   }

   public eb(boolean var1) {
      this.g = var1;
   }

   @Override
   public void a(kq var1) {
      var1.a(this);
   }

   @Override
   public void a(DataInputStream var1) {
      this.g = var1.read() != 0;
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.write(this.g ? 1 : 0);
   }

   @Override
   public int a() {
      return 1;
   }
}
