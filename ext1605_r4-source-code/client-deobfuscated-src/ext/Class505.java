package ext;

public class Class505 {
   private String[][] field_3144 = new String[][]{{"X", "X", "#"}};
   private Object[][] field_2301 = new Object[][]{
      {Class108.field_3148, Class108.field_2201, Class755.field_1743, Class755.field_2465, Class755.field_591},
      {Class755.field_529, Class755.field_542, Class755.field_630, Class755.field_2843, Class755.field_1827}
   };

   public void method_416(Class484 var1) {
      for (int var2 = 0; var2 < this.field_2301[0].length; var2++) {
         Object var3 = this.field_2301[0][var2];

         for (int var4 = 0; var4 < this.field_2301.length - 1; var4++) {
            Class755 var5 = (Class755)this.field_2301[var4 + 1][var2];
            var1.method_1894(new Class334(var5), this.field_3144[var4], '#', Class755.field_2717, 'X', var3);
         }
      }

      var1.method_1894(new Class334(Class755.field_2613, 1), " #X", "# X", " #X", 'X', Class755.field_2930, '#', Class755.field_2717);
      var1.method_1894(new Class334(Class755.field_1344, 4), "X", "#", "Y", 'Y', Class755.field_2319, 'X', Class755.field_2003, '#', Class755.field_2717);
   }
}
