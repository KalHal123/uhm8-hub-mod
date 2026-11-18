package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0304 extends Class0140 {
   public int a;
   public byte b;
   public byte c;
   public byte d;
   public byte e;
   public byte f;
   public boolean g = false;

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 4;
   }
}
