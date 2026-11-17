package ext;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class Class601 extends Class145 {
   private static Class601 field_1123 = new Class601();
   private FloatBuffer field_1456 = Class504.method_8(16);
   private FloatBuffer field_966 = Class504.method_8(16);
   private FloatBuffer field_2070 = Class504.method_8(16);

   public static Class145 method_1236() {
      field_1123.method_1041();
      return field_1123;
   }

   private void method_862(float[][] var1, int var2) {
      float var3 = Class469.method_254(var1[var2][0] * var1[var2][0] + var1[var2][1] * var1[var2][1] + var1[var2][2] * var1[var2][2]);
      var1[var2][0] = var1[var2][0] / var3;
      var1[var2][1] = var1[var2][1] / var3;
      var1[var2][2] = var1[var2][2] / var3;
      var1[var2][3] = var1[var2][3] / var3;
   }

   private void method_1041() {
      ((Buffer)this.field_1456).clear();
      ((Buffer)this.field_966).clear();
      ((Buffer)this.field_2070).clear();
      GL11.glGetFloat(2983, this.field_1456);
      GL11.glGetFloat(2982, this.field_966);
      ((Buffer)this.field_1456).flip().limit(16);
      this.field_1456.get(this.field_1100);
      ((Buffer)this.field_966).flip().limit(16);
      this.field_966.get(this.field_1542);
      this.field_900[0] = this.field_1542[0] * this.field_1100[0]
         + this.field_1542[1] * this.field_1100[4]
         + this.field_1542[2] * this.field_1100[8]
         + this.field_1542[3] * this.field_1100[12];
      this.field_900[1] = this.field_1542[0] * this.field_1100[1]
         + this.field_1542[1] * this.field_1100[5]
         + this.field_1542[2] * this.field_1100[9]
         + this.field_1542[3] * this.field_1100[13];
      this.field_900[2] = this.field_1542[0] * this.field_1100[2]
         + this.field_1542[1] * this.field_1100[6]
         + this.field_1542[2] * this.field_1100[10]
         + this.field_1542[3] * this.field_1100[14];
      this.field_900[3] = this.field_1542[0] * this.field_1100[3]
         + this.field_1542[1] * this.field_1100[7]
         + this.field_1542[2] * this.field_1100[11]
         + this.field_1542[3] * this.field_1100[15];
      this.field_900[4] = this.field_1542[4] * this.field_1100[0]
         + this.field_1542[5] * this.field_1100[4]
         + this.field_1542[6] * this.field_1100[8]
         + this.field_1542[7] * this.field_1100[12];
      this.field_900[5] = this.field_1542[4] * this.field_1100[1]
         + this.field_1542[5] * this.field_1100[5]
         + this.field_1542[6] * this.field_1100[9]
         + this.field_1542[7] * this.field_1100[13];
      this.field_900[6] = this.field_1542[4] * this.field_1100[2]
         + this.field_1542[5] * this.field_1100[6]
         + this.field_1542[6] * this.field_1100[10]
         + this.field_1542[7] * this.field_1100[14];
      this.field_900[7] = this.field_1542[4] * this.field_1100[3]
         + this.field_1542[5] * this.field_1100[7]
         + this.field_1542[6] * this.field_1100[11]
         + this.field_1542[7] * this.field_1100[15];
      this.field_900[8] = this.field_1542[8] * this.field_1100[0]
         + this.field_1542[9] * this.field_1100[4]
         + this.field_1542[10] * this.field_1100[8]
         + this.field_1542[11] * this.field_1100[12];
      this.field_900[9] = this.field_1542[8] * this.field_1100[1]
         + this.field_1542[9] * this.field_1100[5]
         + this.field_1542[10] * this.field_1100[9]
         + this.field_1542[11] * this.field_1100[13];
      this.field_900[10] = this.field_1542[8] * this.field_1100[2]
         + this.field_1542[9] * this.field_1100[6]
         + this.field_1542[10] * this.field_1100[10]
         + this.field_1542[11] * this.field_1100[14];
      this.field_900[11] = this.field_1542[8] * this.field_1100[3]
         + this.field_1542[9] * this.field_1100[7]
         + this.field_1542[10] * this.field_1100[11]
         + this.field_1542[11] * this.field_1100[15];
      this.field_900[12] = this.field_1542[12] * this.field_1100[0]
         + this.field_1542[13] * this.field_1100[4]
         + this.field_1542[14] * this.field_1100[8]
         + this.field_1542[15] * this.field_1100[12];
      this.field_900[13] = this.field_1542[12] * this.field_1100[1]
         + this.field_1542[13] * this.field_1100[5]
         + this.field_1542[14] * this.field_1100[9]
         + this.field_1542[15] * this.field_1100[13];
      this.field_900[14] = this.field_1542[12] * this.field_1100[2]
         + this.field_1542[13] * this.field_1100[6]
         + this.field_1542[14] * this.field_1100[10]
         + this.field_1542[15] * this.field_1100[14];
      this.field_900[15] = this.field_1542[12] * this.field_1100[3]
         + this.field_1542[13] * this.field_1100[7]
         + this.field_1542[14] * this.field_1100[11]
         + this.field_1542[15] * this.field_1100[15];
      this.field_392[0][0] = this.field_900[3] - this.field_900[0];
      this.field_392[0][1] = this.field_900[7] - this.field_900[4];
      this.field_392[0][2] = this.field_900[11] - this.field_900[8];
      this.field_392[0][3] = this.field_900[15] - this.field_900[12];
      this.method_862(this.field_392, 0);
      this.field_392[1][0] = this.field_900[3] + this.field_900[0];
      this.field_392[1][1] = this.field_900[7] + this.field_900[4];
      this.field_392[1][2] = this.field_900[11] + this.field_900[8];
      this.field_392[1][3] = this.field_900[15] + this.field_900[12];
      this.method_862(this.field_392, 1);
      this.field_392[2][0] = this.field_900[3] + this.field_900[1];
      this.field_392[2][1] = this.field_900[7] + this.field_900[5];
      this.field_392[2][2] = this.field_900[11] + this.field_900[9];
      this.field_392[2][3] = this.field_900[15] + this.field_900[13];
      this.method_862(this.field_392, 2);
      this.field_392[3][0] = this.field_900[3] - this.field_900[1];
      this.field_392[3][1] = this.field_900[7] - this.field_900[5];
      this.field_392[3][2] = this.field_900[11] - this.field_900[9];
      this.field_392[3][3] = this.field_900[15] - this.field_900[13];
      this.method_862(this.field_392, 3);
      this.field_392[4][0] = this.field_900[3] - this.field_900[2];
      this.field_392[4][1] = this.field_900[7] - this.field_900[6];
      this.field_392[4][2] = this.field_900[11] - this.field_900[10];
      this.field_392[4][3] = this.field_900[15] - this.field_900[14];
      this.method_862(this.field_392, 4);
      this.field_392[5][0] = this.field_900[3] + this.field_900[2];
      this.field_392[5][1] = this.field_900[7] + this.field_900[6];
      this.field_392[5][2] = this.field_900[11] + this.field_900[10];
      this.field_392[5][3] = this.field_900[15] + this.field_900[14];
      this.method_862(this.field_392, 5);
   }
}
