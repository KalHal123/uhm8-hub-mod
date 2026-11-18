package x;

public class Class0386 extends Class0043 {
   private static Class0312[] aV = new Class0312[]{
      Class0312.w,
      Class0312.aj,
      Class0312.ak,
      Class0312.t,
      Class0312.ao,
      Class0312.H,
      Class0312.ai,
      Class0312.I,
      Class0312.ah,
      Class0312.G,
      Class0312.aw,
      Class0312.ax,
      Class0312.aT
   };
   private int aW;

   public Class0386(int var1, int var2) {
      super(var1, 2, var2, aV);
      this.aW = var2;
   }

   @Override
   public boolean a(Class0312 var1) {
      if (var1 == Class0312.ap) {
         return this.aW == 3;
      } else if (var1 == Class0312.ax || var1 == Class0312.aw) {
         return this.aW >= 2;
      } else if (var1 == Class0312.ah || var1 == Class0312.G) {
         return this.aW >= 2;
      } else if (var1 == Class0312.ai || var1 == Class0312.H) {
         return this.aW >= 1;
      } else if (var1 == Class0312.aN || var1 == Class0312.aO) {
         return this.aW >= 2;
      } else {
         return var1.bl == Class0155.d ? true : var1.bl == Class0155.e;
      }
   }
}
