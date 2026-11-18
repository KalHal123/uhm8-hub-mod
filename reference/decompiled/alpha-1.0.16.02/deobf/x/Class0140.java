package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class Class0140 {
   private static Map a = new HashMap();
   private static Map b = new HashMap();
   public boolean j = false;

   static void a(int var0, Class var1) {
      if (a.containsKey(var0)) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      }

      if (b.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var1);
      }

      a.put(var0, var1);
      b.put(var1, var0);
   }

   public static Class0140 a(int var0) {
      try {
         Class var1 = (Class)a.get(var0);
         return var1 == null ? null : (Class0140)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int b() {
      return (Integer)b.get(this.getClass());
   }

   public static Class0140 b(DataInputStream var0) {
      int var1 = var0.read();
      if (var1 == -1) {
         return null;
      }

      Class0140 var2 = a(var1);
      if (var2 == null) {
         throw new IOException("Bad packet id " + var1);
      }

      var2.a(var0);
      return var2;
   }

   public static void a(Class0140 var0, DataOutputStream var1) {
      var1.write(var0.b());
      var0.a(var1);
   }

   public abstract void a(DataInputStream var1);

   public abstract void a(DataOutputStream var1);

   public abstract void a(Class0288 var1);

   public abstract int a();

   static {
      a(0, Class0162.class);
      a(1, Class0196.class);
      a(2, Class0174.class);
      a(3, Class0216.class);
      a(10, Class0111.class);
      a(11, Class0380.class);
      a(12, Class0322.class);
      a(13, Class0059.class);
      a(14, Class0134.class);
      a(15, Class0091.class);
      a(16, Class0102.class);
      a(17, Class0290.class);
      a(18, Class0185.class);
      a(20, Class0170.class);
      a(21, Class0180.class);
      a(22, Class0037.class);
      a(23, Class0270.class);
      a(29, Class0254.class);
      a(30, Class0304.class);
      a(31, Class0276.class);
      a(32, Class0258.class);
      a(33, Class0226.class);
      a(34, Class0246.class);
      a(50, Class0261.class);
      a(51, Class0050.class);
      a(52, Class0339.class);
      a(53, Class0295.class);
      a(255, Class0372.class);
   }
}
