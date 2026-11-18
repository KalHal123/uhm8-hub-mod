import org.lwjgl.opengl.GL11;

public class ay {
   private mz a;
   private int b = -1;
   private boolean c = false;
   private boolean d = false;

   public ay(mz var1) {
      this.a = var1;
   }

   public ay() {
   }

   public void a(ln var1, int var2, int var3, int var4, int var5) {
      this.b = var5;
      this.a(var1, var2, var3, var4);
      this.b = -1;
   }

   public boolean a(ln var1, int var2, int var3, int var4) {
      int var5 = var1.f();
      var1.a(this.a, var2, var3, var4);
      if (var5 == 0) {
         return this.k(var1, var2, var3, var4);
      } else if (var5 == 4) {
         return this.j(var1, var2, var3, var4);
      } else if (var5 == 13) {
         return this.l(var1, var2, var3, var4);
      } else if (var5 == 1) {
         return this.h(var1, var2, var3, var4);
      } else if (var5 == 6) {
         return this.i(var1, var2, var3, var4);
      } else if (var5 == 2) {
         return this.b(var1, var2, var3, var4);
      } else if (var5 == 3) {
         return this.d(var1, var2, var3, var4);
      } else if (var5 == 5) {
         return this.e(var1, var2, var3, var4);
      } else if (var5 == 8) {
         return this.g(var1, var2, var3, var4);
      } else if (var5 == 7) {
         return this.o(var1, var2, var3, var4);
      } else if (var5 == 9) {
         return this.f(var1, var2, var3, var4);
      } else if (var5 == 10) {
         return this.n(var1, var2, var3, var4);
      } else if (var5 == 11) {
         return this.m(var1, var2, var3, var4);
      } else {
         return var5 == 12 ? this.c(var1, var2, var3, var4) : false;
      }
   }

   public boolean b(ln var1, int var2, int var3, int var4) {
      int var5 = this.a.e(var2, var3, var4);
      he var6 = he.a;
      float var7 = var1.c(this.a, var2, var3, var4);
      if (ln.s[var1.ba] > 0) {
         var7 = 1.0F;
      }

      var6.a(var7, var7, var7);
      double var8 = 0.4F;
      double var10 = 0.5 - var8;
      double var12 = 0.2F;
      if (var5 == 1) {
         this.a(var1, var2 - var10, var3 + var12, var4, -var8, 0.0);
      } else if (var5 == 2) {
         this.a(var1, var2 + var10, var3 + var12, var4, var8, 0.0);
      } else if (var5 == 3) {
         this.a(var1, var2, var3 + var12, var4 - var10, 0.0, -var8);
      } else if (var5 == 4) {
         this.a(var1, var2, var3 + var12, var4 + var10, 0.0, var8);
      } else {
         this.a(var1, var2, var3, var4, 0.0, 0.0);
      }

      return true;
   }

   public boolean c(ln var1, int var2, int var3, int var4) {
      int var5 = this.a.e(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) > 0;
      he var8 = he.a;
      boolean var9 = this.b >= 0;
      if (!var9) {
         this.b = ln.w.aZ;
      }

      float var10 = 0.25F;
      float var11 = 0.1875F;
      float var12 = 0.1875F;
      if (var6 == 5) {
         var1.a(0.5F - var11, 0.0F, 0.5F - var10, 0.5F + var11, var12, 0.5F + var10);
      } else if (var6 == 6) {
         var1.a(0.5F - var10, 0.0F, 0.5F - var11, 0.5F + var10, var12, 0.5F + var11);
      } else if (var6 == 4) {
         var1.a(0.5F - var11, 0.5F - var10, 1.0F - var12, 0.5F + var11, 0.5F + var10, 1.0F);
      } else if (var6 == 3) {
         var1.a(0.5F - var11, 0.5F - var10, 0.0F, 0.5F + var11, 0.5F + var10, var12);
      } else if (var6 == 2) {
         var1.a(1.0F - var12, 0.5F - var10, 0.5F - var11, 1.0F, 0.5F + var10, 0.5F + var11);
      } else if (var6 == 1) {
         var1.a(0.0F, 0.5F - var10, 0.5F - var11, var12, 0.5F + var10, 0.5F + var11);
      }

      this.k(var1, var2, var3, var4);
      if (!var9) {
         this.b = -1;
      }

      float var13 = var1.c(this.a, var2, var3, var4);
      if (ln.s[var1.ba] > 0) {
         var13 = 1.0F;
      }

      var8.a(var13, var13, var13);
      int var14 = var1.a(0);
      if (this.b >= 0) {
         var14 = this.b;
      }

      int var15 = (var14 & 15) << 4;
      int var16 = var14 & 240;
      float var17 = var15 / 256.0F;
      float var18 = (var15 + 15.99F) / 256.0F;
      float var19 = var16 / 256.0F;
      float var20 = (var16 + 15.99F) / 256.0F;
      ah[] var21 = new ah[8];
      float var22 = 0.0625F;
      float var23 = 0.0625F;
      float var24 = 0.625F;
      var21[0] = ah.b(-var22, 0.0, -var23);
      var21[1] = ah.b(var22, 0.0, -var23);
      var21[2] = ah.b(var22, 0.0, var23);
      var21[3] = ah.b(-var22, 0.0, var23);
      var21[4] = ah.b(-var22, var24, -var23);
      var21[5] = ah.b(var22, var24, -var23);
      var21[6] = ah.b(var22, var24, var23);
      var21[7] = ah.b(-var22, var24, var23);

      for (int var25 = 0; var25 < 8; var25++) {
         if (var7) {
            var21[var25].c -= 0.0625;
            var21[var25].a((float) Math.PI * 2.0F / 9.0F);
         } else {
            var21[var25].c += 0.0625;
            var21[var25].a((float) -Math.PI * 2.0F / 9.0F);
         }

         if (var6 == 6) {
            var21[var25].b((float) (Math.PI / 2));
         }

         if (var6 < 5) {
            var21[var25].b -= 0.375;
            var21[var25].a((float) (Math.PI / 2));
            if (var6 == 4) {
               var21[var25].b(0.0F);
            }

            if (var6 == 3) {
               var21[var25].b((float) Math.PI);
            }

            if (var6 == 2) {
               var21[var25].b((float) (Math.PI / 2));
            }

            if (var6 == 1) {
               var21[var25].b((float) (-Math.PI / 2));
            }

            var21[var25].a += var2 + 0.5;
            var21[var25].b += var3 + 0.5F;
            var21[var25].c += var4 + 0.5;
         } else {
            var21[var25].a += var2 + 0.5;
            var21[var25].b += var3 + 0.125F;
            var21[var25].c += var4 + 0.5;
         }
      }

      ah var30 = null;
      ah var26 = null;
      ah var27 = null;
      ah var28 = null;

      for (int var29 = 0; var29 < 6; var29++) {
         if (var29 == 0) {
            var17 = (var15 + 7) / 256.0F;
            var18 = (var15 + 9 - 0.01F) / 256.0F;
            var19 = (var16 + 6) / 256.0F;
            var20 = (var16 + 8 - 0.01F) / 256.0F;
         } else if (var29 == 2) {
            var17 = (var15 + 7) / 256.0F;
            var18 = (var15 + 9 - 0.01F) / 256.0F;
            var19 = (var16 + 6) / 256.0F;
            var20 = (var16 + 16 - 0.01F) / 256.0F;
         }

         if (var29 == 0) {
            var30 = var21[0];
            var26 = var21[1];
            var27 = var21[2];
            var28 = var21[3];
         } else if (var29 == 1) {
            var30 = var21[7];
            var26 = var21[6];
            var27 = var21[5];
            var28 = var21[4];
         } else if (var29 == 2) {
            var30 = var21[1];
            var26 = var21[0];
            var27 = var21[4];
            var28 = var21[5];
         } else if (var29 == 3) {
            var30 = var21[2];
            var26 = var21[1];
            var27 = var21[5];
            var28 = var21[6];
         } else if (var29 == 4) {
            var30 = var21[3];
            var26 = var21[2];
            var27 = var21[6];
            var28 = var21[7];
         } else if (var29 == 5) {
            var30 = var21[0];
            var26 = var21[3];
            var27 = var21[7];
            var28 = var21[4];
         }

         var8.a(var30.a, var30.b, var30.c, var17, var20);
         var8.a(var26.a, var26.b, var26.c, var18, var20);
         var8.a(var27.a, var27.b, var27.c, var18, var19);
         var8.a(var28.a, var28.b, var28.c, var17, var19);
      }

      return true;
   }

