package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class294 extends Class318 {
   public int field_143;
   public byte field_102;
   public byte field_931;
   public byte field_434;
   public byte field_887;
   public byte field_1071;
   public boolean field_432 = false;

   public Class294() {
   }

   public Class294(int var1) {
      this.field_143 = var1;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_143 = var1.readInt();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_143);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_76(this);
   }

   @Override
   public int method_116() {
      return 4;
   }
}
