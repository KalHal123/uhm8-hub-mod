package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class289 extends Class318 {
   public int field_1077;
   public int field_227;
   public int field_1543;
   public int field_1597;
   public int field_1009;

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1009 = var1.read();
      this.field_1077 = var1.readInt();
      this.field_227 = var1.read();
      this.field_1543 = var1.readInt();
      this.field_1597 = var1.read();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.write(this.field_1009);
      var1.writeInt(this.field_1077);
      var1.write(this.field_227);
      var1.writeInt(this.field_1543);
      var1.write(this.field_1597);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_82(this);
   }

   @Override
   public int method_116() {
      return 11;
   }
}
