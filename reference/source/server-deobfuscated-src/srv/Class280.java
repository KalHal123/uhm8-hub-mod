package srv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class280 extends Class23 {
   private boolean field_1537 = false;
   private static List field_850 = new ArrayList();

   private boolean method_10(Class317 var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         field_850.add(new Class159(var2, var3, var4, var1.field_301));
      }

      int var6 = 0;

      for (int var7 = 0; var7 < field_850.size(); var7++) {
         Class159 var8 = (Class159)field_850.get(var7);
         if (var8.field_104 == var2 && var8.field_1389 == var3 && var8.field_394 == var4) {
            if (++var6 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   protected Class280(int var1, int var2, boolean var3) {
      super(var1, var2);
      this.field_1537 = var3;
      this.method_194(true);
   }

   @Override
   public int method_796() {
      return 2;
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      if (var1.method_929(var2, var3, var4) == 0) {
         super.method_1013(var1, var2, var3, var4);
      }

      if (this.field_1537) {
         var1.method_922(var2, var3 - 1, var4, this.field_1379);
         var1.method_922(var2, var3 + 1, var4, this.field_1379);
         var1.method_922(var2 - 1, var3, var4, this.field_1379);
         var1.method_922(var2 + 1, var3, var4, this.field_1379);
         var1.method_922(var2, var3, var4 - 1, this.field_1379);
         var1.method_922(var2, var3, var4 + 1, this.field_1379);
      }
   }

   @Override
   public void method_650(Class317 var1, int var2, int var3, int var4) {
      if (this.field_1537) {
         var1.method_922(var2, var3 - 1, var4, this.field_1379);
         var1.method_922(var2, var3 + 1, var4, this.field_1379);
         var1.method_922(var2 - 1, var3, var4, this.field_1379);
         var1.method_922(var2 + 1, var3, var4, this.field_1379);
         var1.method_922(var2, var3, var4 - 1, this.field_1379);
         var1.method_922(var2, var3, var4 + 1, this.field_1379);
      }
   }

   @Override
   public boolean method_743(Interface351 var1, int var2, int var3, int var4, int var5) {
      if (!this.field_1537) {
         return false;
      }

      int var6 = var1.method_929(var2, var3, var4);
      return var6 == 5 && var5 == 1
         ? false
         : (var6 == 3 && var5 == 3 ? false : (var6 == 4 && var5 == 2 ? false : (var6 == 1 && var5 == 5 ? false : var6 != 2 || var5 != 4)));
   }

   private boolean g(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      return var5 == 5 && var1.method_594(var2, var3 - 1, var4, 0)
         ? true
         : (
            var5 == 3 && var1.method_594(var2, var3, var4 - 1, 2)
               ? true
               : (
                  var5 == 4 && var1.method_594(var2, var3, var4 + 1, 3)
                     ? true
                     : (var5 == 1 && var1.method_594(var2 - 1, var3, var4, 4) ? true : var5 == 2 && var1.method_594(var2 + 1, var3, var4, 5))
               )
         );
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = this.g(var1, var2, var3, var4);

      while (field_850.size() > 0 && var1.field_301 - ((Class159)field_850.get(0)).field_1122 > 100L) {
         field_850.remove(0);
      }

      if (this.field_1537) {
         if (var6) {
            var1.method_86(var2, var3, var4, Class371.field_37.field_1379, var1.method_929(var2, var3, var4));
            if (this.method_10(var1, var2, var3, var4, true)) {
               var1.method_621(
                  var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "random.fizz", 0.5F, 2.6F + (var1.field_413.nextFloat() - var1.field_413.nextFloat()) * 0.8F
               );

               for (int var7 = 0; var7 < 5; var7++) {
                  double var8 = var2 + var5.nextDouble() * 0.6 + 0.2;
                  double var10 = var3 + var5.nextDouble() * 0.6 + 0.2;
                  double var12 = var4 + var5.nextDouble() * 0.6 + 0.2;
                  var1.method_140("smoke", var8, var10, var12, 0.0, 0.0, 0.0);
               }
            }
         }
      } else if (!var6 && !this.method_10(var1, var2, var3, var4, false)) {
         var1.method_86(var2, var3, var4, Class371.field_332.field_1379, var1.method_929(var2, var3, var4));
      }
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      super.method_721(var1, var2, var3, var4, var5);
      var1.method_809(var2, var3, var4, this.field_1379);
   }

   @Override
   public boolean method_391(Class317 var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 ? this.method_743(var1, var2, var3, var4, var5) : false;
   }

   @Override
   public int method_852(int var1, Random var2) {
      return Class371.field_332.field_1379;
   }

   @Override
   public boolean method_507() {
      return true;
   }
}
