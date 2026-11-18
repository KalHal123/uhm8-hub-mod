package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class310 extends Class335 {
   private List field_1454 = new ArrayList();
   private byte field_1158;

   @Override
   void method_394(DataOutput var1) throws IOException {
      if (this.field_1454.size() > 0) {
         this.field_1158 = ((Class335)this.field_1454.get(0)).method_996();
      } else {
         this.field_1158 = 1;
      }

      var1.writeByte(this.field_1158);
      var1.writeInt(this.field_1454.size());

      for (int var2 = 0; var2 < this.field_1454.size(); var2++) {
         ((Class335)this.field_1454.get(var2)).method_394(var1);
      }
   }

   @Override
   void method_145(DataInput var1) throws IOException {
      this.field_1158 = var1.readByte();
      int var2 = var1.readInt();
      this.field_1454 = new ArrayList();

      for (int var3 = 0; var3 < var2; var3++) {
         Class335 var4 = Class335.method_961(this.field_1158);
         var4.method_145(var1);
         this.field_1454.add(var4);
      }
   }

   @Override
   public byte method_996() {
      return 9;
   }

   @Override
   public String toString() {
      return "" + this.field_1454.size() + " entries of type " + Class335.method_559(this.field_1158);
   }

   public void method_162(Class335 var1) {
      this.field_1158 = var1.method_996();
      this.field_1454.add(var1);
   }

   public Class335 method_542(int var1) {
      return (Class335)this.field_1454.get(var1);
   }

   public int method_622() {
      return this.field_1454.size();
   }
}
