package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class Class318 {
   private static Map<Integer, Class<? extends Class318>> field_934 = new HashMap<>();
   private static Map<Class<? extends Class318>, Integer> field_717 = new HashMap<>();
   public boolean field_198 = false;

   static void method_474(int var0, Class<? extends Class318> var1) {
      if (field_934.containsKey(var0)) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      }

      if (field_717.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var1);
      }

      field_934.put(var0, var1);
      field_717.put(var1, var0);
   }

   public static Class318 method_738(int var0) {
      try {
         Class var1 = field_934.get(var0);
         return var1 == null ? null : (Class318)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int method_285() {
      return field_717.get(this.getClass());
   }

   public static Class318 method_876(DataInputStream var0) throws IOException {
      int var1 = var0.read();
      if (var1 == -1) {
         return null;
      }

      Class318 var2 = method_738(var1);
      if (var2 == null) {
         throw new IOException("Bad packet id " + var1);
      }

      if (var1 != 10 && var1 != 11) {
      }

      var2.method_912(var0);
      return var2;
   }

   public static void method_463(Class318 var0, DataOutputStream var1) throws IOException {
      int var2 = var0.method_285();
      if (var2 != 52 && var2 != 53 && var2 != 51 && var2 != 4 && var2 != 30 && var2 != 0) {
      }

      var1.write(var0.method_285());
      var0.method_405(var1);
   }

   public abstract void method_912(DataInputStream var1) throws IOException;

   public abstract void method_405(DataOutputStream var1) throws IOException;

   public abstract void method_1020(Class191 var1);

   public abstract int method_116();

   static {
      method_474(0, Class174.class);
      method_474(1, Class201.class);
      method_474(2, Class145.class);
      method_474(3, Class197.class);
      method_474(4, Class99.class);
      method_474(5, Class316.class);
      method_474(6, Class367.class);
      method_474(7, Class290.class);
      method_474(8, Class377.class);
      method_474(10, Class320.class);
      method_474(11, Class375.class);
      method_474(12, Class228.class);
      method_474(13, Class288.class);
      method_474(14, Class289.class);
      method_474(15, Class127.class);
      method_474(16, Class18.class);
      method_474(17, Class382.class);
      method_474(18, Class97.class);
      method_474(20, Class126.class);
      method_474(21, Class60.class);
      method_474(22, Class200.class);
      method_474(23, Class309.class);
      method_474(24, Class131.class);
      method_474(29, Class356.class);
      method_474(30, Class294.class);
      method_474(31, Class96.class);
      method_474(32, Class313.class);
      method_474(33, Class149.class);
      method_474(34, Class374.class);
      method_474(50, Class178.class);
      method_474(51, Class38.class);
      method_474(52, Class162.class);
      method_474(53, Class352.class);
      method_474(59, Class381.class);
      method_474(70, Class284.class);
      method_474(71, Class233.class);
      method_474(72, Class36.class);
      method_474(200, Class33.class);
      method_474(201, Class303.class);
      method_474(202, Class8.class);
      method_474(211, Class222.class);
      method_474(255, Class4.class);
   }
}
