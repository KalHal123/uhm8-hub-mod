package srv;

public class Class12 {
   public int field_1274;
   public int field_914;
   public int field_1459;
   public int field_1407;
   public int field_1575;
   public int field_252;
   boolean field_959 = false;
   String field_1440;

   public Class12(int var1, int var2, int var3, int var4, int var5, int var6, String var7) {
      this.field_1274 = var1;
      this.field_914 = var2;
      this.field_1459 = var3;
      this.field_1407 = var4;
      this.field_1575 = var5;
      this.field_252 = var6;
      this.field_959 = false;
      this.field_1440 = var7;
   }

   public Class12(int var1, int var2, int var3, String var4) {
      this.field_1274 = var1;
      this.field_914 = var2;
      this.field_1459 = var3;
      this.field_1407 = var1;
      this.field_1575 = var2;
      this.field_252 = var3;
      this.field_959 = true;
      this.field_1440 = var4;
   }

   public Class202 method_319() {
      return new Class202(this.field_1274, this.field_914, this.field_1459);
   }
}
