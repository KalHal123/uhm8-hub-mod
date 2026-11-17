package srv;

import java.io.IOException;

public class Class106 implements Interface103 {
   private Class166 field_1499;
   private Interface103 field_390;
   private Interface264 field_397;
   private Class166[] field_1112 = new Class166[1024];
   private Class317 field_821;
   int field_668 = -999999999;
   int field_1329 = -999999999;
   private Class166 field_635;

   public Class106(Class317 var1, Interface264 var2, Interface103 var3) {
      this.field_1499 = new Class166(var1, new byte[32768], 0, 0);
      this.field_1499.field_1123 = true;
      this.field_1499.field_1145 = true;
      this.field_821 = var1;
      this.field_397 = var2;
      this.field_390 = var3;
   }

   @Override
   public boolean method_161(int var1, int var2) {
      if (var1 == this.field_668 && var2 == this.field_1329 && this.field_635 != null) {
         return true;
      }

      int var3 = var1 & 31;
      int var4 = var2 & 31;
      int var5 = var3 + var4 * 32;
      return this.field_1112[var5] != null && (this.field_1112[var5] == this.field_1499 || this.field_1112[var5].method_103(var1, var2));
   }

   @Override
   public Class166 method_986(int var1, int var2) {
      if (var1 == this.field_668 && var2 == this.field_1329 && this.field_635 != null) {
         return this.field_635;
      }

      int var3 = var1 & 31;
      int var4 = var2 & 31;
      int var5 = var3 + var4 * 32;
      if (!this.method_161(var1, var2)) {
         if (this.field_1112[var5] != null) {
            this.field_1112[var5].method_515();
            this.method_350(this.field_1112[var5]);
            this.method_387(this.field_1112[var5]);
         }

         Class166 var6 = this.method_199(var1, var2);
         if (var6 == null) {
            if (this.field_390 == null) {
               var6 = this.field_1499;
            } else {
               var6 = this.field_390.method_986(var1, var2);
            }
         }

         this.field_1112[var5] = var6;
         if (this.field_1112[var5] != null) {
            this.field_1112[var5].method_46();
         }

         if (!this.field_1112[var5].field_559 && this.method_161(var1 + 1, var2 + 1) && this.method_161(var1, var2 + 1) && this.method_161(var1 + 1, var2)) {
            this.method_321(this, var1, var2);
         }

         if (this.method_161(var1 - 1, var2)
            && !this.method_986(var1 - 1, var2).field_559
            && this.method_161(var1 - 1, var2 + 1)
            && this.method_161(var1, var2 + 1)
            && this.method_161(var1 - 1, var2)) {
            this.method_321(this, var1 - 1, var2);
         }

         if (this.method_161(var1, var2 - 1)
            && !this.method_986(var1, var2 - 1).field_559
            && this.method_161(var1 + 1, var2 - 1)
            && this.method_161(var1, var2 - 1)
            && this.method_161(var1 + 1, var2)) {
            this.method_321(this, var1, var2 - 1);
         }

         if (this.method_161(var1 - 1, var2 - 1)
            && !this.method_986(var1 - 1, var2 - 1).field_559
            && this.method_161(var1 - 1, var2 - 1)
            && this.method_161(var1, var2 - 1)
            && this.method_161(var1 - 1, var2)) {
            this.method_321(this, var1 - 1, var2 - 1);
         }
      }

      this.field_668 = var1;
      this.field_1329 = var2;
      this.field_635 = this.field_1112[var5];
      return this.field_1112[var5];
   }

   private Class166 method_199(int var1, int var2) {
      if (this.field_397 == null) {
         return null;
      }

      try {
         Class166 var3 = this.field_397.method_978(this.field_821, var1, var2);
         if (var3 != null) {
            var3.field_27 = this.field_821.field_301;
         }

         return var3;
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private void method_387(Class166 var1) {
      if (this.field_397 != null) {
         try {
            this.field_397.method_737(this.field_821, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }
   }

   private void method_350(Class166 var1) {
      if (this.field_397 != null) {
         try {
            var1.field_27 = this.field_821.field_301;
            this.field_397.method_527(this.field_821, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }

   @Override
   public void method_321(Interface103 var1, int var2, int var3) {
      Class166 var4 = this.method_986(var2, var3);
      if (!var4.field_559) {
         var4.field_559 = true;
         if (this.field_390 != null) {
            this.field_390.method_321(var1, var2, var3);
            var4.method_745();
         }
      }
   }

   @Override
   public boolean method_541(boolean var1, Interface282 var2) {
      int var3 = 0;
      int var4 = 0;
      if (var2 != null) {
         for (int var5 = 0; var5 < this.field_1112.length; var5++) {
            if (this.field_1112[var5] != null && this.field_1112[var5].method_605(var1)) {
               var4++;
            }
         }
      }

      int var7 = 0;

      for (int var6 = 0; var6 < this.field_1112.length; var6++) {
         if (this.field_1112[var6] != null) {
            if (var1 && !this.field_1112[var6].field_1145) {
               this.method_387(this.field_1112[var6]);
            }

            if (this.field_1112[var6].method_605(var1)) {
               this.method_350(this.field_1112[var6]);
               this.field_1112[var6].field_619 = false;
               if (++var3 == 2 && !var1) {
                  return false;
               }

               if (var2 != null) {
                  if (++var7 % 10 == 0) {
                     var2.method_575(var7 * 100 / var4);
                  }
               }
            }
         }
      }

      if (var1) {
         if (this.field_397 == null) {
            return true;
         }

         this.field_397.method_798();
      }

      return true;
   }

   @Override
   public boolean method_756() {
      if (this.field_397 != null) {
         this.field_397.method_810();
      }

      return this.field_390.method_756();
   }

   @Override
   public boolean method_845() {
      return true;
   }
}
