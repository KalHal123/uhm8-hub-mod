package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class228 extends Class320 {
   public Class228() {
      this.field_953 = true;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_787 = var1.readFloat();
      this.field_362 = var1.readFloat();
      super.method_912(var1);
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeFloat(this.field_787);
      var1.writeFloat(this.field_362);
      super.method_405(var1);
   }

   @Override
   public int method_116() {
      return 9;
   }
}
