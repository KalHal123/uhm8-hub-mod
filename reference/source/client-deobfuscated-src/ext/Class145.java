package ext;

public class Class145 {
   public float[][] field_392 = new float[16][16];
   public float[] field_1100 = new float[16];
   public float[] field_1542 = new float[16];
   public float[] field_900 = new float[16];

   public boolean method_1049(double var1, double var3, double var5, double var7, double var9, double var11) {
      for (int var13 = 0; var13 < 6; var13++) {
         if (this.field_392[var13][0] * var1 + this.field_392[var13][1] * var3 + this.field_392[var13][2] * var5 + this.field_392[var13][3] <= 0.0
            && this.field_392[var13][0] * var7 + this.field_392[var13][1] * var3 + this.field_392[var13][2] * var5 + this.field_392[var13][3] <= 0.0
            && this.field_392[var13][0] * var1 + this.field_392[var13][1] * var9 + this.field_392[var13][2] * var5 + this.field_392[var13][3] <= 0.0
            && this.field_392[var13][0] * var7 + this.field_392[var13][1] * var9 + this.field_392[var13][2] * var5 + this.field_392[var13][3] <= 0.0
            && this.field_392[var13][0] * var1 + this.field_392[var13][1] * var3 + this.field_392[var13][2] * var11 + this.field_392[var13][3] <= 0.0
            && this.field_392[var13][0] * var7 + this.field_392[var13][1] * var3 + this.field_392[var13][2] * var11 + this.field_392[var13][3] <= 0.0
            && this.field_392[var13][0] * var1 + this.field_392[var13][1] * var9 + this.field_392[var13][2] * var11 + this.field_392[var13][3] <= 0.0
            && this.field_392[var13][0] * var7 + this.field_392[var13][1] * var9 + this.field_392[var13][2] * var11 + this.field_392[var13][3] <= 0.0) {
            return false;
         }
      }

      return true;
   }
}
