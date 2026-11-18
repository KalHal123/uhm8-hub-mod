package ext;

import java.util.Random;

public class Class248 extends Class291 {
   private int field_1356;
   private int field_2405 = 0;

   protected Class248(int var1, int var2) {
      super(var1, var2, Class160.field_173, false);
      this.field_1356 = var2;
      this.method_1936(true);
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      this.field_2405 = 0;
      this.method_1517(var1, var2, var3, var4);
      super.method_1300(var1, var2, var3, var4, var5);
   }

   public void method_21(Class454 var1, int var2, int var3, int var4, int var5) {
      if (var1.method_197(var2, var3, var4) == this.field_19) {
         int var6 = var1.method_1110(var2, var3, var4);
         if (var6 != 0 && var6 == var5 - 1) {
            this.method_1517(var1, var2, var3, var4);
         }
      }
   }

   public void method_1517(Class454 var1, int var2, int var3, int var4) {
      if (this.field_2405++ < 100) {
         int var5 = var1.method_1286(var2, var3 - 1, var4).method_1888() ? 16 : 0;
         int var6 = var1.method_1110(var2, var3, var4);
         if (var6 == 0) {
            var6 = 1;
            var1.method_518(var2, var3, var4, 1);
         }

         var5 = this.method_817(var1, var2, var3 - 1, var4, var5);
         var5 = this.method_817(var1, var2, var3, var4 - 1, var5);
         var5 = this.method_817(var1, var2, var3, var4 + 1, var5);
         var5 = this.method_817(var1, var2 - 1, var3, var4, var5);
         var5 = this.method_817(var1, var2 + 1, var3, var4, var5);
         int var7 = var5 - 1;
         if (var7 < 10) {
            var7 = 1;
         }

         if (var7 != var6) {
            var1.method_518(var2, var3, var4, var7);
            this.method_21(var1, var2, var3 - 1, var4, var6);
            this.method_21(var1, var2, var3 + 1, var4, var6);
            this.method_21(var1, var2, var3, var4 - 1, var6);
            this.method_21(var1, var2, var3, var4 + 1, var6);
            this.method_21(var1, var2 - 1, var3, var4, var6);
            this.method_21(var1, var2 + 1, var3, var4, var6);
         }
      }
   }

   private int method_817(Class454 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_197(var2, var3, var4);
      if (var6 == Class407.field_2159.field_19) {
         return 16;
      }

      if (var6 == this.field_19) {
         int var7 = var1.method_1110(var2, var3, var4);
         if (var7 != 0 && var7 > var5) {
            return var7;
         }
      }

      return var5;
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.method_1110(var2, var3, var4);
      if (var6 == 0) {
         this.field_2405 = 0;
         this.method_1517(var1, var2, var3, var4);
      } else if (var6 == 1) {
         this.method_1932(var1, var2, var3, var4);
      } else if (var5.nextInt(10) == 0) {
         this.method_1517(var1, var2, var3, var4);
      }
   }

   private void method_1932(Class454 var1, int var2, int var3, int var4) {
      this.method_1227(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
      var1.method_1481(var2, var3, var4, 0);
   }

   @Override
   public int method_806(Random var1) {
      return var1.nextInt(20) == 0 ? 1 : 0;
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return Class407.field_105.field_19;
   }

   @Override
   public boolean method_143() {
      return !this.field_183;
   }

   public void method_1407(boolean var1) {
      this.field_183 = var1;
      this.field_2119 = this.field_1356 + (var1 ? 0 : 1);
   }

   @Override
   public void method_1677(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      super.method_1677(var1, var2, var3, var4, var5);
   }
}
