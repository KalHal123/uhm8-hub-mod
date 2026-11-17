package srv;

public class Class326 {
   private transient Class52[] field_520 = new Class52[16];
   private transient int field_1305;
   private int field_770 = 12;
   private final float field_355 = 0.75F;
   private transient volatile int field_1079;

   private static int method_902(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int method_529(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public Object method_17(int var1) {
      int var2 = method_902(var1);

      for (Class52 var3 = this.field_520[method_529(var2, this.field_520.length)]; var3 != null; var3 = var3.field_1482) {
         if (var3.field_581 == var1) {
            return var3.field_728;
         }
      }

      return null;
   }

   public boolean method_402(int var1) {
      return this.method_864(var1) != null;
   }

   final Class52 method_864(int var1) {
      int var2 = method_902(var1);

      for (Class52 var3 = this.field_520[method_529(var2, this.field_520.length)]; var3 != null; var3 = var3.field_1482) {
         if (var3.field_581 == var1) {
            return var3;
         }
      }

      return null;
   }

   public void method_120(int var1, Object var2) {
      int var3 = method_902(var1);
      int var4 = method_529(var3, this.field_520.length);

      for (Class52 var5 = this.field_520[var4]; var5 != null; var5 = var5.field_1482) {
         if (var5.field_581 == var1) {
            var5.field_728 = var2;
         }
      }

      this.field_1079++;
      this.method_300(var3, var1, var2, var4);
   }

   private void method_601(int var1) {
      Class52[] var2 = this.field_520;
      int var3 = var2.length;
      if (var3 == 1073741824) {
         this.field_770 = Integer.MAX_VALUE;
      } else {
         Class52[] var4 = new Class52[var1];
         this.method_151(var4);
         this.field_520 = var4;
         this.field_770 = (int)(var1 * 0.75F);
      }
   }

   private void method_151(Class52[] var1) {
      Class52[] var2 = this.field_520;
      int var3 = var1.length;

      for (int var4 = 0; var4 < var2.length; var4++) {
         Class52 var5 = var2[var4];
         if (var5 != null) {
            var2[var4] = null;

            while (true) {
               Class52 var6 = var5.field_1482;
               int var7 = method_529(var5.field_1076, var3);
               var5.field_1482 = var1[var7];
               var1[var7] = var5;
               var5 = var6;
               if (var6 == null) {
                  break;
               }
            }
         }
      }
   }

   public Object method_523(int var1) {
      Class52 var2 = this.method_348(var1);
      return var2 == null ? null : var2.field_728;
   }

   final Class52 method_348(int var1) {
      int var2 = method_902(var1);
      int var3 = method_529(var2, this.field_520.length);
      Class52 var4 = this.field_520[var3];
      Class52 var5 = var4;

      while (var5 != null) {
         Class52 var6 = var5.field_1482;
         if (var5.field_581 == var1) {
            this.field_1079++;
            this.field_1305--;
            if (var4 == var5) {
               this.field_520[var3] = var6;
            } else {
               var4.field_1482 = var6;
            }

            return var5;
         }

         var4 = var5;
         var5 = var6;
      }

      return var5;
   }

   public void method_953() {
      this.field_1079++;
      Class52[] var1 = this.field_520;

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = null;
      }

      this.field_1305 = 0;
   }

   private void method_300(int var1, int var2, Object var3, int var4) {
      Class52 var5 = this.field_520[var4];
      this.field_520[var4] = new Class52(var1, var2, var3, var5);
      if (this.field_1305++ >= this.field_770) {
         this.method_601(2 * this.field_520.length);
      }
   }

   static int method_918(int var0) {
      return method_902(var0);
   }
}
