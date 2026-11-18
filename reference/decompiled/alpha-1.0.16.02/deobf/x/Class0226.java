package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0226 extends Class0304 {
   public Class0226() {
      this.g = true;
   }

   @Override
   public void a(DataInputStream var1) {
      super.a(var1);
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readByte();
      this.e = var1.readByte();
      this.f = var1.readByte();
   }

   @Override
   public void a(DataOutputStream var1) {
      super.a(var1);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeByte(this.d);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
   }

   @Override
   public int a() {
      return 9;
   }
}
