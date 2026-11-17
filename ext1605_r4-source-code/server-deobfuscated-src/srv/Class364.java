package srv;

import java.util.ArrayList;
import java.util.List;

public class Class364 extends Class252 {
   private int field_522 = 0;
   public int field_1367 = 0;
   private int field_645;
   private int field_964;
   private int field_1523;
   public Enum256 field_1304;

   public Class364(Class317 var1) {
      super(var1);
      this.field_855 = 0.0F;
      this.method_273(0.5F, 0.5F);
   }

   public Class364(Class317 var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.field_645 = var2;
      this.field_964 = var3;
      this.field_1523 = var4;
      ArrayList var6 = new ArrayList();

      for (Enum256 var10 : Enum256.method_457()) {
         this.field_1304 = var10;
         this.method_805(var5);
         if (this.method_216()) {
            var6.add(var10);
         }
      }

      if (var6.size() > 0) {
         this.field_1304 = (Enum256)var6.get(this.field_697.nextInt(var6.size()));
      }

      this.method_805(var5);
   }

   public void method_805(int var1) {
      this.field_1367 = var1;
      this.field_90 = this.field_909 = var1 * 90;
      float var2 = this.field_1304.field_1143;
      float var3 = this.field_1304.field_736;
      float var4 = this.field_1304.field_1143;
      if (var1 != 0 && var1 != 2) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = this.field_645 + 0.5F;
      float var6 = this.field_964 + 0.5F;
      float var7 = this.field_1523 + 0.5F;
      float var8 = 0.5625F;
      if (var1 == 0) {
         var7 -= var8;
      }

      if (var1 == 1) {
         var5 -= var8;
      }

      if (var1 == 2) {
         var7 += var8;
      }

      if (var1 == 3) {
         var5 += var8;
      }

      if (var1 == 0) {
         var5 -= this.method_543(this.field_1304.field_1143);
      }

      if (var1 == 1) {
         var7 += this.method_543(this.field_1304.field_1143);
      }

      if (var1 == 2) {
         var5 += this.method_543(this.field_1304.field_1143);
      }

      if (var1 == 3) {
         var7 -= this.method_543(this.field_1304.field_1143);
      }

      var6 += this.method_543(this.field_1304.field_736);
      this.method_732(var5, var6, var7);
      float var9 = -0.00625F;
      this.field_106.method_268(var5 - var2 - var9, var6 - var3 - var9, var7 - var4 - var9, var5 + var2 + var9, var6 + var3 + var9, var7 + var4 + var9);
   }

   private float method_543(int var1) {
      return var1 == 32 ? 0.5F : (var1 == 64 ? 0.5F : 0.0F);
   }

   @Override
   public void method_439() {
      if (this.field_522++ == 100 && !this.method_216()) {
         this.field_522 = 0;
         this.method_715();
         this.field_796.method_237(new Class39(this.field_796, this.field_1324, this.field_632, this.field_1321, new Class150(Class350.field_1120)));
      }
   }

   public boolean method_216() {
      if (this.field_796.method_893(this, this.field_106).size() > 0) {
         return false;
      }

      int var1 = this.field_1304.field_1143 / 16;
      int var2 = this.field_1304.field_736 / 16;
      int var3 = this.field_645;
      int var4 = this.field_964;
      int var5 = this.field_1523;
      if (this.field_1367 == 0) {
         var3 = Class380.method_502(this.field_1324 - this.field_1304.field_1143 / 32.0F);
      }

      if (this.field_1367 == 1) {
         var5 = Class380.method_502(this.field_1321 - this.field_1304.field_1143 / 32.0F);
      }

      if (this.field_1367 == 2) {
         var3 = Class380.method_502(this.field_1324 - this.field_1304.field_1143 / 32.0F);
      }

      if (this.field_1367 == 3) {
         var5 = Class380.method_502(this.field_1321 - this.field_1304.field_1143 / 32.0F);
      }

      var4 = Class380.method_502(this.field_632 - this.field_1304.field_736 / 32.0F);

      for (int var7 = 0; var7 < var1; var7++) {
         for (int var6 = 0; var6 < var2; var6++) {
            Class111 var8;
            if (this.field_1367 != 0 && this.field_1367 != 2) {
               var8 = this.field_796.method_149(this.field_645, var4 + var6, var5 + var7);
            } else {
               var8 = this.field_796.method_149(var3 + var7, var4 + var6, this.field_1523);
            }

            if (!var8.method_325()) {
               return false;
            }
         }
      }

      List var11 = this.field_796.method_362(this, this.field_106);

      for (int var10 = 0; var10 < var11.size(); var10++) {
         if (var11.get(var10) instanceof Class364) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean method_947() {
      return true;
   }

   @Override
   public boolean method_671(Class252 var1, int var2) {
      this.method_715();
      this.field_796.method_237(new Class39(this.field_796, this.field_1324, this.field_632, this.field_1321, new Class150(Class350.field_1120)));
      return true;
   }

   @Override
   public void method_422(Class100 var1) {
      var1.method_1003("Dir", (byte)this.field_1367);
      var1.method_152("Motive", this.field_1304.field_35);
      var1.method_32("TileX", this.field_645);
      var1.method_32("TileY", this.field_964);
      var1.method_32("TileZ", this.field_1523);
   }

   @Override
   public void method_134(Class100 var1) {
      this.field_1367 = var1.method_561("Dir");
      this.field_645 = var1.method_159("TileX");
      this.field_964 = var1.method_159("TileY");
      this.field_1523 = var1.method_159("TileZ");
      String var2 = var1.method_219("Motive");

      for (Enum256 var6 : Enum256.method_457()) {
         if (var6.field_35.equals(var2)) {
            this.field_1304 = var6;
         }
      }

      if (this.field_1304 == null) {
         this.field_1304 = Enum256.field_1527;
      }

      this.method_805(this.field_1367);
   }
}
