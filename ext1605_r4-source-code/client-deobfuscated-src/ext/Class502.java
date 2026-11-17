package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class502 extends Class471 {
   public int field_1663;
   public int field_363;
   public int field_3049;

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1663 = var1.readShort() & '\uffff';
      this.field_363 = var1.readByte();
      this.field_3049 = var1.readShort();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeShort(this.field_1663);
      var1.writeByte(this.field_363);
      var1.writeShort(this.field_3049);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_811(this);
   }

   @Override
   public int method_1597() {
      return 5;
   }
}
