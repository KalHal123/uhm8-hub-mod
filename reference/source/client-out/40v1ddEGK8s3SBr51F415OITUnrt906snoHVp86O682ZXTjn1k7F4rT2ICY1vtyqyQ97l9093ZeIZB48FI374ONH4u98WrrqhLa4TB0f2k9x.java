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

public class 40v1ddEGK8s3SBr51F415OITUnrt906snoHVp86O682ZXTjn1k7F4rT2ICY1vtyqyQ97l9093ZeIZB48FI374ONH4u98WrrqhLa4TB0f2k9x
   extends 34BE7AAhcY7AVgV68WH9t6HE23HX0E7VU2ivmI9wAoimqdXd3nLGeTagVsFF1RT890M5j2wLS6w457dlsmgC6M2d5k5sz8i0 {
   private int 72N8X1pO78RrjXw727sz84EQrgc9pX9W2MH72GCxxsKCoA27JDxHl3cFcafR = 0;
   private int 19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6 = 2;
   private boolean 6A9SGv0iWtc8W0Wmm9z8v44SaLI817lwT3w8v520WH89nSAsGMoknU58Lmh1 = true;
   private 5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY 4BLCzinXevnqtknRNDh2C2C91E6rrxkn4zvrNbNrlou8l80Qz74AHaOC4OW8;
   private File 0W648NHS96J470zci6uRbkaLrLoqtR56998svJx9X4Knc4YJH6E51574FHUI = this._hsM5807z86lKwbt2OfbqMqF69bzofO0KVHOi7bm27a1ytRw8tJS5Jf69r4Y/* $VF was: 1hsM5807z86lKwbt2OfbqMqF69bzofO0KVHOi7bm27a1ytRw8tJS5Jf69r4Y */();
   private boolean 78LqGUIe5p1L4B9ZZ3faA4sXVLKTx34Yvfz58X1sGY7cEhJzH70o6YStOTj0 = true;
   private List<5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF> 39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff = Collections.synchronizedList(
      new LinkedList<>()
   );
   private 5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF[][] 9tFv6x4fP6445LvYmFcT71Yg5z8ol8gKLDx6CWXRl1Jj3Y3Nt8G32cDQwM4P = new 5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF[64][64];
   private int 8DAO90f6P0bNk0bkLa20vDKmg7glaJMuS82g0OvCZpx2KlBs8W2349uYBsE4;
   private int 3kp4JgBhtF9bN58KzLFhsADp60KCo9Mqnd1O5NSl6OO5Mx599ZbCfy1DGJE7;
   private int 105NHjag7Q1473a2xSX059ql4702aozXmuX6oC9t1y47n5ewP6UfCbH509Vw;
   private int 7vxEDVHs0KDMDY8crgY5rCXcA5Rb3yuGG72MUi27cadio3eXv67qqmH11559;

   public _0v1ddEGK8s3SBr51F415OITUnrt906snoHVp86O682ZXTjn1k7F4rT2ICY1vtyqyQ97l9093ZeIZB48FI374ONH4u98WrrqhLa4TB0f2k9x/* $VF was: 40v1ddEGK8s3SBr51F415OITUnrt906snoHVp86O682ZXTjn1k7F4rT2ICY1vtyqyQ97l9093ZeIZB48FI374ONH4u98WrrqhLa4TB0f2k9x */(
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var1
   ) {
      for (int var2 = 0; var2 < 64; var2++) {
         for (int var3 = 0; var3 < 64; var3++) {
            this.9tFv6x4fP6445LvYmFcT71Yg5z8ol8gKLDx6CWXRl1Jj3Y3Nt8G32cDQwM4P[var2][var3] = new 5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF(
               var1, var2, var3
            );
         }
      }

      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.addKeyListener(this);
      this.setFocusable(true);
      this.requestFocus();
      this.setBackground(Color.red);
      this.8DAO90f6P0bNk0bkLa20vDKmg7glaJMuS82g0OvCZpx2KlBs8W2349uYBsE4 = (int)1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip.4ZJzjV4ZUIoAEZm80Eg9UZ6ydiptq3Q0W2umW7h3bRHqfDcd45vw553X6qt7
         .8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
         .497Ny8ieOOsR16Sz600331Tse4JQLpB9t68N055JeLhS6p82x0V6dPP7m43N;
      this.3kp4JgBhtF9bN58KzLFhsADp60KCo9Mqnd1O5NSl6OO5Mx599ZbCfy1DGJE7 = (int)1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip.4ZJzjV4ZUIoAEZm80Eg9UZ6ydiptq3Q0W2umW7h3bRHqfDcd45vw553X6qt7
         .8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
         .68900A16KVY7SEiF2YQ3hM0ZG79rACr5q730w1yAkf6oUgPjo4rVq892edT0;
      this._B4xHyvY56iAI17FQ4Gpa0ZPL64h192oVd1G71b14O3JTk30xDR5i5k39Yx3/* $VF was: 1B4xHyvY56iAI17FQ4Gpa0ZPL64h192oVd1G71b14O3JTk30xDR5i5k39Yx3 */(var1);
   }

   public void _B4xHyvY56iAI17FQ4Gpa0ZPL64h192oVd1G71b14O3JTk30xDR5i5k39Yx3/* $VF was: 1B4xHyvY56iAI17FQ4Gpa0ZPL64h192oVd1G71b14O3JTk30xDR5i5k39Yx3 */(
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var1
   ) {
      this.8DAO90f6P0bNk0bkLa20vDKmg7glaJMuS82g0OvCZpx2KlBs8W2349uYBsE4 = this.3kp4JgBhtF9bN58KzLFhsADp60KCo9Mqnd1O5NSl6OO5Mx599ZbCfy1DGJE7 = 0;
      this.4BLCzinXevnqtknRNDh2C2C91E6rrxkn4zvrNbNrlou8l80Qz74AHaOC4OW8 = var1;
      List var3 = this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff;
      synchronized (this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff) {
         this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff.clear();

         for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
               this.9tFv6x4fP6445LvYmFcT71Yg5z8ol8gKLDx6CWXRl1Jj3Y3Nt8G32cDQwM4P[var4][var5]
                  ._r50GcKvG5G41T4nZCHS0NS3y2427iBqi6L5lX9QE3B6U422ai8gRC1et5QR/* $VF was: 7r50GcKvG5G41T4nZCHS0NS3y2427iBqi6L5lX9QE3B6U422ai8gRC1et5QR */(
                     this.4BLCzinXevnqtknRNDh2C2C91E6rrxkn4zvrNbNrlou8l80Qz74AHaOC4OW8, var4, var5
                  );
            }
         }
      }
   }

   private void _yk97ET936N29rx00ik3j5Z5MtX11419LmZ69Fnzp8771abylpk0Y0ESay9p/* $VF was: 5yk97ET936N29rx00ik3j5Z5MtX11419LmZ69Fnzp8771abylpk0Y0ESay9p */(
      int var1
   ) {
      synchronized (this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff) {
         this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff.clear();

         for (int var3 = 0; var3 < 64; var3++) {
            for (int var4 = 0; var4 < 64; var4++) {
               this.9tFv6x4fP6445LvYmFcT71Yg5z8ol8gKLDx6CWXRl1Jj3Y3Nt8G32cDQwM4P[var3][var4]
                  ._r50GcKvG5G41T4nZCHS0NS3y2427iBqi6L5lX9QE3B6U422ai8gRC1et5QR/* $VF was: 7r50GcKvG5G41T4nZCHS0NS3y2427iBqi6L5lX9QE3B6U422ai8gRC1et5QR */(
                     this.4BLCzinXevnqtknRNDh2C2C91E6rrxkn4zvrNbNrlou8l80Qz74AHaOC4OW8, var3, var4
                  );
            }
         }
      }
   }

   @Override
   public void _48eIn3ocyu8483r1bYotaP3CgdO9F6WMlV8nf3lAZyL8Az4oM4nBt745C83/* $VF was: 048eIn3ocyu8483r1bYotaP3CgdO9F6WMlV8nf3lAZyL8Az4oM4nBt745C83 */() {
      new 7V50K4kgE4Z15uh9jZ9zUI70yZ67aZQW69LQkKO3d3LQxf55Vd9ST24OJ11of7j6yz861SfS2nq6TMkV4SnIqk0DRMGf(this).start();

      for (int var1 = 0; var1 < 8; var1++) {
         new Thread(this).start();
      }
   }

   @Override
   public void _2WOCvt0MDpA66gNz122G3tlFra1k80klfEcp48PNh400hBOcin61mlUSz1B/* $VF was: 42WOCvt0MDpA66gNz122G3tlFra1k80klfEcp48PNh400hBOcin61mlUSz1B */() {
      this.78LqGUIe5p1L4B9ZZ3faA4sXVLKTx34Yvfz58X1sGY7cEhJzH70o6YStOTj0 = false;
   }

   private 5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF _6ef7NG8dIZ14CJT0mTn5R088K77F6LwCP0fY2tV9exZ6Em5wx9rR0UyOjU0/* $VF was: 16ef7NG8dIZ14CJT0mTn5R088K77F6LwCP0fY2tV9exZ6Em5wx9rR0UyOjU0 */(
      int var1, int var2
   ) {
      int var3 = var1 & 63;
      int var4 = var2 & 63;
      5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF var5 = this.9tFv6x4fP6445LvYmFcT71Yg5z8ol8gKLDx6CWXRl1Jj3Y3Nt8G32cDQwM4P[var3][var4];
      if (var5.1Ptq07ObeBn5cnc2Hvo5sxAmCyb89O4gW5f8asG4BJgu1683Xp5m687G8a41 == var1
         && var5.70cH252WV3Ffw5dP5bgNN05P7K18GG75b6He6o6n0tc30d26t8ax5wfK8f09 == var2) {
         return var5;
      }

      List var7 = this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff;
      synchronized (this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff) {
         this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff.remove(var5);
      }

      var5._kA7qvl3An7nWIZCDn261B056h9V52Q4y6m2uyIv0318H60RKI0ZgZIQp2iL/* $VF was: 8kA7qvl3An7nWIZCDn261B056h9V52Q4y6m2uyIv0318H60RKI0ZgZIQp2iL */(var1, var2);
      return var5;
   }

   @Override
   public void run() {
      729wLc8hwl7tQSEXg3HsRG444K9D1o3Bi3exyPXRRdMjsGLGIyU3AQA2yY0rMpK979u8WUff3jJTFiOS9p5U9icBdQL2lm7JImBy51 var1 = new 729wLc8hwl7tQSEXg3HsRG444K9D1o3Bi3exyPXRRdMjsGLGIyU3AQA2yY0rMpK979u8WUff3jJTFiOS9p5U9icBdQL2lm7JImBy51();

      while (this.78LqGUIe5p1L4B9ZZ3faA4sXVLKTx34Yvfz58X1sGY7cEhJzH70o6YStOTj0) {
         5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF var2 = null;
         synchronized (this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff) {
            if (this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff.size() > 0) {
               var2 = this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff.remove(0);
            }
         }

         if (var2 != null) {
            if (this.72N8X1pO78RrjXw727sz84EQrgc9pX9W2MH72GCxxsKCoA27JDxHl3cFcafR - var2.5bCtek4HsVYf5V9866810m9nPr35Ui9mvSN169CsRLP1125nxOy1z49CpFe4 < 2) {
               var1._DHJd27I7dEAinVNW1QMocs560JON070k26cNcs5j9fr6O3I853qcD326wmz/* $VF was: 8DHJd27I7dEAinVNW1QMocs560JON070k26cNcs5j9fr6O3I853qcD326wmz */(
                  var2
               );
               this.repaint();
            } else {
               var2.2L8TvH89950TKq9EF9Y7BspwpH2izCu8Oiip1z19WbeV8h04uh5MsyI449TD = false;
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
   public void _p7o9zm8m5FE5mXuA4nvbR3FwmC4r3qBvDW4CXH5El6A9k1hM14wHd8W1z45/* $VF was: 4p7o9zm8m5FE5mXuA4nvbR3FwmC4r3qBvDW4CXH5El6A9k1hM14wHd8W1z45 */() {
      BufferStrategy var1 = this.getBufferStrategy();
      if (var1 == null) {
         this.createBufferStrategy(2);
      } else {
         this._JZ4Z1hE5ckU2GVM5inN5r096Bj2a3lRkVyI7J1B96cesT5A8VZJ1iM2Em5d/* $VF was: 9JZ4Z1hE5ckU2GVM5inN5r096Bj2a3lRkVyI7J1B96cesT5A8VZJ1iM2Em5d */(
            (Graphics2D)var1.getDrawGraphics()
         );
         var1.show();
      }
   }

   @Override
   public void _JZ4Z1hE5ckU2GVM5inN5r096Bj2a3lRkVyI7J1B96cesT5A8VZJ1iM2Em5d/* $VF was: 9JZ4Z1hE5ckU2GVM5inN5r096Bj2a3lRkVyI7J1B96cesT5A8VZJ1iM2Em5d */(
      Graphics2D var1
   ) {
      this.72N8X1pO78RrjXw727sz84EQrgc9pX9W2MH72GCxxsKCoA27JDxHl3cFcafR++;
      AffineTransform var2 = var1.getTransform();
      var1.setClip(0, 0, this.getWidth(), this.getHeight());
      var1.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
      var1.translate(this.getWidth() / 2, this.getHeight() / 2);
      var1.scale(this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6, this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6);
      var1.translate(this.8DAO90f6P0bNk0bkLa20vDKmg7glaJMuS82g0OvCZpx2KlBs8W2349uYBsE4, this.3kp4JgBhtF9bN58KzLFhsADp60KCo9Mqnd1O5NSl6OO5Mx599ZbCfy1DGJE7);
      if (this.4BLCzinXevnqtknRNDh2C2C91E6rrxkn4zvrNbNrlou8l80Qz74AHaOC4OW8 != null) {
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
            5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF var14 = this._6ef7NG8dIZ14CJT0mTn5R088K77F6LwCP0fY2tV9exZ6Em5wx9rR0UyOjU0/* $VF was: 16ef7NG8dIZ14CJT0mTn5R088K77F6LwCP0fY2tV9exZ6Em5wx9rR0UyOjU0 */(
               var12, var13
            );
            var14.5bCtek4HsVYf5V9866810m9nPr35Ui9mvSN169CsRLP1125nxOy1z49CpFe4 = this.72N8X1pO78RrjXw727sz84EQrgc9pX9W2MH72GCxxsKCoA27JDxHl3cFcafR;
            if (!var14.412nA6NkiGO6n7Cx8Ph8P5RUo8xoE50GQulkK7m445JG9wd413ygiw8y13B9) {
               if (!var14.2L8TvH89950TKq9EF9Y7BspwpH2izCu8Oiip1z19WbeV8h04uh5MsyI449TD) {
                  var14.2L8TvH89950TKq9EF9Y7BspwpH2izCu8Oiip1z19WbeV8h04uh5MsyI449TD = true;
                  this.39Bww14PxdTCxQG3GzOqDPnSHA37MCx09SVRXIQdsk3r3JzxvlxEI6GSXRff.add(var14);
               }
            } else {
               var14.2L8TvH89950TKq9EF9Y7BspwpH2izCu8Oiip1z19WbeV8h04uh5MsyI449TD = false;
               if (!var14.2fRon5m1N7aMOT87gKu4p0JI6CUWXpj4Bkt4446I1I1EGJK51WA3Q1ELoWCJ) {
                  int var15 = var11 * var4 * 2 + (var10 & 1) * var4;
                  int var16 = var10 * var4 - 128 - 16;
                  var1.drawImage(var14.2gSiFJnTc4im5CUgc7OaR9dSUYWr4V68lA5e9Ni1S9uiy47SdOCB9V8kN0zN, var15, var16, (ImageObserver)null);
               }
            }
         }
      }

      if (this.6A9SGv0iWtc8W0Wmm9z8v44SaLI817lwT3w8v520WH89nSAsGMoknU58Lmh1) {
         var1.setTransform(var2);
         int var17 = this.getHeight() - 32 - 4;
         var1.setColor(new Color(Integer.MIN_VALUE, true));
         var1.fillRect(4, this.getHeight() - 32 - 4, this.getWidth() - 8, 32);
         var1.setColor(Color.WHITE);
      }

      int var18 = this.getWidth() / this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6 / 2
         + this.8DAO90f6P0bNk0bkLa20vDKmg7glaJMuS82g0OvCZpx2KlBs8W2349uYBsE4;
      int var19 = this.getHeight() / this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6 / 2
         + this.3kp4JgBhtF9bN58KzLFhsADp60KCo9Mqnd1O5NSl6OO5Mx599ZbCfy1DGJE7;
      int var20 = var18
         + (int)(
            1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip.4ZJzjV4ZUIoAEZm80Eg9UZ6ydiptq3Q0W2umW7h3bRHqfDcd45vw553X6qt7
                     .8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                     .497Ny8ieOOsR16Sz600331Tse4JQLpB9t68N055JeLhS6p82x0V6dPP7m43N
                  * Math.cos(-Math.PI / 4)
               - 1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip.4ZJzjV4ZUIoAEZm80Eg9UZ6ydiptq3Q0W2umW7h3bRHqfDcd45vw553X6qt7
                     .8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                     .68900A16KVY7SEiF2YQ3hM0ZG79rACr5q730w1yAkf6oUgPjo4rVq892edT0
                  * Math.sin(-Math.PI / 4)
         );
      int var21 = var19
         + (int)(
            1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip.4ZJzjV4ZUIoAEZm80Eg9UZ6ydiptq3Q0W2umW7h3bRHqfDcd45vw553X6qt7
                     .8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                     .497Ny8ieOOsR16Sz600331Tse4JQLpB9t68N055JeLhS6p82x0V6dPP7m43N
                  * Math.sin(-Math.PI / 4)
               + 1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip.4ZJzjV4ZUIoAEZm80Eg9UZ6ydiptq3Q0W2umW7h3bRHqfDcd45vw553X6qt7
                     .8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                     .68900A16KVY7SEiF2YQ3hM0ZG79rACr5q730w1yAkf6oUgPjo4rVq892edT0
                  * Math.cos(-Math.PI / 4)
               - 1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip.4ZJzjV4ZUIoAEZm80Eg9UZ6ydiptq3Q0W2umW7h3bRHqfDcd45vw553X6qt7
                  .8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                  .8FECN1K2ZwI9gQQLDHe1k9PtBM7o0SIgR9IuNw1V282G0Sv8h5T952A1BGX8
         );
      var1.setTransform(var2);
      var1.scale(this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6, this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6);
      var1.setColor(new Color(-65536, false));
      var1.fillRect(var20, var21, 4, 4);
      var1.dispose();
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var2 = var1.getX() / this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6;
      int var3 = var1.getY() / this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6;
      this.8DAO90f6P0bNk0bkLa20vDKmg7glaJMuS82g0OvCZpx2KlBs8W2349uYBsE4 = this.8DAO90f6P0bNk0bkLa20vDKmg7glaJMuS82g0OvCZpx2KlBs8W2349uYBsE4
         + (var2 - this.105NHjag7Q1473a2xSX059ql4702aozXmuX6oC9t1y47n5ewP6UfCbH509Vw);
      this.3kp4JgBhtF9bN58KzLFhsADp60KCo9Mqnd1O5NSl6OO5Mx599ZbCfy1DGJE7 = this.3kp4JgBhtF9bN58KzLFhsADp60KCo9Mqnd1O5NSl6OO5Mx599ZbCfy1DGJE7
         + (var3 - this.7vxEDVHs0KDMDY8crgY5rCXcA5Rb3yuGG72MUi27cadio3eXv67qqmH11559);
      this.105NHjag7Q1473a2xSX059ql4702aozXmuX6oC9t1y47n5ewP6UfCbH509Vw = var2;
      this.7vxEDVHs0KDMDY8crgY5rCXcA5Rb3yuGG72MUi27cadio3eXv67qqmH11559 = var3;
      this.repaint();
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getClickCount() == 2) {
         this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6 = 3 - this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6;
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
      int var2 = var1.getX() / this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6;
      int var3 = var1.getY() / this.19qO5eaWKVH4rov79324Qb1y1JsVm8NLx9Q9Hk19Y8gOnu54aSbjTMWC9Zp6;
      this.105NHjag7Q1473a2xSX059ql4702aozXmuX6oC9t1y47n5ewP6UfCbH509Vw = var2;
      this.7vxEDVHs0KDMDY8crgY5rCXcA5Rb3yuGG72MUi27cadio3eXv67qqmH11559 = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 32) {
         this.8DAO90f6P0bNk0bkLa20vDKmg7glaJMuS82g0OvCZpx2KlBs8W2349uYBsE4 = this.3kp4JgBhtF9bN58KzLFhsADp60KCo9Mqnd1O5NSl6OO5Mx599ZbCfy1DGJE7 = 0;
      }

      if (var1.getKeyCode() == 27) {
         this.6A9SGv0iWtc8W0Wmm9z8v44SaLI817lwT3w8v520WH89nSAsGMoknU58Lmh1 = !this.6A9SGv0iWtc8W0Wmm9z8v44SaLI817lwT3w8v520WH89nSAsGMoknU58Lmh1;
      }

      this.repaint();
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   static boolean _pF8S75VODC4Y6g02FvT2FM1947mDRfX5193MlUe9S4AC27Gxy502zzTOjEJ/* $VF was: 7pF8S75VODC4Y6g02FvT2FM1947mDRfX5193MlUe9S4AC27Gxy502zzTOjEJ */(
      34BE7AAhcY7AVgV68WH9t6HE23HX0E7VU2ivmI9wAoimqdXd3nLGeTagVsFF1RT890M5j2wLS6w457dlsmgC6M2d5k5sz8i0 var0
   ) {
      return var0.32txD0pV67SFR2wd4D3a3tb24582Z6ov78T72Cg7Kx8U2Gu0nZ2B4B26oQR9;
   }
}
