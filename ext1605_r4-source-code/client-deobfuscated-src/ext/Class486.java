package ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Class486 {
   public List<Class422> field_2582 = new ArrayList<>();
   public List<Interface295> field_2523 = Arrays.asList(new Class456(), new Class571());
   public Class454 field_1085;
   public List<Class326> field_15;

   public Class486(Class454 var1) {
      this.field_1085 = var1;
   }

   public List<Interface295> method_364(List<Interface295> var1, Class326 var2) {
      ArrayList var3 = new ArrayList();

      for (Interface295 var5 : var1) {
         if (var5.method_80(this.field_1085, var2)) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public void method_1422(Class326 var1) {
      this.field_15 = this.field_2523.get(0).method_1188(this.field_1085, var1);
   }

   public void method_427() {
      ArrayList var1 = new ArrayList();

      for (Class326 var3 : this.field_15) {
         Interface295 var4 = this.field_2523.get(new Random().nextInt(this.field_2523.size()));
         if (var4.method_80(this.field_1085, var3)) {
            for (Class326 var7 : var4.method_1188(this.field_1085, var3)) {
               var1.add(var7);
            }
         }
      }

      this.field_15 = var1;
   }
}
