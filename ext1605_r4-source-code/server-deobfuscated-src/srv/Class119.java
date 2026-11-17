package srv;

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

public class Class119 {
   public static String field_1026 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2Fk6C4qL9xtReaZ8ZOPgOAANgazC7BqNQZDbHWnd6+8y4QyPuwJlbkzO+DpLzLtjQsDnrCKJTmtZ5ZMf1GLyRvm45db+e1G+YjSGUzvXPIpb/x508FZPmPJBsgmdFyOAvJ7wPkRhYJ+Pz4DHzz5X6EUoM9iXVlbHNtjb41L0uKJVghFm/xXhMvRg3IIHi2ypaX0KlQcQ9kxjA2BSbDw0VXrm6OYxf4mvlaHOM/iy7LdEJm9fMJpxXaVkqaXrGU+/wdYaIOlEaibMwv8FGZAvpAhU7tN0LpZNHyP91ZCpLu6o2Hw5sBQe+0N2Gm0VKRpzA2N/2eYtmVnU1Ege1H1eswIDAQAB";
   public static PublicKey field_1472 = method_266(field_1026);
   public static PrivateKey field_754 = null;

   public static void method_586() {
      try {
         KeyPairGenerator var0 = KeyPairGenerator.getInstance("RSA");
         var0.initialize(2048, new SecureRandom());
         KeyPair var1 = var0.generateKeyPair();
         File var2 = new File("keys.txt");
         FileWriter var3 = new FileWriter(var2);
         var2.createNewFile();
         var3.write("PrivateKey: " + new String(Class29.method_205().method_839(var1.getPrivate().getEncoded())) + "\n\n###\n\n");
         var3.write("PublicKey: " + new String(Class29.method_205().method_839(var1.getPublic().getEncoded())));
         var3.flush();
         var3.close();
      } catch (NoSuchAlgorithmException var4) {
         var4.printStackTrace();
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public static void method_610() {
      field_1472 = method_266(field_1026);
      Class273.method_579("Successfully loaded publicKey");
   }

   public static PrivateKey method_275(String var0) {
      try {
         byte[] var1 = Class29.method_998().method_716(var0.getBytes());
         PKCS8EncodedKeySpec var2 = new PKCS8EncodedKeySpec(var1);
         KeyFactory var3 = KeyFactory.getInstance("RSA");
         return var3.generatePrivate(var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static PublicKey method_266(String var0) {
      try {
         byte[] var1 = Class29.method_998().method_716(var0.getBytes());
         X509EncodedKeySpec var2 = new X509EncodedKeySpec(var1);
         KeyFactory var3 = KeyFactory.getInstance("RSA");
         return var3.generatePublic(var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static String method_548(String var0, PrivateKey var1) throws Exception {
      Signature var2 = Signature.getInstance("SHA256withRSA");
      var2.initSign(var1);
      var2.update(var0.getBytes("UTF-8"));
      byte[] var3 = var2.sign();
      return Class29.method_205().method_553(var3);
   }

   public static boolean method_666(String var0, String var1) throws Exception {
      PublicKey var2 = field_1472;
      Signature var3 = Signature.getInstance("SHA256withRSA");
      var3.initVerify(var2);
      var3.update(var0.getBytes("UTF-8"));
      byte[] var4 = Class29.method_998().method_528(var1);
      return var3.verify(var4);
   }
}
