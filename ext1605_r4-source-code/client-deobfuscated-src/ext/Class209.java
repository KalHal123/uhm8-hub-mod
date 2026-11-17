package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class209 extends Class471 {
   public String field_1161;

   public Class209() {
   }

   public Class209(String var1) {
      this.field_1161 = var1;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1161 = var1.readUTF();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_1161);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_711(this);
   }

   @Override
   public int method_1597() {
      return 4 + this.field_1161.length() + 4;
   }
}
