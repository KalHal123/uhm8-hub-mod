package ext;

import java.util.ArrayList;
import java.util.Random;

public class Class568 extends Class108 {
   private Class108 field_2740;

   protected Class568(int var1, Class108 var2) {
      super(var1, var2.field_2972, var2.field_1854);
      this.field_2740 = var2;
      this.method_1642(var2.field_2394);
      this.method_990(var2.field_2784 / 3.0F);
      this.method_1398(var2.field_972);
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
      return 10;
   }

   @Override
   public boolean method_991(Interface698 var1, int var2, int var3, int var4, int var5) {
      return super.method_991(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_1368(Class454 var1, int var2, int var3, int var4, Class630 var5, ArrayList<Class630> var6, Class359 var7) {
      int var8 = var1.method_1110(var2, var3, var4);
      if (var8 == 0) {
         this.method_1618(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         super.method_1368(var1, var2, var3, var4, var5, var6, var7);
         this.method_1618(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.method_1368(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == 1) {
         this.method_1618(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         super.method_1368(var1, var2, var3, var4, var5, var6, var7);
         this.method_1618(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         super.method_1368(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == 2) {
         this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         super.method_1368(var1, var2, var3, var4, var5, var6, var7);
         this.method_1618(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         super.method_1368(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == 3) {
         this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         super.method_1368(var1, var2, var3, var4, var5, var6, var7);
         this.method_1618(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         super.method_1368(var1, var2, var3, var4, var5, var6, var7);
      }

      this.method_1618(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      if (!var1.field_2994) {
         if (var1.method_1286(var2, var3 + 1, var4).method_1888()) {
            var1.method_1481(var2, var3, var4, this.field_2740.field_2151);
         } else {
            this.method_193(var1, var2, var3, var4);
            this.method_193(var1, var2 + 1, var3 - 1, var4);
            this.method_193(var1, var2 - 1, var3 - 1, var4);
            this.method_193(var1, var2, var3 - 1, var4 - 1);
            this.method_193(var1, var2, var3 - 1, var4 + 1);
            this.method_193(var1, var2 + 1, var3 + 1, var4);
            this.method_193(var1, var2 - 1, var3 + 1, var4);
            this.method_193(var1, var2, var3 + 1, var4 - 1);
            this.method_193(var1, var2, var3 + 1, var4 + 1);
         }

         this.field_2740.method_1464(var1, var2, var3, var4, var5);
      }
   }

   private void method_193(Class454 var1, int var2, int var3, int var4) {
      if (this.method_834(var1, var2, var3, var4)) {
         byte var5 = -1;
         if (this.method_834(var1, var2 + 1, var3 + 1, var4)) {
            var5 = 0;
         }

         if (this.method_834(var1, var2 - 1, var3 + 1, var4)) {
            var5 = 1;
         }

         if (this.method_834(var1, var2, var3 + 1, var4 + 1)) {
            var5 = 2;
         }

         if (this.method_834(var1, var2, var3 + 1, var4 - 1)) {
            var5 = 3;
         }

         if (var5 < 0) {
            if (this.method_1815(var1, var2 + 1, var3, var4) && !this.method_1815(var1, var2 - 1, var3, var4)) {
               var5 = 0;
            }

            if (this.method_1815(var1, var2 - 1, var3, var4) && !this.method_1815(var1, var2 + 1, var3, var4)) {
               var5 = 1;
            }

            if (this.method_1815(var1, var2, var3, var4 + 1) && !this.method_1815(var1, var2, var3, var4 - 1)) {
               var5 = 2;
            }

            if (this.method_1815(var1, var2, var3, var4 - 1) && !this.method_1815(var1, var2, var3, var4 + 1)) {
               var5 = 3;
            }
         }

         if (var5 < 0) {
            if (this.method_834(var1, var2 - 1, var3 - 1, var4)) {
               var5 = 0;
            }

            if (this.method_834(var1, var2 + 1, var3 - 1, var4)) {
               var5 = 1;
            }

            if (this.method_834(var1, var2, var3 - 1, var4 - 1)) {
               var5 = 2;
            }

            if (this.method_834(var1, var2, var3 - 1, var4 + 1)) {
               var5 = 3;
            }
         }

         if (var5 >= 0) {
            var1.method_518(var2, var3, var4, var5);
         }
      }
   }

   private boolean method_1815(Class454 var1, int var2, int var3, int var4) {
      return var1.method_1286(var2, var3, var4).method_1888();
   }

   private boolean method_834(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3, var4);
      return var5 == 0 ? false : Class108.field_1221[var5].method_1900() == 10;
   }

   @Override
   public void method_1500(Class454 var1, int var2, int var3, int var4, Random var5) {
      this.field_2740.method_1500(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_424(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      this.field_2740.method_424(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_493(Class454 var1, int var2, int var3, int var4, int var5) {
      this.field_2740.method_493(var1, var2, var3, var4, var5);
   }

   @Override
   public float method_876(Interface698 var1, int var2, int var3, int var4) {
      return this.field_2740.method_876(var1, var2, var3, var4);
   }

   @Override
   public float method_1443(Class359 var1) {
      return this.field_2740.method_1443(var1);
   }

   @Override
   public int method_287() {
      return this.field_2740.method_287();
   }

   @Override
   public int method_1901(int var1, Random var2) {
      return this.field_2740.method_1901(var1, var2);
   }

   @Override
   public int method_1257(Random var1) {
      return this.field_2740.method_1257(var1);
   }

   @Override
   public int method_774(int var1, int var2) {
      return this.field_2740.method_774(var1, var2);
   }

   @Override
   public int method_1735(int var1) {
      return this.field_2740.method_1735(var1);
   }

   @Override
   public int method_213(Interface698 var1, int var2, int var3, int var4, int var5) {
      return this.field_2740.method_213(var1, var2, var3, var4, var5);
   }

   @Override
   public int method_1427() {
      return this.field_2740.method_1427();
   }

   @Override
   public Class630 method_366(Class454 var1, int var2, int var3, int var4) {
      return this.field_2740.method_366(var1, var2, var3, var4);
   }

   @Override
   public void method_1332(Class454 var1, int var2, int var3, int var4, Class359 var5, Class214 var6) {
      this.field_2740.method_1332(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_916() {
      return this.field_2740.method_916();
   }

   @Override
   public boolean method_1380(int var1, boolean var2) {
      return this.field_2740.method_1380(var1, var2);
   }

   @Override
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return this.field_2740.method_432(var1, var2, var3, var4);
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
      this.method_1464(var1, var2, var3, var4, 0);
      this.field_2740.method_1937(var1, var2, var3, var4);
   }

   @Override
   public void method_1736(Class454 var1, int var2, int var3, int var4) {
      this.field_2740.method_1736(var1, var2, var3, var4);
   }

   @Override
   public void method_944(Class454 var1, int var2, int var3, int var4, int var5, float var6) {
      this.field_2740.method_944(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_625(Class454 var1, int var2, int var3, int var4, int var5) {
      this.field_2740.method_625(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_1507(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      this.field_2740.method_1507(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      this.field_2740.method_766(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      return this.field_2740.method_835(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_298(Class454 var1, int var2, int var3, int var4) {
      this.field_2740.method_298(var1, var2, var3, var4);
   }
}
