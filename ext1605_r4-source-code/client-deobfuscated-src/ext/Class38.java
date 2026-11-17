package ext;

public class Class38 extends Class186 implements Interface181 {
   private Class334[] field_2001 = new Class334[3];
   private int field_406 = 0;
   private int field_90 = 0;
   private int field_1938 = 0;

   @Override
   public int method_1574() {
      return this.field_2001.length;
   }

   @Override
   public Class334 method_1416(int var1) {
      return this.field_2001[var1];
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      if (this.field_2001[var1] != null) {
         if (this.field_2001[var1].field_2326 <= var2) {
            Class334 var4 = this.field_2001[var1];
            this.field_2001[var1] = null;
            return var4;
         }

         Class334 var3 = this.field_2001[var1].method_1502(var2);
         if (this.field_2001[var1].field_2326 == 0) {
            this.field_2001[var1] = null;
         }

         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      this.field_2001[var1] = var2;
      if (var2 != null && var2.field_2326 > this.method_1387()) {
         var2.field_2326 = this.method_1387();
      }
   }

   @Override
   public void method_1831() {
      super.method_430();
   }

   @Override
   public String method_18() {
      return "Chest";
   }

   @Override
   public void method_434(Class686 var1) {
      super.method_434(var1);
      Class378 var2 = var1.method_1609("Items");
      this.field_2001 = new Class334[this.method_1574()];

      for (int var3 = 0; var3 < var2.method_619(); var3++) {
         Class686 var4 = (Class686)var2.method_1557(var3);
         byte var5 = var4.method_1913("Slot");
         if (var5 >= 0 && var5 < this.field_2001.length) {
            this.field_2001[var5] = new Class334(var4);
         }
      }

      this.field_406 = var1.method_1321("BurnTime");
      this.field_1938 = var1.method_1321("CookTime");
      this.field_90 = this.method_1121(this.field_2001[1]);
   }

   @Override
   public void method_1623(Class686 var1) {
      super.method_1623(var1);
      var1.method_777("BurnTime", (short)this.field_406);
      var1.method_777("CookTime", (short)this.field_1938);
      Class378 var2 = new Class378();

      for (int var3 = 0; var3 < this.field_2001.length; var3++) {
         if (this.field_2001[var3] != null) {
            Class686 var4 = new Class686();
            var4.method_1567("Slot", (byte)var3);
            this.field_2001[var3].method_1589(var4);
            var2.method_1885(var4);
         }
      }

      var1.method_936("Items", var2);
   }

   @Override
   public int method_1387() {
      return 64;
   }

   public int method_1128(int var1) {
      return this.field_1938 * var1 / 200;
   }

   public int method_1931(int var1) {
      if (this.field_90 == 0) {
         this.field_90 = 200;
      }

      return this.field_406 * var1 / this.field_90;
   }

   public boolean method_906() {
      return this.field_406 > 0;
   }

   @Override
   public void method_1176() {
      boolean var1 = this.field_406 > 0;
      boolean var2 = false;
      if (this.field_406 > 0) {
         this.field_406--;
      }

      if (!this.field_1380.field_2994) {
         if (this.field_406 == 0 && this.method_668()) {
            this.field_90 = this.field_406 = this.method_1121(this.field_2001[1]);
            if (this.field_406 > 0) {
               var2 = true;
               if (this.field_2001[1] != null) {
                  this.field_2001[1].field_2326--;
                  if (this.field_2001[1].field_2326 == 0) {
                     this.field_2001[1] = null;
                  }
               }
            }
         }

         if (this.method_906() && this.method_668()) {
            this.field_1938++;
            if (this.field_1938 == 200) {
               this.field_1938 = 0;
               this.method_1020();
               var2 = true;
            }
         } else {
            this.field_1938 = 0;
         }

         if (var1 != this.field_406 > 0) {
            var2 = true;
            Class292.method_357(this.field_406 > 0, this.field_1380, this.field_2878, this.field_883, this.field_921);
         }
      }

      if (var2) {
         this.method_430();
      }
   }

   private boolean method_668() {
      if (this.field_2001[0] == null) {
         return false;
      }

      int var1 = this.method_1536(this.field_2001[0].method_801().field_10);
      return var1 < 0
         ? false
         : (
            this.field_2001[2] == null
               ? true
               : (
                  this.field_2001[2].field_1782 != var1
                     ? false
                     : (
                        this.field_2001[2].field_2326 < this.method_1387() && this.field_2001[2].field_2326 < this.field_2001[2].method_930()
                           ? true
                           : this.field_2001[2].field_2326 < Class755.field_2576[var1].method_1356()
                     )
               )
         );
   }

   public void method_1020() {
      if (this.method_668()) {
         int var1 = this.method_1536(this.field_2001[0].method_801().field_10);
         if (this.field_2001[2] == null) {
            this.field_2001[2] = new Class334(var1, 1);
         } else if (this.field_2001[2].field_1782 == var1) {
            this.field_2001[2].field_2326++;
         }

         this.field_2001[0].field_2326--;
         if (this.field_2001[0].field_2326 <= 0) {
            this.field_2001[0] = null;
         }
      }
   }

   private int method_1536(int var1) {
      int var2 = Class595.method_1780(var1);
      if (var2 != -1) {
         return var2;
      } else {
         return var1 == Class108.field_508.field_2151
            ? Class755.field_1743.field_10
            : (
               var1 == Class108.field_1887.field_2151
                  ? Class755.field_591.field_10
                  : (
                     var1 == Class108.field_564.field_2151
                        ? Class755.field_2465.field_10
                        : (
                           var1 == Class108.field_2692.field_2151
                              ? Class108.field_2741.field_2151
                              : (
                                 var1 == Class755.field_391.field_10
                                    ? Class755.field_1357.field_10
                                    : (
                                       var1 == Class108.field_2201.field_2151
                                          ? Class108.field_720.field_2151
                                          : (var1 == Class755.field_1295.field_10 ? Class755.field_680.field_10 : Class3.method_925(var1))
                                    )
                              )
                        )
                  )
            );
      }
   }

   private int method_1121(Class334 var1) {
      if (var1 == null) {
         return 0;
      }

      int var2 = var1.method_801().field_10;
      return var2 < 32767 && Class108.field_1221[var2].field_1854 == Class160.field_265
         ? 300
         : (
            var2 == Class755.field_2717.field_10
               ? 100
               : (
                  var2 == Class755.field_1058.field_10
                     ? 1600
                     : (
                        var2 == Class755.field_920.field_10
                           ? 20000
                           : (var2 == Class50.field_2952.field_10 ? 50 : (var2 == Class390.field_801.field_2151 ? 450 : Class3.method_601(var2)))
                     )
               )
         );
   }
}
