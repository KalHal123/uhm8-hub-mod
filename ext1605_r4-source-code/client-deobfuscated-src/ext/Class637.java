package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class637 extends Class238 {
   public boolean field_2928 = false;
   public int field_160 = -1;
   public int field_2695 = 0;
   String field_1105 = "";

   public Class637() {
   }

   public Class637(String var1, int var2, int var3, String var4) {
      this.field_160 = var2;
      this.field_2363 = var1;
      this.field_2695 = var3;
      this.field_1105 = var4;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_160 = var1.readInt();
      this.field_2695 = var1.readInt();
      this.field_2363 = var1.readUTF();
      this.field_1105 = var1.readUTF();

      try {
         this.field_2928 = Class278.method_1741(this.field_160 + "" + this.field_2363.substring(this.field_2695), this.field_1105);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_160);
      var1.writeInt(this.field_2695);
      var1.writeUTF(this.field_2363);
      var1.writeUTF(this.field_1105);
   }

   @Override
   public void method_1876(Class8 var1) {
      if (!this.field_2928) {
         Class597.method_883("[SecureChatEcho] INVALID SIGNATURE.");
      }

      var1.method_643(this);
   }

   @Override
   public int method_1597() {
      return this.field_2363.length() + this.field_1105.length() + 4 + 4;
   }
}
