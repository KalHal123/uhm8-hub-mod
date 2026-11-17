package ext;

import java.util.Random;

public class Class618 extends Class19 {
   public Class618(int var1, Class160 var2) {
      super(var1, var2);
      this.field_2972 = 1;
      this.method_1646(true);
      this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
   }

   @Override
   protected Class186 method_1267() {
      return new Class476();
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public boolean method_636() {
      return false;
   }

   @Override
   public int method_1900() {
      return 14;
   }

   @Override
   public boolean method_991(Interface698 var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      Class476 var6 = (Class476)var1.method_1303(var2, var3, var4);
      if (var6.method_1416(0).field_2326 != 0) {
         if (++var6.field_3117 >= 2 && var5.nextInt(3) == 0) {
            if (var6.method_1416(0).field_2326 == 64) {
               var1.method_1678(var2, var3, var4, var2, var3, var4);
            }

            var6.method_485(0, 1);
            var6.field_3117 = 0;
            if (var6.method_1416(0).field_2326 == 0) {
               for (int var7 = 0; var7 < 12; var7++) {
                  var1.method_1347("smoke", var2 + var5.nextDouble(), var3 + 0.4, var4 + var5.nextDouble(), 0.0, 0.1, 0.0);
                  var1.method_1678(var2, var3, var4, var2, var3, var4);
               }
            }
         }
      }
   }

   @Override
   public void method_1500(Class454 var1, int var2, int var3, int var4, Random var5) {
      Class476 var6 = (Class476)var1.method_1303(var2, var3, var4);
      if (var6.method_1416(0).field_2326 != 0) {
         if (var5.nextInt(2) == 0) {
            var1.method_1347("snowballpoof", var2 + var5.nextDouble(), var3 + 0.4, var4 + var5.nextDouble(), 0.0, 0.0, 0.0);
         }

         if (var5.nextInt(3) == 0) {
            for (int var7 = var3 + 1; var7 < Math.min(128, var6.method_1416(0).field_2326 + var3) && var1.method_197(var2, var7, var4) == 0; var7++) {
               if (var5.nextInt(6) == 0) {
                  var1.method_1347("splash", var2 + var5.nextDouble(), var7 + var5.nextDouble(), var4 + var5.nextDouble(), 0.0, 0.0, 0.0);
               }
            }
         }
      }
   }
}
