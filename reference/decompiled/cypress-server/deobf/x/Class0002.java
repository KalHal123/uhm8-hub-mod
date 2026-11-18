package x;

public class Class0002 implements Class0354 {
   private int 67vP047ByrpzSBkYncS7zn713mWduRR3Wm42I580M2273328lwkoz19EAcs8;
   private int 0JKx4Hh8Mlrn0HuQ81tEg0YPL6amjW3iGY1fJiyR9vJ1ppC15CgtO5NXyXXM;
   private Class0168[][] 5VS654gN2p99z45Q855r1DA6g604bhX92ayKsi1MigpHM7VzN7Hb9G8OYtBm;
   private Class0320 9o4Ou0iqrW74xHXksgV9KnF6vM1ISj1XMsj0fCZQg9vyVkrxds0SJQEFPgh4;

   public Class0002(Class0320 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.9o4Ou0iqrW74xHXksgV9KnF6vM1ISj1XMsj0fCZQg9vyVkrxds0SJQEFPgh4 = var1;
      this.67vP047ByrpzSBkYncS7zn713mWduRR3Wm42I580M2273328lwkoz19EAcs8 = var2 >> 4;
      this.0JKx4Hh8Mlrn0HuQ81tEg0YPL6amjW3iGY1fJiyR9vJ1ppC15CgtO5NXyXXM = var4 >> 4;
      int var8 = var5 >> 4;
      int var9 = var7 >> 4;
      this.5VS654gN2p99z45Q855r1DA6g604bhX92ayKsi1MigpHM7VzN7Hb9G8OYtBm = new Class0168[var8
         - this.67vP047ByrpzSBkYncS7zn713mWduRR3Wm42I580M2273328lwkoz19EAcs8
         + 1][var9 - this.0JKx4Hh8Mlrn0HuQ81tEg0YPL6amjW3iGY1fJiyR9vJ1ppC15CgtO5NXyXXM + 1];

      for (int var10 = this.67vP047ByrpzSBkYncS7zn713mWduRR3Wm42I580M2273328lwkoz19EAcs8; var10 <= var8; var10++) {
         for (int var11 = this.0JKx4Hh8Mlrn0HuQ81tEg0YPL6amjW3iGY1fJiyR9vJ1ppC15CgtO5NXyXXM; var11 <= var9; var11++) {
            this.5VS654gN2p99z45Q855r1DA6g604bhX92ayKsi1MigpHM7VzN7Hb9G8OYtBm[var10 - this.67vP047ByrpzSBkYncS7zn713mWduRR3Wm42I580M2273328lwkoz19EAcs8][var11
               - this.0JKx4Hh8Mlrn0HuQ81tEg0YPL6amjW3iGY1fJiyR9vJ1ppC15CgtO5NXyXXM] = var1._lURkOrwrnxlUt9stJW81lZa0E99S56Dq89L108WpO5JXd9y8oN7mRol6oYl/* $VF was: 6lURkOrwrnxlUt9stJW81lZa0E99S56Dq89L108WpO5JXd9y8oN7mRol6oYl */(
               var10, var11
            );
         }
      }
   }

