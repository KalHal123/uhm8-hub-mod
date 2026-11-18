package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class98 implements Interface602 {
   int field_2840;
   int field_1116;
   int field_2113;

   public Class98() {
   }

   public Class98(int var1, int var2, int var3) {
      this.field_2840 = var1;
      this.field_1116 = var2;
      this.field_2113 = var3;
   }

   @Override
   public byte method_258() {
      return -80;
   }

   @Override
   public void method_1522(DataOutputStream var1) throws IOException {
      byte[] var2 = new byte[1024];
      Class454 var3 = Class119.field_1519.field_2648;
      int var4 = 0;

      for (int var5 = 0; var5 != 16; var5++) {
         for (int var6 = 0; var6 != 16; var6++) {
            for (int var7 = 0; var7 != 16; var7++) {
               var2[var4] = (byte)var3.method_197(var6, this.field_2113 * 4 + var5, var7);
               var4++;
            }
         }
      }

      var1.writeInt(this.field_2113);
      var1.writeInt(this.field_2840);
      var1.writeInt(this.field_1116);
      var1.write(var2, 0, 1024);
   }

   @Override
   public void method_7(DataInputStream var1) throws IOException {
      int var2 = var1.readInt();
      int var3 = var1.readInt();
      int var4 = var1.readInt();
      byte[] var5 = new byte[1024];
      var1.read(var5, 0, 1024);
   }

   @Override
   public void method_1845(DataOutputStream var1) throws IOException {
   }

   @Override
   public int method_1013() {
      return 1036;
   }
}
