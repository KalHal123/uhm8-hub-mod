package srv;

public class Class183 extends Class371 {
   private boolean field_992;

   protected Class183(int var1, int var2, Class111 var3, boolean var4) {
      super(var1, var2, var3);
      this.field_992 = var4;
   }

   @Override
   public boolean method_491() {
      return false;
   }

   @Override
   public boolean method_212(Interface351 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_813(var2, var3, var4);
      return !this.field_992 && var6 == this.field_1379 ? false : super.method_212(var1, var2, var3, var4, var5);
   }
}
