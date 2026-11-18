package srv;

import java.util.Random;

public class Class384 extends Class371 {
   public Class384(int var1, Class111 var2) {
      super(var1, var2);
      this.field_1137 = 97;
      if (var2 == Class111.field_279) {
         this.field_1137++;
      }

      float var3 = 0.5F;
      float var4 = 1.0F;
      this.method_177(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public int method_225() {
      return 7;
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      this.method_15(var1, var2, var3, var4);
      return super.method_872(var1, var2, var3, var4);
   }

   @Override
   public void method_15(Interface351 var1, int var2, int var3, int var4) {
      this.method_516(this.method_104(var1.method_929(var2, var3, var4)));
   }

   public void method_516(int var1) {
      float var2 = 0.1875F;
      this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      if (var1 == 0) {
         this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var2);
      }

      if (var1 == 1) {
         this.method_177(1.0F - var2, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if (var1 == 2) {
         this.method_177(0.0F, 0.0F, 1.0F - var2, 1.0F, 1.0F, 1.0F);
      }

      if (var1 == 3) {
         this.method_177(0.0F, 0.0F, 0.0F, var2, 1.0F, 1.0F);
      }
   }

   @Override
   public void method_130(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      this.method_265(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      if (this.field_658 == Class111.field_279) {
         return true;
      }

      int var6 = var1.method_929(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.method_813(var2, var3 - 1, var4) == this.field_1379) {
            this.method_265(var1, var2, var3 - 1, var4, var5);
         }

         return true;
      } else {
         if (var1.method_813(var2, var3 + 1, var4) == this.field_1379) {
            var1.method_489(var2, var3 + 1, var4, (var6 ^ 4) + 8);
         }

         var1.method_489(var2, var3, var4, var6 ^ 4);
         var1.method_674(var2, var3 - 1, var4, var2, var3, var4);
         if (Math.random() < 0.5) {
            var1.method_621(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_open", 1.0F, var1.field_413.nextFloat() * 0.1F + 0.9F);
         } else {
            var1.method_621(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_close", 1.0F, var1.field_413.nextFloat() * 0.1F + 0.9F);
         }

         return true;
      }
   }

   public void method_418(Class317 var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.method_929(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.method_813(var2, var3 - 1, var4) == this.field_1379) {
            this.method_418(var1, var2, var3 - 1, var4, var5);
         }
      } else {
         boolean var7 = (var1.method_929(var2, var3, var4) & 4) > 0;
         if (var7 != var5) {
            if (var1.method_813(var2, var3 + 1, var4) == this.field_1379) {
               var1.method_489(var2, var3 + 1, var4, (var6 ^ 4) + 8);
            }

            var1.method_489(var2, var3, var4, var6 ^ 4);
            var1.method_674(var2, var3 - 1, var4, var2, var3, var4);
            if (Math.random() < 0.5) {
               var1.method_621(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_open", 1.0F, var1.field_413.nextFloat() * 0.1F + 0.9F);
            } else {
               var1.method_621(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.door_close", 1.0F, var1.field_413.nextFloat() * 0.1F + 0.9F);
            }
         }
      }
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_929(var2, var3, var4);
      if ((var6 & 8) != 0) {
         if (var1.method_813(var2, var3 - 1, var4) != this.field_1379) {
            var1.method_226(var2, var3, var4, 0);
         }

         if (var5 > 0 && Class371.field_57[var5].method_507()) {
            this.method_721(var1, var2, var3 - 1, var4, var5);
         }
      } else {
         boolean var7 = false;
         if (var1.method_813(var2, var3 + 1, var4) != this.field_1379) {
            var1.method_226(var2, var3, var4, 0);
            var7 = true;
         }

         if (!var1.method_604(var2, var3 - 1, var4)) {
            var1.method_226(var2, var3, var4, 0);
            var7 = true;
            if (var1.method_813(var2, var3 + 1, var4) == this.field_1379) {
               var1.method_226(var2, var3 + 1, var4, 0);
            }
         }

         if (var7) {
            this.method_363(var1, var2, var3, var4, var6);
         } else if (var5 > 0 && Class371.field_57[var5].method_507()) {
            boolean var8 = var1.method_249(var2, var3, var4) || var1.method_249(var2, var3 + 1, var4);
            this.method_418(var1, var2, var3, var4, var8);
         }
      }
   }

   @Override
   public int method_852(int var1, Random var2) {
      return (var1 & 8) != 0 ? 0 : (this.field_658 == Class111.field_279 ? Class350.field_1286.field_473 : Class350.field_669.field_473);
   }

   @Override
   public Class3 method_393(Class317 var1, int var2, int var3, int var4, Class47 var5, Class47 var6) {
      this.method_15(var1, var2, var3, var4);
      return super.method_393(var1, var2, var3, var4, var5, var6);
   }

   public int method_104(int var1) {
      return (var1 & 4) == 0 ? var1 - 1 & 3 : var1 & 3;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return var3 >= 127
         ? false
         : var1.method_604(var2, var3 - 1, var4) && super.method_769(var1, var2, var3, var4) && super.method_769(var1, var2, var3 + 1, var4);
   }
}
