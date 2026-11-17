package ext;

import java.util.HashMap;

public class Class225 {
   public static boolean field_1183 = false;
   public static HashMap<String, Class736> field_1719 = new HashMap<>();

   public static Class736 method_1721(String var0) {
      return field_1719.get(var0);
   }

   public static void method_412(String var0, Class736 var1) {
      field_1719.put(var0, var1);
   }
}
