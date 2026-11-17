package ext;

public class Class482 {
   private String[][] field_1596 = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] field_380 = new Object[][]{
      {Class755.field_506, Class50.field_466, Class755.field_1743, Class755.field_2465, Class755.field_591},
      {Class755.field_2641, Class755.field_471, Class755.field_851, Class755.field_1934, Class755.field_690},
      {Class755.field_2292, Class755.field_923, Class755.field_2354, Class755.field_3147, Class755.field_3025},
      {Class755.field_2022, Class755.field_152, Class755.field_599, Class755.field_2504, Class755.field_2185},
      {Class755.field_1090, Class755.field_878, Class755.field_1557, Class755.field_2046, Class755.field_2117}
   };

   public void method_189(Class484 var1) {
      for (int var2 = 0; var2 < this.field_380[0].length; var2++) {
         Object var3 = this.field_380[0][var2];

         for (int var4 = 0; var4 < this.field_380.length - 1; var4++) {
            Class755 var5 = (Class755)this.field_380[var4 + 1][var2];
            var1.method_1894(new Class334(var5), this.field_1596[var4], 'X', var3);
         }
      }
   }
}
