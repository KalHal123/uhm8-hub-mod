package ext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class Class599 {
   public Class454 field_2609;
   private int field_2282 = -1;
   private static Class368 field_1117 = Class368.field_2696;
   public static int field_659 = 0;
   public int field_916;
   public int field_2601;
   public int field_1498;
   public int field_1592;
   public int field_2622;
   public int field_670;
   public int field_1515;
   public int field_3082;
   public int field_1372;
   public int field_899;
   public int field_2007;
   public int field_2024;
   public boolean field_1913 = false;
   public boolean[] field_1318 = new boolean[2];
   public int field_694;
   public int field_1022;
   public int field_871;
   public float field_1739;
   public boolean field_154;
   public Class630 field_324;
   public int field_906;
   public boolean field_1623 = true;
   public boolean field_539;
   public int field_950;
   public boolean field_1229;
   private boolean field_2589 = false;
   public List<Class186> field_2721 = new ArrayList<>();
   private List<Class186> field_2946;

   public Class599(Class454 var1, List<Class186> var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_2609 = var1;
      this.field_2946 = var2;
      this.field_1592 = this.field_2622 = this.field_670 = var6;
      this.field_1739 = Class469.method_254(this.field_1592 * this.field_1592 + this.field_2622 * this.field_2622 + this.field_670 * this.field_670) / 2.0F;
      this.field_2282 = var7;
      this.field_916 = -999;
      this.method_702(var3, var4, var5);
      this.field_154 = false;
   }

   public void method_702(int var1, int var2, int var3) {
      if (var1 != this.field_916 || var2 != this.field_2601 || var3 != this.field_1498) {
         this.method_282();
         this.field_916 = var1;
         this.field_2601 = var2;
         this.field_1498 = var3;
         this.field_694 = var1 + this.field_1592 / 2;
         this.field_1022 = var2 + this.field_2622 / 2;
         this.field_871 = var3 + this.field_670 / 2;
         this.field_899 = var1 & 1023;
         this.field_2007 = var2;
         this.field_2024 = var3 & 1023;
         this.field_1515 = var1 - this.field_899;
         this.field_3082 = var2 - this.field_2007;
         this.field_1372 = var3 - this.field_2024;
         float var4 = 2.0F;
         this.field_324 = Class630.method_769(
            var1 - var4, var2 - var4, var3 - var4, var1 + this.field_1592 + var4, var2 + this.field_2622 + var4, var3 + this.field_670 + var4
         );
         GL11.glNewList(this.field_2282 + 2, 4864);
         Class627.method_1634(
            Class630.method_969(
               this.field_899 - var4,
               this.field_2007 - var4,
               this.field_2024 - var4,
               this.field_899 + this.field_1592 + var4,
               this.field_2007 + this.field_2622 + var4,
               this.field_2024 + this.field_670 + var4
            )
         );
         GL11.glEndList();
         this.method_1119();
      }
   }

   private void method_1542() {
      GL11.glTranslatef(this.field_899, this.field_2007, this.field_2024);
   }

   public void method_1386() {
      if (this.field_154) {
         field_659++;
         int var1 = this.field_916;
         int var2 = this.field_2601;
         int var3 = this.field_1498;
         int var4 = this.field_916 + this.field_1592;
         int var5 = this.field_2601 + this.field_2622;
         int var6 = this.field_1498 + this.field_670;

         for (int var7 = 0; var7 < 2; var7++) {
            this.field_1318[var7] = true;
         }

         Class741.field_1448 = false;
         HashSet var21 = new HashSet();
         var21.addAll(this.field_2721);
         this.field_2721.clear();
         byte var8 = 1;
         Class370 var9 = new Class370(this.field_2609, var1 - var8, var2 - var8, var3 - var8, var4 + var8, var5 + var8, var6 + var8);
         Class714 var10 = new Class714(var9);

         for (int var11 = 0; var11 < 2; var11++) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;

            for (int var15 = var2; var15 < var5; var15++) {
               for (int var16 = var3; var16 < var6; var16++) {
                  for (int var17 = var1; var17 < var4; var17++) {
                     int var18 = var9.method_197(var17, var15, var16);
                     if (var18 > 0) {
                        if (!var14) {
                           var14 = true;
                           GL11.glNewList(this.field_2282 + var11, 4864);
                           GL11.glPushMatrix();
                           this.method_1542();
                           float var19 = 1.000001F;
                           GL11.glTranslatef(-this.field_670 / 2.0F, -this.field_2622 / 2.0F, -this.field_670 / 2.0F);
                           GL11.glScalef(var19, var19, var19);
                           GL11.glTranslatef(this.field_670 / 2.0F, this.field_2622 / 2.0F, this.field_670 / 2.0F);
                           field_1117.method_1284(false);
                           field_1117.method_387(-this.field_916, -this.field_2601, -this.field_1498);
                        }

                        if (var11 == 0 && Class108.field_1953[var18]) {
                           Class186 var23 = var9.method_1303(var17, var15, var16);
                           if (Class402.field_1178.method_975(var23)) {
                              this.field_2721.add(var23);
                           }
                        }

                        if (Class108.field_1221[var18] == null) {
                           Class597.method_883("NULL BLOCK ID " + var18);
                        } else {
                           Class108 var24 = Class108.field_1221[var18];
                           int var20 = var24.method_287();
                           if (var20 != var11) {
                              var12 = true;
                           } else if (var20 == var11) {
                              var13 |= var10.method_617(var24, var17, var15, var16);
                           }
                        }
                     }
                  }
               }
            }

            if (var14) {
               field_1117.method_406();
               GL11.glPopMatrix();
               GL11.glEndList();
               field_1117.method_387(0.0, 0.0, 0.0);
            } else {
               var13 = false;
            }

            if (var13) {
               this.field_1318[var11] = false;
            }

            if (!var12) {
               break;
            }
         }

         HashSet var22 = new HashSet();
         var22.addAll(this.field_2721);
         var22.removeAll(var21);
         this.field_2946.addAll(var22);
         var21.removeAll(this.field_2721);
         this.field_2946.removeAll(var21);
         this.field_1229 = Class741.field_1448;
         this.field_2589 = true;
      }
   }

   public float method_1563(Class359 var1) {
      float var2 = (float)(var1.field_1417 - this.field_694);
      float var3 = (float)(var1.field_2654 - this.field_1022);
      float var4 = (float)(var1.field_2013 - this.field_871);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public void method_282() {
      for (int var1 = 0; var1 < 2; var1++) {
         this.field_1318[var1] = true;
      }

      this.field_1913 = false;
      this.field_2589 = false;
   }

   public void method_970() {
      this.method_282();
      this.field_2609 = null;
   }

   public int method_647(int var1) {
      return !this.field_1913 ? -1 : (!this.field_1318[var1] ? this.field_2282 + var1 : -1);
   }

   public void method_741(Interface215 var1) {
      this.field_1913 = var1.method_570(this.field_324);
   }

   public void method_464() {
      GL11.glCallList(this.field_2282 + 2);
   }

   public boolean method_585() {
      return !this.field_2589 ? false : this.field_1318[0] && this.field_1318[1];
   }

   public void method_1119() {
      this.field_154 = true;
   }
}
