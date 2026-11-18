import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import net.minecraft.client.Minecraft;

public class 3TRs4A75rS0TtcUL36iKx34E6k4NB1XXM6i8cs9Khd3OUdqLNT1q99wqrgwtn53Nk1LerxKV5f8Dlt8MOX4uKK6df8l {
   public static String 2ld2J4Xm25O4RRMB9gI4j3rL8t1doco4pjb2q097D6X869h0F0eT432ZBzMi = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2Fk6C4qL9xtReaZ8ZOPgOAANgazC7BqNQZDbHWnd6+8y4QyPuwJlbkzO+DpLzLtjQsDnrCKJTmtZ5ZMf1GLyRvm45db+e1G+YjSGUzvXPIpb/x508FZPmPJBsgmdFyOAvJ7wPkRhYJ+Pz4DHzz5X6EUoM9iXVlbHNtjb41L0uKJVghFm/xXhMvRg3IIHi2ypaX0KlQcQ9kxjA2BSbDw0VXrm6OYxf4mvlaHOM/iy7LdEJm9fMJpxXaVkqaXrGU+/wdYaIOlEaibMwv8FGZAvpAhU7tN0LpZNHyP91ZCpLu6o2Hw5sBQe+0N2Gm0VKRpzA2N/2eYtmVnU1Ege1H1eswIDAQAB";
   public static PublicKey 8fWA5xW68v3c3otZuNHf4trgarlAHnP4FdxcmBHl3QMo1POyfJ4Ek68oWnok = null;
   public static PrivateKey 5lX8X5yivf7DSGr0s2G13Eu4UeF1813nrrHhGM1pL8m1fFm44I8s6apKHz60 = null;

