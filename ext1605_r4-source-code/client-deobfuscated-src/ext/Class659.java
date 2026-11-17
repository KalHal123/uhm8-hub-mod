package ext;

import java.util.Random;

public class Class659 extends Class186 implements Interface181 {
   private Class334[] field_1104 = new Class334[3];
   private int field_2944 = 0;
   private int field_1788 = 0;
   private int field_1837 = 0;
   private boolean field_446 = false;

   @Override
   public int method_1574() {
      return this.field_1104.length;
   }

   @Override
   public Class334 method_1416(int var1) {
      return this.field_1104[var1];
   }

   @Override
   public void method_1831() {
      super.method_430();
   }

   @Override
   public Class334 method_485(int var1, int var2) {
      if (this.field_1104[var1] == null) {
         return null;
      }

      Class334 var3;
      if (this.field_1104[var1].field_2326 <= var2) {
         var3 = this.field_1104[var1];
         this.field_1104[var1] = null;
      } else {
         var3 = this.field_1104[var1].method_1502(var2);
         if (this.field_1104[var1].field_2326 == 0) {
            this.field_1104[var1] = null;
         }
      }

      return var3;
   }

   @Override
   public void method_708(int var1, Class334 var2) {
      this.field_1104[var1] = var2;
      if (var2 != null && var2.field_2326 > this.method_1387()) {
         var2.field_2326 = this.method_1387();
      }
   }

   @Override
   public String method_18() {
      if (!this.field_446) {
         Random var1 = new Random(this.field_1380.field_482);
         switch (var1.nextInt(2)) {
            case 0:
               this.field_446 = true;
               this.field_1380.method_861(this.field_2878, this.field_883, this.field_921, "random.riff", 1.0F, 1.0F);
               return "Weezer";
            case 1:
            default:
               return "Freezer";
         }
      } else {
         return "Freezer";
      }
   }

   @Override
   public int method_1387() {
      return 64;
   }

   @Override
   public void method_434(Class686 var1) {
      super.method_434(var1);
      Class378 var2 = var1.method_1609("Items");
      this.field_1104 = new Class334[this.method_1574()];

      for (int var3 = 0; var3 < var2.method_619(); var3++) {
         Class686 var4 = (Class686)var2.method_1557(var3);
         byte var5 = var4.method_1913("Slot");
         if (var5 >= 0 && var5 < this.field_1104.length) {
            this.field_1104[var5] = new Class334(var4);
         }
      }

      this.field_2944 = var1.method_1321("CoolTime");
      this.field_1837 = var1.method_1321("CookTime");
      this.field_2944 = this.method_1787(this.field_1104[1]);
   }

   @Override
   public void method_1623(Class686 var1) {
      super.method_1623(var1);
      var1.method_777("CoolTime", (short)this.field_2944);
      var1.method_777("CookTime", (short)this.field_1837);
      Class378 var2 = new Class378();

      for (int var3 = 0; var3 < this.field_1104.length; var3++) {
         if (this.field_1104[var3] != null) {
            Class686 var4 = new Class686();
            var4.method_1567("Slot", (byte)var3);
            this.field_1104[var3].method_1589(var4);
            var2.method_1885(var4);
         }
      }

      var1.method_936("Items", var2);
   }

   public int method_588(int var1) {
      return this.field_1837 * var1 / 200;
   }

   public int method_1645(int var1) {
      if (this.field_1788 == 0) {
         this.field_1788 = 200;
      }

      return this.field_2944 * var1 / this.field_1788;
   }

   public boolean method_864() {
      return this.field_2944 > 0;
   }

   @Override
   public void method_1176() {
      boolean var1 = this.field_2944 > 0;
      boolean var2 = false;
      if (this.field_2944 > 0) {
         this.field_2944--;
      }

      if (!this.field_1380.field_2994) {
         if (this.field_2944 == 0 && this.method_1743()) {
            this.field_1788 = this.field_2944 = this.method_1787(this.field_1104[1]);
            if (this.field_2944 > 0) {
               var2 = true;
               if (this.field_1104[1] != null) {
                  this.field_1104[1].field_2326--;
                  if (this.field_1104[1].field_2326 == 0) {
                     this.field_1104[1] = null;
                  }
               }
            }
         }

         if (this.method_864() && this.method_1743()) {
            this.field_1837++;
            if (this.field_1837 == 200) {
               this.field_1837 = 0;
               this.method_591();
               var2 = true;
            }
         } else {
            this.field_1837 = 0;
         }

         if (var1 != this.field_2944 > 0) {
            var2 = true;
            Class347.method_901(this.field_2944 > 0, this.field_1380, this.field_2878, this.field_883, this.field_921);
         }
      }

      if (var2) {
         this.method_430();
      }
   }

   private boolean method_1743() {
      if (this.field_1104[0] == null) {
         return false;
      }

      int var1 = this.method_1571(this.field_1104[0].method_801().field_10);
      return var1 < 0
         ? false
         : (
            this.field_1104[2] == null
               ? true
               : (
                  this.field_1104[2].field_1782 != var1
                     ? false
                     : (
                        this.field_1104[2].field_2326 < this.method_1387() && this.field_1104[2].field_2326 < this.field_1104[2].method_930()
                           ? true
                           : this.field_1104[2].field_2326 < Class755.field_2576[var1].method_1356()
                     )
               )
         );
   }

   public void method_591() {
      if (this.method_1743()) {
         int var1 = this.method_1571(this.field_1104[0].method_801().field_10);
         if (this.field_1104[2] == null) {
            this.field_1104[2] = new Class334(var1, 1);
         } else if (this.field_1104[2].field_1782 == var1) {
            this.field_1104[2].field_2326++;
         }

         this.field_1104[0].field_2326--;
         if (this.field_1104[0].field_2326 <= 0) {
            this.field_1104[0] = null;
         }
      }
   }

   private int method_1571(int var1) {
      int var2 = Class595.method_1675(var1);
      if (var2 != -1) {
         return var2;
      } else {
         return var1 == Class755.field_2688.field_10
            ? Class108.field_2441.field_2151
            : (var1 == Class108.field_1674.field_2151 ? Class390.field_1327.field_2151 : Class3.method_1430(var1));
      }
   }

   private int method_1787(Class334 var1) {
      if (var1 == null) {
         return 0;
      }

      int var2 = var1.method_801().field_10;
      return var2 < 32767 && var2 == Class50.field_2952.field_10
         ? 50
         : (var2 == Class390.field_801.field_2151 ? 450 : (var2 == Class50.field_1198.field_10 ? 55 : Class3.method_973(var2)));
   }
}
