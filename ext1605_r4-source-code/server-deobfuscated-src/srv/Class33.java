package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class33 extends Class201 {
   public int field_827;
   public String field_385 = "";
   public int field_1338 = 0;
   public boolean field_337 = false;

   public Class33() {
   }

   public Class33(String var1, String var2, int var3, int var4) {
      this.field_118 = var1;
      this.field_1350 = var2;
      this.field_827 = var3;
      this.field_1338 = var4;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      long var2 = var1.readLong();
      this.field_118 = var1.readUTF();
      this.field_1350 = var1.readUTF();
      this.field_827 = var1.readInt();
      this.field_1338 = var1.readInt();

      try {
         this.field_337 = Class119.method_666(var2 + "" + this.field_118 + "" + this.field_1350 + "" + this.field_827 + "" + this.field_1338, var1.readUTF());
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      long var2 = System.currentTimeMillis();
      var1.writeLong(var2);
      var1.writeUTF(this.field_118);
      var1.writeUTF(this.field_1350);
      var1.writeInt(this.field_827);
      var1.writeInt(this.field_1338);

      try {
         var1.writeUTF(Class119.method_548(var2 + "" + this.field_118 + "" + this.field_1350 + "" + this.field_827 + "" + this.field_1338, Class119.field_754));
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_1006(this);
   }

   @Override
   public int method_116() {
      return 8 + this.field_118.length() + this.field_1350.length() + 4 + 4;
   }
}
