package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0174 extends Class0140 {
   public String a;

   public Class0174() {
   }

   public Class0174(String var1) {
      this.a = var1;
   }

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readUTF();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeUTF(this.a);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 4 + this.a.length() + 4;
   }
}
