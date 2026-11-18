package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class Class16 {
   private String field_956 = null;

   abstract void method_1446(DataOutput var1) throws IOException;

   abstract void method_1800(DataInput var1) throws IOException;

   public abstract byte method_758();

   public String method_352() {
      return this.field_956 == null ? "" : this.field_956;
   }

   public Class16 method_1280(String var1) {
      this.field_956 = var1;
      return this;
   }

   public static Class16 method_1064(DataInput var0) throws IOException {
      byte var1 = var0.readByte();
      if (var1 == 0) {
         return new Class162();
      }

      Class16 var2 = method_1529(var1);
      var2.field_956 = var0.readUTF();
      var2.method_1800(var0);
      return var2;
   }

   public static void method_1408(Class16 var0, DataOutput var1) throws IOException {
      var1.writeByte(var0.method_758());
      if (var0.method_758() != 0) {
         var1.writeUTF(var0.method_352());
         var0.method_1446(var1);
      }
   }

   public static Class16 method_1529(byte var0) {
      switch (var0) {
         case 0:
            return new Class162();
         case 1:
            return new Class588();
         case 2:
            return new Class539();
         case 3:
            return new Class472();
         case 4:
            return new Class461();
         case 5:
            return new Class27();
         case 6:
            return new Class153();
         case 7:
            return new Class303();
         case 8:
            return new Class403();
         case 9:
            return new Class378();
         case 10:
            return new Class686();
         default:
            return null;
      }
   }

   public static String method_372(byte var0) {
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
