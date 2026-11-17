package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class697 extends Class471 {
   public int field_1030;
   public int field_1660;
   public int field_286;
   public long field_766;

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1030 = var1.readInt();
      this.field_1660 = var1.readInt();
      this.field_286 = var1.readInt();
      this.field_766 = var1.readLong();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1030);
      var1.writeInt(this.field_1660);
      var1.writeInt(this.field_286);
      var1.writeLong(this.field_766);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_628(this);
   }

   @Override
   public int method_1597() {
      return 20;
   }
}
