package ext;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class432 {
   public static boolean field_2280 = false;
   private HashMap<String, Integer> field_1802 = new HashMap<>();
   private HashMap<Integer, BufferedImage> field_1995 = new HashMap<>();
   private IntBuffer field_1084 = Class504.method_323(1);
   private ByteBuffer field_3123 = Class504.method_1768(4194304);
   private List<Class203> field_570 = new ArrayList<>();
   private Map<String, Class233> field_2310 = new HashMap<>();
   public Class693 field_2315;
   private boolean field_1697 = false;
   public Class337 field_2793;
   public Class736 field_836 = new Class736();

   public Class432(Class337 var1, Class693 var2) {
      this.field_2793 = var1;
      this.field_2315 = var2;
   }

   public int method_1545(String var1) {
      Class280 var2 = this.field_2793.field_602;
      Integer var3 = this.field_1802.get(var1);
      if (var3 != null) {
         return var3;
      }

      try {
         ((Buffer)this.field_1084).clear();
         Class504.method_974(this.field_1084);
         int var4 = this.field_1084.get(0);
         if (var1.startsWith("##")) {
            this.method_217(this.method_1562(this.method_1277(var2.method_631(var1.substring(2)))), var4);
         } else if (var1.startsWith("%%")) {
            this.field_1697 = true;
            this.method_217(this.method_1277(var2.method_631(var1.substring(2))), var4);
            this.field_1697 = false;
         } else {
            this.method_217(this.method_1277(var2.method_631(var1)), var4);
         }

         this.field_1802.put(var1, var4);
         return var4;
      } catch (IOException var5) {
         throw new RuntimeException("!!");
      } catch (IllegalArgumentException var6) {
         System.err.println("Failed to load resource: " + var1);
         throw new RuntimeException(var6);
      }
   }

   private BufferedImage method_1562(BufferedImage var1) {
      int var2 = var1.getWidth() / 16;
      BufferedImage var3 = new BufferedImage(16, var1.getHeight() * var2, 2);
      Graphics var4 = var3.getGraphics();

      for (int var5 = 0; var5 < var2; var5++) {
         var4.drawImage(var1, -var5 * 16, var5 * var1.getHeight(), null);
      }

      var4.dispose();
      return var3;
   }

   public int method_285(BufferedImage var1) {
      ((Buffer)this.field_1084).clear();
      Class504.method_974(this.field_1084);
      int var2 = this.field_1084.get(0);
      this.method_217(var1, var2);
      this.field_1995.put(var2, var1);
      return var2;
   }

   public void method_217(BufferedImage var1, int var2) {
      GL11.glBindTexture(3553, var2);
      if (field_2280) {
         GL11.glTexParameteri(3553, 10241, 9987);
         GL11.glTexParameteri(3553, 10240, 9729);
      } else {
         GL11.glTexParameteri(3553, 10241, Class310.field_1409 ? 9729 : 9728);
         GL11.glTexParameteri(3553, 10240, Class310.field_1409 ? 9729 : 9728);
      }

      if (this.field_1697) {
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }

      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      int[] var5 = new int[var3 * var4];
      byte[] var6 = new byte[var3 * var4 * 4];
      var1.getRGB(0, 0, var3, var4, var5, 0, var3);

      for (int var7 = 0; var7 < var5.length; var7++) {
         int var8 = var5[var7] >> 24 & 0xFF;
         int var9 = var5[var7] >> 16 & 0xFF;
         int var10 = var5[var7] >> 8 & 0xFF;
         int var11 = var5[var7] & 0xFF;
         if (this.field_2315 != null && this.field_2315.field_359) {
            int var12 = (var9 * 30 + var10 * 59 + var11 * 11) / 100;
            int var13 = (var9 * 30 + var10 * 70) / 100;
            int var14 = (var9 * 30 + var11 * 70) / 100;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         var6[var7 * 4 + 0] = (byte)var9;
         var6[var7 * 4 + 1] = (byte)var10;
         var6[var7 * 4 + 2] = (byte)var11;
         var6[var7 * 4 + 3] = (byte)var8;
      }

      ((Buffer)this.field_3123).clear();
      this.field_3123.put(var6);
      ((Buffer)this.field_3123).position(0).limit(var6.length);
      GL11.glTexImage2D(3553, 0, 6408, var3, var4, 0, 6408, 5121, this.field_3123);
      if (field_2280) {
         for (int var18 = 1; var18 <= 4; var18++) {
            int var19 = var3 >> var18 - 1;
            int var20 = var3 >> var18;
            int var21 = var4 >> var18;

            for (int var22 = 0; var22 < var20; var22++) {
               for (int var23 = 0; var23 < var21; var23++) {
                  int var24 = this.field_3123.getInt((var22 * 2 + 0 + (var23 * 2 + 0) * var19) * 4);
                  int var25 = this.field_3123.getInt((var22 * 2 + 1 + (var23 * 2 + 0) * var19) * 4);
                  int var15 = this.field_3123.getInt((var22 * 2 + 1 + (var23 * 2 + 1) * var19) * 4);
                  int var16 = this.field_3123.getInt((var22 * 2 + 0 + (var23 * 2 + 1) * var19) * 4);
                  int var17 = this.method_1702(this.method_1702(var24, var25), this.method_1702(var15, var16));
                  this.field_3123.putInt((var22 + var23 * var20) * 4, var17);
               }
            }

            GL11.glTexImage2D(3553, var18, 6408, var20, var21, 0, 6408, 5121, this.field_3123);
         }
      }
   }

   public void method_418(int var1) {
      this.field_1995.remove(var1);
      ((Buffer)this.field_1084).clear();
      this.field_1084.put(var1);
      ((Buffer)this.field_1084).flip();
      GL11.glDeleteTextures(this.field_1084);
   }

   public Class736 method_268(String var1, String var2) {
      Class736 var3;
      if (Class225.field_1719.containsKey(var1)) {
         var3 = Class225.field_1719.get(var1);
      } else {
         var3 = this.field_2310.get(var1);
      }

      if (var3 != null && var3.field_2491 != null && !var3.field_2646) {
         if (var3.field_846 < 0) {
            var3.field_846 = this.method_285(var3.field_2491);
         } else {
            this.method_217(var3.field_2491, var3.field_846);
         }

         var3.field_2646 = true;
      }

      if (var3 != null && var3.field_846 >= 0) {
         return var3;
      }

      this.field_836.field_846 = this.method_1545(var2);
      return this.field_836;
   }

   public Class736 method_1125(String var1, Interface148 var2) {
      Class736 var3;
      if (Class225.field_1719.containsKey(var1)) {
         var3 = Class225.field_1719.get(var1);
      } else {
         var3 = this.field_2310.get(var1);
      }

      if (var3 == null) {
         if (this.field_2310.containsKey(var1)) {
            this.field_2310.remove(var1);
         }

         this.field_2310.put(var1, new Class233(var1, var2));
      } else {
         var3.field_1424++;
      }

      return var3;
   }

   public void method_1175(String var1) {
      Class736 var2 = this.field_2310.get(var1);
      if (var2 != null) {
         var2.field_1424--;
         if (var2.field_1424 == 0) {
            if (var2.field_846 >= 0) {
               this.method_418(var2.field_846);
            }

            this.field_2310.remove(var1);
         }
      }
   }

   public void method_439(Class203 var1) {
      this.field_570.add(var1);
      var1.method_1610();
   }

   public void method_362() {
      if (Minecraft.field_2639) {
         for (int var1 = 0; var1 < this.field_570.size(); var1++) {
            Class203 var2 = this.field_570.get(var1);
            var2.field_85 = this.field_2315.field_359;
            var2.method_1610();
            ((Buffer)this.field_3123).clear();
            this.field_3123.put(var2.field_2765);
            ((Buffer)this.field_3123).position(0).limit(var2.field_2765.length);
            var2.method_1203(this);

            for (int var3 = 0; var3 < var2.field_938; var3++) {
               for (int var4 = 0; var4 < var2.field_938; var4++) {
                  GL11.glTexSubImage2D(
                     3553, 0, var2.field_1808 % 16 * 16 + var3 * 16, var2.field_1808 / 16 * 16 + var4 * 16, 16, 16, 6408, 5121, this.field_3123
                  );
                  if (field_2280) {
                     for (int var5 = 1; var5 <= 4; var5++) {
                        int var6 = 16 >> var5 - 1;
                        int var7 = 16 >> var5;

                        for (int var8 = 0; var8 < var7; var8++) {
                           for (int var9 = 0; var9 < var7; var9++) {
                              int var10 = this.field_3123.getInt((var8 * 2 + 0 + (var9 * 2 + 0) * var6) * 4);
                              int var11 = this.field_3123.getInt((var8 * 2 + 1 + (var9 * 2 + 0) * var6) * 4);
                              int var12 = this.field_3123.getInt((var8 * 2 + 1 + (var9 * 2 + 1) * var6) * 4);
                              int var13 = this.field_3123.getInt((var8 * 2 + 0 + (var9 * 2 + 1) * var6) * 4);
                              int var14 = this.method_652(this.method_652(var10, var11), this.method_652(var12, var13));
                              this.field_3123.putInt((var8 + var9 * var7) * 4, var14);
                           }
                        }

                        GL11.glTexSubImage2D(3553, var5, var2.field_1808 % 16 * var7, var2.field_1808 / 16 * var7, var7, var7, 6408, 5121, this.field_3123);
                     }
                  }
               }
            }
         }

         for (int var15 = 0; var15 < this.field_570.size(); var15++) {
            Class203 var16 = this.field_570.get(var15);
            if (var16.field_971 > 0) {
               ((Buffer)this.field_3123).clear();
               this.field_3123.put(var16.field_2765);
               ((Buffer)this.field_3123).position(0).limit(var16.field_2765.length);
               GL11.glBindTexture(3553, var16.field_971);
               GL11.glTexSubImage2D(3553, 0, 0, 0, 16, 16, 6408, 5121, this.field_3123);
               if (field_2280) {
                  for (int var17 = 1; var17 <= 4; var17++) {
                     int var18 = 16 >> var17 - 1;
                     int var19 = 16 >> var17;

                     for (int var20 = 0; var20 < var19; var20++) {
                        for (int var21 = 0; var21 < var19; var21++) {
                           int var22 = this.field_3123.getInt((var20 * 2 + 0 + (var21 * 2 + 0) * var18) * 4);
                           int var23 = this.field_3123.getInt((var20 * 2 + 1 + (var21 * 2 + 0) * var18) * 4);
                           int var24 = this.field_3123.getInt((var20 * 2 + 1 + (var21 * 2 + 1) * var18) * 4);
                           int var25 = this.field_3123.getInt((var20 * 2 + 0 + (var21 * 2 + 1) * var18) * 4);
                           int var26 = this.method_652(this.method_652(var22, var23), this.method_652(var24, var25));
                           this.field_3123.putInt((var20 + var21 * var19) * 4, var26);
                        }
                     }

                     GL11.glTexSubImage2D(3553, var17, 0, 0, var19, var19, 6408, 5121, this.field_3123);
                  }
               }
            }
         }
      }
   }

   private int method_652(int var1, int var2) {
      int var3 = (var1 & 0xFF000000) >> 24 & 0xFF;
      int var4 = (var2 & 0xFF000000) >> 24 & 0xFF;
      return (var3 + var4 >> 1 << 24) + ((var1 & 16711422) + (var2 & 16711422) >> 1);
   }

   private int method_1702(int var1, int var2) {
      int var3 = (var1 & 0xFF000000) >> 24 & 0xFF;
      int var4 = (var2 & 0xFF000000) >> 24 & 0xFF;
      short var5 = 255;
      if (var3 + var4 == 0) {
         var3 = 1;
         var4 = 1;
         var5 = 0;
      }

      int var6 = (var1 >> 16 & 0xFF) * var3;
      int var7 = (var1 >> 8 & 0xFF) * var3;
      int var8 = (var1 & 0xFF) * var3;
      int var9 = (var2 >> 16 & 0xFF) * var4;
      int var10 = (var2 >> 8 & 0xFF) * var4;
      int var11 = (var2 & 0xFF) * var4;
      int var12 = (var6 + var9) / (var3 + var4);
      int var13 = (var7 + var10) / (var3 + var4);
      int var14 = (var8 + var11) / (var3 + var4);
      return var5 << 24 | var12 << 16 | var13 << 8 | var14;
   }

   public void method_1759() {
      Class280 var1 = this.field_2793.field_602;

      for (int var4 : this.field_1995.keySet()) {
         BufferedImage var3 = this.field_1995.get(var4);
         this.method_217(var3, var4);
      }

      for (Class736 var11 : this.field_2310.values()) {
         var11.field_2646 = false;
      }

      for (String var5 : this.field_1802.keySet()) {
         try {
            BufferedImage var10;
            if (var5.startsWith("##")) {
               var10 = this.method_1562(this.method_1277(var1.method_631(var5.substring(2))));
            } else if (var5.startsWith("%%")) {
               this.field_1697 = true;
               var10 = this.method_1277(var1.method_631(var5.substring(2)));
               this.field_1697 = false;
            } else {
               var10 = this.method_1277(var1.method_631(var5));
            }

            int var6 = this.field_1802.get(var5);
            this.method_217(var10, var6);
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }
   }

   private BufferedImage method_1277(InputStream var1) throws IOException {
      BufferedImage var2 = ImageIO.read(var1);
      var1.close();
      return var2;
   }

   public void method_462(int var1) {
      if (var1 >= 0) {
         GL11.glBindTexture(3553, var1);
      }
   }
}
