package ext;

import java.util.ArrayList;
import java.util.Random;

public class Class652 extends Class407 {
   private Class407 field_1396;

   protected Class652(int var1, Class407 var2) {
      super(var1, var2.field_2119, var2.field_1201);
      this.field_1396 = var2;
      this.method_10(var2.field_1549);
      this.method_100(var2.field_819 / 3.0F);
      this.method_1467(var2.field_1496);
   }

   @Override
   public boolean method_143() {
      return false;
   }

   @Override
   public boolean method_607() {
      return false;
   }

   @Override
   public int method_178() {
      return 10;
   }

   @Override
   public boolean method_1794(Interface698 var1, int var2, int var3, int var4, int var5) {
      return super.method_1794(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_1689(Class454 var1, int var2, int var3, int var4, Class630 var5, ArrayList var6) {
      int var7 = var1.method_1110(var2, var3, var4);
      if (var7 == 0) {
         this.method_1930(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         super.method_1689(var1, var2, var3, var4, var5, var6);
         this.method_1930(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.method_1689(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 1) {
         this.method_1930(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         super.method_1689(var1, var2, var3, var4, var5, var6);
         this.method_1930(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         super.method_1689(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 2) {
         this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         super.method_1689(var1, var2, var3, var4, var5, var6);
         this.method_1930(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         super.method_1689(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 3) {
         this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         super.method_1689(var1, var2, var3, var4, var5, var6);
         this.method_1930(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         super.method_1689(var1, var2, var3, var4, var5, var6);
      }

      this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      if (!var1.field_2994) {
         if (var1.method_1286(var2, var3 + 1, var4).method_1888()) {
            var1.method_1481(var2, var3, var4, this.field_1396.field_19);
         } else {
            this.method_265(var1, var2, var3, var4);
            this.method_265(var1, var2 + 1, var3 - 1, var4);
            this.method_265(var1, var2 - 1, var3 - 1, var4);
            this.method_265(var1, var2, var3 - 1, var4 - 1);
            this.method_265(var1, var2, var3 - 1, var4 + 1);
            this.method_265(var1, var2 + 1, var3 + 1, var4);
            this.method_265(var1, var2 - 1, var3 + 1, var4);
            this.method_265(var1, var2, var3 + 1, var4 - 1);
            this.method_265(var1, var2, var3 + 1, var4 + 1);
         }

         this.field_1396.method_1300(var1, var2, var3, var4, var5);
      }
   }

   private void method_265(Class454 var1, int var2, int var3, int var4) {
      if (this.method_227(var1, var2, var3, var4)) {
         byte var5 = -1;
         if (this.method_227(var1, var2 + 1, var3 + 1, var4)) {
            var5 = 0;
         }

         if (this.method_227(var1, var2 - 1, var3 + 1, var4)) {
            var5 = 1;
         }

         if (this.method_227(var1, var2, var3 + 1, var4 + 1)) {
            var5 = 2;
         }

         if (this.method_227(var1, var2, var3 + 1, var4 - 1)) {
            var5 = 3;
         }

         if (var5 < 0) {
            if (this.method_642(var1, var2 + 1, var3, var4) && !this.method_642(var1, var2 - 1, var3, var4)) {
               var5 = 0;
            }

            if (this.method_642(var1, var2 - 1, var3, var4) && !this.method_642(var1, var2 + 1, var3, var4)) {
               var5 = 1;
            }

            if (this.method_642(var1, var2, var3, var4 + 1) && !this.method_642(var1, var2, var3, var4 - 1)) {
               var5 = 2;
            }

            if (this.method_642(var1, var2, var3, var4 - 1) && !this.method_642(var1, var2, var3, var4 + 1)) {
               var5 = 3;
            }
         }

         if (var5 < 0) {
            if (this.method_227(var1, var2 - 1, var3 - 1, var4)) {
               var5 = 0;
            }

            if (this.method_227(var1, var2 + 1, var3 - 1, var4)) {
               var5 = 1;
            }

            if (this.method_227(var1, var2, var3 - 1, var4 - 1)) {
               var5 = 2;
            }

            if (this.method_227(var1, var2, var3 - 1, var4 + 1)) {
               var5 = 3;
            }
         }

         if (var5 >= 0) {
            var1.method_518(var2, var3, var4, var5);
         }
      }
   }

   private boolean method_642(Class454 var1, int var2, int var3, int var4) {
      return var1.method_1286(var2, var3, var4).method_1888();
   }

   private boolean method_227(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_197(var2, var3, var4);
      return var5 == 0 ? false : Class407.field_495[var5].method_178() == 10;
   }

   @Override
   public void method_453(Class454 var1, int var2, int var3, int var4, Random var5) {
      this.field_1396.method_453(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_1202(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      this.field_1396.method_1202(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_1000(Class454 var1, int var2, int var3, int var4, int var5) {
      this.field_1396.method_1000(var1, var2, var3, var4, var5);
   }

   @Override
   public float method_736(Interface698 var1, int var2, int var3, int var4) {
      return this.field_1396.method_736(var1, var2, var3, var4);
   }

   @Override
   public float method_1228(Class359 var1) {
      return this.field_1396.method_1228(var1);
   }

   @Override
   public int method_691() {
      return this.field_1396.method_691();
   }

   @Override
   public int method_1651(int var1, Random var2) {
      return this.field_1396.method_1651(var1, var2);
   }

   @Override
   public int method_806(Random var1) {
      return this.field_1396.method_806(var1);
   }

   @Override
   public int method_1411(int var1, int var2) {
      return this.field_1396.method_1411(var1, var2);
   }

   @Override
   public int method_519(int var1) {
      return this.field_1396.method_519(var1);
   }

   @Override
   public int method_1278(Interface698 var1, int var2, int var3, int var4, int var5) {
      return this.field_1396.method_1278(var1, var2, var3, var4, var5);
   }

   @Override
   public int method_1520() {
      return this.field_1396.method_1520();
   }

   @Override
   public Class630 method_1331(Class454 var1, int var2, int var3, int var4) {
      return this.field_1396.method_1331(var1, var2, var3, var4);
   }

   @Override
   public void method_105(Class454 var1, int var2, int var3, int var4, Class359 var5, Class214 var6) {
      this.field_1396.method_105(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_469() {
      return this.field_1396.method_469();
   }

   @Override
   public boolean method_646(int var1, boolean var2) {
      return this.field_1396.method_646(var1, var2);
   }

   @Override
   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      return this.field_1396.method_1531(var1, var2, var3, var4);
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      this.method_1300(var1, var2, var3, var4, 0);
      this.field_1396.method_1592(var1, var2, var3, var4);
   }

   @Override
   public void method_1617(Class454 var1, int var2, int var3, int var4) {
      this.field_1396.method_1617(var1, var2, var3, var4);
   }

   @Override
   public void method_997(Class454 var1, int var2, int var3, int var4, int var5, float var6) {
      this.field_1396.method_997(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_1227(Class454 var1, int var2, int var3, int var4, int var5) {
      this.field_1396.method_1227(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_1677(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      this.field_1396.method_1677(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      this.field_1396.method_732(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_676(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      return this.field_1396.method_676(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_38(Class454 var1, int var2, int var3, int var4) {
      this.field_1396.method_38(var1, var2, var3, var4);
   }
}
