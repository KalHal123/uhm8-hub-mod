package x;

public class Class0257 extends Class0086 {
   public Class0257(int var1) {
      super(var1);
      this.aR = 1;
      this.aS = 64;
   }

   @Override
   public void b(Class0124 var1, Class0158 var2) {
      if (var2 instanceof Class0335) {
         Class0335 var3 = (Class0335)var2;
         if (!var3.a) {
            var3.a = true;
            var1.a--;
         }
      }
   }

   @Override
   public void a(Class0124 var1, Class0158 var2) {
      this.b(var1, var2);
   }
}
