package ext;

public class Class267 implements Interface181 {
   public Class334[] field_1518 = new Class334[37];
   public Class334[] field_491 = new Class334[4];
   public Class334[] field_364 = new Class334[4];
   public int field_2127 = 0;
   private Class354 field_963;
   public Class334 field_1377;
   public boolean field_2788 = false;

   public Class267(Class354 var1) {
      this.field_963 = var1;
   }

   public Class334 method_93() {
      return this.field_1518[this.field_2127];
   }

   private int method_669(int var1) {
      for (int var2 = 0; var2 < this.field_1518.length; var2++) {
         if (this.field_1518[var2] != null && this.field_1518[var2].field_1782 == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int method_830(int var1) {
      for (int var2 = 0; var2 < this.field_1518.length; var2++) {
         if (this.field_1518[var2] != null
            && this.field_1518[var2].field_1782 == var1
            && this.field_1518[var2].field_2326 < this.field_1518[var2].method_930()
            && this.field_1518[var2].field_2326 < this.method_1387()) {
            return var2;
         }
      }

      return -1;
   }

   private int method_1306() {
      for (int var1 = 0; var1 < this.field_1518.length; var1++) {
         if (this.field_1518[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   public void method_1004(int var1, boolean var2) {
      int var3 = this.method_669(var1);
      if (var3 >= 0 && var3 < 9) {
         this.field_2127 = var3;
      }
   }

   public void method_1191(int var1) {
      if (var1 > 0) {
         var1 = 1;
      }

      if (var1 < 0) {
         var1 = -1;
      }

      this.field_2127 -= var1;

      while (this.field_2127 < 0) {
         this.field_2127 += 9;
      }

      while (this.field_2127 >= 9) {
         this.field_2127 -= 9;
      }
   }

   private int method_414(int var1, int var2) {
      int var3 = this.method_830(var1);
      if (var3 < 0) {
         var3 = this.method_1306();
      }

      if (var3 < 0) {
         return var2;
      }

      if (this.field_1518[var3] == null) {
         this.field_1518[var3] = new Class334(var1, 0);
      }

      int var4 = var2;
      if (var2 > this.field_1518[var3].method_930() - this.field_1518[var3].field_2326) {
         var4 = this.field_1518[var3].method_930() - this.field_1518[var3].field_2326;
      }

      if (var4 > this.method_1387() - this.field_1518[var3].field_2326) {
         var4 = this.method_1387() - this.field_1518[var3].field_2326;
      }

      if (var4 == 0) {
         return var2;
      }

      var2 -= var4;
      this.field_1518[var3].field_2326 += var4;
      this.field_1518[var3].field_2426 = 5;
      return var2;
   }

   public void method_1782() {
      for (int var1 = 0; var1 < this.field_1518.length; var1++) {
         if (this.field_1518[var1] != null && this.field_1518[var1].field_2426 > 0) {
            this.field_1518[var1].field_2426--;
         }
      }
   }

   public boolean method_1807(int var1) {
      int var2 = this.method_669(var1);
      if (var2 < 0) {
         return false;
      }

      if (--this.field_1518[var2].field_2326 <= 0) {
         this.field_1518[var2] = null;
      }

      return true;
   }

   public boolean method_572(Class334 var1) {
      if (var1.field_1862 == 0) {
         var1.field_2326 = this.method_414(var1.field_1782, var1.field_2326);
         if (var1.field_2326 == 0) {
            return true;
         }
      }

      int var2 = this.method_1306();
      if (var2 >= 0) {
         this.field_1518[var2] = var1;
         this.field_1518[var2].field_2426 = 5;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      Class334[] var3 = this.field_1518;
      if (var1 >= this.field_1518.length) {
         var3 = this.field_491;
         var1 -= this.field_1518.length;
      }

      if (var3[var1] != null) {
         if (var3[var1].field_2326 <= var2) {
            Class334 var5 = var3[var1];
            var3[var1] = null;
            return var5;
         }

         Class334 var4 = var3[var1].method_1502(var2);
         if (var3[var1].field_2326 == 0) {
            var3[var1] = null;
         }

         return var4;
      } else {
         return null;
      }
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      Class334[] var3 = this.field_1518;
      if (var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.field_491;
      }

      if (var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.field_364;
      }

      var3[var1] = var2;
   }

   public float method_651(Class108 var1) {
      float var2 = 1.0F;
      if (this.field_1518[this.field_2127] != null) {
         var2 *= this.field_1518[this.field_2127].method_1448(var1);
      }

      return var2;
   }

   public Class378 method_977(Class378 var1) {
      for (int var2 = 0; var2 < this.field_1518.length; var2++) {
         if (this.field_1518[var2] != null) {
            Class686 var3 = new Class686();
            var3.method_1567("Slot", (byte)var2);
            this.field_1518[var2].method_1589(var3);
            var1.method_1885(var3);
         }
      }

      for (int var4 = 0; var4 < this.field_491.length; var4++) {
         if (this.field_491[var4] != null) {
            Class686 var6 = new Class686();
            var6.method_1567("Slot", (byte)(var4 + 100));
            this.field_491[var4].method_1589(var6);
            var1.method_1885(var6);
         }
      }

      for (int var5 = 0; var5 < this.field_364.length; var5++) {
         if (this.field_364[var5] != null) {
            Class686 var7 = new Class686();
            var7.method_1567("Slot", (byte)(var5 + 80));
            this.field_364[var5].method_1589(var7);
            var1.method_1885(var7);
         }
      }

      return var1;
   }

   public void method_639(Class378 var1) {
      this.field_1518 = new Class334[36];
      this.field_491 = new Class334[4];
      this.field_364 = new Class334[4];
      boolean var2 = false;

      for (int var3 = 0; var3 < var1.method_619(); var3++) {
         Class686 var4 = (Class686)var1.method_1557(var3);
         var2 = var4.method_1838("NFORMAT");
         int var5 = var4.method_1913("Slot") & 255;
         if (var5 >= 0 && var5 < this.field_1518.length) {
            this.field_1518[var5] = new Class334(var4, var2);
         }

         if (var5 >= 80 && var5 < this.field_364.length + 80) {
            this.field_364[var5 - 80] = new Class334(var4, var2);
         }

         if (var5 >= 100 && var5 < this.field_491.length + 100) {
            this.field_491[var5 - 100] = new Class334(var4, var2);
         }
      }
   }

   @Override
   public int method_1574() {
      return this.field_1518.length + 4;
   }

   @Override
   public Class334 method_1416(int var1) {
      Class334[] var2 = this.field_1518;
      if (var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.field_491;
      }

      if (var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.field_364;
      }

      return var2[var1];
   }

   @Override
   public String method_18() {
      return "Inventory";
   }

   @Override
   public int method_1387() {
      return 10000;
   }

   public int method_90(Class359 var1) {
      Class334 var2 = this.method_1416(this.field_2127);
      return var2 != null ? var2.method_1266(var1) : 1;
   }

   public boolean method_182(Class108 var1) {
      if (var1.field_1854 != Class160.field_68
         && var1.field_1854 != Class160.field_1806
         && var1.field_1854 != Class160.field_1246
         && var1.field_1854 != Class160.field_2730) {
         return true;
      }

      Class334 var2 = this.method_1416(this.field_2127);
      return var2 != null ? var2.method_423(var1) : false;
   }

   public Class334 method_1047(int var1) {
      return this.field_491[var1];
   }

   public int method_239() {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;

      for (int var4 = 0; var4 < this.field_491.length; var4++) {
         if (this.field_491[var4] != null && this.field_491[var4].method_801() instanceof Class725) {
            int var5 = this.field_491[var4].method_1365();
            int var6 = this.field_491[var4].field_1862;
            int var7 = var5 - var6;
            var2 += var7;
            var3 += var5;
            int var8 = ((Class725)this.field_491[var4].method_801()).field_3154;
            var1 += var8;
         }
      }

      return var3 == 0 ? 0 : (var1 - 1) * var2 / var3 + 1;
   }

   public void method_1595(int var1) {
      for (int var2 = 0; var2 < this.field_491.length; var2++) {
         if (this.field_491[var2] != null && this.field_491[var2].method_801() instanceof Class725) {
            this.field_491[var2].method_1181(var1);
            if (this.field_491[var2].field_2326 == 0) {
               this.field_491[var2].method_32(this.field_963);
               this.field_491[var2] = null;
            }
         }
      }
   }

   public void method_343() {
      for (int var1 = 0; var1 < this.field_1518.length; var1++) {
         if (this.field_1518[var1] != null) {
            this.field_963.method_1307(this.field_1518[var1], true);
            this.field_1518[var1] = null;
         }
      }

      for (int var2 = 0; var2 < this.field_491.length; var2++) {
         if (this.field_491[var2] != null) {
            this.field_963.method_1307(this.field_491[var2], true);
            this.field_491[var2] = null;
         }
      }
   }

   @Override
   public void method_1831() {
      this.field_2788 = true;
   }

   public boolean method_1081(Class267 var1) {
      for (int var2 = 0; var2 < this.field_1518.length; var2++) {
         if (!this.method_1760(var1.field_1518[var2], this.field_1518[var2])) {
            return false;
         }
      }

      for (int var3 = 0; var3 < this.field_491.length; var3++) {
         if (!this.method_1760(var1.field_491[var3], this.field_491[var3])) {
            return false;
         }
      }

      for (int var4 = 0; var4 < this.field_364.length; var4++) {
         if (!this.method_1760(var1.field_364[var4], this.field_364[var4])) {
            return false;
         }
      }

      return true;
   }

   private boolean method_1760(Class334 var1, Class334 var2) {
      return var1 == null && var2 == null
         ? true
         : (
            var1 != null && var2 != null
               ? var1.field_1782 == var2.field_1782 && var1.field_2326 == var2.field_2326 && var1.field_1862 == var2.field_1862
               : false
         );
   }

   public Class267 method_1687() {
      Class267 var1 = new Class267((Class354)null);

      for (int var2 = 0; var2 < this.field_1518.length; var2++) {
         var1.field_1518[var2] = this.field_1518[var2] != null ? this.field_1518[var2].method_376() : null;
      }

      for (int var3 = 0; var3 < this.field_491.length; var3++) {
         var1.field_491[var3] = this.field_491[var3] != null ? this.field_491[var3].method_376() : null;
      }

      for (int var4 = 0; var4 < this.field_364.length; var4++) {
         var1.field_364[var4] = this.field_364[var4] != null ? this.field_364[var4].method_376() : null;
      }

      return var1;
   }

   public void method_397() {
      for (int var1 = 0; var1 < this.field_1518.length; var1++) {
         this.field_1518[var1] = null;
      }
   }
}
