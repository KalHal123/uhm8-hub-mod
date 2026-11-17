import java.util.ArrayList;

public class 0xCRO11BKqvOi9S152g5NnDP1y7Hk4L2h42UwTzWo909dtvQzpvoE4lNCkUrZ5bU123nyOiLo4dL63J683k5v0jrgxkef5
   extends 5h9aW7iFtT7oClcDT10FiIe1AdNwsJ2Y7h7oUz1h6103B1XDQlOpaO7TFsEh5c2NX5bu3syv6OW7ubLP8kJu5WVb0ON64o7427yE89 {
   public _xCRO11BKqvOi9S152g5NnDP1y7Hk4L2h42UwTzWo909dtvQzpvoE4lNCkUrZ5bU123nyOiLo4dL63J683k5v0jrgxkef5/* $VF was: 0xCRO11BKqvOi9S152g5NnDP1y7Hk4L2h42UwTzWo909dtvQzpvoE4lNCkUrZ5bU123nyOiLo4dL63J683k5v0jrgxkef5 */(
      int var1, int var2, int[] var3, 43Nc2QnnV13i1c3J76qJpd75c59A9CeY4VaW27tjdsO253ppIO6hy6AxgWx629vT375d3zh7lZ88397172uLJF8jexQRex var4
   ) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean _zDvxlifg2v7M5mTzZ01U8Hp5GK4vFsG10Itf2n8bAGupn8K0EATYPc9Gv8n/* $VF was: 8zDvxlifg2v7M5mTzZ01U8Hp5GK4vFsG10Itf2n8bAGupn8K0EATYPc9Gv8n */(
      int[] var1
   ) {
      ArrayList var2 = new ArrayList();

      for (int var6 : this.4bJH090TU6D4pW1r0aTNZ8EtLu5uO3Nx9mVoi9mh84hkOOlS5aO07wsp6al1) {
         if (var6 != -1) {
            var2.add(var6);
         }
      }

      for (int var10 : var1) {
         if (var10 != -1) {
            if (var2.size() == 0) {
               return false;
            }

            if (var2.contains(var10)) {
               var2.remove(Integer.valueOf(var10));
            }
         }
      }

      return var2.size() == 0;
   }
}
