package x;

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

public class Class0167 {
   public static Class0100 _VA7wvlmXLis2PNlFuU90q8246iExpBSi34LwnKC6ohph8ry207cnEZ9PaqN/* $VF was: 5VA7wvlmXLis2PNlFuU90q8246iExpBSi34LwnKC6ohph8ry207cnEZ9PaqN */(
      InputStream var0
   ) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(var0));

      Class0100 var2;
      try {
         var2 = _rUC4UFdLvUOk1sDN8U838JlsYVtvYi92Ah57f6SYa4zCXi79Vb0F9Qpjj7c/* $VF was: 7rUC4UFdLvUOk1sDN8U838JlsYVtvYi92Ah57f6SYa4zCXi79Vb0F9Qpjj7c */(var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void _5673g3ADn8Wl588fp75Vzl9y5K8VpJEr768CHr5Bh6nT1zP8331LT5dF7aK/* $VF was: 75673g3ADn8Wl588fp75Vzl9y5K8VpJEr768CHr5Bh6nT1zP8331LT5dF7aK */(
      Class0100 var0, OutputStream var1
   ) throws IOException {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         _nA3C0b5tVlR21ef14uztmC1EW99lG6qVR8KqIlA9YGYHYR52yC6iC50890q/* $VF was: 4nA3C0b5tVlR21ef14uztmC1EW99lG6qVR8KqIlA9YGYHYR52yC6iC50890q */(var0, var2);
      } finally {
         var2.close();
      }
   }

   public static Class0100 _DQL2bHdHveF4wTR9K59OKG046Wg669raaVNELh4QCxmhv555WhT01ghz96m/* $VF was: 8DQL2bHdHveF4wTR9K59OKG046Wg669raaVNELh4QCxmhv555WhT01ghz96m */(
      byte[] var0
   ) throws IOException {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var0)));

      Class0100 var2;
      try {
         var2 = _rUC4UFdLvUOk1sDN8U838JlsYVtvYi92Ah57f6SYa4zCXi79Vb0F9Qpjj7c/* $VF was: 7rUC4UFdLvUOk1sDN8U838JlsYVtvYi92Ah57f6SYa4zCXi79Vb0F9Qpjj7c */(var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] _ywnKs2JZM1yAac3Ol87T0B6Sk7aSm7WIhp8N9BI1ZW7od78CeA67k4QDnTW/* $VF was: 4ywnKs2JZM1yAac3Ol87T0B6Sk7aSm7WIhp8N9BI1ZW7od78CeA67k4QDnTW */(
      Class0100 var0
   ) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         _nA3C0b5tVlR21ef14uztmC1EW99lG6qVR8KqIlA9YGYHYR52yC6iC50890q/* $VF was: 4nA3C0b5tVlR21ef14uztmC1EW99lG6qVR8KqIlA9YGYHYR52yC6iC50890q */(var0, var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static Class0100 _rUC4UFdLvUOk1sDN8U838JlsYVtvYi92Ah57f6SYa4zCXi79Vb0F9Qpjj7c/* $VF was: 7rUC4UFdLvUOk1sDN8U838JlsYVtvYi92Ah57f6SYa4zCXi79Vb0F9Qpjj7c */(
      DataInput var0
   ) throws IOException {
      Class0338 var1 = Class0338._5S31GTz4F4VL7hL21RctVg1QYotcFE6n2B28ayO6eY5k534P5p0jgWvkm88/* $VF was: 75S31GTz4F4VL7hL21RctVg1QYotcFE6n2B28ayO6eY5k534P5p0jgWvkm88 */(
         var0
      );
      if (var1 instanceof Class0100) {
         return (Class0100)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void _nA3C0b5tVlR21ef14uztmC1EW99lG6qVR8KqIlA9YGYHYR52yC6iC50890q/* $VF was: 4nA3C0b5tVlR21ef14uztmC1EW99lG6qVR8KqIlA9YGYHYR52yC6iC50890q */(
      Class0100 var0, DataOutput var1
   ) throws IOException {
      Class0338._x2VHNgj3L102rt63io32t9Ry908P5zl09fEK1849MVwDwBJ4J17l111u35r/* $VF was: 6x2VHNgj3L102rt63io32t9Ry908P5zl09fEK1849MVwDwBJ4J17l111u35r */(
         var0, var1
      );
   }
}
