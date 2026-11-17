package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class Class335 {
   private String field_987 = null;

   abstract void method_394(DataOutput var1) throws IOException;

   abstract void method_145(DataInput var1) throws IOException;

   public abstract byte method_996();

   public String method_1025() {
      return this.field_987 == null ? "" : this.field_987;
   }

   public Class335 method_428(String var1) {
      this.field_987 = var1;
      return this;
   }

   public static Class335 method_736(DataInput var0) throws IOException {
      byte var1 = var0.readByte();
      if (var1 == 0) {
         return new Class152();
      }

      Class335 var2 = method_961(var1);
      var2.field_987 = var0.readUTF();
      var2.method_145(var0);
      return var2;
   }

   public static void method_710(Class335 var0, DataOutput var1) throws IOException {
      var1.writeByte(var0.method_996());
      if (var0.method_996() != 0) {
         var1.writeUTF(var0.method_1025());
         var0.method_394(var1);
      }
   }

   public static Class335 method_961(byte var0) {
      switch (var0) {
         case 0:
            return new Class152();
         case 1:
            return new Class142();
         case 2:
            return new Class305();
         case 3:
            return new Class25();
         case 4:
            return new Class253();
         case 5:
            return new Class260();
         case 6:
            return new Class155();
         case 7:
            return new Class218();
         case 8:
            return new Class118();
         case 9:
            return new Class310();
         case 10:
            return new Class100();
         default:
            return null;
      }
   }

   public static String method_559(byte var0) {
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
