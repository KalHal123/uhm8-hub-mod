package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class96 extends Class471 {
   public int field_1797;
   public double field_2109;
   public double field_2306;
   public double field_2903;
   public double field_2407;
   public double field_3140;

   public Class96(int var1, double var2, double var4, double var6, double var8, double var10) {
      this.field_1797 = var1;
      this.field_2109 = var2;
      this.field_2306 = var4;
      this.field_2903 = var6;
      this.field_2407 = var8;
      this.field_3140 = var10;
   }

   public Class96() {
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1797 = var1.readInt();
      this.field_2109 = var1.readDouble();
      this.field_2306 = var1.readDouble();
      this.field_2903 = var1.readDouble();
      this.field_2407 = var1.readDouble();
      this.field_3140 = var1.readDouble();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1797);
      var1.writeDouble(this.field_2109);
      var1.writeDouble(this.field_2306);
      var1.writeDouble(this.field_2903);
      var1.writeDouble(this.field_2407);
      var1.writeDouble(this.field_3140);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_302(this);
   }

   @Override
   public int method_1597() {
      return 44;
   }
}
