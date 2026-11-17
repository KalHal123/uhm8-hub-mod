package srv;

import java.util.Random;

public class Class45 extends Class342 {
   protected Class45(int var1, int var2) {
      super(var1, var2);
      this.field_1137 = var2;
      this.method_194(true);
      float var3 = 0.5F;
      this.method_177(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
   }

   @Override
   protected boolean method_685(int var1) {
      return var1 == Class371.field_1254.field_1379;
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      super.method_373(var1, var2, var3, var4, var5);
      if (var1.method_339(var2, var3 + 1, var4) >= 9) {
         int var6 = var1.method_929(var2, var3, var4);
         if (var6 < 7) {
            float var7 = this.method_886(var1, var2, var3, var4);
            if (var5.nextInt((int)(100.0F / var7)) == 0) {
               var1.method_489(var2, var3, var4, ++var6);
            }
         }
      }
   }

   private float method_886(Class317 var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.method_813(var2, var3, var4 - 1);
      int var7 = var1.method_813(var2, var3, var4 + 1);
      int var8 = var1.method_813(var2 - 1, var3, var4);
      int var9 = var1.method_813(var2 + 1, var3, var4);
      int var10 = var1.method_813(var2 - 1, var3, var4 - 1);
      int var11 = var1.method_813(var2 + 1, var3, var4 - 1);
      int var12 = var1.method_813(var2 + 1, var3, var4 + 1);
      int var13 = var1.method_813(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.field_1379 || var9 == this.field_1379;
      boolean var15 = var6 == this.field_1379 || var7 == this.field_1379;
      boolean var16 = var10 == this.field_1379 || var11 == this.field_1379 || var12 == this.field_1379 || var13 == this.field_1379;

      for (int var17 = var2 - 1; var17 <= var2 + 1; var17++) {
         for (int var18 = var4 - 1; var18 <= var4 + 1; var18++) {
            int var19 = var1.method_813(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if (var19 == Class371.field_1254.field_1379) {
               var20 = 1.0F;
               if (var1.method_929(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if (var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if (var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   @Override
   public int method_225() {
      return 6;
   }

   @Override
   public void method_43(Class317 var1, int var2, int var3, int var4, int var5) {
      super.method_43(var1, var2, var3, var4, var5);

      for (int var6 = 0; var6 < 3; var6++) {
         if (var1.field_413.nextInt(15) <= var5) {
            float var7 = 0.7F;
            float var8 = var1.field_413.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            float var9 = var1.field_413.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            float var10 = var1.field_413.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            Class39 var11 = new Class39(var1, var2 + var8, var3 + var9, var4 + var10, new Class150(Class350.field_93));
            var11.field_1105 = 10;
            var1.method_237(var11);
         }
      }
   }

   @Override
   public int method_852(int var1, Random var2) {
      System.out.println("Get resource: " + var1);
      return var1 == 7 ? Class350.field_1080.field_473 : -1;
   }

   @Override
   public int method_757(Random var1) {
      return 1;
   }
}
