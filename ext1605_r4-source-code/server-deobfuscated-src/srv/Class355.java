package srv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Class355 {
   private List field_248;
   private int field_749;
   private int field_217;
   private Class338 field_166;
   private short[] field_970;
   private int field_699;
   private int field_174;
   private int field_893;
   private int field_1587;
   private int field_723;
   private int field_184;
   private int field_426;
   final Class160 field_402;

   public Class355(Class160 var1, int var2, int var3) {
      this.field_402 = var1;
      this.field_248 = new ArrayList();
      this.field_970 = new short[10];
      this.field_699 = 0;
      this.field_749 = var2;
      this.field_217 = var3;
      this.field_166 = new Class338(var2, var3);
      Class160.method_196(var1).field_445.field_326.method_783(var2, var3);
   }

   public void method_267(Class188 var1) {
      if (this.field_248.contains(var1)) {
         throw new IllegalStateException("Failed to add player. " + var1 + " already is in chunk " + this.field_749 + ", " + this.field_217);
      }

      var1.field_336.add(this.field_166);
      float[] var2 = new float[1536];

      for (Class49.Inner296 var6 : Class49.Inner296.method_158()) {
         for (int var7 = 0; var7 < 16; var7++) {
            int var8 = Class322.method_1010(this.field_166.field_572) + var7;

            for (int var9 = 0; var9 < 16; var9++) {
               int var10 = Class322.method_1010(this.field_166.field_1174) + var9;
               Interface210 var11 = var1.field_796.method_642();
               int var12 = var6.ordinal() * 16 * 16 * 2 + var9 * 16 * 2 + var7 * 2;
               var2[var12] = (float)var11.method_372(var8, var10, var6);
               var2[var12 + 1] = (float)var11.method_64(var8, var10, var6);
            }
         }
      }

      var1.field_1439.method_571(new Class178(this.field_166.field_572, this.field_166.field_1174, var2));
      this.field_248.add(var1);
      var1.field_1490.add(this.field_166);
   }

   public void method_860(Class188 var1) {
      if (!this.field_248.contains(var1)) {
         new IllegalStateException("Failed to remove player. " + var1 + " isn't in chunk " + this.field_749 + ", " + this.field_217).printStackTrace();
      } else {
         this.field_248.remove(var1);
         if (this.field_248.size() == 0) {
            long var2 = this.field_749 + 2147483647L | this.field_217 + 2147483647L << 32;
            Class160.method_80(this.field_402).method_69(var2);
            if (this.field_699 > 0) {
               Class160.method_97(this.field_402).remove(this);
            }

            Class160.method_196(this.field_402).field_445.field_326.method_412(this.field_749, this.field_217);
         }

         var1.field_1490.remove(this.field_166);
         if (var1.field_336.contains(this.field_166)) {
            var1.field_1439.method_571(new Class178(this.field_749, this.field_217, new float[0]));
         }
      }
   }

   public void method_651(int var1, int var2, int var3) {
      if (this.field_699 == 0) {
         Class160.method_97(this.field_402).add(this);
         this.field_174 = this.field_893 = var1;
         this.field_1587 = this.field_723 = var2;
         this.field_184 = this.field_426 = var3;
      }

      if (this.field_174 > var1) {
         this.field_174 = var1;
      }

      if (this.field_893 < var1) {
         this.field_893 = var1;
      }

      if (this.field_1587 > var2) {
         this.field_1587 = var2;
      }

      if (this.field_723 < var2) {
         this.field_723 = var2;
      }

      if (this.field_184 > var3) {
         this.field_184 = var3;
      }

      if (this.field_426 < var3) {
         this.field_426 = var3;
      }

      if (this.field_699 < 10) {
         short var4 = (short)(var1 << 12 | var3 << 8 | var2);

         for (int var5 = 0; var5 < this.field_699; var5++) {
            if (this.field_970[var5] == var4) {
               return;
            }
         }

         this.field_970[this.field_699++] = var4;
      }
   }

   public void method_936(Class318 var1) {
      for (int var2 = 0; var2 < this.field_248.size(); var2++) {
         Class188 var3 = (Class188)this.field_248.get(var2);
         if (var3.field_336.contains(this.field_166)) {
            var3.field_1439.method_571(var1);
         }
      }
   }

   public void method_91() throws IOException {
      if (this.field_699 != 0) {
         if (this.field_699 == 1) {
            int var11 = this.field_749 * 16 + this.field_174;
            int var13 = this.field_1587;
            int var15 = this.field_217 * 16 + this.field_184;
            this.method_936(new Class352(var11, var13, var15, Class160.method_196(this.field_402).field_445));
            if (Class371.field_1478[Class160.method_196(this.field_402).field_445.method_813(var11, var13, var15)]) {
               this.method_936(new Class381(var11, var13, var15, Class160.method_196(this.field_402).field_445.method_49(var11, var13, var15)));
            }
         } else if (this.field_699 == 10) {
            this.field_1587 = this.field_1587 / 2 * 2;
            this.field_723 = (this.field_723 / 2 + 1) * 2;
            int var10 = this.field_174 + this.field_749 * 16;
            int var12 = this.field_1587;
            int var14 = this.field_184 + this.field_217 * 16;
            int var16 = this.field_893 - this.field_174 + 1;
            int var5 = this.field_723 - this.field_1587 + 2;
            int var6 = this.field_426 - this.field_184 + 1;
            this.method_936(new Class38(var10, var12, var14, var16, var5, var6, Class160.method_196(this.field_402).field_445));
            List var7 = Class160.method_196(this.field_402).field_445.method_84(var10, var12, var14, var10 + var16, var12 + var5, var14 + var6);

            for (int var8 = 0; var8 < var7.size(); var8++) {
               Class66 var9 = (Class66)var7.get(var8);
               this.method_936(new Class381(var9.field_720, var9.field_1400, var9.field_454, var9));
            }
         } else {
            this.method_936(new Class162(this.field_749, this.field_217, this.field_970, this.field_699, Class160.method_196(this.field_402).field_445));

            for (int var1 = 0; var1 < this.field_699; var1++) {
               int var2 = this.field_749 * 16 + (this.field_699 >> 12 & 15);
               int var3 = this.field_699 & 0xFF;
               int var4 = this.field_217 * 16 + (this.field_699 >> 8 & 15);
               if (Class371.field_1478[Class160.method_196(this.field_402).field_445.method_813(var2, var3, var4)]) {
                  this.method_936(new Class381(var2, var3, var4, Class160.method_196(this.field_402).field_445.method_49(var2, var3, var4)));
               }
            }
         }

         this.field_699 = 0;
      }
   }
}
