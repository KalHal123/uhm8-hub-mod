package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class96 extends Class294 {
   public Class96() {
   }

   public Class96(int var1, byte var2, byte var3, byte var4) {
      super(var1);
      this.field_102 = var2;
      this.field_931 = var3;
      this.field_434 = var4;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      super.method_912(var1);
      this.field_102 = var1.readByte();
      this.field_931 = var1.readByte();
      this.field_434 = var1.readByte();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      super.method_405(var1);
      var1.writeByte(this.field_102);
      var1.writeByte(this.field_931);
      var1.writeByte(this.field_434);
   }

   @Override
   public int method_116() {
      return 7;
   }
}
