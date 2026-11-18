package ext;

import java.util.List;
import java.util.Random;

public class Class86 extends Class407 {
   private Enum631 field_2260;

   protected Class86(int var1, int var2, Enum631 var3) {
      super(var1, var2, Class160.field_68);
      this.field_2260 = var3;
      this.method_1936(true);
      float var4 = 0.0625F;
      this.method_1930(var4, 0.0F, var4, 1.0F - var4, 0.03125F, 1.0F - var4);
   }

   @Override
   public int method_1520() {
      return 20;
   }

   @Override
   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      return null;
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
   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      return var1.method_768(var2, var3 - 1, var4);
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (!var1.method_768(var2, var3 - 1, var4)) {
         var6 = true;
      }

      if (var6) {
         this.method_1227(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public void method_732(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_1110(var2, var3, var4) != 0) {
         this.method_219(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_667(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      if (var1.method_1110(var2, var3, var4) != 1) {
         this.method_219(var1, var2, var3, var4);
      }
   }

   private void method_219(Class454 var1, int var2, int var3, int var4) {
      boolean var5 = var1.method_1110(var2, var3, var4) == 1;
      boolean var6 = false;
      float var7 = 0.125F;
      List var8 = null;
      if (this.field_2260 == Enum631.field_1845) {
         var8 = var1.method_1349(null, Class630.method_969(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (this.field_2260 == Enum631.field_1179) {
         var8 = var1.method_288(Class377.class, Class630.method_969(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (this.field_2260 == Enum631.field_1563) {
         var8 = var1.method_288(Class354.class, Class630.method_969(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (var8.size() > 0) {
         var6 = true;
      }

      if (var6 && !var5) {
         var1.method_518(var2, var3, var4, 1);
         var1.method_558(var2, var3, var4, this.field_19);
         var1.method_558(var2, var3 - 1, var4, this.field_19);
         var1.method_1678(var2, var3, var4, var2, var3, var4);
         var1.method_861(var2 + 0.5, var3 + 0.1, var4 + 0.5, "random.click", 0.3F, 0.6F);
      }

      if (!var6 && var5) {
         var1.method_518(var2, var3, var4, 0);
         var1.method_558(var2, var3, var4, this.field_19);
         var1.method_558(var2, var3 - 1, var4, this.field_19);
         var1.method_1678(var2, var3, var4, var2, var3, var4);
         var1.method_861(var2 + 0.5, var3 + 0.1, var4 + 0.5, "random.click", 0.3F, 0.5F);
      }

      if (var6) {
         var1.method_600(var2, var3, var4, this.field_19);
      }
   }

   @Override
   public void method_1617(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      if (var5 > 0) {
         var1.method_558(var2, var3, var4, this.field_19);
         var1.method_558(var2, var3 - 1, var4, this.field_19);
      }

      super.method_1617(var1, var2, var3, var4);
   }

   @Override
   public void method_547(Interface698 var1, int var2, int var3, int var4) {
      boolean var5 = var1.method_1110(var2, var3, var4) == 1;
      float var6 = 0.0625F;
      if (var5) {
         this.method_1930(var6, 0.0F, var6, 1.0F - var6, 0.03125F, 1.0F - var6);
      } else {
         this.method_1930(var6, 0.0F, var6, 1.0F - var6, 0.0625F, 1.0F - var6);
      }
   }

   @Override
   public boolean method_866(Interface698 var1, int var2, int var3, int var4, int var5) {
      return var1.method_1110(var2, var3, var4) > 0;
   }

   @Override
   public boolean method_1031(Class454 var1, int var2, int var3, int var4, int var5) {
      return var1.method_1110(var2, var3, var4) == 0 ? false : var5 == 1;
   }

   @Override
   public boolean method_3() {
      return true;
   }

   @Override
   public void method_1695() {
      float var1 = 0.5F;
      float var2 = 0.125F;
      float var3 = 0.5F;
      this.method_1930(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }
}
