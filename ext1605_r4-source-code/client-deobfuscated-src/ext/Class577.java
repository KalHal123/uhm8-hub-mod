package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class577 extends Class471 {
   public int field_1610;
   public String field_434;
   public int field_2763;
   public int field_113;
   public int field_2067;
   public byte field_2895;
   public byte field_335;
   public int field_1335;

   public Class577() {
   }

   public Class577(Class354 var1) {
      this.field_1610 = var1.field_1767;
      this.field_434 = var1.field_1716;
      this.field_2763 = Class469.method_468(var1.field_1417 * 32.0);
      this.field_113 = Class469.method_468(var1.field_2654 * 32.0);
      this.field_2067 = Class469.method_468(var1.field_2013 * 32.0);
      this.field_2895 = (byte)(var1.field_1661 * 256.0F / 360.0F);
      this.field_335 = (byte)(var1.field_2866 * 256.0F / 360.0F);
      Class334 var2 = var1.field_559.method_93();
      this.field_1335 = var2 == null ? 0 : var2.field_1782;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1610 = var1.readInt();
      this.field_434 = var1.readUTF();
      this.field_2763 = var1.readInt();
      this.field_113 = var1.readInt();
      this.field_2067 = var1.readInt();
      this.field_2895 = var1.readByte();
      this.field_335 = var1.readByte();
      this.field_1335 = var1.readShort() & '\uffff';
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1610);
      var1.writeUTF(this.field_434);
      var1.writeInt(this.field_2763);
      var1.writeInt(this.field_113);
      var1.writeInt(this.field_2067);
      var1.writeByte(this.field_2895);
      var1.writeByte(this.field_335);
      var1.writeShort(this.field_1335);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_1079(this);
   }

   @Override
   public int method_1597() {
      return 28;
   }
}
