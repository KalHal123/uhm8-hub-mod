package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0196 extends Class0140 {
   public int a;
   public String b;
   public String c;

   public Class0196() {
   }

   public Class0196(String var1, String var2, int var3) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readUTF();
      this.c = var1.readUTF();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeUTF(this.b);
      var1.writeUTF(this.c);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 4 + this.b.length() + this.c.length() + 4;
   }
}
