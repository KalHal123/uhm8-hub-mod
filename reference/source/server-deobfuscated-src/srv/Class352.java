package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class352 extends Class318 {
   public int field_818;
   public int field_387;
   public int field_1008;
   public int field_373;
   public int field_730;

   public Class352() {
      this.field_198 = true;
   }

   public Class352(int var1, int var2, int var3, Class317 var4) {
      this.field_198 = true;
      this.field_818 = var1;
      this.field_387 = var2;
      this.field_1008 = var3;
      this.field_373 = var4.method_813(var1, var2, var3);
      this.field_730 = var4.method_929(var1, var2, var3);
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_818 = var1.readInt();
      this.field_387 = var1.read();
      this.field_1008 = var1.readInt();
      this.field_373 = var1.read();
      this.field_730 = var1.read();
      Class273.method_579("Received packet53, metadata: " + this.field_730);
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_818);
      var1.write(this.field_387);
      var1.writeInt(this.field_1008);
      var1.write(this.field_373);
      var1.write(this.field_730);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_231(this);
   }

   @Override
   public int method_116() {
      return 11;
   }
}
