package ext;

import org.lwjgl.opengl.GL11;

public class Class327 extends Class355 {
   public Class658 field_1200 = new Class658();

   public Class327(Class267 var1) {
      this.field_2443.add(new Class719(this, this.field_1200.field_1857, 0, 30, 35));
      this.field_2443.add(new Class719(this, this.field_1200.field_1857, 1, 48, 35));
      this.field_2443.add(new Class719(this, this.field_1200.field_1857, 2, 66, 35));
      this.field_2443.add(new Class313(this, this.field_1200.field_1857, this.field_1200.field_2637, 0, 102, 35));
      this.field_2443.add(new Class313(this, this.field_1200.field_1857, this.field_1200.field_2637, 1, 120, 35));
      this.field_2443.add(new Class313(this, this.field_1200.field_1857, this.field_1200.field_2637, 2, 138, 35));

      for (int var2 = 0; var2 < 3; var2++) {
         for (int var3 = 0; var3 < 9; var3++) {
            this.field_2443.add(new Class719(this, var1, var3 + (var2 + 1) * 9, 8 + var3 * 18, 84 + var2 * 18));
         }
      }

      for (int var4 = 0; var4 < 9; var4++) {
         this.field_2443.add(new Class719(this, var1, var4, 8 + var4 * 18, 142));
      }
   }

   @Override
   public void method_796() {
      super.method_796();
      this.field_1200.method_1459(this.field_3013.field_2787);
   }

   @Override
   protected void method_98() {
      this.field_1683.method_1870("Essence Cloner", 30, 6, 16777215);
      this.field_1683.method_1870("Inventory", 8, this.field_2029 - 96 + 2, 16777215);
   }

   @Override
   protected void method_542(float var1) {
      int var2 = this.field_3013.field_2176.method_1545("/gui/essencecloner.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_3013.field_2176.method_462(var2);
      int var3 = (this.field_2345 - this.field_2320) / 2;
      int var4 = (this.field_562 - this.field_2029) / 2;
      this.method_1219(var3, var4, 0, 0, this.field_2320, this.field_2029);
   }
}
