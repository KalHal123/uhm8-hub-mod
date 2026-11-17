package ext;

import java.util.HashMap;
import java.util.Map;

public class Class174 {
   private static Map<String, Class<? extends Class359>> field_1936 = new HashMap<>();
   private static Map<Class<? extends Class359>, String> field_1810 = new HashMap<>();
   private static Map<Integer, Class<? extends Class359>> field_2475 = new HashMap<>();
   private static Map<Class<? extends Class359>, Integer> field_1981 = new HashMap<>();

   private static void method_1348(Class<? extends Class359> var0, String var1, int var2) {
      field_1936.put(var1, var0);
      field_1810.put(var0, var1);
      field_2475.put(var2, var0);
      field_1981.put(var0, var2);
   }

   public static Class359 method_1826(String var0, Class454 var1) {
      Class359 var2 = null;

      try {
         Class var3 = field_1936.get(var0);
         if (var3 != null) {
            var2 = (Class359)var3.getConstructor(Class454.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static Class359 method_1685(Class686 var0, Class454 var1) {
      Class359 var2 = null;

      try {
         Class var3 = field_1936.get(var0.method_1087("id"));
         if (var3 != null) {
            var2 = (Class359)var3.getConstructor(Class454.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 != null) {
         var2.method_783(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.method_1087("id"));
      }

      return var2;
   }

   public static Class359 method_1357(int var0, Class454 var1) {
      Class359 var2 = null;

      try {
         Class var3 = field_2475.get(var0);
         if (var3 != null) {
            var2 = (Class359)var3.getConstructor(Class454.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 == null) {
         System.out.println("Skipping Entity with id " + var0);
      }

      return var2;
   }

   public static int method_1341(Class359 var0) {
      return field_1981.get(var0.getClass());
   }

   public static String method_1053(Class359 var0) {
      return field_1810.get(var0.getClass());
   }

   static {
      method_1348(Class10.class, "Arrow", 10);
      method_1348(Class565.class, "Snowball", 11);
      method_1348(Class198.class, "Item", 1);
      method_1348(Class268.class, "Painting", 9);
      method_1348(Class377.class, "Mob", 48);
      method_1348(Class564.class, "Monster", 49);
      method_1348(Class111.class, "Creeper", 50);
      method_1348(Class716.class, "Skeleton", 51);
      method_1348(Class639.class, "Spider", 52);
      method_1348(Class143.class, "Giant", 53);
      method_1348(Class191.class, "Zombie", 54);
      method_1348(Class713.class, "Slime", 55);
      method_1348(Class436.class, "Pig", 90);
      method_1348(Class58.class, "Sheep", 91);
      method_1348(Class105.class, "Cow", 91);
      method_1348(Class146.class, "Chicken", 91);
      method_1348(Class435.class, "PrimedTnt", 20);
      method_1348(Class492.class, "FallingSand", 21);
      method_1348(Class527.class, "Minecart", 40);
      method_1348(Class256.class, "Boat", 41);
      method_1348(Class514.class, "recruiter alphaver (real)", 69);
      method_1348(Class396.class, "Colossus", 70);
      method_1348(Class101.class, "amonus", 72);
      method_1348(Class345.class, "EssenceProjectile", 77);
      method_1348(Class137.class, "Observer", 90);
      Class3.method_392();
   }
}
