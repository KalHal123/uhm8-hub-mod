package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class222 extends Class318 {
   public Class43 field_1458;
   public Class43 field_761;
   public int field_625;

   public Class222(Class43 var1, Class43 var2, int var3) {
      this.field_1458 = var1;
      this.field_761 = var2;
      this.field_625 = var3;
   }

   public Class222() {
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1458 = Class43.method_705(var1);
      this.field_761 = Class43.method_705(var1);
      this.field_625 = var1.readInt();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      this.field_1458.method_638(var1);
      this.field_761.method_638(var1);
      var1.writeInt(this.field_625);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_837(this);
   }

   @Override
   public int method_116() {
      return 0;
   }
}
