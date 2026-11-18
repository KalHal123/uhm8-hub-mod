import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class 9V771lEREz25NK8H0bcw7BANXqc0sSlP4aQo0Y00adeh0Mcrs58U4X5n1Nf0L15t827DpG2w0OQL4wysi3U94bo6Nws398C4z0 extends FilterOutputStream {
   private int 44n01S0gNVjXXIJTMk3b5M5cl6b0FQg70R2x8VaY50217Z4m95iTACxjT47w = 0;
   private int 0mI4c389hzXt5FbouLq9L392hry9c9Z0dhGAetJqdlq9wiQmiHWCLI4YH5ta;
   private int 1V0uzGaFq9yZ69I41A83ysxl17cvWMeP36uSwnzx78fdnArn2n57iIa73eU9;
   private int 7A9Hud7kt4FS8hkYlZnGc1sjoWs58EbEIHhHThDZ987b9T27WdX4G8imvM1l;
   private boolean 30314jm0WlLpG68041VL7p572Sv2nRYzYUzb0fF7Knp17LGNJvNeB7DAAmZn = false;
   private final char[] 3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF;
   private final byte[] 26W6GO0G137B125IG3R8P0B3WOjmaB2LzY5F8qBVG1ciqNq6l8YYa2sCado4;
   private final int 8KLyy53w4Ng6iuskktls083roY7HCn8KKeEbT202oiP8viKv057xh464WJ8j;
   private final boolean 43G9098wc0Y46kwDaG2P7cZdL8pSdAcj8dbF1LHazYb7a4s65y68s21HOBkq;
   private int 88FpTvZKu9uuV7n2KqVX5AL5shE58O89o341HFATAbg9R18cFjpe6um279KO = 0;

   _V771lEREz25NK8H0bcw7BANXqc0sSlP4aQo0Y00adeh0Mcrs58U4X5n1Nf0L15t827DpG2w0OQL4wysi3U94bo6Nws398C4z0/* $VF was: 9V771lEREz25NK8H0bcw7BANXqc0sSlP4aQo0Y00adeh0Mcrs58U4X5n1Nf0L15t827DpG2w0OQL4wysi3U94bo6Nws398C4z0 */(
      OutputStream var1, char[] var2, byte[] var3, int var4, boolean var5
   ) {
      super(var1);
      this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF = var2;
      this.26W6GO0G137B125IG3R8P0B3WOjmaB2LzY5F8qBVG1ciqNq6l8YYa2sCado4 = var3;
      this.8KLyy53w4Ng6iuskktls083roY7HCn8KKeEbT202oiP8viKv057xh464WJ8j = var4;
      this.43G9098wc0Y46kwDaG2P7cZdL8pSdAcj8dbF1LHazYb7a4s65y68s21HOBkq = var5;
   }

   @Override
   public void write(int var1) throws IOException {
      byte[] var2 = new byte[]{(byte)(var1 & 0xFF)};
      this.write(var2, 0, 1);
   }

   private void _b7wV155v27b3dOSWhzZEhkh43pbqb0R0khNjnkdX4IX996XRh6O5cvLhjY2/* $VF was: 7b7wV155v27b3dOSWhzZEhkh43pbqb0R0khNjnkdX4IX996XRh6O5cvLhjY2 */() throws IOException {
      if (this.88FpTvZKu9uuV7n2KqVX5AL5shE58O89o341HFATAbg9R18cFjpe6um279KO == this.8KLyy53w4Ng6iuskktls083roY7HCn8KKeEbT202oiP8viKv057xh464WJ8j) {
         this.out.write(this.26W6GO0G137B125IG3R8P0B3WOjmaB2LzY5F8qBVG1ciqNq6l8YYa2sCado4);
         this.88FpTvZKu9uuV7n2KqVX5AL5shE58O89o341HFATAbg9R18cFjpe6um279KO = 0;
      }
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      if (this.30314jm0WlLpG68041VL7p572Sv2nRYzYUzb0fF7Knp17LGNJvNeB7DAAmZn) {
         throw new IOException("Stream is closed");
      }

      if (var2 < 0 || var3 < 0 || var3 > var1.length - var2) {
         throw new ArrayIndexOutOfBoundsException();
      }

      if (var3 != 0) {
         if (this.44n01S0gNVjXXIJTMk3b5M5cl6b0FQg70R2x8VaY50217Z4m95iTACxjT47w != 0) {
            if (this.44n01S0gNVjXXIJTMk3b5M5cl6b0FQg70R2x8VaY50217Z4m95iTACxjT47w == 1) {
               this.1V0uzGaFq9yZ69I41A83ysxl17cvWMeP36uSwnzx78fdnArn2n57iIa73eU9 = var1[var2++] & 255;
               if (--var3 == 0) {
                  this.44n01S0gNVjXXIJTMk3b5M5cl6b0FQg70R2x8VaY50217Z4m95iTACxjT47w++;
                  return;
               }
            }

            this.7A9Hud7kt4FS8hkYlZnGc1sjoWs58EbEIHhHThDZ987b9T27WdX4G8imvM1l = var1[var2++] & 255;
            var3--;
            this._b7wV155v27b3dOSWhzZEhkh43pbqb0R0khNjnkdX4IX996XRh6O5cvLhjY2/* $VF was: 7b7wV155v27b3dOSWhzZEhkh43pbqb0R0khNjnkdX4IX996XRh6O5cvLhjY2 */();
            this.out
               .write(this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[this.0mI4c389hzXt5FbouLq9L392hry9c9Z0dhGAetJqdlq9wiQmiHWCLI4YH5ta >> 2]);
            this.out
               .write(
                  this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[this.0mI4c389hzXt5FbouLq9L392hry9c9Z0dhGAetJqdlq9wiQmiHWCLI4YH5ta << 4 & 63
                     | this.1V0uzGaFq9yZ69I41A83ysxl17cvWMeP36uSwnzx78fdnArn2n57iIa73eU9 >> 4]
               );
            this.out
               .write(
                  this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[this.1V0uzGaFq9yZ69I41A83ysxl17cvWMeP36uSwnzx78fdnArn2n57iIa73eU9 << 2 & 63
                     | this.7A9Hud7kt4FS8hkYlZnGc1sjoWs58EbEIHhHThDZ987b9T27WdX4G8imvM1l >> 6]
               );
            this.out
               .write(this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[this.7A9Hud7kt4FS8hkYlZnGc1sjoWs58EbEIHhHThDZ987b9T27WdX4G8imvM1l & 63]);
            this.88FpTvZKu9uuV7n2KqVX5AL5shE58O89o341HFATAbg9R18cFjpe6um279KO += 4;
         }

         int var4 = var3 / 3;

         for (this.44n01S0gNVjXXIJTMk3b5M5cl6b0FQg70R2x8VaY50217Z4m95iTACxjT47w = var3 - var4 * 3;
            var4-- > 0;
            this.88FpTvZKu9uuV7n2KqVX5AL5shE58O89o341HFATAbg9R18cFjpe6um279KO += 4
         ) {
            this._b7wV155v27b3dOSWhzZEhkh43pbqb0R0khNjnkdX4IX996XRh6O5cvLhjY2/* $VF was: 7b7wV155v27b3dOSWhzZEhkh43pbqb0R0khNjnkdX4IX996XRh6O5cvLhjY2 */();
            int var5 = (var1[var2++] & 255) << 16 | (var1[var2++] & 255) << 8 | var1[var2++] & 255;
            this.out.write(this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[var5 >>> 18 & 63]);
            this.out.write(this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[var5 >>> 12 & 63]);
            this.out.write(this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[var5 >>> 6 & 63]);
            this.out.write(this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[var5 & 63]);
         }

         if (this.44n01S0gNVjXXIJTMk3b5M5cl6b0FQg70R2x8VaY50217Z4m95iTACxjT47w == 1) {
            this.0mI4c389hzXt5FbouLq9L392hry9c9Z0dhGAetJqdlq9wiQmiHWCLI4YH5ta = var1[var2++] & 255;
         } else if (this.44n01S0gNVjXXIJTMk3b5M5cl6b0FQg70R2x8VaY50217Z4m95iTACxjT47w == 2) {
            this.0mI4c389hzXt5FbouLq9L392hry9c9Z0dhGAetJqdlq9wiQmiHWCLI4YH5ta = var1[var2++] & 255;
            this.1V0uzGaFq9yZ69I41A83ysxl17cvWMeP36uSwnzx78fdnArn2n57iIa73eU9 = var1[var2++] & 255;
         }
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.30314jm0WlLpG68041VL7p572Sv2nRYzYUzb0fF7Knp17LGNJvNeB7DAAmZn) {
         this.30314jm0WlLpG68041VL7p572Sv2nRYzYUzb0fF7Knp17LGNJvNeB7DAAmZn = true;
         if (this.44n01S0gNVjXXIJTMk3b5M5cl6b0FQg70R2x8VaY50217Z4m95iTACxjT47w == 1) {
            this._b7wV155v27b3dOSWhzZEhkh43pbqb0R0khNjnkdX4IX996XRh6O5cvLhjY2/* $VF was: 7b7wV155v27b3dOSWhzZEhkh43pbqb0R0khNjnkdX4IX996XRh6O5cvLhjY2 */();
            this.out
               .write(this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[this.0mI4c389hzXt5FbouLq9L392hry9c9Z0dhGAetJqdlq9wiQmiHWCLI4YH5ta >> 2]);
            this.out
               .write(
                  this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[this.0mI4c389hzXt5FbouLq9L392hry9c9Z0dhGAetJqdlq9wiQmiHWCLI4YH5ta << 4 & 63]
               );
            if (this.43G9098wc0Y46kwDaG2P7cZdL8pSdAcj8dbF1LHazYb7a4s65y68s21HOBkq) {
               this.out.write(61);
               this.out.write(61);
            }
         } else if (this.44n01S0gNVjXXIJTMk3b5M5cl6b0FQg70R2x8VaY50217Z4m95iTACxjT47w == 2) {
            this._b7wV155v27b3dOSWhzZEhkh43pbqb0R0khNjnkdX4IX996XRh6O5cvLhjY2/* $VF was: 7b7wV155v27b3dOSWhzZEhkh43pbqb0R0khNjnkdX4IX996XRh6O5cvLhjY2 */();
            this.out
               .write(this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[this.0mI4c389hzXt5FbouLq9L392hry9c9Z0dhGAetJqdlq9wiQmiHWCLI4YH5ta >> 2]);
            this.out
               .write(
                  this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[this.0mI4c389hzXt5FbouLq9L392hry9c9Z0dhGAetJqdlq9wiQmiHWCLI4YH5ta << 4 & 63
                     | this.1V0uzGaFq9yZ69I41A83ysxl17cvWMeP36uSwnzx78fdnArn2n57iIa73eU9 >> 4]
               );
            this.out
               .write(
                  this.3Ho56l15uKA6305KE8G2p3hEtztFT0dsedW7n6w0GEd00uxxqYdQ17jU8qJF[this.1V0uzGaFq9yZ69I41A83ysxl17cvWMeP36uSwnzx78fdnArn2n57iIa73eU9 << 2 & 63]
               );
            if (this.43G9098wc0Y46kwDaG2P7cZdL8pSdAcj8dbF1LHazYb7a4s65y68s21HOBkq) {
               this.out.write(61);
            }
         }

         this.44n01S0gNVjXXIJTMk3b5M5cl6b0FQg70R2x8VaY50217Z4m95iTACxjT47w = 0;
         this.out.close();
      }
   }
}
