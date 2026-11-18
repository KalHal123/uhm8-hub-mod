import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class fd {
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

   public static fd a(int var0) {
      try {
         Class var1 = (Class)a.get(var0);
         return var1 == null ? null : (fd)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int b() {
      return (Integer)b.get(this.getClass());
   }

   public static fd b(DataInputStream var0) {
      int var1 = var0.read();
      if (var1 == -1) {
         return null;
      }

      fd var2 = a(var1);
      if (var2 == null) {
         throw new IOException("Bad packet id " + var1);
      }

      var2.a(var0);
      return var2;
   }

   public static void a(fd var0, DataOutputStream var1) {
      var1.write(var0.b());
      var0.a(var1);
   }

   public abstract void a(DataInputStream var1);

   public abstract void a(DataOutputStream var1);

   public abstract void a(kq var1);

   public abstract int a();

   static {
      a(0, fz.class);
      a(1, hf.class);
      a(2, gk.class);
      a(3, hz.class);
      a(10, eb.class);
      a(11, r.class);
      a(12, lx.class);
      a(13, cd.class);
      a(14, ey.class);
      a(15, di.class);
      a(16, dt.class);
      a(17, ks.class);
      a(18, gv.class);
      a(20, gg.class);
      a(21, gq.class);
      a(22, bi.class);
      a(23, jz.class);
      a(29, jj.class);
      a(30, lf.class);
      a(31, ke.class);
      a(32, jn.class);
      a(33, ii.class);
      a(34, jb.class);
      a(50, jq.class);
      a(51, bv.class);
      a(52, mn.class);
      a(53, kx.class);
      a(255, nt.class);
   }
}
