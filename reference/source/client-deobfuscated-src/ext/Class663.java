package ext;

import net.minecraft.client.Minecraft;

public class Class663 {
   protected final Minecraft field_2987;
   public boolean field_1729 = false;

   public Class663(Minecraft var1) {
      this.field_2987 = var1;
   }

   public void method_820(Class454 var1) {
   }

   public void method_823(int var1, int var2, int var3, int var4) {
      this.method_1065(var1, var2, var3, var4);
   }

   public boolean method_1065(int var1, int var2, int var3, int var4) {
      this.field_2987.field_2681.method_940(var1, var2, var3);
      Class454 var5 = this.field_2987.field_2648;
      Class108 var6 = Class108.field_1221[var5.method_197(var1, var2, var3)];
      int var7 = var5.method_1110(var1, var2, var3);
      boolean var8 = var5.method_1481(var1, var2, var3, 0);
      if (var6 != null && var8) {
         this.field_2987
            .field_485
            .method_68(
               var6.field_972.method_947(),
               var1 + 0.5F,
               var2 + 0.5F,
               var3 + 0.5F,
               (var6.field_972.method_1010() + 1.0F) / 2.0F,
               var6.field_972.method_1263() * 0.8F
            );
         var6.method_493(var5, var1, var2, var3, var7);
      }

      return var8;
   }

   public void method_1585(int var1, int var2, int var3, int var4) {
   }

   public void method_988() {
   }

   public void method_1601(float var1) {
   }

   public float method_229() {
      return 5.0F;
   }

   public void method_1639(Class354 var1) {
   }

   public void method_1177() {
   }

   public boolean method_1746() {
      return true;
   }

   public void method_1476(Class354 var1) {
   }

   public boolean method_1830(Class354 var1, Class454 var2, Class334 var3, int var4, int var5, int var6, int var7) {
      int var8 = var2.method_197(var4, var5, var6);
      return var8 > 0 && Class108.field_1221[var8].method_835(var2, var4, var5, var6, var1)
         ? true
         : (var3 == null ? false : var3.method_731(var1, var2, var4, var5, var6, var7));
   }

   public Class354 method_1067(Class454 var1) {
      if (var1 instanceof Class262) {
         return new Class213(this.field_2987, (Class262)var1, this.field_2987.field_2935);
      } else if (var1 instanceof Class46) {
         return new Class404(this.field_2987, (Class46)var1, this.field_2987.field_2935);
      } else {
         return Minecraft.field_1601
            ? new Class205(this.field_2987, var1, this.field_2987.field_2935)
            : new Class563(this.field_2987, var1, this.field_2987.field_2935);
      }
   }
}
