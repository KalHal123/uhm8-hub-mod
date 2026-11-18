package ext;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class321 {
   private Random field_1947 = new Random();
   public Map<String, List<Class653>> field_1234 = new HashMap<>();
   private List<Class653> field_1817 = new ArrayList<>();
   public int field_2542 = 0;
   public boolean field_1124 = true;

   public Class653 method_1839(String var1, File var2) {
      try {
         String var3 = var1;
         var1 = var1.substring(0, var1.indexOf("."));
         if (this.field_1124) {
            while (Character.isDigit(var1.charAt(var1.length() - 1))) {
               var1 = var1.substring(0, var1.length() - 1);
            }
         }

         var1 = var1.replaceAll("/", ".");
         if (!this.field_1234.containsKey(var1)) {
            this.field_1234.put(var1, new ArrayList<>());
         }

         Class653 var4 = new Class653(var3, var2.toURI().toURL());
         this.field_1234.get(var1).add(var4);
         this.field_1817.add(var4);
         this.field_2542++;
         return var4;
      } catch (MalformedURLException var5) {
         var5.printStackTrace();
         throw new RuntimeException(var5);
      }
   }

   public Class653 method_986(String var1) {
      List var2 = this.field_1234.get(var1);
      return var2 == null ? null : (Class653)var2.get(this.field_1947.nextInt(var2.size()));
   }

   public Class653 method_1752() {
      return this.method_553(null);
   }

   public Class653 method_553(List<String> var1) {
      if (this.field_1817.size() == 0) {
         return null;
      }

      int var2 = this.field_1947.nextInt(this.field_1817.size());

      while (var1 != null && var1.contains(this.field_1817.get(var2).field_632)) {
         var2 = ++var2 % this.field_1817.size();
      }

      return this.field_1817.get(var2);
   }
}
