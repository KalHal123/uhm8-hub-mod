import java.util.HashMap;
import java.util.Map;

public class ep {
   private static Map a = new HashMap();
   private static Map b = new HashMap();

   private static void a(Class var0, String var1) {
      a.put(var1, var0);
      b.put(var0, var1);
   }

   public static jx a(String var0, cj var1) {
      jx var2 = null;

      try {
         Class var3 = (Class)a.get(var0);
         if (var3 != null) {
            var2 = (jx)var3.getConstructor(cj.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static jx a(hc var0, cj var1) {
      jx var2 = null;

      try {
         Class var3 = (Class)a.get(var0.i("id"));
         if (var3 != null) {
            var2 = (jx)var3.getConstructor(cj.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 != null) {
         var2.e(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.i("id"));
      }

      return var2;
   }

   public static String a(jx var0) {
      return (String)b.get(var0.getClass());
   }

   static {
      a(jw.class, "Arrow");
      a(al.class, "Snowball");
      a(dr.class, "Item");
      a(it.class, "Painting");
      a(fv.class, "Mob");
      a(dk.class, "Monster");
      a(cy.class, "Creeper");
      a(cs.class, "Skeleton");
      a(at.class, "Spider");
      a(hb.class, "Giant");
      a(lr.class, "Zombie");
      a(lq.class, "Slime");
      a(mj.class, "Pig");
      a(bk.class, "Sheep");
      a(ak.class, "Cow");
      a(mm.class, "Chicken");
      a(iu.class, "PrimedTnt");
      a(ex.class, "FallingSand");
      a(no.class, "Minecart");
      a(cx.class, "Boat");
   }
}
