package srv;

import java.util.Random;
import net.minecraft.server.MinecraftServer;

public class Class31 {
   public static Random field_1289 = new Random();
   public static boolean field_449 = false;
   public static String field_99 = "";
   public static Class267 field_452 = null;

   public static void method_834(Class41 var0, Class317 var1) {
   }

   public static void method_448(Class317 var0) {
      if (field_449 && (field_452 == null || field_452.field_120 || field_452.field_796 != var0)) {
         Class273.method_579("boss fight end");
         field_449 = false;
         field_452 = null;
      }
   }

   public static void method_574(Class41 var0, Class317 var1) {
   }

   public static Class267 method_944(double var0, double var2, double var4, Class317 var6) {
      Class267 var7 = new Class267(var6, (int)var6.method_498());
      var7.method_885(var0, var2, var4, field_1289.nextFloat() * 360.0F, 0.0F);
      var6.method_237(var7);
      MinecraftServer.field_667.field_1096.method_676(new Class131(var7));
      return var7;
   }

   public static void method_466(int var0, int var1, Class317 var2) {
      if (!var2.field_906 && !field_449) {
         Random var3 = new Random();
         int var4 = var0 + 32 * (var3.nextInt(3) - 1);
         int var5 = var1 + 32 * (var3.nextInt(3) - 1);
         if (var4 == var0 && var5 == var1) {
            var5 += 32;
         }

         field_99 = "Giant of " + Class156.method_729(var2.field_68, var4 / 32, var5 / 32);
         field_452 = method_944(var4, 100.0, var5, var2);
         System.out.println("spawned at " + var4 + ", " + var5 + ", health: " + field_452.field_1090);
         field_449 = true;
      }
   }

   public static void method_1001(Class267 var0) {
      field_449 = false;
      field_452 = null;
      field_99 = "";
   }
}
