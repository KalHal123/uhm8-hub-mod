package ext;

import java.util.Random;

public class Class364 extends Class108 {
   private int[] field_2541 = new int[32767];
   private int[] field_2728 = new int[32767];

   protected Class364(int var1, int var2) {
      super(var1, var2, Class160.field_1842);
      this.method_673(Class108.field_2872.field_2151, 15, 100);
      this.method_1646(true);
   }

   private void method_673(int var1, int var2, int var3) {
      this.field_2541[var1] = var2;
      this.field_2728[var1] = var3;
   }

   @Override
   public Class630 method_720(Class454 var1, int var2, int var3, int var4) {
      return null;
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
      return 3;
   }

   @Override
   public int method_1257(Random var1) {
      return 0;
   }

   @Override
   public int method_1427() {
      return 10;
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      if (var6 < 15) {
         var1.method_518(var2, var3, var4, var6 + 1);
         var1.method_600(var2, var3, var4, this.field_2151);
      }

      if (!this.method_1088(var1, var2, var3, var4)) {
         if (!var1.method_768(var2, var3 - 1, var4) || var6 > 3) {
            var1.method_1481(var2, var3, var4, 0);
         }
      } else if (!this.method_144(var1, var2, var3 - 1, var4) && var6 == 15 && var5.nextInt(4) == 0) {
         var1.method_1481(var2, var3, var4, 0);
      } else if (var6 % 2 == 0 && var6 > 2) {
         this.method_407(var1, var2 + 1, var3, var4, 300, var5);
         this.method_407(var1, var2 - 1, var3, var4, 300, var5);
         this.method_407(var1, var2, var3 - 1, var4, 200, var5);
         this.method_407(var1, var2, var3 + 1, var4, 250, var5);
         this.method_407(var1, var2, var3, var4 - 1, 300, var5);
         this.method_407(var1, var2, var3, var4 + 1, 300, var5);

         for (int var7 = var2 - 1; var7 <= var2 + 1; var7++) {
            for (int var8 = var4 - 1; var8 <= var4 + 1; var8++) {
               for (int var9 = var3 - 1; var9 <= var3 + 4; var9++) {
                  if (var7 != var2 || var9 != var3 || var8 != var4) {
                     int var10 = 100;
                     if (var9 > var3 + 1) {
                        var10 += (var9 - (var3 + 1)) * 100;
                     }

                     int var11 = this.method_778(var1, var7, var9, var8);
                     if (var11 > 0 && var5.nextInt(var10) <= var11) {
                        var1.method_1481(var7, var9, var8, this.field_2151);
                     }
                  }
               }
            }
         }
      }
   }

   private void method_407(Class454 var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = this.field_2728[var1.method_197(var2, var3, var4)];
      if (var6.nextInt(var5) < var7) {
         boolean var8 = var1.method_197(var2, var3, var4) == Class108.field_2872.field_2151;
         if (var6.nextInt(2) == 0) {
            var1.method_1481(var2, var3, var4, this.field_2151);
         } else {
            var1.method_1481(var2, var3, var4, 0);
         }

         if (var8) {
            Class108.field_2872.method_493(var1, var2, var3, var4, 0);
         }
      }
   }

   private boolean method_1088(Class454 var1, int var2, int var3, int var4) {
      return this.method_144(var1, var2 + 1, var3, var4)
         ? true
         : (
            this.method_144(var1, var2 - 1, var3, var4)
               ? true
               : (
                  this.method_144(var1, var2, var3 - 1, var4)
                     ? true
                     : (
                        this.method_144(var1, var2, var3 + 1, var4)
                           ? true
                           : (this.method_144(var1, var2, var3, var4 - 1) ? true : this.method_144(var1, var2, var3, var4 + 1))
                     )
               )
         );
   }

