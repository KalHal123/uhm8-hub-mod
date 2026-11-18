public class ch extends ff {
   public if[] a = new if[5];

   public ch() {
      this.a[0] = new if(0, 8);
      this.a[1] = new if(0, 0);
      this.a[2] = new if(0, 0);
      this.a[3] = new if(0, 0);
      this.a[4] = new if(0, 0);
      byte var1 = 24;
      byte var2 = 6;
      byte var3 = 20;
      byte var4 = 4;
      this.a[0].a(-var1 / 2, -var3 / 2 + 2, -3.0F, var1, var3 - 4, 4, 0.0F);
      this.a[0].a(0.0F, 0 + var4, 0.0F);
      this.a[1].a(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.a[1].a(-var1 / 2 + 1, 0 + var4, 0.0F);
      this.a[2].a(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.a[2].a(var1 / 2 - 1, 0 + var4, 0.0F);
      this.a[3].a(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.a[3].a(0.0F, 0 + var4, -var3 / 2 + 1);
      this.a[4].a(-var1 / 2 + 2, -var2 - 1, -1.0F, var1 - 4, var2, 2, 0.0F);
      this.a[4].a(0.0F, 0 + var4, var3 / 2 - 1);
      this.a[0].d = (float) (Math.PI / 2);
      this.a[1].e = (float) (Math.PI * 3.0 / 2.0);
      this.a[2].e = (float) (Math.PI / 2);
      this.a[3].e = (float) Math.PI;
   }

   @Override
   public void b(float var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var7 = 0; var7 < 5; var7++) {
         this.a[var7].a(var6);
      }
   }

   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
   }
}
