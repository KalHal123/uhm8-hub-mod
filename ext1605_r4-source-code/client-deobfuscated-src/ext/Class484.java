package ext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Class484 {
   private static final Class484 field_1004 = new Class484();
   private List<Class455> field_2739 = new ArrayList<>();

   public static final Class484 method_361() {
      return field_1004;
   }

   private Class484() {
      new Class204().method_1339(this);
      new Class505().method_416(this);
      new Class592().method_1393(this);
      new Class32().method_1212(this);
      new Class323().method_1767(this);
      new Class482().method_189(this);
      Class3.method_877(this);
      this.method_1894(new Class334(Class755.field_3019, 3), "###", '#', Class755.field_504);
      this.method_1894(new Class334(Class755.field_2457, 1), "#", "#", "#", '#', Class755.field_3019);
      this.method_1894(new Class334(Class108.field_1024, 2), "###", "###", '#', Class755.field_2717);
      this.method_1894(new Class334(Class108.field_691, 1), "###", "#X#", "###", '#', Class108.field_3148, 'X', Class755.field_2465);
      this.method_1894(new Class334(Class108.field_2204, 1), "###", "XXX", "###", '#', Class108.field_3148, 'X', Class108.field_3014);
      this.method_1894(new Class334(Class108.field_1674, 1), "##", "##", '#', Class755.field_103);
      this.method_1894(new Class334(Class108.field_2132, 1), "##", "##", '#', Class755.field_1295);
      this.method_1894(new Class334(Class108.field_1294, 1), "##", "##", '#', Class755.field_680);
      this.method_1894(new Class334(Class108.field_3014, 1), "###", "###", "###", '#', Class755.field_2930);
      this.method_1894(new Class334(Class108.field_2872, 1), "X#X", "#X#", "X#X", 'X', Class755.field_2508, '#', Class108.field_2692);
      this.method_1894(new Class334(Class108.field_2252, 3), "###", '#', Class108.field_2201);
      this.method_1894(new Class334(Class108.field_2568, 1), "# #", "###", "# #", '#', Class755.field_2717);
      this.method_1894(new Class334(Class755.field_499, 1), "##", "##", "##", '#', Class108.field_3148);
      this.method_1894(new Class334(Class755.field_1293, 1), "##", "##", "##", '#', Class755.field_1743);
      this.method_1894(new Class334(Class755.field_606, 1), "###", "###", " X ", '#', Class108.field_3148, 'X', Class755.field_2717);
      this.method_1894(new Class334(Class108.field_3148, 4), "#", '#', Class108.field_1348);
      this.method_1894(new Class334(Class755.field_2717, 4), "#", "#", '#', Class108.field_3148);
      this.method_1894(new Class334(Class108.field_149, 4), "X", "#", 'X', Class755.field_1058, '#', Class755.field_2717);
      this.method_1894(new Class334(Class755.field_2410, 4), "# #", " # ", '#', Class108.field_3148);
      this.method_1894(new Class334(Class108.field_1008, 16), "X X", "X#X", "X X", 'X', Class755.field_1743, '#', Class755.field_2717);
      this.method_1894(new Class334(Class755.field_1342, 1), "# #", "###", '#', Class755.field_1743);
      this.method_1894(new Class334(Class755.field_1539, 1), "A", "B", 'A', Class108.field_93, 'B', Class755.field_1342);
      this.method_1894(new Class334(Class755.field_3153, 1), "A", "B", 'A', Class108.field_2604, 'B', Class755.field_1342);
      this.method_1894(new Class334(Class755.field_1346, 1), "# #", "###", '#', Class108.field_3148);
      this.method_1894(new Class334(Class755.field_2962, 1), "# #", " # ", '#', Class755.field_1743);
      this.method_1894(new Class334(Class755.field_1150, 1), "A ", " B", 'A', Class755.field_1743, 'B', Class755.field_2003);
      this.method_1894(new Class334(Class755.field_362, 1), "###", '#', Class755.field_751);
      this.method_1894(new Class334(Class108.field_1900, 4), "#  ", "## ", "###", '#', Class108.field_3148);
      this.method_1894(new Class334(Class755.field_1393, 1), "  #", " #X", "# X", '#', Class755.field_2717, 'X', Class755.field_2930);
      this.method_1894(new Class334(Class108.field_1771, 4), "#  ", "## ", "###", '#', Class108.field_2201);
      this.method_1894(new Class334(Class755.field_3133, 1), "###", "#X#", "###", '#', Class755.field_2717, 'X', Class108.field_3014);
      this.method_1894(new Class334(Class755.field_611, 1), "###", "#X#", "###", '#', Class108.field_2554, 'X', Class755.field_3063);
      this.method_1894(new Class334(Class108.field_1131, 1), "X", "#", '#', Class108.field_2201, 'X', Class755.field_2717);
      this.method_1894(new Class334(Class108.field_1026, 1), "X", "#", '#', Class755.field_2717, 'X', Class755.field_1672);
      this.method_1894(new Class334(Class755.field_2124, 1), " # ", "#X#", " # ", '#', Class755.field_1743, 'X', Class755.field_1672);
      this.method_1894(new Class334(Class108.field_774, 1), "#", "#", '#', Class108.field_720);
      this.method_1894(new Class334(Class108.field_1964, 1), "###", '#', Class108.field_720);
      this.method_1894(new Class334(Class108.field_2810, 1), "###", '#', Class108.field_1348);
      Class595.method_1007(this);
      Collections.sort(this.field_2739, new Comparator76(this));
      System.out.println(this.field_2739.size() + " recipes");
   }

   public void method_1127(Class334 var1, Object... var2) {
      this.method_1496(false, var1, var2);
   }

   public void method_1894(Class334 var1, Object... var2) {
      this.method_1496(true, var1, var2);
   }

   public void method_1496(boolean var1, Class334 var2, Object... var3) {
      String var4 = "";
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      if (var3[var5] instanceof String[]) {
         String[] var12 = (String[])var3[var5++];

         for (int var9 = 0; var9 < var12.length; var9++) {
            String var10 = var12[var9];
            var7++;
            var6 = var10.length();
            var4 = var4 + var10;
         }
      } else {
         while (var3[var5] instanceof String) {
            String var8 = (String)var3[var5++];
            var7++;
            var6 = var8.length();
            var4 = var4 + var8;
         }
      }

      HashMap var13 = new HashMap();

      while (var5 < var3.length) {
         Character var16 = (Character)var3[var5];
         int var14 = 0;
         if (var3[var5 + 1] instanceof Class755) {
            var14 = ((Class755)var3[var5 + 1]).field_10;
         } else if (var3[var5 + 1] instanceof Class108) {
            var14 = ((Class108)var3[var5 + 1]).field_2151;
         }

         var13.put(var16, var14);
         var5 += 2;
      }

      int[] var17 = new int[var6 * var7];

      for (int var15 = 0; var15 < var6 * var7; var15++) {
         char var11 = var4.charAt(var15);
         if (var13.containsKey(var11)) {
            var17[var15] = (Integer)var13.get(var11);
         } else {
            var17[var15] = -1;
         }
      }

      if (var1) {
         this.field_2739.add(new Class455(var6, var7, var17, var2));
      } else {
         this.field_2739.add(new Class66(var6, var7, var17, var2));
      }
   }

   public Class334 method_477(int[] var1) {
      for (int var2 = 0; var2 < this.field_2739.size(); var2++) {
         Class455 var3 = this.field_2739.get(var2);
         if (var3.method_1757(var1)) {
            return var3.method_344(var1);
         }
      }

      return null;
   }
}
