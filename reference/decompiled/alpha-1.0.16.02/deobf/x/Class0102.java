package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0102 extends Class0140 {
   public int a;
   public int b;

   public Class0102() {
   }

   public Class0102(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readShort();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 6;
   }
}
