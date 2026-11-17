package ext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class741 {
   public static boolean field_1448;
   public byte[] field_2711;
   public boolean field_1851;
   public Class454 field_2766;
   public Class129 field_2621;
   public Class129 field_1427;
   public Class129 field_1414;
   public byte[] field_2623;
   public int field_876;
   public final int field_976;
   public final int field_3158;
   public Map<Class450, Class186> field_2896;
   public List<Class359>[] field_2885;
   public boolean field_558;
   public boolean field_2922;
   public boolean field_109 = false;
   public boolean field_347;
   public boolean field_834;
   public long field_1578;

   public Class741(Class454 var1, int var2, int var3) {
      this.field_2896 = new HashMap<>();
      this.field_2885 = new List[8];
      this.field_558 = false;
      this.field_2922 = false;
      this.field_347 = false;
      this.field_834 = false;
      this.field_1578 = 0L;
      this.field_2766 = var1;
      this.field_976 = var2;
      this.field_3158 = var3;
      this.field_2623 = new byte[256];

      for (int var4 = 0; var4 < this.field_2885.length; var4++) {
         this.field_2885[var4] = new ArrayList<>();
      }
   }

   public Class741(Class454 var1, byte[] var2, int var3, int var4) {
      this(var1, var3, var4);
      this.field_2711 = var2;
      this.field_2621 = new Class129(var2.length);
      this.field_1427 = new Class129(var2.length);
      this.field_1414 = new Class129(var2.length);
   }

   public boolean method_512(int var1, int var2) {
      return var1 == this.field_976 && var2 == this.field_3158;
   }

   public int method_1274(int var1, int var2) {
      return this.field_2623[var2 << 4 | var1] & 0xFF;
   }

   public void method_79() {
   }

   public void method_41() {
      int var1 = 127;

      for (int var2 = 0; var2 < 16; var2++) {
         for (int var3 = 0; var3 < 16; var3++) {
            int var4 = 127;
            int var5 = var2 << 11 | var3 << 7;

            while (var4 > 0 && Class108.field_2371[this.field_2711[var5 + var4 - 1] & 0xFF] == 0) {
               var4--;
            }

            this.field_2623[var3 << 4 | var2] = (byte)var4;
            if (var4 < var1) {
               var1 = var4;
            }
         }
      }

      this.field_876 = var1;
      this.field_2922 = true;
   }

   public void method_1475() {
      int var1 = 127;

      for (int var2 = 0; var2 < 16; var2++) {
         for (int var3 = 0; var3 < 16; var3++) {
            this.field_2623[var3 << 4 | var2] = -128;
            this.method_1434(var2, 127, var3);
            if ((this.field_2623[var3 << 4 | var2] & 255) < var1) {
               var1 = this.field_2623[var3 << 4 | var2] & 255;
            }
         }
      }

      this.field_876 = var1;

      for (int var4 = 0; var4 < 16; var4++) {
         for (int var5 = 0; var5 < 16; var5++) {
            this.method_1039(var4, var5);
         }
      }

      this.field_2922 = true;
   }

   private void method_1039(int var1, int var2) {
      int var3 = this.method_1274(var1, var2);
      int var4 = this.field_976 * 16 + var1;
      int var5 = this.field_3158 * 16 + var2;
      this.method_958(var4 - 1, var5, var3);
      this.method_958(var4 + 1, var5, var3);
      this.method_958(var4, var5 - 1, var3);
      this.method_958(var4, var5 + 1, var3);
   }

   private void method_958(int var1, int var2, int var3) {
      int var4 = this.field_2766.method_718(var1, var2);
      if (var4 > var3) {
         this.field_2766.method_1929(Enum621.field_1792, var1, var3, var2, var1, var4, var2);
      } else if (var4 < var3) {
         this.field_2766.method_1929(Enum621.field_1792, var1, var4, var2, var1, var3, var2);
      }

      this.field_2922 = true;
   }

   private void method_1434(int var1, int var2, int var3) {
      int var4 = this.field_2623[var3 << 4 | var1] & 255;
      int var5 = var4;
      if (var2 > var4) {
         var5 = var2;
      }

      int var6 = var1 << 11 | var3 << 7;

      while (var5 > 0 && Class108.field_2371[this.field_2711[var6 + var5 - 1] & 0xFF] == 0) {
         var5--;
      }

      if (var5 != var4) {
         this.field_2766.method_635(var1, var3, var5, var4);
         this.field_2623[var3 << 4 | var1] = (byte)var5;
         if (var5 < this.field_876) {
            this.field_876 = var5;
         } else {
            var6 = 127;

            for (int var7 = 0; var7 < 16; var7++) {
               for (int var8 = 0; var8 < 16; var8++) {
                  if ((this.field_2623[var8 << 4 | var7] & 255) < var6) {
                     var6 = this.field_2623[var8 << 4 | var7] & 255;
                  }
               }
            }

            this.field_876 = var6;
         }

         var6 = this.field_976 * 16 + var1;
         int var13 = this.field_3158 * 16 + var3;
         if (var5 < var4) {
            for (int var15 = var5; var15 < var4; var15++) {
               this.field_1427.method_829(var1, var15, var3, 15);
            }
         } else {
            this.field_2766.method_1929(Enum621.field_1792, var6, var4, var13, var6, var5, var13);

            for (int var14 = var4; var14 < var5; var14++) {
               this.field_1427.method_829(var1, var14, var3, 0);
            }
         }

         int var16 = 15;
         int var9 = var5;

         while (var5 > 0 && var16 > 0) {
            int var10 = Class108.field_2371[this.method_1323(var1, --var5, var3)];
            if (var10 == 0) {
               var10 = 1;
            }

            var16 -= var10;
            if (var16 < 0) {
               var16 = 0;
            }

            this.field_1427.method_829(var1, var5, var3, var16);
         }

         while (var5 > 0 && Class108.field_2371[this.method_1323(var1, var5 - 1, var3)] == 0) {
            var5--;
         }

         if (var5 != var9) {
            this.field_2766.method_1929(Enum621.field_1792, var6 - 1, var5, var13 - 1, var6 + 1, var9, var13 + 1);
         }

         this.field_2922 = true;
      }
   }

   public int method_1323(int var1, int var2, int var3) {
      int var4 = var1 << 11 | var3 << 7 | var2;
      return this.field_2711[var4] & 0xFF;
   }

   public boolean method_1063(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4;
      int var7 = this.field_2623[var3 << 4 | var1] & 255;
      int var8 = this.field_2711[var1 << 11 | var3 << 7 | var2] & 255;
      if (var8 == var4 && this.field_2621.method_1259(var1, var2, var3) == var5) {
         return false;
      }

      int var9 = this.field_976 * 16 + var1;
      int var10 = this.field_3158 * 16 + var3;
      this.field_2711[var1 << 11 | var3 << 7 | var2] = (byte)var6;
      if (var8 != 0 && !this.field_2766.field_2994) {
         Class108.field_1221[var8].method_1736(this.field_2766, var9, var2, var10);
      }

      this.field_2621.method_829(var1, var2, var3, var5);
      if (Class108.field_2371[var6] != 0) {
         if (var2 >= var7) {
            this.method_1434(var1, var2 + 1, var3);
         }
      } else if (var2 == var7 - 1) {
         this.method_1434(var1, var2, var3);
      }

      this.field_2766.method_1929(Enum621.field_1792, var9, var2, var10, var9, var2, var10);
      this.field_2766.method_1929(Enum621.field_2016, var9, var2, var10, var9, var2, var10);
      this.method_1039(var1, var3);
      if (var4 != 0) {
         Class108.field_1221[var4].method_1937(this.field_2766, var9, var2, var10);
      }

      this.field_2922 = true;
      return true;
   }

   public boolean method_865(int var1, int var2, int var3, int var4) {
      int var5 = var4;
      int var6 = this.field_2623[var3 << 4 | var1] & 255;
      int var7 = this.field_2711[var1 << 11 | var3 << 7 | var2] & 255;
      if (var7 == var4) {
         return false;
      }

      int var8 = this.field_976 * 16 + var1;
      int var9 = this.field_3158 * 16 + var3;
      this.field_2711[var1 << 11 | var3 << 7 | var2] = (byte)var5;
      if (var7 != 0) {
         Class108.field_1221[var7].method_1736(this.field_2766, var8, var2, var9);
      }

      this.field_2621.method_829(var1, var2, var3, 0);
      if (Class108.field_2371[var5] != 0) {
         if (var2 >= var6) {
            this.method_1434(var1, var2 + 1, var3);
         }
      } else if (var2 == var6 - 1) {
         this.method_1434(var1, var2, var3);
      }

      this.field_2766.method_1929(Enum621.field_1792, var8, var2, var9, var8, var2, var9);
      this.field_2766.method_1929(Enum621.field_2016, var8, var2, var9, var8, var2, var9);
      this.method_1039(var1, var3);
      if (var4 != 0 && !this.field_2766.field_2994) {
         Class108.field_1221[var4].method_1937(this.field_2766, var8, var2, var9);
      }

      this.field_2922 = true;
      return true;
   }

   public int method_954(int var1, int var2, int var3) {
      return this.field_2621.method_1259(var1, var2, var3);
   }

   public void method_339(int var1, int var2, int var3, int var4) {
      this.field_2922 = true;
      this.field_2621.method_829(var1, var2, var3, var4);
   }

   public int method_180(Enum621 var1, int var2, int var3, int var4) {
      return var1 == Enum621.field_1792
         ? this.field_1427.method_1259(var2, var3, var4)
         : (var1 == Enum621.field_2016 ? this.field_1414.method_1259(var2, var3, var4) : 0);
   }

   public void method_130(Enum621 var1, int var2, int var3, int var4, int var5) {
      this.field_2922 = true;
      if (var1 == Enum621.field_1792) {
         this.field_1427.method_829(var2, var3, var4, var5);
      } else {
         if (var1 != Enum621.field_2016) {
            return;
         }

         this.field_1414.method_829(var2, var3, var4, var5);
      }
   }

   public int method_140(int var1, int var2, int var3, int var4) {
      int var5 = this.field_1427.method_1259(var1, var2, var3);
      if (var5 > 0) {
         field_1448 = true;
      }

      var5 -= var4;
      int var6 = this.field_1414.method_1259(var1, var2, var3);
      if (var6 > var5) {
         var5 = var6;
      }

      return var5;
   }

   public void method_76(Class359 var1) {
      if (!this.field_347) {
         this.field_834 = true;
         int var2 = Class469.method_468(var1.field_1417 / 16.0);
         int var3 = Class469.method_468(var1.field_2013 / 16.0);
         if (var2 != this.field_976 || var3 != this.field_3158) {
            System.out.println("Wrong location! " + var1);
         }

         int var4 = Class469.method_468(var1.field_2654 / 16.0);
         if (var4 < 0) {
            var4 = 0;
         }

         if (var4 >= this.field_2885.length) {
            var4 = this.field_2885.length - 1;
         }

         var1.field_374 = true;
         var1.field_3078 = this.field_976;
         var1.field_255 = var4;
         var1.field_2552 = this.field_3158;
         this.field_2885[var4].add(var1);
      }
   }

   public void method_1728(Class359 var1) {
      this.method_595(var1, var1.field_255);
   }

   public void method_595(Class359 var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= this.field_2885.length) {
         var2 = this.field_2885.length - 1;
      }

      this.field_2885[var2].remove(var1);
   }

   public boolean method_1098(int var1, int var2, int var3) {
      return var2 >= (this.field_2623[var3 << 4 | var1] & 255);
   }

   public Class186 method_399(int var1, int var2, int var3) {
      Class450 var4 = new Class450(var1, var2, var3);
      Class186 var5 = this.field_2896.get(var4);
      if (var5 == null) {
         int var6 = this.method_1323(var1, var2, var3);
         if (!Class108.field_1953[var6]) {
            return null;
         }

         Class19 var7 = (Class19)Class108.field_1221[var6];
         var7.method_1937(this.field_2766, this.field_976 * 16 + var1, var2, this.field_3158 * 16 + var3);
         var5 = this.field_2896.get(var4);
      }

      return var5;
   }

   public void method_843(Class186 var1) {
      int var2 = var1.field_2878 - this.field_976 * 16;
      int var3 = var1.field_883;
      int var4 = var1.field_921 - this.field_3158 * 16;
      this.method_187(var2, var3, var4, var1);
   }

   public void method_187(int var1, int var2, int var3, Class186 var4) {
      Class450 var5 = new Class450(var1, var2, var3);
      var4.field_1380 = this.field_2766;
      var4.field_2878 = this.field_976 * 16 + var1;
      var4.field_883 = var2;
      var4.field_921 = this.field_3158 * 16 + var3;
      if (this.method_1323(var1, var2, var3) != 0 && Class108.field_1221[this.method_1323(var1, var2, var3)] instanceof Class19) {
         if (this.field_1851) {
            if (this.field_2896.get(var5) != null) {
               this.field_2766.field_1982.remove(this.field_2896.get(var5));
            }

            this.field_2766.field_1982.add(var4);
         }

         this.field_2896.put(var5, var4);
      } else {
         System.out.println("Attempted to place a tile entity where there was no entity tile!");
      }
   }

   public void method_1738(int var1, int var2, int var3) {
      Class450 var4 = new Class450(var1, var2, var3);
      if (this.field_1851) {
         this.field_2766.field_1982.remove(this.field_2896.remove(var4));
      }
   }

   public void method_116() {
      this.field_1851 = true;
      if (this.field_2896.values().size() > 0) {
         this.field_2766.field_1982.addAll(this.field_2896.values());
      }

      for (int var1 = 0; var1 < this.field_2885.length; var1++) {
         if (this.field_2885[var1].size() > 0) {
            this.field_2766.method_807(this.field_2885[var1]);
         }
      }
   }

   public void method_1400() {
      this.field_1851 = false;
      this.field_2766.field_1982.removeAll(this.field_2896.values());

      for (int var1 = 0; var1 < this.field_2885.length; var1++) {
         if (!(this.field_2885[var1] instanceof Class563)) {
            this.field_2766.method_1343(this.field_2885[var1]);
         } else {
            Class597.method_195("attempted to remove player");
         }
      }
   }

   public void method_659() {
      this.field_2922 = true;
   }

   public void method_614(Class359 var1, Class630 var2, List var3) {
      int var4 = Class469.method_468((var2.field_946 - 2.0) / 16.0);
      int var5 = Class469.method_468((var2.field_3132 + 2.0) / 16.0);
      if (var4 < 0) {
         var4 = 0;
      }

      if (var5 >= this.field_2885.length) {
         var5 = this.field_2885.length - 1;
      }

      for (int var6 = var4; var6 <= var5; var6++) {
         List var7 = this.field_2885[var6];

         for (int var8 = 0; var8 < var7.size(); var8++) {
            Class359 var9 = (Class359)var7.get(var8);
            if (var9 != var1 && var9.field_235.method_1328(var2)) {
               var3.add(var9);
            }
         }
      }
   }

   public void method_1169(Class<? extends Class359> var1, Class630 var2, List<Class359> var3) {
      int var4 = Class469.method_468((var2.field_946 - 2.0) / 16.0);
      int var5 = Class469.method_468((var2.field_3132 + 2.0) / 16.0);
      if (var4 < 0) {
         var4 = 0;
      }

      if (var5 >= this.field_2885.length) {
         var5 = this.field_2885.length - 1;
      }

      for (int var6 = var4; var6 <= var5; var6++) {
         List var7 = this.field_2885[var6];

         for (int var8 = 0; var8 < var7.size(); var8++) {
            Class359 var9 = (Class359)var7.get(var8);
            if (var1.isAssignableFrom(var9.getClass()) && var9.field_235.method_1328(var2)) {
               var3.add(var9);
            }
         }
      }
   }

   public boolean method_987(boolean var1) {
      return this.field_109 ? false : (this.field_834 && this.field_2766.field_2075 != this.field_1578 ? true : this.field_2922);
   }

   public int method_210(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var9 = var2; var9 < var5; var9++) {
         for (int var10 = var4; var10 < var7; var10++) {
            int var11 = var9 << 11 | var10 << 7 | var3;
            int var12 = var6 - var3;
            System.arraycopy(var1, var8, this.field_2711, var11, var12);
            var8 += var12;
         }
      }

      this.method_41();

      for (int var13 = var2; var13 < var5; var13++) {
         for (int var16 = var4; var16 < var7; var16++) {
            int var19 = (var13 << 11 | var16 << 7 | var3) >> 1;
            int var22 = (var6 - var3) / 2;
            System.arraycopy(var1, var8, this.field_2621.field_932, var19, var22);
            var8 += var22;
         }
      }

      for (int var14 = var2; var14 < var5; var14++) {
         for (int var17 = var4; var17 < var7; var17++) {
            int var20 = (var14 << 11 | var17 << 7 | var3) >> 1;
            int var23 = (var6 - var3) / 2;
            System.arraycopy(var1, var8, this.field_1414.field_932, var20, var23);
            var8 += var23;
         }
      }

      for (int var15 = var2; var15 < var5; var15++) {
         for (int var18 = var4; var18 < var7; var18++) {
            int var21 = (var15 << 11 | var18 << 7 | var3) >> 1;
            int var24 = (var6 - var3) / 2;
            System.arraycopy(var1, var8, this.field_1427.field_932, var21, var24);
            var8 += var24;
         }
      }

      return var8;
   }

   public Random method_408(long var1) {
      return new Random(
         this.field_2766.field_482
               + this.field_976 * this.field_976 * 4987142
               + this.field_976 * 5947611
               + this.field_3158 * this.field_3158 * 4392871L
               + this.field_3158 * 389711
            ^ var1
      );
   }
}
