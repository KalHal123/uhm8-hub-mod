package ext;

import net.minecraft.client.Minecraft;

public class Class563 extends Class354 {
   public Class184 field_1347;
   protected Minecraft field_2180;
   public int field_1796 = 0;
   protected long field_1264 = 0L;
   protected long field_2250 = 0L;
   protected long field_2056 = 0L;
   protected long field_3055 = 0L;

   public Class563(Minecraft var1, Class454 var2, Class277 var3) {
      super(var2);
      this.field_2180 = var1;
      if (var3 != null && var3.field_382 != null && var3.field_382.length() > 0) {
         this.field_1795 = var3.field_382;
         System.out.println("Loading texture " + this.field_1795);
      }

      this.field_1716 = var3.field_382;
   }

   @Override
   public void method_1215() {
      super.method_1215();
      this.field_1818 = this.field_1347.field_2082;
      this.field_269 = this.field_1347.field_2154;
      if (this.method_296() && this.method_482(Class160.field_1413)) {
         this.field_269 /= 2.0F;
         this.field_1818 /= 2.0F;
      }

      this.field_2698 = this.field_1347.field_478;
   }

   public void method_1242() {
      super.method_501();
   }

   public void method_163() {
      super.method_22();
   }

   public void method_1239() {
      long var1 = (long)this.field_1417;
      long var3 = (long)this.field_2013;
      if (var1 != this.field_2056 || var3 != this.field_3055) {
         this.field_2056 = var1;
         this.field_3055 = var3;
         Class730.method_1055(this, this.field_1468);
      }
   }

   public void method_935() {
      long var1 = (long)this.field_1417;
      long var3 = (long)this.field_2013;
      long var5 = var1 / 32L;
      long var7 = var3 / 32L;
      if (this.field_1264 != var5 || this.field_2250 != var7) {
         this.field_1264 = var5;
         this.field_2250 = var7;
         Class730.method_857(this, this.field_1468);
      }
   }

   @Override
   public void method_22() {
      this.field_1999 = !this.field_132;
      this.field_1347.method_534(this);
      if (this.field_1347.field_647 && this.field_663 < 0.2F) {
         this.field_663 = 0.2F;
      }

      if (this.field_1804 < 150 && this.field_1804 % 15 == 0) {
         int var1 = 1 + this.field_2850.nextInt(this.method_296() ? 2 : 5);

         for (int var2 = 0; var2 != var1; var2++) {
            this.field_1468.method_1347("bubble", this.field_1417, this.field_2654, this.field_2013 + var2 / var1 * 0.2F, 0.0, 0.5, 0.0);
         }
      }

      if (this.field_1796 > 0) {
         this.field_1796--;
         if (this.field_1796 == 0) {
            this.field_2180.field_2648.method_861(this.field_1417, this.field_2654, this.field_2013, "ext.recharg", 0.6F, 1.0F);
         }
      }

      this.method_1239();
      this.method_935();
      this.field_132 = Class310.field_521;
      super.method_22();
      if (this.field_132) {
         if (Class119.method_696(Class119.field_1519.field_1754.field_922.field_2381)) {
            this.field_2501 = 1.0;
         } else if (Class119.method_696(Class119.field_1519.field_1754.field_1386.field_2381)) {
            this.field_2501 = -1.0;
         } else {
            this.field_2501 = 0.0;
         }
      }
   }

   public void method_791() {
      this.field_1347.method_1114();
   }

   public void method_1611(int var1, boolean var2) {
      this.field_1347.method_1143(var1, var2);
   }

   @Override
   public void method_863(Class686 var1) {
      super.method_863(var1);
      var1.method_1310("Score", this.field_3036);
   }

   @Override
   public void method_1054(Class686 var1) {
      super.method_1054(var1);
      this.field_3036 = var1.method_1747("Score");
   }

   @Override
   public void method_1725() {
      this.field_2180.method_1290(new Class648());
   }

   @Override
   public void method_1217(Interface181 var1) {
      this.field_2180.method_1290(new Class283(this.field_559, var1));
   }

   @Override
   public void method_1083(Class243 var1) {
      this.field_2180.method_1290(new Class286(var1));
   }

   @Override
   public void method_1070() {
      this.field_2180.method_1290(new Class168(this.field_559));
   }

   @Override
   public void method_699() {
      this.field_2180.method_1290(new Class458(this.field_559));
   }

   @Override
   public void method_472() {
      this.field_2180.method_1290(new Class327(this.field_559));
   }

   @Override
   public void method_1011(Class659 var1) {
      this.field_2180.method_1290(new Class518(this.field_559, var1));
   }

   @Override
   public void method_1790(Class38 var1) {
      this.field_2180.method_1290(new Class142(this.field_559, var1));
   }

   public void method_1569(Class359 var1) {
      int var2 = this.field_559.method_90(var1);
      if (var2 > 0) {
         var1.method_308(this, var2);
         Class334 var3 = this.method_1857();
         if (var3 != null && var1 instanceof Class377) {
            var3.method_1078((Class377)var1);
            if (var3.field_2326 <= 0) {
               var3.method_32(this);
               this.method_1625();
            }
         }
      }
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      if (Class119.field_1477) {
         return true;
      }

      if (var1 instanceof Class547) {
         var2 /= 3;
      }

      if (this.field_2180.field_1754.field_2564 != 4) {
         return super.method_308(var1, var2);
      }

      if (this.field_2572 <= 0) {
         return false;
      }

      if (this.field_1659 > this.field_444 / 2.0F) {
         return false;
      }

      this.field_1659 = this.field_444;
      System.out.println("Damage taken: " + var2);
      if (this.field_559.method_239() == 0) {
         this.field_2572 = 0;
         this.method_379((Class359)null);
         this.field_1468.method_1904(this, "random.glass", 1.0F, 1.0F);
      } else {
         this.field_1468.method_1904(this, "ext.crack", 1.0F, 1.0F);
         byte var3 = 0;

         for (int var4 = 0; var4 != 4; var4++) {
            var3 += this.field_559.method_1047(var4) == null ? 0 : 1;
         }

         this.field_559.method_1595(var2 * 16 / var3);
      }

      return true;
   }

   @Override
   public void method_1132(Class359 var1, int var2) {
      this.field_2180.field_2681.method_206(new Class388(this.field_2180.field_2648, var1, this, -0.5F));
   }

   public int method_1572() {
      return this.field_559.method_239();
   }

   @Override
   public void method_1492(Class359 var1) {
      if (!var1.method_30(this)) {
         Class334 var2 = this.method_1857();
         if (var2 != null && var1 instanceof Class377) {
            var2.method_1184((Class377)var1);
            if (var2.field_2326 <= 0) {
               var2.method_32(this);
               this.method_1625();
            }
         }
      }
   }

   public void method_413(String var1) {
      this.field_2180.field_964.method_967(this.field_1716 + "> " + var1);
   }

   public void method_1717() {
   }

   @Override
   public boolean method_296() {
      return this.field_1347.field_647;
   }

   public void method_126(Minecraft var1) {
      var1.method_1290(new Class392(this.field_559, this.field_559.field_364));
   }

   public void method_146(Object var1) {
      Class265 var2 = Class3.method_245(this, var1);
      if (var2 != null) {
         this.field_2180.method_1290(var2);
      }
   }

   public boolean method_70(Class<? extends Class265> var1) {
      return var1 == null ? this.field_2180.field_1883 == null : var1.isInstance(this.field_2180.field_1883);
   }
}
