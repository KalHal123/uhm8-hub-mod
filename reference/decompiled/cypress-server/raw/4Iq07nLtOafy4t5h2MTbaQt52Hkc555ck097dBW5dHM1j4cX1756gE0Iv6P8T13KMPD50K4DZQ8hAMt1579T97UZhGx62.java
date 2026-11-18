import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class 4Iq07nLtOafy4t5h2MTbaQt52Hkc555ck097dBW5dHM1j4cX1756gE0Iv6P8T13KMPD50K4DZQ8hAMt1579T97UZhGx62
   extends 86oeVnBp6WyqARM9w72c69cM97Wfk4m7q7n0UrM5g5ZXU1NG84KriFEQl0n9ww4S2b467xGgKL5AW1GEv1Mt4ciN58bf8e6 {
   public int 4D2ai8jgrB151ybZy8cC3e49ZgU5AtHK0VEl7f9sRfY6XgbE57594qbSPAH5;
   public int 2UwM0Nv01ciD22c3u18R7hIn28Yf1OMD91VaAy6J2S1es5mbg727ym2d2l6i;
   public boolean 5294z22ipDb0Ne67Z1VQO6E15Mi8DiFRALt20F8JGH2DMjog0S7D7938MHEQ;
   public float[] 2mu2J7E78nyV7KCXNC638nxz12I677Z4O1MuW41cJR1gn4S36yI40Nj78u6p;

   public _Iq07nLtOafy4t5h2MTbaQt52Hkc555ck097dBW5dHM1j4cX1756gE0Iv6P8T13KMPD50K4DZQ8hAMt1579T97UZhGx62/* $VF was: 4Iq07nLtOafy4t5h2MTbaQt52Hkc555ck097dBW5dHM1j4cX1756gE0Iv6P8T13KMPD50K4DZQ8hAMt1579T97UZhGx62 */() {
   }

   public _Iq07nLtOafy4t5h2MTbaQt52Hkc555ck097dBW5dHM1j4cX1756gE0Iv6P8T13KMPD50K4DZQ8hAMt1579T97UZhGx62/* $VF was: 4Iq07nLtOafy4t5h2MTbaQt52Hkc555ck097dBW5dHM1j4cX1756gE0Iv6P8T13KMPD50K4DZQ8hAMt1579T97UZhGx62 */(
      int var1, int var2, float[] var3
   ) {
      this.4D2ai8jgrB151ybZy8cC3e49ZgU5AtHK0VEl7f9sRfY6XgbE57594qbSPAH5 = var1;
      this.2UwM0Nv01ciD22c3u18R7hIn28Yf1OMD91VaAy6J2S1es5mbg727ym2d2l6i = var2;
      this.2mu2J7E78nyV7KCXNC638nxz12I677Z4O1MuW41cJR1gn4S36yI40Nj78u6p = var3;
      this.5294z22ipDb0Ne67Z1VQO6E15Mi8DiFRALt20F8JGH2DMjog0S7D7938MHEQ = var3.length != 0;
   }

   @Override
   public void _qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(
      DataInputStream var1
   ) throws IOException {
      this.4D2ai8jgrB151ybZy8cC3e49ZgU5AtHK0VEl7f9sRfY6XgbE57594qbSPAH5 = var1.readInt();
      this.2UwM0Nv01ciD22c3u18R7hIn28Yf1OMD91VaAy6J2S1es5mbg727ym2d2l6i = var1.readInt();
      this.5294z22ipDb0Ne67Z1VQO6E15Mi8DiFRALt20F8JGH2DMjog0S7D7938MHEQ = var1.read() != 0;
      if (this.5294z22ipDb0Ne67Z1VQO6E15Mi8DiFRALt20F8JGH2DMjog0S7D7938MHEQ) {
         float var2 = var1.readFloat();
         float var3 = var1.readFloat();
         float var4 = var3 - var2;
         byte[] var5 = new byte[1536];
         var1.readFully(var5);
         this.2mu2J7E78nyV7KCXNC638nxz12I677Z4O1MuW41cJR1gn4S36yI40Nj78u6p = new float[1536];

         for (int var6 = 0; var6 < var5.length; var6++) {
            this.2mu2J7E78nyV7KCXNC638nxz12I677Z4O1MuW41cJR1gn4S36yI40Nj78u6p[var6] = var2 + (var5[var6] & 0xFF) / 255.0F * var4;
         }
      }
   }

   @Override
   public void _1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(
      DataOutputStream var1
   ) throws IOException {
      var1.writeInt(this.4D2ai8jgrB151ybZy8cC3e49ZgU5AtHK0VEl7f9sRfY6XgbE57594qbSPAH5);
      var1.writeInt(this.2UwM0Nv01ciD22c3u18R7hIn28Yf1OMD91VaAy6J2S1es5mbg727ym2d2l6i);
      var1.write(this.5294z22ipDb0Ne67Z1VQO6E15Mi8DiFRALt20F8JGH2DMjog0S7D7938MHEQ ? 1 : 0);
      if (this.5294z22ipDb0Ne67Z1VQO6E15Mi8DiFRALt20F8JGH2DMjog0S7D7938MHEQ) {
         float var2 = Float.MAX_VALUE;
         float var3 = Float.MIN_NORMAL;

         for (float var7 : this.2mu2J7E78nyV7KCXNC638nxz12I677Z4O1MuW41cJR1gn4S36yI40Nj78u6p) {
            if (var2 > var7) {
               var2 = var7;
            }

            if (var3 < var7) {
               var3 = var7;
            }
         }

         float var8 = var3 - var2;
         byte[] var9 = new byte[1536];

         for (int var10 = 0; var10 < var9.length; var10++) {
            var9[var10] = (byte)((this.2mu2J7E78nyV7KCXNC638nxz12I677Z4O1MuW41cJR1gn4S36yI40Nj78u6p[var10] + var2) / var8 * 255.0F);
         }

         var1.writeFloat(var2);
         var1.writeFloat(var3);
         var1.write(var9);
      }
   }

   @Override
   public void _qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6/* $VF was: 9qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6 */(
      4f7YdhJ8n7rO63Sz67QZxH5g3odajzMYv1VT2Fv3US5G3r6K01BM8O0Q02y8DcgFbO4Xt2cD613RWaBHJo6Sz4rGz0j4R6 var1
   ) {
      var1._Q1icfR95k5Z0g8eQGETt37pK8P81GI095gDLZ31Cn71462CEaUP96QStfwT/* $VF was: 5Q1icfR95k5Z0g8eQGETt37pK8P81GI095gDLZ31Cn71462CEaUP96QStfwT */(this);
   }

   @Override
   public int _30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */() {
      return 9;
   }
}
