package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0037 extends Class0140 {
   public int a;
   public int b;

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 8;
   }
}