   public boolean d(ln var1, int var2, int var3, int var4) {
      he var5 = he.a;
      int var6 = var1.a(0);
      if (this.b >= 0) {
         var6 = this.b;
      }

      float var7 = var1.c(this.a, var2, var3, var4);
      var5.a(var7, var7, var7);
      int var8 = (var6 & 15) << 4;
      int var9 = var6 & 240;
      double var10 = var8 / 256.0F;
      double var12 = (var8 + 15.99F) / 256.0F;
      double var14 = var9 / 256.0F;
      double var16 = (var9 + 15.99F) / 256.0F;
      float var18 = 1.4F;
      if (!this.a.g(var2, var3 - 1, var4) && !ln.ar.b(this.a, var2, var3 - 1, var4)) {
         float var60 = 0.2F;
         float var20 = 0.0625F;
         if ((var2 + var3 + var4 & 1) == 1) {
            var10 = var8 / 256.0F;
            var12 = (var8 + 15.99F) / 256.0F;
            var14 = (var9 + 16) / 256.0F;
            var16 = (var9 + 15.99F + 16.0F) / 256.0F;
         }

         if ((var2 / 2 + var3 / 2 + var4 / 2 & 1) == 1) {
            double var62 = var12;
            var12 = var10;
            var10 = var62;
         }

         if (ln.ar.b(this.a, var2 - 1, var3, var4)) {
            var5.a(var2 + var60, var3 + var18 + var20, var4 + 1, var12, var14);
            var5.a(var2 + 0, var3 + 0 + var20, var4 + 1, var12, var16);
            var5.a(var2 + 0, var3 + 0 + var20, var4 + 0, var10, var16);
            var5.a(var2 + var60, var3 + var18 + var20, var4 + 0, var10, var14);
            var5.a(var2 + var60, var3 + var18 + var20, var4 + 0, var10, var14);
            var5.a(var2 + 0, var3 + 0 + var20, var4 + 0, var10, var16);
            var5.a(var2 + 0, var3 + 0 + var20, var4 + 1, var12, var16);
            var5.a(var2 + var60, var3 + var18 + var20, var4 + 1, var12, var14);
         }

         if (ln.ar.b(this.a, var2 + 1, var3, var4)) {
            var5.a(var2 + 1 - var60, var3 + var18 + var20, var4 + 0, var10, var14);
            var5.a(var2 + 1 - 0, var3 + 0 + var20, var4 + 0, var10, var16);
            var5.a(var2 + 1 - 0, var3 + 0 + var20, var4 + 1, var12, var16);
            var5.a(var2 + 1 - var60, var3 + var18 + var20, var4 + 1, var12, var14);
            var5.a(var2 + 1 - var60, var3 + var18 + var20, var4 + 1, var12, var14);
            var5.a(var2 + 1 - 0, var3 + 0 + var20, var4 + 1, var12, var16);
            var5.a(var2 + 1 - 0, var3 + 0 + var20, var4 + 0, var10, var16);
            var5.a(var2 + 1 - var60, var3 + var18 + var20, var4 + 0, var10, var14);
         }

         if (ln.ar.b(this.a, var2, var3, var4 - 1)) {
            var5.a(var2 + 0, var3 + var18 + var20, var4 + var60, var12, var14);
            var5.a(var2 + 0, var3 + 0 + var20, var4 + 0, var12, var16);
            var5.a(var2 + 1, var3 + 0 + var20, var4 + 0, var10, var16);
            var5.a(var2 + 1, var3 + var18 + var20, var4 + var60, var10, var14);
            var5.a(var2 + 1, var3 + var18 + var20, var4 + var60, var10, var14);
            var5.a(var2 + 1, var3 + 0 + var20, var4 + 0, var10, var16);
            var5.a(var2 + 0, var3 + 0 + var20, var4 + 0, var12, var16);
            var5.a(var2 + 0, var3 + var18 + var20, var4 + var60, var12, var14);
         }

         if (ln.ar.b(this.a, var2, var3, var4 + 1)) {
            var5.a(var2 + 1, var3 + var18 + var20, var4 + 1 - var60, var10, var14);
            var5.a(var2 + 1, var3 + 0 + var20, var4 + 1 - 0, var10, var16);
            var5.a(var2 + 0, var3 + 0 + var20, var4 + 1 - 0, var12, var16);
            var5.a(var2 + 0, var3 + var18 + var20, var4 + 1 - var60, var12, var14);
            var5.a(var2 + 0, var3 + var18 + var20, var4 + 1 - var60, var12, var14);
            var5.a(var2 + 0, var3 + 0 + var20, var4 + 1 - 0, var12, var16);
            var5.a(var2 + 1, var3 + 0 + var20, var4 + 1 - 0, var10, var16);
            var5.a(var2 + 1, var3 + var18 + var20, var4 + 1 - var60, var10, var14);
         }

         if (ln.ar.b(this.a, var2, var3 + 1, var4)) {
            double var63 = var2 + 0.5 + 0.5;
            double var65 = var2 + 0.5 - 0.5;
            double var67 = var4 + 0.5 + 0.5;
            double var69 = var4 + 0.5 - 0.5;
            double var71 = var2 + 0.5 - 0.5;
            double var73 = var2 + 0.5 + 0.5;
            double var75 = var4 + 0.5 - 0.5;
            double var35 = var4 + 0.5 + 0.5;
            var10 = var8 / 256.0F;
            var12 = (var8 + 15.99F) / 256.0F;
            var14 = var9 / 256.0F;
            var16 = (var9 + 15.99F) / 256.0F;
            var3++;
            var18 = -0.2F;
            if ((var2 + var3 + var4 & 1) == 0) {
               var5.a(var71, var3 + var18, var4 + 0, var12, var14);
               var5.a(var63, var3 + 0, var4 + 0, var12, var16);
               var5.a(var63, var3 + 0, var4 + 1, var10, var16);
               var5.a(var71, var3 + var18, var4 + 1, var10, var14);
               var10 = var8 / 256.0F;
               var12 = (var8 + 15.99F) / 256.0F;
               var14 = (var9 + 16) / 256.0F;
               var16 = (var9 + 15.99F + 16.0F) / 256.0F;
               var5.a(var73, var3 + var18, var4 + 1, var12, var14);
               var5.a(var65, var3 + 0, var4 + 1, var12, var16);
               var5.a(var65, var3 + 0, var4 + 0, var10, var16);
               var5.a(var73, var3 + var18, var4 + 0, var10, var14);
            } else {
               var5.a(var2 + 0, var3 + var18, var35, var12, var14);
               var5.a(var2 + 0, var3 + 0, var69, var12, var16);
               var5.a(var2 + 1, var3 + 0, var69, var10, var16);
               var5.a(var2 + 1, var3 + var18, var35, var10, var14);
               var10 = var8 / 256.0F;
               var12 = (var8 + 15.99F) / 256.0F;
               var14 = (var9 + 16) / 256.0F;
               var16 = (var9 + 15.99F + 16.0F) / 256.0F;
               var5.a(var2 + 1, var3 + var18, var75, var12, var14);
               var5.a(var2 + 1, var3 + 0, var67, var12, var16);
               var5.a(var2 + 0, var3 + 0, var67, var10, var16);
               var5.a(var2 + 0, var3 + var18, var75, var10, var14);
            }
         }
      } else {
         double var19 = var2 + 0.5 + 0.2;
         double var21 = var2 + 0.5 - 0.2;
         double var23 = var4 + 0.5 + 0.2;
         double var25 = var4 + 0.5 - 0.2;
         double var27 = var2 + 0.5 - 0.3;
         double var29 = var2 + 0.5 + 0.3;
         double var31 = var4 + 0.5 - 0.3;
         double var33 = var4 + 0.5 + 0.3;
         var5.a(var27, var3 + var18, var4 + 1, var12, var14);
         var5.a(var19, var3 + 0, var4 + 1, var12, var16);
         var5.a(var19, var3 + 0, var4 + 0, var10, var16);
         var5.a(var27, var3 + var18, var4 + 0, var10, var14);
         var5.a(var29, var3 + var18, var4 + 0, var12, var14);
         var5.a(var21, var3 + 0, var4 + 0, var12, var16);
         var5.a(var21, var3 + 0, var4 + 1, var10, var16);
         var5.a(var29, var3 + var18, var4 + 1, var10, var14);
         var10 = var8 / 256.0F;
         var12 = (var8 + 15.99F) / 256.0F;
         var14 = (var9 + 16) / 256.0F;
         var16 = (var9 + 15.99F + 16.0F) / 256.0F;
         var5.a(var2 + 1, var3 + var18, var33, var12, var14);
         var5.a(var2 + 1, var3 + 0, var25, var12, var16);
         var5.a(var2 + 0, var3 + 0, var25, var10, var16);
         var5.a(var2 + 0, var3 + var18, var33, var10, var14);
         var5.a(var2 + 0, var3 + var18, var31, var12, var14);
         var5.a(var2 + 0, var3 + 0, var23, var12, var16);
         var5.a(var2 + 1, var3 + 0, var23, var10, var16);
         var5.a(var2 + 1, var3 + var18, var31, var10, var14);
         var19 = var2 + 0.5 - 0.5;
         var21 = var2 + 0.5 + 0.5;
         var23 = var4 + 0.5 - 0.5;
         var25 = var4 + 0.5 + 0.5;
         var27 = var2 + 0.5 - 0.4;
         var29 = var2 + 0.5 + 0.4;
         var31 = var4 + 0.5 - 0.4;
         var33 = var4 + 0.5 + 0.4;
         var5.a(var27, var3 + var18, var4 + 0, var10, var14);
         var5.a(var19, var3 + 0, var4 + 0, var10, var16);
         var5.a(var19, var3 + 0, var4 + 1, var12, var16);
         var5.a(var27, var3 + var18, var4 + 1, var12, var14);
         var5.a(var29, var3 + var18, var4 + 1, var10, var14);
         var5.a(var21, var3 + 0, var4 + 1, var10, var16);
         var5.a(var21, var3 + 0, var4 + 0, var12, var16);
         var5.a(var29, var3 + var18, var4 + 0, var12, var14);
         var10 = var8 / 256.0F;
         var12 = (var8 + 15.99F) / 256.0F;
         var14 = var9 / 256.0F;
         var16 = (var9 + 15.99F) / 256.0F;
         var5.a(var2 + 0, var3 + var18, var33, var10, var14);
         var5.a(var2 + 0, var3 + 0, var25, var10, var16);
         var5.a(var2 + 1, var3 + 0, var25, var12, var16);
         var5.a(var2 + 1, var3 + var18, var33, var12, var14);
         var5.a(var2 + 1, var3 + var18, var31, var10, var14);
         var5.a(var2 + 1, var3 + 0, var23, var10, var16);
         var5.a(var2 + 0, var3 + 0, var23, var12, var16);
         var5.a(var2 + 0, var3 + var18, var31, var12, var14);
      }

      return true;
   }

