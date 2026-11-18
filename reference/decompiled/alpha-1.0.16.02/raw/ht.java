import java.util.HashMap;
import java.util.Map;

public class ht {
   private static Map a = new HashMap();
   private static Map b = new HashMap();
   public cj e;
   public int f;
   public int g;
   public int h;

   private static void a(Class var0, String var1) {
      if (b.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id: " + var1);
      }

      a.put(var1, var0);
      b.put(var0, var1);
   }

   public void a(hc var1) {
      this.f = var1.e("x");
      this.g = var1.e("y");
      this.h = var1.e("z");
   }

   public void b(hc var1) {
      String var2 = (String)b.get(this.getClass());
      if (var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      }

      var1.a("id", var2);
      var1.a("x", this.f);
      var1.a("y", this.g);
      var1.a("z", this.h);
   }

   public void k_() {
   }

   public static ht c(hc var0) {
      ht var1 = null;

      try {
         Class var2 = (Class)a.get(var0.i("id"));
         if (var2 != null) {
            var1 = (ht)var2.newInstance();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      if (var1 != null) {
         var1.a(var0);
      } else {
         System.out.println("Skipping TileEntity with id " + var0.i("id"));
      }

      return var1;
   }

   public int e() {
      return this.e.e(this.f, this.g, this.h);
   }

   public void d() {
      this.e.n(this.f, this.g, this.h);
   }

   public double a(double var1, double var3, double var5) {
      double var7 = this.f + 0.5 - var1;
      double var9 = this.g + 0.5 - var3;
      double var11 = this.h + 0.5 - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public ln f() {
      return ln.n[this.e.a(this.f, this.g, this.h)];
   }

   static {
      a(ju.class, "Furnace");
      a(ew.class, "Chest");
      a(nn.class, "Sign");
      a(ba.class, "MobSpawner");
   }
}
