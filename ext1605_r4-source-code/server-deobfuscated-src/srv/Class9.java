package srv;

import java.util.Random;

public class Class9 extends Class371 {
   protected Class9(int var1, int var2) {
      super(var1, var2, Class111.field_621);
      this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
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
   public Class3 method_393(Class317 var1, int var2, int var3, int var4, Class47 var5, Class47 var6) {
      this.method_15(var1, var2, var3, var4);
      return super.method_393(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_15(Interface351 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      if (var5 >= 2 && var5 <= 5) {
         this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.method_177(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }
   }

   @Override
   public int method_225() {
      return 9;
   }

   @Override
   public int method_757(Random var1) {
      return 1;
   }

   @Override
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return var1.method_604(var2, var3 - 1, var4);
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
      var1.method_489(var2, var3, var4, 15);
      this.method_633(var1, var2, var3, var4);
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_929(var2, var3, var4);
      boolean var7 = false;
      if (!var1.method_604(var2, var3 - 1, var4)) {
         var7 = true;
      }

      if (var6 == 2 && !var1.method_604(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 3 && !var1.method_604(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if (var6 == 4 && !var1.method_604(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if (var6 == 5 && !var1.method_604(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if (var7) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
      } else if (var5 > 0 && Class371.field_57[var5].method_507() && Class204.method_962(new Class204(this, var1, var2, var3, var4)) == 3) {
         this.method_633(var1, var2, var3, var4);
      }
   }

   private void method_633(Class317 var1, int var2, int var3, int var4) {
      new Class204(this, var1, var2, var3, var4).method_817(var1.method_249(var2, var3, var4));
   }
}
