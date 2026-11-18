package x;

import java.util.Random;

public class Class0062 extends Class0019 {
   private int 6lrpfIb3aqUegG3O764z1M8D5VuHup17irgEDv4n6Q85a2MqoxypVTwee7q2;

   public Class0062(int var1) {
      this.6lrpfIb3aqUegG3O764z1M8D5VuHup17irgEDv4n6Q85a2MqoxypVTwee7q2 = var1;
   }

   @Override
   public boolean _QASFp0IVH1Io4Y6hWJ89W819w74iAGD0XCK30D5J5JohH4SSZzEmdpLguZl/* $VF was: 4QASFp0IVH1Io4Y6hWJ89W819w74iAGD0XCK30D5J5JohH4SSZzEmdpLguZl */(
      Class0320 var1, Random var2, int var3, int var4, int var5
   ) {
      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         boolean var10 = false;
         if (var8 > 90) {
            var10 = true;
         } else if (var8 > 80) {
            var10 = var2.nextInt(100) > 80;
         }

         if (var10
            && var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                  var7, var8, var9
               )
               == 0) {
            var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
               var7, var8, var9, this.6lrpfIb3aqUegG3O764z1M8D5VuHup17irgEDv4n6Q85a2MqoxypVTwee7q2
            );
         }
      }

      return true;
   }
}
