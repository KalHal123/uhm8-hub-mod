package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class201 extends Class318 {
   public int field_451;
   public String field_118;
   public String field_1350;

   public Class201() {
   }

   public Class201(String var1, String var2, int var3) {
      this.field_118 = var1;
      this.field_1350 = var2;
      this.field_451 = var3;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_451 = var1.readInt();
      this.field_118 = var1.readUTF();
      this.field_1350 = var1.readUTF();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_451);
      var1.writeUTF(this.field_118);
      var1.writeUTF(this.field_1350);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_148(this);
   }

   @Override
   public int method_116() {
      return 4 + this.field_118.length() + this.field_1350.length() + 4;
   }
}
