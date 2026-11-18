package ext;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class Class368 {
   private static boolean field_106 = true;
   private static boolean field_731 = false;
   private ByteBuffer field_2726;
   private IntBuffer field_1651;
   private FloatBuffer field_1051;
   private int[] field_2448;
   private int field_1320 = 0;
   private double field_2892;
   private double field_2798;
   private int field_2550;
   private boolean field_985 = false;
   private boolean field_3073 = false;
   private boolean field_2222 = false;
   private int field_1872 = 0;
   private int field_2474 = 0;
   private boolean field_500 = false;
   private int field_3118;
   private double field_2069;
   private double field_275;
   private double field_2421;
   private int field_2368;
   public static final Class368 field_2696 = new Class368(2097152);
   private boolean field_692 = false;
   private boolean field_452 = false;
   private IntBuffer field_554;
   private int field_2583 = 0;
   private int field_2851 = 10;
   private int field_483;
   public int field_188 = 0;
   public final int field_1136 = 150;

   private Class368(int var1) {
      this.field_483 = var1;
      this.field_2726 = Class504.method_1768(var1 * 4);
      this.field_1651 = this.field_2726.asIntBuffer();
      this.field_1051 = this.field_2726.asFloatBuffer();
      this.field_2448 = new int[var1];
      this.field_452 = field_731 && GLContext.getCapabilities().GL_ARB_vertex_buffer_object;
      if (this.field_452) {
         this.field_554 = Class504.method_323(this.field_2851);
         ARBVertexBufferObject.glGenBuffersARB(this.field_554);
      }
   }

   public void method_406() {
      if (this.field_692) {
         this.field_692 = false;
         if (this.field_1320 > 0) {
            ((Buffer)this.field_1651).clear();
            this.field_1651.put(this.field_2448, 0, this.field_1872);
            ((Buffer)this.field_2726).position(0);
            ((Buffer)this.field_2726).limit(this.field_1872 * 4);
            if (this.field_452) {
               this.field_2583 = (this.field_2583 + 1) % this.field_2851;
               ARBVertexBufferObject.glBindBufferARB(34962, this.field_554.get(this.field_2583));
               ARBVertexBufferObject.glBufferDataARB(34962, this.field_2726, 35040);
            }

            if (this.field_3073) {
               if (this.field_452) {
                  GL11.glTexCoordPointer(2, 5126, 32, 12L);
               } else {
                  ((Buffer)this.field_1051).position(3);
                  GL11.glTexCoordPointer(2, 32, this.field_1051);
               }

               GL11.glEnableClientState(32888);
            }

            if (this.field_985) {
               if (this.field_452) {
                  GL11.glColorPointer(4, 5121, 32, 20L);
               } else {
                  ((Buffer)this.field_2726).position(20);
                  GL11.glColorPointer(4, true, 32, this.field_2726);
               }

               GL11.glEnableClientState(32886);
            }

            if (this.field_2222) {
               if (this.field_452) {
                  GL11.glNormalPointer(5120, 32, 24L);
               } else {
                  ((Buffer)this.field_2726).position(24);
                  GL11.glNormalPointer(32, this.field_2726);
               }

               GL11.glEnableClientState(32885);
            }

            if (this.field_452) {
               GL11.glVertexPointer(3, 5126, 32, 0L);
            } else {
               ((Buffer)this.field_1051).position(0);
               GL11.glVertexPointer(3, 32, this.field_1051);
            }

            GL11.glEnableClientState(32884);
            if (this.field_3118 == 7 && field_106) {
               GL11.glDrawArrays(4, 0, this.field_1320);
            } else {
               GL11.glDrawArrays(this.field_3118, 0, this.field_1320);
            }

            GL11.glDisableClientState(32884);
            if (this.field_3073) {
               GL11.glDisableClientState(32888);
            }

            if (this.field_985) {
               GL11.glDisableClientState(32886);
            }

            if (this.field_2222) {
               GL11.glDisableClientState(32885);
            }
         }

         this.method_737();
      }
   }

   private void method_737() {
      this.field_1320 = 0;
      ((Buffer)this.field_2726).clear();
      this.field_1872 = 0;
      this.field_2474 = 0;
   }

   public void method_186() {
      this.method_1284(false);
   }

   public void method_1284(boolean var1) {
      this.method_672(7, var1);
   }

   public void method_605(int var1) {
      this.method_672(var1, false);
   }

   public void method_672(int var1, boolean var2) {
      this.field_188++;
      if (var2 || Class119.field_1519.field_1754.field_674 != 2 || this.field_188 < 150) {
         if (this.field_692) {
            throw new IllegalStateException("Already tesselating!");
         }

         this.field_692 = true;
         this.method_737();
         this.field_3118 = var1;
         this.field_2222 = false;
         this.field_985 = false;
         this.field_3073 = false;
         this.field_500 = false;
      }
   }

   public void method_1504(double var1, double var3) {
      this.field_3073 = true;
      this.field_2892 = var1;
      this.field_2798 = var3;
   }

   public void method_1101(float var1, float var2, float var3) {
      this.method_1629((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F));
   }

   public void method_1120(float var1, float var2, float var3, float var4) {
      this.method_780((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   public void method_1629(int var1, int var2, int var3) {
      this.method_780(var1, var2, var3, 255);
   }

   public void method_780(int var1, int var2, int var3, int var4) {
      if (!this.field_500) {
         if (var1 > 255) {
            var1 = 255;
         }

         if (var2 > 255) {
            var2 = 255;
         }

         if (var3 > 255) {
            var3 = 255;
         }

         if (var4 > 255) {
            var4 = 255;
         }

         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         if (var3 < 0) {
            var3 = 0;
         }

         if (var4 < 0) {
            var4 = 0;
         }

         this.field_985 = true;
         this.field_2550 = var4 << 24 | var3 << 16 | var2 << 8 | var1;
      }
   }

   public void method_318(double var1, double var3, double var5, double var7, double var9) {
      if (this.field_692) {
         this.method_1504(var7, var9);
         this.method_1724(var1, var3, var5);
      }
   }

   public void method_1724(double var1, double var3, double var5) {
      if (this.field_692) {
         this.field_2474++;
         if (this.field_3118 == 7 && field_106 && this.field_2474 % 4 == 0) {
            for (int var7 = 0; var7 < 2; var7++) {
               int var8 = 8 * (3 - var7);
               if (this.field_3073) {
                  this.field_2448[this.field_1872 + 3] = this.field_2448[this.field_1872 - var8 + 3];
                  this.field_2448[this.field_1872 + 4] = this.field_2448[this.field_1872 - var8 + 4];
               }

               if (this.field_985) {
                  this.field_2448[this.field_1872 + 5] = this.field_2448[this.field_1872 - var8 + 5];
               }

               this.field_2448[this.field_1872 + 0] = this.field_2448[this.field_1872 - var8 + 0];
               this.field_2448[this.field_1872 + 1] = this.field_2448[this.field_1872 - var8 + 1];
               this.field_2448[this.field_1872 + 2] = this.field_2448[this.field_1872 - var8 + 2];
               this.field_1320++;
               this.field_1872 += 8;
            }
         }

         if (this.field_3073) {
            this.field_2448[this.field_1872 + 3] = Float.floatToRawIntBits((float)this.field_2892);
            this.field_2448[this.field_1872 + 4] = Float.floatToRawIntBits((float)this.field_2798);
         }

         if (this.field_985) {
            this.field_2448[this.field_1872 + 5] = this.field_2550;
         }

         if (this.field_2222) {
            this.field_2448[this.field_1872 + 6] = this.field_2368;
         }

         this.field_2448[this.field_1872 + 0] = Float.floatToRawIntBits((float)(var1 + this.field_2069));
         this.field_2448[this.field_1872 + 1] = Float.floatToRawIntBits((float)(var3 + this.field_275));
         this.field_2448[this.field_1872 + 2] = Float.floatToRawIntBits((float)(var5 + this.field_2421));
         this.field_1872 += 8;
         this.field_1320++;
         if (this.field_1320 % 4 == 0 && this.field_1872 >= this.field_483 - 32) {
            this.method_406();
            this.field_692 = true;
         }
      }
   }

   public void method_1748(int var1) {
      int var2 = var1 >> 16 & 0xFF;
      int var3 = var1 >> 8 & 0xFF;
      int var4 = var1 & 0xFF;
      this.method_1629(var2, var3, var4);
   }

   public void method_1880(int var1, int var2) {
      int var3 = var1 >> 16 & 0xFF;
      int var4 = var1 >> 8 & 0xFF;
      int var5 = var1 & 0xFF;
      this.method_780(var3, var4, var5, var2);
   }

   public void method_1223() {
      this.field_500 = true;
   }

   public void method_548(float var1, float var2, float var3) {
      if (this.field_692) {
         this.field_2222 = true;
         byte var4 = (byte)(var1 * 128.0F);
         byte var5 = (byte)(var2 * 127.0F);
         byte var6 = (byte)(var3 * 127.0F);
         this.field_2368 = var4 | var5 << 8 | var6 << 16;
      }
   }

   public void method_387(double var1, double var3, double var5) {
      this.field_2069 = var1;
      this.field_275 = var3;
      this.field_2421 = var5;
   }

   public void method_1167(float var1, float var2, float var3) {
      this.field_2069 += var1;
      this.field_275 += var2;
      this.field_2421 += var3;
   }
}
