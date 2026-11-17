package srv;

public class Class24 extends Class66 implements Interface327 {
   private Class150[] field_425 = new Class150[3];
   private int field_998 = 0;
   private int field_957 = 0;
   private int field_60 = 0;

   @Override
   public int method_214() {
      return this.field_425.length;
   }

   @Override
   public Class150 method_908(int var1) {
      return this.field_425[var1];
   }

   @Override
   public void method_816(Class100 var1) {
      super.method_816(var1);
      Class310 var2 = var1.method_836("Items");
      this.field_425 = new Class150[this.method_214()];

      for (int var3 = 0; var3 < var2.method_622(); var3++) {
         Class100 var4 = (Class100)var2.method_542(var3);
         byte var5 = var4.method_561("Slot");
         if (var5 >= 0 && var5 < this.field_425.length) {
            this.field_425[var5] = new Class150(var4);
         }
      }

      this.field_998 = var1.method_799("BurnTime");
      this.field_60 = var1.method_799("CookTime");
      this.field_957 = this.method_304(this.field_425[1]);
   }

   @Override
   public void method_878(Class100 var1) {
      super.method_878(var1);
      var1.method_761("BurnTime", (short)this.field_998);
      var1.method_761("CookTime", (short)this.field_60);
      Class310 var2 = new Class310();

      for (int var3 = 0; var3 < this.field_425.length; var3++) {
         if (this.field_425[var3] != null) {
            Class100 var4 = new Class100();
            var4.method_1003("Slot", (byte)var3);
            this.field_425[var3].method_110(var4);
            var2.method_162(var4);
         }
      }

      var1.method_280("Items", var2);
   }

   public int method_739() {
      return 64;
   }

   public boolean method_311() {
      return this.field_998 > 0;
   }

   @Override
   public void method_855() {
      boolean var1 = this.field_998 > 0;
      boolean var2 = false;
      if (this.field_998 > 0) {
         this.field_998--;
      }

      if (!this.field_416.field_906) {
         if (this.field_998 == 0 && this.method_41()) {
            this.field_957 = this.field_998 = this.method_304(this.field_425[1]);
            if (this.field_998 > 0) {
               var2 = true;
               if (this.field_425[1] != null) {
                  this.field_425[1].field_1497--;
                  if (this.field_425[1].field_1497 == 0) {
                     this.field_425[1] = null;
                  }
               }
            }
         }

         if (this.method_311() && this.method_41()) {
            this.field_60++;
            if (this.field_60 == 200) {
               this.field_60 = 0;
               this.method_379();
               var2 = true;
            }
         } else {
            this.field_60 = 0;
         }

         if (var1 != this.field_998 > 0) {
            var2 = true;
            Class254.method_293(this.field_998 > 0, this.field_416, this.field_720, this.field_1400, this.field_454);
         }
      }

      if (var2) {
         this.method_766();
      }
   }

   private boolean method_41() {
      if (this.field_425[0] == null) {
         return false;
      }

      int var1 = this.method_95(this.field_425[0].method_458().field_473);
      return var1 < 0
         ? false
         : (
            this.field_425[2] == null
               ? true
               : (
                  this.field_425[2].field_1298 != var1
                     ? false
                     : (
                        this.field_425[2].field_1497 < this.method_739() && this.field_425[2].field_1497 < this.field_425[2].method_68()
                           ? true
                           : this.field_425[2].field_1497 < Class350.field_218[var1].method_581()
                     )
               )
         );
   }

   public void method_379() {
      if (this.method_41()) {
         int var1 = this.method_95(this.field_425[0].method_458().field_473);
         if (this.field_425[2] == null) {
            this.field_425[2] = new Class150(var1, 1);
         } else if (this.field_425[2].field_1298 == var1) {
            this.field_425[2].field_1497++;
         }

         this.field_425[0].field_1497--;
         if (this.field_425[0].field_1497 <= 0) {
            this.field_425[0] = null;
         }
      }
   }

   private int method_95(int var1) {
      return var1 == Class371.field_1069.field_1379
         ? Class350.field_849.field_473
         : (
            var1 == Class371.field_386.field_1379
               ? Class350.field_922.field_473
               : (
                  var1 == Class371.field_666.field_1379
                     ? Class350.field_1301.field_473
                     : (
                        var1 == Class371.field_378.field_1379
                           ? Class371.field_605.field_1379
                           : (
                              var1 == Class350.field_743.field_473
                                 ? Class350.field_993.field_473
                                 : (
                                    var1 == Class371.field_319.field_1379
                                       ? Class371.field_1294.field_1379
                                       : (var1 == Class350.field_302.field_473 ? Class350.field_541.field_473 : -1)
                                 )
                           )
                     )
               )
         );
   }

   private int method_304(Class150 var1) {
      if (var1 == null) {
         return 0;
      }

      int var2 = var1.method_458().field_473;
      return var2 < 256 && Class371.field_57[var2].field_658 == Class111.field_1200
         ? 300
         : (var2 == Class350.field_1186.field_473 ? 100 : (var2 == Class350.field_167.field_473 ? 1600 : (var2 == Class350.field_1538.field_473 ? 20000 : 0)));
   }
}
