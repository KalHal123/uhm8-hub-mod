package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class374 extends Class318 {
   public int field_582;
   public int field_687;
   public int field_972;
   public int field_631;
   public byte field_867;
   public byte field_1162;

   public Class374() {
   }

   public Class374(Class252 var1) {
      this.field_582 = var1.field_331;
      this.field_687 = Class380.method_502(var1.field_1324 * 32.0);
      this.field_972 = Class380.method_502(var1.field_632 * 32.0);
      this.field_631 = Class380.method_502(var1.field_1321 * 32.0);
      this.field_867 = (byte)(var1.field_909 * 256.0F / 360.0F);
      this.field_1162 = (byte)(var1.field_427 * 256.0F / 360.0F);
   }

   public Class374(int var1, int var2, int var3, int var4, byte var5, byte var6) {
      this.field_582 = var1;
      this.field_687 = var2;
      this.field_972 = var3;
      this.field_631 = var4;
      this.field_867 = var5;
      this.field_1162 = var6;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_582 = var1.readInt();
      this.field_687 = var1.readInt();
      this.field_972 = var1.readInt();
      this.field_631 = var1.readInt();
      this.field_867 = (byte)var1.read();
      this.field_1162 = (byte)var1.read();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_582);
      var1.writeInt(this.field_687);
      var1.writeInt(this.field_972);
      var1.writeInt(this.field_631);
      var1.write(this.field_867);
      var1.write(this.field_1162);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_583(this);
   }

   @Override
   public int method_116() {
      return 34;
   }
}
