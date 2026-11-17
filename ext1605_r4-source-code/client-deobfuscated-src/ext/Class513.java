package ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class513 extends Class641 {
   List<Class312> field_2632 = new ArrayList<>();
   List<Class312> field_512 = new ArrayList<>();

   @Override
   public boolean method_303(Class454 var1, Random var2, int var3, int var4, int var5) {
      if (var1 instanceof Class581) {
         Class22 var6;
         switch (var2.nextInt()) {
            case 0:
               var6 = new Class193((Class581)var1, var3, var4, var5);
               break;
            case 1:
               var6 = new Class413((Class581)var1, var3, var4, var5);
               break;
            default:
               var6 = new Class426((Class581)var1, var3, var4, var5);
         }

         var6.method_1802();
      }

      return false;
   }
}
