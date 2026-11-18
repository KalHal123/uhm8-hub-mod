package x;

import java.io.DataInput;
import java.io.DataOutput;

public class Class0343 extends Class0115 {
   public String a;

   public Class0343() {
   }

   public Class0343(String var1) {
      this.a = var1;
      if (var1 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   @Override
   void a(DataOutput var1) {
      var1.writeUTF(this.a);
   }

   @Override
   void a(DataInput var1) {
      this.a = var1.readUTF();
   }

   @Override
   public byte a() {
      return 8;
   }

   @Override
   public String toString() {
      return "" + this.a;
   }
}
