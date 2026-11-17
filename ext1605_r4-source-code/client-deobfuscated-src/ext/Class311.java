package ext;

import net.minecraft.client.Minecraft;

public class Class311 extends Class563 {
   private Class348 field_1472;
   private int field_1793 = 0;
   private double field_27;
   private double field_358;
   private double field_2887;
   private double field_329;
   private float field_1158;
   private float field_2948;
   private Class267 field_2514 = new Class267((Class354)null);
   private boolean field_1723 = false;

   public Class311(Minecraft var1, Class454 var2, Class277 var3, Class348 var4) {
      super(var1, var2, var3);
      this.field_1472 = var4;
   }

   @Override
   public void method_46() {
      super.method_46();
      if (!this.field_1723) {
         this.field_1472.method_1519(new Class470(this.field_1716));
         this.field_1723 = true;
      }

      this.method_1579();
   }

   @Override
   public void method_1717() {
      this.method_1579();
   }

   public void method_1579() {
      if (this.field_1793++ == 20) {
         if (!this.field_559.method_1081(this.field_2514)) {
            this.field_1472.method_1519(new Class244(-1, this.field_559.field_1518));
            this.field_1472.method_1519(new Class244(-2, this.field_559.field_364));
            this.field_1472.method_1519(new Class244(-3, this.field_559.field_491));
            this.field_2514 = this.field_559.method_1687();
         }

         this.field_1793 = 0;
      }

      double var1 = this.field_1417 - this.field_27;
      double var3 = this.field_235.field_946 - this.field_358;
      double var5 = this.field_2654 - this.field_2887;
      double var7 = this.field_2013 - this.field_329;
      double var9 = this.field_1661 - this.field_1158;
      double var11 = this.field_2866 - this.field_2948;
      boolean var13 = var3 != 0.0 || var5 != 0.0 || var1 != 0.0 || var7 != 0.0;
      boolean var14 = var9 != 0.0 || var11 != 0.0;
      if (var13 && var14) {
         this.field_1472
            .method_1519(
               new Class462(this.field_1417, this.field_235.field_946, this.field_2654, this.field_2013, this.field_1661, this.field_2866, this.field_2669)
            );
      } else if (var13) {
         this.field_1472.method_1519(new Class48(this.field_1417, this.field_235.field_946, this.field_2654, this.field_2013, this.field_2669));
      } else if (var14) {
         this.field_1472.method_1519(new Class632(this.field_1661, this.field_2866, this.field_2669));
      } else {
         this.field_1472.method_1519(new Class288(this.field_2669));
      }

      if (var13) {
         this.field_27 = this.field_1417;
         this.field_358 = this.field_235.field_946;
         this.field_2887 = this.field_2654;
         this.field_329 = this.field_2013;
      }

      if (var14) {
         this.field_1158 = this.field_1661;
         this.field_2948 = this.field_2866;
      }
   }

   @Override
   protected void method_847(Class198 var1) {
      System.out.println("Dropping?");
      Class276 var2 = new Class276(var1);
      this.field_1472.method_1519(var2);
      var1.field_1417 = var2.field_627 / 32.0;
      var1.field_2654 = var2.field_1483 / 32.0;
      var1.field_2013 = var2.field_184 / 32.0;
      var1.field_2549 = var2.field_384 / 128.0;
      var1.field_2501 = var2.field_244 / 128.0;
      var1.field_489 = var2.field_2595 / 128.0;
   }

   @Override
   public void method_413(String var1) {
      if (Class278.field_1860 == null) {
         this.field_1472.method_1519(new Class238(var1));
      } else {
         this.field_1472.method_1519(new Class499(var1, this.field_1472.field_131));
      }
   }

   @Override
   public void method_1385() {
      super.method_1385();
      this.field_1472.method_1519(new Class266(this, 1));
   }
}
