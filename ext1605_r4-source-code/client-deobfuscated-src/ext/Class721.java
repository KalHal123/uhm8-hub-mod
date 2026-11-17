package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class721 extends Class471 {
   public int field_2932;
   public int field_2409;
   public int field_2940;
   public int field_732;
   public byte field_2847;
   public byte field_3119;

   public Class721() {
   }

   public Class721(Class359 var1) {
      this.field_2932 = var1.field_1767;
      this.field_2409 = Class469.method_468(var1.field_1417 * 32.0);
      this.field_2940 = Class469.method_468(var1.field_2654 * 32.0);
      this.field_732 = Class469.method_468(var1.field_2013 * 32.0);
      this.field_2847 = (byte)(var1.field_1661 * 256.0F / 360.0F);
      this.field_3119 = (byte)(var1.field_2866 * 256.0F / 360.0F);
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_2932 = var1.readInt();
      this.field_2409 = var1.readInt();
      this.field_2940 = var1.readInt();
      this.field_732 = var1.readInt();
      this.field_2847 = (byte)var1.read();
      this.field_3119 = (byte)var1.read();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_2932);
      var1.writeInt(this.field_2409);
      var1.writeInt(this.field_2940);
      var1.writeInt(this.field_732);
      var1.write(this.field_2847);
      var1.write(this.field_3119);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_1099(this);
   }

   @Override
   public int method_1597() {
      return 34;
   }
}
