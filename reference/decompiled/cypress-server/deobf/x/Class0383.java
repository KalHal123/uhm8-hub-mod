package x;

public class Class0383 {
   private static float[] 79g7mKiEN92CxIn61wBa31x3ni89w798oSB8h6COhDL1ai2ou1QpAIG6mNa0 = new float[65536];

   public static final float _RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y/* $VF was: 2RT15dTJYC97ST2opS4C09F6zt23I18lC6g3m6zj7E2v8sKUZ7fCtevwhR3Y */(
      float var0
   ) {
      return 79g7mKiEN92CxIn61wBa31x3ni89w798oSB8h6COhDL1ai2ou1QpAIG6mNa0[(int)(var0 * 10430.378F) & 65535];
   }

   public static final float _61li9dOPwUP2ksAVd82uwv0tK0p177C92O93zXd19Xn2WedS8PtmF72EyS5/* $VF was: 561li9dOPwUP2ksAVd82uwv0tK0p177C92O93zXd19Xn2WedS8PtmF72EyS5 */(
      float var0
   ) {
      return 79g7mKiEN92CxIn61wBa31x3ni89w798oSB8h6COhDL1ai2ou1QpAIG6mNa0[(int)(var0 * 10430.378F + 16384.0F) & 65535];
   }

   public static final float _PGP6g3j7xO13J55i72sl88ibhttuF5OAfyo6ZT5cMvpcCXul7r9ubu3A19k/* $VF was: 5PGP6g3j7xO13J55i72sl88ibhttuF5OAfyo6ZT5cMvpcCXul7r9ubu3A19k */(
      float var0
   ) {
      return (float)Math.sqrt(var0);
   }

   public static final float _aR5WI1t3jsWwXG9Ug3iJRyjHSWQV70UxsG7M4F8QJ135usD9b251zV9bR96/* $VF was: 1aR5WI1t3jsWwXG9Ug3iJRyjHSWQV70UxsG7M4F8QJ135usD9b251zV9bR96 */(
      double var0
   ) {
      return (float)Math.sqrt(var0);
   }

   public static int _2Sk23MyEkPTd8Ko4KdA2R2VR4iN8L5fDJ1b0FIVM7ip7pnN4T98VBvp2FeY/* $VF was: 82Sk23MyEkPTd8Ko4KdA2R2VR4iN8L5fDJ1b0FIVM7ip7pnN4T98VBvp2FeY */(
      float var0
   ) {
      int var1 = (int)var0;
      return var0 < var1 ? var1 - 1 : var1;
   }

   public static int _1Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1/* $VF was: 51Upc78zDr5Q41l6H3jLje4hvDS6xO1S7yixkcG94plwjrC3qa02C8B74Jf1 */(
      double var0
   ) {
      int var2 = (int)var0;
      return var0 < var2 ? var2 - 1 : var2;
   }

   public static float _HAYLVP0231IA29hUY6876X2VuOIG740HrNgP43dPBP63Aio9746yQMgJYJp/* $VF was: 0HAYLVP0231IA29hUY6876X2VuOIG740HrNgP43dPBP63Aio9746yQMgJYJp */(
      float var0
   ) {
      return var0 >= 0.0F ? var0 : -var0;
   }

   public static double _UKDxHDWD3i2GnDgV6fz6i4U1xIcMOioIG09zs4ViG870iMo1HXk3D32QCxY/* $VF was: 7UKDxHDWD3i2GnDgV6fz6i4U1xIcMOioIG09zs4ViG870iMo1HXk3D32QCxY */(
      double var0, double var2
   ) {
      if (var0 < 0.0) {
         var0 = -var0;
      }

      if (var2 < 0.0) {
         var2 = -var2;
      }

      return var0 > var2 ? var0 : var2;
   }

   static {
      for (int var0 = 0; var0 < 65536; var0++) {
         79g7mKiEN92CxIn61wBa31x3ni89w798oSB8h6COhDL1ai2ou1QpAIG6mNa0[var0] = (float)Math.sin(var0 * Math.PI * 2.0 / 65536.0);
      }
   }
}
