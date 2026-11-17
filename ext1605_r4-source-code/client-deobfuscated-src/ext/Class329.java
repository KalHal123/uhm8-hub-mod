package ext;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferStrategy;
import java.awt.image.ImageObserver;
import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Class329 extends Canvas247 {
   private int field_2258 = 0;
   private int field_457 = 2;
   private boolean field_2040 = true;
   private Class454 field_1428;
   private File field_230 = this.method_360();
   private boolean field_2314 = true;
   private List<Class448> field_1089 = Collections.synchronizedList(new LinkedList<>());
   private Class448[][] field_3129 = new Class448[64][64];
   private int field_2651;
   private int field_1244;
   private int field_352;
   private int field_2515;

   public Class329(Class454 var1) {
      for (int var2 = 0; var2 < 64; var2++) {
         for (int var3 = 0; var3 < 64; var3++) {
            this.field_3129[var2][var3] = new Class448(var1, var2, var3);
         }
      }

      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.addKeyListener(this);
      this.setFocusable(true);
      this.requestFocus();
      this.setBackground(Color.red);
      this.field_2651 = (int)Class119.field_1519.field_2787.field_1417;
      this.field_1244 = (int)Class119.field_1519.field_2787.field_2013;
      this.method_284(var1);
   }

   public void method_284(Class454 var1) {
      this.field_2651 = this.field_1244 = 0;
      this.field_1428 = var1;
      List var3 = this.field_1089;
      synchronized (this.field_1089) {
         this.field_1089.clear();

         for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
               this.field_3129[var4][var5].method_1530(this.field_1428, var4, var5);
            }
         }
      }
   }

   private void method_1149(int var1) {
      synchronized (this.field_1089) {
         this.field_1089.clear();

         for (int var3 = 0; var3 < 64; var3++) {
            for (int var4 = 0; var4 < 64; var4++) {
               this.field_3129[var3][var4].method_1530(this.field_1428, var3, var4);
            }
         }
      }
   }

   @Override
   public void method_33() {
      new Thread579(this).start();

      for (int var1 = 0; var1 < 8; var1++) {
         new Thread(this).start();
      }
   }

   @Override
   public void method_786() {
      this.field_2314 = false;
   }

   private Class448 method_251(int var1, int var2) {
      int var3 = var1 & 63;
      int var4 = var2 & 63;
      Class448 var5 = this.field_3129[var3][var4];
      if (var5.field_528 == var1 && var5.field_2238 == var2) {
         return var5;
      }

      List var7 = this.field_1089;
      synchronized (this.field_1089) {
         this.field_1089.remove(var5);
      }

      var5.method_1720(var1, var2);
      return var5;
   }

   @Override
   public void run() {
      Class542 var1 = new Class542();

      while (this.field_2314) {
         Class448 var2 = null;
         synchronized (this.field_1089) {
            if (this.field_1089.size() > 0) {
               var2 = this.field_1089.remove(0);
            }
         }

         if (var2 != null) {
            if (this.field_2258 - var2.field_1826 < 2) {
               var1.method_1627(var2);
               this.repaint();
            } else {
               var2.field_804 = false;
            }
         }

         try {
            Thread.sleep(2L);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }
      }
   }

   @Override
   public void update(Graphics var1) {
   }

   @Override
   public void paint(Graphics var1) {
   }

   @Override
   public void method_932() {
      BufferStrategy var1 = this.getBufferStrategy();
      if (var1 == null) {
         this.createBufferStrategy(2);
      } else {
         this.method_1837((Graphics2D)var1.getDrawGraphics());
         var1.show();
      }
   }

   @Override
   public void method_1837(Graphics2D var1) {
      this.field_2258++;
      AffineTransform var2 = var1.getTransform();
      var1.setClip(0, 0, this.getWidth(), this.getHeight());
      var1.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
      var1.translate(this.getWidth() / 2, this.getHeight() / 2);
      var1.scale(this.field_457, this.field_457);
      var1.translate(this.field_2651, this.field_1244);
      if (this.field_1428 != null) {
         var1.translate(0, 0);
      }

      Rectangle var3 = var1.getClipBounds();
      var1.setColor(new Color(-15724512));
      var1.fillRect(var3.x, var3.y, var3.width, var3.height);
      byte var4 = 16;
      byte var5 = 3;
      int var6 = var3.x / var4 / 2 - 2 - var5;
      int var7 = (var3.x + var3.width) / var4 / 2 + 1 + var5;
      int var8 = var3.y / var4 - 1 - var5 * 2;
      int var9 = (var3.y + var3.height + 16 + 128) / var4 + 1 + var5 * 2;

      for (int var10 = var8; var10 <= var9; var10++) {
         for (int var11 = var6; var11 <= var7; var11++) {
            int var12 = var11 - (var10 >> 1);
            int var13 = var11 + (var10 + 1 >> 1);
            Class448 var14 = this.method_251(var12, var13);
            var14.field_1826 = this.field_2258;
            if (!var14.field_1315) {
               if (!var14.field_804) {
                  var14.field_804 = true;
                  this.field_1089.add(var14);
               }
            } else {
               var14.field_804 = false;
               if (!var14.field_886) {
                  int var15 = var11 * var4 * 2 + (var10 & 1) * var4;
                  int var16 = var10 * var4 - 128 - 16;
                  var1.drawImage(var14.field_891, var15, var16, (ImageObserver)null);
               }
            }
         }
      }

      if (this.field_2040) {
         var1.setTransform(var2);
         int var17 = this.getHeight() - 32 - 4;
         var1.setColor(new Color(Integer.MIN_VALUE, true));
         var1.fillRect(4, this.getHeight() - 32 - 4, this.getWidth() - 8, 32);
         var1.setColor(Color.WHITE);
      }

      int var18 = this.getWidth() / this.field_457 / 2 + this.field_2651;
      int var19 = this.getHeight() / this.field_457 / 2 + this.field_1244;
      int var20 = var18
         + (int)(Class119.field_1519.field_2787.field_1417 * Math.cos(-Math.PI / 4) - Class119.field_1519.field_2787.field_2013 * Math.sin(-Math.PI / 4));
      int var21 = var19
         + (int)(
            Class119.field_1519.field_2787.field_1417 * Math.sin(-Math.PI / 4)
               + Class119.field_1519.field_2787.field_2013 * Math.cos(-Math.PI / 4)
               - Class119.field_1519.field_2787.field_2654
         );
      var1.setTransform(var2);
      var1.scale(this.field_457, this.field_457);
      var1.setColor(new Color(-65536, false));
      var1.fillRect(var20, var21, 4, 4);
      var1.dispose();
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var2 = var1.getX() / this.field_457;
      int var3 = var1.getY() / this.field_457;
      this.field_2651 = this.field_2651 + (var2 - this.field_352);
      this.field_1244 = this.field_1244 + (var3 - this.field_2515);
      this.field_352 = var2;
      this.field_2515 = var3;
      this.repaint();
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getClickCount() == 2) {
         this.field_457 = 3 - this.field_457;
         this.repaint();
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = var1.getX() / this.field_457;
      int var3 = var1.getY() / this.field_457;
      this.field_352 = var2;
      this.field_2515 = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 32) {
         this.field_2651 = this.field_1244 = 0;
      }

      if (var1.getKeyCode() == 27) {
         this.field_2040 = !this.field_2040;
      }

      this.repaint();
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   static boolean method_1526(Canvas247 var0) {
      return var0.field_1017;
   }
}
