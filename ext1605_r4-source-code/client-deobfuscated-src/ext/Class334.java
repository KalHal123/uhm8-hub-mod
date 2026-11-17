package ext;

public final class Class334 {
   public int field_2326 = 0;
   public int field_2426;
   public int field_1782;
   public int field_1862;

   public void method_277() {
      if (this.field_1782 < 0) {
         Class597.method_883("##################");
         Class597.method_883("SEND A SCREENSHOT OF THIS TO CHAT:");
         Class100.method_1745();
         System.exit(3939);
      }
   }

   public Class334(Class108 var1) {
      this(var1, 1);
   }

   public Class334(Class108 var1, int var2) {
      this(var1.field_2151, var2);
   }

   public Class334(Class755 var1) {
      this(var1, 1);
   }

   public Class334(Class755 var1, int var2) {
      this(var1.field_10, var2);
   }

   public Class334(int var1) {
      this(var1, 1);
   }

   public Class334(int var1, int var2) {
      this.field_1782 = var1;
      this.field_2326 = var2;
      this.method_277();
   }

   public Class334(int var1, int var2, int var3) {
      this.field_1782 = var1;
      this.field_2326 = var2;
      this.field_1862 = var3;
      this.method_277();
   }

   public Class334(Class686 var1) {
      this.method_1308(var1);
      this.method_277();
   }

   public Class334(Class686 var1, boolean var2) {
      this.method_771(var1, var2);
      this.method_277();
   }

   public Class334 method_1502(int var1) {
      this.field_2326 -= var1;
      return new Class334(this.field_1782, var1, this.field_1862);
   }

   public Class755 method_801() {
      return Class755.field_2576[this.field_1782];
   }

   public int method_1798() {
      return this.field_1782 > 32767 ? Class755.field_2576[this.field_1782].field_200 : Class108.field_1221[this.field_1782].field_1761;
   }

   public int method_452() {
      return this.method_801().method_1543(this);
   }

   public boolean method_731(Class354 var1, Class454 var2, int var3, int var4, int var5, int var6) {
      return this.method_801().method_99(this, var1, var2, var3, var4, var5, var6);
   }

   public float method_1448(Class108 var1) {
      return this.method_801().method_473(this, var1);
   }

   public Class334 method_706(Class454 var1, Class354 var2) {
      return this.method_801().method_1566(this, var1, var2);
   }

   public Class686 method_1589(Class686 var1) {
      var1.method_777("id", (short)this.field_1782);
      var1.method_1567("NFORMAT", (byte)57);
      var1.method_1310("Count", this.field_2326);
      var1.method_777("Damage", (short)this.field_1862);
      return var1;
   }

   public void method_1308(Class686 var1) {
      this.method_771(var1, var1.method_1838("NFORMAT"));
   }

   public void method_771(Class686 var1, boolean var2) {
      this.field_1782 = var1.method_1321("id") & '\uffff';
      if (!var2 && this.field_1782 >= 256) {
         this.field_1782 = this.field_1782 - 256 + 32767;
      }

      try {
         this.field_2326 = var1.method_1747("Count");
      } catch (ClassCastException var4) {
         this.field_2326 = var1.method_1913("Count");
      }

      this.field_1862 = var1.method_1321("Damage");
   }

   public int method_930() {
      return this.field_1782 == Class390.field_801.field_2151 ? 10000 : this.method_801().method_1356();
   }

   public int method_1365() {
      return Class755.field_2576[this.field_1782].method_1268();
   }

   public void method_1181(int var1) {
      this.field_1862 += var1;
      if (this.field_1862 > this.method_1365()) {
         this.field_2326--;
         if (this.field_2326 < 0) {
            this.field_2326 = 0;
         }

         this.field_1862 = 0;
      }
   }

   public void method_1078(Class377 var1) {
      Class755.field_2576[this.field_1782].method_1935(this, var1);
   }

   public void method_1495(int var1, int var2, int var3, int var4) {
      Class755.field_2576[this.field_1782].method_463(this, var1, var2, var3, var4);
   }

   public int method_1266(Class359 var1) {
      return Class755.field_2576[this.field_1782].method_1498(var1);
   }

   public boolean method_423(Class108 var1) {
      return Class755.field_2576[this.field_1782].method_725(var1);
   }

   public void method_32(Class354 var1) {
   }

   public void method_1184(Class377 var1) {
      Class755.field_2576[this.field_1782].method_286(this, var1);
   }

   public Class334 method_376() {
      return new Class334(this.field_1782, this.field_2326, this.field_1862);
   }
}
