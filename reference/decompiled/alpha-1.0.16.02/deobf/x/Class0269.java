package x;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

public class Class0269 extends Class0115 {
   private List a = new ArrayList();
   private byte b;

   @Override
   void a(DataOutput var1) {
      if (this.a.size() > 0) {
         this.b = ((Class0115)this.a.get(0)).a();
      } else {
         this.b = 1;
      }

      var1.writeByte(this.b);
      var1.writeInt(this.a.size());

      for (int var2 = 0; var2 < this.a.size(); var2++) {
         ((Class0115)this.a.get(var2)).a(var1);
      }
   }

   @Override
   void a(DataInput var1) {
      this.b = var1.readByte();
      int var2 = var1.readInt();
      this.a = new ArrayList();

      for (int var3 = 0; var3 < var2; var3++) {
         Class0115 var4 = Class0115.a(this.b);
         var4.a(var1);
         this.a.add(var4);
      }
   }

   @Override
   public byte a() {
      return 9;
   }

   @Override
   public String toString() {
      return "" + this.a.size() + " entries of type " + Class0115.b(this.b);
   }

   public void a(Class0115 var1) {
      this.b = var1.a();
      this.a.add(var1);
   }

   public Class0115 a(int var1) {
      return (Class0115)this.a.get(var1);
   }

   public int c() {
      return this.a.size();
   }
}
