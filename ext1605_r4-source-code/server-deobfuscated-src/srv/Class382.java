package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class382 extends Class318 {
   public int field_269;
   public int field_246;
   public int field_1598;

   public Class382() {
   }

   public Class382(Class150 var1, int var2) {
      this.field_269 = var1.field_1298;
      this.field_246 = var2;
      this.field_1598 = var1.field_819;
      if (var2 == 0) {
         boolean var3 = true;
      }
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_269 = var1.readShort() & '\uffff';
      this.field_246 = var1.readByte();
      this.field_1598 = var1.readShort();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeShort(this.field_269);
      var1.writeByte(this.field_246);
      var1.writeShort(this.field_1598);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_346(this);
   }

   @Override
   public int method_116() {
      return 5;
   }
}
