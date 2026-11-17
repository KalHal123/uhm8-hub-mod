package ext;

public class Class529 extends Class186 {
   public int field_874 = -1;
   public String field_34 = "Pig";
   public double field_2630;
   public double field_3146 = 0.0;

   public boolean method_1819() {
      return this.field_1380.method_230(this.field_2878 + 0.5, this.field_883 + 0.5, this.field_921 + 0.5, 16.0) != null;
   }

   @Override
   public void method_1176() {
      this.field_3146 = this.field_2630;
      if (this.method_1819()) {
         double var1 = this.field_2878 + this.field_1380.field_2150.nextFloat();
         double var3 = this.field_883 + this.field_1380.field_2150.nextFloat();
         double var5 = this.field_921 + this.field_1380.field_2150.nextFloat();
         this.field_1380.method_1347("smoke", var1, var3, var5, 0.0, 0.0, 0.0);
         this.field_1380.method_1347("flame", var1, var3, var5, 0.0, 0.0, 0.0);

         for (this.field_2630 = this.field_2630 + 1000.0F / (this.field_874 + 200.0F); this.field_2630 > 360.0; this.field_3146 -= 360.0) {
            this.field_2630 -= 360.0;
         }

         if (this.field_874 == -1) {
            this.method_1209();
         }

         if (this.field_874 > 0) {
            this.field_874--;
         } else {
            byte var7 = 4;

            for (int var8 = 0; var8 < var7; var8++) {
               Class377 var9 = (Class377)Class174.method_1826(this.field_34, this.field_1380);
               if (var9 == null) {
                  return;
               }

               int var10 = this.field_1380
                  .method_288(
                     (Class<? extends Class359>)var9.getClass(),
                     Class630.method_969(this.field_2878, this.field_883, this.field_921, this.field_2878 + 1, this.field_883 + 1, this.field_921 + 1)
                        .method_1384(8.0, 4.0, 8.0)
                  )
                  .size();
               if (var10 >= 6) {
                  this.method_1209();
                  return;
               }

               if (var9 != null) {
                  double var11 = this.field_2878 + (this.field_1380.field_2150.nextDouble() - this.field_1380.field_2150.nextDouble()) * 4.0;
                  double var13 = this.field_883 + this.field_1380.field_2150.nextInt(3) - 1;
                  double var15 = this.field_921 + (this.field_1380.field_2150.nextDouble() - this.field_1380.field_2150.nextDouble()) * 4.0;
                  var9.method_253(var11, var13, var15, this.field_1380.field_2150.nextFloat() * 360.0F, 0.0F);
                  if (var9.method_713()) {
                     this.field_1380.method_1447(var9);

                     for (int var17 = 0; var17 < 20; var17++) {
                        var1 = this.field_2878 + 0.5 + (this.field_1380.field_2150.nextFloat() - 0.5) * 2.0;
                        var3 = this.field_883 + 0.5 + (this.field_1380.field_2150.nextFloat() - 0.5) * 2.0;
                        var5 = this.field_921 + 0.5 + (this.field_1380.field_2150.nextFloat() - 0.5) * 2.0;
                        this.field_1380.method_1347("smoke", var1, var3, var5, 0.0, 0.0, 0.0);
                        this.field_1380.method_1347("flame", var1, var3, var5, 0.0, 0.0, 0.0);
                     }

                     var9.method_1455();
                     this.method_1209();
                  }
               }
            }

            super.method_1176();
         }
      }
   }

   private void method_1209() {
      this.field_874 = 200 + this.field_1380.field_2150.nextInt(600);
   }

   @Override
   public void method_434(Class686 var1) {
      super.method_434(var1);
      this.field_34 = var1.method_1087("EntityId");
      this.field_874 = var1.method_1321("Delay");
   }

   @Override
   public void method_1623(Class686 var1) {
      super.method_1623(var1);
      var1.method_375("EntityId", this.field_34);
      var1.method_777("Delay", (short)this.field_874);
   }
}
