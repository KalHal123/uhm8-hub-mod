package ext;

import java.io.IOException;

public class Class421 implements Interface752 {
   protected Class741 field_2000;
   protected Interface752 field_1905;
   protected Interface269 field_855;
   protected Class741[] field_427 = new Class741[1024];
   protected Class454 field_898;
   protected int field_2152 = -999999999;
   protected int field_1581 = -999999999;
   protected Class741 field_505;

   public Class421(Class454 var1, Interface269 var2, Interface752 var3) {
      this.field_2000 = new Class741(var1, new byte[32768], 0, 0);
      this.field_2000.field_347 = true;
      this.field_2000.field_109 = true;
      this.field_898 = var1;
      this.field_855 = var2;
      this.field_1905 = var3;
   }

   @Override
   public boolean method_972(int var1, int var2) {
      if (var1 == this.field_2152 && var2 == this.field_1581 && this.field_505 != null) {
         return true;
      }

      int var3 = var1 & 31;
      int var4 = var2 & 31;
      int var5 = var3 + var4 * 32;
      return this.field_427[var5] != null && (this.field_427[var5] == this.field_2000 || this.field_427[var5].method_512(var1, var2));
   }

   @Override
   public Class741 method_1337(int var1, int var2) {
      if (var1 == this.field_2152 && var2 == this.field_1581 && this.field_505 != null) {
         return this.field_505;
      }

      int var3 = var1 & 31;
      int var4 = var2 & 31;
      int var5 = var3 + var4 * 32;
      if (!this.method_972(var1, var2)) {
         if (this.field_427[var5] != null) {
            this.field_427[var5].method_1400();
            this.method_1544(this.field_427[var5]);
            this.method_138(this.field_427[var5]);
         }

         Class741 var6 = this.method_422(var1, var2);
         if (var6 == null) {
            if (this.field_1905 == null) {
               var6 = this.field_2000;
            } else {
               var6 = this.field_1905.method_1337(var1, var2);
            }
         }

         this.field_427[var5] = var6;
         if (this.field_427[var5] != null) {
            this.field_427[var5].method_116();
         }

         if (!this.field_427[var5].field_558 && this.method_972(var1 + 1, var2 + 1) && this.method_972(var1, var2 + 1) && this.method_972(var1 + 1, var2)) {
            this.method_1834(this, var1, var2);
         }

         if (this.method_972(var1 - 1, var2)
            && !this.method_1337(var1 - 1, var2).field_558
            && this.method_972(var1 - 1, var2 + 1)
            && this.method_972(var1, var2 + 1)
            && this.method_972(var1 - 1, var2)) {
            this.method_1834(this, var1 - 1, var2);
         }

         if (this.method_972(var1, var2 - 1)
            && !this.method_1337(var1, var2 - 1).field_558
            && this.method_972(var1 + 1, var2 - 1)
            && this.method_972(var1, var2 - 1)
            && this.method_972(var1 + 1, var2)) {
            this.method_1834(this, var1, var2 - 1);
         }

         if (this.method_972(var1 - 1, var2 - 1)
            && !this.method_1337(var1 - 1, var2 - 1).field_558
            && this.method_972(var1 - 1, var2 - 1)
            && this.method_972(var1, var2 - 1)
            && this.method_972(var1 - 1, var2)) {
            this.method_1834(this, var1 - 1, var2 - 1);
         }
      }

      this.field_2152 = var1;
      this.field_1581 = var2;
      this.field_505 = this.field_427[var5];
      return this.field_427[var5];
   }

   protected Class741 method_422(int var1, int var2) {
      if (this.field_855 == null) {
         return null;
      }

      try {
         Class741 var3 = this.field_855.method_685(this.field_898, var1, var2);
         if (var3 != null) {
            var3.field_1578 = this.field_898.field_2075;
         }

         return var3;
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   protected void method_138(Class741 var1) {
      if (this.field_855 != null) {
         try {
            this.field_855.method_899(this.field_898, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }
   }

   protected void method_1544(Class741 var1) {
      if (this.field_855 != null) {
         try {
            var1.field_1578 = this.field_898.field_2075;
            this.field_855.method_1370(this.field_898, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }

   @Override
   public void method_1834(Interface752 var1, int var2, int var3) {
      Class741 var4 = this.method_1337(var2, var3);
      if (!var4.field_558) {
         var4.field_558 = true;
         if (this.field_1905 != null) {
            this.field_1905.method_1834(var1, var2, var3);
            Class3.method_683(this.field_1905, var2 * 16, var3 * 16, this.field_898);
            var4.method_659();
         }
      }
   }

   @Override
   public boolean method_762(boolean var1, Interface608 var2) {
      int var3 = 0;
      int var4 = 0;
      if (var2 != null) {
         for (int var5 = 0; var5 < this.field_427.length; var5++) {
            if (this.field_427[var5] != null && this.field_427[var5].method_987(var1)) {
               var4++;
            }
         }
      }

      int var7 = 0;

      for (int var6 = 0; var6 < this.field_427.length; var6++) {
         if (this.field_427[var6] != null) {
            if (var1 && !this.field_427[var6].field_109) {
               this.method_138(this.field_427[var6]);
            }

            if (this.field_427[var6].method_987(var1)) {
               this.method_1544(this.field_427[var6]);
               this.field_427[var6].field_2922 = false;
               if (++var3 == 2 && !var1) {
                  return false;
               }

               if (var2 != null) {
                  if (++var7 % 10 == 0) {
                     var2.method_520(var7 * 100 / var4);
                  }
               }
            }
         }
      }

      if (var1) {
         if (this.field_855 == null) {
            return true;
         }

         this.field_855.method_879();
      }

      return true;
   }

   @Override
   public boolean method_1225() {
      if (this.field_855 != null) {
         this.field_855.method_1829();
      }

      return this.field_1905.method_1225();
   }

   @Override
   public boolean method_1354() {
      return true;
   }
}
