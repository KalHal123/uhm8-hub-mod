import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class 8SE90oq047r951d4hFg7XTAGE79qK7Z45KLbF9i04CrcLOHGur9qd0khqn31bH4M51BVY02oQ46eAm730SVo480F5242D835
   implements 3N11iuTM04rK2xz7Lb4VY570HFZIasOT2Yu9cVw672u7dM382LD516ig7zYE7MG586pqIkjZ67bb5G7BG5kDNxLmXR12d8bt9D45w7Y {
   private File 4F2Psft2SW9h1cDk8Z4ZGWAhs4EtiBJv8W5fcyjo8U0924T33zQ6BIJEHuA8;
   private boolean 0qJYlf4Q7fwd7rh6dNZ4Fibf8ix94n9n0VGUmv8i8dsgMIg0V3txgLvqGXzP;

   public _SE90oq047r951d4hFg7XTAGE79qK7Z45KLbF9i04CrcLOHGur9qd0khqn31bH4M51BVY02oQ46eAm730SVo480F5242D835/* $VF was: 8SE90oq047r951d4hFg7XTAGE79qK7Z45KLbF9i04CrcLOHGur9qd0khqn31bH4M51BVY02oQ46eAm730SVo480F5242D835 */(
      File var1, boolean var2
   ) {
      this.4F2Psft2SW9h1cDk8Z4ZGWAhs4EtiBJv8W5fcyjo8U0924T33zQ6BIJEHuA8 = var1;
      this.0qJYlf4Q7fwd7rh6dNZ4Fibf8ix94n9n0VGUmv8i8dsgMIg0V3txgLvqGXzP = var2;
   }

   private File _f4N5Lb7jlx63o1YU289Nj2RCG86NXzspsCc20Op3g4M53HLiru2IL407uNA/* $VF was: 3f4N5Lb7jlx63o1YU289Nj2RCG86NXzspsCc20Op3g4M53HLiru2IL407uNA */(
      int var1, int var2
   ) {
      String var3 = "c." + Integer.toString(var1, 36) + "." + Integer.toString(var2, 36) + ".dat";
      String var4 = Integer.toString(var1 & 63, 36);
      String var5 = Integer.toString(var2 & 63, 36);
      File var6 = new File(this.4F2Psft2SW9h1cDk8Z4ZGWAhs4EtiBJv8W5fcyjo8U0924T33zQ6BIJEHuA8, var4);
      if (!var6.exists()) {
         if (!this.0qJYlf4Q7fwd7rh6dNZ4Fibf8ix94n9n0VGUmv8i8dsgMIg0V3txgLvqGXzP) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var5);
      if (!var6.exists()) {
         if (!this.0qJYlf4Q7fwd7rh6dNZ4Fibf8ix94n9n0VGUmv8i8dsgMIg0V3txgLvqGXzP) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var3);
      return !var6.exists() && !this.0qJYlf4Q7fwd7rh6dNZ4Fibf8ix94n9n0VGUmv8i8dsgMIg0V3txgLvqGXzP ? null : var6;
   }

   @Override
   public 9m2wWv7Y0P6wvrh59Qp3DG2Cs297QBiT9d3C2Ym8a3VBQf0y8ksZza1rWedXIKg0UcWrch6Q377o8vJ607zis39k6dbDXymg _M165cvEsauXUcVI46s276PxwvmfJ15n8G7R17PDRF0DlI3Wb729jnN6TrGD/* $VF was: 3M165cvEsauXUcVI46s276PxwvmfJ15n8G7R17PDRF0DlI3Wb729jnN6TrGD */(
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var1, int var2, int var3
   ) {
      File var4 = this._f4N5Lb7jlx63o1YU289Nj2RCG86NXzspsCc20Op3g4M53HLiru2IL407uNA/* $VF was: 3f4N5Lb7jlx63o1YU289Nj2RCG86NXzspsCc20Op3g4M53HLiru2IL407uNA */(
         var2, var3
      );
      if (var4 != null && var4.exists()) {
         try {
            FileInputStream var5 = new FileInputStream(var4);
            8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419 var6 = 8rpr1mRcCZ42Qo2JK1tWL4C6OL0Dc72LY87br61r6wfsvR07a56a5YZ742Hc22v4Kfl18Yssq5ukFdVY5q5YfWqCF47fzmdZ1Fdja._m5h26V9ZV6Zs60a7lfRofk6Z8nORG55r9yTihMQNW85jp82W1rGPribGSUz/* $VF was: 0m5h26V9ZV6Zs60a7lfRofk6Z8nORG55r9yTihMQNW85jp82W1rGPribGSUz */(
               var5
            );
            if (!var6._KYye1q32g6ikPIa5h6X24xR74KlJnN7ozIq1Zrg1zu3mm32Y8F139EIz3Ev/* $VF was: 9KYye1q32g6ikPIa5h6X24xR74KlJnN7ozIq1Zrg1zu3mm32Y8F139EIz3Ev */(
               "Level"
            )) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
               return null;
            }

            if (!var6._X5HaW0x84nY85GZPK3rw2W89RK5SMSqnvsNgMkiGE86K6aH89tP6PfZ3DZp/* $VF was: 2X5HaW0x84nY85GZPK3rw2W89RK5SMSqnvsNgMkiGE86K6aH89tP6PfZ3DZp */(
                  "Level"
               )
               ._KYye1q32g6ikPIa5h6X24xR74KlJnN7ozIq1Zrg1zu3mm32Y8F139EIz3Ev/* $VF was: 9KYye1q32g6ikPIa5h6X24xR74KlJnN7ozIq1Zrg1zu3mm32Y8F139EIz3Ev */(
                  "Blocks"
               )) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
               return null;
            }

            9m2wWv7Y0P6wvrh59Qp3DG2Cs297QBiT9d3C2Ym8a3VBQf0y8ksZza1rWedXIKg0UcWrch6Q377o8vJ607zis39k6dbDXymg var7 = _hUQ17LNOhSJ426k8WLQ6Cj164nEzW295wX8NhNfs0TBCx4X84xBQ2YrKgow/* $VF was: 4hUQ17LNOhSJ426k8WLQ6Cj164nEzW295wX8NhNfs0TBCx4X84xBQ2YrKgow */(
               var1,
               var6._X5HaW0x84nY85GZPK3rw2W89RK5SMSqnvsNgMkiGE86K6aH89tP6PfZ3DZp/* $VF was: 2X5HaW0x84nY85GZPK3rw2W89RK5SMSqnvsNgMkiGE86K6aH89tP6PfZ3DZp */(
                  "Level"
               )
            );
            if (!var7._YdA9nJpFrWj42ANfeG9bDofUR91jsy4eGUo8ehbWBT305FiFSgex6ajhP29/* $VF was: 2YdA9nJpFrWj42ANfeG9bDofUR91jsy4eGUo8ehbWBT305FiFSgex6ajhP29 */(
               var2, var3
            )) {
               System.out
                  .println(
                     "Chunk file at "
                        + var2
                        + ","
                        + var3
                        + " is in the wrong location; relocating. (Expected "
                        + var2
                        + ", "
                        + var3
                        + ", got "
                        + var7.2y04A00eB4G8iQauwPd6yhvpffc78mLLYecI06J3AQs8AkCh5yLnYpZMHP24
                        + ", "
                        + var7.9zLuEOkVmzOvo44K99t8D64EkmqNtT62dQ3V26WNMmc8Qwtr1OT8ndE1gE5k
                        + ")"
                  );
               var6._kL0Mx1R6k8Wg2Ectkqdi9vX18WxTjhoRxVGiLxG8FNlkx2gT9D39wYEYN6Y/* $VF was: 6kL0Mx1R6k8Wg2Ectkqdi9vX18WxTjhoRxVGiLxG8FNlkx2gT9D39wYEYN6Y */(
                  "xPos", var2
               );
               var6._kL0Mx1R6k8Wg2Ectkqdi9vX18WxTjhoRxVGiLxG8FNlkx2gT9D39wYEYN6Y/* $VF was: 6kL0Mx1R6k8Wg2Ectkqdi9vX18WxTjhoRxVGiLxG8FNlkx2gT9D39wYEYN6Y */(
                  "zPos", var3
               );
               var7 = _hUQ17LNOhSJ426k8WLQ6Cj164nEzW295wX8NhNfs0TBCx4X84xBQ2YrKgow/* $VF was: 4hUQ17LNOhSJ426k8WLQ6Cj164nEzW295wX8NhNfs0TBCx4X84xBQ2YrKgow */(
                  var1,
                  var6._X5HaW0x84nY85GZPK3rw2W89RK5SMSqnvsNgMkiGE86K6aH89tP6PfZ3DZp/* $VF was: 2X5HaW0x84nY85GZPK3rw2W89RK5SMSqnvsNgMkiGE86K6aH89tP6PfZ3DZp */(
                     "Level"
                  )
               );
            }

            return var7;
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      return null;
   }

   @Override
   public void _2tON8sBe87wE1ym9u9sL7G0n21ZTl3FjuYtVKEl11v88X26g0zeTz76yDen/* $VF was: 72tON8sBe87wE1ym9u9sL7G0n21ZTl3FjuYtVKEl11v88X26g0zeTz76yDen */(
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var1,
      9m2wWv7Y0P6wvrh59Qp3DG2Cs297QBiT9d3C2Ym8a3VBQf0y8ksZza1rWedXIKg0UcWrch6Q377o8vJ607zis39k6dbDXymg var2
   ) {
      var1._TrCD5q4coQG9Pm6BEFi8zZZOn1V2Ut7A6VU4LcPu48VX2H6RP68L45aJhg5/* $VF was: 9TrCD5q4coQG9Pm6BEFi8zZZOn1V2Ut7A6VU4LcPu48VX2H6RP68L45aJhg5 */();
      File var3 = this._f4N5Lb7jlx63o1YU289Nj2RCG86NXzspsCc20Op3g4M53HLiru2IL407uNA/* $VF was: 3f4N5Lb7jlx63o1YU289Nj2RCG86NXzspsCc20Op3g4M53HLiru2IL407uNA */(
         var2.2y04A00eB4G8iQauwPd6yhvpffc78mLLYecI06J3AQs8AkCh5yLnYpZMHP24, var2.9zLuEOkVmzOvo44K99t8D64EkmqNtT62dQ3V26WNMmc8Qwtr1OT8ndE1gE5k
      );
      if (var3.exists()) {
         var1.58zF0h92wc3p6V50EZg51sqDGc5OG00M4nE9BEnwGpCM6V73ffsQ422Q8dtY = var1.58zF0h92wc3p6V50EZg51sqDGc5OG00M4nE9BEnwGpCM6V73ffsQ422Q8dtY - var3.length();
      }

      try {
         Random var4 = new Random();
         File var5 = new File(this.4F2Psft2SW9h1cDk8Z4ZGWAhs4EtiBJv8W5fcyjo8U0924T33zQ6BIJEHuA8, "tmp_chunk" + var4.nextLong() + "" + var4.nextLong() + ".dat");
         FileOutputStream var6 = new FileOutputStream(var5);
         8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419 var7 = new 8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419();
         8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419 var8 = new 8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419();
         var7._rFZR656C2J6KAokVeC6rx53FteIkH749jR6M84UHBMgX25fddfsA1eK9S1C/* $VF was: 4rFZR656C2J6KAokVeC6rx53FteIkH749jR6M84UHBMgX25fddfsA1eK9S1C */(
            "Level", var8
         );
         this._l218UuH65VoJWmdI4j210l86InEXbTKjCTCT5pB1ldiS99Noj5liiJjHVLy/* $VF was: 9l218UuH65VoJWmdI4j210l86InEXbTKjCTCT5pB1ldiS99Noj5liiJjHVLy */(
            var2, var1, var8
         );
         8rpr1mRcCZ42Qo2JK1tWL4C6OL0Dc72LY87br61r6wfsvR07a56a5YZ742Hc22v4Kfl18Yssq5ukFdVY5q5YfWqCF47fzmdZ1Fdja._Fhlt542FJAc7BX0rO8g6TV0Bj63Zo6X215xpm9y4Zb2u9hx46pB4yhavF8p/* $VF was: 8Fhlt542FJAc7BX0rO8g6TV0Bj63Zo6X215xpm9y4Zb2u9hx46pB4yhavF8p */(
            var7, var6
         );
         var6.close();
         if (var3.exists()) {
            var3.delete();
         }

         var5.renameTo(var3);
         var1.58zF0h92wc3p6V50EZg51sqDGc5OG00M4nE9BEnwGpCM6V73ffsQ422Q8dtY = var1.58zF0h92wc3p6V50EZg51sqDGc5OG00M4nE9BEnwGpCM6V73ffsQ422Q8dtY + var3.length();
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }

   public void _l218UuH65VoJWmdI4j210l86InEXbTKjCTCT5pB1ldiS99Noj5liiJjHVLy/* $VF was: 9l218UuH65VoJWmdI4j210l86InEXbTKjCTCT5pB1ldiS99Noj5liiJjHVLy */(
      9m2wWv7Y0P6wvrh59Qp3DG2Cs297QBiT9d3C2Ym8a3VBQf0y8ksZza1rWedXIKg0UcWrch6Q377o8vJ607zis39k6dbDXymg var1,
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var2,
      8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419 var3
   ) {
      var2._TrCD5q4coQG9Pm6BEFi8zZZOn1V2Ut7A6VU4LcPu48VX2H6RP68L45aJhg5/* $VF was: 9TrCD5q4coQG9Pm6BEFi8zZZOn1V2Ut7A6VU4LcPu48VX2H6RP68L45aJhg5 */();
      var3._kL0Mx1R6k8Wg2Ectkqdi9vX18WxTjhoRxVGiLxG8FNlkx2gT9D39wYEYN6Y/* $VF was: 6kL0Mx1R6k8Wg2Ectkqdi9vX18WxTjhoRxVGiLxG8FNlkx2gT9D39wYEYN6Y */(
         "xPos", var1.2y04A00eB4G8iQauwPd6yhvpffc78mLLYecI06J3AQs8AkCh5yLnYpZMHP24
      );
      var3._kL0Mx1R6k8Wg2Ectkqdi9vX18WxTjhoRxVGiLxG8FNlkx2gT9D39wYEYN6Y/* $VF was: 6kL0Mx1R6k8Wg2Ectkqdi9vX18WxTjhoRxVGiLxG8FNlkx2gT9D39wYEYN6Y */(
         "zPos", var1.9zLuEOkVmzOvo44K99t8D64EkmqNtT62dQ3V26WNMmc8Qwtr1OT8ndE1gE5k
      );
      var3._KB79zX3AGN4bUK1uftZEgW09nWDo6r73iOIxRFY559O4T4qQ2LEvtvuAPXI/* $VF was: 8KB79zX3AGN4bUK1uftZEgW09nWDo6r73iOIxRFY559O4T4qQ2LEvtvuAPXI */(
         "LastUpdate", var2.6Ip14xQj6BIL31gr41Qvooh5k9q54C7TXb9wSt226z53ZDOBtUKPpipUDIH0
      );
      var3._7m34ujrlf8Oy11KcO1u0bOu2htWJM2bt6DTp7cshM6aNd71Zs1O98chdHgz/* $VF was: 87m34ujrlf8Oy11KcO1u0bOu2htWJM2bt6DTp7cshM6aNd71Zs1O98chdHgz */(
         "Blocks", var1.8T8IepYnrzFOjji5OuyOOYtCH2GVi1s64tu5Oy9J14V72m240Wm4cm6i657c
      );
      var3._7m34ujrlf8Oy11KcO1u0bOu2htWJM2bt6DTp7cshM6aNd71Zs1O98chdHgz/* $VF was: 87m34ujrlf8Oy11KcO1u0bOu2htWJM2bt6DTp7cshM6aNd71Zs1O98chdHgz */(
         "Data", var1.88n5Vts6vV22TX1rmbB5sbt7Q9Z26i5gs94O622EyW3SQdK40E78FRe3STg5.2qJmXbD7pIj51567xH8s8do34al46ZlD85d5uCwBvXM2G71g6icxNIG8LttU
      );
      var3._7m34ujrlf8Oy11KcO1u0bOu2htWJM2bt6DTp7cshM6aNd71Zs1O98chdHgz/* $VF was: 87m34ujrlf8Oy11KcO1u0bOu2htWJM2bt6DTp7cshM6aNd71Zs1O98chdHgz */(
         "SkyLight", var1.4B84Pj946Xce6s563QspES3mRd0Vq08shyl1zeaI94I9o1HQ7Xt43g59L7Ib.2qJmXbD7pIj51567xH8s8do34al46ZlD85d5uCwBvXM2G71g6icxNIG8LttU
      );
      var3._7m34ujrlf8Oy11KcO1u0bOu2htWJM2bt6DTp7cshM6aNd71Zs1O98chdHgz/* $VF was: 87m34ujrlf8Oy11KcO1u0bOu2htWJM2bt6DTp7cshM6aNd71Zs1O98chdHgz */(
         "BlockLight", var1.48x2QINJ91Qy8r337j8yKk3oKS09kMONT8T62jRZkOUXeLhsi124wchdZCzL.2qJmXbD7pIj51567xH8s8do34al46ZlD85d5uCwBvXM2G71g6icxNIG8LttU
      );
      var3._7m34ujrlf8Oy11KcO1u0bOu2htWJM2bt6DTp7cshM6aNd71Zs1O98chdHgz/* $VF was: 87m34ujrlf8Oy11KcO1u0bOu2htWJM2bt6DTp7cshM6aNd71Zs1O98chdHgz */(
         "HeightMap", var1.894ukc0835sZyc3wC6rYzzoA9Cwkr3P7608wqMaB2hw7imTK88KwpCLjyyNJ
      );
      var3._R2j00845aDHtp6faw6Q8P2POC79nYQlMiqrjo9i1bcX7TU4im1fZCr4HRb1/* $VF was: 3R2j00845aDHtp6faw6Q8P2POC79nYQlMiqrjo9i1bcX7TU4im1fZCr4HRb1 */(
         "TerrainPopulated", var1.1XC1u9O51H6GF79GgT4S9ANn5Vh2jrU03u07mh14J4y6DweZmuzo063n8NzO
      );
      var1.2RzduNyzNzf495cU1k291AmrcFZiZE0erp500DLsmfA43MVVpp9b73UPCtsz = false;
      4d42WC8IOlF5b2geal4NQk6ibJke2bs4240Y3lhJnxK7i21K1Pf54b98jw84dTo8q6xfwV0T2segbUDIqe6bax9oDWcwB var4 = new 4d42WC8IOlF5b2geal4NQk6ibJke2bs4240Y3lhJnxK7i21K1Pf54b98jw84dTo8q6xfwV0T2segbUDIqe6bax9oDWcwB();

      for (int var6 = 0; var6 < var1.9591XZ6DTMys3rX6h9204p3T8dXd2NdEfVq0KG6lp5H201T8Nx70J5Tsz7l2.length; var6++) {
         for (4GWFbOIMR3rg69M1Tw7AsIuO5A54yNk6ixz2D7h14bcq6qKB3v03aoGd8614DGBeJF7H1Bel756g1YCxyfkR0pQsk5P6wYjVNy var8 : var1.9591XZ6DTMys3rX6h9204p3T8dXd2NdEfVq0KG6lp5H201T8Nx70J5Tsz7l2[var6]) {
            var1.2RzduNyzNzf495cU1k291AmrcFZiZE0erp500DLsmfA43MVVpp9b73UPCtsz = true;
            8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419 var5 = new 8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419();
            if (var8._57CkZ5spGIc0aXM35z53bCTU56Lu9911z5HK94C8rq854nbU93Is3vzck8P/* $VF was: 357CkZ5spGIc0aXM35z53bCTU56Lu9911z5HK94C8rq854nbU93Is3vzck8P */(
               var5
            )) {
               var4._d0NeAT7rR4jb8OC7vL14tdjQ14OjRfyp3OsQ93UX1hOFEBAEkTINdW4J79E/* $VF was: 9d0NeAT7rR4jb8OC7vL14tdjQ14OjRfyp3OsQ93UX1hOFEBAEkTINdW4J79E */(
                  var5
               );
            }
         }
      }

      var3._rFZR656C2J6KAokVeC6rx53FteIkH749jR6M84UHBMgX25fddfsA1eK9S1C/* $VF was: 4rFZR656C2J6KAokVeC6rx53FteIkH749jR6M84UHBMgX25fddfsA1eK9S1C */(
         "Entities", var4
      );
      4d42WC8IOlF5b2geal4NQk6ibJke2bs4240Y3lhJnxK7i21K1Pf54b98jw84dTo8q6xfwV0T2segbUDIqe6bax9oDWcwB var10 = new 4d42WC8IOlF5b2geal4NQk6ibJke2bs4240Y3lhJnxK7i21K1Pf54b98jw84dTo8q6xfwV0T2segbUDIqe6bax9oDWcwB();

      for (2CH1O4x7hQ8O572ZyMcDZ0DyK1wE6ClgR80TmjF09FNFhK5mAp683Y6Ta2UZHl4sgGdxggI0w5C4914xpTP3PjkjRTzm228ex var12 : var1.96p320125WacX90V676Crp721ulo3n1OzMGApJaFs8ew571EMgrk7icq574G
         .values()) {
         8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419 var9 = new 8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419();
         var12._D3U7U9U6s7Y1RPyKWorWxpPbx5N1Hu23waj820JwMdHTISs0FPbq91mK806/* $VF was: 8D3U7U9U6s7Y1RPyKWorWxpPbx5N1Hu23waj820JwMdHTISs0FPbq91mK806 */(var9);
         var10._d0NeAT7rR4jb8OC7vL14tdjQ14OjRfyp3OsQ93UX1hOFEBAEkTINdW4J79E/* $VF was: 9d0NeAT7rR4jb8OC7vL14tdjQ14OjRfyp3OsQ93UX1hOFEBAEkTINdW4J79E */(var9);
      }

      var3._rFZR656C2J6KAokVeC6rx53FteIkH749jR6M84UHBMgX25fddfsA1eK9S1C/* $VF was: 4rFZR656C2J6KAokVeC6rx53FteIkH749jR6M84UHBMgX25fddfsA1eK9S1C */(
         "TileEntities", var10
      );
   }

   public static 9m2wWv7Y0P6wvrh59Qp3DG2Cs297QBiT9d3C2Ym8a3VBQf0y8ksZza1rWedXIKg0UcWrch6Q377o8vJ607zis39k6dbDXymg _hUQ17LNOhSJ426k8WLQ6Cj164nEzW295wX8NhNfs0TBCx4X84xBQ2YrKgow/* $VF was: 4hUQ17LNOhSJ426k8WLQ6Cj164nEzW295wX8NhNfs0TBCx4X84xBQ2YrKgow */(
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var0,
      8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419 var1
   ) {
      int var2 = var1._v6RTdxFq558Jfei8eLryq7v9nG0S13D93sIGU4U8GjNQ58lGoKC6LBCFRL0/* $VF was: 8v6RTdxFq558Jfei8eLryq7v9nG0S13D93sIGU4U8GjNQ58lGoKC6LBCFRL0 */(
         "xPos"
      );
      int var3 = var1._v6RTdxFq558Jfei8eLryq7v9nG0S13D93sIGU4U8GjNQ58lGoKC6LBCFRL0/* $VF was: 8v6RTdxFq558Jfei8eLryq7v9nG0S13D93sIGU4U8GjNQ58lGoKC6LBCFRL0 */(
         "zPos"
      );
      9m2wWv7Y0P6wvrh59Qp3DG2Cs297QBiT9d3C2Ym8a3VBQf0y8ksZza1rWedXIKg0UcWrch6Q377o8vJ607zis39k6dbDXymg var4 = new 9m2wWv7Y0P6wvrh59Qp3DG2Cs297QBiT9d3C2Ym8a3VBQf0y8ksZza1rWedXIKg0UcWrch6Q377o8vJ607zis39k6dbDXymg(
         var0, var2, var3
      );
      var4.8T8IepYnrzFOjji5OuyOOYtCH2GVi1s64tu5Oy9J14V72m240Wm4cm6i657c = var1._b22sYt9fiOINw0abOiE8JWt0exb9cD2ervK0j8M3Sd0ux5I4dpoW4YsrQ26/* $VF was: 8b22sYt9fiOINw0abOiE8JWt0exb9cD2ervK0j8M3Sd0ux5I4dpoW4YsrQ26 */(
         "Blocks"
      );
      var4.88n5Vts6vV22TX1rmbB5sbt7Q9Z26i5gs94O622EyW3SQdK40E78FRe3STg5 = new 1g9c5c64er1Be7481671w4l8713i0q3v6Ltd8C00Ga4ee0tD4lxHX27l9oSknv514rpN2bpn8Jb130XJ5rQ4Ph8lI62OShchMVQ(
         var1._b22sYt9fiOINw0abOiE8JWt0exb9cD2ervK0j8M3Sd0ux5I4dpoW4YsrQ26/* $VF was: 8b22sYt9fiOINw0abOiE8JWt0exb9cD2ervK0j8M3Sd0ux5I4dpoW4YsrQ26 */("Data")
      );
      var4.4B84Pj946Xce6s563QspES3mRd0Vq08shyl1zeaI94I9o1HQ7Xt43g59L7Ib = new 1g9c5c64er1Be7481671w4l8713i0q3v6Ltd8C00Ga4ee0tD4lxHX27l9oSknv514rpN2bpn8Jb130XJ5rQ4Ph8lI62OShchMVQ(
         var1._b22sYt9fiOINw0abOiE8JWt0exb9cD2ervK0j8M3Sd0ux5I4dpoW4YsrQ26/* $VF was: 8b22sYt9fiOINw0abOiE8JWt0exb9cD2ervK0j8M3Sd0ux5I4dpoW4YsrQ26 */(
            "SkyLight"
         )
      );
      var4.48x2QINJ91Qy8r337j8yKk3oKS09kMONT8T62jRZkOUXeLhsi124wchdZCzL = new 1g9c5c64er1Be7481671w4l8713i0q3v6Ltd8C00Ga4ee0tD4lxHX27l9oSknv514rpN2bpn8Jb130XJ5rQ4Ph8lI62OShchMVQ(
         var1._b22sYt9fiOINw0abOiE8JWt0exb9cD2ervK0j8M3Sd0ux5I4dpoW4YsrQ26/* $VF was: 8b22sYt9fiOINw0abOiE8JWt0exb9cD2ervK0j8M3Sd0ux5I4dpoW4YsrQ26 */(
            "BlockLight"
         )
      );
      var4.894ukc0835sZyc3wC6rYzzoA9Cwkr3P7608wqMaB2hw7imTK88KwpCLjyyNJ = var1._b22sYt9fiOINw0abOiE8JWt0exb9cD2ervK0j8M3Sd0ux5I4dpoW4YsrQ26/* $VF was: 8b22sYt9fiOINw0abOiE8JWt0exb9cD2ervK0j8M3Sd0ux5I4dpoW4YsrQ26 */(
         "HeightMap"
      );
      var4.1XC1u9O51H6GF79GgT4S9ANn5Vh2jrU03u07mh14J4y6DweZmuzo063n8NzO = var1._u70dUA8gTNAuFm8BlKCl2kH8tI9KgtnGQElfZhmBFqoc31X79gYzzcff49p/* $VF was: 6u70dUA8gTNAuFm8BlKCl2kH8tI9KgtnGQElfZhmBFqoc31X79gYzzcff49p */(
         "TerrainPopulated"
      );
      if (!var4.88n5Vts6vV22TX1rmbB5sbt7Q9Z26i5gs94O622EyW3SQdK40E78FRe3STg5
         ._X1E5aT1n6KknKs5ID1GW8Xwe6PI938XL1l4W8XcU4u3SO8i9Al3bS5EzHEi/* $VF was: 2X1E5aT1n6KknKs5ID1GW8Xwe6PI938XL1l4W8XcU4u3SO8i9Al3bS5EzHEi */()) {
         var4.88n5Vts6vV22TX1rmbB5sbt7Q9Z26i5gs94O622EyW3SQdK40E78FRe3STg5 = new 1g9c5c64er1Be7481671w4l8713i0q3v6Ltd8C00Ga4ee0tD4lxHX27l9oSknv514rpN2bpn8Jb130XJ5rQ4Ph8lI62OShchMVQ(
            var4.8T8IepYnrzFOjji5OuyOOYtCH2GVi1s64tu5Oy9J14V72m240Wm4cm6i657c.length
         );
      }

      if (var4.894ukc0835sZyc3wC6rYzzoA9Cwkr3P7608wqMaB2hw7imTK88KwpCLjyyNJ == null
         || !var4.4B84Pj946Xce6s563QspES3mRd0Vq08shyl1zeaI94I9o1HQ7Xt43g59L7Ib
            ._X1E5aT1n6KknKs5ID1GW8Xwe6PI938XL1l4W8XcU4u3SO8i9Al3bS5EzHEi/* $VF was: 2X1E5aT1n6KknKs5ID1GW8Xwe6PI938XL1l4W8XcU4u3SO8i9Al3bS5EzHEi */()) {
         var4.894ukc0835sZyc3wC6rYzzoA9Cwkr3P7608wqMaB2hw7imTK88KwpCLjyyNJ = new byte[256];
         var4.4B84Pj946Xce6s563QspES3mRd0Vq08shyl1zeaI94I9o1HQ7Xt43g59L7Ib = new 1g9c5c64er1Be7481671w4l8713i0q3v6Ltd8C00Ga4ee0tD4lxHX27l9oSknv514rpN2bpn8Jb130XJ5rQ4Ph8lI62OShchMVQ(
            var4.8T8IepYnrzFOjji5OuyOOYtCH2GVi1s64tu5Oy9J14V72m240Wm4cm6i657c.length
         );
         var4._cHEd94q6990yu4c5ItNvmfW5GkZnS4H53ju824e46G6nHB89nt0MLB5hkyZ/* $VF was: 7cHEd94q6990yu4c5ItNvmfW5GkZnS4H53ju824e46G6nHB89nt0MLB5hkyZ */();
      }

      if (!var4.48x2QINJ91Qy8r337j8yKk3oKS09kMONT8T62jRZkOUXeLhsi124wchdZCzL
         ._X1E5aT1n6KknKs5ID1GW8Xwe6PI938XL1l4W8XcU4u3SO8i9Al3bS5EzHEi/* $VF was: 2X1E5aT1n6KknKs5ID1GW8Xwe6PI938XL1l4W8XcU4u3SO8i9Al3bS5EzHEi */()) {
         var4.48x2QINJ91Qy8r337j8yKk3oKS09kMONT8T62jRZkOUXeLhsi124wchdZCzL = new 1g9c5c64er1Be7481671w4l8713i0q3v6Ltd8C00Ga4ee0tD4lxHX27l9oSknv514rpN2bpn8Jb130XJ5rQ4Ph8lI62OShchMVQ(
            var4.8T8IepYnrzFOjji5OuyOOYtCH2GVi1s64tu5Oy9J14V72m240Wm4cm6i657c.length
         );
         var4._FNyyTK9m8ZICYQR7oNG757aZ2x0L09pPL5sM49FF14nw0H3GDY8b5eK0cQg/* $VF was: 0FNyyTK9m8ZICYQR7oNG757aZ2x0L09pPL5sM49FF14nw0H3GDY8b5eK0cQg */();
      }

      4d42WC8IOlF5b2geal4NQk6ibJke2bs4240Y3lhJnxK7i21K1Pf54b98jw84dTo8q6xfwV0T2segbUDIqe6bax9oDWcwB var5 = var1._8bUF77TBdJg1fgX78V2H0j8ReA06l86iI2k5M6Z2W6AxZVA2157H2k3EZlv/* $VF was: 88bUF77TBdJg1fgX78V2H0j8ReA06l86iI2k5M6Z2W6AxZVA2157H2k3EZlv */(
         "Entities"
      );
      if (var5 != null) {
         for (int var6 = 0;
            var6
               < var5._3Wfd6tnBpGKNXz8k3U0F5oJsa6F7aQAhuJQIfeybb5vp7ho241A5UjfHb82/* $VF was: 33Wfd6tnBpGKNXz8k3U0F5oJsa6F7aQAhuJQIfeybb5vp7ho241A5UjfHb82 */();
            var6++
         ) {
            8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419 var7 = (8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419)var5._06LJ8WFfP7YY58hTL9jKtbM8PBY3oi4pE8SoV0nzLTjtOG9Vb823dzFGP6X/* $VF was: 806LJ8WFfP7YY58hTL9jKtbM8PBY3oi4pE8SoV0nzLTjtOG9Vb823dzFGP6X */(
               var6
            );
            4GWFbOIMR3rg69M1Tw7AsIuO5A54yNk6ixz2D7h14bcq6qKB3v03aoGd8614DGBeJF7H1Bel756g1YCxyfkR0pQsk5P6wYjVNy var8 = 26z47zA720ccp609uPe82tW9lfArnW4BooiN12sA92P8LzQO035glx8gZenSUdj1fprlRxr87gOwC0E48S5L36KP4I8bDjYtQG._Uh6e0agYW6p0YHOso185V98jQYIO4cYU8ibkFEg8v98T4d75Xfzal4E7z0D/* $VF was: 8Uh6e0agYW6p0YHOso185V98jQYIO4cYU8ibkFEg8v98T4d75Xfzal4E7z0D */(
               var7, var0
            );
            var4.2RzduNyzNzf495cU1k291AmrcFZiZE0erp500DLsmfA43MVVpp9b73UPCtsz = true;
            if (var8 != null) {
               var4._EKjfkI1ljNi406clQh4e5y4Vxzd02EL0ve98RZw441HVb9zAA8EI0OBhgXG/* $VF was: 0EKjfkI1ljNi406clQh4e5y4Vxzd02EL0ve98RZw441HVb9zAA8EI0OBhgXG */(
                  var8
               );
            }
         }
      }

      4d42WC8IOlF5b2geal4NQk6ibJke2bs4240Y3lhJnxK7i21K1Pf54b98jw84dTo8q6xfwV0T2segbUDIqe6bax9oDWcwB var10 = var1._8bUF77TBdJg1fgX78V2H0j8ReA06l86iI2k5M6Z2W6AxZVA2157H2k3EZlv/* $VF was: 88bUF77TBdJg1fgX78V2H0j8ReA06l86iI2k5M6Z2W6AxZVA2157H2k3EZlv */(
         "TileEntities"
      );
      if (var10 != null) {
         for (int var11 = 0;
            var11
               < var10._3Wfd6tnBpGKNXz8k3U0F5oJsa6F7aQAhuJQIfeybb5vp7ho241A5UjfHb82/* $VF was: 33Wfd6tnBpGKNXz8k3U0F5oJsa6F7aQAhuJQIfeybb5vp7ho241A5UjfHb82 */();
            var11++
         ) {
            8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419 var12 = (8v1Wea8NBtvX76Z25hmTl58edvN4Yfmt895AY82fN0vlvW0X33m3A2373n0El8iwc691zC268LPWZoiTtf503fOE7RFMg6419)var10._06LJ8WFfP7YY58hTL9jKtbM8PBY3oi4pE8SoV0nzLTjtOG9Vb823dzFGP6X/* $VF was: 806LJ8WFfP7YY58hTL9jKtbM8PBY3oi4pE8SoV0nzLTjtOG9Vb823dzFGP6X */(
               var11
            );
            2CH1O4x7hQ8O572ZyMcDZ0DyK1wE6ClgR80TmjF09FNFhK5mAp683Y6Ta2UZHl4sgGdxggI0w5C4914xpTP3PjkjRTzm228ex var9 = 2CH1O4x7hQ8O572ZyMcDZ0DyK1wE6ClgR80TmjF09FNFhK5mAp683Y6Ta2UZHl4sgGdxggI0w5C4914xpTP3PjkjRTzm228ex._n2vG1waKmBscz0ang974R56D2mbJH445C5UE660374yT2t0fexkb8G1973u/* $VF was: 7n2vG1waKmBscz0ang974R56D2mbJH445C5UE660374yT2t0fexkb8G1973u */(
               var12
            );
            if (var9 != null) {
               var4._C2n159a8ox9c6xsN9byV1ZpcTq5G6043MiU7ztO6GhNRKyxO5J9YCk8umOU/* $VF was: 4C2n159a8ox9c6xsN9byV1ZpcTq5G6043MiU7ztO6GhNRKyxO5J9YCk8umOU */(
                  var9
               );
            }
         }
      }

      return var4;
   }

   @Override
   public void _EP8ca2Y43Se95T25H75T39BaaZTWkE2nFjGr2CMPYLv02ve8378VZZy5F46/* $VF was: 9EP8ca2Y43Se95T25H75T39BaaZTWkE2nFjGr2CMPYLv02ve8378VZZy5F46 */() {
   }

   @Override
   public void _RW99be71F59wqUsCW838S1214RcQb0jC5r695lZQf4470mb928aGG1u0Fp3/* $VF was: 4RW99be71F59wqUsCW838S1214RcQb0jC5r695lZQf4470mb928aGG1u0Fp3 */() {
   }

   @Override
   public void _aB98RdnPr849DVnPYVvebtw48f7fLqjcyNpnaNfr8Vz9fVLWTR9TQZjazvC/* $VF was: 4aB98RdnPr849DVnPYVvebtw48f7fLqjcyNpnaNfr8Vz9fVLWTR9TQZjazvC */(
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var1,
      9m2wWv7Y0P6wvrh59Qp3DG2Cs297QBiT9d3C2Ym8a3VBQf0y8ksZza1rWedXIKg0UcWrch6Q377o8vJ607zis39k6dbDXymg var2
   ) {
   }
}
