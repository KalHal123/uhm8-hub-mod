package ext;

public class Class370 implements Interface698 {
   private int field_1461;
   private int field_1034;
   private Class741[][] field_2373;
   private Class454 field_2634;

   public Class370(Class454 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_2634 = var1;
      this.field_1461 = var2 >> 4;
      this.field_1034 = var4 >> 4;
      int var8 = var5 >> 4;
      int var9 = var7 >> 4;
      this.field_2373 = new Class741[var8 - this.field_1461 + 1][var9 - this.field_1034 + 1];

      for (int var10 = this.field_1461; var10 <= var8; var10++) {
         for (int var11 = this.field_1034; var11 <= var9; var11++) {
            this.field_2373[var10 - this.field_1461][var11 - this.field_1034] = var1.method_1474(var10, var11);
         }
      }
   }

   @Override
   public int method_197(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      }

      if (var2 >= 128) {
         return 0;
      }

      int var4 = (var1 >> 4) - this.field_1461;
      int var5 = (var3 >> 4) - this.field_1034;

      try {
         return this.field_2373[var4][var5].method_1323(var1 & 15, var2, var3 & 15);
      } catch (ArrayIndexOutOfBoundsException var7) {
         return 0;
      }
   }

   @Override
   public Class186 method_1303(int var1, int var2, int var3) {
      int var4 = (var1 >> 4) - this.field_1461;
      int var5 = (var3 >> 4) - this.field_1034;
      return this.field_2373[var4][var5].method_399(var1 & 15, var2, var3 & 15);
   }

   @Override
   public float method_1394(int var1, int var2, int var3) {
      return Class310.field_760 ? 1.0F : Class454.field_1340[this.method_1709(var1, var2, var3, true)];
   }

   @Override
   public float method_1154(int var1, int var2, int var3) {
      return Class454.field_1340[this.method_730(var1, var2, var3)];
   }

   public int method_730(int var1, int var2, int var3) {
      return this.method_1709(var1, var2, var3, false);
   }

   public int method_1709(int var1, int var2, int var3, boolean var4) {
      return this.method_1367(var1, var2, var3, true, var4);
   }

   public int method_1719(int var1, int var2, int var3, boolean var4) {
      return this.method_1367(var1, var2, var3, var4, false);
   }

   public int method_1367(int var1, int var2, int var3, boolean var4, boolean var5) {
      int var6 = this.field_2634.field_2704;
      if (var5 && Class119.field_1519.field_1754.field_2733 == 5) {
         var6 = Math.max(12, var6);
      }

      if (var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if (var4) {
            int var7 = this.method_197(var1, var2, var3);
            if (var7 == Class390.field_2747.field_2151 || var7 == Class108.field_2252.field_2151 || var7 == Class108.field_2496.field_2151) {
               int var15 = this.method_1719(var1, var2 + 1, var3, false);
               int var9 = this.method_1719(var1 + 1, var2, var3, false);
               int var10 = this.method_1719(var1 - 1, var2, var3, false);
               int var11 = this.method_1719(var1, var2, var3 + 1, false);
               int var12 = this.method_1719(var1, var2, var3 - 1, false);
               if (var9 > var15) {
                  var15 = var9;
               }

               if (var10 > var15) {
                  var15 = var10;
               }

               if (var11 > var15) {
                  var15 = var11;
               }

               if (var12 > var15) {
                  var15 = var12;
               }

               return var15;
            }
         }

         if (var2 < 0) {
            return 0;
         }

         if (var2 >= 128) {
            int var14 = 15 - var6;
            if (var14 < 0) {
               var14 = 0;
            }

            return var14;
         } else {
            int var13 = (var1 >> 4) - this.field_1461;
            int var8 = (var3 >> 4) - this.field_1034;
            return this.field_2373[var13][var8].method_140(var1 & 15, var2, var3 & 15, var6);
         }
      } else {
         return 15;
      }
   }

   @Override
   public int method_1110(int var1, int var2, int var3) {
      if (var2 < 0) {
         return 0;
      }

      if (var2 >= 128) {
         return 0;
      }

      int var4 = (var1 >> 4) - this.field_1461;
      int var5 = (var3 >> 4) - this.field_1034;
      return this.field_2373[var4][var5].method_954(var1 & 15, var2, var3 & 15);
   }

   @Override
   public Class160 method_1286(int var1, int var2, int var3) {
      int var4 = this.method_197(var1, var2, var3);
      return var4 == 0 ? Class160.field_1255 : Class108.field_1221[var4].field_1854;
   }

   @Override
   public boolean method_768(int var1, int var2, int var3) {
      Class108 var4 = Class108.field_1221[this.method_197(var1, var2, var3)];
      return var4 == null ? false : var4.method_214();
   }

   @Override
   public Interface127 method_1805() {
      return this.field_2634.method_1805();
   }
}
