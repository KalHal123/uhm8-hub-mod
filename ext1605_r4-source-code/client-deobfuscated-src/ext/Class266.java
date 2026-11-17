package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class266 extends Class471 {
   public int field_1760;
   public int field_2569;

   public Class266() {
   }

   public Class266(Class359 var1, int var2) {
      this.field_1760 = var1.field_1767;
      this.field_2569 = var2;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1760 = var1.readInt();
      this.field_2569 = var1.readByte();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1760);
      var1.writeByte(this.field_2569);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_410(this);
   }

   @Override
   public int method_1597() {
      return 5;
   }
}
