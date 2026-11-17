package srv;

public class Class361 {
   public Class43 field_715;
   public Class43 field_1496;
   public Class43 field_1502;
   public Class43 field_547;
   public String field_516 = "---";

   public Class361(String var1, Class43 var2, Class43 var3, Class43 var4, Class43 var5) {
      this.field_516 = var1;
      this.field_715 = var2;
      this.field_1496 = var3;
      this.field_1502 = var4;
      this.field_547 = var5;
   }

   public boolean method_770(Class41 var1) {
      return this.field_715.field_338 <= var1.field_1324
         && var1.field_1324 <= this.field_1496.field_338
         && this.field_715.field_936 <= var1.field_632
         && var1.field_632 <= this.field_1496.field_936
         && this.field_715.field_247 <= var1.field_1321
         && var1.field_1321 <= this.field_1496.field_247;
   }

   public void method_576(Class41 var1) {
      double var2 = this.field_1502.field_338 + (var1.field_1324 - this.field_715.field_338);
      double var4 = this.field_1502.field_936 + (var1.field_632 - this.field_715.field_936);
      double var6 = this.field_1502.field_247 + (var1.field_1321 - this.field_715.field_247);
      var1.field_1324 = var2;
      var1.field_632 = var4 + 0.001;
      var1.field_1321 = var6;
      var1.method_732(var2, var4, var6);
   }

   public Class202 method_278(Class41 var1) {
      double var2 = this.field_1502.field_338 + (var1.field_1324 - this.field_715.field_338);
      double var4 = this.field_1502.field_936 + (var1.field_632 - this.field_715.field_936);
      double var6 = this.field_1502.field_247 + (var1.field_1321 - this.field_715.field_247);
      return new Class202(var2, var4, var6);
   }

   public static Class361 method_980(Class100 var0, String var1) {
      return new Class361(
         var1, Class43.method_981(var0, "AP1_1"), Class43.method_981(var0, "AP1_2"), Class43.method_981(var0, "AP2_1"), Class43.method_981(var0, "AP2_2")
      );
   }

   public Class100 method_22() {
      Class100 var1 = new Class100();
      this.field_715.method_787(var1, "AP1_1");
      this.field_1496.method_787(var1, "AP1_2");
      this.field_1502.method_787(var1, "AP2_1");
      this.field_547.method_787(var1, "AP2_2");
      return var1;
   }
}
