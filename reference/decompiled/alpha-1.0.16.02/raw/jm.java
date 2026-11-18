public class jm extends dd {
   public jm(int var1) {
      super(var1);
      this.aR = 1;
      this.aS = 64;
   }

   @Override
   public void b(eo var1, fv var2) {
      if (var2 instanceof mj) {
         mj var3 = (mj)var2;
         if (!var3.a) {
            var3.a = true;
            var1.a--;
         }
      }
   }

   @Override
   public void a(eo var1, fv var2) {
      this.b(var1, var2);
   }
}
