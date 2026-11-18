package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0258 extends Class0304 {
   public Class0258() {
      this.g = true;
   }

   @Override
   public void a(DataInputStream var1) {
      super.a(var1);
      this.e = var1.readByte();
      this.f = var1.readByte();
   }

   @Override
   public void a(DataOutputStream var1) {
      super.a(var1);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
   }

   @Override
   public int a() {
      return 6;
   }
}
