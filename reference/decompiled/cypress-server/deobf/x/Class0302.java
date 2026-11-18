package x;

import java.util.Random;

public class Class0302 extends Class0019 {
   private int 8yXt0mqWtwyZ9F70LSoXk0DhOohRpG3J84lAh3LQBEBEI4xiBVgcpx4j8I51;

   public Class0302(int var1) {
      this.8yXt0mqWtwyZ9F70LSoXk0DhOohRpG3J84lAh3LQBEBEI4xiBVgcpx4j8I51 = var1;
   }

   @Override
   public boolean _QASFp0IVH1Io4Y6hWJ89W819w74iAGD0XCK30D5J5JohH4SSZzEmdpLguZl/* $VF was: 4QASFp0IVH1Io4Y6hWJ89W819w74iAGD0XCK30D5J5JohH4SSZzEmdpLguZl */(
      Class0320 var1, Random var2, int var3, int var4, int var5
   ) {
      for (int var6 = 0; var6 < 64; var6++) {
         int var7 = var5 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var10 = var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
            var9, var8 - 1, var7
         );
         boolean var11 = var10 == 9 || var10 == 79;
         if (var1._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
                  var9, var8, var7
               )
               == 0
            && var11) {
            var1._f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w/* $VF was: 2f7ejL2sVQr51jQT4ah419g7S7f6yUC4ojBSjSt54LTLAITm0K3EazlzS45w */(
               var9, var8, var7, this.8yXt0mqWtwyZ9F70LSoXk0DhOohRpG3J84lAh3LQBEBEI4xiBVgcpx4j8I51
            );
         }
      }

      return true;
   }
}
