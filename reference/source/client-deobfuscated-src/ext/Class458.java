package ext;

import org.lwjgl.opengl.GL11;

public class Class458 extends Class355 {
   public Class545 field_270 = new Class545();

   @Override
   public void method_836() {
      this.field_577.clear();
      this.field_577.add(new Class220(this, 0, this.field_2345 / 2 + 7, this.field_562 / 2 - 25, 75, "Confirm >>", 0.0F));
      this.field_577.get(0).field_143 = true;
   }

   public Class458(Class267 var1) {
      this.method_836();

      for (int var2 = 0; var2 < 3; var2++) {
         for (int var3 = 0; var3 < 3; var3++) {
            this.field_2443.add(new Class719(this, this.field_270.field_312, var3 + var2 * 3, 30 + var3 * 18, 17 + var2 * 18));
         }
      }

      this.field_2443.add(new Class719(this, this.field_270.field_1232, 0, 138, 35));
      this.field_2443.add(new Class719(this, this.field_270.field_1232, 1, 102, 35));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.field_2443.add(new Class719(this, var1, var6 + (var4 + 1) * 9, 8 + var6 * 18, 84 + var4 * 18));
         }
      }

      for (int var5 = 0; var5 < 9; var5++) {
         this.field_2443.add(new Class719(this, var1, var5, 8 + var5 * 18, 142));
      }
   }

   @Override
   public void method_220() {
      if (this.field_270.field_1232.field_2398[1] == null && this.field_270.field_1232.field_2398[0] == null) {
         for (int var1 = 0; var1 != 9; var1++) {
            this.field_270.field_312.field_2251[var1] = null;
         }

         this.field_270.field_1232.field_2398[0] = null;
         this.field_270.field_1232.field_2398[1] = null;
         int var3 = this.field_270.field_629;
         int var2 = 0;
         if (var3 > 64) {
            var2 = var3 / 9;
            var3 %= 9;
         }

         Class119.field_1519.field_813.field_776.method_872(this, this.field_270.field_629);
         if (var2 != 0) {
            this.field_270.field_1232.field_2398[1] = new Class334(Class390.field_801, var2);
         }

         if (var3 != 0) {
            this.field_270.field_1232.field_2398[0] = new Class334(Class50.field_2952, var3);
         }

         this.field_270.field_629 = 0;
      }
   }

   @Override
   public void method_796() {
      super.method_796();
      this.field_270.method_6(this.field_3013.field_2787);
   }

   @Override
   protected void method_98() {
      this.field_1683.method_1870("Essence Transformer", 30, 6, 16777215);
      this.field_1683.method_1870("Essence Value:", 90, 16, 16777215);
      this.field_1683.method_1870(this.field_270.field_629 + "e", 90, 26, 16777215);
      this.field_1683.method_1870("Inventory", 8, this.field_2029 - 96 + 2, 16777215);
   }

   @Override
   protected void method_542(float var1) {
      int var2 = this.field_3013.field_2176.method_1545("/gui/essencetransformer.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_3013.field_2176.method_462(var2);
      int var3 = (this.field_2345 - this.field_2320) / 2;
      int var4 = (this.field_562 - this.field_2029) / 2;
      this.method_1219(var3, var4, 0, 0, this.field_2320, this.field_2029);
   }
}
