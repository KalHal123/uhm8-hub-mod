package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class356 extends Class318 {
   public int field_24;

   public Class356() {
   }

   public Class356(int var1) {
      this.field_24 = var1;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_24 = var1.readInt();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_24);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_749(this);
   }

   @Override
   public int method_116() {
      return 4;
   }
}
