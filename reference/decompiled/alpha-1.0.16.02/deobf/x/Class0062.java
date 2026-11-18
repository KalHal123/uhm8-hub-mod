package x;

import java.io.IOException;

public class Class0062 implements Class0020 {
   private Class0154[] b = new Class0154[256];
   private Class0065 c;
   private Class0005 d;
   byte[] a = new byte[32768];

   public Class0062(Class0065 var1, Class0005 var2) {
      this.c = var1;
      this.d = var2;
   }

   @Override
   public boolean a(int var1, int var2) {
      int var3 = var1 & 15 | (var2 & 15) * 16;
      return this.b[var3] != null && this.b[var3].a(var1, var2);
   }

   @Override
   public Class0154 b(int var1, int var2) {
      int var3 = var1 & 15 | (var2 & 15) * 16;

      try {
         if (!this.a(var1, var2)) {
            Class0154 var4 = this.c(var1, var2);
            if (var4 == null) {
               var4 = new Class0154(this.c, this.a, var1, var2);
               var4.q = true;
               var4.p = true;
            }

            this.b[var3] = var4;
         }

         return this.b[var3];
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private synchronized Class0154 c(int var1, int var2) {
      try {
         return this.d.a(this.c, var1, var2);
      } catch (IOException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @Override
   public void a(Class0020 var1, int var2, int var3) {
   }

   @Override
   public boolean a(boolean var1, Class0360 var2) {
      return true;
   }

   @Override
   public boolean a() {
      return false;
   }

   @Override
   public boolean b() {
      return false;
   }
}
