package ext;

public class Class17 extends Class265 {
   private Class265 field_2916;
   private static String[] field_2214 = new String[0];
   private static String[] field_701 = new String[2];
   private static String[] field_2191 = new String[2];

   public Class17(Class265 var1) {
      this.field_2916 = var1;
   }

   @Override
   public void method_836() {
      super.method_836();
      this.field_577.clear();
      this.field_577.add(new Class423(0, this.field_2345 / 2 - 100, this.field_562 / 4 + 120 + 12, "Done"));
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, "Alpha 1.0.16.05_20 Cypress", this.field_2345 / 2, 20, 16777215);
      this.field_1683.method_1444("Third-party code:", 20, 60 + field_2214.length * 10 + 10, 16777215);

      for (int var4 = 0; var4 < field_701.length; var4++) {
         this.field_1683.method_1870("- " + field_701[var4], 20, 60 + field_2214.length * 10 + 20 + var4 * 10, 16777215);
      }

      this.field_1683.method_1444("Special thanks to:", 20, 60 + field_2214.length * 10 + 20 + field_701.length * 10 + 10, 16777215);

      for (int var5 = 0; var5 < field_2191.length; var5++) {
         this.field_1683.method_1870("- " + field_2191[var5], 20, 60 + field_2214.length * 10 + 20 + field_701.length * 10 + 20 + var5 * 10, 16777215);
      }

      super.method_1938(var1, var2, var3);
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_2254 == 0) {
         this.field_3013.method_1290(this.field_2916);
      }
   }

   static {
      field_701[0] = "ModLoader by Risugami";
      field_701[1] = "GLSL Shader support by daxnitro";
      field_2191[0] = "Mojang Studios";
      field_2191[1] = "Google Inc.";
   }
}
