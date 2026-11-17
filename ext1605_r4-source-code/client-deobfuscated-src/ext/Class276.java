package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class276 extends Class471 {
   public int field_2867;
   public int field_627;
   public int field_1483;
   public int field_184;
   public byte field_384;
   public byte field_244;
   public byte field_2595;
   public int field_989;
   public int field_2768;

   public Class276() {
   }

   public Class276(Class198 var1) {
      this.field_2867 = var1.field_1767;
      this.field_989 = var1.field_1296.field_1782;
      this.field_2768 = var1.field_1296.field_2326;
      this.field_627 = Class469.method_468(var1.field_1417 * 32.0);
      this.field_1483 = Class469.method_468(var1.field_2654 * 32.0);
      this.field_184 = Class469.method_468(var1.field_2013 * 32.0);
      this.field_384 = (byte)(var1.field_2549 * 128.0);
      this.field_244 = (byte)(var1.field_2501 * 128.0);
      this.field_2595 = (byte)(var1.field_489 * 128.0);
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_2867 = var1.readInt();
      this.field_989 = var1.readShort() & '\uffff';
      this.field_2768 = var1.readByte();
      this.field_627 = var1.readInt();
      this.field_1483 = var1.readInt();
      this.field_184 = var1.readInt();
      this.field_384 = var1.readByte();
      this.field_244 = var1.readByte();
      this.field_2595 = var1.readByte();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_2867);
      var1.writeShort(this.field_989);
      var1.writeByte(this.field_2768);
      var1.writeInt(this.field_627);
      var1.writeInt(this.field_1483);
      var1.writeInt(this.field_184);
      var1.writeByte(this.field_384);
      var1.writeByte(this.field_244);
      var1.writeByte(this.field_2595);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_624(this);
   }

   @Override
   public int method_1597() {
      return 22;
   }
}
