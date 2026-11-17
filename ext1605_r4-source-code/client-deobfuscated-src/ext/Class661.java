package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class661 extends Class471 {
   public int field_334;
   public int field_2447;
   public int field_2527;
   public int field_161;
   public int field_1848;

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_334 = var1.readInt();
      this.field_1848 = var1.readByte();
      this.field_2447 = var1.readInt();
      this.field_2527 = var1.readInt();
      this.field_161 = var1.readInt();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_334);
      var1.writeByte(this.field_1848);
      var1.writeInt(this.field_2447);
      var1.writeInt(this.field_2527);
      var1.writeInt(this.field_161);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_442(this);
   }

   @Override
   public int method_1597() {
      return 17;
   }
}
