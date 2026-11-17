package ext;

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

public class Class278 {
   public static String field_910 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2Fk6C4qL9xtReaZ8ZOPgOAANgazC7BqNQZDbHWnd6+8y4QyPuwJlbkzO+DpLzLtjQsDnrCKJTmtZ5ZMf1GLyRvm45db+e1G+YjSGUzvXPIpb/x508FZPmPJBsgmdFyOAvJ7wPkRhYJ+Pz4DHzz5X6EUoM9iXVlbHNtjb41L0uKJVghFm/xXhMvRg3IIHi2ypaX0KlQcQ9kxjA2BSbDw0VXrm6OYxf4mvlaHOM/iy7LdEJm9fMJpxXaVkqaXrGU+/wdYaIOlEaibMwv8FGZAvpAhU7tN0LpZNHyP91ZCpLu6o2Hw5sBQe+0N2Gm0VKRpzA2N/2eYtmVnU1Ege1H1eswIDAQAB";
   public static PublicKey field_2754 = null;
   public static PrivateKey field_1860 = null;

   public static void method_202() {
      try {
         KeyPairGenerator var0 = KeyPairGenerator.getInstance("RSA");
         var0.initialize(2048, new SecureRandom());
         KeyPair var1 = var0.generateKeyPair();
         File var2 = new File("keys.txt");
         FileWriter var3 = new FileWriter(var2);
         var2.createNewFile();
         var3.write("PrivateKey: " + new String(Class158.method_196().method_1077(var1.getPrivate().getEncoded())) + "\n\n###\n\n");
         var3.write("PublicKey: " + new String(Class158.method_196().method_1077(var1.getPublic().getEncoded())));
         var3.flush();
         var3.close();
      } catch (NoSuchAlgorithmException var4) {
         var4.printStackTrace();
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public static void method_1490() {
      field_2754 = method_114(field_910);
      Class597.method_883("Successfully loaded publicKey");
      if (Minecraft.field_885) {
         File var0 = new File("certkey");
         if (var0.exists()) {
            try {
               BufferedReader var1 = new BufferedReader(new FileReader(var0));
               field_1860 = method_1160(var1.readLine());
               Class597.method_883("Successfully loaded private certificate");
               var1.close();
            } catch (FileNotFoundException var2) {
               var2.printStackTrace();
            } catch (IOException var3) {
               var3.printStackTrace();
            }
         }
      }
   }

   public static PrivateKey method_1160(String var0) {
      try {
         byte[] var1 = Class158.method_546().method_989(var0.getBytes());
         PKCS8EncodedKeySpec var2 = new PKCS8EncodedKeySpec(var1);
         KeyFactory var3 = KeyFactory.getInstance(Class614.method_1576(Class614.field_3030));
         return var3.generatePrivate(var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static PublicKey method_114(String var0) {
      try {
         byte[] var1 = Class158.method_546().method_989(var0.getBytes());
         X509EncodedKeySpec var2 = new X509EncodedKeySpec(var1);
         KeyFactory var3 = KeyFactory.getInstance(Class614.method_1576(Class614.field_3030));
         return var3.generatePublic(var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static String method_1644(String var0, PrivateKey var1) throws Exception {
      Signature var2 = Signature.getInstance(Class614.method_1576(Class614.field_756));
      var2.initSign(var1);
      var2.update(var0.getBytes("UTF-8"));
      byte[] var3 = var2.sign();
      return Class158.method_196().method_1822(var3);
   }

   public static boolean method_1741(String var0, String var1) throws Exception {
      PublicKey var2 = field_2754;
      Signature var3 = Signature.getInstance(Class614.method_1576(Class614.field_756));
      var3.initVerify(var2);
      var3.update(var0.getBytes("UTF-8"));
      byte[] var4 = Class158.method_546().method_1213(var1);
      return var3.verify(var4);
   }
}
