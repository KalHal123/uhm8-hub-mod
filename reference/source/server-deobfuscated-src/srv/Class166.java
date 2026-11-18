package srv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class166 {
   public static boolean field_660;
   public byte[] field_663;
   public boolean field_982;
   public Class317 field_429;
   public Class245 field_1004;
   public Class245 field_869;
   public Class245 field_776;
   public byte[] field_474;
   public int field_1261;
   public final int field_21;
   public final int field_393;
   public Map field_1060 = new HashMap();
   public List[] field_540 = new List[8];
   public boolean field_559 = false;
   public boolean field_619 = false;
   public boolean field_1145;
   public boolean field_1123 = false;
   public boolean field_1259 = false;
   public long field_27 = 0L;
   public String field_1190;

   public Class166(Class317 var1, int var2, int var3) {
      this.field_429 = var1;
      this.field_21 = var2;
      this.field_393 = var3;
      this.field_474 = new byte[256];

      for (int var4 = 0; var4 < this.field_540.length; var4++) {
         this.field_540[var4] = new ArrayList();
      }

      this.field_1190 = Class156.method_729(this.field_429.field_68, this.field_21, this.field_393);
   }

   public Class166(Class317 var1, byte[] var2, int var3, int var4) {
      this(var1, var3, var4);
      this.field_663 = var2;
      this.field_1004 = new Class245(var2.length);
      this.field_869 = new Class245(var2.length);
      this.field_776 = new Class245(var2.length);
   }

   public boolean method_103(int var1, int var2) {
      return var1 == this.field_21 && var2 == this.field_393;
   }

   public int method_555(int var1, int var2) {
      return this.field_474[var2 << 4 | var1] & 0xFF;
   }

   public void method_1005() {
   }

   public void method_297() {
      int var1 = 127;

      for (int var2 = 0; var2 < 16; var2++) {
         for (int var3 = 0; var3 < 16; var3++) {
            this.field_474[var3 << 4 | var2] = -128;
            this.method_911(var2, 127, var3);
            if ((this.field_474[var3 << 4 | var2] & 255) < var1) {
               var1 = this.field_474[var3 << 4 | var2] & 255;
            }
         }
      }

      this.field_1261 = var1;

      for (int var4 = 0; var4 < 16; var4++) {
         for (int var5 = 0; var5 < 16; var5++) {
            this.method_940(var4, var5);
         }
      }

      this.field_619 = true;
   }

   private void method_940(int var1, int var2) {
      int var3 = this.method_555(var1, var2);
      int var4 = this.field_21 * 16 + var1;
      int var5 = this.field_393 * 16 + var2;
      this.method_298(var4 - 1, var5, var3);
      this.method_298(var4 + 1, var5, var3);
      this.method_298(var4, var5 - 1, var3);
      this.method_298(var4, var5 + 1, var3);
   }

   private void method_298(int var1, int var2, int var3) {
      int var4 = this.field_429.method_713(var1, var2);
      if (var4 > var3) {
         this.field_429.method_455(Enum336.field_50, var1, var3, var2, var1, var4, var2);
      } else if (var4 < var3) {
         this.field_429.method_455(Enum336.field_50, var1, var4, var2, var1, var3, var2);
      }

      this.field_619 = true;
   }

   private void method_911(int var1, int var2, int var3) {
      int var4 = this.field_474[var3 << 4 | var1] & 255;
      int var5 = var4;
      if (var2 > var4) {
         var5 = var2;
      }

      int var6 = var1 << 11 | var3 << 7;

      while (var5 > 0 && Class371.field_1484[this.field_663[var6 + var5 - 1] & 0xFF] == 0) {
         var5--;
      }

      if (var5 != var4) {
         this.field_429.method_163(var1, var3, var5, var4);
         this.field_474[var3 << 4 | var1] = (byte)var5;
         if (var5 < this.field_1261) {
            this.field_1261 = var5;
         } else {
            var6 = 127;

            for (int var7 = 0; var7 < 16; var7++) {
               for (int var8 = 0; var8 < 16; var8++) {
                  if ((this.field_474[var8 << 4 | var7] & 255) < var6) {
                     var6 = this.field_474[var8 << 4 | var7] & 255;
                  }
               }
            }

            this.field_1261 = var6;
         }

         var6 = this.field_21 * 16 + var1;
         int var13 = this.field_393 * 16 + var3;
         if (var5 < var4) {
            for (int var15 = var5; var15 < var4; var15++) {
               this.field_869.method_429(var1, var15, var3, 15);
            }
         } else {
            this.field_429.method_455(Enum336.field_50, var6, var4, var13, var6, var5, var13);

            for (int var14 = var4; var14 < var5; var14++) {
               this.field_869.method_429(var1, var14, var3, 0);
            }
         }

         int var16 = 15;
         int var9 = var5;

         while (var5 > 0 && var16 > 0) {
            int var10 = Class371.field_1484[this.method_218(var1, --var5, var3)];
            if (var10 == 0) {
               var10 = 1;
            }

            var16 -= var10;
            if (var16 < 0) {
               var16 = 0;
            }

            this.field_869.method_429(var1, var5, var3, var16);
         }

         while (var5 > 0 && Class371.field_1484[this.method_218(var1, var5 - 1, var3)] == 0) {
            var5--;
         }

         if (var5 != var9) {
            this.field_429.method_455(Enum336.field_50, var6 - 1, var5, var13 - 1, var6 + 1, var9, var13 + 1);
         }

         this.field_619 = true;
      }
   }

   public int method_218(int var1, int var2, int var3) {
      return this.field_663[var1 << 11 | var3 << 7 | var2] & 0xFF;
   }

   public boolean method_584(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4;
      int var7 = this.field_474[var3 << 4 | var1] & 255;
      int var8 = this.field_663[var1 << 11 | var3 << 7 | var2] & 255;
      if (var8 == var4 && this.field_1004.method_526(var1, var2, var3) == var5) {
         return false;
      }

      int var9 = this.field_21 * 16 + var1;
      int var10 = this.field_393 * 16 + var3;
      this.field_663[var1 << 11 | var3 << 7 | var2] = (byte)var6;
      if (var8 != 0 && !this.field_429.field_906) {
         Class371.field_57[var8].method_650(this.field_429, var9, var2, var10);
      }

      this.field_1004.method_429(var1, var2, var3, var5);
      if (Class371.field_1484[var6] != 0) {
         if (var2 >= var7) {
            this.method_911(var1, var2 + 1, var3);
         }
      } else if (var2 == var7 - 1) {
         this.method_911(var1, var2, var3);
      }

      this.field_429.method_455(Enum336.field_50, var9, var2, var10, var9, var2, var10);
      this.field_429.method_455(Enum336.field_1434, var9, var2, var10, var9, var2, var10);
      this.method_940(var1, var3);
      if (var4 != 0) {
         Class371.field_57[var4].method_1013(this.field_429, var9, var2, var10);
      }

      this.field_619 = true;
      return true;
   }

   public boolean method_45(int var1, int var2, int var3, int var4) {
      byte var5 = (byte)var4;
      int var6 = this.field_474[var3 << 4 | var1] & 255;
      int var7 = this.field_663[var1 << 11 | var3 << 7 | var2] & 255;
      if (var7 == var4) {
         return false;
      }

      int var8 = this.field_21 * 16 + var1;
      int var9 = this.field_393 * 16 + var3;
      this.field_663[var1 << 11 | var3 << 7 | var2] = var5;
      if (var7 != 0) {
         Class371.field_57[var7].method_650(this.field_429, var8, var2, var9);
      }

      this.field_1004.method_429(var1, var2, var3, 0);
      if (Class371.field_1484[var4] != 0) {
         if (var2 >= var6) {
            this.method_911(var1, var2 + 1, var3);
         }
      } else if (var2 == var6 - 1) {
         this.method_911(var1, var2, var3);
      }

      this.field_429.method_455(Enum336.field_50, var8, var2, var9, var8, var2, var9);
      this.field_429.method_455(Enum336.field_1434, var8, var2, var9, var8, var2, var9);
      this.method_940(var1, var3);
      if (var4 != 0 && !this.field_429.field_906) {
         Class371.field_57[var4].method_1013(this.field_429, var8, var2, var9);
      }

      this.field_619 = true;
      return true;
   }

   public int method_126(int var1, int var2, int var3) {
      return this.field_1004.method_526(var1, var2, var3);
   }

   public void method_969(int var1, int var2, int var3, int var4) {
      this.field_619 = true;
      this.field_1004.method_429(var1, var2, var3, var4);
   }

   public int method_711(Enum336 var1, int var2, int var3, int var4) {
      return var1 == Enum336.field_50
         ? this.field_869.method_526(var2, var3, var4)
         : (var1 == Enum336.field_1434 ? this.field_776.method_526(var2, var3, var4) : 0);
   }

   public void method_59(Enum336 var1, int var2, int var3, int var4, int var5) {
      this.field_619 = true;
      if (var1 == Enum336.field_50) {
         this.field_869.method_429(var2, var3, var4, var5);
      } else {
         if (var1 != Enum336.field_1434) {
            return;
         }

         this.field_776.method_429(var2, var3, var4, var5);
      }
   }

   public int method_963(int var1, int var2, int var3, int var4) {
      int var5 = this.field_869.method_526(var1, var2, var3);
      if (var5 > 0) {
         field_660 = true;
      }

      var5 -= var4;
      int var6 = this.field_776.method_526(var1, var2, var3);
      if (var6 > var5) {
         var5 = var6;
      }

      return var5;
   }

   public void method_155(Class252 var1) {
      if (!this.field_1123) {
         this.field_1259 = true;
         int var2 = Class380.method_502(var1.field_1324 / 16.0);
         int var3 = Class380.method_502(var1.field_1321 / 16.0);
         if (var2 != this.field_21 || var3 != this.field_393) {
            System.out.println("Wrong location! " + var1);
         }

         int var4 = Class380.method_502(var1.field_632 / 16.0);
         if (var4 < 0) {
            var4 = 0;
         }

         if (var4 >= this.field_540.length) {
            var4 = this.field_540.length - 1;
         }

         var1.field_519 = true;
         var1.field_809 = this.field_21;
         var1.field_737 = var4;
         var1.field_41 = this.field_393;
         this.field_540[var4].add(var1);
      }
   }

   public void method_873(Class252 var1) {
      this.method_367(var1, var1.field_737);
   }

   public void method_367(Class252 var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= this.field_540.length) {
         var2 = this.field_540.length - 1;
      }

      this.field_540[var2].remove(var1);
   }

   public boolean method_88(int var1, int var2, int var3) {
      return var2 >= (this.field_474[var3 << 4 | var1] & 255);
   }

   public Class66 method_703(int var1, int var2, int var3) {
      Class89 var4 = new Class89(var1, var2, var3);
      Class66 var5 = (Class66)this.field_1060.get(var4);
      if (var5 == null) {
         int var6 = this.method_218(var1, var2, var3);
         if (!Class371.field_1478[var6]) {
            return null;
         }

         Class277 var7 = (Class277)Class371.field_57[var6];
         var7.method_1013(this.field_429, this.field_21 * 16 + var1, var2, this.field_393 * 16 + var3);
         var5 = (Class66)this.field_1060.get(var4);
      }

      return var5;
   }

   public void method_72(Class66 var1) {
      int var2 = var1.field_720 - this.field_21 * 16;
      int var3 = var1.field_1400;
      int var4 = var1.field_454 - this.field_393 * 16;
      this.method_58(var2, var3, var4, var1);
   }

   public void method_58(int var1, int var2, int var3, Class66 var4) {
      Class89 var5 = new Class89(var1, var2, var3);
      var4.field_416 = this.field_429;
      var4.field_720 = this.field_21 * 16 + var1;
      var4.field_1400 = var2;
      var4.field_454 = this.field_393 * 16 + var3;
      if (this.method_218(var1, var2, var3) != 0 && Class371.field_57[this.method_218(var1, var2, var3)] instanceof Class277) {
         if (this.field_982) {
            if (this.field_1060.get(var5) != null) {
               this.field_429.field_839.remove(this.field_1060.get(var5));
            }

            this.field_429.field_839.add(var4);
         }

         this.field_1060.put(var5, var4);
      } else {
         System.out.println("Attempted to place a tile entity where there was no entity tile!");
      }
   }

   public void method_920(int var1, int var2, int var3) {
      Class89 var4 = new Class89(var1, var2, var3);
      if (this.field_982) {
         this.field_429.field_839.remove(this.field_1060.remove(var4));
      }
   }

   public void method_46() {
      this.field_982 = true;
      this.field_429.field_839.addAll(this.field_1060.values());

      for (int var1 = 0; var1 < this.field_540.length; var1++) {
         this.field_429.method_188(this.field_540[var1]);
      }
   }

   public void method_515() {
      this.field_982 = false;
      this.field_429.field_839.removeAll(this.field_1060.values());

      for (int var1 = 0; var1 < this.field_540.length; var1++) {
         this.field_429.method_660(this.field_540[var1]);
      }
   }

   public void method_745() {
      this.field_619 = true;
   }

   public void method_678(Class252 var1, Class94 var2, List var3) {
      int var4 = Class380.method_502((var2.field_817 - 2.0) / 16.0);
      int var5 = Class380.method_502((var2.field_1448 + 2.0) / 16.0);
      if (var4 < 0) {
         var4 = 0;
      }

      if (var5 >= this.field_540.length) {
         var5 = this.field_540.length - 1;
      }

      for (int var6 = var4; var6 <= var5; var6++) {
         List var7 = this.field_540[var6];

         for (int var8 = 0; var8 < var7.size(); var8++) {
            Class252 var9 = (Class252)var7.get(var8);
            if (var9 != var1 && var9.field_106.method_75(var2)) {
               var3.add(var9);
            }
         }
      }
   }

   public void method_899(Class var1, Class94 var2, List var3) {
      int var4 = Class380.method_502((var2.field_817 - 2.0) / 16.0);
      int var5 = Class380.method_502((var2.field_1448 + 2.0) / 16.0);
      if (var4 < 0) {
         var4 = 0;
      }

      if (var5 >= this.field_540.length) {
         var5 = this.field_540.length - 1;
      }

      for (int var6 = var4; var6 <= var5; var6++) {
         List var7 = this.field_540[var6];

         for (int var8 = 0; var8 < var7.size(); var8++) {
            Class252 var9 = (Class252)var7.get(var8);
            if (var1.isAssignableFrom(var9.getClass()) && var9.field_106.method_75(var2)) {
               var3.add(var9);
            }
         }
      }
   }

   public boolean method_605(boolean var1) {
      return this.field_1145 ? false : (this.field_1259 && this.field_429.field_301 != this.field_27 ? true : this.field_619);
   }

   public int method_882(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var9 = var2; var9 < var5; var9++) {
         for (int var10 = var4; var10 < var7; var10++) {
            int var11 = var9 << 11 | var10 << 7 | var3;
            int var12 = var6 - var3;
            System.arraycopy(this.field_663, var11, var1, var8, var12);
            var8 += var12;
         }
      }

      for (int var13 = var2; var13 < var5; var13++) {
         for (int var16 = var4; var16 < var7; var16++) {
            int var19 = (var13 << 11 | var16 << 7 | var3) >> 1;
            int var22 = (var6 - var3) / 2;
            System.arraycopy(this.field_1004.field_223, var19, var1, var8, var22);
            var8 += var22;
         }
      }

      for (int var14 = var2; var14 < var5; var14++) {
         for (int var17 = var4; var17 < var7; var17++) {
            int var20 = (var14 << 11 | var17 << 7 | var3) >> 1;
            int var23 = (var6 - var3) / 2;
            System.arraycopy(this.field_776.field_223, var20, var1, var8, var23);
            var8 += var23;
         }
      }

      for (int var15 = var2; var15 < var5; var15++) {
         for (int var18 = var4; var18 < var7; var18++) {
            int var21 = (var15 << 11 | var18 << 7 | var3) >> 1;
            int var24 = (var6 - var3) / 2;
            System.arraycopy(this.field_869.field_223, var21, var1, var8, var24);
            var8 += var24;
         }
      }

      return var8;
   }

   public Random method_602(long var1) {
      return new Random(
         this.field_429.field_68
               + this.field_21 * this.field_21 * 4987142
               + this.field_21 * 5947611
               + this.field_393 * this.field_393 * 4392871L
               + this.field_393 * 389711
            ^ var1
      );
   }
}
