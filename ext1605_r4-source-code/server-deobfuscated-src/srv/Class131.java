package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class131 extends Class318 {
   public int field_59;
   public byte field_1280;
   public int field_1520;
   public int field_398;
   public int field_229;
   public byte field_513;
   public byte field_72;

   public Class131() {
   }

   public Class131(Class92 var1) {
      this.field_59 = var1.field_331;
      this.field_1280 = (byte)Class227.method_13(var1);
      this.field_1520 = Class380.method_502(var1.field_1324 * 32.0);
      this.field_398 = Class380.method_502(var1.field_632 * 32.0);
      this.field_229 = Class380.method_502(var1.field_1321 * 32.0);
      this.field_513 = (byte)(var1.field_909 * 256.0F / 360.0F);
      this.field_72 = (byte)(var1.field_427 * 256.0F / 360.0F);
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_59 = var1.readInt();
      this.field_1280 = var1.readByte();
      this.field_1520 = var1.readInt();
      this.field_398 = var1.readInt();
      this.field_229 = var1.readInt();
      this.field_513 = var1.readByte();
      this.field_72 = var1.readByte();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_59);
      var1.writeByte(this.field_1280);
      var1.writeInt(this.field_1520);
      var1.writeInt(this.field_398);
      var1.writeInt(this.field_229);
      var1.writeByte(this.field_513);
      var1.writeByte(this.field_72);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_891(this);
   }

   @Override
   public int method_116() {
      return 19;
   }
}
