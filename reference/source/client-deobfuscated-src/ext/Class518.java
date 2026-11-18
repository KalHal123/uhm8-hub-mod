package ext;

import org.lwjgl.opengl.GL11;

public class Class518 extends Class355 {
   private Class659 field_2792;

   public Class518(Class267 var1, Class659 var2) {
      this.field_2792 = var2;
      this.field_2443.add(new Class719(this, var2, 0, 16, 35));
      this.field_2443.add(new Class719(this, var2, 1, 60, 35));
      this.field_2443.add(new Class719(this, var2, 2, 116, 35));

      for (int var3 = 0; var3 < 3; var3++) {
         for (int var4 = 0; var4 < 9; var4++) {
            this.field_2443.add(new Class719(this, var1, var4 + (var3 + 1) * 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for (int var5 = 0; var5 < 9; var5++) {
         this.field_2443.add(new Class719(this, var1, var5, 8 + var5 * 18, 142));
      }
   }

   @Override
   protected void method_98() {
      this.field_1683.method_1870(this.field_2792.method_18(), 60, 6, 16777215);
      this.field_1683.method_1870("Inventory", 8, this.field_2029 - 96 + 2, 16777215);
   }

   @Override
   protected void method_542(float var1) {
      int var2 = this.field_3013.field_2176.method_1545("/gui/freezer.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_3013.field_2176.method_462(var2);
      int var3 = (this.field_2345 - this.field_2320) / 2;
      int var4 = (this.field_562 - this.field_2029) / 2;
      this.method_1219(var3, var4, 0, 0, this.field_2320, this.field_2029);
      if (this.field_2792.method_864()) {
         int var5 = this.field_2792.method_1645(24);
         this.method_1219(var3 + 36, var4 + 57 - var5, 176, 24 - var5, 20, var5 - 3);
      }

      int var6 = this.field_2792.method_588(24);
      this.method_1219(var3 + 79, var4 + 36, 176, 22, var6 + 1, 16);
   }
}