   public static void _14vpf8jQ7086H5UTmHIiif0EbZ2WMlMqH4p200TtrxY0eonjv525vE2KiaY/* $VF was: 114vpf8jQ7086H5UTmHIiif0EbZ2WMlMqH4p200TtrxY0eonjv525vE2KiaY */() {
      try {
         KeyPairGenerator var0 = KeyPairGenerator.getInstance("RSA");
         var0.initialize(2048, new SecureRandom());
         KeyPair var1 = var0.generateKeyPair();
         File var2 = new File("keys.txt");
         FileWriter var3 = new FileWriter(var2);
         var2.createNewFile();
         var3.write(
            "PrivateKey: "
               + new String(
                  22Js6s1u298u12M8e4IupOspAOeP956ozrdjYwROLJciVjw0676U873tgK5RqPbjMa55E33r4098R629L3P40wTC11zMe4s8UH._04d9206rb9c6pY7g6g4PGr0wLKBw0WL971xP3AM2iQUs5WJvyIwXuAvPYKb/* $VF was: 104d9206rb9c6pY7g6g4PGr0wLKBw0WL971xP3AM2iQUs5WJvyIwXuAvPYKb */()
                     ._S51f7pBR37X014z1C88yXSc4qlVK7AMn5y7N6r9PnJemIuj61ecZ2KvXt5O/* $VF was: 5S51f7pBR37X014z1C88yXSc4qlVK7AMn5y7N6r9PnJemIuj61ecZ2KvXt5O */(
                        var1.getPrivate().getEncoded()
                     )
               )
               + "\n\n###\n\n"
         );
         var3.write(
            "PublicKey: "
               + new String(
                  22Js6s1u298u12M8e4IupOspAOeP956ozrdjYwROLJciVjw0676U873tgK5RqPbjMa55E33r4098R629L3P40wTC11zMe4s8UH._04d9206rb9c6pY7g6g4PGr0wLKBw0WL971xP3AM2iQUs5WJvyIwXuAvPYKb/* $VF was: 104d9206rb9c6pY7g6g4PGr0wLKBw0WL971xP3AM2iQUs5WJvyIwXuAvPYKb */()
                     ._S51f7pBR37X014z1C88yXSc4qlVK7AMn5y7N6r9PnJemIuj61ecZ2KvXt5O/* $VF was: 5S51f7pBR37X014z1C88yXSc4qlVK7AMn5y7N6r9PnJemIuj61ecZ2KvXt5O */(
                        var1.getPublic().getEncoded()
                     )
               )
         );
         var3.flush();
         var3.close();
      } catch (NoSuchAlgorithmException var4) {
         var4.printStackTrace();
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public static void _hKz29573Jaa5UbdBUO62AMdK7P7QRvU7SN1pm7079Xy8LO5X92V7L75dK81/* $VF was: 7hKz29573Jaa5UbdBUO62AMdK7P7QRvU7SN1pm7079Xy8LO5X92V7L75dK81 */() {
      8fWA5xW68v3c3otZuNHf4trgarlAHnP4FdxcmBHl3QMo1POyfJ4Ek68oWnok = _Syjah038YmmTWGCAgKnt7ARnLqx1rq1nsEB8XedJKcoA6LQnYx49dRw2oDG/* $VF was: 0Syjah038YmmTWGCAgKnt7ARnLqx1rq1nsEB8XedJKcoA6LQnYx49dRw2oDG */(
         2ld2J4Xm25O4RRMB9gI4j3rL8t1doco4pjb2q097D6X869h0F0eT432ZBzMi
      );
      7l2e0fYR96rf6dpREUY30xWh65d1rOc3abJQrqtvYEW6GNMN9qeJW237wlzS37y9Xt8xV209FRDRzpsI4HOsGN7skzB8a0._TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F/* $VF was: 4TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F */(
         "Successfully loaded publicKey"
      );
      if (Minecraft.2fGqlLCGz9Ni98BW95R0TU06rypdms9i1tU8g6lfnFZk9q2e9XO9ZGY8Wn05) {
         File var0 = new File("certkey");
         if (var0.exists()) {
            try {
               BufferedReader var1 = new BufferedReader(new FileReader(var0));
               5lX8X5yivf7DSGr0s2G13Eu4UeF1813nrrHhGM1pL8m1fFm44I8s6apKHz60 = _0kt70vW6ioJ3oqaBRnDgd42GP5jp2iUvEYyxN10bQW24oYV49L0b61xpG76/* $VF was: 60kt70vW6ioJ3oqaBRnDgd42GP5jp2iUvEYyxN10bQW24oYV49L0b61xpG76 */(
                  var1.readLine()
               );
               7l2e0fYR96rf6dpREUY30xWh65d1rOc3abJQrqtvYEW6GNMN9qeJW237wlzS37y9Xt8xV209FRDRzpsI4HOsGN7skzB8a0._TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F/* $VF was: 4TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F */(
                  "Successfully loaded private certificate"
               );
               var1.close();
            } catch (FileNotFoundException var2) {
               var2.printStackTrace();
            } catch (IOException var3) {
               var3.printStackTrace();
            }
         }
      }
   }

   public static PrivateKey _0kt70vW6ioJ3oqaBRnDgd42GP5jp2iUvEYyxN10bQW24oYV49L0b61xpG76/* $VF was: 60kt70vW6ioJ3oqaBRnDgd42GP5jp2iUvEYyxN10bQW24oYV49L0b61xpG76 */(
      String var0
   ) {
      try {
         byte[] var1 = 22Js6s1u298u12M8e4IupOspAOeP956ozrdjYwROLJciVjw0676U873tgK5RqPbjMa55E33r4098R629L3P40wTC11zMe4s8UH._k2fRhB2yr4FTFx3ya66v1asa6Nww7QGqU190H24B6OS8gJBX6IFwkk8RFYJ/* $VF was: 2k2fRhB2yr4FTFx3ya66v1asa6Nww7QGqU190H24B6OS8gJBX6IFwkk8RFYJ */()
            ._40vU6n9japX60Kib127qaaa2H9CJ68P4evx40y43jiov22Z9n7381qtjcdo/* $VF was: 540vU6n9japX60Kib127qaaa2H9CJ68P4evx40y43jiov22Z9n7381qtjcdo */(
               var0.getBytes()
            );
         PKCS8EncodedKeySpec var2 = new PKCS8EncodedKeySpec(var1);
         KeyFactory var3 = KeyFactory.getInstance(
            7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
               7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.9Z0Rf0DDC0E00xcydj7892e71E4s1cG5iX42294z122jeMAG69D8995634eb
            )
         );
         return var3.generatePrivate(var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static PublicKey _Syjah038YmmTWGCAgKnt7ARnLqx1rq1nsEB8XedJKcoA6LQnYx49dRw2oDG/* $VF was: 0Syjah038YmmTWGCAgKnt7ARnLqx1rq1nsEB8XedJKcoA6LQnYx49dRw2oDG */(
      String var0
   ) {
      try {
         byte[] var1 = 22Js6s1u298u12M8e4IupOspAOeP956ozrdjYwROLJciVjw0676U873tgK5RqPbjMa55E33r4098R629L3P40wTC11zMe4s8UH._k2fRhB2yr4FTFx3ya66v1asa6Nww7QGqU190H24B6OS8gJBX6IFwkk8RFYJ/* $VF was: 2k2fRhB2yr4FTFx3ya66v1asa6Nww7QGqU190H24B6OS8gJBX6IFwkk8RFYJ */()
            ._40vU6n9japX60Kib127qaaa2H9CJ68P4evx40y43jiov22Z9n7381qtjcdo/* $VF was: 540vU6n9japX60Kib127qaaa2H9CJ68P4evx40y43jiov22Z9n7381qtjcdo */(
               var0.getBytes()
            );
         X509EncodedKeySpec var2 = new X509EncodedKeySpec(var1);
         KeyFactory var3 = KeyFactory.getInstance(
            7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
               7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.9Z0Rf0DDC0E00xcydj7892e71E4s1cG5iX42294z122jeMAG69D8995634eb
            )
         );
         return var3.generatePublic(var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static String _K1P472wUu8B0s89g2ZZ6Qn9pn5bZzk2gP3rg589enPD1Im9FYHL53OgM5K6/* $VF was: 8K1P472wUu8B0s89g2ZZ6Qn9pn5bZzk2gP3rg589enPD1Im9FYHL53OgM5K6 */(
      String var0, PrivateKey var1
   ) throws Exception {
      Signature var2 = Signature.getInstance(
         7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
            7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.29dm1e3GNDeOTZqsS1t29B2w34ks2F6TVj4W2QNMh33p0qFqKW79YSp421af
         )
      );
      var2.initSign(var1);
      var2.update(var0.getBytes("UTF-8"));
      byte[] var3 = var2.sign();
      return 22Js6s1u298u12M8e4IupOspAOeP956ozrdjYwROLJciVjw0676U873tgK5RqPbjMa55E33r4098R629L3P40wTC11zMe4s8UH._04d9206rb9c6pY7g6g4PGr0wLKBw0WL971xP3AM2iQUs5WJvyIwXuAvPYKb/* $VF was: 104d9206rb9c6pY7g6g4PGr0wLKBw0WL971xP3AM2iQUs5WJvyIwXuAvPYKb */()
         ._BR3TbulAgQTzld2zEkBBgF9Y0r2yjOQu2gZDfralDz6N7sn3KCOkK5v59ZS/* $VF was: 9BR3TbulAgQTzld2zEkBBgF9Y0r2yjOQu2gZDfralDz6N7sn3KCOkK5v59ZS */(var3);
   }

   public static boolean _s2o5kgQR2KUW7HYNe66V6nvFcbh46mjpeKP79Ox3XiV7okbLUZKWede01qz/* $VF was: 8s2o5kgQR2KUW7HYNe66V6nvFcbh46mjpeKP79Ox3XiV7okbLUZKWede01qz */(
      String var0, String var1
   ) throws Exception {
      PublicKey var2 = 8fWA5xW68v3c3otZuNHf4trgarlAHnP4FdxcmBHl3QMo1POyfJ4Ek68oWnok;
      Signature var3 = Signature.getInstance(
         7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
            7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.29dm1e3GNDeOTZqsS1t29B2w34ks2F6TVj4W2QNMh33p0qFqKW79YSp421af
         )
      );
      var3.initVerify(var2);
      var3.update(var0.getBytes("UTF-8"));
      byte[] var4 = 22Js6s1u298u12M8e4IupOspAOeP956ozrdjYwROLJciVjw0676U873tgK5RqPbjMa55E33r4098R629L3P40wTC11zMe4s8UH._k2fRhB2yr4FTFx3ya66v1asa6Nww7QGqU190H24B6OS8gJBX6IFwkk8RFYJ/* $VF was: 2k2fRhB2yr4FTFx3ya66v1asa6Nww7QGqU190H24B6OS8gJBX6IFwkk8RFYJ */()
         ._9du6mxAN13BQ2ZXSa1JmRasDGeFKVyQ91284H6WpFZ517VYmqGs2dTXdEU5/* $VF was: 69du6mxAN13BQ2ZXSa1JmRasDGeFKVyQ91284H6WpFZ517VYmqGs2dTXdEU5 */(var1);
      return var3.verify(var4);
   }
}
