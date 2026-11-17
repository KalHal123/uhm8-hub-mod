package srv;

import java.util.List;
import java.util.Random;

public class Class5 extends Class371 {
   private Enum196 field_822;

   protected Class5(int var1, int var2, Enum196 var3) {
      super(var1, var2, Class111.field_1043);
      this.field_822 = var3;
      this.method_194(true);
      float var4 = 0.0625F;
      this.method_177(var4, 0.0F, var4, 1.0F - var4, 0.03125F, 1.0F - var4);
   }

   @Override
   public int method_796() {
      return 20;
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
   public boolean method_769(Class317 var1, int var2, int var3, int var4) {
      return var1.method_604(var2, var3 - 1, var4);
   }

   @Override
   public void method_1013(Class317 var1, int var2, int var3, int var4) {
   }

   @Override
   public void method_721(Class317 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (!var1.method_604(var2, var3 - 1, var4)) {
         var6 = true;
      }

      if (var6) {
         this.method_363(var1, var2, var3, var4, var1.method_929(var2, var3, var4));
         var1.method_226(var2, var3, var4, 0);
      }
   }

   @Override
   public void method_373(Class317 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_929(var2, var3, var4) != 0) {
         this.method_997(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_762(Class317 var1, int var2, int var3, int var4, Class252 var5) {
      if (var1.method_929(var2, var3, var4) != 1) {
         this.method_997(var1, var2, var3, var4);
      }
   }

   private void method_997(Class317 var1, int var2, int var3, int var4) {
      boolean var5 = var1.method_929(var2, var3, var4) == 1;
      boolean var6 = false;
      float var7 = 0.125F;
      List var8 = null;
      if (this.field_822 == Enum196.field_357) {
         var8 = var1.method_362((Class252)null, Class94.method_27(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (this.field_822 == Enum196.field_1326) {
         var8 = var1.method_494(Class92.class, Class94.method_27(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (this.field_822 == Enum196.field_282) {
         var8 = var1.method_494(Class41.class, Class94.method_27(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (var8.size() > 0) {
         var6 = true;
      }

      if (var6 && !var5) {
         var1.method_489(var2, var3, var4, 1);
         var1.method_922(var2, var3, var4, this.field_1379);
         var1.method_922(var2, var3 - 1, var4, this.field_1379);
         var1.method_674(var2, var3, var4, var2, var3, var4);
         var1.method_621(var2 + 0.5, var3 + 0.1, var4 + 0.5, "random.click", 0.3F, 0.6F);
      }

      if (!var6 && var5) {
         var1.method_489(var2, var3, var4, 0);
         var1.method_922(var2, var3, var4, this.field_1379);
         var1.method_922(var2, var3 - 1, var4, this.field_1379);
         var1.method_674(var2, var3, var4, var2, var3, var4);
         var1.method_621(var2 + 0.5, var3 + 0.1, var4 + 0.5, "random.click", 0.3F, 0.5F);
      }

      if (var6) {
         var1.method_809(var2, var3, var4, this.field_1379);
      }
   }

   @Override
   public void method_650(Class317 var1, int var2, int var3, int var4) {
      int var5 = var1.method_929(var2, var3, var4);
      if (var5 > 0) {
         var1.method_922(var2, var3, var4, this.field_1379);
         var1.method_922(var2, var3 - 1, var4, this.field_1379);
      }

      super.method_650(var1, var2, var3, var4);
   }

   @Override
   public void method_15(Interface351 var1, int var2, int var3, int var4) {
      boolean var5 = var1.method_929(var2, var3, var4) == 1;
      float var6 = 0.0625F;
      if (var5) {
         this.method_177(var6, 0.0F, var6, 1.0F - var6, 0.03125F, 1.0F - var6);
      } else {
         this.method_177(var6, 0.0F, var6, 1.0F - var6, 0.0625F, 1.0F - var6);
      }
   }

   @Override
   public boolean method_743(Interface351 var1, int var2, int var3, int var4, int var5) {
      return var1.method_929(var2, var3, var4) > 0;
   }

   @Override
   public boolean method_391(Class317 var1, int var2, int var3, int var4, int var5) {
      return var1.method_929(var2, var3, var4) == 0 ? false : var5 == 1;
   }

   @Override
   public boolean method_507() {
      return true;
   }
}
