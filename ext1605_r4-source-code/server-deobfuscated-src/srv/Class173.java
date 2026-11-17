package srv;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Class173 {
   public Class252 field_574;
   public int field_774;
   public int field_1119;
   public int field_996;
   public int field_131;
   public int field_1358;
   public int field_1256;
   public int field_1480;
   public int field_856 = 0;
   private double field_865;
   private double field_154;
   private double field_56;
   private boolean field_507 = false;
   public boolean field_1144 = false;
   public Set<Class188> field_622 = new HashSet<>();

   public Class173(Class252 var1, int var2, int var3) {
      this.field_574 = var1;
      this.field_774 = var2;
      this.field_1119 = var3;
      this.field_996 = Class380.method_502(var1.field_1324 * 32.0);
      this.field_131 = Class380.method_502(var1.field_632 * 32.0);
      this.field_1358 = Class380.method_502(var1.field_1321 * 32.0);
      this.field_1256 = Class380.method_827(var1.field_909 * 256.0F / 360.0F);
      this.field_1480 = Class380.method_827(var1.field_427 * 256.0F / 360.0F);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class173 ? ((Class173)var1).field_574.field_331 == this.field_574.field_331 : false;
   }

   @Override
   public int hashCode() {
      return this.field_574.field_331;
   }

   public void method_631(List<Class41> var1) {
      this.field_1144 = false;
      if (!this.field_507 || this.field_574.method_124(this.field_865, this.field_154, this.field_56) > 16.0) {
         this.method_704(var1);
         this.field_865 = this.field_574.field_1324;
         this.field_154 = this.field_574.field_632;
         this.field_56 = this.field_574.field_1321;
         this.field_507 = true;
         this.field_1144 = true;
      }

      if (this.field_856++ % this.field_1119 == 0) {
         int var2 = Class380.method_502(this.field_574.field_1324 * 32.0);
         int var3 = Class380.method_502(this.field_574.field_632 * 32.0);
         int var4 = Class380.method_502(this.field_574.field_1321 * 32.0);
         int var5 = Class380.method_827(this.field_574.field_909 * 256.0F / 360.0F);
         int var6 = Class380.method_827(this.field_574.field_427 * 256.0F / 360.0F);
         boolean var7 = var2 != this.field_996 || var3 != this.field_131 || var4 != this.field_1358;
         boolean var8 = var5 != this.field_1256 || var6 != this.field_1480;
         int var9 = var2 - this.field_996;
         int var10 = var3 - this.field_131;
         int var11 = var4 - this.field_1358;
         Class318 var12 = null;
         if (var9 < -128 || var9 >= 128 || var10 < -128 || var10 >= 128 || var11 < -128 || var11 >= 128) {
            var12 = new Class374(this.field_574.field_331, var2, var3, var4, (byte)var5, (byte)var6);
         } else if (var7 && var8) {
            var12 = new Class149(this.field_574.field_331, (byte)var9, (byte)var10, (byte)var11, (byte)var5, (byte)var6);
         } else if (var7) {
            var12 = new Class96(this.field_574.field_331, (byte)var9, (byte)var10, (byte)var11);
         } else if (var8) {
            var12 = new Class313(this.field_574.field_331, (byte)var5, (byte)var6);
         } else {
            var12 = new Class294(this.field_574.field_331);
         }

         if (var12 != null) {
            this.method_364(var12);
         }

         this.field_996 = var2;
         this.field_131 = var3;
         this.field_1358 = var4;
         this.field_1256 = var5;
         this.field_1480 = var6;
      }
   }

   public void method_364(Class318 var1) {
      for (Class188 var3 : this.field_622) {
         var3.field_1439.method_571(var1);
      }
   }

   public void method_771() {
      this.method_364(new Class356(this.field_574.field_331));
   }

   public void method_100(Class188 var1) {
      if (var1 != this.field_574) {
         double var2 = var1.field_1324 - this.field_996 / 32;
         double var4 = var1.field_1321 - this.field_1358 / 32;
         if (var2 >= -this.field_774 && var2 <= this.field_774 && var4 >= -this.field_774 && var4 <= this.field_774) {
            if (!this.field_622.contains(var1)) {
               this.field_622.add(var1);
               Class318 var6 = this.method_894();
               if (var6 != null) {
                  var1.field_1439.method_571(var6);
               }
            }
         } else if (this.field_622.contains(var1)) {
            this.field_622.remove(var1);
            var1.field_1439.method_571(new Class356(this.field_574.field_331));
         }
      }
   }

   public void method_704(List<Class41> var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (var1.get(var2) instanceof Class188) {
            this.method_100((Class188)var1.get(var2));
         }
      }
   }

   private Class318 method_894() {
      if (this.field_574 instanceof Class39) {
         Class39 var3 = (Class39)this.field_574;
         Class60 var2 = new Class60(var3);
         var3.field_1324 = var2.field_467 / 32.0;
         var3.field_632 = var2.field_1164 / 32.0;
         var3.field_1321 = var2.field_592 / 32.0;
         var3.field_607 = var2.field_703 / 128.0;
         var3.field_780 = var2.field_569 / 128.0;
         var3.field_921 = var2.field_1593 / 128.0;
         return var2;
      }

      if (this.field_574 instanceof Class188) {
         return new Class126((Class41)this.field_574);
      }

      if (this.field_574 instanceof Class194) {
         Class194 var1 = (Class194)this.field_574;
         if (var1.field_1134 == 0) {
            return new Class309(this.field_574, 10);
         }

         if (var1.field_1134 == 1) {
            return new Class309(this.field_574, 11);
         }

         if (var1.field_1134 == 2) {
            return new Class309(this.field_574, 12);
         }
      }

      if (this.field_574 instanceof Class169) {
         return new Class309(this.field_574, 1);
      } else {
         return this.field_574 instanceof Class110 ? new Class131((Class92)this.field_574) : null;
      }
   }
}
