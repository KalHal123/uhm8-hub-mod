package ext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class Class660 implements Interface269 {
   private File field_1445;
   private boolean field_314;

   public Class660(File var1, boolean var2) {
      this.field_1445 = var1;
      this.field_314 = var2;
   }

   private File method_724(int var1, int var2) {
      String var3 = "c." + Integer.toString(var1, 36) + "." + Integer.toString(var2, 36) + ".dat";
      String var4 = Integer.toString(var1 & 63, 36);
      String var5 = Integer.toString(var2 & 63, 36);
      File var6 = new File(this.field_1445, var4);
      if (!var6.exists()) {
         if (!this.field_314) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var5);
      if (!var6.exists()) {
         if (!this.field_314) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var3);
      return !var6.exists() && !this.field_314 ? null : var6;
   }

   @Override
   public Class741 method_685(Class454 var1, int var2, int var3) {
      File var4 = this.method_724(var2, var3);
      if (var4 != null && var4.exists()) {
         try {
            FileInputStream var5 = new FileInputStream(var4);
            Class686 var6 = Class679.method_157(var5);
            if (!var6.method_1838("Level")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
               return null;
            }

            if (!var6.method_508("Level").method_1838("Blocks")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
               return null;
            }

            Class741 var7 = method_917(var1, var6.method_508("Level"));
            if (!var7.method_512(var2, var3)) {
               System.out
                  .println(
                     "Chunk file at "
                        + var2
                        + ","
                        + var3
                        + " is in the wrong location; relocating. (Expected "
                        + var2
                        + ", "
                        + var3
                        + ", got "
                        + var7.field_976
                        + ", "
                        + var7.field_3158
                        + ")"
                  );
               var6.method_1310("xPos", var2);
               var6.method_1310("zPos", var3);
               var7 = method_917(var1, var6.method_508("Level"));
            }

            return var7;
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      return null;
   }

   @Override
   public void method_1370(Class454 var1, Class741 var2) {
      var1.method_1863();
      File var3 = this.method_724(var2.field_976, var2.field_3158);
      if (var3.exists()) {
         var1.field_1711 = var1.field_1711 - var3.length();
      }

      try {
         Random var4 = new Random();
         File var5 = new File(this.field_1445, "tmp_chunk" + var4.nextLong() + "" + var4.nextLong() + ".dat");
         FileOutputStream var6 = new FileOutputStream(var5);
         Class686 var7 = new Class686();
         Class686 var8 = new Class686();
         var7.method_936("Level", var8);
         this.method_1908(var2, var1, var8);
         Class679.method_1635(var7, var6);
         var6.close();
         if (var3.exists()) {
            var3.delete();
         }

         var5.renameTo(var3);
         var1.field_1711 = var1.field_1711 + var3.length();
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }

   public void method_1908(Class741 var1, Class454 var2, Class686 var3) {
      var2.method_1863();
      var3.method_1310("xPos", var1.field_976);
      var3.method_1310("zPos", var1.field_3158);
      var3.method_1647("LastUpdate", var2.field_2075);
      var3.method_1602("Blocks", var1.field_2711);
      var3.method_1602("Data", var1.field_2621.field_932);
      var3.method_1602("SkyLight", var1.field_1427.field_932);
      var3.method_1602("BlockLight", var1.field_1414.field_932);
      var3.method_1602("HeightMap", var1.field_2623);
      var3.method_698("TerrainPopulated", var1.field_558);
      var1.field_834 = false;
      Class378 var4 = new Class378();

      for (int var6 = 0; var6 < var1.field_2885.length; var6++) {
         for (Class359 var8 : var1.field_2885[var6]) {
            var1.field_834 = true;
            Class686 var5 = new Class686();
            if (var8.method_627(var5)) {
               var4.method_1885(var5);
            }
         }
      }

      var3.method_936("Entities", var4);
      Class378 var10 = new Class378();

      for (Class186 var12 : var1.field_2896.values()) {
         Class686 var9 = new Class686();
         var12.method_1623(var9);
         var10.method_1885(var9);
      }

      var3.method_936("TileEntities", var10);
   }

   public static Class741 method_917(Class454 var0, Class686 var1) {
      int var2 = var1.method_1747("xPos");
      int var3 = var1.method_1747("zPos");
      Class741 var4 = new Class741(var0, var2, var3);
      var4.field_2711 = var1.method_1699("Blocks");
      var4.field_2621 = new Class129(var1.method_1699("Data"));
      var4.field_1427 = new Class129(var1.method_1699("SkyLight"));
      var4.field_1414 = new Class129(var1.method_1699("BlockLight"));
      var4.field_2623 = var1.method_1699("HeightMap");
      var4.field_558 = var1.method_1336("TerrainPopulated");
      if (!var4.field_2621.method_507()) {
         var4.field_2621 = new Class129(var4.field_2711.length);
      }

      if (var4.field_2623 == null || !var4.field_1427.method_507()) {
         var4.field_2623 = new byte[256];
         var4.field_1427 = new Class129(var4.field_2711.length);
         var4.method_1475();
      }

      if (!var4.field_1414.method_507()) {
         var4.field_1414 = new Class129(var4.field_2711.length);
         var4.method_79();
      }

      Class378 var5 = var1.method_1609("Entities");
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.method_619(); var6++) {
            Class686 var7 = (Class686)var5.method_1557(var6);
            Class359 var8 = Class174.method_1685(var7, var0);
            var4.field_834 = true;
            if (var8 != null) {
               var4.method_76(var8);
            }
         }
      }

      Class378 var10 = var1.method_1609("TileEntities");
      if (var10 != null) {
         for (int var11 = 0; var11 < var10.method_619(); var11++) {
            Class686 var12 = (Class686)var10.method_1557(var11);
            Class186 var9 = Class186.method_1515(var12);
            if (var9 != null) {
               var4.method_843(var9);
            }
         }
      }

      return var4;
   }

   @Override
   public void method_1829() {
   }

   @Override
   public void method_879() {
   }

   @Override
   public void method_899(Class454 var1, Class741 var2) {
   }
}
