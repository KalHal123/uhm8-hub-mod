import java.util.Random;

public class 4kA811BpMJA89ML0Y21mz4z1Z9Z1j0Rh5LOqb7Pq2F0vweCSX7R5zHF43pK0XkKBga79iKIvNgQc3b57cufSTlb641P9iX345
   extends 00g5IUR8M9h1Qk3Q2l5IGnt1pcUAb9xnkg0bo08DPO8b47Yso45Rf3997dINCEJ9P33vSw6N230USoE9jC9xz494SAct {
   private 1ICVnGhfs4cDkq364iDD6irgW0QCEUrMwN4q9cEO5BW67u5q10M6lLi1L7Qmvh0zf2Ai3hcP0zit7M8eR0SWk9wgNQusHQ[] 6mTjm7F50823WRyw55c56MBF985E8yusvSh2gZkQG5OOeg9dmVQ132pkaSiV;
   private final int 41gXshrC7auwgu6Q4enzD301y62H9A9McRcbi5d0IZ7scMrMUE30Ni8xrLDZ;

   public _kA811BpMJA89ML0Y21mz4z1Z9Z1j0Rh5LOqb7Pq2F0vweCSX7R5zHF43pK0XkKBga79iKIvNgQc3b57cufSTlb641P9iX345/* $VF was: 4kA811BpMJA89ML0Y21mz4z1Z9Z1j0Rh5LOqb7Pq2F0vweCSX7R5zHF43pK0XkKBga79iKIvNgQc3b57cufSTlb641P9iX345 */(
      Random var1, int var2
   ) {
      this.41gXshrC7auwgu6Q4enzD301y62H9A9McRcbi5d0IZ7scMrMUE30Ni8xrLDZ = var2;
      this.6mTjm7F50823WRyw55c56MBF985E8yusvSh2gZkQG5OOeg9dmVQ132pkaSiV = new 1ICVnGhfs4cDkq364iDD6irgW0QCEUrMwN4q9cEO5BW67u5q10M6lLi1L7Qmvh0zf2Ai3hcP0zit7M8eR0SWk9wgNQusHQ[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         this.6mTjm7F50823WRyw55c56MBF985E8yusvSh2gZkQG5OOeg9dmVQ132pkaSiV[var3] = new 1ICVnGhfs4cDkq364iDD6irgW0QCEUrMwN4q9cEO5BW67u5q10M6lLi1L7Qmvh0zf2Ai3hcP0zit7M8eR0SWk9wgNQusHQ(
            var1
         );
      }
   }

   public double _vvujk8mTKZ05PMakqc4UokdGRLIl4YvJzAPuOCULO4Yhz77V7f6Eo6nGrlv/* $VF was: 1vvujk8mTKZ05PMakqc4UokdGRLIl4YvJzAPuOCULO4Yhz77V7f6Eo6nGrlv */(
      double var1, double var3
   ) {
      double var5 = 0.0;
      double var7 = 1.0;

      for (int var9 = 0; var9 < this.41gXshrC7auwgu6Q4enzD301y62H9A9McRcbi5d0IZ7scMrMUE30Ni8xrLDZ; var9++) {
         var5 += this.6mTjm7F50823WRyw55c56MBF985E8yusvSh2gZkQG5OOeg9dmVQ132pkaSiV[var9]
               ._03Ue0NQRCM395dDHb41IC3gTE0wHASFW7l5Kd4X28z0W97a289cIJ560suF/* $VF was: 203Ue0NQRCM395dDHb41IC3gTE0wHASFW7l5Kd4X28z0W97a289cIJ560suF */(
                  var1 * var7, var3 * var7
               )
            / var7;
         var7 /= 2.0;
      }

      return var5;
   }

   public double[] _luK6YZ01i14mY89hU2lb5030YxE4TtOgC1J31sZ3tOk7OcN1K7pSgtD6213/* $VF was: 2luK6YZ01i14mY89hU2lb5030YxE4TtOgC1J31sZ3tOk7OcN1K7pSgtD6213 */(
      double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15
   ) {
      if (var1 == null) {
         var1 = new double[var8 * var9 * var10];
      } else {
         for (int var17 = 0; var17 < var1.length; var17++) {
            var1[var17] = 0.0;
         }
      }

      double var20 = 1.0;

      for (int var19 = 0; var19 < this.41gXshrC7auwgu6Q4enzD301y62H9A9McRcbi5d0IZ7scMrMUE30Ni8xrLDZ; var19++) {
         this.6mTjm7F50823WRyw55c56MBF985E8yusvSh2gZkQG5OOeg9dmVQ132pkaSiV[var19]
            ._26JWQoUZ234v69Qivrnbr611TaO65yv5m53XG6KBMUsWP8391et23J94W5U/* $VF was: 926JWQoUZ234v69Qivrnbr611TaO65yv5m53XG6KBMUsWP8391et23J94W5U */(
               var1, var2, var4, var6, var8, var9, var10, var11 * var20, var13 * var20, var15 * var20, var20
            );
         var20 /= 2.0;
      }

      return var1;
   }
}
