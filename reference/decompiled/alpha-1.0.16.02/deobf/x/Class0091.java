package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0091 extends Class0140 {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;

   public Class0091() {
   }

   public Class0091(int var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readShort();
      this.b = var1.readInt();
      this.c = var1.read();
      this.d = var1.readInt();
      this.e = var1.read();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeShort(this.a);
      var1.writeInt(this.b);
      var1.write(this.c);
      var1.writeInt(this.d);
      var1.write(this.e);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 12;
   }
}
