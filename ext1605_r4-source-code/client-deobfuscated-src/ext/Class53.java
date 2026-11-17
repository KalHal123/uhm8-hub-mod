package ext;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.codecs.CodecWav;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class Class53 {
   public static SoundSystem field_1690;
   private Class321 field_1622 = new Class321();
   private Class321 field_829 = new Class321();
   private Class321 field_1270 = new Class321();
   private int field_1080 = 0;
   private Class693 field_511;
   private static boolean field_2526 = false;
   private Random field_2490 = new Random();
   private int field_1877 = this.field_2490.nextInt(12000);
   private boolean field_532 = false;
   private long field_1925 = System.currentTimeMillis();
   List<String> field_2207 = new ArrayList<>();
   List<String> field_2344 = new ArrayList<>();
   private String field_231 = null;
   private boolean field_1261 = false;
   private float field_867 = 1.0F;

   public Class53() {
      try {
         BufferedReader var1 = new BufferedReader(new InputStreamReader(Class100.method_1145("/aqueue_ignore.txt")));

         String var2;
         while ((var2 = var1.readLine()) != null) {
            this.field_2207.add((String)var2);
         }

         var1.close();
         var1 = new BufferedReader(new InputStreamReader(Class100.method_1145("/aqueue_ignore_a.txt")));
         var2 = null;

         while ((var2 = var1.readLine()) != null) {
            this.field_2344.add((String)var2);
         }

         var1.close();
      } catch (IOException var3) {
      }
   }

   public boolean method_106() {
      return !this.field_532;
   }

   public synchronized void method_1361() {
      long var1 = System.currentTimeMillis();
      float var3 = (float)(var1 - this.field_1925) / 1000.0F;
      if (this.field_1261) {
         this.field_867 -= var3;
         if (this.field_867 <= 0.0F) {
            this.field_867 = 0.0F;
            field_1690.stop("BgMusic");
            this.field_1261 = false;
            if (this.field_231 != null) {
               Class653 var4 = this.field_1270.method_986(this.field_231);
               if (var4 == null) {
                  var4 = this.field_829.method_986(this.field_231);
               }

               if (var4 != null) {
                  this.field_1877 = this.field_2490.nextInt(24000) + 24000;
                  field_1690.backgroundMusic("BgMusic", var4.field_814, var4.field_632, true);
                  field_1690.setVolume("BgMusic", this.field_511.field_1924);
                  field_1690.play("BgMusic");
               }
            }
         }
      } else if (this.field_231 != null) {
         this.field_867 += var3;
         if (this.field_867 > 1.0F) {
            this.field_867 = 1.0F;
         }
      }

      field_1690.setVolume("BgMusic", this.field_867 * this.field_511.field_1924);
      this.field_1925 = var1;
   }

   public void method_1628(Class693 var1) {
      this.field_829.field_1124 = false;
      this.field_511 = var1;
      if (!field_2526 && (var1 == null || var1.field_299 != 0.0F || var1.field_1924 != 0.0F)) {
         this.method_1426();
      }
   }

   private void method_1426() {
      try {
         float var1 = this.field_511.field_299;
         float var2 = this.field_511.field_1924;
         this.field_511.field_299 = 0.0F;
         this.field_511.field_1924 = 0.0F;
         this.field_511.method_1024();
         SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
         SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
         SoundSystemConfig.setCodec("mus", CodecJOrbis587.class);
         SoundSystemConfig.setCodec("wav", CodecWav.class);
         field_1690 = new SoundSystem();
         this.field_511.field_299 = var1;
         this.field_511.field_1924 = var2;
         this.field_511.method_1024();
      } catch (Throwable var3) {
         var3.printStackTrace();
         System.err.println("error linking with the LibraryJavaSound plug-in");
      }

      field_2526 = true;
   }

   public void method_729() {
      if (!field_2526 && (this.field_511.field_299 != 0.0F || this.field_511.field_1924 != 0.0F)) {
         this.method_1426();
      }

      if (this.field_511.field_1924 == 0.0F) {
         field_1690.stop("BgMusic");
      } else {
         field_1690.setVolume("BgMusic", this.field_511.field_1924);
      }
   }

   public void method_599() {
      this.field_532 = true;
      if (field_2526) {
         field_1690.cleanup();
      }
   }

   public void method_109(String var1, File var2) {
      this.field_1622.method_1839(var1, var2);
   }

   public void method_1218(String var1, File var2) {
      this.field_829.method_1839(var1, var2);
   }

   public void method_1072(String var1, File var2) {
      this.field_1270.method_1839(var1, var2);
   }

   public void method_931() {
      if (field_2526 && this.field_511.field_1924 != 0.0F && !field_1690.playing("BgMusic") && !field_1690.playing("streaming")) {
         if (this.field_1877 > 0) {
            this.field_1877--;
            return;
         }

         Class653 var1;
         if (Class119.field_1519.field_2648 instanceof Class581) {
            var1 = this.field_1270.method_986("hub");
         } else {
            SimpleDateFormat var3 = new SimpleDateFormat("HH");
            int var4 = Integer.parseInt(var3.format(Calendar.getInstance().getTime()));
            List var2 = var4 <= 22 && var4 >= 5 ? this.field_2207 : this.field_2344;
            var1 = this.field_1270.method_553(var2);
         }

         if (var1 != null) {
            this.field_1877 = this.field_2490.nextInt(24000) + 24000;
            field_1690.backgroundMusic("BgMusic", var1.field_814, var1.field_632, false);
            field_1690.setVolume("BgMusic", this.field_511.field_1924);
            field_1690.play("BgMusic");
            this.field_1261 = false;
            this.field_867 = 1.0F;
         }
      }
   }

   public void method_812(Class377 var1, float var2) {
      if (field_2526 && this.field_511.field_299 != 0.0F && var1 != null) {
         float var3 = var1.field_2772 + (var1.field_1661 - var1.field_2772) * var2;
         double var4 = var1.field_2553 + (var1.field_1417 - var1.field_2553) * var2;
         double var6 = var1.field_2068 + (var1.field_2654 - var1.field_2068) * var2;
         double var8 = var1.field_1780 + (var1.field_2013 - var1.field_1780) * var2;
         float var10 = Class469.method_255(-var3 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var11 = Class469.method_1667(-var3 * (float) (Math.PI / 180.0) - (float) Math.PI);
         float var12 = -var11;
         float var13 = 0.0F;
         float var14 = -var10;
         float var15 = 0.0F;
         float var16 = 1.0F;
         float var17 = 0.0F;
         field_1690.setListenerPosition((float)var4, (float)var6, (float)var8);
         field_1690.setListenerOrientation(var12, var13, var14, var15, var16, var17);
      }
   }

   public void method_1550(String var1, float var2, float var3, float var4, float var5, float var6) {
      if (field_2526 && this.field_511.field_299 != 0.0F) {
         String var7 = "streaming";
         if (field_1690.playing("streaming")) {
            field_1690.stop("streaming");
         }

         if (var1 != null) {
            Class653 var8 = this.field_829.method_986(var1);
            if (var8 != null && var5 > 0.0F) {
               if (field_1690.playing("BgMusic")) {
                  field_1690.stop("BgMusic");
               }

               float var9 = 16.0F;
               field_1690.newStreamingSource(true, var7, var8.field_814, var8.field_632, false, var2, var3, var4, 2, var9 * 4.0F);
               field_1690.setVolume(var7, 0.5F * this.field_511.field_299);
               field_1690.play(var7);
               this.field_1261 = false;
               this.field_867 = 1.0F;
            }
         }
      }
   }

   public void method_1036(String var1) {
      this.method_963(var1, false);
   }

   public void method_963(String var1, boolean var2) {
      if (field_2526 && this.field_511.field_1924 != 0.0F) {
         if (var2) {
            this.field_231 = var1;
            this.field_1261 = true;
         } else {
            this.field_1261 = false;
            this.field_867 = 1.0F;
            if (var1 != null) {
               Class653 var3 = this.field_1270.method_986(var1);
               if (var3 == null) {
                  var3 = this.field_829.method_986(var1);
               }

               if (var3 != null) {
                  this.field_1877 = this.field_2490.nextInt(24000) + 24000;
                  field_1690.backgroundMusic("BgMusic", var3.field_814, var3.field_632, false);
                  field_1690.setVolume("BgMusic", this.field_511.field_1924);
                  field_1690.play("BgMusic");
               }
            } else {
               field_1690.stop("BgMusic");
            }
         }
      }
   }

   public void method_68(String var1, float var2, float var3, float var4, float var5, float var6) {
      if (field_2526 && this.field_511.field_299 != 0.0F) {
         Class653 var7 = this.field_1622.method_986(var1);
         if (var7 != null && var5 > 0.0F) {
            this.field_1080 = (this.field_1080 + 1) % 256;
            String var8 = "sound_" + this.field_1080;
            float var9 = 16.0F;
            if (var5 > 1.0F) {
               var9 *= var5;
            }

            field_1690.newSource(var5 > 1.0F, var8, var7.field_814, var7.field_632, false, var2, var3, var4, 2, var9);
            field_1690.setPitch(var8, var6);
            if (var5 > 1.0F) {
               var5 = 1.0F;
            }

            field_1690.setVolume(var8, var5 * this.field_511.field_299);
            field_1690.play(var8);
         }
      }
   }

   public void method_1511(String var1, float var2, float var3) {
      if (field_2526 && this.field_511.field_299 != 0.0F) {
         Class653 var4 = this.field_1622.method_986(var1);
         if (var4 != null) {
            this.field_1080 = (this.field_1080 + 1) % 256;
            String var5 = "sound_" + this.field_1080;
            field_1690.newSource(false, var5, var4.field_814, var4.field_632, false, 0.0F, 0.0F, 0.0F, 0, 0.0F);
            if (var2 > 1.0F) {
               var2 = 1.0F;
            }

            var2 *= 0.25F;
            field_1690.setPitch(var5, var3);
            field_1690.setVolume(var5, var2 * this.field_511.field_299);
            field_1690.play(var5);
         }
      }
   }
}
