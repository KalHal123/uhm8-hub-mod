import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class 87k6gZdUF64lRd2414n3C9YY0RqdbbURZjg76Q3wg8n1vyhOeSdCGqtgKyQUo9TtGm8AxXBADPj6456Y0svQ4I3QmXX6S4J0 {
   private int[] 8x14g69mRutr1NHYXrprur89pnZS0A7d27ny9oSIGXe4NG9ut5I3u9Y6W4O4 = new int[256];
   public int 2M1ksx6FHZ0it4TrOPvHM2GzwEH0FYSJ3Nc35ZW515Tv2l561ZCNlgo5iUc0 = 0;
   private int 9oQT7w2ro0U81RT25S4yr00KjqlY0AT278H36W7v3AGIhyE7G2v0wIh26pdA;
   private IntBuffer 7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36 = 6L0q9fOrT3gF3u9BA7jz880F0hAJeJojaOFZ2y4Q31W9X7S69DROtyz6GWD1c52miu9YzUO1G91Iny44J8D6t8qjkA5482F8._R0cvYjOOKvGsD06D0rUI7v5l8UW5g50A7vNmbfAYuiFodFv87BlfGv90Uh2/* $VF was: 1R0cvYjOOKvGsD06D0rUI7v5l8UW5g50A7vNmbfAYuiFodFv87BlfGv90Uh2 */(
      1024
   );

   public _7k6gZdUF64lRd2414n3C9YY0RqdbbURZjg76Q3wg8n1vyhOeSdCGqtgKyQUo9TtGm8AxXBADPj6456Y0svQ4I3QmXX6S4J0/* $VF was: 87k6gZdUF64lRd2414n3C9YY0RqdbbURZjg76Q3wg8n1vyhOeSdCGqtgKyQUo9TtGm8AxXBADPj6456Y0svQ4I3QmXX6S4J0 */(
      90P07uZ93FV38QPsG5GgcjVd0O5zVftJ2njw12bRpuE6u921Q5J0x70PHNIU5J3nfuDgzdQUop5j2cxeO57fI2BKfG7S var1,
      String var2,
      5Lml2WQU47jeFJG239AnmSQZG8A856GHcgfCWv3MQ32Se6j5ertND69E03Xxrcpd3AQ5kTI4Rh5cBQl7Opa23XEF064r9u var3
   ) {
      BufferedImage var4;
      try {
         var4 = ImageIO.read(
            var3.8nB09v2wL31LD7473aXNMbJrX47AX71iPMP6yPX544heeDvxj78y5qTJYk68
               .1k4uc1i9aprs9834A7rEVW0D2zfl3BI2g00e7D4rgDYDih8Qu9WukuM46qw0
               ._5L3yK6n9jMB61q7Q57v3QnT9AbuQoT2q7ZWl0ne7W843s9HPtt8y52AD4o0/* $VF was: 35L3yK6n9jMB61q7Q57v3QnT9AbuQoT2q7ZWl0ne7W843s9HPtt8y52AD4o0 */(var2)
         );
      } catch (IOException var18) {
         throw new RuntimeException(var18);
      }

      int var5 = var4.getWidth();
      int var6 = var4.getHeight();
      int[] var7 = new int[var5 * var6];
      var4.getRGB(0, 0, var5, var6, var7, 0, var5);

      for (int var14 = 0; var14 < 256; var14++) {
         int var8 = var14 % 16;
         int var9 = var14 / 16;

         int var10;
         for (var10 = 7; var10 >= 0; var10--) {
            int var11 = var8 * 8 + var10;
            boolean var15 = true;

            for (int var16 = 0; var16 < 8 && var15; var16++) {
               int var12 = (var9 * 8 + var16) * var5;
               int var13 = var7[var11 + var12] & 0xFF;
               if (var13 > 0) {
                  var15 = false;
               }
            }

            if (!var15) {
               break;
            }
         }

         if (var14 == 32) {
            var10 = 2;
         }

         this.8x14g69mRutr1NHYXrprur89pnZS0A7d27ny9oSIGXe4NG9ut5I3u9Y6W4O4[var14] = var10 + 2;
      }

      this.2M1ksx6FHZ0it4TrOPvHM2GzwEH0FYSJ3Nc35ZW515Tv2l561ZCNlgo5iUc0 = var3._BSFEHd336lH8JfA2w35JiGWqukE049E001767W1o8r4eUhCdf1SuM948qw6/* $VF was: 1BSFEHd336lH8JfA2w35JiGWqukE049E001767W1o8r4eUhCdf1SuM948qw6 */(
         var4
      );
      this.9oQT7w2ro0U81RT25S4yr00KjqlY0AT278H36W7v3AGIhyE7G2v0wIh26pdA = 6L0q9fOrT3gF3u9BA7jz880F0hAJeJojaOFZ2y4Q31W9X7S69DROtyz6GWD1c52miu9YzUO1G91Iny44J8D6t8qjkA5482F8._38K2t9YH4nAdJ6uDNr4xjMccU3H5E3JlRhhv9Vj028i2gtCBW9T2h1ZHTH4/* $VF was: 138K2t9YH4nAdJ6uDNr4xjMccU3H5E3JlRhhv9Vj028i2gtCBW9T2h1ZHTH4 */(
         288
      );
      4Rwayi21P7U4FG30AO4ZjY1nn17NSFEhgFcp7MRAcX7sJ1ju98vl7h7Z7GxSWAHWajFDqC3o1ymdUca5zNBIGlaAnE0wUT var28 = 4Rwayi21P7U4FG30AO4ZjY1nn17NSFEhgFcp7MRAcX7sJ1ju98vl7h7Z7GxSWAHWajFDqC3o1ymdUca5zNBIGlaAnE0wUT.8PZK90pwbY0Ix8mw49n397dpnEeWy4IV27LT8PITn9P4MFQYVE345V9X89Qk;

      for (int var19 = 0; var19 < 256; var19++) {
         GL11.glNewList(this.9oQT7w2ro0U81RT25S4yr00KjqlY0AT278H36W7v3AGIhyE7G2v0wIh26pdA + var19, 4864);
         var28._ayZ4y0DKzlBw0qR3TwrtIK08f0p5iZQu8xsah0R4i2XaEr9LQwCue6wKB06/* $VF was: 6ayZ4y0DKzlBw0qR3TwrtIK08f0p5iZQu8xsah0R4i2XaEr9LQwCue6wKB06 */(true);
         int var21 = var19 % 16 * 8;
         int var23 = var19 / 16 * 8;
         float var29 = 7.99F;
         float var31 = 0.0F;
         float var17 = 0.0F;
         var28._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
            0.0, 0.0F + var29, 0.0, var21 / 128.0F + var31, (var23 + var29) / 128.0F + var17
         );
         var28._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
            0.0F + var29, 0.0F + var29, 0.0, (var21 + var29) / 128.0F + var31, (var23 + var29) / 128.0F + var17
         );
         var28._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
            0.0F + var29, 0.0, 0.0, (var21 + var29) / 128.0F + var31, var23 / 128.0F + var17
         );
         var28._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
            0.0, 0.0, 0.0, var21 / 128.0F + var31, var23 / 128.0F + var17
         );
         var28._17DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2/* $VF was: 217DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2 */();
         GL11.glTranslatef(this.8x14g69mRutr1NHYXrprur89pnZS0A7d27ny9oSIGXe4NG9ut5I3u9Y6W4O4[var19], 0.0F, 0.0F);
         GL11.glEndList();
      }

      for (int var20 = 0; var20 < 32; var20++) {
         int var22 = (var20 >> 3 & 1) * 85;
         int var24 = (var20 >> 2 & 1) * 170 + var22;
         int var25 = (var20 >> 1 & 1) * 170 + var22;
         int var30 = (var20 >> 0 & 1) * 170 + var22;
         if (var20 == 6) {
            var24 += 85;
         }

         boolean var32 = var20 >= 16;
         if (var1.10iD31fC4Dyj31q37QyatM61p3w770PmS1ab3DF69GDMkU6z9rOWos13CZo8) {
            int var26 = (var24 * 30 + var25 * 59 + var30 * 11) / 100;
            int var27 = (var24 * 30 + var25 * 70) / 100;
            int var33 = (var24 * 30 + var30 * 70) / 100;
            var24 = var26;
            var25 = var27;
            var30 = var33;
         }

         if (var32) {
            var24 /= 4;
            var25 /= 4;
            var30 /= 4;
         }

         GL11.glNewList(this.9oQT7w2ro0U81RT25S4yr00KjqlY0AT278H36W7v3AGIhyE7G2v0wIh26pdA + 256 + var20, 4864);
         GL11.glColor3f(var24 / 255.0F, var25 / 255.0F, var30 / 255.0F);
         GL11.glEndList();
      }
   }

   public void _O80YtY13ocjL32iQirNQ7EqMUSsWbw50vG6T0eNj0T6K7665q49ol6j3MF1/* $VF was: 7O80YtY13ocjL32iQirNQ7EqMUSsWbw50vG6T0eNj0T6K7665q49ol6j3MF1 */(
      String var1, int var2, int var3, int var4
   ) {
      this._b55Qn9Zh0WFfTw1Tz391F1c3JHILqk770cGEC2z7FzPRjBu4G70P37ERQNt/* $VF was: 7b55Qn9Zh0WFfTw1Tz391F1c3JHILqk770cGEC2z7FzPRjBu4G70P37ERQNt */(
         var1, var2 + 1, var3 + 1, var4, true
      );
      this._WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30/* $VF was: 9WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30 */(
         var1, var2, var3, var4
      );
   }

   public void _WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30/* $VF was: 9WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30 */(
      String var1, int var2, int var3, int var4
   ) {
      this._b55Qn9Zh0WFfTw1Tz391F1c3JHILqk770cGEC2z7FzPRjBu4G70P37ERQNt/* $VF was: 7b55Qn9Zh0WFfTw1Tz391F1c3JHILqk770cGEC2z7FzPRjBu4G70P37ERQNt */(
         var1, var2, var3, var4, false
      );
   }

   public void _b55Qn9Zh0WFfTw1Tz391F1c3JHILqk770cGEC2z7FzPRjBu4G70P37ERQNt/* $VF was: 7b55Qn9Zh0WFfTw1Tz391F1c3JHILqk770cGEC2z7FzPRjBu4G70P37ERQNt */(
      String var1, int var2, int var3, int var4, boolean var5
   ) {
      if (var1 != null) {
         if (var5) {
            int var6 = var4 & 0xFF000000;
            var4 = (var4 & 16579836) >> 2;
            var4 += var6;
            int var14;
            int var15;
            var4 = var6 != 255 && var6 != 0 ? (var14 = var4 | var6 / 2 << 24) : (var15 = var4 | 0xFF000000);
         }

         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glBindTexture(3553, this.2M1ksx6FHZ0it4TrOPvHM2GzwEH0FYSJ3Nc35ZW515Tv2l561ZCNlgo5iUc0);
         float var7 = (var4 >> 16 & 0xFF) / 255.0F;
         float var8 = (var4 >> 8 & 0xFF) / 255.0F;
         float var9 = (var4 & 0xFF) / 255.0F;
         float var10 = (var4 >> 24 & 0xFF) / 255.0F;
         if (var10 == 0.0F) {
            var10 = 1.0F;
         }

         GL11.glColor4f(var7, var8, var9, var10);
         ((Buffer)this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36).clear();
         GL11.glPushMatrix();
         GL11.glTranslatef(var2, var3, 0.0F);

         for (int var16 = 0; var16 < var1.length(); var16++) {
            for (; var1.charAt(var16) == 167 && var1.length() > var16 + 1; var16 += 2) {
               int var11 = "0123456789abcdef".indexOf(var1.toLowerCase().charAt(var16 + 1));
               if (var11 < 0 || var11 > 15) {
                  var11 = 15;
               }

               this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36
                  .put(this.9oQT7w2ro0U81RT25S4yr00KjqlY0AT278H36W7v3AGIhyE7G2v0wIh26pdA + 256 + var11 + (var5 ? 16 : 0));
               if (this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36.remaining() == 0) {
                  ((Buffer)this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36).flip();
                  GL11.glCallLists(this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36);
                  ((Buffer)this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36).clear();
               }
            }

            int var17 = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»"
               .indexOf(var1.charAt(var16));
            if (var17 >= 0) {
               this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36
                  .put(this.9oQT7w2ro0U81RT25S4yr00KjqlY0AT278H36W7v3AGIhyE7G2v0wIh26pdA + var17 + 32);
            }

            if (this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36.remaining() == 0) {
               ((Buffer)this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36).flip();
               GL11.glCallLists(this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36);
               ((Buffer)this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36).clear();
            }
         }

         ((Buffer)this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36).flip();
         GL11.glCallLists(this.7qLFntpvL5T2w5wzCnIPL048cblJcmO3KiPZFp1PloM8v0t63bz0BuSVyg36);
         GL11.glPopMatrix();
      }
   }

   public int _13yBz0z1e0Xp8J9hG9YLezT8TFgNrrND64rO10vxk37SjfO36iSUM8NmZ6j/* $VF was: 513yBz0z1e0Xp8J9hG9YLezT8TFgNrrND64rO10vxk37SjfO36iSUM8NmZ6j */(
      String var1
   ) {
      if (var1 == null) {
         return 0;
      }

      int var2 = 0;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         if (var1.charAt(var3) == 167) {
            var3++;
         } else {
            int var4 = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»"
               .indexOf(var1.charAt(var3));
            if (var4 >= 0) {
               var2 += this.8x14g69mRutr1NHYXrprur89pnZS0A7d27ny9oSIGXe4NG9ut5I3u9Y6W4O4[var4 + 32];
            }
         }
      }

      return var2;
   }
}
