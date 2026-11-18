import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class w {
   public static hc a(InputStream var0) {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(var0));

      try {
         return a(var1);
      } finally {
         var1.close();
      }
   }

   public static void a(hc var0, OutputStream var1) {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, var2);
      } finally {
         var2.close();
      }
   }

   public static hc a(DataInput var0) {
      ef var1 = ef.b(var0);
      if (var1 instanceof hc) {
         return (hc)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(hc var0, DataOutput var1) {
      ef.a(var0, var1);
   }
}
