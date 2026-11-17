import java.io.File;
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

public class 311wCFL0Ca4S9L7A3G9Dq3bq0E1KhQkg7f6kD77UqZUr5o0y31NbGPJZxNe7POSOmqmWea5uaBQ3zxgdbL1G6t3cUssGADr31ICGni3Np {
   public static String 6JtTIY8el80x677WYqTK0r4ma2Tk5JiH6qlVwbj5EwuUGhG5GFc8TL57E3PP = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2Fk6C4qL9xtReaZ8ZOPgOAANgazC7BqNQZDbHWnd6+8y4QyPuwJlbkzO+DpLzLtjQsDnrCKJTmtZ5ZMf1GLyRvm45db+e1G+YjSGUzvXPIpb/x508FZPmPJBsgmdFyOAvJ7wPkRhYJ+Pz4DHzz5X6EUoM9iXVlbHNtjb41L0uKJVghFm/xXhMvRg3IIHi2ypaX0KlQcQ9kxjA2BSbDw0VXrm6OYxf4mvlaHOM/iy7LdEJm9fMJpxXaVkqaXrGU+/wdYaIOlEaibMwv8FGZAvpAhU7tN0LpZNHyP91ZCpLu6o2Hw5sBQe+0N2Gm0VKRpzA2N/2eYtmVnU1Ege1H1eswIDAQAB";
   public static PublicKey 95WwtH47P373DH049epm7I3f5EN9VVD439rILU2wPSV9u5AuZ06gN9XJwNkf = _o0PuyPFyY8abCo36AJYKRYU9O552m81Q1fodQ574v997mo0496B23h6sO1g/* $VF was: 2o0PuyPFyY8abCo36AJYKRYU9O552m81Q1fodQ574v997mo0496B23h6sO1g */(
      6JtTIY8el80x677WYqTK0r4ma2Tk5JiH6qlVwbj5EwuUGhG5GFc8TL57E3PP
   );
   public static PrivateKey 4kJqk6Sw2G6bzwj1u752cauoix8JZJoAa9XyWy46m95sx3nW1Oqx4ep9Fl40 = null;

