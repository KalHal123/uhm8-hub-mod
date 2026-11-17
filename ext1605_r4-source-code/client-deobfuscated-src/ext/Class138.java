package ext;

import java.util.Random;

public class Class138 extends Class488 {
   int field_273 = 1;

   public Class138(int var1, int var2, int var3) {
      super(var1, var2, var3);
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
      return true;
   }

   @Override
   public void method_1220(Class454 var1, int var2, int var3, int var4, Class359 var5) {
      if (var5 instanceof Class354) {
         Class354 var6 = (Class354)var5;
         if (var6.field_2307 <= 0) {
            var6.field_2307 = 20;
            var6.method_1796(1);
         }
      }
   }

   @Override
   public boolean method_835(Class454 var1, int var2, int var3, int var4, Class354 var5) {
      Class334 var6 = var5.field_559.method_93();
      if (var6 == null) {
         return false;
      }

      if (var6.field_1782 == Class390.field_854.field_2151) {
         var1.method_1481(var2, var3, var4, 117);
         var5.field_559.method_1807(Class390.field_854.field_2151);
         var1.method_861(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "ext.infuse", 1.0F, 1.0F);
      } else if (var6.field_1782 == Class755.field_591.field_10) {
         var1.method_1481(var2, var3, var4, 118);
         var5.field_559.method_1807(Class755.field_591.field_10);
         var1.method_861(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "ext.infuse", 1.0F, 0.7F);
      } else if (var6.field_1782 == Class50.field_108.field_10) {
         var1.method_1481(var2, var3, var4, 119);
         var5.field_559.method_1807(Class50.field_108.field_10);
         var1.method_861(var2 + 0.5F, var3 + 0.5F, var4 + 0.5F, "ext.infuse", 1.0F, 0.3F);
      }

      return true;
   }

   @Override
   public void method_1500(Class454 var1, int var2, int var3, int var4, Random var5) {
   }
}
