package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0185 extends Class0140 {
   public int a;
   public int b;

   public Class0185() {
   }

   public Class0185(Class0268 var1, int var2) {
      this.a = var1.Z;
      this.b = var2;
   }

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readByte();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
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
