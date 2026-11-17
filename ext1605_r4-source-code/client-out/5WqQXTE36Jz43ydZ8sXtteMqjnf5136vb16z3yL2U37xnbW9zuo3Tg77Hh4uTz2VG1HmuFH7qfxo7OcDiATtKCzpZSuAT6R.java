import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class 5WqQXTE36Jz43ydZ8sXtteMqjnf5136vb16z3yL2U37xnbW9zuo3Tg77Hh4uTz2VG1HmuFH7qfxo7OcDiATtKCzpZSuAT6R extends FilterOutputStream {
   private int 13gq29yY517d3DL81A3C2g6zyCbHKjK4KXKbI4kppuN2nA3PVq2J1URK6eNs = 0;
   private int 1kHxF68v3X9b76SytZ31YgG7w6qd33DjF9K31o5p4IFDIQt93i3Z9PKQ0a15;
   private int 87zTbSoW395qW6Xuc3yEFmzuH95VGzxOHdw10x0p80bPL2To2sgk3TJlbMsz;
   private int 8yh1ol5riNSt3wdoLJkyOJ0iwFZgdvN7Nm1jXS3InY2u4db8uWyBKlATSqGj;
   private boolean 0CCF82TSj5c7378DN68D7D1zt4U459kblPC5CUXU2a05enYES66s00oMg0FU = false;
   private final char[] 2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU;
   private final byte[] 73i6QiDdc3Np8dyD5VOLGMh5iAvfBUBSuGR3ClivV4kg6o7vF380nO3nfN34;
   private final int 957LYqy3MkVMHr3p1PENsb9Q1h320yB9qm3568jgLxDtQy93UMGqR2pbz2Q7;
   private final boolean 67YxjthHAKW4aSKNC1zG0q40lxBAOSq6EM6sDWhvNQ56fQL9rMF9mC5HT8ne;
   private int 0K0wjzd5mr23oH36pI1e4GL7oeld6Za511h37cpp07hjg0dwyRJG5t7bJZNo = 0;

   _WqQXTE36Jz43ydZ8sXtteMqjnf5136vb16z3yL2U37xnbW9zuo3Tg77Hh4uTz2VG1HmuFH7qfxo7OcDiATtKCzpZSuAT6R/* $VF was: 5WqQXTE36Jz43ydZ8sXtteMqjnf5136vb16z3yL2U37xnbW9zuo3Tg77Hh4uTz2VG1HmuFH7qfxo7OcDiATtKCzpZSuAT6R */(
      OutputStream var1, char[] var2, byte[] var3, int var4, boolean var5
   ) {
      super(var1);
      this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU = var2;
      this.73i6QiDdc3Np8dyD5VOLGMh5iAvfBUBSuGR3ClivV4kg6o7vF380nO3nfN34 = var3;
      this.957LYqy3MkVMHr3p1PENsb9Q1h320yB9qm3568jgLxDtQy93UMGqR2pbz2Q7 = var4;
      this.67YxjthHAKW4aSKNC1zG0q40lxBAOSq6EM6sDWhvNQ56fQL9rMF9mC5HT8ne = var5;
   }

   @Override
   public void write(int var1) throws IOException {
      byte[] var2 = new byte[]{(byte)(var1 & 0xFF)};
      this.write(var2, 0, 1);
   }

   private void _92dX284RzHc64UbJtrL6T49zDjrhZN1gDKcOELDgMfKUqy19h5Df09053op/* $VF was: 692dX284RzHc64UbJtrL6T49zDjrhZN1gDKcOELDgMfKUqy19h5Df09053op */() throws IOException {
      if (this.0K0wjzd5mr23oH36pI1e4GL7oeld6Za511h37cpp07hjg0dwyRJG5t7bJZNo == this.957LYqy3MkVMHr3p1PENsb9Q1h320yB9qm3568jgLxDtQy93UMGqR2pbz2Q7) {
         this.out.write(this.73i6QiDdc3Np8dyD5VOLGMh5iAvfBUBSuGR3ClivV4kg6o7vF380nO3nfN34);
         this.0K0wjzd5mr23oH36pI1e4GL7oeld6Za511h37cpp07hjg0dwyRJG5t7bJZNo = 0;
      }
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      if (this.0CCF82TSj5c7378DN68D7D1zt4U459kblPC5CUXU2a05enYES66s00oMg0FU) {
         throw new IOException("Stream is closed");
      }

      if (var2 < 0 || var3 < 0 || var3 > var1.length - var2) {
         throw new ArrayIndexOutOfBoundsException();
      }

      if (var3 != 0) {
         if (this.13gq29yY517d3DL81A3C2g6zyCbHKjK4KXKbI4kppuN2nA3PVq2J1URK6eNs != 0) {
            if (this.13gq29yY517d3DL81A3C2g6zyCbHKjK4KXKbI4kppuN2nA3PVq2J1URK6eNs == 1) {
               this.87zTbSoW395qW6Xuc3yEFmzuH95VGzxOHdw10x0p80bPL2To2sgk3TJlbMsz = var1[var2++] & 255;
               if (--var3 == 0) {
                  this.13gq29yY517d3DL81A3C2g6zyCbHKjK4KXKbI4kppuN2nA3PVq2J1URK6eNs++;
                  return;
               }
            }

            this.8yh1ol5riNSt3wdoLJkyOJ0iwFZgdvN7Nm1jXS3InY2u4db8uWyBKlATSqGj = var1[var2++] & 255;
            var3--;
            this._92dX284RzHc64UbJtrL6T49zDjrhZN1gDKcOELDgMfKUqy19h5Df09053op/* $VF was: 692dX284RzHc64UbJtrL6T49zDjrhZN1gDKcOELDgMfKUqy19h5Df09053op */();
            this.out
               .write(this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[this.1kHxF68v3X9b76SytZ31YgG7w6qd33DjF9K31o5p4IFDIQt93i3Z9PKQ0a15 >> 2]);
            this.out
               .write(
                  this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[this.1kHxF68v3X9b76SytZ31YgG7w6qd33DjF9K31o5p4IFDIQt93i3Z9PKQ0a15 << 4 & 63
                     | this.87zTbSoW395qW6Xuc3yEFmzuH95VGzxOHdw10x0p80bPL2To2sgk3TJlbMsz >> 4]
               );
            this.out
               .write(
                  this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[this.87zTbSoW395qW6Xuc3yEFmzuH95VGzxOHdw10x0p80bPL2To2sgk3TJlbMsz << 2 & 63
                     | this.8yh1ol5riNSt3wdoLJkyOJ0iwFZgdvN7Nm1jXS3InY2u4db8uWyBKlATSqGj >> 6]
               );
            this.out
               .write(this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[this.8yh1ol5riNSt3wdoLJkyOJ0iwFZgdvN7Nm1jXS3InY2u4db8uWyBKlATSqGj & 63]);
            this.0K0wjzd5mr23oH36pI1e4GL7oeld6Za511h37cpp07hjg0dwyRJG5t7bJZNo += 4;
         }

         int var4 = var3 / 3;

         for (this.13gq29yY517d3DL81A3C2g6zyCbHKjK4KXKbI4kppuN2nA3PVq2J1URK6eNs = var3 - var4 * 3;
            var4-- > 0;
            this.0K0wjzd5mr23oH36pI1e4GL7oeld6Za511h37cpp07hjg0dwyRJG5t7bJZNo += 4
         ) {
            this._92dX284RzHc64UbJtrL6T49zDjrhZN1gDKcOELDgMfKUqy19h5Df09053op/* $VF was: 692dX284RzHc64UbJtrL6T49zDjrhZN1gDKcOELDgMfKUqy19h5Df09053op */();
            int var5 = (var1[var2++] & 255) << 16 | (var1[var2++] & 255) << 8 | var1[var2++] & 255;
            this.out.write(this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[var5 >>> 18 & 63]);
            this.out.write(this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[var5 >>> 12 & 63]);
            this.out.write(this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[var5 >>> 6 & 63]);
            this.out.write(this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[var5 & 63]);
         }

         if (this.13gq29yY517d3DL81A3C2g6zyCbHKjK4KXKbI4kppuN2nA3PVq2J1URK6eNs == 1) {
            this.1kHxF68v3X9b76SytZ31YgG7w6qd33DjF9K31o5p4IFDIQt93i3Z9PKQ0a15 = var1[var2++] & 255;
         } else if (this.13gq29yY517d3DL81A3C2g6zyCbHKjK4KXKbI4kppuN2nA3PVq2J1URK6eNs == 2) {
            this.1kHxF68v3X9b76SytZ31YgG7w6qd33DjF9K31o5p4IFDIQt93i3Z9PKQ0a15 = var1[var2++] & 255;
            this.87zTbSoW395qW6Xuc3yEFmzuH95VGzxOHdw10x0p80bPL2To2sgk3TJlbMsz = var1[var2++] & 255;
         }
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.0CCF82TSj5c7378DN68D7D1zt4U459kblPC5CUXU2a05enYES66s00oMg0FU) {
         this.0CCF82TSj5c7378DN68D7D1zt4U459kblPC5CUXU2a05enYES66s00oMg0FU = true;
         if (this.13gq29yY517d3DL81A3C2g6zyCbHKjK4KXKbI4kppuN2nA3PVq2J1URK6eNs == 1) {
            this._92dX284RzHc64UbJtrL6T49zDjrhZN1gDKcOELDgMfKUqy19h5Df09053op/* $VF was: 692dX284RzHc64UbJtrL6T49zDjrhZN1gDKcOELDgMfKUqy19h5Df09053op */();
            this.out
               .write(this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[this.1kHxF68v3X9b76SytZ31YgG7w6qd33DjF9K31o5p4IFDIQt93i3Z9PKQ0a15 >> 2]);
            this.out
               .write(
                  this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[this.1kHxF68v3X9b76SytZ31YgG7w6qd33DjF9K31o5p4IFDIQt93i3Z9PKQ0a15 << 4 & 63]
               );
            if (this.67YxjthHAKW4aSKNC1zG0q40lxBAOSq6EM6sDWhvNQ56fQL9rMF9mC5HT8ne) {
               this.out.write(61);
               this.out.write(61);
            }
         } else if (this.13gq29yY517d3DL81A3C2g6zyCbHKjK4KXKbI4kppuN2nA3PVq2J1URK6eNs == 2) {
            this._92dX284RzHc64UbJtrL6T49zDjrhZN1gDKcOELDgMfKUqy19h5Df09053op/* $VF was: 692dX284RzHc64UbJtrL6T49zDjrhZN1gDKcOELDgMfKUqy19h5Df09053op */();
            this.out
               .write(this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[this.1kHxF68v3X9b76SytZ31YgG7w6qd33DjF9K31o5p4IFDIQt93i3Z9PKQ0a15 >> 2]);
            this.out
               .write(
                  this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[this.1kHxF68v3X9b76SytZ31YgG7w6qd33DjF9K31o5p4IFDIQt93i3Z9PKQ0a15 << 4 & 63
                     | this.87zTbSoW395qW6Xuc3yEFmzuH95VGzxOHdw10x0p80bPL2To2sgk3TJlbMsz >> 4]
               );
            this.out
               .write(
                  this.2nPrFNR881s2RBX6enyioUpWZ3DX1U40S6lP3TXW5SPh7fLV5m0Xs8P41xcU[this.87zTbSoW395qW6Xuc3yEFmzuH95VGzxOHdw10x0p80bPL2To2sgk3TJlbMsz << 2 & 63]
               );
            if (this.67YxjthHAKW4aSKNC1zG0q40lxBAOSq6EM6sDWhvNQ56fQL9rMF9mC5HT8ne) {
               this.out.write(61);
            }
         }

         this.13gq29yY517d3DL81A3C2g6zyCbHKjK4KXKbI4kppuN2nA3PVq2J1URK6eNs = 0;
         this.out.close();
      }
   }
}
