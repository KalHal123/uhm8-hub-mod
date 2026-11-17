package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class712 extends Class265 {
   public Minecraft field_1208;
   private Class714 field_1559 = new Class714();
   private boolean field_281 = true;
   private int field_3020 = -1;
   private int field_3083 = -1;
   private int field_145 = -1;
   private long field_1166 = -1L;
   private boolean field_2904 = true;
   private boolean field_796 = false;
   private int field_1861 = 0;

   public Class712(Minecraft var1) {
      this.field_1208 = var1;
   }

   public void method_1820(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
      Class368 var8 = Class368.field_2696;
      float var9 = 0.00390625F;
      float var10 = 1.0F / var7;
      var8.method_1284(true);
      var8.method_318(var1 + 0, var2 + var6, 0.0, (var3 + 0) * var9, (var4 + var6) * var10);
      var8.method_318(var1 + var5, var2 + var6, 0.0, (var3 + var5) * var9, (var4 + var6) * var10);
      var8.method_318(var1 + var5, var2 + 0, 0.0, (var3 + var5) * var9, (var4 + 0) * var10);
      var8.method_318(var1 + 0, var2 + 0, 0.0, (var3 + 0) * var9, (var4 + 0) * var10);
      var8.method_548(0.0F, 1.0F, 0.0F);
      var8.method_406();
   }

   public void method_844(Class108 var1) {
      GL11.glBindTexture(3553, this.field_1208.field_2176.method_1545(Minecraft.field_1094));
      int var2 = var1.field_2972;
      this.method_1820(0, 0, var2 % 16 * 16, var2 / 16 * 16, 16, 16, 512.0F);
   }

   public void method_102(Class755 var1) {
      GL11.glBindTexture(3553, this.field_1208.field_2176.method_1545("/gui/items.png"));
      int var2 = var1.field_853;
      this.method_1820(0, 0, var2 % 16 * 16, var2 / 16 * 16, 16, 16, 256.0F);
   }

   public int method_798(int var1) {
      int var2 = 0;

      for (int var3 = 1; var3 != 32767; var3++) {
         if (Class108.field_1221[var3] != null && var3 != 120) {
            var2++;
         }

         if (var2 == var1 + 1) {
            return var3;
         }
      }

      return -1;
   }

   public int method_1727() {
      int var1 = 0;

      for (int var2 = 1; var2 != 32767; var2++) {
         if (Class108.field_1221[var2] != null && var2 != 120) {
            var1++;
         }
      }

      return var1;
   }

   public int method_168(int var1) {
      int var2 = 0;

      for (int var3 = 32767; var3 != Class755.field_2576.length; var3++) {
         if (Class755.field_2576[var3] != null) {
            var2++;
         }

         if (var2 == var1 + 1) {
            return var3;
         }
      }

      return -1;
   }

   public int method_1828() {
      int var1 = 0;

      for (int var2 = 32767; var2 != Class755.field_2576.length; var2++) {
         if (Class755.field_2576[var2] != null) {
            var1++;
         }
      }

      return var1;
   }

   @Override
   public boolean method_1440() {
      return false;
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143) {
         if (var1.field_2254 == 2) {
            this.field_796 = true;
            this.field_2904 = true;
         } else if (var1.field_2254 == 3) {
            this.field_796 = true;
            this.field_2904 = false;
         } else if (var1.field_2254 == 4) {
            this.field_1861 = this.field_1861 == 0 ? this.field_145 - 1 : --this.field_1861;
            this.field_796 = true;
         } else if (var1.field_2254 == 5) {
            this.field_1861++;
            this.field_1861 = this.field_1861 % this.field_145;
            this.field_796 = true;
         }

         Class334 var2 = null;
         if (var1.field_2254 >= 4096) {
            var2 = new Class334(Class755.field_2576[var1.field_2254 - 4096], 1);
         } else if (var1.field_2254 >= 2048) {
            var2 = new Class334(Class108.field_1221[var1.field_2254 - 2048], 64);
         }

         if (var2 != null) {
            if (Class119.field_1477) {
               this.field_1208.field_2787.field_559.method_572(var2);
            } else {
               this.field_1208.field_2787.method_1307(var2, true);
            }
         }
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      if (this.field_1166 == -1L) {
         this.field_1166 = System.currentTimeMillis();
      }

      float var4 = Math.min((float)(System.currentTimeMillis() - this.field_1166) / 100.0F, 1.0F);
      method_421(0, (int)(this.field_562 * (1.0F - var4)), this.field_2345, this.field_562, 1614823488, 1612718112);
      this.method_1491(this.field_1683, "Palette", this.field_2345 / 2, 15, 16777215);
      this.method_1491(this.field_1683, "" + this.field_1861, 208, 35, 16777215);
      GL11.glBindTexture(3553, this.field_1208.field_2176.method_1545(Minecraft.field_1094));
      int var5 = (this.field_2345 - 18) / 32;
      int var6 = (this.field_562 - 50) / 23;
      if (var5 != 0 && var6 != 0) {
         int var7 = (this.field_2904 ? this.method_1727() : this.method_1828()) / (var5 * var6) + 1;
         if (this.field_3020 != var5 || this.field_3083 != var6 || this.field_796) {
            this.field_145 = var7;
            this.field_3020 = var5;
            this.field_3083 = var6;

            while (var7 <= this.field_1861) {
               this.field_1861--;
            }

            this.field_577.clear();
            this.field_281 = true;
            this.field_796 = false;
         }

         if (this.field_281) {
            this.field_577.add(new Class279(2, 18, 30, "Blocks"));
            this.field_577.add(new Class279(3, 68, 30, "Items"));
            this.field_577.add(new Class279(4, 148, 30, "<<"));
            this.field_577.add(new Class279(5, 218, 30, ">>"));
            this.field_577.get(this.field_2904 ? 0 : 1).field_143 = false;
            this.field_577.get(3).field_143 = var7 != 1;
            this.field_577.get(2).field_143 = this.field_577.get(3).field_143;
         }

         int var8 = this.field_1861 * var5 * var6;

         for (int var9 = 0; var9 != var5 * var6; var9++) {
            if (this.field_2904) {
               int var12 = this.method_798(var8 + var9);
               if (var12 == -1) {
                  break;
               }

               Class108 var11 = Class108.field_1221[var12];
               boolean var13 = Class714.method_759(var11.method_1900()) || var11.method_1900() == 1 || var11.method_1900() == 2 || var11.method_1900() == 14;
               float var10 = 18.0F + 32.0F * (var9 % var5);
               float var14 = 50.0F + 23.0F * (var9 / var5);
               if (this.field_281) {
                  this.field_577.add(new Class85(2048 + var12, (int)var10, (int)var14, "", var12, this));
               }

               GL11.glPushMatrix();
               if (var13) {
                  GL11.glTranslatef(var10 + 14.0F, var14 + 8.0F, 16.0F);
                  GL11.glScalef(16.0F, 16.0F, 16.0F);
                  GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
                  GL11.glRotatef(30.0F, -1.0F, -1.0F, 0.0F);
                  float var15 = (float)(System.currentTimeMillis() - this.field_1166) / 13000.0F * 360.0F;
                  GL11.glRotatef(var15, 0.0F, -1.0F, 0.0F);
                  this.field_1559.method_234(var11);
               } else {
                  GL11.glTranslatef(var10 + 5.0F, var14, 13.0F);
                  this.method_844(var11);
               }

               GL11.glPopMatrix();
            } else {
               int var18 = this.method_168(var8 + var9);
               if (var18 == -1) {
                  break;
               }

               Class755 var17 = Class755.field_2576[var18];
               float var19 = 18.0F + 32.0F * (var9 % var5);
               float var16 = 50.0F + 23.0F * (var9 / var5);
               if (this.field_281) {
                  this.field_577.add(new Class85(4096 + var18, (int)var19, (int)var16, "", var18, this));
               }

               GL11.glPushMatrix();
               GL11.glTranslatef(var19 + 5.0F, var16, 13.0F);
               this.method_102(var17);
               GL11.glPopMatrix();
            }
         }

         this.field_281 = false;
         super.method_1938(var1, var2, var3);
      }
   }
}
