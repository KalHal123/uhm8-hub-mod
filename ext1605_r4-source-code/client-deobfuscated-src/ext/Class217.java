package ext;

import org.lwjgl.input.Keyboard;

public class Class217 extends Class252 implements Interface612 {
   public Enum90 field_294;

   public Class217(int var1, int var2, int var3, Class160 var4, Enum90 var5) {
      super(var1, var3, var2, var3, var4);
      this.field_294 = var5;
   }

   @Override
   public void method_527(Class404 var1, Class326 var2) {
      if (!var1.field_2805.method_11(this.field_294)) {
         int var3 = var1.field_979.method_280(this.field_294);
         if (var1.field_2805.method_726() >= var3) {
            var1.field_2805.method_1230(-var3);
            switch (this.field_294) {
               case field_791:
                  var1.field_2805.field_2134 = true;
                  break;
               case field_1800:
                  var1.field_2805.field_3041 = true;
                  break;
               case field_2125:
                  var1.field_2805.field_1658 = true;
                  break;
               case field_396:
                  var1.field_2805.field_2806 = true;
            }
         } else {
            Class119.field_1519.field_964.method_967("Not enough points!");
         }
      }
   }

   @Override
   public String method_752(Class404 var1, Class326 var2) {
      String var3 = Keyboard.getKeyName(Class119.field_1519.field_1754.field_1301.field_2381);
      if (var1.field_2805.method_11(this.field_294)) {
         return "You already have this perk.";
      }

      switch (this.field_294) {
         case field_791:
            return "[" + var3 + "] buy Armor [" + var1.field_979.method_280(this.field_294) + " points]";
         case field_1800:
            return "[" + var3 + "] buy Dash [" + var1.field_979.method_280(this.field_294) + " points]";
         case field_2125:
            return "[" + var3 + "] buy Berzerkola [" + var1.field_979.method_280(this.field_294) + " points]";
         case field_396:
            return "[" + var3 + "] buy Revive [" + var1.field_979.method_280(this.field_294) + " points]";
         default:
            return "--";
      }
   }

   @Override
   public int method_1809() {
      switch (this.field_294) {
         case field_791:
            return 2;
         case field_1800:
            return 3;
         case field_2125:
            return 1;
         case field_396:
            return 4;
         default:
            return -1;
      }
   }
}
