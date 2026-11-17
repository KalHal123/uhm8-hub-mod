package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class632 extends Class288 {
   public Class632() {
      this.field_60 = true;
   }

   public Class632(float var1, float var2, boolean var3) {
      this.field_1768 = var1;
      this.field_33 = var2;
      this.field_861 = var3;
      this.field_60 = true;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1768 = var1.readFloat();
      this.field_33 = var1.readFloat();
      super.method_1135(var1);
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeFloat(this.field_1768);
      var1.writeFloat(this.field_33);
      super.method_805(var1);
   }

   @Override
   public int method_1597() {
      return 9;
   }
}
