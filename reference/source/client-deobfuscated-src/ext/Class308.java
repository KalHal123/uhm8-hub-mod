package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class308 extends Class471 {
   public int field_1762;
   public int field_1891;
   public short[] field_782;
   public byte[] field_1878;
   public byte[] field_1441;
   public int field_2169;

   public Class308() {
      this.field_2211 = true;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_1762 = var1.readInt();
      this.field_1891 = var1.readInt();
      this.field_2169 = var1.readShort() & '\uffff';
      this.field_782 = new short[this.field_2169];
      this.field_1878 = new byte[this.field_2169];
      this.field_1441 = new byte[this.field_2169];

      for (int var2 = 0; var2 < this.field_2169; var2++) {
         this.field_782[var2] = var1.readShort();
      }

      var1.readFully(this.field_1878);
      var1.readFully(this.field_1441);
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_1762);
      var1.writeInt(this.field_1891);
      var1.writeShort((short)this.field_2169);

      for (int var2 = 0; var2 < this.field_2169; var2++) {
         var1.writeShort(this.field_782[var2]);
      }

      var1.write(this.field_1878);
      var1.write(this.field_1441);
   }

   @Override
   public void method_1876(Class8 var1) {
      var1.method_363(this);
   }

   @Override
   public int method_1597() {
      return 10 + this.field_2169 * 4;
   }
}
