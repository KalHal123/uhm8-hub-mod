package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class0293 extends Class0321 {
   public String 1Vo9axU114x7pLxzk0yS482f795jjrLQDiCvm9TusQIFkW7U704BvWzr136v;

   public Class0293() {
   }

   public Class0293(String var1) {
      this.1Vo9axU114x7pLxzk0yS482f795jjrLQDiCvm9TusQIFkW7U704BvWzr136v = var1;
   }

   @Override
   public void _qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(
      DataInputStream var1
   ) throws IOException {
      this.1Vo9axU114x7pLxzk0yS482f795jjrLQDiCvm9TusQIFkW7U704BvWzr136v = var1.readUTF();
   }

   @Override
   public void _1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(
      DataOutputStream var1
   ) throws IOException {
      var1.writeUTF(this.1Vo9axU114x7pLxzk0yS482f795jjrLQDiCvm9TusQIFkW7U704BvWzr136v);
   }

   @Override
   public void _qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6/* $VF was: 9qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6 */(
      Class0193 var1
   ) {
      byte[] var2 = null;

      try {
         var2 = Class0116.9r4z2maBPOzeIQ41jM97J0sS7rNpO25b195UXkI1F7UjreZ3kMZ31B30P17t
            ._v4pMf3596FO71g04LS5DR738V0b0e9j59y5wCjSLyqx9Uxd231116vUL4le/* $VF was: 4v4pMf3596FO71g04LS5DR738V0b0e9j59y5wCjSLyqx9Uxd231116vUL4le */(
               this.1Vo9axU114x7pLxzk0yS482f795jjrLQDiCvm9TusQIFkW7U704BvWzr136v
            );
      } catch (Exception var4) {
         Class0276._6g64dD3r7sMGd5J2ucv3U0pBB5vVJJMesTTViT1lVYhsq9uDve1YAlgQC8d/* $VF was: 36g64dD3r7sMGd5J2ucv3U0pBB5vVJJMesTTViT1lVYhsq9uDve1YAlgQC8d */(
            "Error reading file: " + var4.getMessage()
         );
         var4.printStackTrace();
      }

      if (var2 == null) {
         if (var1 instanceof Class0126) {
            ((Class0126)var1)
               ._Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1/* $VF was: 5Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1 */(
                  new Class0380(this.1Vo9axU114x7pLxzk0yS482f795jjrLQDiCvm9TusQIFkW7U704BvWzr136v, 0)
               );
         }
      } else {
         for (int var3 = 0; var3 * 1024 < var2.length; var3++) {
            ((Class0126)var1)
               ._Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1/* $VF was: 5Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1 */(
                  new Class0380(this.1Vo9axU114x7pLxzk0yS482f795jjrLQDiCvm9TusQIFkW7U704BvWzr136v, var3)
               );
         }
      }
   }

   @Override
   public int _30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */() {
      return 2 + this.1Vo9axU114x7pLxzk0yS482f795jjrLQDiCvm9TusQIFkW7U704BvWzr136v.length();
   }
}
