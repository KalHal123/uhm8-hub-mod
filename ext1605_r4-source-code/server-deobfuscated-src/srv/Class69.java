package srv;

import java.util.ArrayList;
import java.util.Random;

public class Class69 extends Class371 {
   private Class371 field_147;

   protected Class69(int var1, Class371 var2) {
      super(var1, var2.field_1137, var2.field_658);
      this.field_147 = var2;
      this.method_747(var2.field_1585);
      this.method_742(var2.field_327 / 3.0F);
      this.method_951(var2.field_1154);
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public int method_225() {
      return 10;
   }

   @Override
   public boolean method_212(Interface351 var1, int var2, int var3, int var4, int var5) {
      return super.method_212(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_840(Class317 var1, int var2, int var3, int var4, Class94 var5, ArrayList var6) {
      int var7 = var1.method_929(var2, var3, var4);
      if (var7 == 0) {
         this.method_177(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         super.method_840(var1, var2, var3, var4, var5, var6);
         this.method_177(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.method_840(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 1) {
         this.method_177(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         super.method_840(var1, var2, var3, var4, var5, var6);
         this.method_177(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         super.method_840(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 2) {
         this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         super.method_840(var1, var2, var3, var4, var5, var6);
         this.method_177(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         super.method_840(var1, var2, var3, var4, var5, var6);
      } else if (var7 == 3) {
         this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         super.method_840(var1, var2, var3, var4, var5, var6);
         this.method_177(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         super.method_840(var1, var2, var3, var4, var5, var6);
      }

      this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      if (!var1.field_906) {
         if (var1.method_149(var2, var3 + 1, var4).method_325()) {
            var1.method_226(var2, var3, var4, this.field_147.field_1379);
         } else {
            this.method_279(var1, var2, var3, var4);
            this.method_279(var1, var2 + 1, var3 - 1, var4);
            this.method_279(var1, var2 - 1, var3 - 1, var4);
            this.method_279(var1, var2, var3 - 1, var4 - 1);
            this.method_279(var1, var2, var3 - 1, var4 + 1);
            this.method_279(var1, var2 + 1, var3 + 1, var4);
            this.method_279(var1, var2 - 1, var3 + 1, var4);
            this.method_279(var1, var2, var3 + 1, var4 - 1);
            this.method_279(var1, var2, var3 + 1, var4 + 1);
         }

         this.field_147.method_721(var1, var2, var3, var4, var5);
      }
   }

   private void method_279(Class317 var1, int var2, int var3, int var4) {
      if (this.method_522(var1, var2, var3, var4)) {
         byte var5 = -1;
         if (this.method_522(var1, var2 + 1, var3 + 1, var4)) {
            var5 = 0;
         }

         if (this.method_522(var1, var2 - 1, var3 + 1, var4)) {
            var5 = 1;
         }

         if (this.method_522(var1, var2, var3 + 1, var4 + 1)) {
            var5 = 2;
         }

         if (this.method_522(var1, var2, var3 + 1, var4 - 1)) {
            var5 = 3;
         }

         if (var5 < 0) {
            if (this.method_79(var1, var2 + 1, var3, var4) && !this.method_79(var1, var2 - 1, var3, var4)) {
               var5 = 0;
            }

            if (this.method_79(var1, var2 - 1, var3, var4) && !this.method_79(var1, var2 + 1, var3, var4)) {
               var5 = 1;
            }

            if (this.method_79(var1, var2, var3, var4 + 1) && !this.method_79(var1, var2, var3, var4 - 1)) {
               var5 = 2;
            }

            if (this.method_79(var1, var2, var3, var4 - 1) && !this.method_79(var1, var2, var3, var4 + 1)) {
               var5 = 3;
            }
         }

         if (var5 < 0) {
            if (this.method_522(var1, var2 - 1, var3 - 1, var4)) {
               var5 = 0;
            }

            if (this.method_522(var1, var2 + 1, var3 - 1, var4)) {
               var5 = 1;
            }

            if (this.method_522(var1, var2, var3 - 1, var4 - 1)) {
               var5 = 2;
            }

            if (this.method_522(var1, var2, var3 - 1, var4 + 1)) {
               var5 = 3;
            }
         }

         if (var5 >= 0) {
            var1.method_489(var2, var3, var4, var5);
         }
      }
   }

   private boolean method_79(Class317 var1, int var2, int var3, int var4) {
      return var1.method_149(var2, var3, var4).method_325();
   }

   private boolean method_522(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_813(var2, var3, var4);
      return var5 == 0 ? false : Class371.field_57[var5].method_225() == 10;
   }

   @Override
   public void method_130(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      this.field_147.method_130(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_43(Class317 var1, int var2, int var3, int var4, int var5) {
      this.field_147.method_43(var1, var2, var3, var4, var5);
   }

   @Override
   public float method_399(Class252 var1) {
      return this.field_147.method_399(var1);
   }

   @Override
   public int method_852(int var1, Random var2) {
      return this.field_147.method_852(var1, var2);
   }

   @Override
   public int method_757(Random var1) {
      return this.field_147.method_757(var1);
   }

   @Override
   public int method_310(int var1) {
      return this.field_147.method_310(var1);
   }

   @Override
   public int method_796() {
      return this.field_147.method_796();
   }

   @Override
   public void method_536(Class317 var1, int var2, int var3, int var4, Class252 var5, Class47 var6) {
      this.field_147.method_536(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_138() {
      return this.field_147.method_138();
   }

   @Override
   public boolean method_573(int var1, boolean var2) {
      return this.field_147.method_573(var1, var2);
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return this.field_147.method_769(var1, var2, var3, var4);
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      this.method_721(var1, var2, var3, var4, 0);
      this.field_147.method_1013(var1, var2, var3, var4);
   }

   @Override
   public void method_650(Class317 var1, int var2, int var3, int var4) {
      this.field_147.method_650(var1, var2, var3, var4);
   }

   @Override
   public void method_838(Class317 var1, int var2, int var3, int var4, int var5, float var6) {
      this.field_147.method_838(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_363(Class317 var1, int var2, int var3, int var4, int var5) {
      this.field_147.method_363(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_220(Class317 var1, int var2, int var3, int var4, Class252 var5) {
      this.field_147.method_220(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      this.field_147.method_373(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      return this.field_147.method_265(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_480(Class317 var1, int var2, int var3, int var4) {
      this.field_147.method_480(var1, var2, var3, var4);
   }
}
