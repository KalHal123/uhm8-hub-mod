package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0111 extends Class0140 {
   public double a;
   public double b;
   public double c;
   public double d;
   public float e;
   public float f;
   public boolean g;
   public boolean h;
   public boolean i;

   public Class0111() {
   }

   public Class0111(boolean var1) {
      this.g = var1;
   }

   @Override
   public void a(Class0288 var1) {
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
