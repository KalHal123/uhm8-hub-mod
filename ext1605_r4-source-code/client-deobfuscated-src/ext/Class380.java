package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class380 extends Class471 {
   public int field_1321;
   public int field_1042;
   public int field_1430;
   public int field_2424;
   public int field_1033;

   public Class380() {
   }

   public Class380(int var1, int var2, int var3, int var4, int var5) {
      this.field_1033 = var1;
      this.field_1321 = var2;
      this.field_1042 = var3;
      this.field_1430 = var4;
      this.field_2424 = var5;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1033 = var1.read();
      this.field_1321 = var1.readInt();
      this.field_1042 = var1.read();
      this.field_1430 = var1.readInt();
      this.field_2424 = var1.read();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.write(this.field_1033);
      var1.writeInt(this.field_1321);
      var1.write(this.field_1042);
      var1.writeInt(this.field_1430);
      var1.write(this.field_2424);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_454(this);
   }

   @Override
   public int method_1597() {
      return 11;
   }
}
