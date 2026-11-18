package ext;

import org.lwjgl.opengl.GL11;

public class Class283 extends Class355 {
   private Interface181 field_414;
   private Interface181 field_129;
   private int field_635 = 0;

   public Class283(Interface181 var1, Interface181 var2) {
      this.field_414 = var1;
      this.field_129 = var2;
      this.field_2868 = false;
      short var3 = 222;
      int var4 = var3 - 108;
      this.field_635 = var2.method_1574() / 9;
      this.field_2029 = var4 + this.field_635 * 18;
      int var5 = (this.field_635 - 4) * 18;

      for (int var6 = 0; var6 < this.field_635; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.field_2443.add(new Class719(this, var2, var7 + var6 * 9, 8 + var7 * 18, 18 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.field_2443.add(new Class719(this, var1, var10 + (var8 + 1) * 9, 8 + var10 * 18, 103 + var8 * 18 + var5));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.field_2443.add(new Class719(this, var1, var9, 8 + var9 * 18, 161 + var5));
      }
   }

   @Override
   protected void method_98() {
      this.field_1683.method_1870(this.field_129.method_18(), 8, 6, 16777215);
      this.field_1683.method_1870(this.field_414.method_18(), 8, this.field_2029 - 96 + 2, 16777215);
   }

   @Override
   protected void method_542(float var1) {
      int var2 = this.field_3013.field_2176.method_1545("/gui/container.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_3013.field_2176.method_462(var2);
      int var3 = (this.field_2345 - this.field_2320) / 2;
      int var4 = (this.field_562 - this.field_2029) / 2;
      this.method_1219(var3, var4, 0, 0, this.field_2320, this.field_635 * 18 + 17);
      this.method_1219(var3, var4 + this.field_635 * 18 + 17, 0, 126, this.field_2320, 96);
   }
}
