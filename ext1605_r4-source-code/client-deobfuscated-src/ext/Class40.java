package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class40 extends Class471 {
   public String field_823 = "";

   public Class40() {
   }

   public Class40(String var1) {
      this.field_823 = var1;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_823 = var1.readUTF();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_823);
   }

   @Override
   public void method_1876(Class8 var1) {
      Class119.field_1519.field_485.method_1036(this.field_823);
   }

   @Override
   public int method_1597() {
      return this.field_823.length() + 2;
   }
}
