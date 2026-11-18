package x;

public class Class0228 extends Class0086 {
   private int a;

   public Class0228(int var1, int var2) {
      super(var1);
      this.aR = 1;
      this.aS = 32 << var2;
      if (var2 == 3) {
         this.aS *= 4;
      }

      this.a = 4 + var2 * 2;
   }

   @Override
   public float a(Class0124 var1, Class0312 var2) {
      return 1.5F;
   }

   @Override
   public void a(Class0124 var1, Class0158 var2) {
      var1.b(1);
   }

   @Override
   public void a(Class0124 var1, int var2, int var3, int var4, int var5) {
      var1.b(2);
   }

   @Override
   public int a(Class0268 var1) {
      return this.a;
   }

   @Override
   public boolean a() {
      return true;
   }
}
