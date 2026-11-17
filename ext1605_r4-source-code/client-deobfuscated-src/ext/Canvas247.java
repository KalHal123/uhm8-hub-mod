package ext;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferStrategy;
import java.awt.image.ImageObserver;
import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Canvas247 extends Canvas implements KeyListener, MouseListener, MouseMotionListener, Runnable {
   private int field_473 = 0;
   private int field_2937 = 2;
   private boolean field_2902 = true;
   private Class454 field_360;
   private File field_769 = this.method_360();
   public boolean field_1017 = true;
   private List<Class448> field_2351 = Collections.synchronizedList(new LinkedList<>());
   private Class448[][] field_545 = new Class448[64][64];
   private int field_1624;
   private int field_2602;
   private int field_274;
   private int field_1528;

   public File method_360() {
      if (this.field_769 == null) {
         this.field_769 = this.method_913(Class614.method_1576(Class614.field_560));
      }

      return this.field_769;
   }

   public File method_913(String var1) {
      String var2 = System.getProperty(Class614.method_1576(Class614.field_517), ".");
      File var3;
      switch (Class590.field_468[method_133().ordinal()]) {
         case 1:
         case 2:
            var3 = new File(var2, '.' + var1 + '/');
            break;
         case 3:
            String var4 = System.getenv("APPDATA");
            if (var4 != null) {
               var3 = new File(var4, "." + var1 + '/');
            } else {
               var3 = new File(var2, '.' + var1 + '/');
            }
            break;
         case 4:
            var3 = new File(var2, "Library/Application Support/" + var1);
            break;
         default:
            var3 = new File(var2, var1 + '/');
      }

      if (!var3.exists() && !var3.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + var3);
      } else {
         return var3;
      }
   }

   private static Enum441 method_133() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")
         ? Enum441.field_2817
         : (
            var0.contains("mac")
               ? Enum441.field_1811
               : (
                  var0.contains("solaris")
                     ? Enum441.field_1712
                     : (
                        var0.contains("sunos")
                           ? Enum441.field_1712
                           : (var0.contains("linux") ? Enum441.field_205 : (var0.contains("unix") ? Enum441.field_205 : Enum441.field_1063))
                     )
               )
         );
   }

   public Canvas247() {
      for (int var1 = 0; var1 < 64; var1++) {
         for (int var2 = 0; var2 < 64; var2++) {
            this.field_545[var1][var2] = new Class448((Class454)null, var1, var2);
         }
      }

      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.addKeyListener(this);
      this.setFocusable(true);
      this.requestFocus();
      this.setBackground(Color.red);
   }

   public void method_483(String var1) {
      this.field_1624 = this.field_2602 = 0;
      this.field_360 = new Class121(this, new File(this.field_769, "saves"), var1);
      this.field_360.field_2704 = 0;
      synchronized (this.field_2351) {
         this.field_2351.clear();

         for (int var3 = 0; var3 < 64; var3++) {
            for (int var4 = 0; var4 < 64; var4++) {
               this.field_545[var3][var4].method_1530(this.field_360, var3, var4);
            }
         }
      }
   }

   private void method_334(int var1) {
      synchronized (this.field_2351) {
         this.field_360.field_2704 = var1;
         this.field_2351.clear();

         for (int var3 = 0; var3 < 64; var3++) {
            for (int var4 = 0; var4 < 64; var4++) {
               this.field_545[var3][var4].method_1530(this.field_360, var3, var4);
            }
         }
      }
   }

   public void method_33() {
      new Thread579(this).start();

      for (int var1 = 0; var1 < 8; var1++) {
         new Thread(this).start();
      }
   }

   public void method_786() {
      this.field_1017 = false;
   }

   private Class448 method_1410(int var1, int var2) {
      int var3 = var1 & 63;
      int var4 = var2 & 63;
      Class448 var5 = this.field_545[var3][var4];
      if (var5.field_528 == var1 && var5.field_2238 == var2) {
         return var5;
      }

      synchronized (this.field_2351) {
         this.field_2351.remove(var5);
      }

      var5.method_1720(var1, var2);
      return var5;
   }

   @Override
   public void run() {
      Class542 var1 = new Class542();

      while (this.field_1017) {
         Class448 var2 = null;
         synchronized (this.field_2351) {
            if (this.field_2351.size() > 0) {
               var2 = this.field_2351.remove(0);
            }
         }

         if (var2 != null) {
            if (this.field_473 - var2.field_1826 < 2) {
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

   public void method_932() {
      BufferStrategy var1 = this.getBufferStrategy();
      if (var1 == null) {
         this.createBufferStrategy(2);
      } else {
         this.method_1837((Graphics2D)var1.getDrawGraphics());
         var1.show();
      }
   }

   public void method_1837(Graphics2D var1) {
      this.field_473++;
      AffineTransform var2 = var1.getTransform();
      var1.setClip(0, 0, this.getWidth(), this.getHeight());
      var1.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
      var1.translate(this.getWidth() / 2, this.getHeight() / 2);
      var1.scale(this.field_2937, this.field_2937);
      var1.translate(this.field_1624, this.field_2602);
      if (this.field_360 != null) {
         var1.translate(-(this.field_360.field_18 + this.field_360.field_1361), -(-this.field_360.field_18 + this.field_360.field_1361) + 64);
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
            Class448 var14 = this.method_1410(var12, var13);
            var14.field_1826 = this.field_473;
            if (!var14.field_1315) {
               if (!var14.field_804) {
                  var14.field_804 = true;
                  this.field_2351.add(var14);
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

      if (this.field_2902) {
         var1.setTransform(var2);
         int var17 = this.getHeight() - 32 - 4;
         var1.setColor(new Color(Integer.MIN_VALUE, true));
         var1.fillRect(4, this.getHeight() - 32 - 4, this.getWidth() - 8, 32);
         var1.setColor(Color.WHITE);
         String var18 = "F1 - F5: load levels   |   0-9: Set time of day   |   Space: return to spawn   |   Double click: zoom   |   Escape: hide this text";
         var1.drawString(var18, this.getWidth() / 2 - var1.getFontMetrics().stringWidth(var18) / 2, var17 + 20);
      }

      var1.dispose();
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var2 = var1.getX() / this.field_2937;
      int var3 = var1.getY() / this.field_2937;
      this.field_1624 = this.field_1624 + (var2 - this.field_274);
      this.field_2602 = this.field_2602 + (var3 - this.field_1528);
      this.field_274 = var2;
      this.field_1528 = var3;
      this.repaint();
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getClickCount() == 2) {
         this.field_2937 = 3 - this.field_2937;
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
      int var2 = var1.getX() / this.field_2937;
      int var3 = var1.getY() / this.field_2937;
      this.field_274 = var2;
      this.field_1528 = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 48) {
         this.method_334(11);
      }

      if (var1.getKeyCode() == 49) {
         this.method_334(10);
      }

      if (var1.getKeyCode() == 50) {
         this.method_334(9);
      }

      if (var1.getKeyCode() == 51) {
         this.method_334(7);
      }

      if (var1.getKeyCode() == 52) {
         this.method_334(6);
      }

      if (var1.getKeyCode() == 53) {
         this.method_334(5);
      }

      if (var1.getKeyCode() == 54) {
         this.method_334(3);
      }

      if (var1.getKeyCode() == 55) {
         this.method_334(2);
      }

      if (var1.getKeyCode() == 56) {
         this.method_334(1);
      }

      if (var1.getKeyCode() == 57) {
         this.method_334(0);
      }

      if (var1.getKeyCode() == 112) {
         this.method_483("World1");
      }

      if (var1.getKeyCode() == 113) {
         this.method_483("World2");
      }

      if (var1.getKeyCode() == 114) {
         this.method_483("World3");
      }

      if (var1.getKeyCode() == 115) {
         this.method_483("World4");
      }

      if (var1.getKeyCode() == 116) {
         this.method_483("World5");
      }

      if (var1.getKeyCode() == 32) {
         this.field_1624 = this.field_2602 = 0;
      }

      if (var1.getKeyCode() == 27) {
         this.field_2902 = !this.field_2902;
      }

      this.repaint();
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   static boolean method_1715(Canvas247 var0) {
      return var0.field_1017;
   }
}
