package ext;

public class Class738 {
   private transient Class544[] field_999 = new Class544[16];
   private transient int field_2138;
   private int field_3027 = 12;
   private final float field_102 = 0.75F;
   private transient volatile int field_1285;

   private static int method_1534(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int method_333(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public Object method_911(int var1) {
      int var2 = method_1534(var1);

      for (Class544 var3 = this.field_999[method_333(var2, this.field_999.length)]; var3 != null; var3 = var3.field_708) {
         if (var3.field_698 == var1) {
            return var3.field_1391;
         }
      }

      return null;
   }

   public void method_1539(int var1, Object var2) {
      int var3 = method_1534(var1);
      int var4 = method_333(var3, this.field_999.length);

      for (Class544 var5 = this.field_999[var4]; var5 != null; var5 = var5.field_708) {
         if (var5.field_698 == var1) {
            var5.field_1391 = var2;
         }
      }

      this.field_1285++;
      this.method_1317(var3, var1, var2, var4);
   }

   private void method_1295(int var1) {
      Class544[] var2 = this.field_999;
      int var3 = var2.length;
      if (var3 == 1073741824) {
         this.field_3027 = Integer.MAX_VALUE;
      } else {
         Class544[] var4 = new Class544[var1];
         this.method_1092(var4);
         this.field_999 = var4;
         this.field_3027 = (int)(var1 * 0.75F);
      }
   }

   private void method_1092(Class544[] var1) {
      Class544[] var2 = this.field_999;
      int var3 = var1.length;

      for (int var4 = 0; var4 < var2.length; var4++) {
         Class544 var5 = var2[var4];
         if (var5 != null) {
            var2[var4] = null;

            while (true) {
               Class544 var6 = var5.field_708;
               int var7 = method_333(var5.field_1595, var3);
               var5.field_708 = var1[var7];
               var1[var7] = var5;
               var5 = var6;
               if (var6 == null) {
                  break;
               }
            }
         }
      }
   }

   public Object method_797(int var1) {
      Class544 var2 = this.method_907(var1);
      return var2 == null ? null : var2.field_1391;
   }

   final Class544 method_907(int var1) {
      int var2 = method_1534(var1);
      int var3 = method_333(var2, this.field_999.length);
      Class544 var4 = this.field_999[var3];
      Class544 var5 = var4;

      while (var5 != null) {
         Class544 var6 = var5.field_708;
         if (var5.field_698 == var1) {
            this.field_1285++;
            this.field_2138--;
            if (var4 == var5) {
               this.field_999[var3] = var6;
            } else {
               var4.field_708 = var6;
            }

            return var5;
         }

         var4 = var5;
         var5 = var6;
      }

      return var5;
   }

   public void method_1415() {
      this.field_1285++;
      Class544[] var1 = this.field_999;

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = null;
      }

      this.field_2138 = 0;
   }

   private void method_1317(int var1, int var2, Object var3, int var4) {
      Class544 var5 = this.field_999[var4];
      this.field_999[var4] = new Class544(var1, var2, var3, var5);
      if (this.field_2138++ >= this.field_3027) {
         this.method_1295(2 * this.field_999.length);
      }
   }

   static int method_1868(int var0) {
      return method_1534(var0);
   }
}
