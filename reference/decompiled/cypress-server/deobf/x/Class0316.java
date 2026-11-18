package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class0316 extends Class0297 {
   public Class0316() {
      this.2ihx0rRDA20A2gdws2yq3LIdpDlNZewdt5CUvrnD397FqS9eeEtsSmnToMt6 = true;
   }

   public Class0316(int var1, byte var2, byte var3) {
      super(var1);
      this.5UYxX66Bxr41U5N755kLihL4bwkHa80Ri29s846eX1P0c67Xuxa3Y7xs8206 = var2;
      this.6fUUggOVoFN830eSS63V9WMHKi69sZkFqxT45m8iy5VAYHp6Yses8GpUE06g = var3;
      this.2ihx0rRDA20A2gdws2yq3LIdpDlNZewdt5CUvrnD397FqS9eeEtsSmnToMt6 = true;
   }

   @Override
   public void _qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(
      DataInputStream var1
   ) throws IOException {
      super._qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(var1);
      this.5UYxX66Bxr41U5N755kLihL4bwkHa80Ri29s846eX1P0c67Xuxa3Y7xs8206 = var1.readByte();
      this.6fUUggOVoFN830eSS63V9WMHKi69sZkFqxT45m8iy5VAYHp6Yses8GpUE06g = var1.readByte();
   }

   @Override
   public void _1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(
      DataOutputStream var1
   ) throws IOException {
      super._1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(var1);
      var1.writeByte(this.5UYxX66Bxr41U5N755kLihL4bwkHa80Ri29s846eX1P0c67Xuxa3Y7xs8206);
      var1.writeByte(this.6fUUggOVoFN830eSS63V9WMHKi69sZkFqxT45m8iy5VAYHp6Yses8GpUE06g);
   }

   @Override
   public int _30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */() {
      return 6;
   }
}
