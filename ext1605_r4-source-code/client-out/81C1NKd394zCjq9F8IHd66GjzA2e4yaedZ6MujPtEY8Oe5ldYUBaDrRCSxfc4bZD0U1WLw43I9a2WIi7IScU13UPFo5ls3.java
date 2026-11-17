import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class 81C1NKd394zCjq9F8IHd66GjzA2e4yaedZ6MujPtEY8Oe5ldYUBaDrRCSxfc4bZD0U1WLw43I9a2WIi7IScU13UPFo5ls3
   extends 5tL0rndgg81QbNd36sHc507Ysx4d5UxNJ85xNpWCG1S6wiQC0yXJ0680h00S2Fn5rPDCq6BbHpgoM2bl4m9ZHK8H52ifAj0gneK {
   public int 3GR05cV7838EpPBwOr05q91zWKtk76MjNbGl35BZgqJyBrxYUx0afnm3ce7q;
   public int 87WQg829DeUcX5ETUrzJJ00O261o48ZIjkb14ohi0dPRMUt91dVPH4IqOcB2;
   public boolean 81umLi1LYz97l07Y1drGy5Txal1mnKttzz4aB5b98Y11Q3A95uCn2h60kIYq;
   public float[] 9F000reVs09qJC6RM1CDXbwpWot2ap8bQLJ224QEy3l8Sj0Ca7AELxBGg6v9;

   public _1C1NKd394zCjq9F8IHd66GjzA2e4yaedZ6MujPtEY8Oe5ldYUBaDrRCSxfc4bZD0U1WLw43I9a2WIi7IScU13UPFo5ls3/* $VF was: 81C1NKd394zCjq9F8IHd66GjzA2e4yaedZ6MujPtEY8Oe5ldYUBaDrRCSxfc4bZD0U1WLw43I9a2WIi7IScU13UPFo5ls3 */() {
   }

   public _1C1NKd394zCjq9F8IHd66GjzA2e4yaedZ6MujPtEY8Oe5ldYUBaDrRCSxfc4bZD0U1WLw43I9a2WIi7IScU13UPFo5ls3/* $VF was: 81C1NKd394zCjq9F8IHd66GjzA2e4yaedZ6MujPtEY8Oe5ldYUBaDrRCSxfc4bZD0U1WLw43I9a2WIi7IScU13UPFo5ls3 */(
      int var1, int var2, float[] var3
   ) {
      this.3GR05cV7838EpPBwOr05q91zWKtk76MjNbGl35BZgqJyBrxYUx0afnm3ce7q = var1;
      this.87WQg829DeUcX5ETUrzJJ00O261o48ZIjkb14ohi0dPRMUt91dVPH4IqOcB2 = var2;
      this.9F000reVs09qJC6RM1CDXbwpWot2ap8bQLJ224QEy3l8Sj0Ca7AELxBGg6v9 = var3;
      this.81umLi1LYz97l07Y1drGy5Txal1mnKttzz4aB5b98Y11Q3A95uCn2h60kIYq = var3.length != 0;
   }

   @Override
   public void _t2R3RVJsoYj9B2a380xVYlo7WZFUfuAfb6wnneCWDNK5rEczcPme6sK1blM/* $VF was: 5t2R3RVJsoYj9B2a380xVYlo7WZFUfuAfb6wnneCWDNK5rEczcPme6sK1blM */(
      DataInputStream var1
   ) throws IOException {
      this.3GR05cV7838EpPBwOr05q91zWKtk76MjNbGl35BZgqJyBrxYUx0afnm3ce7q = var1.readInt();
      this.87WQg829DeUcX5ETUrzJJ00O261o48ZIjkb14ohi0dPRMUt91dVPH4IqOcB2 = var1.readInt();
      this.81umLi1LYz97l07Y1drGy5Txal1mnKttzz4aB5b98Y11Q3A95uCn2h60kIYq = var1.read() != 0;
      if (this.81umLi1LYz97l07Y1drGy5Txal1mnKttzz4aB5b98Y11Q3A95uCn2h60kIYq) {
         float var2 = var1.readFloat();
         float var3 = var1.readFloat();
         float var4 = var3 - var2;
         byte[] var5 = new byte[1536];
         var1.readFully(var5);
         this.9F000reVs09qJC6RM1CDXbwpWot2ap8bQLJ224QEy3l8Sj0Ca7AELxBGg6v9 = new float[1536];

         for (int var6 = 0; var6 < var5.length; var6++) {
            this.9F000reVs09qJC6RM1CDXbwpWot2ap8bQLJ224QEy3l8Sj0Ca7AELxBGg6v9[var6] = var2 + (var5[var6] & 0xFF) / 255.0F * var4;
         }
      }
   }

   @Override
   public void _5i5X5zy1OVOY1fU3430Vh8d48Hp64UcyqPb124NCs5R3O5T7jovN4MYko9g/* $VF was: 45i5X5zy1OVOY1fU3430Vh8d48Hp64UcyqPb124NCs5R3O5T7jovN4MYko9g */(
      DataOutputStream var1
   ) throws IOException {
      var1.writeInt(this.3GR05cV7838EpPBwOr05q91zWKtk76MjNbGl35BZgqJyBrxYUx0afnm3ce7q);
      var1.writeInt(this.87WQg829DeUcX5ETUrzJJ00O261o48ZIjkb14ohi0dPRMUt91dVPH4IqOcB2);
      var1.write(this.81umLi1LYz97l07Y1drGy5Txal1mnKttzz4aB5b98Y11Q3A95uCn2h60kIYq ? 1 : 0);
      if (this.81umLi1LYz97l07Y1drGy5Txal1mnKttzz4aB5b98Y11Q3A95uCn2h60kIYq) {
         float var2 = Float.MAX_VALUE;
         float var3 = Float.MIN_NORMAL;

         for (float var7 : this.9F000reVs09qJC6RM1CDXbwpWot2ap8bQLJ224QEy3l8Sj0Ca7AELxBGg6v9) {
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
            var9[var10] = (byte)((this.9F000reVs09qJC6RM1CDXbwpWot2ap8bQLJ224QEy3l8Sj0Ca7AELxBGg6v9[var10] + var2) / var8 * 255.0F);
         }

         var1.writeFloat(var2);
         var1.writeFloat(var3);
         var1.write(var9);
      }
   }

   @Override
   public void _ZUE51XBA7cufsC4P0Gzthkn2brI5TD00L1vh7N4tr0nuTtiT5XlO3Auyv8w/* $VF was: 9ZUE51XBA7cufsC4P0Gzthkn2brI5TD00L1vh7N4tr0nuTtiT5XlO3Auyv8w */(
      01d2bz82cvo258OoW5QRv9227He83KMS72rx7dJZ4kIt4pQsda5dD462E9lwI08y654TCAdha0LafNWBKZv6XEJe46UFVB2d7u2 var1
   ) {
      var1._u68xhl3rrS311IMwaiYT3jcnitw2VhCXcC0Zn3wRW74xqxf1nI7ZckAWe26/* $VF was: 4u68xhl3rrS311IMwaiYT3jcnitw2VhCXcC0Zn3wRW74xqxf1nI7ZckAWe26 */(this);
   }

   @Override
   public int _744JpaofDfd41Z04dPUDpJid52wVS14o4PF77eSx3C6aWXwZr5Pr9x581cD/* $VF was: 8744JpaofDfd41Z04dPUDpJid52wVS14o4PF77eSx3C6aWXwZr5Pr9x581cD */() {
      return 9;
   }
}
