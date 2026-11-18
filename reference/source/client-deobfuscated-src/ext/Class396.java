package ext;

public class Class396 extends Class564 {
   public int field_2005 = -1;

   public Class396(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/collosal_a.png";
      this.field_2079 = 0.5F;
      this.field_498 = 50;
      this.field_838 *= 6.0F;
      this.method_244(this.field_811 * 6.0F, this.field_1443 * 6.0F);
      Class730.field_2746 = true;
      Class730.field_7 = this;
      Class730.field_2045 = "Dormant Giant";
   }

   public Class396(Class454 var1, int var2) {
      super(var1);
      if (var2 <= 0) {
         var2 = 1;
      }

      this.field_2863 = "/mob/collosal_a.png";
      this.field_2079 = 0.5F;
      this.field_498 = 50;
      this.field_2572 = this.field_2572 * Math.min(4 * var2, 800);
      this.field_2005 = this.field_2572;
      this.field_838 *= 6.0F;
      this.method_244(this.field_811 * 6.0F, this.field_1443 * 6.0F);
   }

   @Override
   protected float method_723(int var1, int var2, int var3) {
      return this.field_1468.method_1154(var1, var2, var3) - 0.5F;
   }

   @Override
   protected void method_1318(float var1) {
   }

   @Override
   protected String method_1909() {
      return "ext.giantambient";
   }

   @Override
   protected String method_1682() {
      return "ext.gianthurt";
   }

   @Override
   protected String method_1171() {
      return "ext.giantdead";
   }

   @Override
   public void method_863(Class686 var1) {
      var1.method_375("BossName", Class730.field_2045);
      var1.method_1310("BossMaxHP", this.field_2005);
      super.method_863(var1);
   }

   @Override
   public void method_1054(Class686 var1) {
      Class730.field_2045 = var1.method_1087("BossName");
      this.field_2005 = var1.method_1747("BossMaxHP");
      super.method_1054(var1);
   }

   @Override
   public void method_379(Class359 var1) {
      Class730.method_24(this);
      super.method_379(var1);
      if (this.field_2850.nextInt(50) > 10) {
         this.method_203(Class50.field_2502.field_10, 1);
      }
   }

   @Override
   public void method_22() {
      super.method_22();
      if (this.field_2005 == -1) {
         this.field_2005 = this.field_2572;
      }
   }

   @Override
   public void method_1594() {
      super.method_1594();
   }

   @Override
   public int method_1313() {
      return 36 + this.field_2850.nextInt(12);
   }
}
