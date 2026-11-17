package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class162 extends Class318 {
   public int field_1525;
   public int field_1253;
   public short[] field_352;
   public byte[] field_456;
   public byte[] field_1040;
   public int field_1418;

   public Class162() {
      this.field_198 = true;
   }

   public Class162(int var1, int var2, short[] var3, int var4, Class317 var5) {
      this.field_198 = true;
      this.field_1525 = var1;
      this.field_1253 = var2;
      this.field_1418 = var4;
      this.field_352 = new short[var4];
      this.field_456 = new byte[var4];
      this.field_1040 = new byte[var4];
      Class166 var6 = var5.method_695(var1, var2);

      for (int var7 = 0; var7 < var4; var7++) {
         int var8 = var3[var7] >> 12 & 15;
         int var9 = var3[var7] >> 8 & 15;
         int var10 = var3[var7] & 255;
         this.field_352[var7] = var3[var7];
         this.field_456[var7] = (byte)var6.method_218(var8, var10, var9);
         this.field_1040[var7] = (byte)var6.method_126(var8, var10, var9);
      }
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1525 = var1.readInt();
      this.field_1253 = var1.readInt();
      this.field_1418 = var1.readShort() & '\uffff';
      this.field_352 = new short[this.field_1418];
      this.field_456 = new byte[this.field_1418];
      this.field_1040 = new byte[this.field_1418];

      for (int var2 = 0; var2 < this.field_1418; var2++) {
         this.field_352[var2] = var1.readShort();
      }

      var1.readFully(this.field_456);
      var1.readFully(this.field_1040);
      Class273.method_579("Received packet52");
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1525);
      var1.writeInt(this.field_1253);
      var1.writeShort((short)this.field_1418);

      for (int var2 = 0; var2 < this.field_1418; var2++) {
         var1.writeShort(this.field_352[var2]);
      }

      var1.write(this.field_456);
      var1.write(this.field_1040);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_884(this);
   }

   @Override
   public int method_116() {
      return 10 + this.field_1418 * 4;
   }
}
