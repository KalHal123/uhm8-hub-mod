package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0290 extends Class0140 {
   public int a;
   public int b;
   public int c;

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readShort();
      this.b = var1.readByte();
      this.c = var1.readShort();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeShort(this.a);
      var1.writeByte(this.b);
      var1.writeShort(this.c);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 5;
   }
}
