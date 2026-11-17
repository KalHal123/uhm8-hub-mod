package ext;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import net.minecraft.client.Minecraft;

public class Thread62 extends Thread {
   public File field_1784;
   private Minecraft field_3104;
   private boolean field_3053 = false;
   public static boolean field_221 = false;
   public static int field_216 = 0;
   public static int field_2752 = 100;

   public Thread62(File var1, Minecraft var2) {
      this.field_3104 = var2;
      this.setName("Resource download thread");
      this.setDaemon(true);
      this.field_1784 = new File(var1, "resources/");
      if (!this.field_1784.exists() && !this.field_1784.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + this.field_1784);
      }
   }

   void method_1722(Path var1) throws IOException {
      SimpleFileVisitor var2 = new SimpleFileVisitor<Path>() {
         public FileVisitResult method_565(Path var1, BasicFileAttributes var2x) throws IOException {
            Files.delete(var1);
            return FileVisitResult.CONTINUE;
         }

         public FileVisitResult method_415(Path var1, IOException var2x) throws IOException {
            Files.delete(var1);
            return FileVisitResult.CONTINUE;
         }

         public FileVisitResult method_1276(Path var1, IOException var2x) throws IOException {
            if (var2x != null) {
               throw var2x;
            }

            Files.delete(var1);
            return FileVisitResult.CONTINUE;
         }
      };
      Files.walkFileTree(var1, var2);
   }

   public void method_1256(BufferedReader var1) throws IOException {
      String var2;
      while ((var2 = var1.readLine()) != null) {
         if (var2 != "") {
            String var3 = var2.replace("worldstatic", "saves").replace("sounddata", "resources");
            InputStream var4 = Class100.method_1145(var2);
            File var5 = new File(Minecraft.method_1379(), var3);
            var5.mkdirs();
            Files.copy(var4, Paths.get(var5.toString()), StandardCopyOption.REPLACE_EXISTING);
            var4.close();
         }
      }

      System.out.println("Resources unpacked");
      var1.close();
   }

   @Override
   public void run() {
      try {
         if (!new File(Minecraft.method_1379(), "/resources/contentversion-1d").exists()) {
            try {
               this.method_1722(Paths.get(Minecraft.method_1379() + "/resources/"));
               this.field_1784.mkdirs();
            } catch (Exception var28) {
               System.out.println("Error removing existing resources...");
            }

            InputStream var1 = Class100.method_1145("/soundres.txt");

            try {
               BufferedReader var2 = new BufferedReader(new InputStreamReader(var1));
               this.method_1256(var2);
            } catch (Exception var26) {
               var26.printStackTrace();
            } finally {
               var1.close();
            }

            if (!new File(Minecraft.method_1379(), "/saves/freerun/WorldFreerun0").exists()
               || !new File(Minecraft.method_1379(), "/saves/freerun/WorldFreerun1").exists()
               || !new File(Minecraft.method_1379(), "/saves/freerun/WorldFreerun2").exists()
               || !new File(Minecraft.method_1379(), "/saves/freerun/WorldFreerun3").exists()
               || !new File(Minecraft.method_1379(), "/saves/freerun/WorldFreerun4").exists()
               || !new File(Minecraft.method_1379(), "/saves/freerun/WorldFreerun5").exists()
               || !new File(Minecraft.method_1379(), "/saves/freerun/WorldZM1").exists()
               || !new File(Minecraft.method_1379(), "/saves/zombies/WorldZM2").exists()) {
               ZipInputStream var31 = new ZipInputStream(Class100.method_1145("/wstatic.zip"));

               while (var31.getNextEntry() != null) {
                  field_2752++;
               }

               field_2752 -= 100;
               var31.close();
               ZipInputStream var3 = new ZipInputStream(Class100.method_1145("/wstatic.zip"));

               for (ZipEntry var4 = var3.getNextEntry(); var4 != null; var4 = var3.getNextEntry()) {
                  if (!var4.isDirectory()) {
                     String var5 = var4.getName();
                     if (var5.contains("/")) {
                        String var6 = var5.substring(0, var5.lastIndexOf("/"));
                        new File(Minecraft.method_1379(), "/saves/" + var6).mkdirs();
                     }

                     Class597.method_883("Unpacking to " + Minecraft.method_1379().toString() + "/saves/" + var5);
                     FileOutputStream var32 = new FileOutputStream(Minecraft.method_1379().toString() + "/saves/" + var5);
                     byte[] var7 = new byte[1024];

                     int var8;
                     while ((var8 = var3.read(var7)) >= 0) {
                        var32.write(var7, 0, var8);
                     }

                     var32.close();
                  }

                  field_216++;
               }

               var3.close();
            }

            new File(Minecraft.method_1379() + "/resources/contentversion-1d").createNewFile();
         }
      } catch (Exception var29) {
         var29.printStackTrace();
      } finally {
         this.method_657(this.field_1784, "");
         field_221 = true;

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var25) {
         }

         if (Class119.field_1519.field_2648 == null && Class53.field_1690 != null && !Class53.field_1690.playing("BgMusic")) {
            Class119.field_1519.field_485.method_963("mainmenu", true);
         }
      }
   }

   public void method_924() {
      this.method_657(this.field_1784, "");
   }

   private void method_657(File var1, String var2) {
      File[] var3 = var1.listFiles();

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (var3[var4].isDirectory()) {
            this.method_657(var3[var4], var2 + var3[var4].getName() + "/");
         } else {
            try {
               this.field_3104.method_1214(var2 + var3[var4].getName(), var3[var4]);
            } catch (Exception var6) {
               System.out.println("Failed to add " + var2 + var3[var4].getName());
               var6.printStackTrace();
            }
         }
      }
   }

   private void method_1335(URL var1, String var2, long var3, int var5) {
      try {
         int var6 = var2.indexOf("/");
         String var7 = var2.substring(0, var6);
         if (!var7.equals("sound") && !var7.equals("newsound")) {
            if (var5 != 1) {
               return;
            }
         } else if (var5 != 0) {
            return;
         }

         File var8 = new File(this.field_1784, var2);
         if (!var8.exists() || var8.length() != var3) {
            var8.getParentFile().mkdirs();
            String var9 = var2.replaceAll(" ", "%20");
            this.method_69(new URL(var1, var9), var8, var3);
            if (this.field_3053) {
               return;
            }
         }

         this.field_3104.method_1214(var2, var8);
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

   private void method_69(URL var1, File var2, long var3) throws IOException {
      byte[] var5 = new byte[4096];
      DataInputStream var6 = new DataInputStream(var1.openStream());
      DataOutputStream var7 = new DataOutputStream(new FileOutputStream(var2));
      boolean var8 = false;

      int var9;
      while ((var9 = var6.read(var5)) >= 0) {
         var7.write(var5, 0, var9);
         if (this.field_3053) {
            return;
         }
      }

      var6.close();
      var7.close();
   }

   public void method_1924() {
      this.field_3053 = true;
   }
}
