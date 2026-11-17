package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class589 extends Class471 {
   public int field_341;
   public int field_2128;
   public int field_2811;
   public int field_2044;
   public int field_1643;

   public Class589() {
   }

   public Class589(int var1, int var2, int var3, int var4, int var5) {
      this.field_341 = var1;
      this.field_2128 = var2;
      this.field_2811 = var3;
      this.field_2044 = var4;
      this.field_1643 = var5;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_341 = var1.readShort();
      this.field_2128 = var1.readInt();
      this.field_2811 = var1.read();
      this.field_2044 = var1.readInt();
      this.field_1643 = var1.read();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeShort(this.field_341);
      var1.writeInt(this.field_2128);
      var1.write(this.field_2811);
      var1.writeInt(this.field_2044);
      var1.write(this.field_1643);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_841(this);
   }

   @Override
   public int method_1597() {
      return 12;
   }
}
