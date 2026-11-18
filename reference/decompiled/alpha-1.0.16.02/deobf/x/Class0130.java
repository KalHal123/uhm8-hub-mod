package x;

public class Class0130 extends Class0312 {
   private boolean a;

   protected Class0130(int var1, int var2, Class0155 var3, boolean var4) {
      super(var1, var2, var3);
      this.a = var4;
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public boolean c(Class0351 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.a(var2, var3, var4);
      return !this.a && var6 == this.ba ? false : super.c(var1, var2, var3, var4, var5);
   }
}
