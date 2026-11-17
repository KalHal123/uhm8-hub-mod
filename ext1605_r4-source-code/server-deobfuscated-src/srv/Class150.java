package srv;

public final class Class150 {
   public int field_1497 = 0;
   public int field_220;
   public int field_1298;
   public int field_819;

   public Class150(Class371 var1) {
      this(var1, 1);
   }

   public Class150(Class371 var1, int var2) {
      this(var1.field_1379, var2);
   }

   public Class150(Class350 var1) {
      this(var1, 1);
   }

   public Class150(Class350 var1, int var2) {
      this(var1.field_473, var2);
   }

   public Class150(int var1) {
      this(var1, 1);
   }

   public Class150(int var1, int var2) {
      this.field_1298 = var1;
      this.field_1497 = var2;
   }

   public Class150(int var1, int var2, int var3) {
      this.field_1298 = var1;
      this.field_1497 = var2;
      this.field_819 = var3;
   }

   public Class150(Class100 var1) {
      this.method_171(var1);
   }

   public Class150(Class100 var1, boolean var2) {
      this.method_444(var1, var2);
   }

   public Class150 method_142(int var1) {
      this.field_1497 -= var1;
      return new Class150(this.field_1298, var1, this.field_819);
   }

   public Class350 method_458() {
      return Class350.field_218[this.field_1298];
   }

   public int method_591() {
      return this.field_1298 > 32767 ? Class350.field_218[this.field_1298].field_843 : Class371.field_57[this.field_1298].field_230;
   }

   public int method_540() {
      return this.method_458().method_870(this);
   }

   public boolean method_481(Class41 var1, Class317 var2, int var3, int var4, int var5, int var6) {
      return this.method_458().method_96(this, var1, var2, var3, var4, var5, var6);
   }

   public float method_725(Class371 var1) {
      return this.method_458().method_195(this, var1);
   }

   public Class150 method_125(Class317 var1, Class41 var2) {
      return this.method_458().method_475(this, var1, var2);
   }

   public Class100 method_110(Class100 var1) {
      var1.method_761("id", (short)this.field_1298);
      var1.method_1003("NFORMAT", (byte)57);
      var1.method_32("Count", this.field_1497);
      var1.method_761("Damage", (short)this.field_819);
      return var1;
   }

   public void method_171(Class100 var1) {
      this.method_444(var1, var1.method_717("NFORMAT"));
   }

   public void method_444(Class100 var1, boolean var2) {
      this.field_1298 = var1.method_799("id") & '\uffff';
      if (!var2 && this.field_1298 >= 256) {
         this.field_1298 = this.field_1298 - 256 + 32767;
      }

      try {
         this.field_1497 = var1.method_159("Count");
      } catch (ClassCastException var4) {
         this.field_1497 = var1.method_561("Count");
      }

      this.field_819 = var1.method_799("Damage");
   }

   public int method_68() {
      return this.field_1298 == Class323.field_177.field_1379 ? 10000 : this.method_458().method_581();
   }

   public int method_1026() {
      return Class350.field_218[this.field_1298].method_9();
   }

   public void method_698(int var1) {
      this.field_819 += var1;
      if (this.field_819 > this.method_1026()) {
         this.field_1497--;
         if (this.field_1497 < 0) {
            this.field_1497 = 0;
         }

         this.field_819 = 0;
      }
   }

   public void method_991(Class92 var1) {
      Class350.field_218[this.field_1298].method_881(this, var1);
   }

   public void method_629(int var1, int var2, int var3, int var4) {
      Class350.field_218[this.field_1298].method_236(this, var1, var2, var3, var4);
   }

   public int method_345(Class252 var1) {
      return Class350.field_218[this.field_1298].method_57(var1);
   }

   public boolean method_71(Class371 var1) {
      return Class350.field_218[this.field_1298].method_381(var1);
   }

   public void method_537(Class41 var1) {
   }

   public void method_467(Class92 var1) {
      Class350.field_218[this.field_1298].method_122(this, var1);
   }

   public Class150 method_83() {
      return new Class150(this.field_1298, this.field_1497, this.field_819);
   }
}
