package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class381 extends Class318 {
   public int field_371;
   public int field_864;
   public int field_1189;
   public byte[] field_620;
   public Class100 field_1489;

   public Class381() {
      this.field_198 = true;
   }

   public Class381(int var1, int var2, int var3, Class66 var4) {
      this.field_198 = true;
      this.field_371 = var1;
      this.field_864 = var2;
      this.field_1189 = var3;
      this.field_1489 = new Class100();
      var4.method_878(this.field_1489);

      try {
         this.field_620 = Class165.method_500(this.field_1489);
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_371 = var1.readInt();
      this.field_864 = var1.readShort();
      this.field_1189 = var1.readInt();
      int var2 = var1.readShort() & '\uffff';
      this.field_620 = new byte[var2];
      var1.readFully(this.field_620);
      this.field_1489 = Class165.method_856(this.field_620);
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_371);
      var1.writeShort(this.field_864);
      var1.writeInt(this.field_1189);
      var1.writeShort((short)this.field_620.length);
      var1.write(this.field_620);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_889(this);
   }

   @Override
   public int method_116() {
      return this.field_620.length + 2 + 10;
   }
}
