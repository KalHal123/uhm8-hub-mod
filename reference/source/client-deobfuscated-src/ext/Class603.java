package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class603 extends Class471 {
   public Class326 field_948;
   public Class326 field_2188;
   public int field_1219;

   public Class603(Class326 var1, Class326 var2, int var3) {
      this.field_948 = var1;
      this.field_2188 = var2;
      this.field_1219 = var3;
   }

   public Class603() {
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_948 = Class326.method_201(var1);
      this.field_2188 = Class326.method_201(var1);
      this.field_1219 = var1.readInt();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      this.field_948.method_81(var1);
      this.field_2188.method_81(var1);
      var1.writeInt(this.field_1219);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_428(this);
   }

   @Override
   public int method_1597() {
      return 0;
   }
}
