package ext;

public class Class455 {
   protected int field_1962;
   protected int field_1165;
   public int[] field_1525;
   private Class334 field_2547;
   public final int field_1053;

   public Class455(int var1, int var2, int[] var3, Class334 var4) {
      this.field_1053 = var4.field_1782;
      this.field_1962 = var1;
      this.field_1165 = var2;
      this.field_1525 = var3;
      this.field_2547 = var4;
   }

   public boolean method_1757(int[] var1) {
      for (int var2 = 0; var2 <= 3 - this.field_1962; var2++) {
         for (int var3 = 0; var3 <= 3 - this.field_1165; var3++) {
            if (this.method_1896(var1, var2, var3, true)) {
               return true;
            }

            if (this.method_1896(var1, var2, var3, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean method_1896(int[] var1, int var2, int var3, boolean var4) {
      for (int var5 = 0; var5 < 3; var5++) {
         for (int var6 = 0; var6 < 3; var6++) {
            int var7 = var5 - var2;
            int var8 = var6 - var3;
            int var9 = -1;
            if (var7 >= 0 && var8 >= 0 && var7 < this.field_1962 && var8 < this.field_1165) {
               if (var4) {
                  var9 = this.field_1525[this.field_1962 - var7 - 1 + var8 * this.field_1962];
               } else {
                  var9 = this.field_1525[var7 + var8 * this.field_1962];
               }
            }

            if (var1[var5 + var6 * 3] != var9) {
               return false;
            }
         }
      }

      return true;
   }

   public Class334 method_344(int[] var1) {
      return new Class334(this.field_2547.field_1782, this.field_2547.field_2326);
   }

   public int method_256() {
      return this.field_1962 * this.field_1165;
   }
}
