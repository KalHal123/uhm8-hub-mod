package ext;

public class Class694 {
   public Class326 field_1326;
   public Class326 field_2408;
   public Class326 field_1442;
   public Class326 field_2014;
   public String field_1899 = "---";

   public Class694(String var1, Class326 var2, Class326 var3, Class326 var4, Class326 var5) {
      this.field_1899 = var1;
      this.field_1326 = var2;
      this.field_2408 = var3;
      this.field_1442 = var4;
      this.field_2014 = var5;
   }

   public boolean method_1423(Class354 var1) {
      return this.field_1326.field_809 <= var1.field_1417
         && var1.field_1417 <= this.field_2408.field_809
         && this.field_1326.field_805 <= var1.field_2654
         && var1.field_2654 <= this.field_2408.field_805
         && this.field_1326.field_3039 <= var1.field_2013
         && var1.field_2013 <= this.field_2408.field_3039;
   }

   public void method_765(Class354 var1) {
      double var2 = this.field_1442.field_809 + (var1.field_1417 - this.field_1326.field_809);
      double var4 = this.field_1442.field_805 + (var1.field_2654 - this.field_1326.field_805);
      double var6 = this.field_1442.field_3039 + (var1.field_2013 - this.field_1326.field_3039);
      var1.field_1417 = var2;
      var1.field_2654 = var4 + 0.001;
      var1.field_2013 = var6;
      var1.method_172(var2, var4, var6);
   }

   public Class447 method_329(Class354 var1) {
      double var2 = this.field_1442.field_809 + (var1.field_1417 - this.field_1326.field_809);
      double var4 = this.field_1442.field_805 + (var1.field_2654 - this.field_1326.field_805);
      double var6 = this.field_1442.field_3039 + (var1.field_2013 - this.field_1326.field_3039);
      return new Class447(var2, var4, var6);
   }

   public static Class694 method_1235(Class686 var0, String var1) {
      return new Class694(
         var1,
         Class326.method_1425(var0, "AP1_1"),
         Class326.method_1425(var0, "AP1_2"),
         Class326.method_1425(var0, "AP2_1"),
         Class326.method_1425(var0, "AP2_2")
      );
   }

   public Class686 method_389() {
      Class686 var1 = new Class686();
      this.field_1326.method_1665(var1, "AP1_1");
      this.field_2408.method_1665(var1, "AP1_2");
      this.field_1442.method_1665(var1, "AP2_1");
      this.field_2014.method_1665(var1, "AP2_2");
      return var1;
   }
}
