package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

public class Class0380 extends Class0321 {
   public String 6jhSZL8TQNL0rQdF2r0V7us4diVV21ruvkbc4bjMH51gf3NzX7n623rzKzG5;
   public int 7N1X3946l7dS7n014434AcJZRXLuOpU7sdp23K1pkunJ3A840faB0Q3u1ghG;
   private byte[] 14yCeki0t3Y18H58Zgg8J13g7CM32pvXCzKhQI5zKuHxlITr884R6oOf3622;

   public Class0380() {
   }

   public Class0380(String var1, int var2) {
      this.6jhSZL8TQNL0rQdF2r0V7us4diVV21ruvkbc4bjMH51gf3NzX7n623rzKzG5 = var1;
      this.7N1X3946l7dS7n014434AcJZRXLuOpU7sdp23K1pkunJ3A840faB0Q3u1ghG = var2;
      this.14yCeki0t3Y18H58Zgg8J13g7CM32pvXCzKhQI5zKuHxlITr884R6oOf3622 = Class0116.9r4z2maBPOzeIQ41jM97J0sS7rNpO25b195UXkI1F7UjreZ3kMZ31B30P17t
         ._v4pMf3596FO71g04LS5DR738V0b0e9j59y5wCjSLyqx9Uxd231116vUL4le/* $VF was: 4v4pMf3596FO71g04LS5DR738V0b0e9j59y5wCjSLyqx9Uxd231116vUL4le */(
            this.6jhSZL8TQNL0rQdF2r0V7us4diVV21ruvkbc4bjMH51gf3NzX7n623rzKzG5
         );
   }

   @Override
   public void _qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(
      DataInputStream var1
   ) throws IOException {
   }

   @Override
   public void _1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(
      DataOutputStream var1
   ) throws IOException {
      if (this.14yCeki0t3Y18H58Zgg8J13g7CM32pvXCzKhQI5zKuHxlITr884R6oOf3622 == null) {
         var1.writeInt(-1);
      } else {
         byte[] var2 = new byte[1024];
         int var3 = this.7N1X3946l7dS7n014434AcJZRXLuOpU7sdp23K1pkunJ3A840faB0Q3u1ghG * 1024;
         int var4 = 1024;
         if (var3 + 1024 > this.14yCeki0t3Y18H58Zgg8J13g7CM32pvXCzKhQI5zKuHxlITr884R6oOf3622.length) {
            var4 = this.14yCeki0t3Y18H58Zgg8J13g7CM32pvXCzKhQI5zKuHxlITr884R6oOf3622.length - var3;
         }

         System.arraycopy(
            this.14yCeki0t3Y18H58Zgg8J13g7CM32pvXCzKhQI5zKuHxlITr884R6oOf3622,
            this.7N1X3946l7dS7n014434AcJZRXLuOpU7sdp23K1pkunJ3A840faB0Q3u1ghG * 1024,
            var2,
            0,
            var4
         );
         CRC32 var5 = new CRC32();
         var5.update(var2, 0, 1024);
         var1.writeInt(this.14yCeki0t3Y18H58Zgg8J13g7CM32pvXCzKhQI5zKuHxlITr884R6oOf3622.length);
         var1.writeUTF(this.6jhSZL8TQNL0rQdF2r0V7us4diVV21ruvkbc4bjMH51gf3NzX7n623rzKzG5);
         var1.writeInt(this.7N1X3946l7dS7n014434AcJZRXLuOpU7sdp23K1pkunJ3A840faB0Q3u1ghG);
         var1.writeInt((int)var5.getValue());
         var1.write(var2);
      }
   }

   @Override
   public void _qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6/* $VF was: 9qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6 */(
      Class0193 var1
   ) {
   }

   @Override
   public int _30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */() {
      return this.14yCeki0t3Y18H58Zgg8J13g7CM32pvXCzKhQI5zKuHxlITr884R6oOf3622 == null
         ? 4
         : 8
            + this.6jhSZL8TQNL0rQdF2r0V7us4diVV21ruvkbc4bjMH51gf3NzX7n623rzKzG5.length()
            + this.14yCeki0t3Y18H58Zgg8J13g7CM32pvXCzKhQI5zKuHxlITr884R6oOf3622.length;
   }
}
