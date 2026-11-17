package ext;

import java.io.IOException;

public class Class34 implements Interface752 {
   private Class741[] field_1434 = new Class741[256];
   private Class454 field_1300;
   private Interface269 field_3151;
   byte[] field_114 = new byte[32768];

   public Class34(Class454 var1, Interface269 var2) {
      this.field_1300 = var1;
      this.field_3151 = var2;
   }

   @Override
   public boolean method_972(int var1, int var2) {
      int var3 = var1 & 15 | (var2 & 15) * 16;
      return this.field_1434[var3] != null && this.field_1434[var3].method_512(var1, var2);
   }

   @Override
   public Class741 method_1337(int var1, int var2) {
      int var3 = var1 & 15 | (var2 & 15) * 16;

      try {
         if (!this.method_972(var1, var2)) {
            Class741 var4 = this.method_1254(var1, var2);
            if (var4 == null) {
               var4 = new Class741(this.field_1300, this.field_114, var1, var2);
               var4.field_347 = true;
               var4.field_109 = true;
            }

            this.field_1434[var3] = var4;
         }

         return this.field_1434[var3];
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private synchronized Class741 method_1254(int var1, int var2) {
      try {
         return this.field_3151.method_685(this.field_1300, var1, var2);
      } catch (IOException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @Override
   public void method_1834(Interface752 var1, int var2, int var3) {
   }

   @Override
   public boolean method_762(boolean var1, Interface608 var2) {
      return true;
   }

   @Override
   public boolean method_1225() {
      return false;
   }

   @Override
   public boolean method_1354() {
      return false;
   }
}
