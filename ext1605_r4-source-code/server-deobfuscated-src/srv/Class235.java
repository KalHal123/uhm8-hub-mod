package srv;

public class Class235 implements Interface327 {
   public Class150[] field_1172 = new Class150[37];
   public Class150[] field_1319 = new Class150[4];
   public Class150[] field_441 = new Class150[4];
   public int field_435 = 0;
   private Class41 field_1;
   public boolean field_164 = false;

   public Class235(Class41 var1) {
      this.field_1 = var1;
   }

   public Class150 method_40() {
      return this.field_1172[this.field_435];
   }

   private int method_495(int var1) {
      for (int var2 = 0; var2 < this.field_1172.length; var2++) {
         if (this.field_1172[var2] != null
            && this.field_1172[var2].field_1298 == var1
            && this.field_1172[var2].field_1497 < this.field_1172[var2].method_68()
            && this.field_1172[var2].field_1497 < this.method_795()) {
            return var2;
         }
      }

      return -1;
   }

   private int method_696() {
      for (int var1 = 0; var1 < this.field_1172.length; var1++) {
         if (this.field_1172[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   private int method_245(int var1, int var2) {
      int var3 = this.method_495(var1);
      if (var3 < 0) {
         var3 = this.method_696();
      }

      if (var3 < 0) {
         return var2;
      }

      if (this.field_1172[var3] == null) {
         this.field_1172[var3] = new Class150(var1, 0);
      }

      int var4 = var2;
      if (var2 > this.field_1172[var3].method_68() - this.field_1172[var3].field_1497) {
         var4 = this.field_1172[var3].method_68() - this.field_1172[var3].field_1497;
      }

      if (var4 > this.method_795() - this.field_1172[var3].field_1497) {
         var4 = this.method_795() - this.field_1172[var3].field_1497;
      }

      if (var4 == 0) {
         return var2;
      }

      var2 -= var4;
      this.field_1172[var3].field_1497 += var4;
      this.field_1172[var3].field_220 = 5;
      return var2;
   }

   public void method_74() {
      for (int var1 = 0; var1 < this.field_1172.length; var1++) {
         if (this.field_1172[var1] != null && this.field_1172[var1].field_220 > 0) {
            this.field_1172[var1].field_220--;
         }
      }
   }

   public boolean method_263(Class150 var1) {
      if (var1.field_819 == 0) {
         var1.field_1497 = this.method_245(var1.field_1298, var1.field_1497);
         if (var1.field_1497 == 0) {
            return true;
         }
      }

      int var2 = this.method_696();
      if (var2 >= 0) {
         this.field_1172[var2] = var1;
         this.field_1172[var2].field_220 = 5;
         return true;
      } else {
         return false;
      }
   }

   public void method_255(int var1, Class150 var2) {
      Class150[] var3 = this.field_1172;
      if (var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.field_1319;
      }

      if (var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.field_441;
      }

      var3[var1] = var2;
   }

   public float method_653(Class371 var1) {
      float var2 = 1.0F;
      if (this.field_1172[this.field_435] != null) {
         var2 *= this.field_1172[this.field_435].method_725(var1);
      }

      return var2;
   }

   public Class310 method_657(Class310 var1) {
      for (int var2 = 0; var2 < this.field_1172.length; var2++) {
         if (this.field_1172[var2] != null) {
            Class100 var3 = new Class100();
            var3.method_1003("Slot", (byte)var2);
            this.field_1172[var2].method_110(var3);
            var1.method_162(var3);
         }
      }

      for (int var4 = 0; var4 < this.field_1319.length; var4++) {
         if (this.field_1319[var4] != null) {
            Class100 var6 = new Class100();
            var6.method_1003("Slot", (byte)(var4 + 100));
            this.field_1319[var4].method_110(var6);
            var1.method_162(var6);
         }
      }

      for (int var5 = 0; var5 < this.field_441.length; var5++) {
         if (this.field_441[var5] != null) {
            Class100 var7 = new Class100();
            var7.method_1003("Slot", (byte)(var5 + 80));
            this.field_441[var5].method_110(var7);
            var1.method_162(var7);
         }
      }

      return var1;
   }

   public void method_184(Class310 var1) {
      this.field_1172 = new Class150[36];
      this.field_1319 = new Class150[4];
      this.field_441 = new Class150[4];

      for (int var2 = 0; var2 < var1.method_622(); var2++) {
         Class100 var3 = (Class100)var1.method_542(var2);
         int var4 = var3.method_561("Slot") & 255;
         if (var4 >= 0 && var4 < this.field_1172.length) {
            this.field_1172[var4] = new Class150(var3);
         }

         if (var4 >= 80 && var4 < this.field_441.length + 80) {
            this.field_441[var4 - 80] = new Class150(var3);
         }

         if (var4 >= 100 && var4 < this.field_1319.length + 100) {
            this.field_1319[var4 - 100] = new Class150(var3);
         }
      }
   }

   @Override
   public int method_214() {
      return this.field_1172.length + 4;
   }

   @Override
   public Class150 method_908(int var1) {
      Class150[] var2 = this.field_1172;
      if (var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.field_1319;
      }

      if (var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.field_441;
      }

      return var2[var1];
   }

   public int method_795() {
      return 64;
   }

   public boolean method_24(Class371 var1) {
      if (var1.field_658 != Class111.field_1043
         && var1.field_658 != Class111.field_279
         && var1.field_658 != Class111.field_671
         && var1.field_658 != Class111.field_66) {
         return true;
      }

      Class150 var2 = this.method_908(this.field_435);
      return var2 != null ? var2.method_71(var1) : false;
   }

   public int method_413() {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;

      for (int var4 = 0; var4 < this.field_1319.length; var4++) {
         if (this.field_1319[var4] != null && this.field_1319[var4].method_458() instanceof Class20) {
            int var5 = this.field_1319[var4].method_1026();
            int var6 = this.field_1319[var4].field_819;
            int var7 = var5 - var6;
            var2 += var7;
            var3 += var5;
            int var8 = ((Class20)this.field_1319[var4].method_458()).field_97;
            var1 += var8;
         }
      }

      return var3 == 0 ? 0 : (var1 - 1) * var2 / var3 + 1;
   }

   public void method_478(int var1) {
      for (int var2 = 0; var2 < this.field_1319.length; var2++) {
         if (this.field_1319[var2] != null && this.field_1319[var2].method_458() instanceof Class20) {
            this.field_1319[var2].method_698(var1);
            if (this.field_1319[var2].field_1497 == 0) {
               this.field_1319[var2].method_537(this.field_1);
               this.field_1319[var2] = null;
            }
         }
      }
   }

   public void method_913() {
      for (int var1 = 0; var1 < this.field_1172.length; var1++) {
         if (this.field_1172[var1] != null) {
            this.field_1.method_814(this.field_1172[var1], true);
            this.field_1172[var1] = null;
         }
      }

      for (int var2 = 0; var2 < this.field_1319.length; var2++) {
         if (this.field_1319[var2] != null) {
            this.field_1.method_814(this.field_1319[var2], true);
            this.field_1319[var2] = null;
         }
      }
   }

   private int method_958(int var1) {
      for (int var2 = 0; var2 < this.field_1172.length; var2++) {
         if (this.field_1172[var2] != null && this.field_1172[var2].field_1298 == var1) {
            return var2;
         }
      }

      return -1;
   }

   public boolean method_844(int var1) {
      int var2 = this.method_958(var1);
      if (var2 < 0) {
         return false;
      }

      if (--this.field_1172[var2].field_1497 <= 0) {
         this.field_1172[var2] = null;
      }

      return true;
   }
}
