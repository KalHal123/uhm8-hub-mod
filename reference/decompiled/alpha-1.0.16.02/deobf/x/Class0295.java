package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0295 extends Class0140 {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;

   public Class0295() {
      this.j = true;
   }

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.read();
      this.c = var1.readInt();
      this.d = var1.read();
      this.e = var1.read();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.write(this.b);
      var1.writeInt(this.c);
      var1.write(this.d);
      var1.write(this.e);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 11;
   }
}
