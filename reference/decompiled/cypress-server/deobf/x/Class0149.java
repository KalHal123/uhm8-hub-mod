package x;

import java.util.Random;

public class Class0149 {
   protected int 8H1m1JwHjYznI5gWtTnn4vQ9F1pGOGN1zx4c1YHugEoqYrF3C52w1BRveR5z = 8;
   protected Random 3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5 = new Random();

   public void _X4ra4xM3HE00nzNzQVt2lEVufE39463dDRmLS0166gu0It1JFKqS9NMFrfG/* $VF was: 3X4ra4xM3HE00nzNzQVt2lEVufE39463dDRmLS0166gu0It1JFKqS9NMFrfG */(
      Class0346 var1, Class0320 var2, int var3, int var4, byte[] var5
   ) {
      int var6 = this.8H1m1JwHjYznI5gWtTnn4vQ9F1pGOGN1zx4c1YHugEoqYrF3C52w1BRveR5z;
      this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.setSeed(var2.0I1d62cDt27eX5XR4dH3ENv3Gx50msU4F2b6CTMh2E7v1r34XKKA6YmTFjcA);
      long var7 = this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextLong() / 2L * 2L + 1L;
      long var9 = this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5.nextLong() / 2L * 2L + 1L;

      for (int var11 = var3 - var6; var11 <= var3 + var6; var11++) {
         for (int var12 = var4 - var6; var12 <= var4 + var6; var12++) {
            this.3h3JLlny8FhlfHd30YM13J3DRyx4M8lu51mEEM000ekIhOaiR092FfBoM6P5
               .setSeed(var11 * var7 + var12 * var9 ^ var2.0I1d62cDt27eX5XR4dH3ENv3Gx50msU4F2b6CTMh2E7v1r34XKKA6YmTFjcA);
            this._rkn44mCkcq7F34026OAUEs1jwc4kj022u9pl28I0ZeFbb9DFaoIbfnlY62C/* $VF was: 4rkn44mCkcq7F34026OAUEs1jwc4kj022u9pl28I0ZeFbb9DFaoIbfnlY62C */(
               var2, var11, var12, var3, var4, var5
            );
         }
      }
   }

   protected void _rkn44mCkcq7F34026OAUEs1jwc4kj022u9pl28I0ZeFbb9DFaoIbfnlY62C/* $VF was: 4rkn44mCkcq7F34026OAUEs1jwc4kj022u9pl28I0ZeFbb9DFaoIbfnlY62C */(
      Class0320 var1, int var2, int var3, int var4, int var5, byte[] var6
   ) {
   }
}
