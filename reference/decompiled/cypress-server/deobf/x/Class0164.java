package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class0164 extends Class0321 {
   public int 9PjFjfJ857F9N88sY0CMm2i7oePK52b5096Tizu96QBjqQF59uzahYA8tI1t;
   public int 7pNh2aVEU64N2in5b5vOsFP52m5Pf22Xr5f8B4Vd5am9AcoMaVSyEpoNh2Ju;
   public short[] 29l3ql3653Jza43r5p7hELC19dmafM0e1sw26zIixI7DAhNtJ8t75c2Zctd7;
   public byte[] 2rhPryA1w8ORu46oMW80j8Ty48xez7KW0QJXtRY8ntDE6S6t71821b6w8D0o;
   public byte[] 6RKF1D27lyW5N9t5zeRGfcWe7mGyeMXSDizK19FAEWGWHzss5cY6jZb5eIiy;
   public int 8pO946L5pt6UwhqOIS7c4c4Pi5qmBOC1ZRBiWU8VMBpmQ44X0t1Gaaf9DRxt;

   public Class0164() {
      this.1E562P8qZ2018R02dmQAAVbr42qL73I7mrDJ42HmbP9VEA4CqLbaVmJ4Wk53 = true;
   }

   public Class0164(int var1, int var2, short[] var3, int var4, Class0320 var5) {
      this.1E562P8qZ2018R02dmQAAVbr42qL73I7mrDJ42HmbP9VEA4CqLbaVmJ4Wk53 = true;
      this.9PjFjfJ857F9N88sY0CMm2i7oePK52b5096Tizu96QBjqQF59uzahYA8tI1t = var1;
      this.7pNh2aVEU64N2in5b5vOsFP52m5Pf22Xr5f8B4Vd5am9AcoMaVSyEpoNh2Ju = var2;
      this.8pO946L5pt6UwhqOIS7c4c4Pi5qmBOC1ZRBiWU8VMBpmQ44X0t1Gaaf9DRxt = var4;
      this.29l3ql3653Jza43r5p7hELC19dmafM0e1sw26zIixI7DAhNtJ8t75c2Zctd7 = new short[var4];
      this.2rhPryA1w8ORu46oMW80j8Ty48xez7KW0QJXtRY8ntDE6S6t71821b6w8D0o = new byte[var4];
      this.6RKF1D27lyW5N9t5zeRGfcWe7mGyeMXSDizK19FAEWGWHzss5cY6jZb5eIiy = new byte[var4];
      Class0168 var6 = var5._lURkOrwrnxlUt9stJW81lZa0E99S56Dq89L108WpO5JXd9y8oN7mRol6oYl/* $VF was: 6lURkOrwrnxlUt9stJW81lZa0E99S56Dq89L108WpO5JXd9y8oN7mRol6oYl */(
         var1, var2
      );

      for (int var7 = 0; var7 < var4; var7++) {
         int var8 = var3[var7] >> 12 & 15;
         int var9 = var3[var7] >> 8 & 15;
         int var10 = var3[var7] & 255;
         this.29l3ql3653Jza43r5p7hELC19dmafM0e1sw26zIixI7DAhNtJ8t75c2Zctd7[var7] = var3[var7];
         this.2rhPryA1w8ORu46oMW80j8Ty48xez7KW0QJXtRY8ntDE6S6t71821b6w8D0o[var7] = (byte)var6._8JZIEJLsM01e71NJa8WD8Ri6Kn94S6l0AgH5Nq28264slgV52E34Twi7Tk0/* $VF was: 28JZIEJLsM01e71NJa8WD8Ri6Kn94S6l0AgH5Nq28264slgV52E34Twi7Tk0 */(
            var8, var10, var9
         );
         this.6RKF1D27lyW5N9t5zeRGfcWe7mGyeMXSDizK19FAEWGWHzss5cY6jZb5eIiy[var7] = (byte)var6._6nS2EhxDF6QLe585sCFQuib9hy8tU1SuNOL53s0vlHYM4rk82442WIe2Q7k/* $VF was: 16nS2EhxDF6QLe585sCFQuib9hy8tU1SuNOL53s0vlHYM4rk82442WIe2Q7k */(
            var8, var10, var9
         );
      }
   }

   @Override
   public void _qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(
      DataInputStream var1
   ) throws IOException {
      this.9PjFjfJ857F9N88sY0CMm2i7oePK52b5096Tizu96QBjqQF59uzahYA8tI1t = var1.readInt();
      this.7pNh2aVEU64N2in5b5vOsFP52m5Pf22Xr5f8B4Vd5am9AcoMaVSyEpoNh2Ju = var1.readInt();
      this.8pO946L5pt6UwhqOIS7c4c4Pi5qmBOC1ZRBiWU8VMBpmQ44X0t1Gaaf9DRxt = var1.readShort() & '\uffff';
      this.29l3ql3653Jza43r5p7hELC19dmafM0e1sw26zIixI7DAhNtJ8t75c2Zctd7 = new short[this.8pO946L5pt6UwhqOIS7c4c4Pi5qmBOC1ZRBiWU8VMBpmQ44X0t1Gaaf9DRxt];
      this.2rhPryA1w8ORu46oMW80j8Ty48xez7KW0QJXtRY8ntDE6S6t71821b6w8D0o = new byte[this.8pO946L5pt6UwhqOIS7c4c4Pi5qmBOC1ZRBiWU8VMBpmQ44X0t1Gaaf9DRxt];
      this.6RKF1D27lyW5N9t5zeRGfcWe7mGyeMXSDizK19FAEWGWHzss5cY6jZb5eIiy = new byte[this.8pO946L5pt6UwhqOIS7c4c4Pi5qmBOC1ZRBiWU8VMBpmQ44X0t1Gaaf9DRxt];

      for (int var2 = 0; var2 < this.8pO946L5pt6UwhqOIS7c4c4Pi5qmBOC1ZRBiWU8VMBpmQ44X0t1Gaaf9DRxt; var2++) {
         this.29l3ql3653Jza43r5p7hELC19dmafM0e1sw26zIixI7DAhNtJ8t75c2Zctd7[var2] = var1.readShort();
      }

      var1.readFully(this.2rhPryA1w8ORu46oMW80j8Ty48xez7KW0QJXtRY8ntDE6S6t71821b6w8D0o);
      var1.readFully(this.6RKF1D27lyW5N9t5zeRGfcWe7mGyeMXSDizK19FAEWGWHzss5cY6jZb5eIiy);
      Class0276._hp51J9oi1HB7C6lUc0bickPd39J45U25cYXXjxpkx3hl9cejV51iSo8dAvv/* $VF was: 5hp51J9oi1HB7C6lUc0bickPd39J45U25cYXXjxpkx3hl9cejV51iSo8dAvv */(
         "Received packet52"
      );
   }

   @Override
   public void _1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(
      DataOutputStream var1
   ) throws IOException {
      var1.writeInt(this.9PjFjfJ857F9N88sY0CMm2i7oePK52b5096Tizu96QBjqQF59uzahYA8tI1t);
      var1.writeInt(this.7pNh2aVEU64N2in5b5vOsFP52m5Pf22Xr5f8B4Vd5am9AcoMaVSyEpoNh2Ju);
      var1.writeShort((short)this.8pO946L5pt6UwhqOIS7c4c4Pi5qmBOC1ZRBiWU8VMBpmQ44X0t1Gaaf9DRxt);

      for (int var2 = 0; var2 < this.8pO946L5pt6UwhqOIS7c4c4Pi5qmBOC1ZRBiWU8VMBpmQ44X0t1Gaaf9DRxt; var2++) {
         var1.writeShort(this.29l3ql3653Jza43r5p7hELC19dmafM0e1sw26zIixI7DAhNtJ8t75c2Zctd7[var2]);
      }

      var1.write(this.2rhPryA1w8ORu46oMW80j8Ty48xez7KW0QJXtRY8ntDE6S6t71821b6w8D0o);
      var1.write(this.6RKF1D27lyW5N9t5zeRGfcWe7mGyeMXSDizK19FAEWGWHzss5cY6jZb5eIiy);
   }

   @Override
   public void _qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6/* $VF was: 9qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6 */(
      Class0193 var1
   ) {
      var1._Ut0I66H610btYHFsG8TbSHR3YEyMe83BBlQKB0clt91TDZ6fF3K0n5fGRIS/* $VF was: 8Ut0I66H610btYHFsG8TbSHR3YEyMe83BBlQKB0clt91TDZ6fF3K0n5fGRIS */(this);
   }

   @Override
   public int _30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */() {
      return 10 + this.8pO946L5pt6UwhqOIS7c4c4Pi5qmBOC1ZRBiWU8VMBpmQ44X0t1Gaaf9DRxt * 4;
   }
}
