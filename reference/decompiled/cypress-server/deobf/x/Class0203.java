package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class0203 extends Class0321 {
   public int 2pxp4xa6gtAW893i43pV1QFN11AKUl31C527IAI34PafR4MR5oq7p8hwOL4N;
   public String 0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc;
   public String 8Lt01nKf27ZYA0nfNVRLFge6raR5A2VF7ZPjI0w7426JGeM2O5xmq10ob4Wg;

   public Class0203() {
   }

   public Class0203(String var1, String var2, int var3) {
      this.0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc = var1;
      this.8Lt01nKf27ZYA0nfNVRLFge6raR5A2VF7ZPjI0w7426JGeM2O5xmq10ob4Wg = var2;
      this.2pxp4xa6gtAW893i43pV1QFN11AKUl31C527IAI34PafR4MR5oq7p8hwOL4N = var3;
   }

   @Override
   public void _qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(
      DataInputStream var1
   ) throws IOException {
      this.2pxp4xa6gtAW893i43pV1QFN11AKUl31C527IAI34PafR4MR5oq7p8hwOL4N = var1.readInt();
      this.0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc = var1.readUTF();
      this.8Lt01nKf27ZYA0nfNVRLFge6raR5A2VF7ZPjI0w7426JGeM2O5xmq10ob4Wg = var1.readUTF();
   }

   @Override
   public void _1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(
      DataOutputStream var1
   ) throws IOException {
      var1.writeInt(this.2pxp4xa6gtAW893i43pV1QFN11AKUl31C527IAI34PafR4MR5oq7p8hwOL4N);
      var1.writeUTF(this.0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc);
      var1.writeUTF(this.8Lt01nKf27ZYA0nfNVRLFge6raR5A2VF7ZPjI0w7426JGeM2O5xmq10ob4Wg);
   }

   @Override
   public void _qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6/* $VF was: 9qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6 */(
      Class0193 var1
   ) {
      var1._PFDI0g1Y2wDG6PqMWRTNB7IMmiI7aB3xiGy4Mwtr9uTtY7Jzn1yv7lKUlSp/* $VF was: 1PFDI0g1Y2wDG6PqMWRTNB7IMmiI7aB3xiGy4Mwtr9uTtY7Jzn1yv7lKUlSp */(this);
   }

   @Override
   public int _30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */() {
      return 4
         + this.0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc.length()
         + this.8Lt01nKf27ZYA0nfNVRLFge6raR5A2VF7ZPjI0w7426JGeM2O5xmq10ob4Wg.length()
         + 4;
   }
}
