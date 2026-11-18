package x;

import java.util.Random;

public class Class0079 {
   public static double 3rO1d4f5GFi42675247QDqGc2144pz2k6o7ubq7X04Nz7C0FrQ4ftNAjh5iu = 0.5;
   public static int 7DHf16h2049k7F3I6996N56zTxlEWkGWE5kkSQcevv1L1lk6WbnqT4zrfBmV = 4;
   private final Class0014[] 4W70I7345bwB0VbS9K556Q9VI7GJV7EVsQj9FGJV18yN0c7G9e5RMRF5GP30;
   private final float 2H4wafQ3SDHDZdY3Vidv1U6qHEta01LHZ1JtsZvuW7cZh4s7eg5Ir0r0KZQw;
   final Class0348[] 5n28OPYw3TpLAM9yDhSg3Ra91Cug1YG44Zo282R53G9q7AZwwfc48EMbCMTg = new Class0348[7DHf16h2049k7F3I6996N56zTxlEWkGWE5kkSQcevv1L1lk6WbnqT4zrfBmV];
   final Class0348 0OhW2d54rXxyRI54Xga28465eahY8BQs1AtFX73BfHy24KGD6KNIrKRz37sJ;

   public Class0079(Random var1) {
      this.0OhW2d54rXxyRI54Xga28465eahY8BQs1AtFX73BfHy24KGD6KNIrKRz37sJ = new Class0348(var1);

      for (int var2 = 0; var2 < 7DHf16h2049k7F3I6996N56zTxlEWkGWE5kkSQcevv1L1lk6WbnqT4zrfBmV; var2++) {
         this.5n28OPYw3TpLAM9yDhSg3Ra91Cug1YG44Zo282R53G9q7AZwwfc48EMbCMTg[var2] = new Class0348(var1);
      }

      this.4W70I7345bwB0VbS9K556Q9VI7GJV7EVsQj9FGJV18yN0c7G9e5RMRF5GP30 = new Class0014[]{new Class0351(var1), new Class0213(var1), new Class0093(var1)};
      float var7 = 0.0F;

      for (Class0014 var6 : this.4W70I7345bwB0VbS9K556Q9VI7GJV7EVsQj9FGJV18yN0c7G9e5RMRF5GP30) {
         var7 += var6._MbDiJtu6trpae74IapUd09LfEVt0Aru1bX9SAE845fOF7B0JmYIQrXHuHxC/* $VF was: 4MbDiJtu6trpae74IapUd09LfEVt0Aru1bX9SAE845fOF7B0JmYIQrXHuHxC */();
      }

      this.2H4wafQ3SDHDZdY3Vidv1U6qHEta01LHZ1JtsZvuW7cZh4s7eg5Ir0r0KZQw = var7;
   }

   public <T extends Class0014> T _xXsGQ372mdmP5t3WjZM3B5A77sR87VdtD2InK441r9Rqp3reHHT4S4Eqb5C/* $VF was: 2xXsGQ372mdmP5t3WjZM3B5A77sR87VdtD2InK441r9Rqp3reHHT4S4Eqb5C */(
      Class<T> var1
   ) {
      for (Class0014 var5 : this.4W70I7345bwB0VbS9K556Q9VI7GJV7EVsQj9FGJV18yN0c7G9e5RMRF5GP30) {
         if (var1.isInstance(var5)) {
            return (T)var1.cast(var5);
         }
      }

      throw new RuntimeException();
   }

