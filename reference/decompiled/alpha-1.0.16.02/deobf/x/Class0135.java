package x;

public class Class0135 {
   private transient Class0336[] a;
   private transient int b;
   private int c;
   private final float d = 0.75F;
   private transient volatile int e;

   public Class0135() {
      this.c = 12;
      this.a = new Class0336[16];
   }

   private static int e(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int a(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public Object a(int var1) {
      int var2 = e(var1);

      for (Class0336 var3 = this.a[a(var2, this.a.length)]; var3 != null; var3 = var3.c) {
         if (var3.a == var1) {
            return var3.b;
         }
      }

      return null;
   }

   public void a(int var1, Object var2) {
      int var3 = e(var1);
      int var4 = a(var3, this.a.length);

      for (Class0336 var5 = this.a[var4]; var5 != null; var5 = var5.c) {
         if (var5.a == var1) {
            var5.b = var2;
         }
      }

      this.e++;
      this.a(var3, var1, var2, var4);
   }

   private void f(int var1) {
      Class0336[] var2 = this.a;
      int var3 = var2.length;
      if (var3 == 1073741824) {
         this.c = Integer.MAX_VALUE;
      } else {
         Class0336[] var4 = new Class0336[var1];
         this.a(var4);
         this.a = var4;
         this.c = (int)(var1 * this.d);
      }
   }

   private void a(Class0336[] var1) {
      Class0336[] var2 = this.a;
      int var3 = var1.length;

      for (int var4 = 0; var4 < var2.length; var4++) {
         Class0336 var5 = var2[var4];
         if (var5 != null) {
            var2[var4] = null;

            while (true) {
               Class0336 var6 = var5.c;
               int var7 = a(var5.d, var3);
               var5.c = var1[var7];
               var1[var7] = var5;
               var5 = var6;
               if (var5 == null) {
                  break;
               }
            }
         }
      }
   }

   public Object b(int var1) {
      Class0336 var2 = this.c(var1);
      return var2 == null ? null : var2.b;
   }

   final Class0336 c(int var1) {
      int var2 = e(var1);
      int var3 = a(var2, this.a.length);
      Class0336 var4 = this.a[var3];
      Class0336 var5 = var4;

      while (var5 != null) {
         Class0336 var6 = var5.c;
         if (var5.a == var1) {
            this.e++;
            this.b--;
            if (var4 == var5) {
               this.a[var3] = var6;
            } else {
               var4.c = var6;
            }

            return var5;
         }

         var4 = var5;
         var5 = var6;
      }

      return var5;
   }

   public void a() {
      this.e++;
      Class0336[] var1 = this.a;

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = null;
      }

      this.b = 0;
   }

   private void a(int var1, int var2, Object var3, int var4) {
      Class0336 var5 = this.a[var4];
      this.a[var4] = new Class0336(var1, var2, var3, var5);
      if (this.b++ >= this.c) {
         this.f(2 * this.a.length);
      }
   }
}
