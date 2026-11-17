package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class300 extends Class471 {
   public String field_1503;

   public Class300() {
   }

   public Class300(String var1) {
      this.field_1503 = var1;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1503 = var1.readUTF();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_1503);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_1241(this);
   }

   @Override
   public int method_1597() {
      return this.field_1503.length();
   }
}