   public boolean e(ln var1, int var2, int var3, int var4) {
      he var5 = he.a;
      int var6 = var1.a(1, this.a.e(var2, var3, var4));
      if (this.b >= 0) {
         var6 = this.b;
      }

      float var7 = var1.c(this.a, var2, var3, var4);
      var5.a(var7, var7, var7);
      int var8 = (var6 & 15) << 4;
      int var9 = var6 & 240;
      double var10 = var8 / 256.0F;
      double var12 = (var8 + 15.99F) / 256.0F;
      double var14 = var9 / 256.0F;
      double var16 = (var9 + 15.99F) / 256.0F;
      float var18 = 0.0F;
      float var19 = 0.03125F;
      boolean var20 = jv.b(this.a, var2 - 1, var3, var4) || !this.a.g(var2 - 1, var3, var4) && jv.b(this.a, var2 - 1, var3 - 1, var4);
      boolean var21 = jv.b(this.a, var2 + 1, var3, var4) || !this.a.g(var2 + 1, var3, var4) && jv.b(this.a, var2 + 1, var3 - 1, var4);
      boolean var22 = jv.b(this.a, var2, var3, var4 - 1) || !this.a.g(var2, var3, var4 - 1) && jv.b(this.a, var2, var3 - 1, var4 - 1);
      boolean var23 = jv.b(this.a, var2, var3, var4 + 1) || !this.a.g(var2, var3, var4 + 1) && jv.b(this.a, var2, var3 - 1, var4 + 1);
      if (!this.a.g(var2, var3 + 1, var4)) {
         if (this.a.g(var2 - 1, var3, var4) && jv.b(this.a, var2 - 1, var3 + 1, var4)) {
            var20 = true;
         }

         if (this.a.g(var2 + 1, var3, var4) && jv.b(this.a, var2 + 1, var3 + 1, var4)) {
            var21 = true;
         }

         if (this.a.g(var2, var3, var4 - 1) && jv.b(this.a, var2, var3 + 1, var4 - 1)) {
            var22 = true;
         }

         if (this.a.g(var2, var3, var4 + 1) && jv.b(this.a, var2, var3 + 1, var4 + 1)) {
            var23 = true;
         }
      }

      float var24 = 0.3125F;
      float var25 = var2 + 0;
      float var26 = var2 + 1;
      float var27 = var4 + 0;
      float var28 = var4 + 1;
      byte var29 = 0;
      if ((var20 || var21) && !var22 && !var23) {
         var29 = 1;
      }

      if ((var22 || var23) && !var21 && !var20) {
         var29 = 2;
      }

      if (var29 != 0) {
         var10 = (var8 + 16) / 256.0F;
         var12 = (var8 + 16 + 15.99F) / 256.0F;
         var14 = var9 / 256.0F;
         var16 = (var9 + 15.99F) / 256.0F;
      }

      if (var29 == 0) {
         if (var21 || var22 || var23 || var20) {
            if (!var20) {
               var25 += var24;
            }

            if (!var20) {
               var10 += var24 / 16.0F;
            }

            if (!var21) {
               var26 -= var24;
            }

            if (!var21) {
               var12 -= var24 / 16.0F;
            }

            if (!var22) {
               var27 += var24;
            }

            if (!var22) {
               var14 += var24 / 16.0F;
            }

            if (!var23) {
               var28 -= var24;
            }

            if (!var23) {
               var16 -= var24 / 16.0F;
            }
         }

         var5.a(var26 + var18, var3 + var19, var28 + var18, var12, var16);
         var5.a(var26 + var18, var3 + var19, var27 - var18, var12, var14);
         var5.a(var25 - var18, var3 + var19, var27 - var18, var10, var14);
         var5.a(var25 - var18, var3 + var19, var28 + var18, var10, var16);
      }

      if (var29 == 1) {
         var5.a(var26 + var18, var3 + var19, var28 + var18, var12, var16);
         var5.a(var26 + var18, var3 + var19, var27 - var18, var12, var14);
         var5.a(var25 - var18, var3 + var19, var27 - var18, var10, var14);
         var5.a(var25 - var18, var3 + var19, var28 + var18, var10, var16);
      }

      if (var29 == 2) {
         var5.a(var26 + var18, var3 + var19, var28 + var18, var12, var16);
         var5.a(var26 + var18, var3 + var19, var27 - var18, var10, var16);
         var5.a(var25 - var18, var3 + var19, var27 - var18, var10, var14);
         var5.a(var25 - var18, var3 + var19, var28 + var18, var12, var14);
      }

      var10 = (var8 + 16) / 256.0F;
      var12 = (var8 + 16 + 15.99F) / 256.0F;
      var14 = var9 / 256.0F;
      var16 = (var9 + 15.99F) / 256.0F;
      if (!this.a.g(var2, var3 + 1, var4)) {
         if (this.a.g(var2 - 1, var3, var4) && this.a.a(var2 - 1, var3 + 1, var4) == ln.av.ba) {
            var5.a(var2 + var19, var3 + 1 + var18, var4 + 1 + var18, var12, var14);
            var5.a(var2 + var19, var3 + 0 - var18, var4 + 1 + var18, var10, var14);
            var5.a(var2 + var19, var3 + 0 - var18, var4 + 0 - var18, var10, var16);
            var5.a(var2 + var19, var3 + 1 + var18, var4 + 0 - var18, var12, var16);
         }

         if (this.a.g(var2 + 1, var3, var4) && this.a.a(var2 + 1, var3 + 1, var4) == ln.av.ba) {
            var5.a(var2 + 1 - var19, var3 + 0 - var18, var4 + 1 + var18, var10, var16);
            var5.a(var2 + 1 - var19, var3 + 1 + var18, var4 + 1 + var18, var12, var16);
            var5.a(var2 + 1 - var19, var3 + 1 + var18, var4 + 0 - var18, var12, var14);
            var5.a(var2 + 1 - var19, var3 + 0 - var18, var4 + 0 - var18, var10, var14);
         }

         if (this.a.g(var2, var3, var4 - 1) && this.a.a(var2, var3 + 1, var4 - 1) == ln.av.ba) {
            var5.a(var2 + 1 + var18, var3 + 0 - var18, var4 + var19, var10, var16);
            var5.a(var2 + 1 + var18, var3 + 1 + var18, var4 + var19, var12, var16);
            var5.a(var2 + 0 - var18, var3 + 1 + var18, var4 + var19, var12, var14);
            var5.a(var2 + 0 - var18, var3 + 0 - var18, var4 + var19, var10, var14);
         }

         if (this.a.g(var2, var3, var4 + 1) && this.a.a(var2, var3 + 1, var4 + 1) == ln.av.ba) {
            var5.a(var2 + 1 + var18, var3 + 1 + var18, var4 + 1 - var19, var12, var14);
            var5.a(var2 + 1 + var18, var3 + 0 - var18, var4 + 1 - var19, var10, var14);
            var5.a(var2 + 0 - var18, var3 + 0 - var18, var4 + 1 - var19, var10, var16);
            var5.a(var2 + 0 - var18, var3 + 1 + var18, var4 + 1 - var19, var12, var16);
         }
      }

      return true;
   }

