package ext;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class Class337 {
   private List<Class280> field_1590 = new ArrayList<>();
   private Class280 field_1486 = new Class575();
   public Class280 field_602;
   private Map<String, Class280> field_2008 = new HashMap<>();
   private Minecraft field_2096;
   private File field_509;
   private String field_62;

   public Class337(Minecraft var1, File var2) {
      this.field_2096 = var1;
      this.field_509 = new File(var2, "texturepacks");
      if (!this.field_509.exists()) {
         this.field_509.mkdirs();
      }

      this.field_62 = var1.field_1754.field_1832;
      this.method_192();
      this.field_602.method_267();
   }

   public boolean method_1194(Class280 var1) {
      if (var1 == this.field_602) {
         return false;
      }

      this.field_602.method_467();
      this.field_62 = var1.field_220;
      this.field_602 = var1;
      this.field_2096.field_1754.field_1832 = this.field_62;
      this.field_2096.field_1754.method_1024();
      this.field_602.method_267();
      return true;
   }

   public void method_192() {
      ArrayList var1 = new ArrayList();
      this.field_602 = null;
      var1.add(this.field_1486);
      if (this.field_509.exists() && this.field_509.isDirectory()) {
         File[] var2 = this.field_509.listFiles();

         for (File var6 : var2) {
            if (var6.isFile() && var6.getName().toLowerCase().endsWith(".zip")) {
               String var7 = var6.getName() + ":" + var6.length() + ":" + var6.lastModified();

               try {
                  if (!this.field_2008.containsKey(var7)) {
                     Class724 var8 = new Class724(var6);
                     var8.field_1576 = var7;
                     this.field_2008.put(var7, var8);
                     var8.method_84(this.field_2096);
                  }

                  Class280 var12 = this.field_2008.get(var7);
                  if (var12.field_220.equals(this.field_62)) {
                     this.field_602 = var12;
                  }

                  var1.add(var12);
               } catch (IOException var9) {
                  var9.printStackTrace();
               }
            }
         }
      }

      if (this.field_602 == null) {
         this.field_602 = this.field_1486;
      }

      this.field_1590.removeAll(var1);

      for (Class280 var11 : this.field_1590) {
         var11.method_1312(this.field_2096);
         this.field_2008.remove(var11.field_1576);
      }

      this.field_1590 = var1;
   }

   public List<Class280> method_887() {
      return new ArrayList<>(this.field_1590);
   }
}
