package x;

import java.util.HashMap;
import java.util.Map;

public class Class0125 {
   private static Map a = new HashMap();
   private static Map b = new HashMap();

   private static void a(Class var0, String var1) {
      a.put(var1, var0);
      b.put(var0, var1);
   }

   public static Class0268 a(String var0, Class0065 var1) {
      Class0268 var2 = null;

      try {
         Class var3 = (Class)a.get(var0);
         if (var3 != null) {
            var2 = (Class0268)var3.getConstructor(Class0065.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static Class0268 a(Class0193 var0, Class0065 var1) {
      Class0268 var2 = null;

      try {
         Class var3 = (Class)a.get(var0.i("id"));
         if (var3 != null) {
            var2 = (Class0268)var3.getConstructor(Class0065.class).newInstance(var1);
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

   public static String a(Class0268 var0) {
      return (String)b.get(var0.getClass());
   }

   static {
      a(Class0267.class, "Arrow");
      a(Class0013.class, "Snowball");
      a(Class0100.class, "Item");
      a(Class0237.class, "Painting");
      a(Class0158.class, "Mob");
      a(Class0093.class, "Monster");
      a(Class0080.class, "Creeper");
      a(Class0074.class, "Skeleton");
      a(Class0021.class, "Spider");
      a(Class0192.class, "Giant");
      a(Class0316.class, "Zombie");
      a(Class0315.class, "Slime");
      a(Class0335.class, "Pig");
      a(Class0039.class, "Sheep");
      a(Class0012.class, "Cow");
      a(Class0338.class, "Chicken");
      a(Class0238.class, "PrimedTnt");
      a(Class0133.class, "FallingSand");
      a(Class0367.class, "Minecart");
      a(Class0079.class, "Boat");
   }
}
