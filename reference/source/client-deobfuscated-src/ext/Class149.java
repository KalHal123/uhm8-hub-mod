package ext;

import net.minecraft.client.Minecraft;

public class Class149 {
   public int field_1620;
   public int field_1484;
   public int field_548;
   public boolean field_2841 = false;
   public int field_1636;
   public int field_2575;
   public int field_1836;
   public boolean field_1206 = false;
   public Minecraft field_1383;
   public long field_3042 = 0L;
   int field_1645 = 0;
   int field_1092 = 0;
   int field_1573 = 0;
   int field_707 = 0;
   private String[] field_1589 = new String[]{"Fill", "Replace", "Expand", "Move sel.", "Set here"};

   public void method_119(int var1, int var2, int var3) {
      this.field_1620 = var1;
      this.field_1484 = var2;
      this.field_548 = var3;
      this.field_2841 = true;
   }

   public void method_764(int var1, int var2, int var3) {
      this.field_1636 = var1;
      this.field_2575 = var2;
      this.field_1836 = var3;
      this.field_1206 = true;
   }

   public Class149(Minecraft var1) {
      this.field_1383 = var1;
   }

   public void method_1096() {
      Class100.method_522(
         this.field_1383.field_2648,
         (long)this.field_1383.field_2787.field_1417,
         (long)this.field_1383.field_2787.field_2654,
         (long)this.field_1383.field_2787.field_2013,
         this.field_1092
      );
   }

   public void method_122() {
      if (this.field_2841 && this.field_1206) {
         int var1 = Math.min(this.field_1620, this.field_1636);
         int var2 = Math.min(this.field_1484, this.field_2575);
         int var3 = Math.min(this.field_548, this.field_1836);
         int var4 = Math.max(this.field_1620, this.field_1636);
         int var5 = Math.max(this.field_1484, this.field_2575);
         int var6 = Math.max(this.field_548, this.field_1836);
         Class100.method_1009(this.field_1383.field_2648, new Class326(var1, var2, var3), new Class326(var4, var5, var6), this.field_1573);
         Class119.field_1519.field_964.method_967("Filled " + (var4 - var1 + 1) * (var5 - var2 + 1) * (var6 - var3 + 1) + " blocks.");
      } else {
         Class597.method_883("Both positions are not set.");
      }
   }

   public void method_648() {
      if (this.field_2841 && this.field_1206) {
         int var1 = Math.min(this.field_1620, this.field_1636);
         int var2 = Math.min(this.field_1484, this.field_2575);
         int var3 = Math.min(this.field_548, this.field_1836);
         int var4 = Math.max(this.field_1620, this.field_1636);
         int var5 = Math.max(this.field_1484, this.field_2575);
         int var6 = Math.max(this.field_548, this.field_1836);

         for (int var7 = var1; var7 <= var4; var7++) {
            for (int var8 = var2; var8 <= var5; var8++) {
               for (int var9 = var3; var9 <= var6; var9++) {
                  if (this.field_1383.field_2648.method_197(var7, var8, var9) == this.field_1573) {
                     Class100.method_522(this.field_1383.field_2648, var7, var8, var9, this.field_707);
                  }
               }
            }
         }
      } else {
         Class597.method_883("Both positions are not set.");
      }
   }

