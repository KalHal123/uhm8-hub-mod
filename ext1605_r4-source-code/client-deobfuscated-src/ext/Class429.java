package ext;

import java.util.ArrayDeque;
import java.util.Queue;

public class Class429 {
   public boolean field_2638 = false;
   public Queue<Class360> field_2435 = new ArrayDeque<>();

   public static int method_1730(Class273 var0, String var1) {
      return var1.split("\n").length;
   }

   public static int method_237(Class273 var0, String var1, int var2) {
      int var3 = var2;
      String[] var4 = var1.split("\n");

      for (String var8 : var4) {
         while (var8.startsWith(" ")) {
            var8 = var8.substring(1);
         }

         int var9 = var0.field_2506.field_1541.method_962(var8);
         if (var9 > var3) {
            var3 = var9;
         }
      }

      return var3;
   }

   public void method_1305(String var1, int var2) {
      this.method_1155(var1, var2, -1);
   }

   public void method_1155(String var1, int var2, int var3) {
      this.field_2435.add(new Class360(var1, var2, var3));
   }

   public void method_491() {
      if (!this.field_2435.isEmpty()) {
         Class360 var1 = this.field_2435.peek();
         if (var1.field_1734 == -1L) {
            var1.field_1734 = System.currentTimeMillis();
         } else if (System.currentTimeMillis() > var1.field_1734 + var1.field_1171) {
            this.field_2435.poll();
         }
      }
   }

   public void method_1198(Class273 var1, int var2, int var3) {
      this.method_491();
      if (!this.field_2435.isEmpty()) {
         Class360 var4 = this.field_2435.peek();
         byte var5 = 20;
         byte var6 = 30;
         int var7 = 20;
         var7 += method_1730(var1, var4.field_1081) * 10;
         int var8 = var5 + method_237(var1, var4.field_1081, var5 - var2 / 2) + 20;
         Class254.method_421(var5, var6, var8, var6 + var7, -1610612736, 1879048192);
         String[] var9 = var4.field_1081.split("\n");
         int var10 = 0;

         for (String var14 : var9) {
            while (var14.startsWith(" ")) {
               var14 = var14.substring(1);
            }

            Class254.method_773(var1.field_2506.field_1541, var14, var5 + 10, var6 + 10 + 10 * var10, 16777215);
            var10++;
         }
      }
   }
}
