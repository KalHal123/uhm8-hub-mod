import java.util.Random;

public class 2i5i059Fd4x693glo8jFvUbaZf9644kp7UcJdmLtmw22KQMmfTtf15I618Cy3rK6n8L5p7kEEE0lj9w9Vrr3YZaL45SXVz4Irs9F
   extends 5IxW7xNlD4n72ZbXM92Akmbq1YB4fx1Lf4B2j02W9KHo5IkYelMe9JfYOLeKFMMq7k4Vx0CXs2gZFywimS20945LcK0ttT5 {
   private 8rc47xc013mvpr1msgjgGw9bvc46uz9s8kcDy37a5Eyj7s30zI5kQQHe6dA3MeMrMLD88vp9D5mj94pjI98YTrV24lN3i2jfEk6[] 7Ijenx5wqqU29Db3h8wiu8EKKC5zqOw4lG739cASU2sjLdJXD3QbAKSoKX83;
   private int 3MGd64Kv05Zf80A1sO169L5Yu4CQ9Qdzbt5O73E66OuufphSGT3l534oitca;

   public _i5i059Fd4x693glo8jFvUbaZf9644kp7UcJdmLtmw22KQMmfTtf15I618Cy3rK6n8L5p7kEEE0lj9w9Vrr3YZaL45SXVz4Irs9F/* $VF was: 2i5i059Fd4x693glo8jFvUbaZf9644kp7UcJdmLtmw22KQMmfTtf15I618Cy3rK6n8L5p7kEEE0lj9w9Vrr3YZaL45SXVz4Irs9F */(
      Random var1, int var2
   ) {
      this.3MGd64Kv05Zf80A1sO169L5Yu4CQ9Qdzbt5O73E66OuufphSGT3l534oitca = var2;
      this.7Ijenx5wqqU29Db3h8wiu8EKKC5zqOw4lG739cASU2sjLdJXD3QbAKSoKX83 = new 8rc47xc013mvpr1msgjgGw9bvc46uz9s8kcDy37a5Eyj7s30zI5kQQHe6dA3MeMrMLD88vp9D5mj94pjI98YTrV24lN3i2jfEk6[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         this.7Ijenx5wqqU29Db3h8wiu8EKKC5zqOw4lG739cASU2sjLdJXD3QbAKSoKX83[var3] = new 8rc47xc013mvpr1msgjgGw9bvc46uz9s8kcDy37a5Eyj7s30zI5kQQHe6dA3MeMrMLD88vp9D5mj94pjI98YTrV24lN3i2jfEk6(
            var1
         );
      }
   }

   public double _q1y3qI18jCj8CdKgh2I7lUIXQlCL32u1brrEFGNp6h8c1kJGVD2i8meNloo/* $VF was: 7q1y3qI18jCj8CdKgh2I7lUIXQlCL32u1brrEFGNp6h8c1kJGVD2i8meNloo */(
      double var1, double var3
   ) {
      double var5 = 0.0;
      double var7 = 1.0;

      for (int var9 = 0; var9 < this.3MGd64Kv05Zf80A1sO169L5Yu4CQ9Qdzbt5O73E66OuufphSGT3l534oitca; var9++) {
         var5 += this.7Ijenx5wqqU29Db3h8wiu8EKKC5zqOw4lG739cASU2sjLdJXD3QbAKSoKX83[var9]
               ._bcApzh2iyA0d1g44BIddYK8jsdiFNxp5h1dF11Ec30h84hamngGyI2EwO6P/* $VF was: 0bcApzh2iyA0d1g44BIddYK8jsdiFNxp5h1dF11Ec30h84hamngGyI2EwO6P */(
                  var1 * var7, var3 * var7
               )
            / var7;
         var7 /= 2.0;
      }

      return var5;
   }

   public double[] _wamm2h9i98k6L80uibc0iAeT9Iu6Bl8q29Nnrk2d1sJXjI1w6j5f5769LHO/* $VF was: 2wamm2h9i98k6L80uibc0iAeT9Iu6Bl8q29Nnrk2d1sJXjI1w6j5f5769LHO */(
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

      for (int var19 = 0; var19 < this.3MGd64Kv05Zf80A1sO169L5Yu4CQ9Qdzbt5O73E66OuufphSGT3l534oitca; var19++) {
         this.7Ijenx5wqqU29Db3h8wiu8EKKC5zqOw4lG739cASU2sjLdJXD3QbAKSoKX83[var19]
            ._S87mE7T0yFnMy578yKsRlya57WM1Ogq5RL3rpx5t07CbDy4B7b3OuKD7rIL/* $VF was: 1S87mE7T0yFnMy578yKsRlya57WM1Ogq5RL3rpx5t07CbDy4B7b3OuKD7rIL */(
               var1, var2, var4, var6, var8, var9, var10, var11 * var20, var13 * var20, var15 * var20, var20
            );
         var20 /= 2.0;
      }

      return var1;
   }
}
