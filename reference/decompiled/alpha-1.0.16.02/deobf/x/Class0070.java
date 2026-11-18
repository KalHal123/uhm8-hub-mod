package x;

public class Class0070 extends Class0312 {
   protected Class0070(int var1) {
      super(var1, Class0155.c);
      this.aZ = 59;
   }

   @Override
   public int a(int var1) {
      if (var1 == 1) {
         return this.aZ - 16;
      } else if (var1 == 0) {
         return Class0312.x.a(0);
      } else {
         return var1 != 2 && var1 != 4 ? this.aZ : this.aZ + 1;
      }
   }

   @Override
   public boolean a(Class0065 var1, int var2, int var3, int var4, Class0089 var5) {
      var5.k();
      return true;
   }
}
