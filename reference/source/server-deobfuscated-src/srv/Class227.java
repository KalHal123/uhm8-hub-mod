package srv;

import java.util.HashMap;
import java.util.Map;

public class Class227 {
   private static Map<String, Class<? extends Class252>> field_91 = new HashMap<>();
   private static Map<Class<? extends Class252>, String> field_1572 = new HashMap<>();
   private static Map<Integer, Class<? extends Class252>> field_105 = new HashMap<>();
   private static Map<Class<? extends Class252>, Integer> field_1385 = new HashMap<>();

   private static void method_246(Class<? extends Class252> var0, String var1, int var2) {
      field_91.put(var1, var0);
      field_1572.put(var0, var1);
      field_105.put(var2, var0);
      field_1385.put(var0, var2);
   }

   public static Class252 method_133(String var0, Class317 var1) {
      Class252 var2 = null;

      try {
         Class var3 = field_91.get(var0);
         if (var3 != null) {
            var2 = (Class252)var3.getConstructor(Class317.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static Class252 method_603(Class100 var0, Class317 var1) {
      Class252 var2 = null;

      try {
         Class var3 = field_91.get(var0.method_219("id"));
         if (var3 != null) {
            var2 = (Class252)var3.getConstructor(Class317.class).newInstance(var1);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2 != null) {
         var2.method_680(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.method_219("id"));
      }

      return var2;
   }

   public static int method_13(Class252 var0) {
      return field_1385.get(var0.getClass());
   }

   public static String method_424(Class252 var0) {
      return field_1572.get(var0.getClass());
   }

   static {
      method_246(Class158.class, "Arrow", 10);
      method_246(Class179.class, "Snowball", 11);
      method_246(Class39.class, "Item", 1);
      method_246(Class364.class, "Painting", 9);
      method_246(Class92.class, "Mob", 48);
      method_246(Class244.class, "Monster", 49);
      method_246(Class239.class, "Creeper", 50);
      method_246(Class360.class, "Skeleton", 51);
      method_246(Class333.class, "Spider", 52);
      method_246(Class385.class, "Giant", 53);
      method_246(Class220.class, "Zombie", 54);
      method_246(Class221.class, "Slime", 55);
      method_246(Class362.class, "Pig", 90);
      method_246(Class387.class, "Sheep", 91);
      method_246(Class216.class, "Cow", 91);
      method_246(Class247.class, "Chicken", 91);
      method_246(Class105.class, "PrimedTnt", 20);
      method_246(Class129.class, "FallingSand", 21);
      method_246(Class194.class, "Minecart", 40);
      method_246(Class169.class, "Boat", 41);
      method_246(Class199.class, "recruiter alphaver (real)", 69);
      method_246(Class267.class, "Colossus", 70);
      method_246(Class176.class, "amonus", 72);
      method_246(Class214.class, "EssenceProjectile", 77);
   }
}