   public boolean f(ln var1, int var2, int var3, int var4) {
      he var5 = he.a;
      int var6 = this.a.e(var2, var3, var4);
      int var7 = var1.a(0, var6);
      if (this.b >= 0) {
         var7 = this.b;
      }

      float var8 = var1.c(this.a, var2, var3, var4);
      var5.a(var8, var8, var8);
      int var9 = (var7 & 15) << 4;
      int var10 = var7 & 240;
      double var11 = var9 / 256.0F;
      double var13 = (var9 + 15.99F) / 256.0F;
      double var15 = var10 / 256.0F;
      double var17 = (var10 + 15.99F) / 256.0F;
      float var19 = 0.0625F;
      float var20 = var2 + 1;
      float var21 = var2 + 1;
      float var22 = var2 + 0;
      float var23 = var2 + 0;
      float var24 = var4 + 0;
      float var25 = var4 + 1;
      float var26 = var4 + 1;
      float var27 = var4 + 0;
      float var28 = var3 + var19;
      float var29 = var3 + var19;
      float var30 = var3 + var19;
      float var31 = var3 + var19;
      if (var6 == 1 || var6 == 2 || var6 == 3 || var6 == 7) {
         var20 = var23 = var2 + 1;
         var21 = var22 = var2 + 0;
         var24 = var25 = var4 + 1;
         var26 = var27 = var4 + 0;
      } else if (var6 == 8) {
         var20 = var21 = var2 + 0;
         var22 = var23 = var2 + 1;
         var24 = var27 = var4 + 1;
         var25 = var26 = var4 + 0;
      } else if (var6 == 9) {
         var20 = var23 = var2 + 0;
         var21 = var22 = var2 + 1;
         var24 = var25 = var4 + 0;
         var26 = var27 = var4 + 1;
      }

      if (var6 == 2 || var6 == 4) {
         var28++;
         var31++;
      } else if (var6 == 3 || var6 == 5) {
         var29++;
         var30++;
      }

      var5.a(var20, var28, var24, var13, var15);
      var5.a(var21, var29, var25, var13, var17);
      var5.a(var22, var30, var26, var11, var17);
      var5.a(var23, var31, var27, var11, var15);
      var5.a(var23, var31, var27, var11, var15);
      var5.a(var22, var30, var26, var11, var17);
      var5.a(var21, var29, var25, var13, var17);
      var5.a(var20, var28, var24, var13, var15);
      return true;
   }

   public boolean g(ln var1, int var2, int var3, int var4) {
      he var5 = he.a;
      int var6 = var1.a(0);
      if (this.b >= 0) {
         var6 = this.b;
      }

      float var7 = var1.c(this.a, var2, var3, var4);
      var5.a(var7, var7, var7);
      int var8 = (var6 & 15) << 4;
      int var9 = var6 & 240;
      double var10 = var8 / 256.0F;
      double var12 = (var8 + 15.99F) / 256.0F;
      double var14 = var9 / 256.0F;
      double var16 = (var9 + 15.99F) / 256.0F;
      int var18 = this.a.e(var2, var3, var4);
      float var19 = 0.0F;
      float var20 = 0.05F;
      if (var18 == 5) {
         var5.a(var2 + var20, var3 + 1 + var19, var4 + 1 + var19, var10, var14);
         var5.a(var2 + var20, var3 + 0 - var19, var4 + 1 + var19, var10, var16);
         var5.a(var2 + var20, var3 + 0 - var19, var4 + 0 - var19, var12, var16);
         var5.a(var2 + var20, var3 + 1 + var19, var4 + 0 - var19, var12, var14);
      }

      if (var18 == 4) {
         var5.a(var2 + 1 - var20, var3 + 0 - var19, var4 + 1 + var19, var12, var16);
         var5.a(var2 + 1 - var20, var3 + 1 + var19, var4 + 1 + var19, var12, var14);
         var5.a(var2 + 1 - var20, var3 + 1 + var19, var4 + 0 - var19, var10, var14);
         var5.a(var2 + 1 - var20, var3 + 0 - var19, var4 + 0 - var19, var10, var16);
      }

      if (var18 == 3) {
         var5.a(var2 + 1 + var19, var3 + 0 - var19, var4 + var20, var12, var16);
         var5.a(var2 + 1 + var19, var3 + 1 + var19, var4 + var20, var12, var14);
         var5.a(var2 + 0 - var19, var3 + 1 + var19, var4 + var20, var10, var14);
         var5.a(var2 + 0 - var19, var3 + 0 - var19, var4 + var20, var10, var16);
      }

      if (var18 == 2) {
         var5.a(var2 + 1 + var19, var3 + 1 + var19, var4 + 1 - var20, var10, var14);
         var5.a(var2 + 1 + var19, var3 + 0 - var19, var4 + 1 - var20, var10, var16);
         var5.a(var2 + 0 - var19, var3 + 0 - var19, var4 + 1 - var20, var12, var16);
         var5.a(var2 + 0 - var19, var3 + 1 + var19, var4 + 1 - var20, var12, var14);
      }

      return true;
   }

   public boolean h(ln var1, int var2, int var3, int var4) {
      he var5 = he.a;
      float var6 = var1.c(this.a, var2, var3, var4);
      var5.a(var6, var6, var6);
      this.a(var1, this.a.e(var2, var3, var4), (double)var2, (double)var3, (double)var4);
      return true;
   }

   public boolean i(ln var1, int var2, int var3, int var4) {
      he var5 = he.a;
      float var6 = var1.c(this.a, var2, var3, var4);
      var5.a(var6, var6, var6);
      this.b(var1, this.a.e(var2, var3, var4), var2, var3 - 0.0625F, var4);
      return true;
   }

   public void a(ln var1, double var2, double var4, double var6, double var8, double var10) {
      he var12 = he.a;
      int var13 = var1.a(0);
      if (this.b >= 0) {
         var13 = this.b;
      }

      int var14 = (var13 & 15) << 4;
      int var15 = var13 & 240;
      float var16 = var14 / 256.0F;
      float var17 = (var14 + 15.99F) / 256.0F;
      float var18 = var15 / 256.0F;
      float var19 = (var15 + 15.99F) / 256.0F;
      double var20 = var16 + 0.02734375;
      double var22 = var18 + 0.0234375;
      double var24 = var16 + 0.03515625;
      double var26 = var18 + 0.03125;
      var2 += 0.5;
      var6 += 0.5;
      double var28 = var2 - 0.5;
      double var30 = var2 + 0.5;
      double var32 = var6 - 0.5;
      double var34 = var6 + 0.5;
      double var36 = 0.0625;
      double var38 = 0.625;
      var12.a(var2 + var8 * (1.0 - var38) - var36, var4 + var38, var6 + var10 * (1.0 - var38) - var36, var20, var22);
      var12.a(var2 + var8 * (1.0 - var38) - var36, var4 + var38, var6 + var10 * (1.0 - var38) + var36, var20, var26);
      var12.a(var2 + var8 * (1.0 - var38) + var36, var4 + var38, var6 + var10 * (1.0 - var38) + var36, var24, var26);
      var12.a(var2 + var8 * (1.0 - var38) + var36, var4 + var38, var6 + var10 * (1.0 - var38) - var36, var24, var22);
      var12.a(var2 - var36, var4 + 1.0, var32, var16, var18);
      var12.a(var2 - var36 + var8, var4 + 0.0, var32 + var10, var16, var19);
      var12.a(var2 - var36 + var8, var4 + 0.0, var34 + var10, var17, var19);
      var12.a(var2 - var36, var4 + 1.0, var34, var17, var18);
      var12.a(var2 + var36, var4 + 1.0, var34, var16, var18);
      var12.a(var2 + var8 + var36, var4 + 0.0, var34 + var10, var16, var19);
      var12.a(var2 + var8 + var36, var4 + 0.0, var32 + var10, var17, var19);
      var12.a(var2 + var36, var4 + 1.0, var32, var17, var18);
      var12.a(var28, var4 + 1.0, var6 + var36, var16, var18);
      var12.a(var28 + var8, var4 + 0.0, var6 + var36 + var10, var16, var19);
      var12.a(var30 + var8, var4 + 0.0, var6 + var36 + var10, var17, var19);
      var12.a(var30, var4 + 1.0, var6 + var36, var17, var18);
      var12.a(var30, var4 + 1.0, var6 - var36, var16, var18);
      var12.a(var30 + var8, var4 + 0.0, var6 - var36 + var10, var16, var19);
      var12.a(var28 + var8, var4 + 0.0, var6 - var36 + var10, var17, var19);
      var12.a(var28, var4 + 1.0, var6 - var36, var17, var18);
   }

