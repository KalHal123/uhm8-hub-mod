package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class0035 extends Class0321 {
   public String 1tQe51BGm2Xp0U4KWl986Un70qX3d2AwM1k36lum5J6spue8ma5b8XrccW8B = "";
   public int 66i793hD95eJf0C8Ehst4uhr2W1BWDBzGSNH7JLx766Z3S7497gRS92sa4W1;

   public Class0035(String var1, int var2) {
      this.1tQe51BGm2Xp0U4KWl986Un70qX3d2AwM1k36lum5J6spue8ma5b8XrccW8B = var1;
      this.66i793hD95eJf0C8Ehst4uhr2W1BWDBzGSNH7JLx766Z3S7497gRS92sa4W1 = var2;
   }

   @Override
   public void _qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(
      DataInputStream var1
   ) throws IOException {
      this.1tQe51BGm2Xp0U4KWl986Un70qX3d2AwM1k36lum5J6spue8ma5b8XrccW8B = var1.readUTF();
      this.66i793hD95eJf0C8Ehst4uhr2W1BWDBzGSNH7JLx766Z3S7497gRS92sa4W1 = var1.readInt();
   }

   @Override
   public void _1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(
      DataOutputStream var1
   ) throws IOException {
      var1.writeUTF(this.1tQe51BGm2Xp0U4KWl986Un70qX3d2AwM1k36lum5J6spue8ma5b8XrccW8B);
      var1.writeInt(this.66i793hD95eJf0C8Ehst4uhr2W1BWDBzGSNH7JLx766Z3S7497gRS92sa4W1);
   }

   @Override
   public void _qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6/* $VF was: 9qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6 */(
      Class0193 var1
   ) {
      if (var1 instanceof Class0126) {
         ((Class0126)var1)
            .153eK577106q8kfPW7J0Y419Qr5Fz8DuP47L389r0L360lr8Lg2fnlcCPy88
            .6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
            ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(this);
      }
   }

   @Override
   public int _30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */() {
      return this.1tQe51BGm2Xp0U4KWl986Un70qX3d2AwM1k36lum5J6spue8ma5b8XrccW8B.getBytes().length;
   }
}
