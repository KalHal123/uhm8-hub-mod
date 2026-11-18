import java.io.File;

class kz extends cj {
   kz(ab var1, File var2, String var3) {
      super(var2, var3);
      this.w = var1;
   }

   @Override
   protected as a(File var1) {
      return new cg(this, new kt(var1, false));
   }
}
