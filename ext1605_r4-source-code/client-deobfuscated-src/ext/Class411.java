package ext;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class Class411 implements Interface134 {
   public List<Class186> field_1954 = new ArrayList<>();
   private Class454 field_977;
   public Class432 field_860;
   private List<Class599> field_1401 = Collections.synchronizedList(new ArrayList<>());
   private Class599[] field_2212;
   private Class599[] field_1710;
   private int field_2466;
   private int field_1223;
   private int field_1137;
   private int field_514;
   private Minecraft field_1016;
   private Class714 field_1921;
   private IntBuffer field_1823;
   private boolean field_470 = false;
   private int field_328 = 0;
   private int field_2978;
   private int field_581;
   private int field_608;
   private int field_2633;
   private int field_1893;
   private int field_2532;
   private int field_353;
   private int field_2106;
   private int field_1218;
   private int field_2769 = -1;
   private int field_716 = 2;
   private int field_182;
   private int field_903;
   private int field_1897;
   int[] field_1308 = new int[50000];
   IntBuffer field_2755 = Class504.method_323(64);
   private int field_1633;
   private int field_2995;
   private int field_2680;
   private int field_605;
   private int field_307;
   private List<Class599> field_2837 = new ArrayList<>();
   private Class170[] field_78 = new Class170[]{new Class170(), new Class170(), new Class170(), new Class170()};
   int field_2677 = 0;
   int field_1216 = Class504.method_225(1);
   double field_1957 = -9999.0;
   double field_279 = -9999.0;
   double field_2248 = -9999.0;
   public float field_1014;
   int field_2842 = 0;

   public Class411(Minecraft var1, Class432 var2) {
      this.field_1016 = var1;
      this.field_860 = var2;
      byte var3 = 64;
      this.field_514 = Class504.method_225(var3 * var3 * var3 * 3);
      this.field_470 = var1.method_1485().method_450();
      if (this.field_470) {
         ((Buffer)this.field_2755).clear();
         this.field_1823 = Class504.method_323(var3 * var3 * var3);
         ((Buffer)this.field_1823).clear();
         ((Buffer)this.field_1823).position(0);
         ((Buffer)this.field_1823).limit(var3 * var3 * var3);
         ARBOcclusionQuery.glGenQueriesARB(this.field_1823);
      }

      this.field_2978 = Class504.method_225(3);
      GL11.glPushMatrix();
      GL11.glNewList(this.field_2978, 4864);
      this.method_445();
      GL11.glEndList();
      GL11.glPopMatrix();
      Class368 var4 = Class368.field_2696;
      this.field_581 = this.field_2978 + 1;
      GL11.glNewList(this.field_581, 4864);
      byte var5 = 64;
      int var6 = 256 / var5 + 2;
      float var7 = 16.0F;

      for (int var8 = -var5 * var6; var8 <= var5 * var6; var8 += var5) {
         for (int var9 = -var5 * var6; var9 <= var5 * var6; var9 += var5) {
            var4.method_186();
            var4.method_1724(var8 + 0, var7, var9 + 0);
            var4.method_1724(var8 + var5, var7, var9 + 0);
            var4.method_1724(var8 + var5, var7, var9 + var5);
            var4.method_1724(var8 + 0, var7, var9 + var5);
            var4.method_406();
         }
      }

      GL11.glEndList();
      this.field_608 = this.field_2978 + 2;
      GL11.glNewList(this.field_608, 4864);
      var7 = -16.0F;
      var4.method_186();

      for (int var11 = -var5 * var6; var11 <= var5 * var6; var11 += var5) {
         for (int var12 = -var5 * var6; var12 <= var5 * var6; var12 += var5) {
            var4.method_1724(var11 + var5, var7, var12 + 0);
            var4.method_1724(var11 + 0, var7, var12 + 0);
            var4.method_1724(var11 + 0, var7, var12 + var5);
            var4.method_1724(var11 + var5, var7, var12 + var5);
         }
      }

      var4.method_406();
      GL11.glEndList();
   }

   public void method_445() {
      Random var1 = new Random(10842L);
      Class368 var2 = Class368.field_2696;
      var2.method_186();

      for (int var3 = 0; var3 < 1500; var3++) {
         double var4 = var1.nextFloat() * 2.0F - 1.0F;
         double var6 = var1.nextFloat() * 2.0F - 1.0F;
         double var8 = var1.nextFloat() * 2.0F - 1.0F;
         double var10 = 0.25F + var1.nextFloat() * 0.25F;
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if (var12 < 1.0 && var12 > 0.01) {
            var12 = 1.0 / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0;
            double var16 = var6 * 100.0;
            double var18 = var8 * 100.0;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var1.nextDouble() * Math.PI * 2.0;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for (int var38 = 0; var38 < 4; var38++) {
               double var39 = 0.0;
               double var41 = ((var38 & 2) - 1) * var10;
               double var43 = ((var38 + 1 & 2) - 1) * var10;
               double var45 = var41 * var36 - var43 * var34;
               double var47 = var43 * var36 + var41 * var34;
               double var49 = var45 * var28 + var39 * var30;
               double var51 = var39 * var28 - var45 * var30;
               double var53 = var51 * var22 - var47 * var24;
               double var55 = var47 * var22 + var51 * var24;
               var2.method_1724(var14 + var53, var16 + var49, var18 + var55);
            }
         }
      }

      var2.method_406();
   }

   public void method_404(Class454 var1) {
      if (this.field_977 != null) {
         this.field_977.method_378(this);
      }

      this.field_1957 = -9999.0;
      this.field_279 = -9999.0;
      this.field_2248 = -9999.0;
      Class531.field_759.method_151(var1);
      this.field_977 = var1;
      this.field_1921 = new Class714(var1);
      if (var1 != null) {
         var1.method_494(this);
         this.method_934();
      }
   }

   public void method_934() {
      Class108.field_1128.method_1813(this.field_1016.field_1754.field_674 == 1);
      ((Class574)Class390.field_2848).method_1813(this.field_1016.field_1754.field_674 == 1);
      ((Class574)Class390.field_3032).method_1813(this.field_1016.field_1754.field_674 == 1);
      this.field_2769 = this.field_1016.field_1754.field_2733;
      if (this.field_1710 != null) {
         for (int var1 = 0; var1 < this.field_1710.length; var1++) {
            this.field_1710[var1].method_970();
         }
      }

      int var7;
      if (this.field_2769 == 0) {
         var7 = 1024;
      } else {
         var7 = 64 << 3 - Math.min(this.field_2769 - 1, 3);
      }

      if (this.field_2769 == 1) {
         var7 = 400;
      }

      this.field_2466 = var7 / 16 + 1;
      this.field_1223 = 8;
      this.field_1137 = var7 / 16 + 1;
      this.field_1710 = new Class599[this.field_2466 * this.field_1223 * this.field_1137];
      this.field_2212 = new Class599[this.field_2466 * this.field_1223 * this.field_1137];
      byte var2 = 0;
      int var3 = 0;
      this.field_2633 = 0;
      this.field_1893 = 0;
      this.field_2532 = 0;
      this.field_353 = this.field_2466;
      this.field_2106 = this.field_1223;
      this.field_1218 = this.field_1137;

      for (int var4 = 0; var4 < this.field_1401.size(); var4++) {
         this.field_1401.get(var4).field_154 = false;
      }

      this.field_1401.clear();
      this.field_1954.clear();

      for (int var8 = 0; var8 < this.field_2466; var8++) {
         for (int var5 = 0; var5 < this.field_1223; var5++) {
            for (int var6 = 0; var6 < this.field_1137; var6++) {
               this.field_1710[(var6 * this.field_1223 + var5) * this.field_2466 + var8] = new Class599(
                  this.field_977, this.field_1954, var8 * 16, var5 * 16, var6 * 16, 16, this.field_514 + var2
               );
               if (this.field_470) {
                  this.field_1710[(var6 * this.field_1223 + var5) * this.field_2466 + var8].field_950 = this.field_1823.get(var3);
               }

               this.field_1710[(var6 * this.field_1223 + var5) * this.field_2466 + var8].field_539 = false;
               this.field_1710[(var6 * this.field_1223 + var5) * this.field_2466 + var8].field_1623 = true;
               this.field_1710[(var6 * this.field_1223 + var5) * this.field_2466 + var8].field_1913 = true;
               this.field_1710[(var6 * this.field_1223 + var5) * this.field_2466 + var8].field_906 = var3++;
               this.field_1710[(var6 * this.field_1223 + var5) * this.field_2466 + var8].method_1119();
               this.field_2212[(var6 * this.field_1223 + var5) * this.field_2466 + var8] = this.field_1710[(var6 * this.field_1223 + var5) * this.field_2466
                  + var8];
               this.field_1401.add(this.field_1710[(var6 * this.field_1223 + var5) * this.field_2466 + var8]);
               var2 += 3;
            }
         }
      }

      if (this.field_977 != null) {
         Class563 var9 = this.field_1016.field_2787;
         this.method_1247(Class469.method_468(var9.field_1417), Class469.method_468(var9.field_2654), Class469.method_468(var9.field_2013));
         Arrays.sort(this.field_2212, new Comparator41(var9));
      }

      this.field_716 = 2;
   }

   public void method_895(Class214 var1, Interface215 var2, float var3) {
      if (this.field_716 > 0) {
         this.field_716--;
      } else {
         Class402.field_1178.method_1204(this.field_977, this.field_860, this.field_1016.field_1541, this.field_1016.field_2787, var3);
         Class531.field_759
            .method_755(this.field_977, this.field_860, this.field_1016.field_1541, this.field_1016.field_2787, this.field_1016.field_1754, var3);
         this.field_182 = 0;
         this.field_903 = 0;
         this.field_1897 = 0;
         Class563 var4 = this.field_1016.field_2787;
         Class531.field_998 = var4.field_2173 + (var4.field_1417 - var4.field_2173) * var3;
         Class531.field_1291 = var4.field_2270 + (var4.field_2654 - var4.field_2270) * var3;
         Class531.field_2192 = var4.field_1907 + (var4.field_2013 - var4.field_1907) * var3;
         Class402.field_2518 = var4.field_2173 + (var4.field_1417 - var4.field_2173) * var3;
         Class402.field_604 = var4.field_2270 + (var4.field_2654 - var4.field_2270) * var3;
         Class402.field_2255 = var4.field_1907 + (var4.field_2013 - var4.field_1907) * var3;
         List var5 = this.field_977.method_471();
         this.field_182 = var5.size();

         try {
            for (int var6 = 0; var6 < var5.size(); var6++) {
               Class359 var7 = (Class359)var5.get(var6);
               if (var7.method_1739(var1) && var2.method_570(var7.field_235) && (var7 != this.field_1016.field_2787 || this.field_1016.field_1754.field_1955)) {
                  this.field_903++;
                  Class531.field_759.method_1799(var7, var3);
               }
            }

            for (int var9 = 0; var9 < this.field_1954.size(); var9++) {
               Class402.field_1178.method_983(this.field_1954.get(var9), var3);
            }
         } catch (NullPointerException var8) {
         }
      }
   }

   public String method_734() {
      return "C: "
         + this.field_605
         + "/"
         + this.field_1633
         + ". F: "
         + this.field_2995
         + ", O: "
         + this.field_2680
         + ", E: "
         + this.field_307
         + ", DCs: "
         + this.field_1016.field_372;
   }

   public String method_1899() {
      return "E: " + this.field_903 + "/" + this.field_182 + ". B: " + this.field_1897 + ", I: " + (this.field_182 - this.field_1897 - this.field_903);
   }

   private void method_1247(int var1, int var2, int var3) {
      var1 -= 8;
      var2 -= 8;
      var3 -= 8;
      this.field_2633 = Integer.MAX_VALUE;
      this.field_1893 = Integer.MAX_VALUE;
      this.field_2532 = Integer.MAX_VALUE;
      this.field_353 = Integer.MIN_VALUE;
      this.field_2106 = Integer.MIN_VALUE;
      this.field_1218 = Integer.MIN_VALUE;
      int var4 = this.field_2466 * 16;
      int var5 = var4 / 2;

      for (int var6 = 0; var6 < this.field_2466; var6++) {
         int var7 = var6 * 16;
         int var8 = var7 + var5 - var1;
         if (var8 < 0) {
            var8 -= var4 - 1;
         }

         var8 /= var4;
         var7 -= var8 * var4;
         if (var7 < this.field_2633) {
            this.field_2633 = var7;
         }

         if (var7 > this.field_353) {
            this.field_353 = var7;
         }

         for (int var9 = 0; var9 < this.field_1137; var9++) {
            int var10 = var9 * 16;
            int var11 = var10 + var5 - var3;
            if (var11 < 0) {
               var11 -= var4 - 1;
            }

            var11 /= var4;
            var10 -= var11 * var4;
            if (var10 < this.field_2532) {
               this.field_2532 = var10;
            }

            if (var10 > this.field_1218) {
               this.field_1218 = var10;
            }

            for (int var12 = 0; var12 < this.field_1223; var12++) {
               int var13 = var12 * 16;
               if (var13 < this.field_1893) {
                  this.field_1893 = var13;
               }

               if (var13 > this.field_2106) {
                  this.field_2106 = var13;
               }

               Class599 var14 = this.field_1710[(var9 * this.field_1223 + var12) * this.field_2466 + var6];
               boolean var15 = var14.field_154;
               var14.method_702(var7, var13, var10);
               if (!var15 && var14.field_154) {
                  this.field_1401.add(var14);
               }
            }
         }
      }
   }

   public int method_1382(Class354 var1, int var2, double var3) {
      if (this.field_1016.field_1754.field_2733 != this.field_2769 || Minecraft.field_1677) {
         Minecraft.field_1677 = false;
         this.method_934();
      }

      if (var2 == 0) {
         this.field_1633 = 0;
         this.field_2995 = 0;
         this.field_2680 = 0;
         this.field_605 = 0;
         this.field_307 = 0;
      }

      double var5 = var1.field_2173 + (var1.field_1417 - var1.field_2173) * var3;
      double var7 = var1.field_2270 + (var1.field_2654 - var1.field_2270) * var3;
      double var9 = var1.field_1907 + (var1.field_2013 - var1.field_1907) * var3;
      double var11 = var1.field_1417 - this.field_1957;
      double var13 = var1.field_2654 - this.field_279;
      double var15 = var1.field_2013 - this.field_2248;
      if (var11 * var11 + var13 * var13 + var15 * var15 > 16.0) {
         this.field_1957 = var1.field_1417;
         this.field_279 = var1.field_2654;
         this.field_2248 = var1.field_2013;
         this.method_1247(Class469.method_468(var1.field_1417), Class469.method_468(var1.field_2654), Class469.method_468(var1.field_2013));

         try {
            Arrays.sort(this.field_2212, new Comparator41(var1));
         } catch (IllegalArgumentException var35) {
         }
      }

      byte var17 = 0;
      int var18;
      if (this.field_470 && !this.field_1016.field_1754.field_359 && var2 == 0) {
         byte var19 = 0;
         int var20 = 16;
         this.method_1712(var19, var20);

         for (int var21 = var19; var21 < var20; var21++) {
            this.field_2212[var21].field_1623 = true;
         }

         var18 = var17 + this.method_557(var19, var20, var2, var3);

         do {
            int var36 = var20;
            var20 *= 2;
            if (var20 > this.field_2212.length) {
               var20 = this.field_2212.length;
            }

            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glDisable(3008);
            GL11.glDisable(2912);
            GL11.glColorMask(false, false, false, false);
            GL11.glDepthMask(false);
            this.method_1712(var36, var20);
            GL11.glPushMatrix();
            float var22 = 0.0F;
            float var23 = 0.0F;
            float var24 = 0.0F;

            for (int var25 = var36; var25 < var20; var25++) {
               if (this.field_2212[var25].method_585()) {
                  this.field_2212[var25].field_1913 = false;
               } else {
                  if (!this.field_2212[var25].field_1913) {
                     this.field_2212[var25].field_1623 = true;
                  }

                  if (this.field_2212[var25].field_1913 && !this.field_2212[var25].field_539) {
                     float var26 = Class469.method_254(this.field_2212[var25].method_1563(var1));
                     int var27 = (int)(1.0F + var26 / 128.0F);
                     if (this.field_328 % var27 == var25 % var27) {
                        Class599 var28 = this.field_2212[var25];
                        float var29 = (float)(var28.field_1515 - var5);
                        float var30 = (float)(var28.field_3082 - var7);
                        float var31 = (float)(var28.field_1372 - var9);
                        float var32 = var29 - var22;
                        float var33 = var30 - var23;
                        float var34 = var31 - var24;
                        if (var32 != 0.0F || var33 != 0.0F || var34 != 0.0F) {
                           GL11.glTranslatef(var32, var33, var34);
                           var22 += var32;
                           var23 += var33;
                           var24 += var34;
                        }

                        ARBOcclusionQuery.glBeginQueryARB(35092, this.field_2212[var25].field_950);
                        this.field_2212[var25].method_464();
                        ARBOcclusionQuery.glEndQueryARB(35092);
                        this.field_2212[var25].field_539 = true;
                     }
                  }
               }
            }

            GL11.glPopMatrix();
            GL11.glColorMask(true, true, true, true);
            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
            GL11.glEnable(2912);
            var18 += this.method_557(var36, var20, var2, var3);
         } while (var20 < this.field_2212.length);
      } else {
         var18 = var17 + this.method_557(0, this.field_2212.length, var2, var3);
      }

      return var18;
   }

   private void method_1712(int var1, int var2) {
      for (int var3 = var1; var3 < var2; var3++) {
         if (this.field_2212[var3].field_539) {
            ((Buffer)this.field_2755).clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(this.field_2212[var3].field_950, 34919, this.field_2755);
            if (this.field_2755.get(0) != 0) {
               this.field_2212[var3].field_539 = false;
               ((Buffer)this.field_2755).clear();
               ARBOcclusionQuery.glGetQueryObjectuARB(this.field_2212[var3].field_950, 34918, this.field_2755);
               this.field_2212[var3].field_1623 = this.field_2755.get(0) != 0;
            }
         }
      }
   }

   private int method_557(int var1, int var2, int var3, double var4) {
      this.field_2837.clear();
      int var6 = 0;

      for (int var7 = var1; var7 < var2; var7++) {
         if (var3 == 0) {
            this.field_1633++;
            if (this.field_2212[var7].field_1318[var3]) {
               this.field_307++;
            } else if (!this.field_2212[var7].field_1913) {
               this.field_2995++;
            } else if (this.field_470 && !this.field_2212[var7].field_1623) {
               this.field_2680++;
            } else {
               this.field_605++;
            }
         }

         if (!this.field_2212[var7].field_1318[var3] && this.field_2212[var7].field_1913 && this.field_2212[var7].field_1623) {
            int var8 = this.field_2212[var7].method_647(var3);
            if (var8 >= 0) {
               this.field_2837.add(this.field_2212[var7]);
               var6++;
            }
         }
      }

      Class563 var19 = this.field_1016.field_2787;
      double var20 = var19.field_2173 + (var19.field_1417 - var19.field_2173) * var4;
      double var10 = var19.field_2270 + (var19.field_2654 - var19.field_2270) * var4;
      double var12 = var19.field_1907 + (var19.field_2013 - var19.field_1907) * var4;
      int var14 = 0;

      for (int var15 = 0; var15 < this.field_78.length; var15++) {
         this.field_78[var15].method_1388();
      }

      for (int var21 = 0; var21 < this.field_2837.size(); var21++) {
         Class599 var16 = this.field_2837.get(var21);
         int var17 = -1;

         for (int var18 = 0; var18 < var14; var18++) {
            if (this.field_78[var18].method_788(var16.field_1515, var16.field_3082, var16.field_1372)) {
               var17 = var18;
            }
         }

         if (var17 < 0) {
            var17 = var14++;
            this.field_78[var17].method_1785(var16.field_1515, var16.field_3082, var16.field_1372, var20, var10, var12);
         }

         this.field_78[var17].method_1499(var16.method_647(var3));
      }

      this.method_495(var3, var4);
      return var6;
   }

   public void method_495(int var1, double var2) {
      for (int var4 = 0; var4 < this.field_78.length; var4++) {
         this.field_78[var4].method_749();
      }
   }

   public void method_700() {
      this.field_328++;
   }

   public void method_1179(float var1) {
      boolean var2 = Class310.field_1551 || this.field_977 != null && this.field_977.method_1377() % 10L == 0L && this.field_977.method_1377() > 0L;
      GL11.glDisable(3553);
      Class214 var3 = this.field_977.method_1631(var1);
      float var4 = (float)var3.field_882;
      float var5 = (float)var3.field_1911;
      float var6 = (float)var3.field_3045;
      if (this.field_1016.field_1754.field_359) {
         float var9 = (var4 * 30.0F + var5 * 59.0F + var6 * 11.0F) / 100.0F;
         float var7 = (var4 * 30.0F + var5 * 70.0F) / 100.0F;
         float var8 = (var4 * 30.0F + var6 * 70.0F) / 100.0F;
         var4 = var9;
         var5 = var7;
         var6 = var8;
      }

      GL11.glColor3f(var4, var5, var6);
      Class368 var17 = Class368.field_2696;
      GL11.glDepthMask(false);
      GL11.glEnable(2912);
      GL11.glColor3f(var4, var5, var6);
      GL11.glCallList(this.field_581);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      GL11.glDisable(3008);
      GL11.glEnable(3042);
      GL11.glBlendFunc(1, 1);
      GL11.glPushMatrix();
      float var15 = 0.0F;
      float var16 = 0.0F;
      float var10 = 0.0F;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glTranslatef(var15, var16, var10);
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(this.field_977.method_420(var1) * 360.0F, 1.0F, 0.0F, 0.0F);
      float var11 = 30.0F;
      String var12 = "/terrain/sun.png";
      String var13 = "/terrain/moon.png";
      if (var2) {
         var12 = "/terrain/sun_n.png";
         var13 = "/terrain/moon_n.png";
      }

      GL11.glBindTexture(3553, this.field_860.method_1545(var12));
      var17.method_1284(true);
      var17.method_318(-var11, 100.0, -var11, 0.0, 0.0);
      var17.method_318(var11, 100.0, -var11, 1.0, 0.0);
      var17.method_318(var11, 100.0, var11, 1.0, 1.0);
      var17.method_318(-var11, 100.0, var11, 0.0, 1.0);
      var17.method_406();
      var11 = 20.0F;
      GL11.glBindTexture(3553, this.field_860.method_1545(var13));
      var17.method_1284(true);
      var17.method_318(-var11, -100.0, var11, 1.0, 1.0);
      var17.method_318(var11, -100.0, var11, 0.0, 1.0);
      var17.method_318(var11, -100.0, -var11, 0.0, 0.0);
      var17.method_318(-var11, -100.0, -var11, 1.0, 0.0);
      var17.method_406();
      GL11.glDisable(3553);
      float var14 = this.field_977.method_1374(var1);
      if (var14 > 0.0F) {
         GL11.glColor4f(var14, var14, var14, var14);
         GL11.glCallList(this.field_2978);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glEnable(2912);
      GL11.glPopMatrix();
      GL11.glColor3f(var4 * 0.2F + 0.04F, var5 * 0.2F + 0.04F, var6 * 0.6F + 0.1F);
      GL11.glDisable(3553);
      GL11.glCallList(this.field_608);
      GL11.glEnable(3553);
      GL11.glDepthMask(true);
   }

   public void method_516(float var1) {
      if (this.field_1016.field_1754.field_674 == 1) {
         this.method_377(var1);
      } else {
         GL11.glDisable(2884);
         float var2 = (float)(this.field_1016.field_2787.field_2270 + (this.field_1016.field_2787.field_2654 - this.field_1016.field_2787.field_2270) * var1);
         byte var3 = 32;
         int var4 = 256 / var3;
         Class368 var5 = Class368.field_2696;
         GL11.glBindTexture(3553, this.field_860.method_1545("/clouds.png"));
         if (this.field_1016.field_1754.field_674 == 1) {
            GL11.glEnable(3042);
         }

         GL11.glBlendFunc(770, 771);
         Class214 var6 = this.field_977.method_1716(var1);
         float var7 = (float)var6.field_882;
         float var8 = (float)var6.field_1911;
         float var9 = (float)var6.field_3045;
         if (this.field_1016.field_1754.field_359) {
            float var10 = (var7 * 30.0F + var8 * 59.0F + var9 * 11.0F) / 100.0F;
            float var11 = (var7 * 30.0F + var8 * 70.0F) / 100.0F;
            float var12 = (var7 * 30.0F + var9 * 70.0F) / 100.0F;
            var7 = var10;
            var8 = var11;
            var9 = var12;
         }

         float var22 = 4.8828125E-4F;
         double var23 = this.field_1016.field_2787.field_2553
            + (this.field_1016.field_2787.field_1417 - this.field_1016.field_2787.field_2553) * var1
            + (this.field_328 + var1) * 0.03F;
         double var13 = this.field_1016.field_2787.field_1780 + (this.field_1016.field_2787.field_2013 - this.field_1016.field_2787.field_1780) * var1;
         int var15 = Class469.method_468(var23 / 2048.0);
         int var16 = Class469.method_468(var13 / 2048.0);
         var23 -= var15 * 2048;
         var13 -= var16 * 2048;
         float var17 = 120.0F - var2 + 0.33F;
         float var18 = (float)(var23 * var22);
         float var19 = (float)(var13 * var22);
         var5.method_186();
         var5.method_1120(var7, var8, var9, 0.8F);

         for (int var20 = -var3 * var4; var20 < var3 * var4; var20 += var3) {
            for (int var21 = -var3 * var4; var21 < var3 * var4; var21 += var3) {
               var5.method_318(var20 + 0, var17, var21 + var3, (var20 + 0) * var22 + var18, (var21 + var3) * var22 + var19);
               var5.method_318(var20 + var3, var17, var21 + var3, (var20 + var3) * var22 + var18, (var21 + var3) * var22 + var19);
               var5.method_318(var20 + var3, var17, var21 + 0, (var20 + var3) * var22 + var18, (var21 + 0) * var22 + var19);
               var5.method_318(var20 + 0, var17, var21 + 0, (var20 + 0) * var22 + var18, (var21 + 0) * var22 + var19);
            }
         }

         var5.method_406();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(2884);
      }
   }

   public void method_377(float var1) {
      GL11.glDisable(2884);
      float var2 = (float)(this.field_1016.field_2787.field_2270 + (this.field_1016.field_2787.field_2654 - this.field_1016.field_2787.field_2270) * var1);
      Class368 var3 = Class368.field_2696;
      float var4 = 12.0F;
      float var5 = 4.0F;
      double var6 = (
            this.field_1016.field_2787.field_2553
               + (this.field_1016.field_2787.field_1417 - this.field_1016.field_2787.field_2553) * var1
               + (this.field_328 + var1) * 0.03F
         )
         / var4;
      double var8 = (this.field_1016.field_2787.field_1780 + (this.field_1016.field_2787.field_2013 - this.field_1016.field_2787.field_1780) * var1) / var4
         + 0.33F;
      float var10 = 108.0F - var2 + 0.33F;
      int var11 = Class469.method_468(var6 / 2048.0);
      int var12 = Class469.method_468(var8 / 2048.0);
      var6 -= var11 * 2048;
      var8 -= var12 * 2048;
      GL11.glBindTexture(3553, this.field_860.method_1545("/clouds.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      Class214 var13 = this.field_977.method_1716(var1);
      float var14 = (float)var13.field_882;
      float var15 = (float)var13.field_1911;
      float var16 = (float)var13.field_3045;
      if (this.field_1016.field_1754.field_359) {
         float var17 = (var14 * 30.0F + var15 * 59.0F + var16 * 11.0F) / 100.0F;
         float var18 = (var14 * 30.0F + var15 * 70.0F) / 100.0F;
         float var19 = (var14 * 30.0F + var16 * 70.0F) / 100.0F;
         var14 = var17;
         var15 = var18;
         var16 = var19;
      }

      float var35 = (float)(var6 * 0.0);
      float var37 = (float)(var8 * 0.0);
      float var39 = 0.00390625F;
      var35 = Class469.method_468(var6) * var39;
      var37 = Class469.method_468(var8) * var39;
      float var20 = (float)(var6 - Class469.method_468(var6));
      float var21 = (float)(var8 - Class469.method_468(var8));
      byte var22 = 8;
      byte var23 = 3;
      float var24 = 9.765625E-4F;
      GL11.glScalef(var4, 1.0F, var4);

      for (int var25 = 0; var25 < 2; var25++) {
         if (var25 == 0) {
            GL11.glColorMask(false, false, false, false);
         } else {
            GL11.glColorMask(true, true, true, true);
         }

         for (int var26 = -var23 + 1; var26 <= var23; var26++) {
            for (int var27 = -var23 + 1; var27 <= var23; var27++) {
               var3.method_186();
               float var28 = var26 * var22;
               float var29 = var27 * var22;
               float var30 = var28 - var20;
               float var31 = var29 - var21;
               if (var10 > -var5 - 1.0F) {
                  var3.method_1120(var14 * 0.7F, var15 * 0.7F, var16 * 0.7F, 0.8F);
                  var3.method_548(0.0F, -1.0F, 0.0F);
                  var3.method_318(var30 + 0.0F, var10 + 0.0F, var31 + var22, (var28 + 0.0F) * var39 + var35, (var29 + var22) * var39 + var37);
                  var3.method_318(var30 + var22, var10 + 0.0F, var31 + var22, (var28 + var22) * var39 + var35, (var29 + var22) * var39 + var37);
                  var3.method_318(var30 + var22, var10 + 0.0F, var31 + 0.0F, (var28 + var22) * var39 + var35, (var29 + 0.0F) * var39 + var37);
                  var3.method_318(var30 + 0.0F, var10 + 0.0F, var31 + 0.0F, (var28 + 0.0F) * var39 + var35, (var29 + 0.0F) * var39 + var37);
               }

               if (var10 <= var5 + 1.0F) {
                  var3.method_1120(var14, var15, var16, 0.8F);
                  var3.method_548(0.0F, 1.0F, 0.0F);
                  var3.method_318(var30 + 0.0F, var10 + var5 - var24, var31 + var22, (var28 + 0.0F) * var39 + var35, (var29 + var22) * var39 + var37);
                  var3.method_318(var30 + var22, var10 + var5 - var24, var31 + var22, (var28 + var22) * var39 + var35, (var29 + var22) * var39 + var37);
                  var3.method_318(var30 + var22, var10 + var5 - var24, var31 + 0.0F, (var28 + var22) * var39 + var35, (var29 + 0.0F) * var39 + var37);
                  var3.method_318(var30 + 0.0F, var10 + var5 - var24, var31 + 0.0F, (var28 + 0.0F) * var39 + var35, (var29 + 0.0F) * var39 + var37);
               }

               var3.method_1120(var14 * 0.9F, var15 * 0.9F, var16 * 0.9F, 0.8F);
               if (var26 > -1) {
                  var3.method_548(-1.0F, 0.0F, 0.0F);

                  for (int var32 = 0; var32 < var22; var32++) {
                     var3.method_318(var30 + var32 + 0.0F, var10 + 0.0F, var31 + var22, (var28 + var32 + 0.5F) * var39 + var35, (var29 + var22) * var39 + var37);
                     var3.method_318(var30 + var32 + 0.0F, var10 + var5, var31 + var22, (var28 + var32 + 0.5F) * var39 + var35, (var29 + var22) * var39 + var37);
                     var3.method_318(var30 + var32 + 0.0F, var10 + var5, var31 + 0.0F, (var28 + var32 + 0.5F) * var39 + var35, (var29 + 0.0F) * var39 + var37);
                     var3.method_318(var30 + var32 + 0.0F, var10 + 0.0F, var31 + 0.0F, (var28 + var32 + 0.5F) * var39 + var35, (var29 + 0.0F) * var39 + var37);
                  }
               }

               if (var26 <= 1) {
                  var3.method_548(1.0F, 0.0F, 0.0F);

                  for (int var40 = 0; var40 < var22; var40++) {
                     var3.method_318(
                        var30 + var40 + 1.0F - var24, var10 + 0.0F, var31 + var22, (var28 + var40 + 0.5F) * var39 + var35, (var29 + var22) * var39 + var37
                     );
                     var3.method_318(
                        var30 + var40 + 1.0F - var24, var10 + var5, var31 + var22, (var28 + var40 + 0.5F) * var39 + var35, (var29 + var22) * var39 + var37
                     );
                     var3.method_318(
                        var30 + var40 + 1.0F - var24, var10 + var5, var31 + 0.0F, (var28 + var40 + 0.5F) * var39 + var35, (var29 + 0.0F) * var39 + var37
                     );
                     var3.method_318(
                        var30 + var40 + 1.0F - var24, var10 + 0.0F, var31 + 0.0F, (var28 + var40 + 0.5F) * var39 + var35, (var29 + 0.0F) * var39 + var37
                     );
                  }
               }

               var3.method_1120(var14 * 0.8F, var15 * 0.8F, var16 * 0.8F, 0.8F);
               if (var27 > -1) {
                  var3.method_548(0.0F, 0.0F, -1.0F);

                  for (int var41 = 0; var41 < var22; var41++) {
                     var3.method_318(var30 + 0.0F, var10 + var5, var31 + var41 + 0.0F, (var28 + 0.0F) * var39 + var35, (var29 + var41 + 0.5F) * var39 + var37);
                     var3.method_318(var30 + var22, var10 + var5, var31 + var41 + 0.0F, (var28 + var22) * var39 + var35, (var29 + var41 + 0.5F) * var39 + var37);
                     var3.method_318(var30 + var22, var10 + 0.0F, var31 + var41 + 0.0F, (var28 + var22) * var39 + var35, (var29 + var41 + 0.5F) * var39 + var37);
                     var3.method_318(var30 + 0.0F, var10 + 0.0F, var31 + var41 + 0.0F, (var28 + 0.0F) * var39 + var35, (var29 + var41 + 0.5F) * var39 + var37);
                  }
               }

               if (var27 <= 1) {
                  var3.method_548(0.0F, 0.0F, 1.0F);

                  for (int var42 = 0; var42 < var22; var42++) {
                     var3.method_318(
                        var30 + 0.0F, var10 + var5, var31 + var42 + 1.0F - var24, (var28 + 0.0F) * var39 + var35, (var29 + var42 + 0.5F) * var39 + var37
                     );
                     var3.method_318(
                        var30 + var22, var10 + var5, var31 + var42 + 1.0F - var24, (var28 + var22) * var39 + var35, (var29 + var42 + 0.5F) * var39 + var37
                     );
                     var3.method_318(
                        var30 + var22, var10 + 0.0F, var31 + var42 + 1.0F - var24, (var28 + var22) * var39 + var35, (var29 + var42 + 0.5F) * var39 + var37
                     );
                     var3.method_318(
                        var30 + 0.0F, var10 + 0.0F, var31 + var42 + 1.0F - var24, (var28 + 0.0F) * var39 + var35, (var29 + var42 + 0.5F) * var39 + var37
                     );
                  }
               }

               var3.method_406();
            }
         }
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(2884);
   }

   public boolean method_446(Class354 var1, boolean var2) {
      try {
         Collections.sort(this.field_1401, new Comparator442(var1));
      } catch (IllegalArgumentException var7) {
      }

      int var3 = this.field_1401.size() - 1;
      int var4 = this.field_1401.size();

      for (int var5 = 0; var5 < var4; var5++) {
         Class599 var6 = this.field_1401.get(var3 - var5);
         if (!var2) {
            if (var6.method_1563(var1) > 1024.0F) {
               if (var6.field_1913) {
                  if (var5 >= 3) {
                     return false;
                  }
               } else if (var5 >= 1) {
                  return false;
               }
            }
         } else if (!var6.field_1913) {
            continue;
         }

         var6.method_1386();
         this.field_1401.remove(var6);
         var6.field_154 = false;
      }

      return this.field_1401.size() == 0;
   }

   public void method_429(Class354 var1, Class366 var2, int var3, Class334 var4, float var5) {
      Class368 var6 = Class368.field_2696;
      GL11.glEnable(3042);
      GL11.glEnable(3008);
      GL11.glBlendFunc(770, 1);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, (Class469.method_1667((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.4F) * 0.5F);
      if (var3 == 0) {
         if (this.field_1014 > 0.0F) {
            GL11.glBlendFunc(774, 768);
            int var8 = this.field_860.method_1545(Minecraft.field_1094);
            GL11.glBindTexture(3553, var8);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
            GL11.glPushMatrix();
            int var7 = this.field_977.method_197(var2.field_1129, var2.field_1756, var2.field_513);
            Class108 var9 = var7 > 0 ? Class108.field_1221[var7] : null;
            GL11.glDisable(3008);
            GL11.glPolygonOffset(-3.0F, -3.0F);
            GL11.glEnable(32823);
            var6.method_186();
            double var10 = var1.field_2173 + (var1.field_1417 - var1.field_2173) * var5;
            double var12 = var1.field_2270 + (var1.field_2654 - var1.field_2270) * var5;
            double var14 = var1.field_1907 + (var1.field_2013 - var1.field_1907) * var5;
            var6.method_387(-var10, -var12, -var14);
            var6.method_1223();
            if (var9 == null) {
               var9 = Class108.field_720;
            }

            this.field_1921.method_1018(var9, var2.field_1129, var2.field_1756, var2.field_513, 496 + (int)(this.field_1014 * 10.0F));
            var6.method_406();
            var6.method_387(0.0, 0.0, 0.0);
            GL11.glPolygonOffset(0.0F, 0.0F);
            GL11.glDisable(32823);
            GL11.glEnable(3008);
            GL11.glDepthMask(true);
            GL11.glPopMatrix();
         }
      } else if (var4 != null) {
         GL11.glBlendFunc(770, 771);
         float var17 = Class469.method_1667((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.8F;
         GL11.glColor4f(var17, var17, var17, Class469.method_1667((float)System.currentTimeMillis() / 200.0F) * 0.2F + 0.5F);
         int var16 = this.field_860.method_1545(Minecraft.field_1094);
         GL11.glBindTexture(3553, var16);
         int var18 = var2.field_1129;
         int var20 = var2.field_1756;
         int var11 = var2.field_513;
         if (var2.field_1726 == 0) {
            var20--;
         }

         if (var2.field_1726 == 1) {
            var20++;
         }

         if (var2.field_1726 == 2) {
            var11--;
         }

         if (var2.field_1726 == 3) {
            var11++;
         }

         if (var2.field_1726 == 4) {
            var18--;
         }

         if (var2.field_1726 == 5) {
            var18++;
         }
      }

      GL11.glDisable(3042);
      GL11.glDisable(3008);
   }

   public void method_949(Class354 var1, Class366 var2, int var3, Class334 var4, float var5) {
      if (var3 == 0 && var2.field_1786 == 0) {
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
         GL11.glLineWidth(2.0F);
         GL11.glDisable(3553);
         GL11.glDepthMask(false);
         float var6 = 0.002F;
         int var7 = this.field_977.method_197(var2.field_1129, var2.field_1756, var2.field_513);
         if (var7 > 0) {
            Class108.field_1221[var7].method_1433(this.field_977, var2.field_1129, var2.field_1756, var2.field_513);
            double var8 = var1.field_2173 + (var1.field_1417 - var1.field_2173) * var5;
            double var10 = var1.field_2270 + (var1.field_2654 - var1.field_2270) * var5;
            double var12 = var1.field_1907 + (var1.field_2013 - var1.field_1907) * var5;
            this.method_1281(
               Class108.field_1221[var7]
                  .method_366(this.field_977, var2.field_1129, var2.field_1756, var2.field_513)
                  .method_1384(var6, var6, var6)
                  .method_1032(-var8, -var10, -var12)
            );
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
      }
   }

   private void method_1281(Class630 var1) {
      Class368 var2 = Class368.field_2696;
      var2.method_672(3, true);
      var2.method_1724(var1.field_2118, var1.field_946, var1.field_1714);
      var2.method_1724(var1.field_1702, var1.field_946, var1.field_1714);
      var2.method_1724(var1.field_1702, var1.field_946, var1.field_858);
      var2.method_1724(var1.field_2118, var1.field_946, var1.field_858);
      var2.method_1724(var1.field_2118, var1.field_946, var1.field_1714);
      var2.method_406();
      var2.method_672(3, true);
      var2.method_1724(var1.field_2118, var1.field_3132, var1.field_1714);
      var2.method_1724(var1.field_1702, var1.field_3132, var1.field_1714);
      var2.method_1724(var1.field_1702, var1.field_3132, var1.field_858);
      var2.method_1724(var1.field_2118, var1.field_3132, var1.field_858);
      var2.method_1724(var1.field_2118, var1.field_3132, var1.field_1714);
      var2.method_406();
      var2.method_672(1, true);
      var2.method_1724(var1.field_2118, var1.field_946, var1.field_1714);
      var2.method_1724(var1.field_2118, var1.field_3132, var1.field_1714);
      var2.method_1724(var1.field_1702, var1.field_946, var1.field_1714);
      var2.method_1724(var1.field_1702, var1.field_3132, var1.field_1714);
      var2.method_1724(var1.field_1702, var1.field_946, var1.field_858);
      var2.method_1724(var1.field_1702, var1.field_3132, var1.field_858);
      var2.method_1724(var1.field_2118, var1.field_946, var1.field_858);
      var2.method_1724(var1.field_2118, var1.field_3132, var1.field_858);
      var2.method_406();
   }

   public void method_183(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = Class469.method_1231(var1, 16);
      int var8 = Class469.method_1231(var2, 16);
      int var9 = Class469.method_1231(var3, 16);
      int var10 = Class469.method_1231(var4, 16);
      int var11 = Class469.method_1231(var5, 16);
      int var12 = Class469.method_1231(var6, 16);

      for (int var13 = var7; var13 <= var10; var13++) {
         int var14 = var13 % this.field_2466;
         if (var14 < 0) {
            var14 += this.field_2466;
         }

         for (int var15 = var8; var15 <= var11; var15++) {
            int var16 = var15 % this.field_1223;
            if (var16 < 0) {
               var16 += this.field_1223;
            }

            for (int var17 = var9; var17 <= var12; var17++) {
               int var18 = var17 % this.field_1137;
               if (var18 < 0) {
                  var18 += this.field_1137;
               }

               int var19 = (var18 * this.field_1223 + var16) * this.field_2466 + var14;
               Class599 var20 = this.field_1710[var19];
               if (!var20.field_154) {
                  this.field_1401.add(var20);
               }

               var20.method_1119();
            }
         }
      }
   }

   @Override
   public void method_158(int var1, int var2, int var3) {
      this.method_183(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   @Override
   public void method_1703(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method_183(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1);
   }

   public void method_1003(Interface215 var1, float var2) {
      for (int var3 = 0; var3 < this.field_1710.length; var3++) {
         if (!this.field_1710[var3].method_585() && (!this.field_1710[var3].field_1913 || (var3 + this.field_2842 & 15) == 0)) {
            this.field_1710[var3].method_741(var1);
         }
      }

      this.field_2842++;
   }

   @Override
   public void method_1441(String var1, int var2, int var3, int var4) {
      if (var1 != null) {
         this.field_1016.field_964.method_620("[5] - " + var1);
      }

      this.field_1016.field_485.method_1550(var1, var2, var3, var4, 1.0F, 1.0F);
   }

   @Override
   public void method_1573(String var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = 16.0F;
      if (var8 > 1.0F) {
         var10 *= var8;
      }

      if (this.field_1016.field_2787.method_645(var2, var4, var6) < var10 * var10) {
         this.field_1016.field_485.method_68(var1, (float)var2, (float)var4, (float)var6, var8, var9);
      }
   }

   @Override
   public void method_1165(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      double var14 = this.field_1016.field_2787.field_1417 - var2;
      double var16 = this.field_1016.field_2787.field_2654 - var4;
      double var18 = this.field_1016.field_2787.field_2013 - var6;
      if (var14 * var14 + var16 * var16 + var18 * var18 <= 256.0) {
         if (Objects.equals(var1, "bubble")) {
            this.field_1016.field_2681.method_206(new Class406(this.field_977, var2, var4, var6, var8, var10, var12));
         } else if (Objects.equals(var1, "smoke")) {
            this.field_1016.field_2681.method_206(new Class179(this.field_977, var2, var4, var6));
         } else if (Objects.equals(var1, "explode")) {
            this.field_1016.field_2681.method_206(new Class383(this.field_977, var2, var4, var6, var8, var10, var12));
         } else if (Objects.equals(var1, "flame")) {
            this.field_1016.field_2681.method_206(new Class465(this.field_977, var2, var4, var6, var8, var10, var12));
         } else if (Objects.equals(var1, "lava")) {
            this.field_1016.field_2681.method_206(new Class699(this.field_977, var2, var4, var6));
         } else if (Objects.equals(var1, "splash")) {
            this.field_1016.field_2681.method_206(new Class596(this.field_977, var2, var4, var6, var8, var10, var12));
         } else if (Objects.equals(var1, "largesmoke")) {
            this.field_1016.field_2681.method_206(new Class179(this.field_977, var2, var4, var6, 2.5F));
         } else if (Objects.equals(var1, "reddust")) {
            this.field_1016.field_2681.method_206(new Class737(this.field_977, var2, var4, var6));
         } else if (Objects.equals(var1, "snowballpoof")) {
            this.field_1016.field_2681.method_206(new Class257(this.field_977, var2, var4, var6, Class755.field_103));
         } else if (Objects.equals(var1, "slime")) {
            this.field_1016.field_2681.method_206(new Class257(this.field_977, var2, var4, var6, Class755.field_2584));
         } else if (Objects.equals(var1, "snowflake1")) {
            this.field_1016.field_2681.method_206(new Class717(this.field_977, var2, var4, var6, var8, var10, var12, 1));
         } else if (Objects.equals(var1, "snowflake2")) {
            this.field_1016.field_2681.method_206(new Class717(this.field_977, var2, var4, var6, var8, var10, var12, 2));
         } else if (Objects.equals(var1, "snowflake3")) {
            this.field_1016.field_2681.method_206(new Class717(this.field_977, var2, var4, var6, var8, var10, var12, 3));
         } else if (Objects.equals(var1, "leaf")) {
            this.field_1016.field_2681.method_206(new Class668(this.field_977, var2, var4, var6, var8, var10, var12));
         } else if (Objects.equals(var1, "snow1")) {
            this.field_1016.field_2681.method_206(new Class316(this.field_977, var2, var4, var6, var8, var10, var12, 1));
         } else if (Objects.equals(var1, "snow2")) {
            this.field_1016.field_2681.method_206(new Class316(this.field_977, var2, var4, var6, var8, var10, var12, 3));
         } else if (Objects.equals(var1, "snow3")) {
            this.field_1016.field_2681.method_206(new Class316(this.field_977, var2, var4, var6, var8, var10, var12, 2));
         }
      }
   }

   @Override
   public void method_709(Class359 var1) {
      if (var1.field_1795 != null) {
         this.field_860.method_1125(var1.field_1795, new Class379());
      }
   }

   @Override
   public void method_13(Class359 var1) {
      if (var1.field_1795 != null) {
         this.field_860.method_1175(var1.field_1795);
      }
   }

   @Override
   public void method_1693() {
      for (int var1 = 0; var1 < this.field_1710.length; var1++) {
         if (this.field_1710[var1].field_1229) {
            if (!this.field_1710[var1].field_154) {
               this.field_1401.add(this.field_1710[var1]);
            }

            this.field_1710[var1].method_1119();
         }
      }
   }

   @Override
   public void method_511(int var1, int var2, int var3, Class186 var4) {
   }
}
