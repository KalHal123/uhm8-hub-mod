package ext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Class239 {
   List<Class677> field_1960;
   public List<Class570> field_111;
   public String field_198 = "v0-DEMOPLAYER";

   public Class239(List<Class677> var1, List<Class570> var2, String var3) {
      this(var1, var2);
      this.field_198 = var3;
   }

   public Class239(List<Class677> var1, List<Class570> var2) {
      this.field_1960 = new ArrayList<>(var1);
      this.field_111 = new ArrayList<>(var2);
   }

   protected Class239() {
      this.field_1960 = new ArrayList<>();
      this.field_111 = new ArrayList<>();
   }

   public void method_856(String var1) {
      try {
         PrintWriter var2 = new PrintWriter(new FileWriter(var1));

         try {
            var2.println("+mdmver:v1h0");
            var2.println("+dwmeta:RECDEMO ON 1.0.16.05R4 [" + Class119.field_1519.field_2648.field_2737 + "]");
            var2.println("+player:" + Class119.field_1519.field_2935.field_382);

            for (Class677 var4 : this.field_1960) {
               var2.println(
                  var4.field_1395
                     + " "
                     + var4.field_88
                     + " "
                     + var4.field_730
                     + " "
                     + var4.field_2240
                     + " "
                     + var4.field_622
                     + " "
                     + var4.field_1049
                     + " "
                     + var4.field_2993
                     + " "
                     + var4.field_2899
                     + " "
                     + var4.field_2268
               );
            }

            System.out.println("Data written to " + var1);
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   public static Class239 method_1906(String var0) {
      Class239 var1 = new Class239();

      try {
         BufferedReader var2 = new BufferedReader(new FileReader(var0));

         Class239 var29;
         try {
            long var4 = 1L;

            String var3;
            while ((var3 = var2.readLine()) != null) {
               if (var3.startsWith("+")) {
                  String var6 = var3.substring(0, 7);
                  if (var6.equals("+player")) {
                     var1.field_198 = var3.substring(8);
                  }
               } else if (var3.startsWith("d")) {
                  var1.field_111.add(new Class570(var4, var3));
               } else {
                  String[] var28 = var3.split(" ");
                  if (var28.length == 9) {
                     long var7 = Long.parseLong(var28[0]);
                     var4 = var7;
                     double var9 = Double.parseDouble(var28[1]);
                     double var11 = Double.parseDouble(var28[2]);
                     double var13 = Double.parseDouble(var28[3]);
                     double var15 = Double.parseDouble(var28[4]);
                     double var17 = Double.parseDouble(var28[5]);
                     double var19 = Double.parseDouble(var28[6]);
                     double var21 = Double.parseDouble(var28[7]);
                     double var23 = Double.parseDouble(var28[8]);
                     var1.field_1960.add(new Class677(var7, var9, var11, var13, var15, var17, var19, var21, var23));
                  }
               }
            }

            System.out.println("Data read from " + var0);
            var29 = var1;
         } catch (Throwable var26) {
            try {
               var2.close();
            } catch (Throwable var25) {
               var26.addSuppressed(var25);
            }

            throw var26;
         }

         var2.close();
         return var29;
      } catch (IOException var27) {
         System.out.println("Failed to read demo");
         var27.printStackTrace();
         return null;
      }
   }
}
