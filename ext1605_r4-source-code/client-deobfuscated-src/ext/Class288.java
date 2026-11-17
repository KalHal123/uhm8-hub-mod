package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class288 extends Class471 {
   public double field_2779;
   public double field_2898;
   public double field_257;
   public double field_370;
   public float field_1768;
   public float field_33;
   public boolean field_861;
   public boolean field_757;
   public boolean field_60;

   public Class288() {
   }

   public Class288(boolean var1) {
      this.field_861 = var1;
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_772(this);
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_861 = var1.read() != 0;
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.write(this.field_861 ? 1 : 0);
   }

   @Override
   public int method_1597() {
      return 1;
   }
}
