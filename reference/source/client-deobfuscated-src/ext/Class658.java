package ext;

public class Class658 extends Class103 {
   public Class417 field_1857 = new Class417(this, 3, 1);
   public Class559 field_2637 = new Class559(this);
   public boolean field_2942 = true;

   @Override
   public void method_314(Interface181 var1) {
      if (var1 == this.field_2637) {
         if (!this.field_2942) {
            this.field_2942 = true;

            for (int var11 = 0; var11 != 3; var11++) {
               this.field_1857.method_1882(var11, null, false);
            }
         }
      } else {
         if (this.field_2942) {
            this.field_2942 = false;

            for (int var2 = 0; var2 != 3; var2++) {
               if (this.field_2637.field_2227[var2] != null) {
                  this.field_2942 = true;
               }
            }

            if (this.field_2942) {
               return;
            }
         }

         Class334 var10 = null;
         int var3 = 0;
         boolean var4 = true;

         for (Class334 var8 : this.field_1857.field_125) {
            if (var8 != null) {
               if (var8.field_1782 == Class390.field_801.field_2151) {
                  var3 += 9 * var8.field_2326;
               } else if (var8.field_1782 == Class50.field_2952.field_10) {
                  var3 += var8.field_2326;
               } else {
                  if (var10 != null) {
                     var4 = false;
                     break;
                  }

                  var10 = var8;
               }
            }
         }

         if (var10 == null || var3 <= 0) {
            var4 = false;
         }

         if (var4) {
            int var12 = var3 / var10.method_1798();
            int var14 = var3 % var10.method_1798();
            Class334 var15 = new Class334(var10.method_801(), var10.field_2326 + var12);
            this.field_2637.method_708(0, var15);
            if (var14 != 0) {
               if (var14 <= 64) {
                  this.field_2637.method_708(1, new Class334(Class50.field_2952, var14));
                  this.field_2637.method_708(2, null);
               } else {
                  int var16 = var14 / 9;
                  int var9 = var14 % 9;
                  this.field_2637.method_708(1, new Class334(Class390.field_801, var16));
                  this.field_2637.method_708(2, new Class334(Class50.field_2952, var9));
               }
            }
         } else {
            for (int var13 = 0; var13 != 3; var13++) {
               this.field_2637.method_708(var13, null);
            }
         }
      }
   }

   public void method_1459(Class354 var1) {
      Class267 var2 = var1.field_559;
      if (var2.field_1377 != null) {
         var1.method_1771(var2.field_1377);
      }

      for (int var3 = 0; var3 < 3; var3++) {
         Class334 var4 = this.field_1857.method_1416(var3);
         if (var4 != null) {
            var1.method_1771(var4);
         }
      }
   }
}
