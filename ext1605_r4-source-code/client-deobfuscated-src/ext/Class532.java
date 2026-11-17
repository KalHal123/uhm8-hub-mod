package ext;

import org.lwjgl.input.Keyboard;

public class Class532 extends Class252 implements Interface612 {
   public Class532(int var1, int var2, int var3, Class160 var4) {
      super(var1, var3, var2, var3, var4);
   }

   public int method_581(int var1) {
      return var1 == Class755.field_529.field_10
         ? Class755.field_542.field_10
         : (
            var1 == Class755.field_542.field_10
               ? Class755.field_630.field_10
               : (
                  var1 == Class755.field_630.field_10
                     ? Class755.field_2843.field_10
                     : (
                        var1 == Class755.field_1827.field_10
                           ? Class755.field_542.field_10
                           : (
                              var1 == Class755.field_2843.field_10
                                 ? Class50.field_1025.field_10
                                 : (var1 == Class50.field_41.field_10 ? Class50.field_3111.field_10 : 0)
                           )
                     )
               )
         );
   }

   public int method_875(int var1) {
      return var1 == Class755.field_529.field_10
         ? 500
         : (
            var1 == Class755.field_542.field_10
               ? 1000
               : (
                  var1 == Class755.field_630.field_10
                     ? 5000
                     : (
                        var1 == Class755.field_1827.field_10
                           ? 750
                           : (var1 == Class755.field_2843.field_10 ? 15000 : (var1 == Class50.field_41.field_10 ? 16000 : 0))
                     )
               )
         );
   }

   public boolean method_582(int var1) {
      return var1 == Class755.field_529.field_10
         || var1 == Class755.field_542.field_10
         || var1 == Class755.field_630.field_10
         || var1 == Class755.field_1827.field_10
         || var1 == Class755.field_2843.field_10
         || var1 == Class50.field_41.field_10;
   }

   @Override
   public void method_527(Class404 var1, Class326 var2) {
      Class334 var3 = var1.field_2805.method_93();
      if (var3 != null && this.method_582(var3.field_1782)) {
         int var4 = this.method_875(var3.field_1782);
         if (var1.field_2805.method_726() >= var4) {
            var1.field_2805.method_1230(-var4);
            Class334 var5 = new Class334(this.method_581(var3.field_1782));
            var1.field_2805.method_708(var1.field_2805.field_2127, var5);
            Class119.field_1519.field_813.field_2334.method_872(var1, var5.field_1782);
         } else {
            Class119.field_1519.field_964.method_967("Not enough points!");
         }
      }
   }

   @Override
   public String method_752(Class404 var1, Class326 var2) {
      String var3 = Keyboard.getKeyName(Class119.field_1519.field_1754.field_1301.field_2381);
      Class334 var4 = var1.field_2805.method_93();
      return var4 != null && this.method_582(var4.field_1782)
         ? "[" + var3 + "] Upgrade [" + this.method_875(var4.field_1782) + " points]"
         : "Cannot upgrade this.";
   }

   @Override
   public int method_1809() {
      return 10;
   }
}
