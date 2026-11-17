package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class519 extends Class471 {
   public int field_1884;
   public String field_475;
   public String field_1040;
   public int field_197 = -1;

   public Class519() {
   }

   public Class519(String var1, String var2, int var3) {
      this.field_475 = var1;
      this.field_1040 = var2;
      this.field_1884 = var3;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1884 = var1.readInt();
      this.field_475 = var1.readUTF();
      this.field_1040 = var1.readUTF();
      if (Class278.field_1860 != null) {
         this.field_197 = Integer.parseInt(this.field_1040);
      }
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1884);
      var1.writeUTF(this.field_475);
      var1.writeUTF(this.field_1040);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_1112(this);
   }

   @Override
   public int method_1597() {
      return 4 + this.field_475.length() + this.field_1040.length() + 4;
   }
}
