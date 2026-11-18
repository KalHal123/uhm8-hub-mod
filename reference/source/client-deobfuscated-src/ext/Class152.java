package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class152 extends Class471 {
   public int field_1988;
   public int field_982;
   public int field_1526;
   public byte[] field_644;
   public Class686 field_2215;

   public Class152() {
      this.field_2211 = true;
   }

   public Class152(int var1, int var2, int var3, Class186 var4) {
      this.field_2211 = true;
      this.field_1988 = var1;
      this.field_982 = var2;
      this.field_1526 = var3;
      this.field_2215 = new Class686();
      var4.method_1623(this.field_2215);

      try {
         this.field_644 = Class679.method_782(this.field_2215);
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1988 = var1.readInt();
      this.field_982 = var1.readShort();
      this.field_1526 = var1.readInt();
      int var2 = var1.readShort() & '\uffff';
      this.field_644 = new byte[var2];
      var1.readFully(this.field_644);
      this.field_2215 = Class679.method_1397(this.field_644);
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1988);
      var1.writeShort(this.field_982);
      var1.writeInt(this.field_1526);
      var1.writeShort((short)this.field_644.length);
      var1.write(this.field_644);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_1630(this);
   }

   @Override
   public int method_1597() {
      return this.field_644.length + 2 + 10;
   }
}
