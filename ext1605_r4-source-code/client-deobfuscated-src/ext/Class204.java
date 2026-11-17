package ext;

public class Class204 {
   private String[][] field_2243 = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] field_431 = new Object[][]{
      {Class108.field_3148, Class108.field_2201, Class755.field_1743, Class755.field_2465, Class755.field_591},
      {Class755.field_2199, Class755.field_1909, Class755.field_1469, Class755.field_1334, Class755.field_706},
      {Class755.field_1083, Class755.field_2956, Class755.field_1374, Class755.field_494, Class755.field_1352},
      {Class755.field_695, Class755.field_2774, Class755.field_3087, Class755.field_229, Class755.field_2762},
      {Class755.field_3064, Class755.field_1511, Class755.field_592, Class755.field_2404, Class755.field_817}
   };

   public void method_1339(Class484 var1) {
      for (int var2 = 0; var2 < this.field_431[0].length; var2++) {
         Object var3 = this.field_431[0][var2];

         for (int var4 = 0; var4 < this.field_431.length - 1; var4++) {
            Class755 var5 = (Class755)this.field_431[var4 + 1][var2];
            var1.method_1894(new Class334(var5), this.field_2243[var4], '#', Class755.field_2717, 'X', var3);
         }
      }
   }
}
