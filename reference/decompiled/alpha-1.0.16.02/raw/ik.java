public class ik extends dd {
   private int a;

   public ik(int var1, int var2) {
      super(var1);
      this.aR = 1;
      this.aS = 32 << var2;
      if (var2 == 3) {
         this.aS *= 4;
      }

      this.a = 4 + var2 * 2;
   }

   @Override
   public float a(eo var1, ln var2) {
      return 1.5F;
   }

   @Override
   public void a(eo var1, fv var2) {
      var1.b(1);
   }

   @Override
   public void a(eo var1, int var2, int var3, int var4, int var5) {
      var1.b(2);
   }

   @Override
   public int a(jx var1) {
      return this.a;
   }

   @Override
   public boolean a() {
      return true;
   }
}
