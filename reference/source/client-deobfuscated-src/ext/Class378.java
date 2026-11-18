package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class378 extends Class16 {
   private List<Class16> field_2665 = new ArrayList<>();
   private byte field_1822;

   @Override
   void method_1446(DataOutput var1) throws IOException {
      if (this.field_2665.size() > 0) {
         this.field_1822 = this.field_2665.get(0).method_758();
      } else {
         this.field_1822 = 1;
      }

      var1.writeByte(this.field_1822);
      var1.writeInt(this.field_2665.size());

      for (int var2 = 0; var2 < this.field_2665.size(); var2++) {
         this.field_2665.get(var2).method_1446(var1);
      }
   }

   @Override
   void method_1800(DataInput var1) throws IOException {
      this.field_1822 = var1.readByte();
      int var2 = var1.readInt();
      this.field_2665 = new ArrayList<>();

      for (int var3 = 0; var3 < var2; var3++) {
         Class16 var4 = Class16.method_1529(this.field_1822);
         var4.method_1800(var1);
         this.field_2665.add(var4);
      }
   }

   @Override
   public byte method_758() {
      return 9;
   }

   @Override
   public String toString() {
      return "" + this.field_2665.size() + " entries of type " + Class16.method_372(this.field_1822);
   }

   public void method_1885(Class16 var1) {
      this.field_1822 = var1.method_758();
      this.field_2665.add(var1);
   }

   public Class16 method_1557(int var1) {
      return this.field_2665.get(var1);
   }

   public int method_619() {
      return this.field_2665.size();
   }
}
