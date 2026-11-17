package srv;

import java.util.ArrayList;
import java.util.List;

public class Thread190 extends Thread {
   List<Class358> field_1232 = new ArrayList<>();
   public List<Class192> field_515 = new ArrayList<>();
   public static boolean field_316 = false;
   public static Thread190 field_778 = null;
   public volatile boolean field_1236 = false;

   public static boolean method_661(Class192 var0) {
      for (Class192 var2 : field_778.field_515) {
         if (var2.field_1599 == var0.field_1599 && var2.field_1506 == var0.field_1506) {
            return true;
         }
      }

      return false;
   }

   public static void method_331(Class192 var0, Class343 var1) {
      if (field_316) {
         if (field_778 == null) {
            field_778 = new Thread190();
         }

         if (!field_778.isAlive()) {
            field_778.start();
         }

         field_778.field_1236 = true;
         if (!method_661(var0)) {
            field_778.field_515.add(var0);
         }

         field_778.field_1236 = false;
      } else {
         var0.field_33.method_433(var0.field_1364, var0.field_1599, var0.field_1506);
      }
   }

   @Override
   public void run() {
      while (true) {
         if (this.field_515.size() > 0) {
            while (this.field_1236) {
            }

            Class192 var1 = this.field_515.get(0);

            try {
               var1.field_33.method_433(var1.field_1364, var1.field_1599, var1.field_1506);
            } catch (Exception var4) {
            }

            this.field_515.remove(0);
         }

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }
   }
}
