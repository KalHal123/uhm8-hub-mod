package ext;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class3 {
   private static boolean field_2256 = false;
   private static int field_1834 = 3000;
   private static int field_225 = 0;
   private static List<Class274> field_2979 = new ArrayList<>();
   private static Map<String, List<SimpleEntry<String, Integer>>> field_1752 = new HashMap<>();
   private static int field_2327 = 0;
   public static boolean field_1220 = false;
   private static boolean[] field_1919 = new boolean[256];
   private static boolean[] field_941 = new boolean[256];
   private static List<Class203> field_1513 = new ArrayList<>();
   public static final String field_1052 = "ExtensionLoader 16.05_20#";

   private static void method_1761() {
      String var0 = "1111111111111011111111111111001111111111111110011111111111110001111111111111110011111001111000001111100110000000111110000000000011111001100000000000000100000000000000010000000000000000000000000000000000000000000000000000000000000000000000001100000000000000";
      String var1 = "1111111111111111111111111111110111111111111111011111111111111100111111111111000011111111111111111111111111000000100100111000000010000000000000000000000000000000000000000000000000000000000000000000000000000111000000000000001100000000000001111111111111000011";

      for (int var2 = 0; var2 < 256; var2++) {
         field_1919[var2] = var0.charAt(var2) == '1';
         field_941[var2] = var1.charAt(var2) == '1';
      }

      try {
         File var5 = new File(Class3.class.getProtectionDomain().getCodeSource().getLocation().toURI());
         method_1383(var5);

         for (int var3 = 0; var3 < 32767; var3++) {
            if (Class108.field_1221[var3] != null && Class755.field_2576[var3] == null) {
               Class755.field_2576[var3] = new Class55(var3 - 32767);
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         throw new RuntimeException("ModLoader has failed to initialize. ", var4);
      }

      field_2256 = true;
   }

   public static void method_392() {
      if (!field_2256) {
         method_1761();
      }

      for (Class274 var1 : field_2979) {
         var1.method_526();
      }
   }

   public static int method_601(int var0) {
      if (!field_2256) {
         method_1761();
      }

      int var1 = 0;

      for (int var2 = 0; var2 < field_2979.size() && var1 == 0; var2++) {
         var1 = field_2979.get(var2).method_1052(var0);
      }

      return var1;
   }

   public static void method_877(Class484 var0) {
      if (!field_2256) {
         method_1761();
      }

      for (Class274 var2 : field_2979) {
         var2.method_809(var0);
      }
   }

   public static void method_1273(Map<Class<? extends Class359>, Class459> var0) {
      if (!field_2256) {
         method_1761();
      }

      for (Class274 var2 : field_2979) {
         var2.method_1093(var0);
      }
   }

   public static int method_925(int var0) {
      if (!field_2256) {
         method_1761();
      }

      int var1 = -1;

      for (int var2 = 0; var2 < field_2979.size() && var1 == -1; var2++) {
         var1 = field_2979.get(var2).method_1564(var0);
      }

      return var1;
   }

   private static void method_1449(ClassLoader var0, String var1) {
      try {
         String var2 = var1.substring(0, var1.length() - 6);
         var2 = var2.replace('/', '.');
         Class var3 = var0.loadClass(var2);
         if (var3.getSuperclass() != Class274.class) {
            return;
         }

         if (field_2979.add((Class274)var3.newInstance())) {
            System.out.println("Mod Loaded: " + var2);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static void method_1887(String var0, String var1, int var2) {
      List var3 = field_1752.get(var0);
      if (var3 == null) {
         var3 = new LinkedList();
         field_1752.put(var0, var3);
      }

      var3.add(new SimpleEntry<>(var1, var2));
   }

   public static void method_1471(Class203 var0) {
      field_1513.add(var0);
   }

   public static int method_1359() {
      return field_1834++;
   }

   private static int method_950() {
      while (field_225 < field_1919.length) {
         if (!field_1919[field_225]) {
            field_1919[field_225] = true;
            return field_225++;
         }

         field_225++;
      }

      throw new RuntimeException("No more empty item sprite indices left!");
   }

   public static int method_1816(String var0) {
      if (var0.equals("/gui/items.png")) {
         return method_950();
      } else if (var0.equals("/terrain.png")) {
         return method_1808();
      } else {
         throw new RuntimeException("No registry for this texture: " + var0);
      }
   }

   private static int method_1808() {
      while (field_2327 < field_941.length) {
         if (!field_941[field_2327]) {
            field_941[field_2327] = true;
            return field_2327++;
         }

         field_2327++;
      }

      throw new RuntimeException("No more empty terrain sprite indices left!");
   }

   public static boolean method_1874(String var0) {
      if (!field_2256) {
         method_1761();
      }

      Class var1 = null;

      try {
         var1 = Class.forName(var0);
      } catch (ClassNotFoundException var4) {
         return false;
      }

      if (var1 != null) {
         for (Class274 var3 : field_2979) {
            if (var1.isInstance(var3)) {
               return true;
            }
         }
      }

      return false;
   }

   private static BufferedImage method_810(Class432 var0, String var1) {
      try {
         InputStream var2 = var0.field_2793.field_602.method_631(var1);
         if (var2 != null) {
            return ImageIO.read(var2);
         } else {
            throw new RuntimeException("Image not found: " + var1);
         }
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }

   public static Class265 method_245(Class563 var0, Object var1) {
      if (!field_2256) {
         method_1761();
      }

      Class265 var2 = null;

      for (int var3 = 0; var3 < field_2979.size() && var2 == null; var3++) {
         var2 = field_2979.get(var3).method_1340(var0, var1);
      }

      return var2;
   }

   public static void method_683(Interface752 var0, int var1, int var2, Class454 var3) {
      if (!field_2256) {
         method_1761();
      }

      for (Class274 var5 : field_2979) {
         if (var0 instanceof Class405) {
            var5.method_47(var3, var3.field_2150, var1, var2);
         } else {
            var5.method_405(var3, var3.field_2150, var1, var2);
         }
      }
   }

   private static void method_1383(File var0) throws IOException {
      ClassLoader var1 = Class3.class.getClassLoader();
      if (var0.isFile() && (var0.getName().endsWith(".jar") || var0.getName().endsWith(".zip"))) {
         ZipInputStream var9 = new ZipInputStream(Files.newInputStream(var0.toPath()));
         ZipEntry var10 = null;

         while (true) {
            var10 = var9.getNextEntry();
            if (var10 == null) {
               break;
            }

            String var8 = var10.getName();
            if (!var10.isDirectory() && var8.contains("mod_") && var8.endsWith(".class")) {
               method_1449(var1, var8);
            }
         }
      } else if (var0.isDirectory()) {
         File[] var3 = var0.listFiles();
         if (var3 != null) {
            for (File var7 : var3) {
               String var2 = var7.getName();
               if (var7.isFile() && var2.contains("mod_") && var2.endsWith(".class")) {
                  method_1449(var1, var2);
               }
            }
         }
      }
   }

   public static void method_1895(List<Class108> var0) {
      if (!field_2256) {
         method_1761();
      }

      for (Class274 var2 : field_2979) {
         var2.method_1086(var0);
      }
   }

   public static void method_1866(Class432 var0) {
      if (!field_2256) {
         method_1761();
      }

      for (Class274 var2 : field_2979) {
         var2.method_1756();
      }

      Minecraft var33 = var0.field_2315.field_837;
      if (var33 != null) {
         for (int var34 = 0; var34 < field_2979.size(); var34++) {
            field_2979.get(var34).method_347(var33);
         }
      }

      for (int var35 = 0; var35 < field_1513.size(); var35++) {
         var0.method_439(field_1513.get(var35));
      }

      for (Entry var4 : field_1752.entrySet()) {
         String var5 = (String)var4.getKey();
         int var6 = var0.method_1545(var5);
         IntBuffer var7 = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asIntBuffer();
         GL11.glBindTexture(3553, var6);
         GL11.glGetTexLevelParameter(3553, 0, 4097, var7);
         int var8 = var7.get(0);
         int var9 = var8 / 16;

         for (SimpleEntry var12 : (List)var4.getValue()) {
            String var13 = (String)var12.getKey();
            int var14 = (Integer)var12.getValue();
            System.out.println("Overriding " + var5 + " with " + var13 + " @ " + var14);
            BufferedImage var15 = method_810(var0, var13);
            int var16 = var15.getHeight();
            ByteBuffer var17 = ByteBuffer.allocateDirect(4 * var9 * var9).order(ByteOrder.nativeOrder());
            int var18 = var9 / var16;
            int[] var19 = new int[var16 * var16];
            var15.getRGB(0, 0, var16, var16, var19, 0, var16);
            int var20 = var14 / 16;
            int var21 = var14 % 16;
            int var22 = var9 * var20;
            int var23 = var9 * var21;

            for (int var24 = 0; var24 < var9; var24++) {
               for (int var25 = 0; var25 < var9; var25++) {
                  int var26 = var18 != 0 ? var16 * (var24 / var18) + var25 / var18 : var16 * var24 * (var16 / var9) + var25 * (var16 / var9);
                  int var27 = var19[var26];
                  byte var28 = (byte)(var27 >> 24 & 0xFF);
                  byte var29 = (byte)(var27 >> 16 & 0xFF);
                  byte var30 = (byte)(var27 >> 8 & 0xFF);
                  byte var31 = (byte)(var27 & 0xFF);
                  var17.put(var29);
                  var17.put(var30);
                  var17.put(var31);
                  var17.put(var28);
               }
            }

            ((Buffer)var17).position(0);

            try {
               GL11.class
                  .getMethod("glTexSubImage2D", int.class, int.class, int.class, int.class, int.class, int.class, int.class, int.class, ByteBuffer.class)
                  .invoke(null, 3553, 0, var23, var22, var9, var9, 6408, 5121, var17);
            } catch (Exception var32) {
               var32.printStackTrace();
               throw new RuntimeException("Error calling glTexSubImage2D (blame xau)", var32);
            }
         }

         field_1220 = true;
      }
   }

   public static void method_1043() {
      if (!field_2256) {
         method_1761();
      }

      for (Class274 var1 : field_2979) {
         var1.method_1249();
      }
   }

   public static void method_1783(Minecraft var0) {
      if (!field_2256) {
         method_1761();
      }

      for (Class274 var2 : field_2979) {
         var2.method_1671(var0);
      }
   }

   public static int method_1430(int var0) {
      int var1 = -1;
      Iterator var2 = field_2979.iterator();

      while (var2.hasNext() && var1 == -1) {
         var1 = ((Class274)var2.next()).method_999(var0);
      }

      return var1;
   }

   public static int method_973(int var0) {
      int var1 = 0;
      Iterator var2 = field_2979.iterator();

      while (var2.hasNext() && var1 == 0) {
         var1 = ((Class274)var2.next()).method_1512(var0);
      }

      return var1;
   }

   public static List<Class274> method_1418() {
      return Collections.unmodifiableList(field_2979);
   }
}
