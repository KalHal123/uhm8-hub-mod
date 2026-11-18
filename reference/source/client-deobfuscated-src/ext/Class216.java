package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class216 extends Class471 {
   public int field_1715;
   public int field_2918;
   public int field_3074;
   public int field_2522;
   public int field_2835;

   public Class216() {
      this.field_2211 = true;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1715 = var1.readInt();
      this.field_2918 = var1.read();
      this.field_3074 = var1.readInt();
      this.field_2522 = var1.read();
      this.field_2835 = var1.read();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1715);
      var1.write(this.field_2918);
      var1.writeInt(this.field_3074);
      var1.write(this.field_2522);
      var1.write(this.field_2835);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_1666(this);
   }

   @Override
   public int method_1597() {
      return 11;
   }
}
