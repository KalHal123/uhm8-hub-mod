package ext;

public class Class713 extends Class377 implements Interface753 {
   public float field_2375;
   public float field_697;
   private int field_2543 = 0;
   public int field_700 = 1;

   public Class713(Class454 var1) {
      super(var1);
      this.field_2863 = "/mob/slime.png";
      this.field_700 = 1 << this.field_2850.nextInt(3);
      this.field_838 = 0.0F;
      this.field_2543 = this.field_2850.nextInt(20) + 10;
      this.method_927(this.field_700);
   }

   public void method_927(int var1) {
      this.field_700 = var1;
      this.method_244(0.6F * var1, 0.6F * var1);
      this.field_2572 = var1 * var1;
      this.method_172(this.field_1417, this.field_2654, this.field_2013);
   }

   @Override
   public void method_863(Class686 var1) {
      super.method_863(var1);
      var1.method_1310("Size", this.field_700 - 1);
   }

   @Override
   public void method_1054(Class686 var1) {
      super.method_1054(var1);
      this.field_700 = var1.method_1747("Size") + 1;
   }

   @Override
   public void method_46() {
      this.field_697 = this.field_2375;
      boolean var1 = this.field_2669;
      super.method_46();
      if (this.field_2669 && !var1) {
         for (int var2 = 0; var2 < this.field_700 * 8; var2++) {
            float var3 = this.field_2850.nextFloat() * (float) Math.PI * 2.0F;
            float var4 = this.field_2850.nextFloat() * 0.5F + 0.5F;
            float var5 = Class469.method_1667(var3) * this.field_700 * 0.5F * var4;
            float var6 = Class469.method_255(var3) * this.field_700 * 0.5F * var4;
            this.field_1468.method_1347("slime", this.field_1417 + var5, this.field_235.field_946, this.field_2013 + var6, 0.0, 0.0, 0.0);
         }

         if (this.field_700 > 2) {
            this.field_1468
               .method_1904(this, "mob.slime", this.method_550(), ((this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.field_2375 = -0.5F;
      }

      this.field_2375 *= 0.6F;
   }

   @Override
   protected void method_1215() {
      Class354 var1 = this.field_1468.method_1288(this, 16.0);
      if (var1 != null) {
         this.method_537(var1, 10.0F);
      }

      if (this.field_2669 && this.field_2543-- <= 0) {
         this.field_2543 = this.field_2850.nextInt(20) + 10;
         if (var1 != null) {
            this.field_2543 /= 3;
         }

         this.field_2698 = true;
         if (this.field_700 > 1) {
            this.field_1468
               .method_1904(this, "mob.slime", this.method_550(), ((this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.field_2375 = 1.0F;
         this.field_1818 = 1.0F - this.field_2850.nextFloat() * 2.0F;
         this.field_269 = 1 * this.field_700;
      } else {
         this.field_2698 = false;
         if (this.field_2669) {
            this.field_1818 = this.field_269 = 0.0F;
         }
      }
   }

   @Override
   public void method_1594() {
      if (this.field_700 > 1 && this.field_2572 == 0) {
         for (int var1 = 0; var1 < 4; var1++) {
            float var2 = (var1 % 2 - 0.5F) * this.field_700 / 4.0F;
            float var3 = (var1 / 2 - 0.5F) * this.field_700 / 4.0F;
            Class713 var4 = new Class713(this.field_1468);
            var4.method_927(this.field_700 / 2);
            var4.method_253(this.field_1417 + var2, this.field_2654 + 0.5, this.field_2013 + var3, this.field_2850.nextFloat() * 360.0F, 0.0F);
            this.field_1468.method_1447(var4);
         }
      }

      super.method_1594();
   }

   @Override
   public void method_1714(Class354 var1) {
      if (this.field_700 > 1 && this.method_689(var1) && this.method_304(var1) < 0.6 * this.field_700 && var1.method_308(this, this.field_700)) {
         this.field_1468.method_1904(this, "mob.slimeattack", 1.0F, (this.field_2850.nextFloat() - this.field_2850.nextFloat()) * 0.2F + 1.0F);
      }
   }

   @Override
   protected String method_1682() {
      return "mob.slime";
   }

   @Override
   protected String method_1171() {
      return "mob.slime";
   }

   @Override
   protected int method_291() {
      return this.field_700 == 1 ? Class755.field_2584.field_10 : 0;
   }

   @Override
   public boolean method_713() {
      Class741 var1 = this.field_1468.method_964(Class469.method_468(this.field_1417), Class469.method_468(this.field_2654));
      return (this.field_700 == 1 || this.field_1468.field_1535 > 0)
         && this.field_2850.nextInt(10) == 0
         && var1.method_408(987234911L).nextInt(10) == 0
         && this.field_2654 < 16.0;
   }

   @Override
   protected float method_550() {
      return 0.6F;
   }
}
