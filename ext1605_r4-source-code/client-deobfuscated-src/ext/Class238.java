package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class238 extends Class471 {
   public String field_2363;

   public Class238() {
   }

   public Class238(String var1) {
      this.field_2363 = var1;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_2363 = var1.readUTF();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_2363);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_643(this);
   }

   @Override
   public int method_1597() {
      return this.field_2363.length();
   }
}
