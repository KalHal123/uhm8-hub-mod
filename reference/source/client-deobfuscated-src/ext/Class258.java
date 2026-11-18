package ext;

public class Class258 extends Class407 {
   private boolean field_726;

   protected Class258(int var1, int var2, Class160 var3, boolean var4) {
      super(var1, var2, var3);
      this.field_726 = var4;
   }

   @Override
   public boolean method_143() {
      return false;
   }

   @Override
   public boolean method_1794(Interface698 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_197(var2, var3, var4);
      return !this.field_726 && var6 == this.field_19 ? false : super.method_1794(var1, var2, var3, var4, var5);
   }
}
