package ext;

public class Class307 extends Class108 {
   protected boolean field_785;

   protected Class307(int var1, int var2, Class160 var3, boolean var4) {
      super(var1, var2, var3);
      this.field_785 = var4;
   }

   @Override
   public boolean method_214() {
      return false;
   }

   @Override
   public boolean method_991(Interface698 var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.method_197(var2, var3, var4);
      return !this.field_785 && var6 == this.field_2151 ? false : super.method_991(var1, var2, var3, var4, var5);
   }
}