   public void method_767() {
      int var1 = this.field_1573;
      switch (var1) {
         case 0:
            boolean var2 = this.field_1484 > this.field_2575;
            if (var2) {
               this.field_1484 = this.field_1484 + this.field_707;
            } else {
               this.field_2575 = this.field_2575 + this.field_707;
            }

            Class119.field_1519.field_964.method_967("Expanded selection upward");
            break;
         case 1:
            boolean var3 = this.field_2575 > this.field_1484;
            if (var3) {
               this.field_1484 = this.field_1484 - this.field_707;
            } else {
               this.field_2575 = this.field_2575 - this.field_707;
            }

            Class119.field_1519.field_964.method_967("Expanded selection downward");
            break;
         case 2:
            boolean var4 = this.field_1620 > this.field_1636;
            if (var4) {
               this.field_1620 = this.field_1620 + this.field_707;
            } else {
               this.field_1636 = this.field_1636 + this.field_707;
            }
            break;
         case 3:
            boolean var5 = this.field_1636 > this.field_1620;
            if (var5) {
               this.field_1620 = this.field_1620 - this.field_707;
            } else {
               this.field_1636 = this.field_1636 - this.field_707;
            }
            break;
         case 4:
            boolean var6 = this.field_548 > this.field_1836;
            if (var6) {
               this.field_548 = this.field_548 + this.field_707;
            } else {
               this.field_1836 = this.field_1836 + this.field_707;
            }
            break;
         case 5:
            boolean var7 = this.field_1836 > this.field_548;
            if (var7) {
               this.field_548 = this.field_548 - this.field_707;
            } else {
               this.field_1836 = this.field_1836 - this.field_707;
            }
      }
   }

   public void method_433() {
      int var1 = this.field_1573;
      switch (var1) {
         case 0:
            this.field_1484 = this.field_1484 + this.field_707;
            this.field_2575 = this.field_2575 + this.field_707;
            break;
         case 1:
            this.field_1484 = this.field_1484 - this.field_707;
            this.field_2575 = this.field_2575 - this.field_707;
            break;
         case 2:
            this.field_1620 = this.field_1620 + this.field_707;
            this.field_1636 = this.field_1636 + this.field_707;
            break;
         case 3:
            this.field_1620 = this.field_1620 - this.field_707;
            this.field_1636 = this.field_1636 - this.field_707;
            break;
         case 4:
            this.field_548 = this.field_548 + this.field_707;
            this.field_1836 = this.field_1836 + this.field_707;
            break;
         case 5:
            this.field_548 = this.field_548 - this.field_707;
            this.field_1836 = this.field_1836 - this.field_707;
      }
   }

   public void method_1358() {
      switch (this.field_1645) {
         case 0:
            this.field_1645++;
            break;
         case 1:
            if (this.field_1573 > -1 && this.field_1573 < 32767 && (this.field_1573 == 0 || Class108.field_1221[this.field_1573] != null)) {
               switch (this.field_1092) {
                  case 0:
                     this.method_122();
                     this.field_1645 = 0;
                     break;
                  case 1:
                  case 2:
                  case 3:
                     this.field_1645++;
                     break;
                  case 4:
                     this.method_1096();
                     this.field_1645 = 0;
               }
            }
            break;
         case 2:
            if (this.field_1092 == 2 || this.field_707 > -1 && this.field_707 < 32767 && (this.field_707 == 0 || Class108.field_1221[this.field_707] != null)) {
               switch (this.field_1092) {
                  case 1:
                     this.method_648();
                     this.field_1645 = 0;
                     break;
                  case 2:
                     this.method_767();
                     this.field_1645 = 0;
                     break;
                  case 3:
                     this.method_433();
                     this.field_1645 = 0;
               }
            }
      }
   }

   public boolean method_1457(int var1) {
      if (!Class310.field_1164) {
         return false;
      }

      boolean var2 = false;
      if (this.field_1645 == 0) {
         if (var1 == 209) {
            this.field_1092 = (this.field_1092 + 1) % this.field_1589.length;
            var2 = true;
         } else if (var1 == 201) {
            this.field_1092--;
            if (this.field_1092 < 0) {
               this.field_1092 = this.field_1589.length - 1;
            }

            var2 = true;
         }
      }

      if (var1 >= 2 && var1 <= 11) {
         if (this.field_1645 >= 1) {
            switch (this.field_1645) {
               case 1:
                  this.field_1573 *= 10;
                  this.field_1573 += (var1 - 2 + 1) % 10;
                  break;
               case 2:
                  this.field_707 *= 10;
                  this.field_707 += (var1 - 2 + 1) % 10;
            }

            var2 = true;
         }
      } else if (var1 == 14 && this.field_1645 >= 1) {
         switch (this.field_1645) {
            case 1:
               this.field_1573 /= 10;
               break;
            case 2:
               this.field_707 /= 10;
         }

         var2 = true;
      }

      if (var1 == 199) {
         this.method_1358();
         var2 = true;
      } else if (var1 == 207) {
         this.field_1645 = 0;
         var2 = true;
      }

      if (var2) {
         this.field_3042 = System.currentTimeMillis();
      }

      return var2;
   }

