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

public class 34BE7AAhcY7AVgV68WH9t6HE23HX0E7VU2ivmI9wAoimqdXd3nLGeTagVsFF1RT890M5j2wLS6w457dlsmgC6M2d5k5sz8i0
   extends Canvas
   implements KeyListener,
   MouseListener,
   MouseMotionListener,
   Runnable {
   private int 1D9B5McKsQ41yFfd7o0nE6x271TTK1GbL0DLUS0D4ct3Mcg2bGBcEGvzo2uB = 0;
   private int 9C0d158s47Zu0eTaWiN7f5P0NQRJMS0065R7amsMXat56w34MkmeM7K4gmss = 2;
   private boolean 97dVQxGL94Vcwnuc5Av0eAhw3JPbH9k0SXu4r197kxxT0fwr3cvjSnr9861m = true;
   private 5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY 10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja;
   private File 2CWm9ia4625qo2QiCMir7pr1JDT230dTksU9s5iJ3s8b2Ge8e382j8UG6h9y = this._hsM5807z86lKwbt2OfbqMqF69bzofO0KVHOi7bm27a1ytRw8tJS5Jf69r4Y/* $VF was: 1hsM5807z86lKwbt2OfbqMqF69bzofO0KVHOi7bm27a1ytRw8tJS5Jf69r4Y */();
   public boolean 32txD0pV67SFR2wd4D3a3tb24582Z6ov78T72Cg7Kx8U2Gu0nZ2B4B26oQR9 = true;
   private List<5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF> 7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f = Collections.synchronizedList(
      new LinkedList<>()
   );
   private 5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF[][] 1SumC8s5pU6h88sy6NZh52k9lPBP48S91C8D75N11LHUYmIf7MyW4FD3imSN = new 5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF[64][64];
   private int 50k63Bpubvz3Ktk3t2ot0rvh8zcyAQEj09Z9cAxK3v9jInPNbt3ylA07ExLV;
   private int 87jVO6lx8hZ18044DDUb1W8X32X4EiSX3AFM4VA96y3A841m99y6ipESwB9I;
   private int 0fuWEnuT1L8LyhTVC971pKd081OXd51BX1Qwao63hc344Ab6qxlullLObRka;
   private int 4breUPlT23deP82dEnVlcZkYIT7mXSDoi7b8boCaYy13yV7ChQyiyXNZ1cz9;

   public File _hsM5807z86lKwbt2OfbqMqF69bzofO0KVHOi7bm27a1ytRw8tJS5Jf69r4Y/* $VF was: 1hsM5807z86lKwbt2OfbqMqF69bzofO0KVHOi7bm27a1ytRw8tJS5Jf69r4Y */() {
      if (this.2CWm9ia4625qo2QiCMir7pr1JDT230dTksU9s5iJ3s8b2Ge8e382j8UG6h9y == null) {
         this.2CWm9ia4625qo2QiCMir7pr1JDT230dTksU9s5iJ3s8b2Ge8e382j8UG6h9y = this._fFX60Zasj8Hmw0MaqavD6DPChNBPFurgC6O2WdG0f4WW59NVWQrXPq946h5/* $VF was: 4fFX60Zasj8Hmw0MaqavD6DPChNBPFurgC6O2WdG0f4WW59NVWQrXPq946h5 */(
            7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
               7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.1YNrQ38ivM5fhyTo9PH5S33r6S87fqg85pTp0c4YlXfUniwhAwgeD8hZT3Cd
            )
         );
      }

      return this.2CWm9ia4625qo2QiCMir7pr1JDT230dTksU9s5iJ3s8b2Ge8e382j8UG6h9y;
   }

   public File _fFX60Zasj8Hmw0MaqavD6DPChNBPFurgC6O2WdG0f4WW59NVWQrXPq946h5/* $VF was: 4fFX60Zasj8Hmw0MaqavD6DPChNBPFurgC6O2WdG0f4WW59NVWQrXPq946h5 */(
      String var1
   ) {
      String var2 = System.getProperty(
         7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
            7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.1Mq8T0QNr27egvw7Ii5njC2U34iHqD9xm0XHd85K26sr2HmLXKQgJ5Uz42hp
         ),
         "."
      );
      File var3;
      switch (7f4L4VH1yA42GlUHaK3BJWuYIn6ihX16zFtuVoKI8qV9Ib07l1ssWqWv5Oy2pR1oQOsU5GU0a4Yc5qUmm7LF587nFlfp6pL3.1C62I42707T9p4X66M7RxKt8xg7C8z4tx8w4uTQ6te9zVEa13o27dAYd1PoK[_acM8pX7LlI2jQ4QeF8QDUzE0E0TD9naII673r8XonQ0Fqt81iaqVGz35ddL/* $VF was: 0acM8pX7LlI2jQ4QeF8QDUzE0E0TD9naII673r8XonQ0Fqt81iaqVGz35ddL */()
         .ordinal()]) {
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

   private static 5SZok3E3Ht42CVy2z3xvOgHHa8RU98d9yj98I8BFq13o1qe3ihSGFUkf23j48ogQpN02P3N6X12vMf1wLdDHvzJA1Hi4pK1fN _acM8pX7LlI2jQ4QeF8QDUzE0E0TD9naII673r8XonQ0Fqt81iaqVGz35ddL/* $VF was: 0acM8pX7LlI2jQ4QeF8QDUzE0E0TD9naII673r8XonQ0Fqt81iaqVGz35ddL */() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")
         ? 5SZok3E3Ht42CVy2z3xvOgHHa8RU98d9yj98I8BFq13o1qe3ihSGFUkf23j48ogQpN02P3N6X12vMf1wLdDHvzJA1Hi4pK1fN.8vY5Cq0z64qn6H07Fy9J445LIkA3FJ16va0LN9tlftS2p1Vcxt8tuZ56k6Gx
         : (
            var0.contains("mac")
               ? 5SZok3E3Ht42CVy2z3xvOgHHa8RU98d9yj98I8BFq13o1qe3ihSGFUkf23j48ogQpN02P3N6X12vMf1wLdDHvzJA1Hi4pK1fN.5XL1kIQj0in4CK05S286cRa2Xm064dQiGUwhS7KUDK2767p7k89aQ34aMIkG
               : (
                  var0.contains("solaris")
                     ? 5SZok3E3Ht42CVy2z3xvOgHHa8RU98d9yj98I8BFq13o1qe3ihSGFUkf23j48ogQpN02P3N6X12vMf1wLdDHvzJA1Hi4pK1fN.5900777lUZZh9imP4ojcO4Swm1C7hZ6RG938lvtOAIsJ4a3H84v3eVrd7S2x
                     : (
                        var0.contains("sunos")
                           ? 5SZok3E3Ht42CVy2z3xvOgHHa8RU98d9yj98I8BFq13o1qe3ihSGFUkf23j48ogQpN02P3N6X12vMf1wLdDHvzJA1Hi4pK1fN.5900777lUZZh9imP4ojcO4Swm1C7hZ6RG938lvtOAIsJ4a3H84v3eVrd7S2x
                           : (
                              var0.contains("linux")
                                 ? 5SZok3E3Ht42CVy2z3xvOgHHa8RU98d9yj98I8BFq13o1qe3ihSGFUkf23j48ogQpN02P3N6X12vMf1wLdDHvzJA1Hi4pK1fN.0Qx0SUbt5DkN47SN3J5vmMWtj6e6VWSLBCv3yzj9AnIi5TmgkqLY9IdKRtld
                                 : (
                                    var0.contains("unix")
                                       ? 5SZok3E3Ht42CVy2z3xvOgHHa8RU98d9yj98I8BFq13o1qe3ihSGFUkf23j48ogQpN02P3N6X12vMf1wLdDHvzJA1Hi4pK1fN.0Qx0SUbt5DkN47SN3J5vmMWtj6e6VWSLBCv3yzj9AnIi5TmgkqLY9IdKRtld
                                       : 5SZok3E3Ht42CVy2z3xvOgHHa8RU98d9yj98I8BFq13o1qe3ihSGFUkf23j48ogQpN02P3N6X12vMf1wLdDHvzJA1Hi4pK1fN.37GJP2SzKoH3M250cUnHlB5jNf5xBS8ufY1008yaIkA9237qTIyA5gFye4is
                                 )
                           )
                     )
               )
         );
   }

   public _4BE7AAhcY7AVgV68WH9t6HE23HX0E7VU2ivmI9wAoimqdXd3nLGeTagVsFF1RT890M5j2wLS6w457dlsmgC6M2d5k5sz8i0/* $VF was: 34BE7AAhcY7AVgV68WH9t6HE23HX0E7VU2ivmI9wAoimqdXd3nLGeTagVsFF1RT890M5j2wLS6w457dlsmgC6M2d5k5sz8i0 */() {
      for (int var1 = 0; var1 < 64; var1++) {
         for (int var2 = 0; var2 < 64; var2++) {
            this.1SumC8s5pU6h88sy6NZh52k9lPBP48S91C8D75N11LHUYmIf7MyW4FD3imSN[var1][var2] = new 5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF(
               (5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY)null, var1, var2
            );
         }
      }

      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.addKeyListener(this);
      this.setFocusable(true);
      this.requestFocus();
      this.setBackground(Color.red);
   }

   public void _O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w/* $VF was: 2O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w */(
      String var1
   ) {
      this.50k63Bpubvz3Ktk3t2ot0rvh8zcyAQEj09Z9cAxK3v9jInPNbt3ylA07ExLV = this.87jVO6lx8hZ18044DDUb1W8X32X4EiSX3AFM4VA96y3A841m99y6ipESwB9I = 0;
      this.10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja = new 1Y1e4m4OWsA0q1gAbGh06LX9fp0YFm2UqE32byi8F2t2Q6T8kF2AIOM7lgo6U1y1EFJg52Rb653S8ki2khDO73I8nDd8p841J(
         this, new File(this.2CWm9ia4625qo2QiCMir7pr1JDT230dTksU9s5iJ3s8b2Ge8e382j8UG6h9y, "saves"), var1
      );
      this.10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja.8R2sYDCBg3QobS0j4jMh8W3mamazeux733Y1B8N25seN37q7lK8CFKw0P9W2 = 0;
      synchronized (this.7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f) {
         this.7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f.clear();

         for (int var3 = 0; var3 < 64; var3++) {
            for (int var4 = 0; var4 < 64; var4++) {
               this.1SumC8s5pU6h88sy6NZh52k9lPBP48S91C8D75N11LHUYmIf7MyW4FD3imSN[var3][var4]
                  ._r50GcKvG5G41T4nZCHS0NS3y2427iBqi6L5lX9QE3B6U422ai8gRC1et5QR/* $VF was: 7r50GcKvG5G41T4nZCHS0NS3y2427iBqi6L5lX9QE3B6U422ai8gRC1et5QR */(
                     this.10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja, var3, var4
                  );
            }
         }
      }
   }

   private void _Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(
      int var1
   ) {
      synchronized (this.7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f) {
         this.10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja.8R2sYDCBg3QobS0j4jMh8W3mamazeux733Y1B8N25seN37q7lK8CFKw0P9W2 = var1;
         this.7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f.clear();

         for (int var3 = 0; var3 < 64; var3++) {
            for (int var4 = 0; var4 < 64; var4++) {
               this.1SumC8s5pU6h88sy6NZh52k9lPBP48S91C8D75N11LHUYmIf7MyW4FD3imSN[var3][var4]
                  ._r50GcKvG5G41T4nZCHS0NS3y2427iBqi6L5lX9QE3B6U422ai8gRC1et5QR/* $VF was: 7r50GcKvG5G41T4nZCHS0NS3y2427iBqi6L5lX9QE3B6U422ai8gRC1et5QR */(
                     this.10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja, var3, var4
                  );
            }
         }
      }
   }

   public void _48eIn3ocyu8483r1bYotaP3CgdO9F6WMlV8nf3lAZyL8Az4oM4nBt745C83/* $VF was: 048eIn3ocyu8483r1bYotaP3CgdO9F6WMlV8nf3lAZyL8Az4oM4nBt745C83 */() {
      new 7V50K4kgE4Z15uh9jZ9zUI70yZ67aZQW69LQkKO3d3LQxf55Vd9ST24OJ11of7j6yz861SfS2nq6TMkV4SnIqk0DRMGf(this).start();

      for (int var1 = 0; var1 < 8; var1++) {
         new Thread(this).start();
      }
   }

   public void _2WOCvt0MDpA66gNz122G3tlFra1k80klfEcp48PNh400hBOcin61mlUSz1B/* $VF was: 42WOCvt0MDpA66gNz122G3tlFra1k80klfEcp48PNh400hBOcin61mlUSz1B */() {
      this.32txD0pV67SFR2wd4D3a3tb24582Z6ov78T72Cg7Kx8U2Gu0nZ2B4B26oQR9 = false;
   }

   private 5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF _90A7k31q26SPcAps0KtF5kQU4u5A03p7ZMh6ZuJ474C41HwM9j771oukX54/* $VF was: 790A7k31q26SPcAps0KtF5kQU4u5A03p7ZMh6ZuJ474C41HwM9j771oukX54 */(
      int var1, int var2
   ) {
      int var3 = var1 & 63;
      int var4 = var2 & 63;
      5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF var5 = this.1SumC8s5pU6h88sy6NZh52k9lPBP48S91C8D75N11LHUYmIf7MyW4FD3imSN[var3][var4];
      if (var5.1Ptq07ObeBn5cnc2Hvo5sxAmCyb89O4gW5f8asG4BJgu1683Xp5m687G8a41 == var1
         && var5.70cH252WV3Ffw5dP5bgNN05P7K18GG75b6He6o6n0tc30d26t8ax5wfK8f09 == var2) {
         return var5;
      }

      synchronized (this.7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f) {
         this.7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f.remove(var5);
      }

      var5._kA7qvl3An7nWIZCDn261B056h9V52Q4y6m2uyIv0318H60RKI0ZgZIQp2iL/* $VF was: 8kA7qvl3An7nWIZCDn261B056h9V52Q4y6m2uyIv0318H60RKI0ZgZIQp2iL */(var1, var2);
      return var5;
   }

   @Override
   public void run() {
      729wLc8hwl7tQSEXg3HsRG444K9D1o3Bi3exyPXRRdMjsGLGIyU3AQA2yY0rMpK979u8WUff3jJTFiOS9p5U9icBdQL2lm7JImBy51 var1 = new 729wLc8hwl7tQSEXg3HsRG444K9D1o3Bi3exyPXRRdMjsGLGIyU3AQA2yY0rMpK979u8WUff3jJTFiOS9p5U9icBdQL2lm7JImBy51();

      while (this.32txD0pV67SFR2wd4D3a3tb24582Z6ov78T72Cg7Kx8U2Gu0nZ2B4B26oQR9) {
         5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF var2 = null;
         synchronized (this.7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f) {
            if (this.7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f.size() > 0) {
               var2 = this.7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f.remove(0);
            }
         }

         if (var2 != null) {
            if (this.1D9B5McKsQ41yFfd7o0nE6x271TTK1GbL0DLUS0D4ct3Mcg2bGBcEGvzo2uB - var2.5bCtek4HsVYf5V9866810m9nPr35Ui9mvSN169CsRLP1125nxOy1z49CpFe4 < 2) {
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

   public void _JZ4Z1hE5ckU2GVM5inN5r096Bj2a3lRkVyI7J1B96cesT5A8VZJ1iM2Em5d/* $VF was: 9JZ4Z1hE5ckU2GVM5inN5r096Bj2a3lRkVyI7J1B96cesT5A8VZJ1iM2Em5d */(
      Graphics2D var1
   ) {
      this.1D9B5McKsQ41yFfd7o0nE6x271TTK1GbL0DLUS0D4ct3Mcg2bGBcEGvzo2uB++;
      AffineTransform var2 = var1.getTransform();
      var1.setClip(0, 0, this.getWidth(), this.getHeight());
      var1.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
      var1.translate(this.getWidth() / 2, this.getHeight() / 2);
      var1.scale(this.9C0d158s47Zu0eTaWiN7f5P0NQRJMS0065R7amsMXat56w34MkmeM7K4gmss, this.9C0d158s47Zu0eTaWiN7f5P0NQRJMS0065R7amsMXat56w34MkmeM7K4gmss);
      var1.translate(this.50k63Bpubvz3Ktk3t2ot0rvh8zcyAQEj09Z9cAxK3v9jInPNbt3ylA07ExLV, this.87jVO6lx8hZ18044DDUb1W8X32X4EiSX3AFM4VA96y3A841m99y6ipESwB9I);
      if (this.10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja != null) {
         var1.translate(
            -(
               this.10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja.01d2ssfM8LK4kLnkL0u9ml4w6nuErqGh8449WV70OP842UK6VcDJe9tV4Grf
                  + this.10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja.454PK5YFHgg4V8nk6oaJ64rpp4Dh0q7eMb5wMYTYAHf3McQ84p854xN8i0y6
            ),
            -(
                  -this.10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja.01d2ssfM8LK4kLnkL0u9ml4w6nuErqGh8449WV70OP842UK6VcDJe9tV4Grf
                     + this.10ldz5QOSS7lyh6tOg3h4JYq1SD0U5Xh394kGRZY6M5S7egEXWf0Ijzz23ja.454PK5YFHgg4V8nk6oaJ64rpp4Dh0q7eMb5wMYTYAHf3McQ84p854xN8i0y6
               )
               + 64
         );
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
            5b9av5ufoVer0hh5u77w3VG380f45cP2W6Bu1XDpImbFM4PIbLogd8eAtMZctK2q8eomUqysvstMm0T0Q0sYXdCZKU1pfCQM1IeL7tF var14 = this._90A7k31q26SPcAps0KtF5kQU4u5A03p7ZMh6ZuJ474C41HwM9j771oukX54/* $VF was: 790A7k31q26SPcAps0KtF5kQU4u5A03p7ZMh6ZuJ474C41HwM9j771oukX54 */(
               var12, var13
            );
            var14.5bCtek4HsVYf5V9866810m9nPr35Ui9mvSN169CsRLP1125nxOy1z49CpFe4 = this.1D9B5McKsQ41yFfd7o0nE6x271TTK1GbL0DLUS0D4ct3Mcg2bGBcEGvzo2uB;
            if (!var14.412nA6NkiGO6n7Cx8Ph8P5RUo8xoE50GQulkK7m445JG9wd413ygiw8y13B9) {
               if (!var14.2L8TvH89950TKq9EF9Y7BspwpH2izCu8Oiip1z19WbeV8h04uh5MsyI449TD) {
                  var14.2L8TvH89950TKq9EF9Y7BspwpH2izCu8Oiip1z19WbeV8h04uh5MsyI449TD = true;
                  this.7FgYya37H4CL9gA3jz9wlbqJRJT7j4nZgQ35Nq312i1f2wg314mrUzGJqp9f.add(var14);
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

      if (this.97dVQxGL94Vcwnuc5Av0eAhw3JPbH9k0SXu4r197kxxT0fwr3cvjSnr9861m) {
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
      int var2 = var1.getX() / this.9C0d158s47Zu0eTaWiN7f5P0NQRJMS0065R7amsMXat56w34MkmeM7K4gmss;
      int var3 = var1.getY() / this.9C0d158s47Zu0eTaWiN7f5P0NQRJMS0065R7amsMXat56w34MkmeM7K4gmss;
      this.50k63Bpubvz3Ktk3t2ot0rvh8zcyAQEj09Z9cAxK3v9jInPNbt3ylA07ExLV = this.50k63Bpubvz3Ktk3t2ot0rvh8zcyAQEj09Z9cAxK3v9jInPNbt3ylA07ExLV
         + (var2 - this.0fuWEnuT1L8LyhTVC971pKd081OXd51BX1Qwao63hc344Ab6qxlullLObRka);
      this.87jVO6lx8hZ18044DDUb1W8X32X4EiSX3AFM4VA96y3A841m99y6ipESwB9I = this.87jVO6lx8hZ18044DDUb1W8X32X4EiSX3AFM4VA96y3A841m99y6ipESwB9I
         + (var3 - this.4breUPlT23deP82dEnVlcZkYIT7mXSDoi7b8boCaYy13yV7ChQyiyXNZ1cz9);
      this.0fuWEnuT1L8LyhTVC971pKd081OXd51BX1Qwao63hc344Ab6qxlullLObRka = var2;
      this.4breUPlT23deP82dEnVlcZkYIT7mXSDoi7b8boCaYy13yV7ChQyiyXNZ1cz9 = var3;
      this.repaint();
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getClickCount() == 2) {
         this.9C0d158s47Zu0eTaWiN7f5P0NQRJMS0065R7amsMXat56w34MkmeM7K4gmss = 3 - this.9C0d158s47Zu0eTaWiN7f5P0NQRJMS0065R7amsMXat56w34MkmeM7K4gmss;
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
      int var2 = var1.getX() / this.9C0d158s47Zu0eTaWiN7f5P0NQRJMS0065R7amsMXat56w34MkmeM7K4gmss;
      int var3 = var1.getY() / this.9C0d158s47Zu0eTaWiN7f5P0NQRJMS0065R7amsMXat56w34MkmeM7K4gmss;
      this.0fuWEnuT1L8LyhTVC971pKd081OXd51BX1Qwao63hc344Ab6qxlullLObRka = var2;
      this.4breUPlT23deP82dEnVlcZkYIT7mXSDoi7b8boCaYy13yV7ChQyiyXNZ1cz9 = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 48) {
         this._Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(11);
      }

      if (var1.getKeyCode() == 49) {
         this._Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(10);
      }

      if (var1.getKeyCode() == 50) {
         this._Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(9);
      }

      if (var1.getKeyCode() == 51) {
         this._Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(7);
      }

      if (var1.getKeyCode() == 52) {
         this._Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(6);
      }

      if (var1.getKeyCode() == 53) {
         this._Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(5);
      }

      if (var1.getKeyCode() == 54) {
         this._Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(3);
      }

      if (var1.getKeyCode() == 55) {
         this._Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(2);
      }

      if (var1.getKeyCode() == 56) {
         this._Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(1);
      }

      if (var1.getKeyCode() == 57) {
         this._Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56/* $VF was: 1Uu7jw5f3t61Ic7wMNBvWx1OqQ672mMo6I048L906y9sG6fcWGepu76B1l56 */(0);
      }

      if (var1.getKeyCode() == 112) {
         this._O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w/* $VF was: 2O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w */("World1");
      }

      if (var1.getKeyCode() == 113) {
         this._O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w/* $VF was: 2O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w */("World2");
      }

      if (var1.getKeyCode() == 114) {
         this._O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w/* $VF was: 2O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w */("World3");
      }

      if (var1.getKeyCode() == 115) {
         this._O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w/* $VF was: 2O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w */("World4");
      }

      if (var1.getKeyCode() == 116) {
         this._O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w/* $VF was: 2O1lcD2wjz4v1Lviz9T2l5dR30y98tbIEZT0OMiaGlk36294RGIB37S5Hm6w */("World5");
      }

      if (var1.getKeyCode() == 32) {
         this.50k63Bpubvz3Ktk3t2ot0rvh8zcyAQEj09Z9cAxK3v9jInPNbt3ylA07ExLV = this.87jVO6lx8hZ18044DDUb1W8X32X4EiSX3AFM4VA96y3A841m99y6ipESwB9I = 0;
      }

      if (var1.getKeyCode() == 27) {
         this.97dVQxGL94Vcwnuc5Av0eAhw3JPbH9k0SXu4r197kxxT0fwr3cvjSnr9861m = !this.97dVQxGL94Vcwnuc5Av0eAhw3JPbH9k0SXu4r197kxxT0fwr3cvjSnr9861m;
      }

      this.repaint();
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   static boolean _i0Q99ev5Q3e8364h5pjmqq20g8j0zq7s8da932oWxV9cvkNg10JaQv5K7XY/* $VF was: 8i0Q99ev5Q3e8364h5pjmqq20g8j0zq7s8da932oWxV9cvkNg10JaQv5K7XY */(
      34BE7AAhcY7AVgV68WH9t6HE23HX0E7VU2ivmI9wAoimqdXd3nLGeTagVsFF1RT890M5j2wLS6w457dlsmgC6M2d5k5sz8i0 var0
   ) {
      return var0.32txD0pV67SFR2wd4D3a3tb24582Z6ov78T72Cg7Kx8U2Gu0nZ2B4B26oQR9;
   }
}
