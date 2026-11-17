import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class 5e03Tw416352dqfOT3a1e9ub8TL3BP2V33fuoOIeRH3s3Q3F4g7iZ5A7B20lkPkUb0cS0QkvD5flxyn6Y2cI3K7HwdN3I94o5
   extends 5tL0rndgg81QbNd36sHc507Ysx4d5UxNJ85xNpWCG1S6wiQC0yXJ0680h00S2Fn5rPDCq6BbHpgoM2bl4m9ZHK8H52ifAj0gneK {
   public int 3qJ34Bz8gCIf64K5exr8yJo90bI1hG8rg83I7n3CS2M9K27Q7q939xS5z6b7;
   public int 1H9hE7UAOf38V1h3io18RbPfTlzA6172CBBS6OX3xJ8uSZ29ke54xKRV90D6;
   public int 2z4l2p6uf5ltJ0zT7G8a1yp919k7V2DyZnCK2Yym4L819eavt8J40718907o;
   public int 11NERD48Oy926ihAl7a4MorPS40vYOa92htki8hk6fph6v2g58qjcbzx8Jr3;
   public int 9c3oL8jY44auvp7F5B04793L7njYV3MJ143K34mdB1M4oQ90pew28z8pwhWt;
   public int 2vJRhJPdwW4OuM5bf4bEsQRlZg0nzF74hpxMYLu4Vo5G7D4BEUFw8p176Yyp;
   public byte[] 88620BRyc8Pm07e9j0xMv2Wk613wrT4SgKdFqsCte1Cp3wNc6C8I3aG4mrad;
   private int 51CFRucd19691E2Hn077o6rI8QmUdUX401UZJUsL8Vwtisudas1u120H83qL;

   public _e03Tw416352dqfOT3a1e9ub8TL3BP2V33fuoOIeRH3s3Q3F4g7iZ5A7B20lkPkUb0cS0QkvD5flxyn6Y2cI3K7HwdN3I94o5/* $VF was: 5e03Tw416352dqfOT3a1e9ub8TL3BP2V33fuoOIeRH3s3Q3F4g7iZ5A7B20lkPkUb0cS0QkvD5flxyn6Y2cI3K7HwdN3I94o5 */() {
      this.6t9cCgt41s5d1pQ7cjb3tIHK1IXU79b99NWj8CrXP2toB951Vr11rxkXisnp = true;
   }

   @Override
   public void _t2R3RVJsoYj9B2a380xVYlo7WZFUfuAfb6wnneCWDNK5rEczcPme6sK1blM/* $VF was: 5t2R3RVJsoYj9B2a380xVYlo7WZFUfuAfb6wnneCWDNK5rEczcPme6sK1blM */(
      DataInputStream var1
   ) throws IOException {
      this.3qJ34Bz8gCIf64K5exr8yJo90bI1hG8rg83I7n3CS2M9K27Q7q939xS5z6b7 = var1.readInt();
      this.1H9hE7UAOf38V1h3io18RbPfTlzA6172CBBS6OX3xJ8uSZ29ke54xKRV90D6 = var1.readShort();
      this.2z4l2p6uf5ltJ0zT7G8a1yp919k7V2DyZnCK2Yym4L819eavt8J40718907o = var1.readInt();
      this.11NERD48Oy926ihAl7a4MorPS40vYOa92htki8hk6fph6v2g58qjcbzx8Jr3 = var1.read() + 1;
      this.9c3oL8jY44auvp7F5B04793L7njYV3MJ143K34mdB1M4oQ90pew28z8pwhWt = var1.read() + 1;
      this.2vJRhJPdwW4OuM5bf4bEsQRlZg0nzF74hpxMYLu4Vo5G7D4BEUFw8p176Yyp = var1.read() + 1;
      int var2 = var1.readInt();
      byte[] var3 = new byte[var2];
      var1.readFully(var3);
      this.88620BRyc8Pm07e9j0xMv2Wk613wrT4SgKdFqsCte1Cp3wNc6C8I3aG4mrad = new byte[this.11NERD48Oy926ihAl7a4MorPS40vYOa92htki8hk6fph6v2g58qjcbzx8Jr3
         * this.9c3oL8jY44auvp7F5B04793L7njYV3MJ143K34mdB1M4oQ90pew28z8pwhWt
         * this.2vJRhJPdwW4OuM5bf4bEsQRlZg0nzF74hpxMYLu4Vo5G7D4BEUFw8p176Yyp
         * 5
         / 2];
      Inflater var4 = new Inflater();
      var4.setInput(var3);

      try {
         var4.inflate(this.88620BRyc8Pm07e9j0xMv2Wk613wrT4SgKdFqsCte1Cp3wNc6C8I3aG4mrad);
      } catch (DataFormatException var9) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }
   }

   @Override
   public void _5i5X5zy1OVOY1fU3430Vh8d48Hp64UcyqPb124NCs5R3O5T7jovN4MYko9g/* $VF was: 45i5X5zy1OVOY1fU3430Vh8d48Hp64UcyqPb124NCs5R3O5T7jovN4MYko9g */(
      DataOutputStream var1
   ) throws IOException {
      var1.writeInt(this.3qJ34Bz8gCIf64K5exr8yJo90bI1hG8rg83I7n3CS2M9K27Q7q939xS5z6b7);
      var1.writeShort(this.1H9hE7UAOf38V1h3io18RbPfTlzA6172CBBS6OX3xJ8uSZ29ke54xKRV90D6);
      var1.writeInt(this.2z4l2p6uf5ltJ0zT7G8a1yp919k7V2DyZnCK2Yym4L819eavt8J40718907o);
      var1.write(this.11NERD48Oy926ihAl7a4MorPS40vYOa92htki8hk6fph6v2g58qjcbzx8Jr3 - 1);
      var1.write(this.9c3oL8jY44auvp7F5B04793L7njYV3MJ143K34mdB1M4oQ90pew28z8pwhWt - 1);
      var1.write(this.2vJRhJPdwW4OuM5bf4bEsQRlZg0nzF74hpxMYLu4Vo5G7D4BEUFw8p176Yyp - 1);
      var1.writeInt(this.51CFRucd19691E2Hn077o6rI8QmUdUX401UZJUsL8Vwtisudas1u120H83qL);
      var1.write(this.88620BRyc8Pm07e9j0xMv2Wk613wrT4SgKdFqsCte1Cp3wNc6C8I3aG4mrad, 0, this.51CFRucd19691E2Hn077o6rI8QmUdUX401UZJUsL8Vwtisudas1u120H83qL);
   }

   @Override
   public void _ZUE51XBA7cufsC4P0Gzthkn2brI5TD00L1vh7N4tr0nuTtiT5XlO3Auyv8w/* $VF was: 9ZUE51XBA7cufsC4P0Gzthkn2brI5TD00L1vh7N4tr0nuTtiT5XlO3Auyv8w */(
      01d2bz82cvo258OoW5QRv9227He83KMS72rx7dJZ4kIt4pQsda5dD462E9lwI08y654TCAdha0LafNWBKZv6XEJe46UFVB2d7u2 var1
   ) {
      var1._qzz2ClUupGvhm7RfMR00QnmWltx9u1Gg1cwHT7x9dBZ41Oy47dUUOv58KWh/* $VF was: 3qzz2ClUupGvhm7RfMR00QnmWltx9u1Gg1cwHT7x9dBZ41Oy47dUUOv58KWh */(this);
   }

   @Override
   public int _744JpaofDfd41Z04dPUDpJid52wVS14o4PF77eSx3C6aWXwZr5Pr9x581cD/* $VF was: 8744JpaofDfd41Z04dPUDpJid52wVS14o4PF77eSx3C6aWXwZr5Pr9x581cD */() {
      return 17 + this.51CFRucd19691E2Hn077o6rI8QmUdUX401UZJUsL8Vwtisudas1u120H83qL;
   }
}
