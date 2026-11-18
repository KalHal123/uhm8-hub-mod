package x;

import java.io.DataInput;
import java.io.DataOutput;

public abstract class Class0115 {
   private String a = null;

   abstract void a(DataOutput var1);

   abstract void a(DataInput var1);

   public abstract byte a();

   public String b() {
      return this.a == null ? "" : this.a;
   }

   public Class0115 a(String var1) {
      this.a = var1;
      return this;
   }

   public static Class0115 b(DataInput var0) {
      byte var1 = var0.readByte();
      if (var1 == 0) {
         return new Class0152();
      }

      Class0115 var2 = a(var1);
      var2.a = var0.readUTF();
      var2.a(var0);
      return var2;
   }

   public static void a(Class0115 var0, DataOutput var1) {
      var1.writeByte(var0.a());
      if (var0.a() != 0) {
         var1.writeUTF(var0.b());
         var0.a(var1);
      }
   }

   public static Class0115 a(byte var0) {
      switch (var0) {
         case 0:
            return new Class0152();
         case 1:
            return new Class0231();
         case 2:
            return new Class0306();
         case 3:
            return new Class0222();
         case 4:
            return new Class0168();
         case 5:
            return new Class0136();
         case 6:
            return new Class0278();
         case 7:
            return new Class0101();
         case 8:
            return new Class0343();
         case 9:
            return new Class0269();
         case 10:
            return new Class0193();
         default:
            return null;
      }
   }

   public static String b(byte var0) {
      switch (var0) {
         case 0:
            return "TAG_End";
         case 1:
            return "TAG_Byte";
         case 2:
            return "TAG_Short";
         case 3:
            return "TAG_Int";
         case 4:
            return "TAG_Long";
         case 5:
            return "TAG_Float";
         case 6:
            return "TAG_Double";
         case 7:
            return "TAG_Byte_Array";
         case 8:
            return "TAG_String";
         case 9:
            return "TAG_List";
         case 10:
            return "TAG_Compound";
         default:
            return "UNKNOWN";
      }
   }
}
