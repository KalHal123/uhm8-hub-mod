package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class60 extends Class318 {
   public int field_82;
   public int field_467;
   public int field_1164;
   public int field_592;
   public byte field_703;
   public byte field_569;
   public byte field_1593;
   public int field_477;
   public int field_356;

   public Class60() {
   }

   public Class60(Class39 var1) {
      this.field_82 = var1.field_331;
      this.field_477 = var1.field_1199.field_1298 & 65535;
      this.field_356 = var1.field_1199.field_1497;
      this.field_467 = Class380.method_502(var1.field_1324 * 32.0);
      this.field_1164 = Class380.method_502(var1.field_632 * 32.0);
      this.field_592 = Class380.method_502(var1.field_1321 * 32.0);
      this.field_703 = (byte)(var1.field_607 * 128.0);
      this.field_569 = (byte)(var1.field_780 * 128.0);
      this.field_1593 = (byte)(var1.field_921 * 128.0);
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_82 = var1.readInt();
      this.field_477 = var1.readShort() & '\uffff';
      this.field_356 = var1.readByte();
      this.field_467 = var1.readInt();
      this.field_1164 = var1.readInt();
      this.field_592 = var1.readInt();
      this.field_703 = var1.readByte();
      this.field_569 = var1.readByte();
      this.field_1593 = var1.readByte();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_82);
      var1.writeShort(this.field_477);
      var1.writeByte(this.field_356);
      var1.writeInt(this.field_467);
      var1.writeInt(this.field_1164);
      var1.writeInt(this.field_592);
      var1.writeByte(this.field_703);
      var1.writeByte(this.field_569);
      var1.writeByte(this.field_1593);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_607(this);
   }

   @Override
   public int method_116() {
      return 22;
   }
}