   private int method_778(Class454 var1, int var2, int var3, int var4) {
      byte var5 = 0;
      if (var1.method_197(var2, var3, var4) != 0) {
         return 0;
      }

      int var6 = this.method_1208(var1, var2 + 1, var3, var4, var5);
      var6 = this.method_1208(var1, var2 - 1, var3, var4, var6);
      var6 = this.method_1208(var1, var2, var3 - 1, var4, var6);
      var6 = this.method_1208(var1, var2, var3 + 1, var4, var6);
      var6 = this.method_1208(var1, var2, var3, var4 - 1, var6);
      return this.method_1208(var1, var2, var3, var4 + 1, var6);
   }

   @Override
   public boolean method_916() {
      return false;
   }

   public boolean method_144(Interface698 var1, int var2, int var3, int var4) {
      return this.field_2541[var1.method_197(var2, var3, var4)] > 0;
   }

   public int method_1208(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = this.field_2541[var1.method_197(var2, var3, var4)];
      return var6 > var5 ? var6 : var5;
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return var1.method_768(var2, var3 - 1, var4) || this.method_1088(var1, var2, var3, var4);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      if (!var1.method_768(var2, var3 - 1, var4) && !this.method_1088(var1, var2, var3, var4)) {
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      if (!var1.method_768(var2, var3 - 1, var4) && !this.method_1088(var1, var2, var3, var4)) {
         var1.method_1481(var2, var3, var4, 0);
      } else {
         var1.method_600(var2, var3, var4, this.field_2151);
      }
   }

   @Override
   public void method_1500(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var5.nextInt(24) == 0) {
         var1.method_861(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "fire.fire", 1.0F + var5.nextFloat(), var5.nextFloat() * 0.7F + 0.3F);
      }

      if (!var1.method_768(var2, var3 - 1, var4) && !Class108.field_1781.method_144(var1, var2, var3 - 1, var4)) {
         if (Class108.field_1781.method_144(var1, var2 - 1, var3, var4)) {
            for (int var10 = 0; var10 < 2; var10++) {
               float var15 = var2 + var5.nextFloat() * 0.1F;
               float var20 = var3 + var5.nextFloat();
               float var25 = var4 + var5.nextFloat();
               var1.method_1347("largesmoke", var15, var20, var25, 0.0, 0.0, 0.0);
            }
         }

         if (Class108.field_1781.method_144(var1, var2 + 1, var3, var4)) {
            for (int var11 = 0; var11 < 2; var11++) {
               float var16 = var2 + 1 - var5.nextFloat() * 0.1F;
               float var21 = var3 + var5.nextFloat();
               float var26 = var4 + var5.nextFloat();
               var1.method_1347("largesmoke", var16, var21, var26, 0.0, 0.0, 0.0);
            }
         }

         if (Class108.field_1781.method_144(var1, var2, var3, var4 - 1)) {
            for (int var12 = 0; var12 < 2; var12++) {
               float var17 = var2 + var5.nextFloat();
               float var22 = var3 + var5.nextFloat();
               float var27 = var4 + var5.nextFloat() * 0.1F;
               var1.method_1347("largesmoke", var17, var22, var27, 0.0, 0.0, 0.0);
            }
         }

         if (Class108.field_1781.method_144(var1, var2, var3, var4 + 1)) {
            for (int var13 = 0; var13 < 2; var13++) {
               float var18 = var2 + var5.nextFloat();
               float var23 = var3 + var5.nextFloat();
               float var28 = var4 + 1 - var5.nextFloat() * 0.1F;
               var1.method_1347("largesmoke", var18, var23, var28, 0.0, 0.0, 0.0);
            }
         }

         if (Class108.field_1781.method_144(var1, var2, var3 + 1, var4)) {
            for (int var14 = 0; var14 < 2; var14++) {
               float var19 = var2 + var5.nextFloat();
               float var24 = var3 + 1 - var5.nextFloat() * 0.1F;
               float var29 = var4 + var5.nextFloat();
               var1.method_1347("largesmoke", var19, var24, var29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int var6 = 0; var6 < 3; var6++) {
            float var7 = var2 + var5.nextFloat();
            float var8 = var3 + var5.nextFloat() * 0.5F + 0.5F;
            float var9 = var4 + var5.nextFloat();
            var1.method_1347("largesmoke", var7, var8, var9, 0.0, 0.0, 0.0);
         }
      }
   }
}
