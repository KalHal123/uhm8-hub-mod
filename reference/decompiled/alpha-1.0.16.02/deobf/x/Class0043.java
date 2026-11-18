package x;

public class Class0043 extends Class0086 {
   private Class0312[] aV;
   private float aW = 4.0F;
   private int aX;
   protected int a;

   public Class0043(int var1, int var2, int var3, Class0312[] var4) {
      super(var1);
      this.a = var3;
      this.aV = var4;
      this.aR = 1;
      this.aS = 32 << var3;
      if (var3 == 3) {
         this.aS *= 4;
      }

      this.aW = (var3 + 1) * 2;
      this.aX = var2 + var3;
   }

   @Override
   public float a(Class0124 var1, Class0312 var2) {
      for (int var3 = 0; var3 < this.aV.length; var3++) {
         if (this.aV[var3] == var2) {
            return this.aW;
         }
      }

      return 1.0F;
   }

   @Override
   public void a(Class0124 var1, Class0158 var2) {
      var1.b(2);
   }

   @Override
   public void a(Class0124 var1, int var2, int var3, int var4, int var5) {
      var1.b(1);
   }

   @Override
   public int a(Class0268 var1) {
      return this.aX;
   }

   @Override
   public boolean a() {
      return true;
   }
}
