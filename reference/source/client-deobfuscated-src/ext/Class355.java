package ext;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public abstract class Class355 extends Class265 {
   private static Class627 field_2156 = new Class627();
   protected int field_2320 = 176;
   protected int field_2029 = 166;
   protected List<Class719> field_2443 = new ArrayList<>();

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      GL11.glEnable(3042);
      int var4 = (this.field_2345 - this.field_2320) / 2;
      int var5 = (this.field_562 - this.field_2029) / 2;
      this.method_542(var3);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      Class584.method_331();
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef(var4, var5, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(32826);
      boolean var6 = false;
      String var7 = "";
      String var8 = "";
      int var9 = 0;
      int var10 = 0;

      for (int var11 = 0; var11 < this.field_2443.size(); var11++) {
         Class719 var12 = this.field_2443.get(var11);
         this.method_1157(var12);
         if (var12.method_1556(var1, var2)) {
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            int var13 = var12.field_130;
            int var14 = var12.field_1798;
            method_421(var13, var14, var13 + 16, var14 + 16, -2130706433, -2130706433);
            Class334 var15 = var12.method_1221();
            if (var15 != null) {
               String var16 = "";
               if (var15.field_1782 < 32767) {
                  var16 = Class108.field_1221[var15.field_1782].field_310;
               } else {
                  var16 = var15.method_801().method_1680();
               }

               if (var16 != "") {
                  var6 = true;
                  var7 = var16;
                  var9 = var13 + 16;
                  var10 = var14;
               }
            }

            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }
      }

      Class267 var17 = this.field_3013.field_2787.field_559;
      if (var17.field_1377 != null) {
         GL11.glTranslatef(0.0F, 0.0F, 32.0F);
         field_2156.method_1104(this.field_1683, this.field_3013.field_2176, var17.field_1377, var1 - var4 - 8, var2 - var5 - 8);
         field_2156.method_1758(this.field_1683, this.field_3013.field_2176, var17.field_1377, var1 - var4 - 8, var2 - var5 - 8);
      }

      GL11.glDisable(32826);
      Class584.method_62();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      this.method_98();
      if (var6) {
         int var18 = this.field_3013.field_1541.method_962(var7);
         Class254.method_421(var9, var10, var9 + var18 + 8, var10 + 16, -16777216, 536870912);
         Class254.method_421(var9, var10, var9 + var18 + 8, var10 + 1, -6168065, -3149569);
         Class254.method_421(var9, var10, var9 + var18 + 8, var10 + 16, 547480063, 536870912);
         this.field_3013.field_1541.method_1444(var7, var9 + 4, var10 + 3, -1);
      }

      GL11.glPopMatrix();
      super.method_1938(var1, var2, var3);
      GL11.glEnable(2896);
      GL11.glEnable(2929);
   }

   protected void method_98() {
   }

   protected abstract void method_542(float var1);

   private void method_1157(Class719 var1) {
      Interface181 var2 = var1.field_2374;
      int var3 = var1.field_957;
      int var4 = var1.field_130;
      int var5 = var1.field_1798;
      Class334 var6 = var2.method_1416(var3);
      if (var6 == null) {
         int var7 = var1.method_149();
         if (var7 >= 0) {
            GL11.glDisable(2896);
            this.field_3013.field_2176.method_462(this.field_3013.field_2176.method_1545("/gui/items.png"));
            this.method_1219(var4, var5, var7 % 16 * 16, var7 / 16 * 16, 16, 16);
            GL11.glEnable(2896);
            return;
         }
      }

      field_2156.method_1104(this.field_1683, this.field_3013.field_2176, var6, var4, var5);
      field_2156.method_1758(this.field_1683, this.field_3013.field_2176, var6, var4, var5);
   }

   private Class540 method_675(int var1, int var2) {
      for (int var3 = 0; var3 < this.field_2443.size(); var3++) {
         Class719 var4 = this.field_2443.get(var3);
         if (var4.method_1556(var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   @Override
   protected void method_316(int var1, int var2, int var3) {
      super.method_316(var1, var2, var3);
      if (var3 == 0 || var3 == 1) {
         Class540 var4 = this.method_675(var1, var2);
         Class267 var5 = this.field_3013.field_2787.field_559;
         if (var4 != null) {
            Class334 var7 = var4.method_1221();
            if (var7 != null || var5.field_1377 != null) {
               if (var7 != null && var5.field_1377 == null) {
                  int var12 = var3 == 0 ? var7.field_2326 : (var7.field_2326 + 1) / 2;
                  var5.field_1377 = var4.field_2374.method_485(var4.field_957, var12);
                  if (var7.field_2326 == 0) {
                     var4.method_852((Class334)null);
                  }

                  var4.method_1275();
               } else if (var7 == null && var5.field_1377 != null && var4.method_324(var5.field_1377)) {
                  int var11 = var3 == 0 ? var5.field_1377.field_2326 : 1;
                  if (var11 > var4.field_2374.method_1387()) {
                     var11 = var4.field_2374.method_1387();
                  }

                  var4.method_852(var5.field_1377.method_1502(var11));
                  if (var5.field_1377.field_2326 == 0) {
                     var5.field_1377 = null;
                  }
               } else if (var7 != null && var5.field_1377 != null) {
                  if (var4.method_324(var5.field_1377)) {
                     if (var7.field_1782 != var5.field_1377.field_1782) {
                        if (var5.field_1377.field_2326 <= var4.field_2374.method_1387()) {
                           var4.method_852(var5.field_1377);
                           var5.field_1377 = var7;
                           var4.method_456();
                        }
                     } else if (var7.field_1782 == var5.field_1377.field_1782) {
                        if (var3 == 0) {
                           int var6 = var5.field_1377.field_2326;
                           if (var6 > var4.field_2374.method_1387() - var7.field_2326) {
                              var6 = var4.field_2374.method_1387() - var7.field_2326;
                           }

                           if (var6 > var5.field_1377.method_930() - var7.field_2326) {
                              var6 = var5.field_1377.method_930() - var7.field_2326;
                           }

                           var5.field_1377.method_1502(var6);
                           if (var5.field_1377.field_2326 == 0) {
                              var5.field_1377 = null;
                           }

                           var7.field_2326 += var6;
                           var4.method_456();
                        } else if (var3 == 1) {
                           int var9 = 1;
                           if (var9 > var4.field_2374.method_1387() - var7.field_2326) {
                              var9 = var4.field_2374.method_1387() - var7.field_2326;
                           }

                           if (var9 > var5.field_1377.method_930() - var7.field_2326) {
                              var9 = var5.field_1377.method_930() - var7.field_2326;
                           }

                           var5.field_1377.method_1502(var9);
                           if (var5.field_1377.field_2326 == 0) {
                              var5.field_1377 = null;
                           }

                           var7.field_2326 += var9;
                           var4.method_456();
                        }
                     }
                  } else if (var7.field_1782 == var5.field_1377.field_1782 && var5.field_1377.method_930() > 1) {
                     int var10 = var7.field_2326;
                     if (var10 > 0 && var10 + var5.field_1377.field_2326 <= var5.field_1377.method_930()) {
                        var5.field_1377.field_2326 += var10;
                        var7.method_1502(var10);
                        if (var7.field_2326 == 0) {
                           var4.method_852((Class334)null);
                        }

                        var4.method_1275();
                     }
                  }
               }
            }

            var4.method_456();
         } else if (var5.field_1377 != null) {
            int var14 = (this.field_2345 - this.field_2320) / 2;
            int var13 = (this.field_562 - this.field_2029) / 2;
            if (var1 < var14 || var2 < var13 || var1 >= var14 + this.field_2320 || var2 >= var13 + this.field_2320) {
               Class563 var8 = this.field_3013.field_2787;
               if (var3 == 0) {
                  var8.method_1771(var5.field_1377);
                  var5.field_1377 = null;
               }

               if (var3 == 1) {
                  var8.method_1771(var5.field_1377.method_1502(1));
                  if (var5.field_1377.field_2326 == 0) {
                     var5.field_1377 = null;
                  }
               }
            }
         }
      }
   }

   @Override
   protected void method_1269(int var1, int var2, int var3) {
      super.method_1269(var1, var2, var3);
      if (var3 == 0) {
      }
   }

   @Override
   protected void method_437(char var1, int var2) {
      if (var2 == 1 || var2 == this.field_3013.field_1754.field_1301.field_2381) {
         this.field_3013.method_1290((Class265)null);
      }
   }

   @Override
   public void method_796() {
      Class267 var1 = this.field_3013.field_2787.field_559;
      if (var1.field_1377 != null) {
         this.field_3013.field_2787.method_1771(var1.field_1377);
         var1.field_1377 = null;
      }
   }

   @Override
   public boolean method_1440() {
      return false;
   }
}
