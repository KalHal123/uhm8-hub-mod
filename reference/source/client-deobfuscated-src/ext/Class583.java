package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class583 extends Class471 {
   public int field_983;
   public int field_2347;

   public Class583() {
   }

   public Class583(int var1, int var2) {
      this.field_983 = var1;
      this.field_2347 = var2;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_983 = var1.readInt();
      this.field_2347 = var1.readShort() & '\uffff';
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_983);
      var1.writeShort(this.field_2347);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_326(this);
   }

   @Override
   public int method_1597() {
      return 6;
   }
}