   public static void _lDs8QYnHlDPQ985h338GV5WTCOz7Lxni9WG4BDU23jgW81rpRR04JsW6wLy/* $VF was: 5lDs8QYnHlDPQ985h338GV5WTCOz7Lxni9WG4BDU23jgW81rpRR04JsW6wLy */() {
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
                  30wnhmKwxoMRXnyYAscSzPP7I9LT1j90XZ57kCs5jaOFBUdDG7u1rItz5l8r40Q5Yg11F9V4H5x4U4CJsNt707s34IV65qs._406HU9cDSG5fO04TVhk2oqeHh6YV8dt6W20ZgNL3D2dK5W2br55hAkP8002/* $VF was: 2406HU9cDSG5fO04TVhk2oqeHh6YV8dt6W20ZgNL3D2dK5W2br55hAkP8002 */()
                     ._56jBm0m8yS5Z227c06bSjMvweC8Rgh3SE07QtP622Nla1TXv17lc20xvh4L/* $VF was: 856jBm0m8yS5Z227c06bSjMvweC8Rgh3SE07QtP622Nla1TXv17lc20xvh4L */(
                        var1.getPrivate().getEncoded()
                     )
               )
               + "\n\n###\n\n"
         );
         var3.write(
            "PublicKey: "
               + new String(
                  30wnhmKwxoMRXnyYAscSzPP7I9LT1j90XZ57kCs5jaOFBUdDG7u1rItz5l8r40Q5Yg11F9V4H5x4U4CJsNt707s34IV65qs._406HU9cDSG5fO04TVhk2oqeHh6YV8dt6W20ZgNL3D2dK5W2br55hAkP8002/* $VF was: 2406HU9cDSG5fO04TVhk2oqeHh6YV8dt6W20ZgNL3D2dK5W2br55hAkP8002 */()
                     ._56jBm0m8yS5Z227c06bSjMvweC8Rgh3SE07QtP622Nla1TXv17lc20xvh4L/* $VF was: 856jBm0m8yS5Z227c06bSjMvweC8Rgh3SE07QtP622Nla1TXv17lc20xvh4L */(
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

   public static void _0gUtkzmf7oMz8pzg846m3M25Bw33v35I7O0IpLeFvf8K1AQQCOh3oxR8p1s/* $VF was: 60gUtkzmf7oMz8pzg846m3M25Bw33v35I7O0IpLeFvf8K1AQQCOh3oxR8p1s */() {
      95WwtH47P373DH049epm7I3f5EN9VVD439rILU2wPSV9u5AuZ06gN9XJwNkf = _o0PuyPFyY8abCo36AJYKRYU9O552m81Q1fodQ574v997mo0496B23h6sO1g/* $VF was: 2o0PuyPFyY8abCo36AJYKRYU9O552m81Q1fodQ574v997mo0496B23h6sO1g */(
         6JtTIY8el80x677WYqTK0r4ma2Tk5JiH6qlVwbj5EwuUGhG5GFc8TL57E3PP
      );
      75ZwJJ68BKYNgk1NoFOC8t22qAdH987l4Q4jDl14x90TQrNjUeyE02W7U1a3u5T3SumS33dRMKQ3XmqE5q99p18I12vrA._hp51J9oi1HB7C6lUc0bickPd39J45U25cYXXjxpkx3hl9cejV51iSo8dAvv/* $VF was: 5hp51J9oi1HB7C6lUc0bickPd39J45U25cYXXjxpkx3hl9cejV51iSo8dAvv */(
         "Successfully loaded publicKey"
      );
   }

   public static PrivateKey _vfXv14kMPPKVsL261BrXy62q6RP7ZfUFDW7O7u21ws3W0A00hWt4U65JFae/* $VF was: 2vfXv14kMPPKVsL261BrXy62q6RP7ZfUFDW7O7u21ws3W0A00hWt4U65JFae */(
      String var0
   ) {
      try {
         byte[] var1 = 30wnhmKwxoMRXnyYAscSzPP7I9LT1j90XZ57kCs5jaOFBUdDG7u1rItz5l8r40Q5Yg11F9V4H5x4U4CJsNt707s34IV65qs._aIc4j3Ga1U6Ac66XcJYU605ny3egEfT8u7EltL85Sp4345c9V8QEh4iwePs/* $VF was: 9aIc4j3Ga1U6Ac66XcJYU605ny3egEfT8u7EltL85Sp4345c9V8QEh4iwePs */()
            ._0A8eWjC390z9eTyeFzzovuu718TjGr22x9Vhgof4ztVXtRQv67DQi49a84Z/* $VF was: 70A8eWjC390z9eTyeFzzovuu718TjGr22x9Vhgof4ztVXtRQv67DQi49a84Z */(
               var0.getBytes()
            );
         PKCS8EncodedKeySpec var2 = new PKCS8EncodedKeySpec(var1);
         KeyFactory var3 = KeyFactory.getInstance("RSA");
         return var3.generatePrivate(var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static PublicKey _o0PuyPFyY8abCo36AJYKRYU9O552m81Q1fodQ574v997mo0496B23h6sO1g/* $VF was: 2o0PuyPFyY8abCo36AJYKRYU9O552m81Q1fodQ574v997mo0496B23h6sO1g */(
      String var0
   ) {
      try {
         byte[] var1 = 30wnhmKwxoMRXnyYAscSzPP7I9LT1j90XZ57kCs5jaOFBUdDG7u1rItz5l8r40Q5Yg11F9V4H5x4U4CJsNt707s34IV65qs._aIc4j3Ga1U6Ac66XcJYU605ny3egEfT8u7EltL85Sp4345c9V8QEh4iwePs/* $VF was: 9aIc4j3Ga1U6Ac66XcJYU605ny3egEfT8u7EltL85Sp4345c9V8QEh4iwePs */()
            ._0A8eWjC390z9eTyeFzzovuu718TjGr22x9Vhgof4ztVXtRQv67DQi49a84Z/* $VF was: 70A8eWjC390z9eTyeFzzovuu718TjGr22x9Vhgof4ztVXtRQv67DQi49a84Z */(
               var0.getBytes()
            );
         X509EncodedKeySpec var2 = new X509EncodedKeySpec(var1);
         KeyFactory var3 = KeyFactory.getInstance("RSA");
         return var3.generatePublic(var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static String _L85H75Fy80GLZnBrCaD19X223s4MQFO2gjs22F3Z407b63lR9en2DePwZ42/* $VF was: 5L85H75Fy80GLZnBrCaD19X223s4MQFO2gjs22F3Z407b63lR9en2DePwZ42 */(
      String var0, PrivateKey var1
   ) throws Exception {
      Signature var2 = Signature.getInstance("SHA256withRSA");
      var2.initSign(var1);
      var2.update(var0.getBytes("UTF-8"));
      byte[] var3 = var2.sign();
      return 30wnhmKwxoMRXnyYAscSzPP7I9LT1j90XZ57kCs5jaOFBUdDG7u1rItz5l8r40Q5Yg11F9V4H5x4U4CJsNt707s34IV65qs._406HU9cDSG5fO04TVhk2oqeHh6YV8dt6W20ZgNL3D2dK5W2br55hAkP8002/* $VF was: 2406HU9cDSG5fO04TVhk2oqeHh6YV8dt6W20ZgNL3D2dK5W2br55hAkP8002 */()
         ._Nzb0CySIEgmuKNQjZFdMAYFow7Op4BBgCRh4KEgPxQBBxW18a0bhp204jrJ/* $VF was: 5Nzb0CySIEgmuKNQjZFdMAYFow7Op4BBgCRh4KEgPxQBBxW18a0bhp204jrJ */(var3);
   }

   public static boolean _OfHhn9v2QaKdhhN1zMTRhrYM034Vxw802JQPk3uy59bG5aRV0VLmj5RuusN/* $VF was: 6OfHhn9v2QaKdhhN1zMTRhrYM034Vxw802JQPk3uy59bG5aRV0VLmj5RuusN */(
      String var0, String var1
   ) throws Exception {
      PublicKey var2 = 95WwtH47P373DH049epm7I3f5EN9VVD439rILU2wPSV9u5AuZ06gN9XJwNkf;
      Signature var3 = Signature.getInstance("SHA256withRSA");
      var3.initVerify(var2);
      var3.update(var0.getBytes("UTF-8"));
      byte[] var4 = 30wnhmKwxoMRXnyYAscSzPP7I9LT1j90XZ57kCs5jaOFBUdDG7u1rItz5l8r40Q5Yg11F9V4H5x4U4CJsNt707s34IV65qs._aIc4j3Ga1U6Ac66XcJYU605ny3egEfT8u7EltL85Sp4345c9V8QEh4iwePs/* $VF was: 9aIc4j3Ga1U6Ac66XcJYU605ny3egEfT8u7EltL85Sp4345c9V8QEh4iwePs */()
         ._94G305vP5s5r5U6s8pchMZsC47Q3T85Z2beGGUwZ36H2j6b0oMcJjyV0f48/* $VF was: 594G305vP5s5r5U6s8pchMZsC47Q3T85Z2beGGUwZ36H2j6b0oMcJjyV0f48 */(var1);
      return var3.verify(var4);
   }
}
