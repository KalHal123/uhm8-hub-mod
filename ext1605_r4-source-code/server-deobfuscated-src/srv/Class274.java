package srv;

public class Class274 extends Class371 {
   protected Class274(int var1, int var2) {
      super(var1, var2, Class111.field_621);
   }

   @Override
   public Class94 method_872(Class317 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public int method_225() {
      return 12;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return var1.method_604(var2 - 1, var3, var4)
         ? true
         : (
            var1.method_604(var2 + 1, var3, var4)
               ? true
               : (var1.method_604(var2, var3, var4 - 1) ? true : (var1.method_604(var2, var3, var4 + 1) ? true : var1.method_604(var2, var3 - 1, var4)))
         );
   }

   @Override
   public void method_202(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_929(var2, var3, var4);
      int var7 = var6 & 8;
      var6 &= 7;
      if (var5 == 1 && var1.method_604(var2, var3 - 1, var4)) {
         var6 = 5 + var1.field_413.nextInt(2);
      }

      if (var5 == 2 && var1.method_604(var2, var3, var4 + 1)) {
         var6 = 4;
      }

      if (var5 == 3 && var1.method_604(var2, var3, var4 - 1)) {
         var6 = 3;
      }

      if (var5 == 4 && var1.method_604(var2 + 1, var3, var4)) {
         var6 = 2;
      }

      if (var5 == 5 && var1.method_604(var2 - 1, var3, var4)) {
         var6 = 1;
      }

      var1.method_489(var2, var3, var4, var6 + var7);
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      if (var1.method_604(var2 - 1, var3, var4)) {
         var1.method_489(var2, var3, var4, 1);
      } else if (var1.method_604(var2 + 1, var3, var4)) {
         var1.method_489(var2, var3, var4, 2);
      } else if (var1.method_604(var2, var3, var4 - 1)) {
         var1.method_489(var2, var3, var4, 3);
      } else if (var1.method_604(var2, var3, var4 + 1)) {
         var1.method_489(var2, var3, var4, 4);
      } else if (var1.method_604(var2, var3 - 1, var4)) {
         var1.method_489(var2, var3, var4, 5 + var1.field_413.nextInt(2));
      }

      this.method_197(var1, var2, var3, var4);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      if (this.method_197(var1, var2, var3, var4)) {
         int var6 = var1.method_929(var2, var3, var4) & 7;
         boolean var7 = false;
         if (!var1.method_604(var2 - 1, var3, var4) && var6 == 1) {
            var7 = true;
         }

         if (!var1.method_604(var2 + 1, var3, var4) && var6 == 2) {
            var7 = true;
         }

         if (!var1.method_604(var2, var3, var4 - 1) && var6 == 3) {
            var7 = true;
         }

         if (!var1.method_604(var2, var3, var4 + 1) && var6 == 4) {
            var7 = true;
         }

         if (!var1.method_604(var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if (var7) {
            this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
            var1.method_226(var2, var3, var4, 0);
         }
      }
   }

   private boolean method_197(Class317 var1, int var2, int var3, int var4) {
      if (!this.method_769(var1, var2, var3, var4)) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method_15(Interface351 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4) & 7;
      float var6 = 0.1875F;
      if (var5 == 1) {
         this.method_177(0.0F, 0.2F, 0.5F - var6, var6 * 2.0F, 0.8F, 0.5F + var6);
      } else if (var5 == 2) {
         this.method_177(1.0F - var6 * 2.0F, 0.2F, 0.5F - var6, 1.0F, 0.8F, 0.5F + var6);
      } else if (var5 == 3) {
         this.method_177(0.5F - var6, 0.2F, 0.0F, 0.5F + var6, 0.8F, var6 * 2.0F);
      } else if (var5 == 4) {
         this.method_177(0.5F - var6, 0.2F, 1.0F - var6 * 2.0F, 0.5F + var6, 0.8F, 1.0F);
      } else {
         var6 = 0.25F;
         this.method_177(0.5F - var6, 0.0F, 0.5F - var6, 0.5F + var6, 0.6F, 0.5F + var6);
      }
   }

   @Override
   public void method_130(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      this.method_265(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_265(Class317 var1, int var2, int var3, int var4, Class41 var5) {
      int var6 = var1.method_929(var2, var3, var4);
      int var7 = var6 & 7;
      int var8 = 8 - (var6 & 8);
      var1.method_489(var2, var3, var4, var7 + var8);
      var1.method_674(var2, var3, var4, var2, var3, var4);
      var1.method_621(var2 + 0.5, var3 + 0.5, var4 + 0.5, "random.click", 0.3F, var8 > 0 ? 0.6F : 0.5F);
      var1.method_922(var2, var3, var4, this.field_1379);
      if (var7 == 1) {
         var1.method_922(var2 - 1, var3, var4, this.field_1379);
      } else if (var7 == 2) {
         var1.method_922(var2 + 1, var3, var4, this.field_1379);
      } else if (var7 == 3) {
         var1.method_922(var2, var3, var4 - 1, this.field_1379);
      } else if (var7 == 4) {
         var1.method_922(var2, var3, var4 + 1, this.field_1379);
      } else {
         var1.method_922(var2, var3 - 1, var4, this.field_1379);
      }

      return true;
   }

   @Override
   public void method_650(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      if ((var5 & 8) > 0) {
         var1.method_922(var2, var3, var4, this.field_1379);
         int var6 = var5 & 7;
         if (var6 == 1) {
            var1.method_922(var2 - 1, var3, var4, this.field_1379);
         } else if (var6 == 2) {
            var1.method_922(var2 + 1, var3, var4, this.field_1379);
         } else if (var6 == 3) {
            var1.method_922(var2, var3, var4 - 1, this.field_1379);
         } else if (var6 == 4) {
            var1.method_922(var2, var3, var4 + 1, this.field_1379);
         } else {
            var1.method_922(var2, var3 - 1, var4, this.field_1379);
         }
      }

      super.method_650(var1, var2, var3, var4);
   }

   @Override
   public boolean method_743(Interface351 var1, int var2, int var3, int var4, int var5) {
      return (var1.method_929(var2, var3, var4) & 8) > 0;
   }

   @Override
   public boolean method_391(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_929(var2, var3, var4);
      if ((var6 & 8) == 0) {
         return false;
      }

      int var7 = var6 & 7;
      return var7 == 5 && var5 == 1
         ? true
         : (var7 == 4 && var5 == 2 ? true : (var7 == 3 && var5 == 3 ? true : (var7 == 2 && var5 == 4 ? true : var7 == 1 && var5 == 5)));
   }

   @Override
   public boolean method_507() {
      return true;
   }
}
