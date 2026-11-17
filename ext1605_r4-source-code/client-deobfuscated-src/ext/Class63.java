package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class63 extends Class471 {
   public int field_117;
   public byte field_1435;
   public int field_2653;
   public int field_2536;
   public int field_44;
   public byte field_1577;
   public byte field_827;

   public Class63() {
   }

   public Class63(Class377 var1) {
      this.field_117 = var1.field_1767;
      this.field_1435 = (byte)Class174.method_1341(var1);
      this.field_2653 = Class469.method_468(var1.field_1417 * 32.0);
      this.field_2536 = Class469.method_468(var1.field_2654 * 32.0);
      this.field_44 = Class469.method_468(var1.field_2013 * 32.0);
      this.field_1577 = (byte)(var1.field_1661 * 256.0F / 360.0F);
      this.field_827 = (byte)(var1.field_2866 * 256.0F / 360.0F);
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_117 = var1.readInt();
      this.field_1435 = var1.readByte();
      this.field_2653 = var1.readInt();
      this.field_2536 = var1.readInt();
      this.field_44 = var1.readInt();
      this.field_1577 = var1.readByte();
      this.field_827 = var1.readByte();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_117);
      var1.writeByte(this.field_1435);
      var1.writeInt(this.field_2653);
      var1.writeInt(this.field_2536);
      var1.writeInt(this.field_44);
      var1.writeByte(this.field_1577);
      var1.writeByte(this.field_827);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_1074(this);
   }

   @Override
   public int method_1597() {
      return 19;
   }
}
