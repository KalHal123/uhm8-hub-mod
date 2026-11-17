package ext;

public class Class613 extends Class265 {
   private Class265 field_1490;
   private int field_2213 = 0;
   private String field_2596 = "";

   public Class613(Class265 var1) {
      this.field_1490 = var1;
   }

   @Override
   public void method_1414() {
      this.field_2213++;
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class423(0, this.field_2345 / 2 - 100, this.field_562 / 4 + 96 + 12, "Connect"));
      this.field_577.add(new Class423(1, this.field_2345 / 2 - 100, this.field_562 / 4 + 120 + 12, "Cancel"));
      this.field_577.get(0).field_143 = false;
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143) {
         if (var1.field_2254 == 1) {
            this.field_3013.method_1290(this.field_1490);
         } else if (var1.field_2254 == 0) {
            String[] var2 = this.field_2596.split(":");
         }
      }
   }

   @Override
   protected void method_437(char var1, int var2) {
      if (var1 == 22) {
         String var3 = Class265.method_279();
         if (var3 == null) {
            var3 = "";
         }

         int var4 = 32 - this.field_2596.length();
         if (var4 > var3.length()) {
            var4 = var3.length();
         }

         if (var4 > 0) {
            this.field_2596 = this.field_2596 + var3.substring(0, var4);
         }
      }

      if (var1 == '\r') {
         this.method_1445(this.field_577.get(0));
      }

      if (var2 == 14 && this.field_2596.length() > 0) {
         this.field_2596 = this.field_2596.substring(0, this.field_2596.length() - 1);
      }

      if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»"
               .indexOf(var1)
            >= 0
         && this.field_2596.length() < 32) {
         this.field_2596 = this.field_2596 + var1;
      }

      this.field_577.get(0).field_143 = this.field_2596.length() > 0;
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, "##############", this.field_2345 / 2, this.field_562 / 4 - 60 + 20, 16777215);
      method_773(this.field_1683, "#################################", this.field_2345 / 2 - 140, this.field_562 / 4 - 60 + 60 + 0, 10526880);
      int var4 = this.field_2345 / 2 - 100;
      int var5 = this.field_562 / 4 - 10 + 50 + 18;
      short var6 = 200;
      byte var7 = 20;
      method_194(var4 - 1, var5 - 1, var4 + var6 + 1, var5 + var7 + 1, -6250336);
      method_194(var4, var5, var4 + var6, var5 + var7, -16777216);
      method_773(this.field_1683, this.field_2596 + (this.field_2213 / 6 % 2 == 0 ? "_" : ""), var4 + 4, var5 + (var7 - 8) / 2, 14737632);
      super.method_1938(var1, var2, var3);
   }
}
