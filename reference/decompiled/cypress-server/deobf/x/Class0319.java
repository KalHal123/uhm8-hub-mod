package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class0319 extends Class0321 {
   public int 95H6pT6Tep4814BOp9pV3127E9NE9PCCZsF35B374Iuc4cf71x949m6QKnZS;
   public Class0152[] 35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431;

   public Class0319() {
   }

   public Class0319(int var1, Class0152[] var2) {
      this.95H6pT6Tep4814BOp9pV3127E9NE9PCCZsF35B374Iuc4cf71x949m6QKnZS = var1;
      this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431 = new Class0152[var2.length];

      for (int var3 = 0; var3 < this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431.length; var3++) {
         this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431[var3] = var2[var3] == null
            ? null
            : var2[var3]
               ._glGXm9H28t66D4UwlLF3JPM3r4SvI3M3v7kN5JGy5K27uBdXWiZ8qnFiXyM/* $VF was: 0glGXm9H28t66D4UwlLF3JPM3r4SvI3M3v7kN5JGy5K27uBdXWiZ8qnFiXyM */();
      }
   }

   @Override
   public void _qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(
      DataInputStream var1
   ) throws IOException {
      this.95H6pT6Tep4814BOp9pV3127E9NE9PCCZsF35B374Iuc4cf71x949m6QKnZS = var1.readInt();
      short var2 = var1.readShort();
      this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431 = new Class0152[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1.readInt();
         if (var4 >= 0) {
            byte var5 = var1.readByte();
            short var6 = var1.readShort();
            this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431[var3] = new Class0152(var4, var5, var6);
         }
      }
   }

   @Override
   public void _1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(
      DataOutputStream var1
   ) throws IOException {
      var1.writeInt(this.95H6pT6Tep4814BOp9pV3127E9NE9PCCZsF35B374Iuc4cf71x949m6QKnZS);
      var1.writeShort(this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431.length);

      for (int var2 = 0; var2 < this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431.length; var2++) {
         if (this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431[var2] == null) {
            var1.writeInt(-1);
         } else {
            var1.writeInt(this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431[var2].859cKy6D0ZBMi0KcAlT1IoA0v279M9I4I5PVn7TnUmG523wso5j4ffcCqaIZ);
            var1.writeByte(
               (byte)this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431[var2].9CL9mox68rJB71t7I4CK4mo3i6HlOyGYz585sBqK8EUu53V1Fk6eK316FAyX
            );
            var1.writeShort(
               (short)this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431[var2].54lYK05HbRCYoY5rprj5z0Xki5AFLj4j0pVv2Fy1K5AYjV3k2Ff8svDhkV4Z
            );
         }
      }
   }

   @Override
   public void _qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6/* $VF was: 9qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6 */(
      Class0193 var1
   ) {
      var1._1887U3Ac40NuW33vN1KZAIKJ7kTdvUajo6E02a3c0DPV8pM5YJCU91nnp80/* $VF was: 61887U3Ac40NuW33vN1KZAIKJ7kTdvUajo6E02a3c0DPV8pM5YJCU91nnp80 */(this);
   }

   @Override
   public int _30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */() {
      return 6 + this.35j1G764Fvm7Ei836t7pg6tfp9M18ZH09v9zDsHw6LkvMD9WgN6E3ZJ8B431.length * 7;
   }
}
