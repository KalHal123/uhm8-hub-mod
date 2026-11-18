import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;

public class 4fQGin3E1d86Jm019f5346JNqNCdsC8e224cnh7r0Oc34l8jt0REH9f2U4T3mg470ZL2y0UoaBRz7GL8W3qPaDa997i9Tx3
   implements 1yvTo5vLKhtZ8Jdf75TPzqWv5K5FAzIHa4r19RT64mMh13Pj2aH0VKS6mi433493GrZdkE65w9B85LU6qAlbS6G55i1q0 {
   private int[] 1z1726QbD70LiLK1OIH7x9oP1qU24AjdP6E51I5f5C5UmJsSVL29s1bF4AMC;
   private int 4mXW209UmCEdG11lBA7U9tVj2T1801YznuMQO695N5s0nGEIo3nT6gU6o3Em;
   private int 6s099fR0u84owa9DVzd9bsqCk0QJWFgdvjsClOpop5U42df4pZcAj9J7b8g6;

   @Override
   public BufferedImage _zpderewV3x1X6sDa6TS2B2RfCzwfHSc6W7OdKR4j9EtS2r2WS940VAdQvh0/* $VF was: 5zpderewV3x1X6sDa6TS2B2RfCzwfHSc6W7OdKR4j9EtS2r2WS940VAdQvh0 */(
      BufferedImage var1
   ) {
      if (var1 == null) {
         return null;
      }

      this.4mXW209UmCEdG11lBA7U9tVj2T1801YznuMQO695N5s0nGEIo3nT6gU6o3Em = 64;
      this.6s099fR0u84owa9DVzd9bsqCk0QJWFgdvjsClOpop5U42df4pZcAj9J7b8g6 = 32;
      BufferedImage var2 = new BufferedImage(
         this.4mXW209UmCEdG11lBA7U9tVj2T1801YznuMQO695N5s0nGEIo3nT6gU6o3Em, this.6s099fR0u84owa9DVzd9bsqCk0QJWFgdvjsClOpop5U42df4pZcAj9J7b8g6, 2
      );
      Graphics var3 = var2.getGraphics();
      var3.drawImage(var1, 0, 0, (ImageObserver)null);
      var3.dispose();
      this.1z1726QbD70LiLK1OIH7x9oP1qU24AjdP6E51I5f5C5UmJsSVL29s1bF4AMC = ((DataBufferInt)var2.getRaster().getDataBuffer()).getData();
      this._brUM7ZGaH4Qs68Ja6VesV1QPXN2xTgOF6p4bmJhImWBrQ3100Ji23yt02XE/* $VF was: 6brUM7ZGaH4Qs68Ja6VesV1QPXN2xTgOF6p4bmJhImWBrQ3100Ji23yt02XE */(0, 0, 32, 16);
      this._gBkAywIp0El9t9dnOlBlY1gBu97V157LGBayloBYHo7IIiqw7W98AmqRgn2/* $VF was: 7gBkAywIp0El9t9dnOlBlY1gBu97V157LGBayloBYHo7IIiqw7W98AmqRgn2 */(
         32, 0, 64, 32
      );
      this._brUM7ZGaH4Qs68Ja6VesV1QPXN2xTgOF6p4bmJhImWBrQ3100Ji23yt02XE/* $VF was: 6brUM7ZGaH4Qs68Ja6VesV1QPXN2xTgOF6p4bmJhImWBrQ3100Ji23yt02XE */(
         0, 16, 64, 32
      );
      boolean var4 = false;

      for (int var5 = 32; var5 < 64; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            int var7 = this.1z1726QbD70LiLK1OIH7x9oP1qU24AjdP6E51I5f5C5UmJsSVL29s1bF4AMC[var5 + var6 * 64];
            if ((var7 >> 24 & 0xFF) < 128) {
               var4 = true;
            }
         }
      }

      if (!var4) {
         for (int var9 = 32; var9 < 64; var9++) {
            for (int var10 = 0; var10 < 16; var10++) {
               int var11 = this.1z1726QbD70LiLK1OIH7x9oP1qU24AjdP6E51I5f5C5UmJsSVL29s1bF4AMC[var9 + var10 * 64];
               if ((var11 >> 24 & 0xFF) < 128) {
                  var4 = true;
               }
            }
         }
      }

      return var2;
   }

   private void _gBkAywIp0El9t9dnOlBlY1gBu97V157LGBayloBYHo7IIiqw7W98AmqRgn2/* $VF was: 7gBkAywIp0El9t9dnOlBlY1gBu97V157LGBayloBYHo7IIiqw7W98AmqRgn2 */(
      int var1, int var2, int var3, int var4
   ) {
      if (!this._uVU9MQ2rUx05H31Jood8lWqAVd0A9rUtJJ7rCUTYAZ0mh556WRAd2fKgyu7/* $VF was: 5uVU9MQ2rUx05H31Jood8lWqAVd0A9rUtJJ7rCUTYAZ0mh556WRAd2fKgyu7 */(
         var1, var2, var3, var4
      )) {
         for (int var5 = var1; var5 < var3; var5++) {
            for (int var6 = var2; var6 < var4; var6++) {
               this.1z1726QbD70LiLK1OIH7x9oP1qU24AjdP6E51I5f5C5UmJsSVL29s1bF4AMC[var5
                  + var6 * this.4mXW209UmCEdG11lBA7U9tVj2T1801YznuMQO695N5s0nGEIo3nT6gU6o3Em] = this.1z1726QbD70LiLK1OIH7x9oP1qU24AjdP6E51I5f5C5UmJsSVL29s1bF4AMC[var5
                     + var6 * this.4mXW209UmCEdG11lBA7U9tVj2T1801YznuMQO695N5s0nGEIo3nT6gU6o3Em]
                  & 16777215;
            }
         }
      }
   }

   private void _brUM7ZGaH4Qs68Ja6VesV1QPXN2xTgOF6p4bmJhImWBrQ3100Ji23yt02XE/* $VF was: 6brUM7ZGaH4Qs68Ja6VesV1QPXN2xTgOF6p4bmJhImWBrQ3100Ji23yt02XE */(
      int var1, int var2, int var3, int var4
   ) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            this.1z1726QbD70LiLK1OIH7x9oP1qU24AjdP6E51I5f5C5UmJsSVL29s1bF4AMC[var5 + var6 * this.4mXW209UmCEdG11lBA7U9tVj2T1801YznuMQO695N5s0nGEIo3nT6gU6o3Em] = this.1z1726QbD70LiLK1OIH7x9oP1qU24AjdP6E51I5f5C5UmJsSVL29s1bF4AMC[var5
                  + var6 * this.4mXW209UmCEdG11lBA7U9tVj2T1801YznuMQO695N5s0nGEIo3nT6gU6o3Em]
               | 0xFF000000;
         }
      }
   }

   private boolean _uVU9MQ2rUx05H31Jood8lWqAVd0A9rUtJJ7rCUTYAZ0mh556WRAd2fKgyu7/* $VF was: 5uVU9MQ2rUx05H31Jood8lWqAVd0A9rUtJJ7rCUTYAZ0mh556WRAd2fKgyu7 */(
      int var1, int var2, int var3, int var4
   ) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            int var7 = this.1z1726QbD70LiLK1OIH7x9oP1qU24AjdP6E51I5f5C5UmJsSVL29s1bF4AMC[var5
               + var6 * this.4mXW209UmCEdG11lBA7U9tVj2T1801YznuMQO695N5s0nGEIo3nT6gU6o3Em];
            if ((var7 >> 24 & 0xFF) < 128) {
               return true;
            }
         }
      }

      return false;
   }
}
