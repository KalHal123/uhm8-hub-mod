package x;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public abstract class Class0107 extends Class0032 {
   private static Class0388 k = new Class0388();
   private Class0124 l = null;
   protected int a = 176;
   protected int h = 166;
   protected List i = new ArrayList();

   @Override
   public void a(int var1, int var2, float var3) {
      this.i();
      int var4 = (this.c - this.a) / 2;
      int var5 = (this.d - this.h) / 2;
      this.a(var3);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      Class0244.b();
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef(var4, var5, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(32826);

      for (int var6 = 0; var6 < this.i.size(); var6++) {
         Class0094 var7 = (Class0094)this.i.get(var6);
         this.a(var7);
         if (var7.a(var1, var2)) {
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            int var8 = var7.b;
            int var9 = var7.c;
            this.a(var8, var9, var8 + 16, var9 + 16, -2130706433, -2130706433);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }
      }

      if (this.l != null) {
         GL11.glTranslatef(0.0F, 0.0F, 32.0F);
         k.a(this.g, this.b.n, this.l, var1 - var4 - 8, var2 - var5 - 8);
         k.b(this.g, this.b.n, this.l, var1 - var4 - 8, var2 - var5 - 8);
      }

      GL11.glDisable(32826);
      Class0244.a();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      this.j();
      GL11.glEnable(2896);
      GL11.glEnable(2929);
      GL11.glPopMatrix();
   }

   protected void j() {
   }

   protected abstract void a(float var1);

   private void a(Class0094 var1) {
      Class0161 var2 = var1.d;
      int var3 = var1.a;
      int var4 = var1.b;
      int var5 = var1.c;
      Class0124 var6 = var2.a_(var3);
      if (var6 == null) {
         int var7 = var1.c();
         if (var7 >= 0) {
            GL11.glDisable(2896);
            this.b.n.b(this.b.n.a("/gui/items.png"));
            this.b(var4, var5, var7 % 16 * 16, var7 / 16 * 16, 16, 16);
            GL11.glEnable(2896);
            return;
         }
      }

      k.a(this.g, this.b.n, var6, var4, var5);
      k.b(this.g, this.b.n, var6, var4, var5);
   }

   private Class0094 a(int var1, int var2) {
      for (int var3 = 0; var3 < this.i.size(); var3++) {
         Class0094 var4 = (Class0094)this.i.get(var3);
         if (var4.a(var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   @Override
   protected void a(int var1, int var2, int var3) {
      if (var3 == 0 || var3 == 1) {
         Class0094 var4 = this.a(var1, var2);
         if (var4 != null) {
            var4.d();
            Class0124 var5 = var4.b();
            if (var5 != null || this.l != null) {
               if (var5 != null && this.l == null) {
                  int var13 = var3 == 0 ? var5.a : (var5.a + 1) / 2;
                  this.l = var4.d.a(var4.a, var13);
                  if (var5.a == 0) {
                     var4.b(null);
                  }

                  var4.a();
               } else if (var5 == null && this.l != null && var4.a(this.l)) {
                  int var12 = var3 == 0 ? this.l.a : 1;
                  if (var12 > var4.d.c()) {
                     var12 = var4.d.c();
                  }

                  var4.b(this.l.a(var12));
                  if (this.l.a == 0) {
                     this.l = null;
                  }
               } else if (var5 != null && this.l != null) {
                  if (var4.a(this.l)) {
                     if (var5.c != this.l.c) {
                        if (this.l.a <= var4.d.c()) {
                           Class0124 var6 = var5;
                           var4.b(this.l);
                           this.l = var6;
                        }
                     } else if (var5.c == this.l.c) {
                        if (var3 == 0) {
                           int var9 = this.l.a;
                           if (var9 > var4.d.c() - var5.a) {
                              var9 = var4.d.c() - var5.a;
                           }

                           if (var9 > this.l.c() - var5.a) {
                              var9 = this.l.c() - var5.a;
                           }

                           this.l.a(var9);
                           if (this.l.a == 0) {
                              this.l = null;
                           }

                           var5.a += var9;
                        } else if (var3 == 1) {
                           int var10 = 1;
                           if (var10 > var4.d.c() - var5.a) {
                              var10 = var4.d.c() - var5.a;
                           }

                           if (var10 > this.l.c() - var5.a) {
                              var10 = this.l.c() - var5.a;
                           }

                           this.l.a(var10);
                           if (this.l.a == 0) {
                              this.l = null;
                           }

                           var5.a += var10;
                        }
                     }
                  } else if (var5.c == this.l.c && this.l.c() > 1) {
                     int var11 = var5.a;
                     if (var11 > 0 && var11 + this.l.a <= this.l.c()) {
                        this.l.a += var11;
                        var5.a(var11);
                        if (var5.a == 0) {
                           var4.b(null);
                        }

                        var4.a();
                     }
                  }
               }
            }
         } else if (this.l != null) {
            int var8 = (this.c - this.a) / 2;
            int var14 = (this.d - this.h) / 2;
            if (var1 < var8 || var2 < var14 || var1 >= var8 + this.a || var2 >= var14 + this.a) {
               Class0033 var7 = this.b.g;
               if (var3 == 0) {
                  var7.a(this.l);
                  this.l = null;
               }

               if (var3 == 1) {
                  var7.a(this.l.a(1));
                  if (this.l.a == 0) {
                     this.l = null;
                  }
               }
            }
         }
      }
   }

   @Override
   protected void b(int var1, int var2, int var3) {
      if (var3 == 0) {
      }
   }

   @Override
   protected void a(char var1, int var2) {
      if (var2 == 1 || var2 == this.b.y.o.b) {
         this.b.a((Class0032)null);
      }
   }

   @Override
   public void h() {
      if (this.l != null) {
         this.b.g.a(this.l);
      }
   }

   public void a(Class0161 var1) {
   }

   @Override
   public boolean b() {
      return false;
   }
}
