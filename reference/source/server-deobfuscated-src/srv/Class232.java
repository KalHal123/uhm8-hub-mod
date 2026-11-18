package srv;

public class Class232 {
   private transient Class139[] field_417 = new Class139[16];
   private transient int field_70;
   private int field_31 = 12;
   private final float field_284 = 0.75F;
   private transient volatile int field_763;

   private static int method_65(long var0) {
      return method_440((int)(var0 ^ var0 >>> 32));
   }

   private static int method_440(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int method_640(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public Object method_679(long var1) {
      int var3 = method_65(var1);

      for (Class139 var4 = this.field_417[method_640(var3, this.field_417.length)]; var4 != null; var4 = var4.field_1410) {
         if (var4.field_238 == var1) {
            return var4.field_1542;
         }
      }

      return null;
   }

   public void method_614(long var1, Object var3) {
      int var4 = method_65(var1);
      int var5 = method_640(var4, this.field_417.length);

      for (Class139 var6 = this.field_417[var5]; var6 != null; var6 = var6.field_1410) {
         if (var6.field_238 == var1) {
            var6.field_1542 = var3;
         }
      }

      this.field_763++;
      this.method_635(var4, var1, var3, var5);
   }

   private void method_178(int var1) {
      Class139[] var2 = this.field_417;
      int var3 = var2.length;
      if (var3 == 1073741824) {
         this.field_31 = Integer.MAX_VALUE;
      } else {
         Class139[] var4 = new Class139[var1];
         this.method_728(var4);
         this.field_417 = var4;
         this.field_31 = (int)(var1 * 0.75F);
      }
   }

   private void method_728(Class139[] var1) {
      Class139[] var2 = this.field_417;
      int var3 = var1.length;

      for (int var4 = 0; var4 < var2.length; var4++) {
         Class139 var5 = var2[var4];
         if (var5 != null) {
            var2[var4] = null;

            while (true) {
               Class139 var6 = var5.field_1410;
               int var7 = method_640(var5.field_583, var3);
               var5.field_1410 = var1[var7];
               var1[var7] = var5;
               var5 = var6;
               if (var6 == null) {
                  break;
               }
            }
         }
      }
   }

   public Object method_69(long var1) {
      Class139 var3 = this.method_654(var1);
      return var3 == null ? null : var3.field_1542;
   }

   final Class139 method_654(long var1) {
      int var3 = method_65(var1);
      int var4 = method_640(var3, this.field_417.length);
      Class139 var5 = this.field_417[var4];
      Class139 var6 = var5;

      while (var6 != null) {
         Class139 var7 = var6.field_1410;
         if (var6.field_238 == var1) {
            this.field_763++;
            this.field_70--;
            if (var5 == var6) {
               this.field_417[var4] = var7;
            } else {
               var5.field_1410 = var7;
            }

            return var6;
         }

         var5 = var6;
         var6 = var7;
      }

      return var6;
   }

   private void method_635(int var1, long var2, Object var4, int var5) {
      Class139 var6 = this.field_417[var5];
      this.field_417[var5] = new Class139(var1, var2, var4, var6);
      if (this.field_70++ >= this.field_31) {
         this.method_178(2 * this.field_417.length);
      }
   }

   static int method_167(long var0) {
      return method_65(var0);
   }
}
