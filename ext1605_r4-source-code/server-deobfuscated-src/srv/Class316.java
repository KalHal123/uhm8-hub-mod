package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class316 extends Class318 {
   public int field_1471;
   public Class150[] field_506;

   public Class316() {
   }

   public Class316(int var1, Class150[] var2) {
      this.field_1471 = var1;
      this.field_506 = new Class150[var2.length];

      for (int var3 = 0; var3 < this.field_506.length; var3++) {
         this.field_506[var3] = var2[var3] == null ? null : var2[var3].method_83();
      }
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_1471 = var1.readInt();
      short var2 = var1.readShort();
      this.field_506 = new Class150[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1.readInt();
         if (var4 >= 0) {
            byte var5 = var1.readByte();
            short var6 = var1.readShort();
            this.field_506[var3] = new Class150(var4, var5, var6);
         }
      }
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1471);
      var1.writeShort(this.field_506.length);

      for (int var2 = 0; var2 < this.field_506.length; var2++) {
         if (this.field_506[var2] == null) {
            var1.writeInt(-1);
         } else {
            var1.writeInt(this.field_506[var2].field_1298);
            var1.writeByte((byte)this.field_506[var2].field_1497);
            var1.writeShort((short)this.field_506[var2].field_819);
         }
      }
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_615(this);
   }

   @Override
   public int method_116() {
      return 6 + this.field_506.length * 7;
   }
}
