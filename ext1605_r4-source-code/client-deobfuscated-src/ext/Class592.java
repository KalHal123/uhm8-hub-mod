package ext;

public class Class592 {
   private Object[][] field_2610 = new Object[][]{
      {Class108.field_2554, Class755.field_591}, {Class108.field_2938, Class755.field_1743}, {Class108.field_2971, Class755.field_2465}
   };

   public void method_1393(Class484 var1) {
      for (int var2 = 0; var2 < this.field_2610.length; var2++) {
         Class108 var3 = (Class108)this.field_2610[var2][0];
         Class755 var4 = (Class755)this.field_2610[var2][1];
         var1.method_1894(new Class334(var3), "###", "###", "###", '#', var4);
         var1.method_1894(new Class334(var4, 9), "#", '#', var3);
      }
   }
}
