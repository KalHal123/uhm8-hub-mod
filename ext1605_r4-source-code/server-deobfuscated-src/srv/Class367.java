package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class367 extends Class318 {
   public int field_577;
   public int field_1138;
   public int field_440;
   public long field_760;

   public Class367() {
   }

   public Class367(int var1, int var2, int var3, long var4) {
      this.field_577 = var1;
      this.field_1138 = var2;
      this.field_440 = var3;
      this.field_760 = var4;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_577 = var1.readInt();
      this.field_1138 = var1.readInt();
      this.field_440 = var1.readInt();
      this.field_760 = var1.readLong();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_577);
      var1.writeInt(this.field_1138);
      var1.writeInt(this.field_440);
      var1.writeLong(this.field_760);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_647(this);
   }

   @Override
   public int method_116() {
      return 20;
   }
}
