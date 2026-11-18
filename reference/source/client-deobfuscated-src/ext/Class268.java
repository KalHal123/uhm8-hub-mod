package ext;

import java.util.ArrayList;
import java.util.List;

public class Class268 extends Class359 {
   private int field_2558 = 0;
   public int field_997 = 0;
   private int field_1307;
   private int field_2042;
   private int field_56;
   public Enum710 field_2296;
   public int field_247;

   public Class268(Class454 var1) {
      super(var1);
      this.field_838 = 0.0F;
      this.method_244(0.5F, 0.5F);
   }

   public Class268(Class454 var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.field_1307 = var2;
      this.field_2042 = var3;
      this.field_56 = var4;
      this.field_247 = var5;
      ArrayList var6 = new ArrayList();

      for (Enum710 var10 : Enum710.method_1827()) {
         this.field_2296 = var10;
         this.method_1196(var5);
         if (this.method_89()) {
            var6.add(var10);
         }
      }

      if (var6.size() > 0) {
         this.field_2296 = (Enum710)var6.get(this.field_2850.nextInt(var6.size()));
         Class119.field_1519.method_1290(new Class104(var6, this));
      }

      this.method_1196(var5);
   }

   public void method_1656(Enum710 var1) {
      this.field_2296 = var1;
      this.method_1196(this.field_247);
   }

   public void method_1196(int var1) {
      this.field_997 = var1;
      this.field_2772 = this.field_1661 = var1 * 90;
      float var2 = this.field_2296.field_758;
      float var3 = this.field_2296.field_1805;
      float var4 = this.field_2296.field_758;
      if (var1 != 0 && var1 != 2) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = this.field_1307 + 0.5F;
      float var6 = this.field_2042 + 0.5F;
      float var7 = this.field_56 + 0.5F;
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
         var5 -= this.method_881(this.field_2296.field_758);
      }

      if (var1 == 1) {
         var7 += this.method_881(this.field_2296.field_758);
      }

      if (var1 == 2) {
         var5 += this.method_881(this.field_2296.field_758);
      }

      if (var1 == 3) {
         var7 -= this.method_881(this.field_2296.field_758);
      }

      var6 += this.method_881(this.field_2296.field_1805);
      this.method_172(var5, var6, var7);
      float var9 = -0.00625F;
      this.field_235.method_327(var5 - var2 - var9, var6 - var3 - var9, var7 - var4 - var9, var5 + var2 + var9, var6 + var3 + var9, var7 + var4 + var9);
   }

   private float method_881(int var1) {
      return var1 == 32 ? 0.5F : (var1 == 64 ? 0.5F : 0.0F);
   }

   @Override
   public void method_46() {
      if (this.field_2558++ == 100 && !this.method_89()) {
         this.field_2558 = 0;
         this.method_1594();
         this.field_1468.method_1447(new Class198(this.field_1468, this.field_1417, this.field_2654, this.field_2013, new Class334(Class755.field_3133)));
      }
   }

   public boolean method_89() {
      if (this.field_1468.method_1325(this, this.field_235).size() > 0) {
         return false;
      }

      int var1 = this.field_2296.field_758 / 16;
      int var2 = this.field_2296.field_1805 / 16;
      int var3 = this.field_1307;
      int var4 = this.field_2042;
      int var5 = this.field_56;
      if (this.field_997 == 0) {
         var3 = Class469.method_468(this.field_1417 - this.field_2296.field_758 / 32.0F);
      }

      if (this.field_997 == 1) {
         var5 = Class469.method_468(this.field_2013 - this.field_2296.field_758 / 32.0F);
      }

      if (this.field_997 == 2) {
         var3 = Class469.method_468(this.field_1417 - this.field_2296.field_758 / 32.0F);
      }

      if (this.field_997 == 3) {
         var5 = Class469.method_468(this.field_2013 - this.field_2296.field_758 / 32.0F);
      }

      var4 = Class469.method_468(this.field_2654 - this.field_2296.field_1805 / 32.0F);

      for (int var7 = 0; var7 < var1; var7++) {
         for (int var6 = 0; var6 < var2; var6++) {
            Class160 var8;
            if (this.field_997 != 0 && this.field_997 != 2) {
               var8 = this.field_1468.method_1286(this.field_1307, var4 + var6, var5 + var7);
            } else {
               var8 = this.field_1468.method_1286(var3 + var7, var4 + var6, this.field_56);
            }

            if (!var8.method_1888()) {
               return false;
            }
         }
      }

      List var11 = this.field_1468.method_1349(this, this.field_235);

      for (int var10 = 0; var10 < var11.size(); var10++) {
         if (var11.get(var10) instanceof Class268) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean method_243() {
      return true;
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      this.method_1594();
      this.field_1468.method_1447(new Class198(this.field_1468, this.field_1417, this.field_2654, this.field_2013, new Class334(Class755.field_3133)));
      return true;
   }

   @Override
   public void method_863(Class686 var1) {
      var1.method_1567("Dir", (byte)this.field_997);
      var1.method_375("Motive", this.field_2296.field_2759);
      var1.method_1310("TileX", this.field_1307);
      var1.method_1310("TileY", this.field_2042);
      var1.method_1310("TileZ", this.field_56);
   }

   @Override
   public void method_1054(Class686 var1) {
      this.field_997 = var1.method_1913("Dir");
      this.field_1307 = var1.method_1747("TileX");
      this.field_2042 = var1.method_1747("TileY");
      this.field_56 = var1.method_1747("TileZ");
      String var2 = var1.method_1087("Motive");

      for (Enum710 var6 : Enum710.method_1827()) {
         if (var6.field_2759.equals(var2)) {
            this.field_2296 = var6;
         }
      }

      if (this.field_2296 == null) {
         this.field_2296 = Enum710.field_287;
      }

      this.method_1196(this.field_997);
   }
}