   public Class0014 _SpC8g5geJXYT8BF3vfI8b36WtP4ic1bjN1P99YctcmBbeQlz5AgOjen5w9y/* $VF was: 1SpC8g5geJXYT8BF3vfI8b36WtP4ic1bjN1P99YctcmBbeQlz5AgOjen5w9y */(
      int var1, int var2
   ) {
      if (Math.pow(Math.min(100, Math.abs(var1)), 2.0) + Math.pow(Math.min(100, Math.abs(var2)), 2.0) < 256.0) {
         return this._xXsGQ372mdmP5t3WjZM3B5A77sR87VdtD2InK441r9Rqp3reHHT4S4Eqb5C/* $VF was: 2xXsGQ372mdmP5t3WjZM3B5A77sR87VdtD2InK441r9Rqp3reHHT4S4Eqb5C */(
            Class0351.class
         );
      }

      for (Class0348 var6 : this.5n28OPYw3TpLAM9yDhSg3Ra91Cug1YG44Zo282R53G9q7AZwwfc48EMbCMTg) {
         if (var6._bcApzh2iyA0d1g44BIddYK8jsdiFNxp5h1dF11Ec30h84hamngGyI2EwO6P/* $VF was: 0bcApzh2iyA0d1g44BIddYK8jsdiFNxp5h1dF11Ec30h84hamngGyI2EwO6P */(
               var1 / 16.0, var2 / 16.0
            )
            < 3rO1d4f5GFi42675247QDqGc2144pz2k6o7ubq7X04Nz7C0FrQ4ftNAjh5iu * 2.0 - 1.0) {
            return this._xXsGQ372mdmP5t3WjZM3B5A77sR87VdtD2InK441r9Rqp3reHHT4S4Eqb5C/* $VF was: 2xXsGQ372mdmP5t3WjZM3B5A77sR87VdtD2InK441r9Rqp3reHHT4S4Eqb5C */(
               Class0351.class
            );
         }
      }

      double var9 = (
            this.0OhW2d54rXxyRI54Xga28465eahY8BQs1AtFX73BfHy24KGD6KNIrKRz37sJ
                     ._bcApzh2iyA0d1g44BIddYK8jsdiFNxp5h1dF11Ec30h84hamngGyI2EwO6P/* $VF was: 0bcApzh2iyA0d1g44BIddYK8jsdiFNxp5h1dF11Ec30h84hamngGyI2EwO6P */(
                        var1, var2
                     )
                  / 2.0
               + 0.5
         )
         * this.2H4wafQ3SDHDZdY3Vidv1U6qHEta01LHZ1JtsZvuW7cZh4s7eg5Ir0r0KZQw;

      for (Class0014 var8 : this.4W70I7345bwB0VbS9K556Q9VI7GJV7EVsQj9FGJV18yN0c7G9e5RMRF5GP30) {
         if (var9
            <= var8._MbDiJtu6trpae74IapUd09LfEVt0Aru1bX9SAE845fOF7B0JmYIQrXHuHxC/* $VF was: 4MbDiJtu6trpae74IapUd09LfEVt0Aru1bX9SAE845fOF7B0JmYIQrXHuHxC */()) {
            return var8;
         }

         var9 -= var8._MbDiJtu6trpae74IapUd09LfEVt0Aru1bX9SAE845fOF7B0JmYIQrXHuHxC/* $VF was: 4MbDiJtu6trpae74IapUd09LfEVt0Aru1bX9SAE845fOF7B0JmYIQrXHuHxC */();
      }

      return this._xXsGQ372mdmP5t3WjZM3B5A77sR87VdtD2InK441r9Rqp3reHHT4S4Eqb5C/* $VF was: 2xXsGQ372mdmP5t3WjZM3B5A77sR87VdtD2InK441r9Rqp3reHHT4S4Eqb5C */(
         Class0351.class
      );
   }

   public boolean _2k9S8xaAG0AAT1yVCCF7983U3I901enS3QdO9y1064k627Mh9vbVDkf1W2q/* $VF was: 72k9S8xaAG0AAT1yVCCF7983U3I901enS3QdO9y1064k627Mh9vbVDkf1W2q */(
      Class<? extends Class0014> var1, int var2, int var3
   ) {
      Class0014 var4 = this._SpC8g5geJXYT8BF3vfI8b36WtP4ic1bjN1P99YctcmBbeQlz5AgOjen5w9y/* $VF was: 1SpC8g5geJXYT8BF3vfI8b36WtP4ic1bjN1P99YctcmBbeQlz5AgOjen5w9y */(
         var2, var3
      );
      return var1.isInstance(var4);
   }

   public void _O08NUJHF49PVAx7vM6DZgafH35736XxeR7aBO62J7hr40thAg20st1u0yG3/* $VF was: 2O08NUJHF49PVAx7vM6DZgafH35736XxeR7aBO62J7hr40thAg20st1u0yG3 */(
      Class0320 var1, int var2, int var3
   ) {
      Class0014 var4 = this._SpC8g5geJXYT8BF3vfI8b36WtP4ic1bjN1P99YctcmBbeQlz5AgOjen5w9y/* $VF was: 1SpC8g5geJXYT8BF3vfI8b36WtP4ic1bjN1P99YctcmBbeQlz5AgOjen5w9y */(
         var2, var3
      );
      var4._s8xyF629674iK59W75jxL4IfegOZaukdAavse5BpG78PPgBZ5sG433o01xa/* $VF was: 9s8xyF629674iK59W75jxL4IfegOZaukdAavse5BpG78PPgBZ5sG433o01xa */(
         var1, var2, var3, this
      );
   }
}
