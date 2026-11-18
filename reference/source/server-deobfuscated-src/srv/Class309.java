package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class309 extends Class318 {
   public int field_1405;
   public int field_376;
   public int field_12;
   public int field_150;
   public int field_1014;

   public Class309() {
   }

   public Class309(Class252 var1, int var2) {
      this.field_1405 = var1.field_331;
      this.field_376 = Class380.method_502(var1.field_1324 * 32.0);
      this.field_12 = Class380.method_502(var1.field_632 * 32.0);
      this.field_150 = Class380.method_502(var1.field_1321 * 32.0);
      this.field_1014 = var2;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1405 = var1.readInt();
      this.field_1014 = var1.readByte();
      this.field_376 = var1.readInt();
      this.field_12 = var1.readInt();
      this.field_150 = var1.readInt();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1405);
      var1.writeByte(this.field_1014);
      var1.writeInt(this.field_376);
      var1.writeInt(this.field_12);
      var1.writeInt(this.field_150);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_252(this);
   }

   @Override
   public int method_116() {
      return 17;
   }
}
