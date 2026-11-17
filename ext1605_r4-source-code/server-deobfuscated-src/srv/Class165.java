package srv;

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

public class Class165 {
   public static Class100 method_562(InputStream var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(var0));

      Class100 var2;
      try {
         var2 = method_806(var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void method_734(Class100 var0, OutputStream var1) throws IOException {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         method_479(var0, var2);
      } finally {
         var2.close();
      }
   }

   public static Class100 method_856(byte[] var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var0)));

      Class100 var2;
      try {
         var2 = method_806(var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] method_500(Class100 var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         method_479(var0, var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static Class100 method_806(DataInput var0) throws IOException {
      Class335 var1 = Class335.method_736(var0);
      if (var1 instanceof Class100) {
         return (Class100)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void method_479(Class100 var0, DataOutput var1) throws IOException {
      Class335.method_710(var0, var1);
   }
}
