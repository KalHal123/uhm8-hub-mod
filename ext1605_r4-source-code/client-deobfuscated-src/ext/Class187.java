package ext;

public class Class187 {
   private int field_2534;
   private int field_2059;
   public int field_2900;

   public Class187(int var1, int var2) {
      this.field_2534 = var1;
      this.field_2059 = var2;
      this.field_2900 = 1;

      while (this.field_2534 / (this.field_2900 + 1) >= 320 && this.field_2059 / (this.field_2900 + 1) >= 240) {
         this.field_2900++;
      }

      this.field_2534 = this.field_2534 / this.field_2900;
      this.field_2059 = this.field_2059 / this.field_2900;
   }

   public int method_884() {
      return this.field_2534;
   }

   public int method_351() {
      return this.field_2059;
   }
}
