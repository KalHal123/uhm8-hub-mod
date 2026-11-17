package ext;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Class679 {
   public static Class686 method_157(InputStream var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(var0));

      Class686 var2;
      try {
         var2 = method_1034(var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void method_1635(Class686 var0, OutputStream var1) throws IOException {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         method_1429(var0, var2);
      } finally {
         var2.close();
      }
   }

   public static Class686 method_1397(byte[] var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var0)));

      Class686 var2;
      try {
         var2 = method_1034(var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] method_782(Class686 var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         method_1429(var0, var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static Class686 method_1034(DataInput var0) throws IOException {
      Class16 var1 = Class16.method_1064(var0);
      if (var1 instanceof Class686) {
         return (Class686)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void method_1429(Class686 var0, DataOutput var1) throws IOException {
      Class16.method_1408(var0, var1);
   }
}
