package ext;

import java.util.ArrayList;
import java.util.List;

public class Thread227 extends Thread {
   List<Class7> field_445 = new ArrayList<>();
   public List<Class169> field_166 = new ArrayList<>();
   public static boolean field_3066 = false;
   public static Thread227 field_1605 = null;
   public volatile boolean field_308 = false;

   public static boolean method_850(Class169 var0) {
      for (Class169 var2 : field_1605.field_166) {
         if (var2.field_679 == var0.field_679 && var2.field_448 == var0.field_448) {
            return true;
         }
      }

      return false;
   }

   public static void method_233(Class169 var0, Class405 var1) {
      if (field_3066) {
         if (field_1605 == null) {
            field_1605 = new Thread227();
         }

         if (!field_1605.isAlive()) {
            field_1605.start();
         }

         field_1605.field_308 = true;
         if (!method_850(var0)) {
            field_1605.field_166.add(var0);
         }

         field_1605.field_308 = false;
      } else {
         var0.field_709.method_744(var0.field_2656, var0.field_679, var0.field_448);
      }
   }

   @Override
   public void run() {
      while (true) {
         if (this.field_166.size() > 0) {
            while (this.field_308) {
            }

            Class169 var1 = this.field_166.get(0);

            try {
               var1.field_709.method_744(var1.field_2656, var1.field_679, var1.field_448);
            } catch (Exception var4) {
            }

            this.field_166.remove(0);
         }

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }
   }
}