   @Override
   public int _vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
      int var1, int var2, int var3
   ) {
      if (var2 < 0) {
         return 0;
      }

      if (var2 >= 128) {
         return 0;
      }

      int var4 = (var1 >> 4) - this.67vP047ByrpzSBkYncS7zn713mWduRR3Wm42I580M2273328lwkoz19EAcs8;
      int var5 = (var3 >> 4) - this.0JKx4Hh8Mlrn0HuQ81tEg0YPL6amjW3iGY1fJiyR9vJ1ppC15CgtO5NXyXXM;
      return this.5VS654gN2p99z45Q855r1DA6g604bhX92ayKsi1MigpHM7VzN7Hb9G8OYtBm[var4][var5]
         ._8JZIEJLsM01e71NJa8WD8Ri6Kn94S6l0AgH5Nq28264slgV52E34Twi7Tk0/* $VF was: 28JZIEJLsM01e71NJa8WD8Ri6Kn94S6l0AgH5Nq28264slgV52E34Twi7Tk0 */(
            var1 & 15, var2, var3 & 15
         );
   }

   @Override
   public int _z4BADvBOu05qSg8fCm44OqqwkxBL63Ss41k9p2ygFl2fSe0vW9UkbzXkBlK/* $VF was: 8z4BADvBOu05qSg8fCm44OqqwkxBL63Ss41k9p2ygFl2fSe0vW9UkbzXkBlK */(
      int var1, int var2, int var3
   ) {
      if (var2 < 0) {
         return 0;
      }

      if (var2 >= 128) {
         return 0;
      }

      int var4 = (var1 >> 4) - this.67vP047ByrpzSBkYncS7zn713mWduRR3Wm42I580M2273328lwkoz19EAcs8;
      int var5 = (var3 >> 4) - this.0JKx4Hh8Mlrn0HuQ81tEg0YPL6amjW3iGY1fJiyR9vJ1ppC15CgtO5NXyXXM;
      return this.5VS654gN2p99z45Q855r1DA6g604bhX92ayKsi1MigpHM7VzN7Hb9G8OYtBm[var4][var5]
         ._6nS2EhxDF6QLe585sCFQuib9hy8tU1SuNOL53s0vlHYM4rk82442WIe2Q7k/* $VF was: 16nS2EhxDF6QLe585sCFQuib9hy8tU1SuNOL53s0vlHYM4rk82442WIe2Q7k */(
            var1 & 15, var2, var3 & 15
         );
   }

   @Override
   public Class0112 _Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f/* $VF was: 1Q1T2QsN8KuMi82TLgH6331eG44Gag5we5DM3XH5VNLYZF5GIMGK89LBD08f */(
      int var1, int var2, int var3
   ) {
      int var4 = this._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
         var1, var2, var3
      );
      return var4 == 0
         ? Class0112.0BDwi79l75JV03j847V5W5M89bXvv1Fm3Kd0iFDN7FsccCG5y4OnquEhdy0H
         : Class0374.0DidWcu06tW7j3tRULPszw6tEv48bJ9pA7Lvh3PB3hioE18aYPyy5e24R6Rr[var4].45E0mm7ZuL8rEHaN0r4rv9u7cDqXsNkN5Ju9IYSOk67v8DlF7WI3Qak603Mx;
   }

   @Override
   public boolean _wvt10G6LTOQWg10e4E7OTEmfUP35DNrne9W9frMgo9giW36jcTg864a46D9/* $VF was: 5wvt10G6LTOQWg10e4E7OTEmfUP35DNrne9W9frMgo9giW36jcTg864a46D9 */(
      int var1, int var2, int var3
   ) {
      Class0374 var4 = Class0374.0DidWcu06tW7j3tRULPszw6tEv48bJ9pA7Lvh3PB3hioE18aYPyy5e24R6Rr[this._vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP/* $VF was: 7vQ1ewH2pSFAU4riT691eK5NS40bSPSoWgVc0009HaIGjQ4PQIqZ4O36n2uP */(
         var1, var2, var3
      )];
      return var4 == null
         ? false
         : var4._uJQSsB3u4MHyfgd1B9yq0HT2ndAt62bMlE6KwPS6u8u111L8s82i1FFp7fA/* $VF was: 4uJQSsB3u4MHyfgd1B9yq0HT2ndAt62bMlE6KwPS6u8u111L8s82i1FFp7fA */();
   }

   @Override
   public Class0214 _C9H19c7YerVndE5i8yC8Ig4845UHLtkUSjAGU517V812e99T2r6TlW67Z0B/* $VF was: 6C9H19c7YerVndE5i8yC8Ig4845UHLtkUSjAGU517V812e99T2r6TlW67Z0B */() {
      return this.9o4Ou0iqrW74xHXksgV9KnF6vM1ISj1XMsj0fCZQg9vyVkrxds0SJQEFPgh4
         ._C9H19c7YerVndE5i8yC8Ig4845UHLtkUSjAGU517V812e99T2r6TlW67Z0B/* $VF was: 6C9H19c7YerVndE5i8yC8Ig4845UHLtkUSjAGU517V812e99T2r6TlW67Z0B */();
   }
}