   public void a(ln var1, int var2, double var3, double var5, double var7) {
      he var9 = he.a;
      int var10 = var1.a(0, var2);
      if (this.b >= 0) {
         var10 = this.b;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 240;
      double var13 = var11 / 256.0F;
      double var15 = (var11 + 15.99F) / 256.0F;
      double var17 = var12 / 256.0F;
      double var19 = (var12 + 15.99F) / 256.0F;
      double var21 = var3 + 0.5 - 0.45F;
      double var23 = var3 + 0.5 + 0.45F;
      double var25 = var7 + 0.5 - 0.45F;
      double var27 = var7 + 0.5 + 0.45F;
      var9.a(var21, var5 + 1.0, var25, var13, var17);
      var9.a(var21, var5 + 0.0, var25, var13, var19);
      var9.a(var23, var5 + 0.0, var27, var15, var19);
      var9.a(var23, var5 + 1.0, var27, var15, var17);
      var9.a(var23, var5 + 1.0, var27, var13, var17);
      var9.a(var23, var5 + 0.0, var27, var13, var19);
      var9.a(var21, var5 + 0.0, var25, var15, var19);
      var9.a(var21, var5 + 1.0, var25, var15, var17);
      var9.a(var21, var5 + 1.0, var27, var13, var17);
      var9.a(var21, var5 + 0.0, var27, var13, var19);
      var9.a(var23, var5 + 0.0, var25, var15, var19);
      var9.a(var23, var5 + 1.0, var25, var15, var17);
      var9.a(var23, var5 + 1.0, var25, var13, var17);
      var9.a(var23, var5 + 0.0, var25, var13, var19);
      var9.a(var21, var5 + 0.0, var27, var15, var19);
      var9.a(var21, var5 + 1.0, var27, var15, var17);
   }

   public void b(ln var1, int var2, double var3, double var5, double var7) {
      he var9 = he.a;
      int var10 = var1.a(0, var2);
      if (this.b >= 0) {
         var10 = this.b;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 240;
      double var13 = var11 / 256.0F;
      double var15 = (var11 + 15.99F) / 256.0F;
      double var17 = var12 / 256.0F;
      double var19 = (var12 + 15.99F) / 256.0F;
      double var21 = var3 + 0.5 - 0.25;
      double var23 = var3 + 0.5 + 0.25;
      double var25 = var7 + 0.5 - 0.5;
      double var27 = var7 + 0.5 + 0.5;
      var9.a(var21, var5 + 1.0, var25, var13, var17);
      var9.a(var21, var5 + 0.0, var25, var13, var19);
      var9.a(var21, var5 + 0.0, var27, var15, var19);
      var9.a(var21, var5 + 1.0, var27, var15, var17);
      var9.a(var21, var5 + 1.0, var27, var13, var17);
      var9.a(var21, var5 + 0.0, var27, var13, var19);
      var9.a(var21, var5 + 0.0, var25, var15, var19);
      var9.a(var21, var5 + 1.0, var25, var15, var17);
      var9.a(var23, var5 + 1.0, var27, var13, var17);
      var9.a(var23, var5 + 0.0, var27, var13, var19);
      var9.a(var23, var5 + 0.0, var25, var15, var19);
      var9.a(var23, var5 + 1.0, var25, var15, var17);
      var9.a(var23, var5 + 1.0, var25, var13, var17);
      var9.a(var23, var5 + 0.0, var25, var13, var19);
      var9.a(var23, var5 + 0.0, var27, var15, var19);
      var9.a(var23, var5 + 1.0, var27, var15, var17);
      var21 = var3 + 0.5 - 0.5;
      var23 = var3 + 0.5 + 0.5;
      var25 = var7 + 0.5 - 0.25;
      var27 = var7 + 0.5 + 0.25;
      var9.a(var21, var5 + 1.0, var25, var13, var17);
      var9.a(var21, var5 + 0.0, var25, var13, var19);
      var9.a(var23, var5 + 0.0, var25, var15, var19);
      var9.a(var23, var5 + 1.0, var25, var15, var17);
      var9.a(var23, var5 + 1.0, var25, var13, var17);
      var9.a(var23, var5 + 0.0, var25, var13, var19);
      var9.a(var21, var5 + 0.0, var25, var15, var19);
      var9.a(var21, var5 + 1.0, var25, var15, var17);
      var9.a(var23, var5 + 1.0, var27, var13, var17);
      var9.a(var23, var5 + 0.0, var27, var13, var19);
      var9.a(var21, var5 + 0.0, var27, var15, var19);
      var9.a(var21, var5 + 1.0, var27, var15, var17);
      var9.a(var21, var5 + 1.0, var27, var13, var17);
      var9.a(var21, var5 + 0.0, var27, var13, var19);
      var9.a(var23, var5 + 0.0, var27, var15, var19);
      var9.a(var23, var5 + 1.0, var27, var15, var17);
   }

   public boolean j(ln var1, int var2, int var3, int var4) {
      he var5 = he.a;
      boolean var6 = var1.c(this.a, var2, var3 + 1, var4, 1);
      boolean var7 = var1.c(this.a, var2, var3 - 1, var4, 0);
      boolean[] var8 = new boolean[]{
         var1.c(this.a, var2, var3, var4 - 1, 2),
         var1.c(this.a, var2, var3, var4 + 1, 3),
         var1.c(this.a, var2 - 1, var3, var4, 4),
         var1.c(this.a, var2 + 1, var3, var4, 5)
      };
      if (!var6 && !var7 && !var8[0] && !var8[1] && !var8[2] && !var8[3]) {
         return false;
      }

      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      double var14 = 0.0;
      double var16 = 1.0;
      fs var18 = var1.bl;
      int var19 = this.a.e(var2, var3, var4);
      float var20 = this.a(var2, var3, var4, var18);
      float var21 = this.a(var2, var3, var4 + 1, var18);
      float var22 = this.a(var2 + 1, var3, var4 + 1, var18);
      float var23 = this.a(var2 + 1, var3, var4, var18);
      if (this.d || var6) {
         var9 = true;
         int var24 = var1.a(1, var19);
         float var25 = (float)jf.a(this.a, var2, var3, var4, var18);
         if (var25 > -999.0F) {
            var24 = var1.a(2, var19);
         }

         int var26 = (var24 & 15) << 4;
         int var27 = var24 & 240;
         double var28 = (var26 + 8.0) / 256.0;
         double var30 = (var27 + 8.0) / 256.0;
         if (var25 < -999.0F) {
            var25 = 0.0F;
         } else {
            var28 = (var26 + 16) / 256.0F;
            var30 = (var27 + 16) / 256.0F;
         }

         float var32 = ei.a(var25) * 8.0F / 256.0F;
         float var33 = ei.b(var25) * 8.0F / 256.0F;
         float var34 = var1.c(this.a, var2, var3, var4);
         var5.a(var11 * var34, var11 * var34, var11 * var34);
         var5.a(var2 + 0, var3 + var20, var4 + 0, var28 - var33 - var32, var30 - var33 + var32);
         var5.a(var2 + 0, var3 + var21, var4 + 1, var28 - var33 + var32, var30 + var33 + var32);
         var5.a(var2 + 1, var3 + var22, var4 + 1, var28 + var33 + var32, var30 + var33 - var32);
         var5.a(var2 + 1, var3 + var23, var4 + 0, var28 + var33 - var32, var30 - var33 - var32);
      }

      if (this.d || var7) {
         float var48 = var1.c(this.a, var2, var3 - 1, var4);
         var5.a(var10 * var48, var10 * var48, var10 * var48);
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.a(0));
         var9 = true;
      }

      for (int var49 = 0; var49 < 4; var49++) {
         int var50 = var2;
         int var51 = var3;
         int var52 = var4;
         if (var49 == 0) {
            var52--;
         }

         if (var49 == 1) {
            var52++;
         }

         if (var49 == 2) {
            var50--;
         }

         if (var49 == 3) {
            var50++;
         }

         int var53 = var1.a(var49 + 2, var19);
         int var29 = (var53 & 15) << 4;
         int var54 = var53 & 240;
         if (this.d || var8[var49]) {
            float var31;
            float var35;
            float var36;
            float var55;
            float var56;
            float var57;
            if (var49 == 0) {
               var31 = var20;
               var55 = var23;
               var56 = var2;
               var35 = var2 + 1;
               var57 = var4;
               var36 = var4;
            } else if (var49 == 1) {
               var31 = var22;
               var55 = var21;
               var56 = var2 + 1;
               var35 = var2;
               var57 = var4 + 1;
               var36 = var4 + 1;
            } else if (var49 == 2) {
               var31 = var21;
               var55 = var20;
               var56 = var2;
               var35 = var2;
               var57 = var4 + 1;
               var36 = var4;
            } else {
               var31 = var23;
               var55 = var22;
               var56 = var2 + 1;
               var35 = var2 + 1;
               var57 = var4;
               var36 = var4 + 1;
            }

            var9 = true;
            double var37 = (var29 + 0) / 256.0F;
            double var39 = (var29 + 16 - 0.01) / 256.0;
            double var41 = (var54 + (1.0F - var31) * 16.0F) / 256.0F;
            double var43 = (var54 + (1.0F - var55) * 16.0F) / 256.0F;
            double var45 = (var54 + 16 - 0.01) / 256.0;
            float var47 = var1.c(this.a, var50, var51, var52);
            if (var49 < 2) {
               var47 *= var12;
            } else {
               var47 *= var13;
            }

            var5.a(var11 * var47, var11 * var47, var11 * var47);
            var5.a(var56, var3 + var31, var57, var37, var41);
            var5.a(var35, var3 + var55, var36, var39, var43);
            var5.a(var35, var3 + 0, var36, var39, var45);
            var5.a(var56, var3 + 0, var57, var37, var45);
         }
      }

      var1.be = var14;
      var1.bh = var16;
      return var9;
   }

   private float a(int var1, int var2, int var3, fs var4) {
      int var5 = 0;
      float var6 = 0.0F;

      for (int var7 = 0; var7 < 4; var7++) {
         int var8 = var1 - (var7 & 1);
         int var9 = var2;
         int var10 = var3 - (var7 >> 1 & 1);
         if (this.a.f(var8, var9 + 1, var10) == var4) {
            return 1.0F;
         }

         fs var11 = this.a.f(var8, var9, var10);
         if (var11 == var4) {
            int var12 = this.a.e(var8, var9, var10);
            if (var12 >= 8 || var12 == 0) {
               var6 += jf.b(var12) * 10.0F;
               var5 += 10;
            }

            var6 += jf.b(var12);
            var5++;
         } else if (!var11.a()) {
            var6++;
            var5++;
         }
      }

      return 1.0F - var6 / var5;
   }

   public void a(ln var1, cj var2, int var3, int var4, int var5) {
      float var6 = 0.5F;
      float var7 = 1.0F;
      float var8 = 0.8F;
      float var9 = 0.6F;
      he var10 = he.a;
      var10.b();
      float var11 = var1.c((mz)var2, var3, var4, var5);
      float var12 = var1.c((mz)var2, var3, var4 - 1, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var6 * var12, var6 * var12, var6 * var12);
      this.a(var1, -0.5, -0.5, -0.5, var1.a(0));
      var12 = var1.c((mz)var2, var3, var4 + 1, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var7 * var12, var7 * var12, var7 * var12);
      this.b(var1, -0.5, -0.5, -0.5, var1.a(1));
      var12 = var1.c((mz)var2, var3, var4, var5 - 1);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var8 * var12, var8 * var12, var8 * var12);
      this.c(var1, -0.5, -0.5, -0.5, var1.a(2));
      var12 = var1.c((mz)var2, var3, var4, var5 + 1);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var8 * var12, var8 * var12, var8 * var12);
      this.d(var1, -0.5, -0.5, -0.5, var1.a(3));
      var12 = var1.c((mz)var2, var3 - 1, var4, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var9 * var12, var9 * var12, var9 * var12);
      this.e(var1, -0.5, -0.5, -0.5, var1.a(4));
      var12 = var1.c((mz)var2, var3 + 1, var4, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var9 * var12, var9 * var12, var9 * var12);
      this.f(var1, -0.5, -0.5, -0.5, var1.a(5));
      var10.a();
   }

   public boolean k(ln var1, int var2, int var3, int var4) {
      int var5 = var1.d(this.a, var2, var3, var4);
      float var6 = (var5 >> 16 & 0xFF) / 255.0F;
      float var7 = (var5 >> 8 & 0xFF) / 255.0F;
      float var8 = (var5 & 0xFF) / 255.0F;
      return this.a(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean a(ln var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      he var8 = he.a;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var10 * var5;
      float var15 = var11 * var5;
      float var16 = var12 * var5;
      float var17 = var13 * var5;
      float var18 = var10 * var6;
      float var19 = var11 * var6;
      float var20 = var12 * var6;
      float var21 = var13 * var6;
      float var22 = var10 * var7;
      float var23 = var11 * var7;
      float var24 = var12 * var7;
      float var25 = var13 * var7;
      float var26 = var1.c(this.a, var2, var3, var4);
      if (this.d || var1.c(this.a, var2, var3 - 1, var4, 0)) {
         float var27 = var1.c(this.a, var2, var3 - 1, var4);
         var8.a(var14 * var27, var18 * var27, var22 * var27);
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.a(this.a, var2, var3, var4, 0));
         var9 = true;
      }

      if (this.d || var1.c(this.a, var2, var3 + 1, var4, 1)) {
         float var28 = var1.c(this.a, var2, var3 + 1, var4);
         if (var1.bh != 1.0 && !var1.bl.d()) {
            var28 = var26;
         }

         var8.a(var15 * var28, var19 * var28, var23 * var28);
         this.b(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 1));
         var9 = true;
      }

      if (this.d || var1.c(this.a, var2, var3, var4 - 1, 2)) {
         float var29 = var1.c(this.a, var2, var3, var4 - 1);
         if (var1.bf > 0.0) {
            var29 = var26;
         }

         var8.a(var16 * var29, var20 * var29, var24 * var29);
         this.c(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 2));
         var9 = true;
      }

      if (this.d || var1.c(this.a, var2, var3, var4 + 1, 3)) {
         float var30 = var1.c(this.a, var2, var3, var4 + 1);
         if (var1.bi < 1.0) {
            var30 = var26;
         }

         var8.a(var16 * var30, var20 * var30, var24 * var30);
         this.d(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 3));
         var9 = true;
      }

      if (this.d || var1.c(this.a, var2 - 1, var3, var4, 4)) {
         float var31 = var1.c(this.a, var2 - 1, var3, var4);
         if (var1.bd > 0.0) {
            var31 = var26;
         }

         var8.a(var17 * var31, var21 * var31, var25 * var31);
         this.e(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 4));
         var9 = true;
      }

      if (this.d || var1.c(this.a, var2 + 1, var3, var4, 5)) {
         float var32 = var1.c(this.a, var2 + 1, var3, var4);
         if (var1.bg < 1.0) {
            var32 = var26;
         }

         var8.a(var17 * var32, var21 * var32, var25 * var32);
         this.f(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 5));
         var9 = true;
      }

      return var9;
   }

   public boolean l(ln var1, int var2, int var3, int var4) {
      int var5 = var1.d(this.a, var2, var3, var4);
      float var6 = (var5 >> 16 & 0xFF) / 255.0F;
      float var7 = (var5 >> 8 & 0xFF) / 255.0F;
      float var8 = (var5 & 0xFF) / 255.0F;
      return this.b(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean b(ln var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      he var8 = he.a;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var10 * var5;
      float var15 = var11 * var5;
      float var16 = var12 * var5;
      float var17 = var13 * var5;
      float var18 = var10 * var6;
      float var19 = var11 * var6;
      float var20 = var12 * var6;
      float var21 = var13 * var6;
      float var22 = var10 * var7;
      float var23 = var11 * var7;
      float var24 = var12 * var7;
      float var25 = var13 * var7;
      float var26 = 0.0625F;
      float var27 = var1.c(this.a, var2, var3, var4);
      if (this.d || var1.c(this.a, var2, var3 - 1, var4, 0)) {
         float var28 = var1.c(this.a, var2, var3 - 1, var4);
         var8.a(var14 * var28, var18 * var28, var22 * var28);
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.a(this.a, var2, var3, var4, 0));
         var9 = true;
      }

      if (this.d || var1.c(this.a, var2, var3 + 1, var4, 1)) {
         float var29 = var1.c(this.a, var2, var3 + 1, var4);
         if (var1.bh != 1.0 && !var1.bl.d()) {
            var29 = var27;
         }

         var8.a(var15 * var29, var19 * var29, var23 * var29);
         this.b(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 1));
         var9 = true;
      }

      if (this.d || var1.c(this.a, var2, var3, var4 - 1, 2)) {
         float var30 = var1.c(this.a, var2, var3, var4 - 1);
         if (var1.bf > 0.0) {
            var30 = var27;
         }

         var8.a(var16 * var30, var20 * var30, var24 * var30);
         var8.c(0.0F, 0.0F, var26);
         this.c(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 2));
         var8.c(0.0F, 0.0F, -var26);
         var9 = true;
      }

      if (this.d || var1.c(this.a, var2, var3, var4 + 1, 3)) {
         float var31 = var1.c(this.a, var2, var3, var4 + 1);
         if (var1.bi < 1.0) {
            var31 = var27;
         }

         var8.a(var16 * var31, var20 * var31, var24 * var31);
         var8.c(0.0F, 0.0F, -var26);
         this.d(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 3));
         var8.c(0.0F, 0.0F, var26);
         var9 = true;
      }

      if (this.d || var1.c(this.a, var2 - 1, var3, var4, 4)) {
         float var32 = var1.c(this.a, var2 - 1, var3, var4);
         if (var1.bd > 0.0) {
            var32 = var27;
         }

         var8.a(var17 * var32, var21 * var32, var25 * var32);
         var8.c(var26, 0.0F, 0.0F);
         this.e(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 4));
         var8.c(-var26, 0.0F, 0.0F);
         var9 = true;
      }

      if (this.d || var1.c(this.a, var2 + 1, var3, var4, 5)) {
         float var33 = var1.c(this.a, var2 + 1, var3, var4);
         if (var1.bg < 1.0) {
            var33 = var27;
         }

         var8.a(var17 * var33, var21 * var33, var25 * var33);
         var8.c(-var26, 0.0F, 0.0F);
         this.f(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 5));
         var8.c(var26, 0.0F, 0.0F);
         var9 = true;
      }

      return var9;
   }

   public boolean m(ln var1, int var2, int var3, int var4) {
      boolean var5 = false;
      float var6 = 0.375F;
      float var7 = 0.625F;
      var1.a(var6, 0.0F, var6, var7, 1.0F, var7);
      this.k(var1, var2, var3, var4);
      boolean var8 = false;
      boolean var9 = false;
      if (this.a.a(var2 - 1, var3, var4) == var1.ba || this.a.a(var2 + 1, var3, var4) == var1.ba) {
         var8 = true;
      }

      if (this.a.a(var2, var3, var4 - 1) == var1.ba || this.a.a(var2, var3, var4 + 1) == var1.ba) {
         var9 = true;
      }

      if (!var8 && !var9) {
         var8 = true;
      }

      var6 = 0.4375F;
      var7 = 0.5625F;
      float var10 = 0.75F;
      float var11 = 0.9375F;
      if (var8) {
         var1.a(0.0F, var10, var6, 1.0F, var11, var7);
         this.k(var1, var2, var3, var4);
      }

      if (var9) {
         var1.a(var6, var10, 0.0F, var7, var11, 1.0F);
         this.k(var1, var2, var3, var4);
      }

      var10 = 0.375F;
      var11 = 0.5625F;
      if (var8) {
         var1.a(0.0F, var10, var6, 1.0F, var11, var7);
         this.k(var1, var2, var3, var4);
      }

      if (var9) {
         var1.a(var6, var10, 0.0F, var7, var11, 1.0F);
         this.k(var1, var2, var3, var4);
      }

      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean n(ln var1, int var2, int var3, int var4) {
      boolean var5 = false;
      int var6 = this.a.e(var2, var3, var4);
      if (var6 == 0) {
         var1.a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         this.k(var1, var2, var3, var4);
         var1.a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         this.k(var1, var2, var3, var4);
      } else if (var6 == 1) {
         var1.a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         this.k(var1, var2, var3, var4);
         var1.a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         this.k(var1, var2, var3, var4);
      } else if (var6 == 2) {
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         this.k(var1, var2, var3, var4);
         var1.a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         this.k(var1, var2, var3, var4);
      } else if (var6 == 3) {
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         this.k(var1, var2, var3, var4);
         var1.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         this.k(var1, var2, var3, var4);
      }

      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean o(ln var1, int var2, int var3, int var4) {
      he var5 = he.a;
      fn var6 = (fn)var1;
      boolean var7 = false;
      float var8 = 0.5F;
      float var9 = 1.0F;
      float var10 = 0.8F;
      float var11 = 0.6F;
      float var12 = var1.c(this.a, var2, var3, var4);
      float var13 = var1.c(this.a, var2, var3 - 1, var4);
      if (var6.be > 0.0) {
         var13 = var12;
      }

      if (ln.s[var1.ba] > 0) {
         var13 = 1.0F;
      }

      var5.a(var8 * var13, var8 * var13, var8 * var13);
      this.a(var1, (double)var2, (double)var3, (double)var4, var1.a(this.a, var2, var3, var4, 0));
      var7 = true;
      var13 = var1.c(this.a, var2, var3 + 1, var4);
      if (var6.bh < 1.0) {
         var13 = var12;
      }

      if (ln.s[var1.ba] > 0) {
         var13 = 1.0F;
      }

      var5.a(var9 * var13, var9 * var13, var9 * var13);
      this.b(var1, var2, var3, var4, var1.a(this.a, var2, var3, var4, 1));
      var7 = true;
      var13 = var1.c(this.a, var2, var3, var4 - 1);
      if (var6.bf > 0.0) {
         var13 = var12;
      }

      if (ln.s[var1.ba] > 0) {
         var13 = 1.0F;
      }

      var5.a(var10 * var13, var10 * var13, var10 * var13);
      int var14 = var1.a(this.a, var2, var3, var4, 2);
      if (var14 < 0) {
         this.c = true;
         var14 = -var14;
      }

      this.c(var1, var2, var3, var4, var14);
      var7 = true;
      this.c = false;
      var13 = var1.c(this.a, var2, var3, var4 + 1);
      if (var6.bi < 1.0) {
         var13 = var12;
      }

      if (ln.s[var1.ba] > 0) {
         var13 = 1.0F;
      }

      var5.a(var10 * var13, var10 * var13, var10 * var13);
      var14 = var1.a(this.a, var2, var3, var4, 3);
      if (var14 < 0) {
         this.c = true;
         var14 = -var14;
      }

      this.d(var1, var2, var3, var4, var14);
      var7 = true;
      this.c = false;
      var13 = var1.c(this.a, var2 - 1, var3, var4);
      if (var6.bd > 0.0) {
         var13 = var12;
      }

      if (ln.s[var1.ba] > 0) {
         var13 = 1.0F;
      }

      var5.a(var11 * var13, var11 * var13, var11 * var13);
      var14 = var1.a(this.a, var2, var3, var4, 4);
      if (var14 < 0) {
         this.c = true;
         var14 = -var14;
      }

      this.e(var1, var2, var3, var4, var14);
      var7 = true;
      this.c = false;
      var13 = var1.c(this.a, var2 + 1, var3, var4);
      if (var6.bg < 1.0) {
         var13 = var12;
      }

      if (ln.s[var1.ba] > 0) {
         var13 = 1.0F;
      }

      var5.a(var11 * var13, var11 * var13, var11 * var13);
      var14 = var1.a(this.a, var2, var3, var4, 5);
      if (var14 < 0) {
         this.c = true;
         var14 = -var14;
      }

      this.f(var1, var2, var3, var4, var14);
      var7 = true;
      this.c = false;
      return var7;
   }

   public void a(ln var1, double var2, double var4, double var6, int var8) {
      he var9 = he.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = (var10 + var1.bd * 16.0) / 256.0;
      double var14 = (var10 + var1.bg * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.bf * 16.0) / 256.0;
      double var18 = (var11 + var1.bi * 16.0 - 0.01) / 256.0;
      if (var1.bd < 0.0 || var1.bg > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.bf < 0.0 || var1.bi > 1.0) {
         var16 = (var11 + 0.0F) / 256.0F;
         var18 = (var11 + 15.99F) / 256.0F;
      }

      double var20 = var2 + var1.bd;
      double var22 = var2 + var1.bg;
      double var24 = var4 + var1.be;
      double var26 = var6 + var1.bf;
      double var28 = var6 + var1.bi;
      var9.a(var20, var24, var28, var12, var18);
      var9.a(var20, var24, var26, var12, var16);
      var9.a(var22, var24, var26, var14, var16);
      var9.a(var22, var24, var28, var14, var18);
   }

   public void b(ln var1, double var2, double var4, double var6, int var8) {
      he var9 = he.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = (var10 + var1.bd * 16.0) / 256.0;
      double var14 = (var10 + var1.bg * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.bf * 16.0) / 256.0;
      double var18 = (var11 + var1.bi * 16.0 - 0.01) / 256.0;
      if (var1.bd < 0.0 || var1.bg > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.bf < 0.0 || var1.bi > 1.0) {
         var16 = (var11 + 0.0F) / 256.0F;
         var18 = (var11 + 15.99F) / 256.0F;
      }

      double var20 = var2 + var1.bd;
      double var22 = var2 + var1.bg;
      double var24 = var4 + var1.bh;
      double var26 = var6 + var1.bf;
      double var28 = var6 + var1.bi;
      var9.a(var22, var24, var28, var14, var18);
      var9.a(var22, var24, var26, var14, var16);
      var9.a(var20, var24, var26, var12, var16);
      var9.a(var20, var24, var28, var12, var18);
   }

   public void c(ln var1, double var2, double var4, double var6, int var8) {
      he var9 = he.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = (var10 + var1.bd * 16.0) / 256.0;
      double var14 = (var10 + var1.bg * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.be * 16.0) / 256.0;
      double var18 = (var11 + var1.bh * 16.0 - 0.01) / 256.0;
      if (this.c) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bd < 0.0 || var1.bg > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.be < 0.0 || var1.bh > 1.0) {
         var16 = (var11 + 0.0F) / 256.0F;
         var18 = (var11 + 15.99F) / 256.0F;
      }

      double var30 = var2 + var1.bd;
      double var22 = var2 + var1.bg;
      double var24 = var4 + var1.be;
      double var26 = var4 + var1.bh;
      double var28 = var6 + var1.bf;
      var9.a(var30, var26, var28, var14, var16);
      var9.a(var22, var26, var28, var12, var16);
      var9.a(var22, var24, var28, var12, var18);
      var9.a(var30, var24, var28, var14, var18);
   }

   public void d(ln var1, double var2, double var4, double var6, int var8) {
      he var9 = he.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = (var10 + var1.bd * 16.0) / 256.0;
      double var14 = (var10 + var1.bg * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.be * 16.0) / 256.0;
      double var18 = (var11 + var1.bh * 16.0 - 0.01) / 256.0;
      if (this.c) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bd < 0.0 || var1.bg > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.be < 0.0 || var1.bh > 1.0) {
         var16 = (var11 + 0.0F) / 256.0F;
         var18 = (var11 + 15.99F) / 256.0F;
      }

      double var30 = var2 + var1.bd;
      double var22 = var2 + var1.bg;
      double var24 = var4 + var1.be;
      double var26 = var4 + var1.bh;
      double var28 = var6 + var1.bi;
      var9.a(var30, var26, var28, var12, var16);
      var9.a(var30, var24, var28, var12, var18);
      var9.a(var22, var24, var28, var14, var18);
      var9.a(var22, var26, var28, var14, var16);
   }

   public void e(ln var1, double var2, double var4, double var6, int var8) {
      he var9 = he.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = (var10 + var1.bf * 16.0) / 256.0;
      double var14 = (var10 + var1.bi * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.be * 16.0) / 256.0;
      double var18 = (var11 + var1.bh * 16.0 - 0.01) / 256.0;
      if (this.c) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bf < 0.0 || var1.bi > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.be < 0.0 || var1.bh > 1.0) {
         var16 = (var11 + 0.0F) / 256.0F;
         var18 = (var11 + 15.99F) / 256.0F;
      }

      double var30 = var2 + var1.bd;
      double var22 = var4 + var1.be;
      double var24 = var4 + var1.bh;
      double var26 = var6 + var1.bf;
      double var28 = var6 + var1.bi;
      var9.a(var30, var24, var28, var14, var16);
      var9.a(var30, var24, var26, var12, var16);
      var9.a(var30, var22, var26, var12, var18);
      var9.a(var30, var22, var28, var14, var18);
   }

   public void f(ln var1, double var2, double var4, double var6, int var8) {
      he var9 = he.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = (var10 + var1.bf * 16.0) / 256.0;
      double var14 = (var10 + var1.bi * 16.0 - 0.01) / 256.0;
      double var16 = (var11 + var1.be * 16.0) / 256.0;
      double var18 = (var11 + var1.bh * 16.0 - 0.01) / 256.0;
      if (this.c) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bf < 0.0 || var1.bi > 1.0) {
         var12 = (var10 + 0.0F) / 256.0F;
         var14 = (var10 + 15.99F) / 256.0F;
      }

      if (var1.be < 0.0 || var1.bh > 1.0) {
         var16 = (var11 + 0.0F) / 256.0F;
         var18 = (var11 + 15.99F) / 256.0F;
      }

      double var30 = var2 + var1.bg;
      double var22 = var4 + var1.be;
      double var24 = var4 + var1.bh;
      double var26 = var6 + var1.bf;
      double var28 = var6 + var1.bi;
      var9.a(var30, var22, var28, var12, var18);
      var9.a(var30, var22, var26, var14, var18);
      var9.a(var30, var24, var26, var14, var16);
      var9.a(var30, var24, var28, var12, var16);
   }

   public void a(ln var1, float var2) {
      int var3 = var1.f();
      he var4 = he.a;
      if (var3 == 0) {
         var1.e();
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float var5 = 0.5F;
         float var6 = 1.0F;
         float var7 = 0.8F;
         float var8 = 0.6F;
         var4.b();
         var4.a(var6, var6, var6, var2);
         this.a(var1, 0.0, 0.0, 0.0, var1.a(0));
         var4.a(var5, var5, var5, var2);
         this.b(var1, 0.0, 0.0, 0.0, var1.a(1));
         var4.a(var7, var7, var7, var2);
         this.c(var1, 0.0, 0.0, 0.0, var1.a(2));
         this.d(var1, 0.0, 0.0, 0.0, var1.a(3));
         var4.a(var8, var8, var8, var2);
         this.e(var1, 0.0, 0.0, 0.0, var1.a(4));
         this.f(var1, 0.0, 0.0, 0.0, var1.a(5));
         var4.a();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      }
   }

   public void a(ln var1) {
      byte var2 = -1;
      he var3 = he.a;
      int var4 = var1.f();
      if (var4 == 0) {
         var1.e();
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         var3.b();
         var3.b(0.0F, -1.0F, 0.0F);
         this.a(var1, 0.0, 0.0, 0.0, var1.a(0));
         var3.a();
         var3.b();
         var3.b(0.0F, 1.0F, 0.0F);
         this.b(var1, 0.0, 0.0, 0.0, var1.a(1));
         var3.a();
         var3.b();
         var3.b(0.0F, 0.0F, -1.0F);
         this.c(var1, 0.0, 0.0, 0.0, var1.a(2));
         var3.a();
         var3.b();
         var3.b(0.0F, 0.0F, 1.0F);
         this.d(var1, 0.0, 0.0, 0.0, var1.a(3));
         var3.a();
         var3.b();
         var3.b(-1.0F, 0.0F, 0.0F);
         this.e(var1, 0.0, 0.0, 0.0, var1.a(4));
         var3.a();
         var3.b();
         var3.b(1.0F, 0.0F, 0.0F);
         this.f(var1, 0.0, 0.0, 0.0, var1.a(5));
         var3.a();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      } else if (var4 == 1) {
         var3.b();
         var3.b(0.0F, -1.0F, 0.0F);
         this.a(var1, var2, -0.5, -0.5, -0.5);
         var3.a();
      } else if (var4 == 13) {
         var1.e();
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float var5 = 0.0625F;
         var3.b();
         var3.b(0.0F, -1.0F, 0.0F);
         this.a(var1, 0.0, 0.0, 0.0, var1.a(0));
         var3.a();
         var3.b();
         var3.b(0.0F, 1.0F, 0.0F);
         this.b(var1, 0.0, 0.0, 0.0, var1.a(1));
         var3.a();
         var3.b();
         var3.b(0.0F, 0.0F, -1.0F);
         var3.c(0.0F, 0.0F, var5);
         this.c(var1, 0.0, 0.0, 0.0, var1.a(2));
         var3.c(0.0F, 0.0F, -var5);
         var3.a();
         var3.b();
         var3.b(0.0F, 0.0F, 1.0F);
         var3.c(0.0F, 0.0F, -var5);
         this.d(var1, 0.0, 0.0, 0.0, var1.a(3));
         var3.c(0.0F, 0.0F, var5);
         var3.a();
         var3.b();
         var3.b(-1.0F, 0.0F, 0.0F);
         var3.c(var5, 0.0F, 0.0F);
         this.e(var1, 0.0, 0.0, 0.0, var1.a(4));
         var3.c(-var5, 0.0F, 0.0F);
         var3.a();
         var3.b();
         var3.b(1.0F, 0.0F, 0.0F);
         var3.c(-var5, 0.0F, 0.0F);
         this.f(var1, 0.0, 0.0, 0.0, var1.a(5));
         var3.c(var5, 0.0F, 0.0F);
         var3.a();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      } else if (var4 == 6) {
         var3.b();
         var3.b(0.0F, -1.0F, 0.0F);
         this.b(var1, var2, -0.5, -0.5, -0.5);
         var3.a();
      } else if (var4 == 2) {
         var3.b();
         var3.b(0.0F, -1.0F, 0.0F);
         this.a(var1, -0.5, -0.5, -0.5, 0.0, 0.0);
         var3.a();
      } else if (var4 == 10) {
         for (int var6 = 0; var6 < 2; var6++) {
            if (var6 == 0) {
               var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            }

            if (var6 == 1) {
               var1.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            }

            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var3.b();
            var3.b(0.0F, -1.0F, 0.0F);
            this.a(var1, 0.0, 0.0, 0.0, var1.a(0));
            var3.a();
            var3.b();
            var3.b(0.0F, 1.0F, 0.0F);
            this.b(var1, 0.0, 0.0, 0.0, var1.a(1));
            var3.a();
            var3.b();
            var3.b(0.0F, 0.0F, -1.0F);
            this.c(var1, 0.0, 0.0, 0.0, var1.a(2));
            var3.a();
            var3.b();
            var3.b(0.0F, 0.0F, 1.0F);
            this.d(var1, 0.0, 0.0, 0.0, var1.a(3));
            var3.a();
            var3.b();
            var3.b(-1.0F, 0.0F, 0.0F);
            this.e(var1, 0.0, 0.0, 0.0, var1.a(4));
            var3.a();
            var3.b();
            var3.b(1.0F, 0.0F, 0.0F);
            this.f(var1, 0.0, 0.0, 0.0, var1.a(5));
            var3.a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         }

         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   public static boolean a(int var0) {
      if (var0 == 0) {
         return true;
      } else {
         return var0 == 13 ? true : var0 == 10;
      }
   }
}
