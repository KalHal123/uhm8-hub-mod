package ext;

import java.util.List;
import java.util.Random;

public class Class704 extends Class108 {
   private Enum631 field_1462;

   protected Class704(int var1, int var2, Enum631 var3) {
      super(var1, var2, Class160.field_68);
      this.field_1462 = var3;
      this.method_1646(true);
      float var4 = 0.0625F;
      this.method_1618(var4, 0.0F, var4, 1.0F - var4, 0.03125F, 1.0F - var4);
   }

   @Override
   public int method_1427() {
      return 20;
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
   public boolean method_432(Class454 var1, int var2, int var3, int var4) {
      return var1.method_768(var2, var3 - 1, var4);
   }

   @Override
   public void method_1937(Class454 var1, int var2, int var3, int var4) {
   }

   @Override
   public void method_1464(Class454 var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if (!var1.method_768(var2, var3 - 1, var4)) {
         var6 = true;
      }

      if (var6) {
         this.method_625(var1, var2, var3, var4, var1.method_1110(var2, var3, var4));
         var1.method_1481(var2, var3, var4, 0);
      }
   }

   @Override
   public void method_766(Class454 var1, int var2, int var3, int var4, Random var5) {
      if (var1.method_1110(var2, var3, var4) != 0) {
         this.method_510(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_1220(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      if (var1.method_1110(var2, var3, var4) != 1) {
         this.method_510(var1, var2, var3, var4);
      }
   }

   private void method_510(Class454 var1, int var2, int var3, int var4) {
      boolean var5 = var1.method_1110(var2, var3, var4) == 1;
      boolean var6 = false;
      float var7 = 0.125F;
      List var8 = null;
      if (this.field_1462 == Enum631.field_1845) {
         var8 = var1.method_1349((Class359)null, Class630.method_969(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (this.field_1462 == Enum631.field_1179) {
         var8 = var1.method_288(Class377.class, Class630.method_969(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (this.field_1462 == Enum631.field_1563) {
         var8 = var1.method_288(Class354.class, Class630.method_969(var2 + var7, var3, var4 + var7, var2 + 1 - var7, var3 + 0.25, var4 + 1 - var7));
      }

      if (var8.size() > 0) {
         var6 = true;
      }

      if (var6 && !var5) {
         var1.method_518(var2, var3, var4, 1);
         var1.method_558(var2, var3, var4, this.field_2151);
         var1.method_558(var2, var3 - 1, var4, this.field_2151);
         var1.method_1678(var2, var3, var4, var2, var3, var4);
         var1.method_861(var2 + 0.5, var3 + 0.1, var4 + 0.5, "random.click", 0.3F, 0.6F);
      }

      if (!var6 && var5) {
         var1.method_518(var2, var3, var4, 0);
         var1.method_558(var2, var3, var4, this.field_2151);
         var1.method_558(var2, var3 - 1, var4, this.field_2151);
         var1.method_1678(var2, var3, var4, var2, var3, var4);
         var1.method_861(var2 + 0.5, var3 + 0.1, var4 + 0.5, "random.click", 0.3F, 0.5F);
      }

      if (var6) {
         var1.method_600(var2, var3, var4, this.field_2151);
      }
   }

   @Override
   public void method_1736(Class454 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      if (var5 > 0) {
         var1.method_558(var2, var3, var4, this.field_2151);
         var1.method_558(var2, var3 - 1, var4, this.field_2151);
      }

      super.method_1736(var1, var2, var3, var4);
   }

   @Override
   public void method_1433(Interface698 var1, int var2, int var3, int var4) {
      boolean var5 = var1.method_1110(var2, var3, var4) == 1;
      float var6 = 0.0625F;
      if (var5) {
         this.method_1618(var6, 0.0F, var6, 1.0F - var6, 0.03125F, 1.0F - var6);
      } else {
         this.method_1618(var6, 0.0F, var6, 1.0F - var6, 0.0625F, 1.0F - var6);
      }
   }

   @Override
   public boolean method_16(Interface698 var1, int var2, int var3, int var4, int var5) {
      return var1.method_1110(var2, var3, var4) > 0;
   }

   @Override
   public boolean method_926(Class454 var1, int var2, int var3, int var4, int var5) {
      return var1.method_1110(var2, var3, var4) == 0 ? false : var5 == 1;
   }

   @Override
   public boolean method_40() {
      return true;
   }

   @Override
   public void method_1035() {
      float var1 = 0.5F;
      float var2 = 0.125F;
      float var3 = 0.5F;
      this.method_1618(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }
}
