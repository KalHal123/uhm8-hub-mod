import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;

public class bb extends Thread {
   public File a;
   private Minecraft b;
   private boolean c = false;

   public bb(File var1, Minecraft var2) {
      this.b = var2;
      this.setName("Resource download thread");
      this.setDaemon(true);
      this.a = new File(var1, "resources/");
      if (!this.a.exists() && !this.a.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + this.a);
      }
   }

   @Override
   public void run() {
      try {
         ArrayList var1 = new ArrayList();
         URL var2 = new URL("http://www.minecraft.net/resources/");
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
         String var4 = "";

         while ((var4 = var3.readLine()) != null) {
            var1.add(var4);
         }

         var3.close();

         for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < var1.size(); var6++) {
               this.a(var2, (String)var1.get(var6), var5);
               if (this.c) {
                  return;
               }
            }
         }
      } catch (IOException var7) {
         this.a(this.a, "");
         var7.printStackTrace();
      }
   }

   private void a(File var1, String var2) {
      File[] var3 = var1.listFiles();

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (var3[var4].isDirectory()) {
            this.a(var3[var4], var2 + var3[var4].getName() + "/");
         } else {
            this.b.a(var2 + var3[var4].getName(), var3[var4]);
         }
      }
   }

   private void a(URL var1, String var2, int var3) {
      try {
         String[] var4 = var2.split(",");
         String var5 = var4[0];
         int var6 = var5.indexOf("/");
         String var7 = var5.substring(0, var6);
         if (!var7.equals("sound") && !var7.equals("newsound")) {
            if (var3 != 1) {
               return;
            }
         } else if (var3 != 0) {
            return;
         }

         int var8 = Integer.parseInt(var4[1]);
         long var9 = Long.parseLong(var4[2]);
         var9 /= 2L;
         File var11 = new File(this.a, var5);
         if (!var11.exists() || var11.length() != var8) {
            var11.getParentFile().mkdirs();
            String var12 = var5.replaceAll(" ", "%20");
            this.a(new URL(var1, var12), var11, var8);
            if (this.c) {
               return;
            }
         }

         this.b.a(var5, var11);
      } catch (Exception var13) {
         var13.printStackTrace();
      }
   }

   private void a(URL var1, File var2, int var3) {
      byte[] var4 = new byte[4096];
      DataInputStream var5 = new DataInputStream(var1.openStream());
      DataOutputStream var6 = new DataOutputStream(new FileOutputStream(var2));
      int var7 = 0;

      while ((var7 = var5.read(var4)) >= 0) {
         var6.write(var4, 0, var7);
         if (this.c) {
            return;
         }
      }

      var5.close();
      var6.close();
   }

   public void a() {
      this.c = true;
   }
}
