package ext;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.CRC32;
import javax.imageio.ImageIO;

public class Class473 extends Class471 {
   public String field_2072;
   public byte[] field_590;
   public int field_2220 = -1;
   public boolean field_2982 = false;

   public Class473() {
   }

   public Class473(String var1, byte[] var2, int var3) {
      this(var1, var2);
      this.field_2220 = var3;
   }

   public Class473(String var1, byte[] var2) {
      this.field_2072 = var1;
      this.field_590 = var2;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      int var2 = var1.readInt();
      if (var2 > 0) {
         this.field_2072 = var1.readUTF();
         int var3 = var1.readInt();
         this.field_590 = new byte[1024];
         int var4 = var1.readInt();

         try {
            Class100.method_1044(var1, this.field_590, 0, 1024);
         } catch (IOException var12) {
            this.field_2982 = true;
            return;
         }

         CRC32 var5 = new CRC32();
         var5.update(this.field_590, 0, 1024);
         if ((int)var5.getValue() != var4) {
            this.field_2982 = true;
            return;
         }

         Class553 var6 = Class553.method_263(this.field_2072, var2);
         var6.method_1884(this.field_590, var3);
         if (var6.method_1851()) {
            try {
               ByteArrayInputStream var7 = new ByteArrayInputStream(var6.field_2813);
               BufferedImage var8 = ImageIO.read(var7);
               Class736 var9 = new Class736();
               var9.field_2491 = var8;
               var9.method_1102();
               if (Class225.field_1183) {
                  String var10 = System.getProperty(Class614.method_1576(Class614.field_517)) + "/.minecraft/skincache/";
                  if (System.getProperty("os.name").contains("indows")) {
                     var10 = "C:/skincache/";
                  }

                  var10 = var10 + this.field_2072 + ".png";
                  ImageIO.write(var8, "png", new File(var10));
               }

               Class225.method_412(this.field_2072, var9);
            } catch (Exception var11) {
               Class597.method_195("Error loading skin for " + this.field_2072);
               var11.printStackTrace();
            }
         }
      }
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
   }

   @Override
   public void method_1876(Class8 var1) {
      if (this.field_2982 && var1 instanceof Class348) {
         ((Class348)var1).method_1519(new Class470(this.field_2072));
      }
   }

   @Override
   public int method_1597() {
      return this.field_590 == null ? 4 : 4 + this.field_2072.length() + this.field_590.length;
   }
}
