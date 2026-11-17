package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class149 extends Class294 {
   public Class149() {
      this.field_432 = true;
   }

   public Class149(int var1, byte var2, byte var3, byte var4, byte var5, byte var6) {
      super(var1);
      this.field_102 = var2;
      this.field_931 = var3;
      this.field_434 = var4;
      this.field_887 = var5;
      this.field_1071 = var6;
      this.field_432 = true;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      super.method_912(var1);
      this.field_102 = var1.readByte();
      this.field_931 = var1.readByte();
      this.field_434 = var1.readByte();
      this.field_887 = var1.readByte();
      this.field_1071 = var1.readByte();
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      super.method_405(var1);
      var1.writeByte(this.field_102);
      var1.writeByte(this.field_931);
      var1.writeByte(this.field_434);
      var1.writeByte(this.field_887);
      var1.writeByte(this.field_1071);
   }

   @Override
   public int method_116() {
      return 9;
   }
}
