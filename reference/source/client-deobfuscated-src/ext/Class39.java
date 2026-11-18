package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class39 extends Class471 {
   public String field_2832 = "";
   public int field_2713 = 5000;

   public Class39() {
   }

   public Class39(String var1, int var2) {
      this.field_2832 = var1;
      this.field_2713 = var2;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_2832 = var1.readUTF();
      this.field_2713 = var1.readInt();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_2832);
      var1.writeInt(this.field_2713);
   }

   @Override
   public void method_1876(Class8 var1) {
      if (var1 instanceof Class348) {
         ((Class348)var1).method_127(this);
      }
   }

   @Override
   public int method_1597() {
      return this.field_2832.getBytes().length + 4;
   }
}