   public void method_409() {
      if (Class119.field_1519.field_864 != null && Class119.field_1519.field_864.field_1786 == 0) {
         this.field_2841 = true;
         this.field_1620 = Class119.field_1519.field_864.field_1129;
         this.field_1484 = Class119.field_1519.field_864.field_1756;
         this.field_548 = Class119.field_1519.field_864.field_513;
         Class119.field_1519.field_964.method_967("Position 1 set to " + this.field_1620 + "," + this.field_1484 + "," + this.field_548);
      }
   }

   public void method_849() {
      if (Class119.field_1519.field_864 != null && Class119.field_1519.field_864.field_1786 == 0) {
         this.field_1206 = true;
         this.field_1636 = Class119.field_1519.field_864.field_1129;
         this.field_2575 = Class119.field_1519.field_864.field_1756;
         this.field_1836 = Class119.field_1519.field_864.field_513;
         Class119.field_1519.field_964.method_967("Position 2 set to " + this.field_1636 + "," + this.field_2575 + "," + this.field_1836);
      }
   }

   public void method_1057(Class273 var1, int var2, int var3) {
      if (System.currentTimeMillis() - this.field_3042 <= 5000L || this.field_1645 != 0) {
         Class640 var4 = this.field_1383.field_1541;
         int var5 = 5;
         int var6 = var3 / 4 + 22 - this.field_1092 * 10;
         if (this.field_1645 == 0) {
            Class254.method_421(5, var3 / 4, 70, var3 / 4 + 60, -1609560048, -803200992);
            int var7 = 0;

            for (String var11 : this.field_1589) {
               Class254.method_773(var4, var11, 17, var6 + 10 * var7, -1);
               var7++;
            }

            Class254.method_773(var4, ">", 7, var3 / 4 + 22, 16777215);
         } else {
            Class254.method_421(var5, var3 / 4 + 20, var5 + 65, var3 / 4 + 40, -1609560048, -803200992);
            Class254.method_773(var4, this.field_1589[this.field_1092], 7, var3 / 4 + 30, 16777215);
         }

         var5 += 68;
         if (this.field_1645 >= 1) {
            if (this.field_1645 == 1 && (this.field_1092 == 2 || this.field_1092 == 3)) {
               Class254.method_773(var4, "5: z-", var5 + 7, var3 / 4 + 10, 16777215);
               Class254.method_773(var4, "4: z+", var5 + 7, var3 / 4, 16777215);
               Class254.method_773(var4, "3: x-", var5 + 7, var3 / 4 - 10, 16777215);
               Class254.method_773(var4, "2: x+", var5 + 7, var3 / 4 - 20, 16777215);
               Class254.method_773(var4, "1: down", var5 + 7, var3 / 4 - 30, 16777215);
               Class254.method_773(var4, "0: up", var5 + 7, var3 / 4 - 40, 16777215);
            }

            Class254.method_421(var5, var3 / 4 + 20, var5 + 65, var3 / 4 + 40, -1609560048, -803200992);
            Class254.method_773(var4, (this.field_1645 == 1 ? ">" : "") + this.field_1573, var5 + 7, var3 / 4 + 30, 16777215);
         }

         var5 += 68;
         if (this.field_1645 >= 2) {
            Class254.method_421(var5, var3 / 4 + 20, var5 + 65, var3 / 4 + 40, -1609560048, -803200992);
            Class254.method_773(var4, (this.field_1645 == 2 ? ">" : "") + this.field_707, var5 + 7, var3 / 4 + 30, 16777215);
         }
      }
   }
}
