package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class126 extends Class318 {
   public int field_170;
   public String field_192;
   public int field_1025;
   public int field_842;
   public int field_119;
   public byte field_1003;
   public byte field_496;
   public int field_45;

   public Class126() {
   }

   public Class126(Class41 var1) {
      this.field_170 = var1.field_331;
      this.field_192 = var1.field_1477;
      this.field_1025 = Class380.method_502(var1.field_1324 * 32.0);
      this.field_842 = Class380.method_502(var1.field_632 * 32.0);
      this.field_119 = Class380.method_502(var1.field_1321 * 32.0);
      this.field_1003 = (byte)(var1.field_909 * 256.0F / 360.0F);
      this.field_496 = (byte)(var1.field_427 * 256.0F / 360.0F);
      Class150 var2 = var1.field_783.method_40();
      this.field_45 = var2 == null ? 0 : var2.field_1298;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_170 = var1.readInt();
      this.field_192 = var1.readUTF();
      this.field_1025 = var1.readInt();
      this.field_842 = var1.readInt();
      this.field_119 = var1.readInt();
      this.field_1003 = var1.readByte();
      this.field_496 = var1.readByte();
      this.field_45 = var1.readShort() & '\uffff';
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_170);
      var1.writeUTF(this.field_192);
      var1.writeInt(this.field_1025);
      var1.writeInt(this.field_842);
      var1.writeInt(this.field_119);
      var1.writeByte(this.field_1003);
      var1.writeByte(this.field_496);
      var1.writeShort(this.field_45);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_42(this);
   }

   @Override
   public int method_116() {
      return 28;
   }
}
