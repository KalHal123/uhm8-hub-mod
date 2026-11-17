package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class Class471 {
   private static Map<Integer, Class<? extends Class471>> field_3094 = new HashMap<>();
   private static Map<Class<? extends Class471>, Integer> field_12 = new HashMap<>();
   public boolean field_2211 = false;

   static void method_1289(int var0, Class<? extends Class471> var1) {
      if (field_3094.containsKey(var0)) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      }

      if (field_12.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var1);
      }

      field_3094.put(var0, var1);
      field_12.put(var1, var0);
   }

   public static Class471 method_1147(int var0) {
      try {
         Class var1 = field_3094.get(var0);
         return var1 == null ? null : (Class471)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int method_681() throws IOException {
      return field_12.get(this.getClass());
   }

   public static Class471 method_704(DataInputStream var0) throws IOException {
      int var1 = var0.read();
      if (var1 == -1) {
         Class597.method_883("-1 packet ID received");
         return null;
      }

      Class471 var2 = method_1147(var1);
      if (var2 == null) {
         throw new IOException("Bad packet id " + var1);
      }

      var2.method_1135(var0);
      return var2;
   }

   public static void method_674(Class471 var0, DataOutputStream var1) throws IOException {
      var1.write(var0.method_681());
      var0.method_805(var1);
   }

   public abstract void method_1135(DataInputStream var1) throws IOException;

   public abstract void method_805(DataOutputStream var1) throws IOException;

   public abstract void method_1876(Class8 var1);

   public abstract int method_1597();

   static {
      method_1289(0, Class393.class);
      method_1289(1, Class519.class);
      method_1289(2, Class209.class);
      method_1289(3, Class238.class);
      method_1289(4, Class715.class);
      method_1289(5, Class244.class);
      method_1289(6, Class697.class);
      method_1289(7, Class470.class);
      method_1289(8, Class473.class);
      method_1289(10, Class288.class);
      method_1289(11, Class48.class);
      method_1289(12, Class632.class);
      method_1289(13, Class462.class);
      method_1289(14, Class380.class);
      method_1289(15, Class589.class);
      method_1289(16, Class583.class);
      method_1289(17, Class502.class);
      method_1289(18, Class266.class);
      method_1289(20, Class577.class);
      method_1289(21, Class276.class);
      method_1289(22, Class747.class);
      method_1289(23, Class661.class);
      method_1289(24, Class63.class);
      method_1289(29, Class662.class);
      method_1289(30, Class333.class);
      method_1289(31, Class237.class);
      method_1289(32, Class452.class);
      method_1289(33, Class189.class);
      method_1289(34, Class721.class);
      method_1289(50, Class617.class);
      method_1289(51, Class451.class);
      method_1289(52, Class308.class);
      method_1289(53, Class216.class);
      method_1289(59, Class152.class);
      method_1289(70, Class40.class);
      method_1289(71, Class623.class);
      method_1289(72, Class39.class);
      method_1289(200, Class397.class);
      method_1289(201, Class499.class);
      method_1289(202, Class637.class);
      method_1289(211, Class603.class);
      method_1289(255, Class300.class);
   }
}
